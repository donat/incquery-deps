package cern.devtools.depanalysis.modelfinder;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
import cern.devtools.depanalysis.wsmodel.JavaModelFactory;
import cern.devtools.depanalysis.wsmodel.NamedElement;
import cern.devtools.depanalysis.wsmodel.Type;

public class ModelComparer {

	@SuppressWarnings("unused")
	private EclipseWorkspace wsBeforeChanges;
	private IJavaElementDelta delta;
	private EclipseWorkspace wsAfterChanges;
	private WsBuildPrimitives buildOld;
	private WsBuildPrimitives buildNew;

	private ModelComparer(EclipseWorkspace wsBeforeChanges, IJavaElementDelta delta) {
		this.wsBeforeChanges = wsBeforeChanges;
		this.delta = delta;
		this.buildOld = new WsBuildPrimitives(wsBeforeChanges);
	}

	public static void compareAndUpdateModel(EclipseWorkspace wsBeforeChanges, IJavaElementDelta delta) {
		new ModelComparer(wsBeforeChanges, delta).doUpdate();
	}

	private void doUpdate() {
		wsAfterChanges = createNewModel();
		buildNew = new WsBuildPrimitives(wsAfterChanges);
		findAndApplyChanges(delta);
	}

	private void findAndApplyChanges(IJavaElementDelta delta2) {
		// Leave out every delta which does not belong to the traced projects.
		if (delta2.getElement().getJavaProject() != null
				&& !Activator.getDefault().getWsService().isTracedProject(delta2.getElement().getJavaProject())) {
			return;
		}

		switch (delta2.getKind()) {
		case IJavaElementDelta.ADDED:
			addElement(delta2);
			break;
		case IJavaElementDelta.REMOVED:
			removeElement(delta2);
			break;
		case IJavaElementDelta.CHANGED:
			if (delta2.getElement() instanceof ICompilationUnit) {
				refreshCompilationUnit((ICompilationUnit) delta2.getElement());
			} else {
				for (IJavaElementDelta child : delta2.getAffectedChildren()) {
					findAndApplyChanges(child);
				}
			}
			break;
		default:
			break;
		}
	}

	@SuppressWarnings("unchecked")
	private void addElement(IJavaElementDelta delta) {
		if (delta.getMovedFromElement() != null) {
			buildOld.removeNamedElement(delta.getMovedFromElement());
		}
		IJavaElement newElem = delta.getElement();
		NamedElement emfOldParent = buildOld.findJdtElementInEmfModel(newElem.getParent());
		NamedElement emfNewObject = buildNew.findJdtElementInEmfModel(newElem);
		buildOld.moveItemToNewParent(wsAfterChanges, emfOldParent, emfNewObject);
		updateChildrenDependenciesRecurive(emfNewObject.getChildren());
	}

	private void removeElement(IJavaElementDelta delta) {
		if (delta.getMovedToElement() == null) {
			buildOld.removeNamedElement(delta.getElement());
		}

	}

	@SuppressWarnings("unchecked")
	private void updateChildrenDependenciesRecurive(EList<NamedElement> children) {
		for (NamedElement elem : children) {
			// Insert deps
			if (elem instanceof Type) {
				IType type = (IType) JavaCore.create(elem.getHandler());
				WsDeps.searchAndInsertOutgoingDependencies(type, buildOld);
				
			}
			else if (elem instanceof IMethod) {
				IMethod method = (IMethod) JavaCore.create(elem.getHandler());
				WsDeps.searchAndInsertOutgoingDependencies(method, buildOld);
			}

			updateChildrenDependenciesRecurive(elem.getChildren());
		}
	}

	private void refreshCompilationUnit(ICompilationUnit cu) {
		try {
			IType[] types = cu.getAllTypes();
			for (IType t : types) {
				NamedElement jdtType = buildOld.findJdtElementInEmfModel(t);
				buildOld.removeOutgoingDependencies(jdtType);
				WsDeps.searchAndInsertOutgoingDependencies(t, buildOld);
				
				for (IMethod m : t.getMethods()) {
					NamedElement jdtMethod = buildOld.findJdtElementInEmfModel(m);
					buildOld.removeOutgoingDependencies(jdtMethod);
					WsDeps.searchAndInsertOutgoingDependencies(m, buildOld);
				}
			}
		} catch (JavaModelException e) {
			throw new RuntimeException(e);
		}
		
	}

	private EclipseWorkspace createNewModel() {
		try {
			EclipseWorkspace wsAfterChanges = JavaModelFactory.eINSTANCE.createEclipseWorkspace();
			WsBuildPrimitives buildPrimitives = new WsBuildPrimitives(wsAfterChanges);

			Set<IJavaProject> projects = new HashSet<IJavaProject>();
			for (IJavaElementDelta child : delta.getAffectedChildren()) {
				projects.add(child.getElement().getJavaProject());
			}

			for (IJavaProject project : projects) {
				NamedElement emfProject = buildPrimitives.addNamedElement(null, project);

				// Add all package fragment roots which are actual folders and not jar archives
				for (IPackageFragmentRoot pfr : project.getPackageFragmentRoots()) {
					if (!pfr.isArchive()) {
						NamedElement emfPfr = buildPrimitives.addNamedElement(emfProject, pfr);
						for (IJavaElement pkgObject : pfr.getChildren()) {
							IPackageFragment pkg = (IPackageFragment) pkgObject;
							NamedElement emfpf = buildPrimitives.addNamedElement(emfPfr, pkg);
							for (ICompilationUnit cu : pkg.getCompilationUnits()) {
								NamedElement emfCu = buildPrimitives.addNamedElement(emfpf, cu);
								for (IType t : cu.getTypes()) {
									addType(emfCu, t, buildPrimitives);
								}
							}
						}
					}
				}
			}

			return wsAfterChanges;
		} catch (JavaModelException e) {
			throw new RuntimeException(e);
		}
	}

	private void addType(NamedElement emfCu, IType t, WsBuildPrimitives buildPrimitives) throws JavaModelException {
		NamedElement emfType = buildPrimitives.addNamedElement(emfCu, t);
		for (IType innerType : t.getTypes()) {
			addType(emfCu, innerType, buildPrimitives);
		}

		for (IMethod m : t.getMethods()) {
			buildPrimitives.addNamedElement(emfType, m);
		}

		for (IField f : t.getFields()) {
			buildPrimitives.addNamedElement(emfType, f);
		}
	}

	
}

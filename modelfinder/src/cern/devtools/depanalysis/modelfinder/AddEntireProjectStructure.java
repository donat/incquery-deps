package cern.devtools.depanalysis.modelfinder;

import java.util.List;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
import cern.devtools.depanalysis.wsmodel.NamedElement;

public class AddEntireProjectStructure implements ModelBuilder {

	private List<IJavaProject> projects;
	private WsBuildPrimitives buildPrimitives;
	@SuppressWarnings("unused")
	private EclipseWorkspace workspace;

	public AddEntireProjectStructure(EclipseWorkspace workspace, List<IJavaProject> projects) {
		this.workspace = workspace;
		this.projects = projects;
		this.buildPrimitives = new WsBuildPrimitives(workspace);
	}

	@Override
	public void build() {
		try {

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
								NamedElement emfCu  = buildPrimitives.addNamedElement(emfpf, cu); 
								for (IType t :cu.getTypes()) {
									addType(emfCu, t);
								}
							}
						}
					}
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}

	private void addType(NamedElement emfCu, IType t) throws JavaModelException {
		NamedElement emfType = buildPrimitives.addNamedElement(emfCu, t);
		for (IType innerType : t.getTypes()) {
			addType(emfCu, innerType);
		}
		
		for(IMethod m : t.getMethods()) {
			buildPrimitives.addNamedElement(emfType, m);
		}
		
		for(IField f : t.getFields()) {
			buildPrimitives.addNamedElement(emfType, f);
		}
	}

}

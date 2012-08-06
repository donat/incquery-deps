/*
 * File WsBuilderUtil.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageDeclaration;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;

import cern.devtools.depanalysis.javamodel.ApiClass;
import cern.devtools.depanalysis.javamodel.DependencyType;
import cern.devtools.depanalysis.javamodel.JavaModelFactory;
import cern.devtools.depanalysis.javamodel.NamedElement;
import cern.devtools.depanalysis.javamodel.Package;
import cern.devtools.depanalysis.javamodel.Project;
import cern.devtools.depanalysis.javamodel.Workspace;

public class WsModelBuilder {

	public static WsModelBuilder forModel(Workspace workspace) {
		return new WsModelBuilder(workspace);
	}

	public static WsModelBuilder fromScratch(List<IJavaProject> projects) {
		Workspace workspace = JavaModelFactory.eINSTANCE.createWorkspace();
		WsModelBuilder builder = new WsModelBuilder(workspace);
		builder.buildAllStructure(projects);
		builder.buildAllDependencies(projects);
		return builder;
	}

	private static boolean methodsHasSameSignature(IMethod m1, IMethod m2) {
		boolean same = m1.getElementName().equals(m2.getElementName());
		same &= m1.getParameterTypes().length == m2.getParameterTypes().length;
		if (!same) {
			return false;
		}
		for (int i = 0; i < m1.getParameterTypes().length; ++i) {
			same &= m1.getParameterTypes()[i].equals(m2.getParameterTypes()[i]);
		}

		return same;
	}

	private final WsBuildPrimitives buildPrimitives;

	private final SearchEngine engine = new SearchEngine();

	private final Workspace workspace;

	private WsModelBuilder(Workspace workspace) {
		this.workspace = workspace;
		this.buildPrimitives = new WsBuildPrimitives(workspace);
	}

	public void addNewProject(IJavaProject project) {
		buildAllStructure(Arrays.asList(project));
		buildAllDependencies(Arrays.asList(project));
	}

	public Workspace getWorkspace() {
		return this.workspace;
	}

	public void modifyModel(IJavaElementDelta delta) {
		switch (delta.getKind()) {
		case IJavaElementDelta.ADDED:
			add(delta);
			break;
		case IJavaElementDelta.REMOVED:
			remove(delta);
			break;

		case IJavaElementDelta.CHANGED:
			change(delta);
			break;
		default:
			System.out.println("Unhandled delta kind: " + delta.getKind());
		}
	}

	public void removeEntireProject(IJavaProject project) {
		buildPrimitives.deleteProject(project);
	}

	private void add(IJavaElementDelta delta) {
		if (delta.getMovedFromElement() == null) {
			addStandalone(delta.getElement());
		} else {

		}
	}

	private void addStandalone(IJavaElement elem) {

		if (elem instanceof IJavaProject) {
			buildPrimitives.addProject((IJavaProject) elem);
		} else if (elem instanceof IPackageFragment) {
			IPackageFragment jdtPkg = (IPackageFragment) elem;
			Project project = (Project) buildPrimitives.findJdtElementInEmfModel(jdtPkg.getJavaProject());
			if (project != null) {
				buildPrimitives.addPackage(project, jdtPkg);
			}
		} else if (elem instanceof IType) {
			IType jdttType = (IType) elem;
			Package pkg = (Package) buildPrimitives.findJdtElementInEmfModel(jdttType.getPackageFragment());
			buildPrimitives.addClass(pkg, jdttType);
			insertOutgoingDependencies(jdttType);

		} else if (elem instanceof IMethod) {
			IMethod method = (IMethod) elem;
			ApiClass container = (ApiClass) buildPrimitives.findJdtElementInEmfModel(method.getDeclaringType());
			buildPrimitives.addMethod(container, method);
			insertOutgoingDependencies(method);

		} else if (elem instanceof IField) {
			IField field = (IField) elem;
			ApiClass container = (ApiClass) buildPrimitives.findJdtElementInEmfModel(field.getDeclaringType());
			buildPrimitives.addField(container, field);
			insertOutgoingDependencies(field);
		} else {
			System.err.println("WHAT TO ADD:" + elem);
		}
	}

	private void buildAllDependencies(final List<IJavaProject> root) {
		try {
			for (IJavaElement elem : JavaModelWalker.allElements(root)) {
				insertOutgoingDependencies(elem);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void buildAllStructure(final List<IJavaProject> jdtProjects) {
		try {
			buildStructureFromSratch(jdtProjects);
		} catch (Exception e) {
			// The init should happen flawlessly.
			throw new RuntimeException(e);
		}
	}

	private void buildStructureFromSratch(final List<IJavaProject> jdtProjects) throws Exception {
		// Iterate through the workspace and create the correspondent EMF.
		for (IJavaProject project : jdtProjects) {

			// Add the project get the children and iterate through them.
			if (buildPrimitives.isJdtElemInModel(project))
				continue;
			Project emfProject = buildPrimitives.addProject(project);
			List<IPackageFragment> packages = JavaModelWalker.childrenOf(project);
			for (IPackageFragment pkg : packages) {

				// Add the package to the model, get the children of it and iterate again.
				if (buildPrimitives.isJdtElemInModel(pkg))
					continue;
				Package emfPackage = buildPrimitives.addPackage(emfProject, pkg);
				List<IType> types = JavaModelWalker.childrenOf(pkg);
				for (IType type : types) {

					// Add the class to the model, get the children of it and iterate again.
					if (buildPrimitives.isJdtElemInModel(type))
						continue;
					ApiClass emfClass = buildPrimitives.addClass(emfPackage, type);
					insertOutgoingDependencies(type);
					List<IJavaElement> methodsOrFields = JavaModelWalker.childrenOf(type);
					for (IJavaElement methodOrField : methodsOrFields) {
						if (buildPrimitives.isJdtElemInModel(methodOrField))
							continue;
						if (methodOrField instanceof IMethod) {
							buildPrimitives.addMethod(emfClass, (IMethod) methodOrField);
							insertOutgoingDependencies(methodOrField);
						} else if (methodOrField instanceof IField) {
							buildPrimitives.addField(emfClass, (IField) methodOrField);
						} else {
							throw new RuntimeException(
									"Class can only contain IMethod or IField instance. Found item: "
											+ methodOrField.getClass());
						}
					}
				}
			}
		}
	}

	private void change(IJavaElementDelta delta) {
		try {
			// Check if the dependencies has changed.
			IJavaElement elem = delta.getElement();
			updateOutgoingDeps(elem);
			compareWithModel(elem);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void compareWithModel(IJavaElement elem) throws CoreException {
		// TODO do it with the other classes too.
		if (elem instanceof IType) {

			ApiClass ac = (ApiClass) buildPrimitives.findJdtElementInEmfModel(elem);
			for (IMethod m : JavaModelWalker.methodsOf((IType) elem)) {
				if (buildPrimitives.findJdtElementInEmfModel(m) == null) {
					buildPrimitives.addMethod(ac, m);
				}
			}
			for (IField f : JavaModelWalker.fieldsOf((IType) elem)) {
				if (buildPrimitives.findJdtElementInEmfModel(f) == null) {
					buildPrimitives.addField(ac, f);
				}
			}
		}

		else if (elem instanceof ICompilationUnit) {
			for (IJavaElement type : ((ICompilationUnit) elem).getChildren()) {
				if (!(type instanceof IType)) {
					System.err.println("Unexpected type: " + type.getClass());
				} else {
					ApiClass ac = (ApiClass) buildPrimitives.findJdtElementInEmfModel(type);
					for (IMethod m : JavaModelWalker.methodsOf((IType) type)) {
						if (buildPrimitives.findJdtElementInEmfModel(m) == null) {
							buildPrimitives.addMethod(ac, m);
						}
					}
					for (IField f : JavaModelWalker.fieldsOf((IType) type)) {
						if (buildPrimitives.findJdtElementInEmfModel(f) == null) {
							buildPrimitives.addField(ac, f);
						}
					}
				}
			}
		}
	}

	private void updateOutgoingDeps(IJavaElement elem) {
		if (elem instanceof IType || elem instanceof IMethod || elem instanceof IField) {
			NamedElement emfElem = buildPrimitives.findJdtElementInEmfModel(elem);
			if (emfElem == null) {
				throw new RuntimeException("Item cannot be updated because it is not found in the model.");
			}
			EmfModelUtils.deleteOutgoingDependencies(workspace, emfElem);
			insertOutgoingDependencies(elem);
		} else {
			System.err.println("WHAT TO UPDATE:" + elem.getElementName() + ", type: " + elem.getElementType());
		}
	}

	private List<IMethod> findCalledMethods(final IMethod method) throws CoreException {
		final List<IMethod> result = new LinkedList<IMethod>();
		final boolean[] finished = { false };
		SearchRequestor requestor = new SearchRequestor() {

			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				Object mo = match.getElement();
				if (mo == null) {
					return;
				} else if (mo instanceof IMethod) {
					// Remove unnecessary results (the items from the java.* package).
					IMethod method = (IMethod) mo;
					ICompilationUnit cu = method.getCompilationUnit();
					if (cu != null) {
						IPackageDeclaration[] packages = cu.getPackageDeclarations();
						if (packages != null && packages.length > 0 && packages[0].getElementName().startsWith("java.")) {
							return;
						}
					}

					result.add((IMethod) mo);

				} else {
					System.err.println("Wrong type item added.");
					System.err.println("From: " + method);
					System.err.println("To:   " + mo);
				}
			}

			@Override
			public void endReporting() {
				finished[0] = true;
			}
		};

		engine.searchDeclarationsOfSentMessages(method, requestor, new NullProgressMonitor());

		while (finished[0] == false) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	private List<IType> findClassUsages(final IMethod method) throws CoreException {
		final List<IType> result = new LinkedList<IType>();
		final boolean[] finished = { false };
		SearchRequestor requestor = new SearchRequestor() {

			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				Object mo = match.getElement();
				if (mo == null) {
					return;
				} else if (mo instanceof IType) {
					// Remove unnecessary results (the items from the java.* package).
					result.add((IType) mo);

				} else {
					System.err.println("Wrong type item added..");
					System.err.println("From: " + method);
					System.err.println("To:   " + mo);
				}
			}

			@Override
			public void endReporting() {
				finished[0] = true;
			}
		};

		engine.searchDeclarationsOfReferencedTypes(method, requestor, new NullProgressMonitor());
		return result;
	}

	private List<IMethod> findOverridenMethods(final IMethod method) throws CoreException {
		List<IMethod> result = new LinkedList<IMethod>();

		// Find supertypes
		ITypeHierarchy hierarchy = method.getDeclaringType().newTypeHierarchy(new NullProgressMonitor());

		List<IType> superTypes = Arrays.asList(hierarchy.getSupertypes(method.getDeclaringType()));
		for (IType superType : superTypes) {
			for (IMethod superMethod : superType.getMethods()) {
				if (methodsHasSameSignature(superMethod, method)) {
					result.add(superMethod);
				}
			}
		}
		return result;
	}

	private List<IField> findReferencedField(final IMethod elem) throws CoreException {
		final List<IField> result = new LinkedList<IField>();
		final boolean[] finished = { false };
		SearchRequestor requestor = new SearchRequestor() {

			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				Object mo = match.getElement();
				if (mo == null) {
					return;
				} else if (mo instanceof IField) {
					// Remove unnecessary results (the items from the java.* package).
					result.add((IField) mo);

				} else {
					System.err.println("Wrong type item added..");
					System.err.println("From: " + elem);
					System.err.println("To:   " + mo);
				}
			}

			@Override
			public void endReporting() {
				finished[0] = true;
			}
		};

		engine.searchDeclarationsOfAccessedFields(elem, requestor, new NullProgressMonitor());
		return result;
	}

	private List<IType> findSupertypes(IType elem) throws CoreException {
		ITypeHierarchy hierarchy = elem.newTypeHierarchy(new NullProgressMonitor());
		return Arrays.asList(hierarchy.getSupertypes(elem));
	}

	private void insertOutgoingDependencies(IJavaElement elem) {
		try {
			if (elem instanceof IMethod) {
				// Handle METHOD REFERENCE dependencies.
				for (IMethod referencedMethod : findCalledMethods((IMethod) elem)) {
					if (!elem.getJavaProject().equals(referencedMethod.getJavaProject())) {
						buildPrimitives.addDependecy(DependencyType.METHOD_CALL, elem, referencedMethod);
					}

				}

				// Handle OVERRIDED METHOD dependencies.
				for (IMethod overridedMethod : findOverridenMethods((IMethod) elem)) {
					if (!elem.getJavaProject().equals(overridedMethod.getJavaProject())) {
						buildPrimitives.addDependecy(DependencyType.METHOD_OVERRIDE, elem, overridedMethod);
					}
				}

				// Handle CLASS USAGE dependencies.
				for (IType usedClass : findClassUsages((IMethod) elem)) {
					if (!elem.getJavaProject().equals(usedClass.getJavaProject())) {
						buildPrimitives.addDependecy(DependencyType.CLASS_USAGE, elem, usedClass);
					}
				}

				// Handle FIELD ACCESS dependencies.
				for (IField referencedField : findReferencedField((IMethod) elem)) {
					if (!elem.getJavaProject().equals(referencedField.getJavaProject())) {
						buildPrimitives.addDependecy(DependencyType.FIELD_ACCESS, elem, referencedField);
					}
				}
			}

			else if (elem instanceof IType) {
				// Handle Inheritance dependencies.
				for (IType superType : findSupertypes((IType) elem)) {
					if (!elem.getJavaProject().equals(superType.getJavaProject())) {
						buildPrimitives.addDependecy(DependencyType.INHERITANCE, elem, superType);
					}
				}
			}
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}

	private void remove(IJavaElementDelta delta) {
		// If a method deleted, it is deleted. We don't handle the situation when it is moved to a new place.
		// This is added when it is added.

		IJavaElement elem = delta.getElement();
		try {
			removeStandalone(elem);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void removeStandalone(IJavaElement elem) throws Exception {
		if (elem instanceof IJavaProject) {
			buildPrimitives.deleteProject((IJavaProject) elem);
		} else if (elem instanceof IPackageFragment) {
			buildPrimitives.deletePackage((IPackageFragment) elem);
		} else if (elem instanceof ICompilationUnit) {
			buildPrimitives.deleteCompilationUnit((ICompilationUnit) elem);
		} else if (elem instanceof IMethod) {
			buildPrimitives.deleteMethod((IMethod) elem);
		} else if (elem instanceof IField) {
			buildPrimitives.deleteField((IField) elem);
		} else if (elem instanceof IType) {
			buildPrimitives.deleteType((IType) elem);
		} else {
			System.err.println("WHAT TO REMOVE:" + elem);
		}
	}
}

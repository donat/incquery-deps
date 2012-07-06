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

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
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
import cern.devtools.depanalysis.javamodel.Dependency;
import cern.devtools.depanalysis.javamodel.DependencyType;
import cern.devtools.depanalysis.javamodel.Field;
import cern.devtools.depanalysis.javamodel.JavaModelFactory;
import cern.devtools.depanalysis.javamodel.JavaModelPackage;
import cern.devtools.depanalysis.javamodel.Method;
import cern.devtools.depanalysis.javamodel.NamedElement;
import cern.devtools.depanalysis.javamodel.Package;
import cern.devtools.depanalysis.javamodel.Project;
import cern.devtools.depanalysis.javamodel.Workspace;

public class WsModelBuilder {

	private final Workspace workspace;

	private final SearchEngine engine = new SearchEngine();

	private WsModelBuilder(Workspace workspace) {
		this.workspace = workspace;
	}

	public static WsModelBuilder fromScratch(IWorkspaceRoot jdtRoot) {
		Workspace workspace = JavaModelFactory.eINSTANCE.createWorkspace();
		WsModelBuilder builder = new WsModelBuilder(workspace);
		builder.buildAllStructure(jdtRoot);
		builder.buildAllDependencies(jdtRoot);
		return builder;
	}

	public static WsModelBuilder forModel(Workspace workspace) {
		return new WsModelBuilder(workspace);
	}

	public Workspace getWorkspace() {
		return this.workspace;
	}

	public void insertItem(IJavaElement elem) {
		if (elem instanceof IJavaProject) {
			addProject((IJavaProject) elem);
		} else if (elem instanceof IPackageFragment) {
			IPackageFragment jdtPkg = (IPackageFragment) elem;
			Project project = (Project) findJdtElementInEmfModel(jdtPkg.getJavaProject());
			if (project != null) {
				addPackage(project, jdtPkg);
			}
		} else if (elem instanceof IType) {
			IType jdttType = (IType) elem;
			Package pkg = (Package) findJdtElementInEmfModel(jdttType.getPackageFragment());
			addClass(pkg, jdttType);
			insertOutgoingDependencies(jdttType);

		} else if (elem instanceof IMethod) {
			IMethod method = (IMethod) elem;
			ApiClass container = (ApiClass) findJdtElementInEmfModel(method.getDeclaringType());
			addMethod(container, method);
			insertOutgoingDependencies(method);

		} else if (elem instanceof IField) {
			IField field = (IField) elem;
			ApiClass container = (ApiClass) findJdtElementInEmfModel(field.getDeclaringType());
			addField(container, field);
			insertOutgoingDependencies(field);
		} else {
			System.err.println("WHAT TO ADD:" + elem);
		}
	}

	public void removeItem(IJavaElement elem) {
		if (elem instanceof IJavaProject) {
			deleteProject((IJavaProject) elem);
		} else if (elem instanceof IPackageFragment) {
			deletePackage((IPackageFragment) elem);
		} else if (elem instanceof ICompilationUnit) {
			deleteCompilationUnit((ICompilationUnit) elem);
		} else if (elem instanceof IMethod) {
			deleteMethod((IMethod) elem);
		} else if (elem instanceof IField) {
			deleteField((IField) elem);
		} else {
			System.err.println("WHAT TO REMOVE:" + elem);
		}
	}
	
	public void updateItem(IJavaElement elem) {
		if (elem instanceof IType || elem instanceof IMethod) {
			NamedElement  emfElem = findJdtElementInEmfModel(elem);
			if (emfElem == null) {
				throw new RuntimeException("Item cannot be updated because it is not found in the model.");
			}
			EmfModelUtils.deleteOutgoingDependencies(workspace, emfElem);
			insertOutgoingDependencies(elem);
		}
		else {
			System.err.println("WHAT TO UPDATE:" + elem);
		}

		
	}

	private void buildAllStructure(final IWorkspaceRoot jdtWorkspace) {
		try {
			buildStructureFromSratch(jdtWorkspace);
		} catch (Exception e) {
			// The init should happen flawlessly.
			throw new RuntimeException(e);
		}
	}

	private void buildStructureFromSratch(IWorkspaceRoot jdtWorkspace) throws Exception {
		// Get all projects from workspace.
		List<IJavaProject> projects = JavaModelWalker.childrenOf(jdtWorkspace);

		// Iterate through the workspace and create the correspondent EMF.
		for (IJavaProject project : projects) {

			// Add the project get the children and iterate through them.
			if (isJdtElemInModel(project))
				continue;
			Project emfProject = addProject(project);
			List<IPackageFragment> packages = JavaModelWalker.childrenOf(project);
			for (IPackageFragment pkg : packages) {

				// Add the package to the model, get the children of it and iterate again.
				if (isJdtElemInModel(pkg))
					continue;
				Package emfPackage = addPackage(emfProject, pkg);
				List<IType> types = JavaModelWalker.childrenOf(pkg);
				for (IType type : types) {

					// Add the class to the model, get the children of it and iterate again.
					if (isJdtElemInModel(type))
						continue;
					ApiClass emfClass = addClass(emfPackage, type);
					insertOutgoingDependencies(type);
					List<IJavaElement> methodsOrFields = JavaModelWalker.childrenOf(type);
					for (IJavaElement methodOrField : methodsOrFields) {
						if (isJdtElemInModel(methodOrField))
							continue;
						if (methodOrField instanceof IMethod) {
							addMethod(emfClass, (IMethod) methodOrField);
							insertOutgoingDependencies(methodOrField);
						} else if (methodOrField instanceof IField) {
							addField(emfClass, (IField) methodOrField);
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

	private Project addProject(IJavaProject project) {
		return EmfModelUtils.createNamedElement(JavaModelPackage.PROJECT, workspace, workspace,
				project.getHandleIdentifier(), project.getElementName());
	}

	private Package addPackage(Project emfContainer, IPackageFragment pkg) {
		return EmfModelUtils.createNamedElement(JavaModelPackage.PACKAGE, workspace, emfContainer,
				pkg.getHandleIdentifier(), pkg.getElementName());
	}

	private ApiClass addClass(Package emfContainer, IType type) {
		return EmfModelUtils.createNamedElement(JavaModelPackage.API_CLASS, workspace, emfContainer, type
				.getHandleIdentifier(), type.getTypeQualifiedName(), type.getCompilationUnit().getHandleIdentifier());
	}

	private Method addMethod(ApiClass emfContainer, IMethod methodOrField) {
		return EmfModelUtils.createNamedElement(JavaModelPackage.METHOD, workspace, emfContainer,
				methodOrField.getHandleIdentifier(), JdtUtils.decodeSourceSignature((IMethod) methodOrField));
	}

	private Field addField(ApiClass emfContainer, IField methodOrField) {
		return EmfModelUtils.createNamedElement(JavaModelPackage.FIELD, workspace, emfContainer,
				methodOrField.getHandleIdentifier(), methodOrField.getElementName());
	}

	private Dependency addDependecy(DependencyType type, IJavaElement from, IJavaElement to) {
		NamedElement emfFrom = findJdtElementInEmfModel(from);
		NamedElement emfTo = findJdtElementInEmfModel(to);
		if (emfFrom == null) {
			System.err
					.println("Add dependency failed, because the following (from) item does not exists in the EMF model:  "
							+ from);
			return null;
		} else if (emfTo == null) {
			System.err
					.println("Add dependency failed, because the following (to) item does not exists in the EMF model:  "
							+ to);
			return null;
		} else {
			return EmfModelUtils.createDependency(workspace, emfFrom, emfTo, type);
		}
	}

	private void deleteProject(IJavaProject project) {
		Object emfProjectObject = findJdtElementInEmfModel(project);
		if (emfProjectObject != null) {
			Project emfProject = (Project) emfProjectObject;
			EmfModelUtils.deleteNamedElement(workspace, emfProject);
		} else {
			throw new RuntimeException("Tried to delete a project which does not exist");
		}
	}

	private void deletePackage(IJavaElement pkg) {
		Object emfPkgObject = findJdtElementInEmfModel(pkg);
		if (emfPkgObject != null) {
			Package emfPkg = (Package) emfPkgObject;
			EmfModelUtils.deleteNamedElement(workspace, emfPkg);
		} else {
			throw new RuntimeException("Tried to delete a project which does not exist");
		}
	}

	private void deleteCompilationUnit(ICompilationUnit cu) {
		String projectHandler = cu.getJavaProject().getHandleIdentifier();
		String cuHandler = cu.getHandleIdentifier();
		Project emfProject = workspace.findElementByHandle(projectHandler);

		if (emfProject == null) {
			throw new RuntimeException(
					"Tried to delete compilation unit, but container class not stored in the emf model.");
		}

		// Select the classes to delete.
		List<ApiClass> acToDelete = new LinkedList<ApiClass>();
		for (Package emfPackage : emfProject.getPackages()) {
			for (ApiClass emfClass : emfPackage.getClasses()) {

				// Remove the class, if it is contained by this compilation unit
				if (cuHandler.equals(emfClass.getData())) {
					acToDelete.add(emfClass);
				}
			}
		}

		// Do the deletion.
		for (ApiClass ac : acToDelete) {
			EmfModelUtils.deleteAllDependencies(workspace, ac);
			EmfModelUtils.deleteNamedElement(workspace, ac);
		}
	}

	private void deleteMethod(IMethod elem) {
		Method emfMethod = (Method) findJdtElementInEmfModel(elem);
		if (emfMethod == null) {
			throw new RuntimeException("Tried to delete method, but not stored in the emf model.");
		}

		EmfModelUtils.deleteAllDependencies(workspace, emfMethod);
		EmfModelUtils.deleteNamedElement(workspace, emfMethod);

	}
	
	private void deleteField(IField elem) {
		Field emfField = (Field) findJdtElementInEmfModel(elem);
		if (emfField == null) {
			throw new RuntimeException("Tried to delete field, but not stored in the emf model.");
		}

		EmfModelUtils.deleteAllDependencies(workspace, emfField);
		EmfModelUtils.deleteNamedElement(workspace, emfField);
	}

	private boolean isJdtElemInModel(IJavaElement jdtElem) {
		return workspace.findElementByHandle(jdtElem.getHandleIdentifier()) != null;
	}

	private NamedElement findJdtElementInEmfModel(IJavaElement jdtElem) {
		return workspace.findElementByHandle(jdtElem.getHandleIdentifier());
	}

	private void buildAllDependencies(final IWorkspaceRoot root) {
		try {
			for (IJavaElement elem : JavaModelWalker.allElements(root)) {
				insertOutgoingDependencies(elem);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void insertOutgoingDependencies(IJavaElement elem) {
		try {
			if (elem instanceof IMethod) {
				// Handle METHOD REFERENCE dependencies.
				for (IMethod referencedMethod : findCalledMethods((IMethod) elem)) {
					addDependecy(DependencyType.METHOD_CALL, elem, referencedMethod);
				}

				// Handle OVERRIDED METHOD dependencies.
				for (IMethod overridedMethod : findOverridenMethods((IMethod) elem)) {
					addDependecy(DependencyType.METHOD_OVERRIDE, elem, overridedMethod);
				}

				// Handle CLASS USAGE dependencies.
				for (IType usedClass : findClassUsages((IMethod) elem)) {
					addDependecy(DependencyType.CLASS_USAGE, elem, usedClass);
				}
				
				// Handle FIELD ACCESS dependencies.
				for (IField referencedField : findReferencedField((IMethod) elem)) {
					addDependecy(DependencyType.FIELD_ACCESS, elem, referencedField);
				}
			}
			
			else if (elem instanceof IType) {
				// Handle Inheritance dependencies.
				for (IType superType : findSupertypes((IType) elem)) {
					addDependecy(DependencyType.INHERITANCE, elem, superType);
				}
			}
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
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


	
}

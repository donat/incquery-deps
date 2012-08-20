/*
 * File WsBuilderUtil.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.SearchEngine;

import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
import cern.devtools.depanalysis.wsmodel.JavaModelFactory;
import cern.devtools.depanalysis.wsmodel.JavaProject;
import cern.devtools.depanalysis.wsmodel.PackageFragmentRoot;

@Deprecated
public class WsModelBuilder {

	public static WsModelBuilder forModel(EclipseWorkspace workspace) {
		return new WsModelBuilder(workspace);
	}

	public static WsModelBuilder fromScratch(List<IJavaProject> projects) {
		EclipseWorkspace workspace = JavaModelFactory.eINSTANCE.createEclipseWorkspace();
		WsModelBuilder builder = new WsModelBuilder(workspace);
		builder.buildAllStructure(projects);
		builder.buildAllDependencies(projects);
		return builder;
	}

	private final WsBuildPrimitives buildPrimitives;

	private final SearchEngine engine = new SearchEngine();

	private final EclipseWorkspace workspace;

	private WsModelBuilder(EclipseWorkspace workspace) {
		this.workspace = workspace;
		this.buildPrimitives = new WsBuildPrimitives(workspace);
	}

	public void addNewProject(IJavaProject project) {
		buildAllStructure(Arrays.asList(project));
		buildAllDependencies(Arrays.asList(project));
	}

	public EclipseWorkspace getWorkspace() {
		return this.workspace;
	}

	public void modifyModel(IJavaElementDelta delta) {
		for (IJavaElementDelta child : delta.getAffectedChildren()) {
			modifyModel(child);
		}
		handleDelta(delta);
	}

	private void handleDelta(IJavaElementDelta delta) {

		// System.err.println(delta);
		int kind = delta.getKind();

		if (delta.getElement().getJavaProject() != null) {
			switch (kind) {
			case IJavaElementDelta.ADDED:
				handleAddDelta(delta);
				break;
			case IJavaElementDelta.REMOVED:
				handleRemoveDelta(delta);
				break;
			case IJavaElementDelta.CHANGED:
				handleChangeDelta(delta);
				break;
			default:
				throw new RuntimeException("That's not true! That's impossible!");
			}
		} else {
			// System.err.println(delta);
		}
	}

	private void handleAddDelta(IJavaElementDelta delta) {
		IJavaElement elem = delta.getElement();
		IJavaElement from = delta.getMovedFromElement();

		switch (elem.getElementType()) {
		case IJavaElement.JAVA_PROJECT:
			if (from != null) {
				moveProject((IJavaProject) elem, (IJavaProject) from);
			} else {
				addProject((IJavaProject) delta.getElement());
			}
			break;

		case IJavaElement.PACKAGE_FRAGMENT_ROOT:
			if (from != null) {
				movePackageFragmentRoot((IPackageFragmentRoot) elem, (IPackageFragmentRoot) from);
			} else {
				addPackageFragmentRoot((IPackageFragmentRoot) delta.getElement());
			}
			break;
		default:
			System.out.println("Add changes missed:");
			System.out.println(delta);
		}
	}

	private void handleRemoveDelta(IJavaElementDelta delta) {
		IJavaElement elem = delta.getElement();
		IJavaElement to = delta.getMovedToElement();

		switch (elem.getElementType()) {
		case IJavaElement.JAVA_PROJECT:
			if (to == null) {
				removeProject((IJavaProject) elem);
			}
			break;
		case IJavaElement.PACKAGE_FRAGMENT_ROOT:
			if (to == null) {
				removePackageFragmentRoot((IPackageFragmentRoot) elem);
			}
			break;
		default:
			System.out.println("Remove changes missed:");
			System.out.println(delta);
		}
	}

	private void handleChangeDelta(IJavaElementDelta delta) {
		System.out.println(delta);
	}

	private void moveProject(IJavaProject moved, IJavaProject original) {
		// If the original project was not traced, then dump it.
		if (!Activator.getDefault().getWsService().isTracedProject(original)) {
			return;
		}

		// Modify traced projects accordingly.
		removeProject(original);

		// Create and delete the project.
		Activator.getDefault().getWsService().addTracedProject(moved);
		addProject(moved);

	}

	private void movePackageFragmentRoot(IPackageFragmentRoot elem, IPackageFragmentRoot original) {
		// If the original project was not traced, then dump it.
		if (!Activator.getDefault().getWsService().isTracedProject(original.getJavaProject())) {
			return;
		}

		// Modify traced projects accordingly.
		removePackageFragmentRoot(original);

		// Create and delete the project.
		addPackageFragmentRoot(elem);
	}

	private void removeProject(IJavaProject elem) {
		if (!Activator.getDefault().getWsService().isTracedProject(elem)) {
			return;
		}
		buildPrimitives.removeProject(elem);
		Activator.getDefault().getWsService().removeTracedProjectWithStructure(elem);
	}

	private void removePackageFragmentRoot(IPackageFragmentRoot elem) {
		if (!Activator.getDefault().getWsService().isTracedProject(elem.getJavaProject())) {
			return;
		}
		buildPrimitives.removePackageFragmentRoot(elem);
	}

	private void addProject(IJavaProject project) {
		if (!Activator.getDefault().getWsService().isTracedProject(project)) {
			return;
		}
		buildPrimitives.addProject(project);
	}

	private void addPackageFragmentRoot(IPackageFragmentRoot elem) {
		if (!Activator.getDefault().getWsService().isTracedProject(elem.getJavaProject())) {
			return;
		}
		JavaProject container = (JavaProject) buildPrimitives.findJdtElementInEmfModel(elem.getJavaProject());
		buildPrimitives.addPackageFragmentRoot(container, elem);
	}

	public void removeEntireProject(IJavaProject project) {
		buildPrimitives.removeEntireProject(project);
	}

	private void buildStructureFromSratch(final List<IJavaProject> jdtProjects) throws Exception {
		// Iterate through the workspace and create the correspondent EMF.
		for (IJavaProject project : jdtProjects) {

			// Add the project get the children and iterate through them.
			JavaProject emfProject = buildPrimitives.addProject(project);

			for (IPackageFragmentRoot pfr : project.getPackageFragmentRoots()) {
				if (!pfr.isArchive()) {

					PackageFragmentRoot emfPfr = buildPrimitives.addPackageFragmentRoot(emfProject, pfr);
				}

			}

			// List<IPackageFragment> packages = JavaModelWalker
			// .childrenOf(project);
			// for (IPackageFragment pkg : packages) {
			//
			// // Add the package to the model, get the children of it  and
			// // iterate again.
			// if (buildPrimitives.isJdtElemInModel(pkg))
			// continue;
			// Package emfPackage = buildPrimitives
			// .addPackage(emfProject, pkg);
			// List<IType> types = JavaModelWalker.childrenOf(pkg);
			// for (IType type : types) {
			//
			// // Add the class to the model, get the children of it and
			// // iterate again.
			// if (buildPrimitives.isJdtElemInModel(type))
			// continue;
			// ApiClass emfClass = buildPrimitives.addClass(emfPackage,
			// type);
			// insertOutgoingDependencies(type);
			// List<IJavaElement> methodsOrFields = JavaModelWalker
			// .childrenOf(type);
			// for (IJavaElement methodOrField : methodsOrFields) {
			// if (buildPrimitives.isJdtElemInModel(methodOrField))
			// continue;
			// if (methodOrField instanceof IMethod) {
			// buildPrimitives.addMethod(emfClass,
			// (IMethod) methodOrField);
			// insertOutgoingDependencies(methodOrField);
			// } else if (methodOrField instanceof IField) {
			// buildPrimitives.addField(emfClass,
			// (IField) methodOrField);
			// } else {
			// throw new RuntimeException(
			// "Class can only contain IMethod or IField instance. Found item: "
			// + methodOrField.getClass());
			// }
			// }
			// }
			// }
		}
	}

	/*
	 * -----------------------------------------------------------------------------------------------------------------
	 */

	private void add(IJavaElementDelta delta) {
		try {
			addStandalone(delta.getElement());
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	private void addStandalone(IJavaElement elem) throws JavaModelException {
		//
		// if (elem instanceof IJavaProject) {
		// buildPrimitives.addProject((IJavaProject) elem);
		// } else if (elem instanceof IPackageFragment) {
		// IPackageFragment jdtPkg = (IPackageFragment) elem;
		// Project project = (Project) buildPrimitives
		// .findJdtElementInEmfModel(jdtPkg.getJavaProject());
		// if (project != null) {
		// buildPrimitives.addPackage(project, jdtPkg);
		// }
		// } else if (elem instanceof IType) {
		// IType jdttType = (IType) elem;
		// Package pkg = (Package) buildPrimitives
		// .findJdtElementInEmfModel(jdttType.getPackageFragment());
		// buildPrimitives.addClass(pkg, jdttType);
		// insertOutgoingDependencies(jdttType);
		//
		// } else if (elem instanceof IMethod) {
		// IMethod method = (IMethod) elem;
		// ApiClass container = (ApiClass) buildPrimitives
		// .findJdtElementInEmfModel(method.getDeclaringType());
		// buildPrimitives.addMethod(container, method);
		// insertOutgoingDependencies(method);
		//
		// } else if (elem instanceof IField) {
		// IField field = (IField) elem;
		// ApiClass container = (ApiClass) buildPrimitives
		// .findJdtElementInEmfModel(field.getDeclaringType());
		// buildPrimitives.addField(container, field);
		// insertOutgoingDependencies(field);
		// } else if (elem instanceof ICompilationUnit) {
		// ICompilationUnit cu = (ICompilationUnit) elem;
		// for (IJavaElement it : cu.getChildren()) {
		// if (!(it instanceof IType)) {
		// System.err
		// .println("CompilationUnit's children should be IType, but it is: "
		// + it.getClass());
		// } else {
		// addStandalone(it);
		// }
		// }
		// } else {
		// System.err.println("WHAT TO ADD:" + elem);
		// }
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

	private void change(IJavaElementDelta delta) {
		try {
			// Check if the dependencies has changed.
			IJavaElement elem = delta.getElement();
			updateOutgoingDeps(elem);
			compareWithModel(elem);
			updateChildren(elem);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void updateChildren(IJavaElement elem) throws JavaModelException {
		// if (elem instanceof ICompilationUnit) {
		// for (IJavaElement child : ((ICompilationUnit) elem).getChildren()) {
		// if (child instanceof IType) {
		// IType type = (IType) child;
		// for (IMethod m : type.getMethods()) {
		// if (buildPrimitives.findJdtElementInEmfModel(m) == null) {
		// addStandalone(m);
		// }
		// }
		// for (IField f : type.getFields()) {
		// if (buildPrimitives.findJdtElementInEmfModel(f) == null) {
		// addStandalone(f);
		// }
		// }
		// }
		// }
		// }

	}

	private void compareWithModel(IJavaElement elem) throws CoreException {
		// // TODO do it with the other classes too.
		// if (elem instanceof IType) {
		// ApiClass ac = (ApiClass) buildPrimitives
		// .findJdtElementInEmfModel(elem);
		// for (IMethod m : JavaModelWalker.methodsOf((IType) elem)) {
		// if (buildPrimitives.findJdtElementInEmfModel(m) == null) {
		// buildPrimitives.addMethod(ac, m);
		// }
		// }
		// for (IField f : JavaModelWalker.fieldsOf((IType) elem)) {
		// if (buildPrimitives.findJdtElementInEmfModel(f) == null) {
		// buildPrimitives.addField(ac, f);
		// }
		// }
		// }
		//
		// else if (elem instanceof ICompilationUnit) {
		// for (IJavaElement type : ((ICompilationUnit) elem).getChildren()) {
		// if (!(type instanceof IType)) {
		// System.err.println("Unexpected type: " + type.getClass());
		// } else {
		// ApiClass ac = (ApiClass) buildPrimitives
		// .findJdtElementInEmfModel(type);
		// for (IMethod m : JavaModelWalker.methodsOf((IType) type)) {
		// if (buildPrimitives.findJdtElementInEmfModel(m) == null) {
		// buildPrimitives.addMethod(ac, m);
		// }
		// }
		// for (IField f : JavaModelWalker.fieldsOf((IType) type)) {
		// if (buildPrimitives.findJdtElementInEmfModel(f) == null) {
		// buildPrimitives.addField(ac, f);
		// }
		// }
		// }
		// }
		// }
	}

	private void updateOutgoingDeps(IJavaElement elem) {
		// if (elem instanceof IType || elem instanceof IMethod
		// || elem instanceof IField) {
		// NamedElement emfElem = buildPrimitives
		// .findJdtElementInEmfModel(elem);
		// if (emfElem == null) {
		// throw new RuntimeException(
		// "Item cannot be updated because it is not found in the model.");
		// }
		// EmfModelUtils.deleteOutgoingDependencies(workspace, emfElem);
		// insertOutgoingDependencies(elem);
		// } else {
		// // System.err.println("WHAT TO UPDATE:" + elem.getElementName()
		// // + ", type: " + elem.getElementType());
		// }
	}

	private List<IMethod> findCalledMethods(final IMethod method) throws CoreException {
		// final List<IMethod> result = new LinkedList<IMethod>();
		// final boolean[] finished = { false };
		// SearchRequestor requestor = new SearchRequestor() {
		//
		// @Override
		// public void acceptSearchMatch(SearchMatch match)
		// throws CoreException {
		// Object mo = match.getElement();
		// if (mo == null) {
		// return;
		// } else if (mo instanceof IMethod) {
		// // Remove unnecessary results (the items from the java.*
		// // package).
		// IMethod method = (IMethod) mo;
		// ICompilationUnit cu = method.getCompilationUnit();
		// if (cu != null) {
		// IPackageDeclaration[] packages = cu
		// .getPackageDeclarations();
		// if (packages != null
		// && packages.length > 0
		// && packages[0].getElementName().startsWith(
		// "java.")) {
		// return;
		// }
		// }
		//
		// result.add((IMethod) mo);
		//
		// } else {
		// System.err.println("Wrong type item added.");
		// System.err.println("From: " + method);
		// System.err.println("To:   " + mo);
		// }
		// }
		//
		// @Override
		// public void endReporting() {
		// finished[0] = true;
		// }
		// };
		//
		// engine.searchDeclarationsOfSentMessages(method, requestor,
		// new NullProgressMonitor());
		//
		// while (finished[0] == false) {
		// try {
		// Thread.sleep(200);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// }
		//
		// return result;
		return null;
	}

	private List<IType> findClassUsages(final IMethod method) throws CoreException {
		// final List<IType> result = new LinkedList<IType>();
		// final boolean[] finished = { false };
		// SearchRequestor requestor = new SearchRequestor() {
		//
		// @Override
		// public void acceptSearchMatch(SearchMatch match)
		// throws CoreException {
		// Object mo = match.getElement();
		// if (mo == null) {
		// return;
		// } else if (mo instanceof IType) {
		// // Remove unnecessary results (the items from the java.*
		// // package).
		// result.add((IType) mo);
		//
		// } else {
		// System.err.println("Wrong type item added..");
		// System.err.println("From: " + method);
		// System.err.println("To:   " + mo);
		// }
		// }
		//
		// @Override
		// public void endReporting() {
		// finished[0] = true;
		// }
		// };
		//
		// engine.searchDeclarationsOfReferencedTypes(method, requestor,
		// new NullProgressMonitor());
		// return result;
		return null;
	}

	private List<IMethod> findOverridenMethods(final IMethod method) throws CoreException {
		// List<IMethod> result = new LinkedList<IMethod>();
		//
		// // Find supertypes
		// ITypeHierarchy hierarchy = method.getDeclaringType().newTypeHierarchy(
		// new NullProgressMonitor());
		//
		// List<IType> superTypes = Arrays.asList(hierarchy.getSupertypes(method
		// .getDeclaringType()));
		// for (IType superType : superTypes) {
		// for (IMethod superMethod : superType.getMethods()) {
		// if (methodsHasSameSignature(superMethod, method)) {
		// result.add(superMethod);
		// }
		// }
		// }
		// return result;
		return null;
	}

	private List<IField> findReferencedField(final IMethod elem) throws CoreException {
		// final List<IField> result = new LinkedList<IField>();
		// final boolean[] finished = { false };
		// SearchRequestor requestor = new SearchRequestor() {
		//
		// @Override
		// public void acceptSearchMatch(SearchMatch match)
		// throws CoreException {
		// Object mo = match.getElement();
		// if (mo == null) {
		// return;
		// } else if (mo instanceof IField) {
		// // Remove unnecessary results (the items from the java.*
		// // package).
		// result.add((IField) mo);
		//
		// } else {
		// System.err.println("Wrong type item added..");
		// System.err.println("From: " + elem);
		// System.err.println("To:   " + mo);
		// }
		// }
		//
		// @Override
		// public void endReporting() {
		// finished[0] = true;
		// }
		// };
		//
		// engine.searchDeclarationsOfAccessedFields(elem, requestor,
		// new NullProgressMonitor());
		// return result;
		return null;
	}

	private List<IType> findSupertypes(IType elem) throws CoreException {
		// ITypeHierarchy hierarchy = elem
		// .newTypeHierarchy(new NullProgressMonitor());
		// return Arrays.asList(hierarchy.getSupertypes(elem));
		return null;
	}

	private void insertOutgoingDependencies(IJavaElement elem) {
		// try {
		// if (elem instanceof IMethod) {
		// // Handle METHOD REFERENCE dependencies.
		// for (IMethod referencedMethod : findCalledMethods((IMethod) elem)) {
		// if (!elem.getJavaProject().equals(
		// referencedMethod.getJavaProject())) {
		// buildPrimitives.addDependecy(
		// DependencyType.METHOD_CALL, elem,
		// referencedMethod);
		// }
		//
		// }
		//
		// // Handle OVERRIDED METHOD dependencies.
		// for (IMethod overridedMethod : findOverridenMethods((IMethod) elem)) {
		// if (!elem.getJavaProject().equals(
		// overridedMethod.getJavaProject())) {
		// buildPrimitives.addDependecy(
		// DependencyType.METHOD_OVERRIDE, elem,
		// overridedMethod);
		// }
		// }
		//
		// // Handle CLASS USAGE dependencies.
		// for (IType usedClass : findClassUsages((IMethod) elem)) {
		// if (!elem.getJavaProject().equals(
		// usedClass.getJavaProject())) {
		// buildPrimitives.addDependecy(
		// DependencyType.CLASS_USAGE, elem, usedClass);
		// }
		// }
		//
		// // Handle FIELD ACCESS dependencies.
		// for (IField referencedField : findReferencedField((IMethod) elem)) {
		// if (!elem.getJavaProject().equals(
		// referencedField.getJavaProject())) {
		// buildPrimitives.addDependecy(
		// DependencyType.FIELD_ACCESS, elem,
		// referencedField);
		// }
		// }
		// }
		//
		// else if (elem instanceof IType) {
		// // Handle Inheritance dependencies.
		// for (IType superType : findSupertypes((IType) elem)) {
		// if (!elem.getJavaProject().equals(
		// superType.getJavaProject())) {
		// buildPrimitives.addDependecy(
		// DependencyType.INHERITANCE, elem, superType);
		// }
		// }
		// }
		// } catch (CoreException e) {
		// throw new RuntimeException(e);
		// }
	}

	private void remove(IJavaElementDelta delta) {
		// // If a method deleted, it is deleted. We don't handle the situation
		// // when it is moved to a new place.
		// // This is added when it is added.
		//
		// IJavaElement elem = delta.getElement();
		// try {
		// removeStandalone(elem);
		// // if (delta.getMovedToElement() != null) {
		// // addStandalone(delta.getMovedToElement());
		// // }
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
	}

	private void removeStandalone(IJavaElement elem) throws Exception {
		// if (elem instanceof IJavaProject) {
		// buildPrimitives.deleteProject((IJavaProject) elem);
		// } else if (elem instanceof IPackageFragment) {
		// buildPrimitives.deletePackage((IPackageFragment) elem);
		// } else if (elem instanceof ICompilationUnit) {
		// buildPrimitives.deleteCompilationUnit((ICompilationUnit) elem);
		// } else if (elem instanceof IMethod) {
		// buildPrimitives.deleteMethod((IMethod) elem);
		// } else if (elem instanceof IField) {
		// buildPrimitives.deleteField((IField) elem);
		// } else if (elem instanceof IType) {
		// buildPrimitives.deleteType((IType) elem);
		// } else {
		// System.err.println("WHAT TO REMOVE:" + elem);
		// }
	}
}

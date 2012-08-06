/*
 * File WsBuildPrimitives.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Aug 6, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;

import cern.devtools.depanalysis.javamodel.ApiClass;
import cern.devtools.depanalysis.javamodel.Dependency;
import cern.devtools.depanalysis.javamodel.DependencyType;
import cern.devtools.depanalysis.javamodel.Field;
import cern.devtools.depanalysis.javamodel.JavaModelPackage;
import cern.devtools.depanalysis.javamodel.Method;
import cern.devtools.depanalysis.javamodel.NamedElement;
import cern.devtools.depanalysis.javamodel.Package;
import cern.devtools.depanalysis.javamodel.Project;
import cern.devtools.depanalysis.javamodel.Workspace;

public class WsBuildPrimitives {

	private final Workspace workspace;

	public WsBuildPrimitives(Workspace workspace) {
		this.workspace = workspace;
	}

	public Project addProject(IJavaProject project) {
		return EmfModelUtils.createNamedElement(JavaModelPackage.PROJECT, workspace, workspace,
				project.getHandleIdentifier(), project.getElementName());
	}

	public Package addPackage(Project emfContainer, IPackageFragment pkg) {
		return EmfModelUtils.createNamedElement(JavaModelPackage.PACKAGE, workspace, emfContainer,
				pkg.getHandleIdentifier(), pkg.getElementName());
	}

	public ApiClass addClass(Package emfContainer, IType type) {
		return EmfModelUtils.createNamedElement(JavaModelPackage.API_CLASS, workspace, emfContainer, type
				.getHandleIdentifier(), type.getTypeQualifiedName(), type.getCompilationUnit().getHandleIdentifier());
	}

	public Method addMethod(ApiClass emfContainer, IMethod methodOrField) {
		return EmfModelUtils.createNamedElement(JavaModelPackage.METHOD, workspace, emfContainer,
				methodOrField.getHandleIdentifier(), JdtUtils.decodeSourceSignature((IMethod) methodOrField));
	}

	public Field addField(ApiClass emfContainer, IField methodOrField) {
		return EmfModelUtils.createNamedElement(JavaModelPackage.FIELD, workspace, emfContainer,
				methodOrField.getHandleIdentifier(), methodOrField.getElementName());
	}

	public void deleteProject(IJavaProject project) {
		Object emfProjectObject = findJdtElementInEmfModel(project);
		if (emfProjectObject != null) {
			Project emfProject = (Project) emfProjectObject;
			deleteEmfProject(emfProject);
		} else {
			throw new RuntimeException("Tried to delete a project which does not exist");
		}
	}

	private void deleteEmfProject(Project emfProject) {
		Package[] packages = new ArrayList<Package>(emfProject.getPackages()).toArray(new Package[0]);
		for (int i = 0; i < packages.length; ++i) {
			deleteEmfPackage(packages[i]);
		}
		EmfModelUtils.deleteNamedElement(workspace, emfProject);
	}

	public void deletePackage(IJavaElement pkg) {
		Object emfPkgObject = findJdtElementInEmfModel(pkg);
		if (emfPkgObject != null) {
			Package emfPkg = (Package) emfPkgObject;
			deleteEmfPackage(emfPkg);
		} else {
			throw new RuntimeException("Tried to delete a project which does not exist");
		}
	}

	private void deleteEmfPackage(Package emfPkg) {
		ApiClass[] classes = new ArrayList<ApiClass>(emfPkg.getClasses()).toArray(new ApiClass[0]);
		for (int i = 0; i < classes.length; ++i) {
			deleteEmfType(classes[i]);
		}
		EmfModelUtils.deleteNamedElement(workspace, emfPkg);
	}

	public void deleteCompilationUnit(ICompilationUnit cu) {
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
			deleteEmfType(ac);
		}
	}

	public void deleteType(IType type) {
		ApiClass emfClass = (ApiClass) findJdtElementInEmfModel(type);
		if (emfClass == null) {
			throw new RuntimeException("Tried to delete type, but not stored in the emf model.");
		}

		deleteEmfType(emfClass);
	}

	private void deleteEmfType(ApiClass emfClass) {
		// Delete methods
		Method[] methods = new ArrayList<Method>(emfClass.getMethods()).toArray(new Method[0]);
		for (int i = 0; i < methods.length; ++i) {
			deleteEmfMethod(methods[i]);
		}

		// Delete fields
		Field[] fields = new ArrayList<Field>(emfClass.getFields()).toArray(new Field[0]);
		for (int i = 0; i < fields.length; ++i) {
			deleteEmfField(fields[i]);
		}

		EmfModelUtils.deleteAllDependencies(workspace, emfClass);
		EmfModelUtils.deleteNamedElement(workspace, emfClass);
	}

	public void deleteMethod(IMethod elem) {
		Method emfMethod = (Method) findJdtElementInEmfModel(elem);
		if (emfMethod == null) {
			throw new RuntimeException("Tried to delete method, but not stored in the emf model.");
		}

		deleteEmfMethod(emfMethod);
	}

	private void deleteEmfMethod(Method emfMethod) {
		EmfModelUtils.deleteAllDependencies(workspace, emfMethod);
		EmfModelUtils.deleteNamedElement(workspace, emfMethod);
	}

	public void deleteField(IField elem) {
		Field emfField = (Field) findJdtElementInEmfModel(elem);
		if (emfField == null) {
			throw new RuntimeException("Tried to delete field, but not stored in the emf model.");
		}

		deleteEmfField(emfField);
	}

	private void deleteEmfField(Field emfField) {
		EmfModelUtils.deleteAllDependencies(workspace, emfField);
		EmfModelUtils.deleteNamedElement(workspace, emfField);
	}

	public Dependency addDependecy(DependencyType type, IJavaElement from, IJavaElement to) {
		NamedElement emfFrom = findJdtElementInEmfModel(from);
		NamedElement emfTo = findJdtElementInEmfModel(to);
		if (emfFrom == null) {
//			System.err
//					.println("Add dependency failed, because the following (from) item does not exists in the EMF model:  "
//							+ from);
			return null;
		} else if (emfTo == null) {
//			System.err
//					.println("Add dependency failed, because the following (to) item does not exists in the EMF model:  "
//							+ to);
			return null;
		} else {
			return EmfModelUtils.createDependency(workspace, emfFrom, emfTo, type);
		}
	}

	public boolean isJdtElemInModel(IJavaElement jdtElem) {
		return workspace.findElementByHandle(jdtElem.getHandleIdentifier()) != null;
	}

	public NamedElement findJdtElementInEmfModel(IJavaElement jdtElem) {
		return workspace.findElementByHandle(jdtElem.getHandleIdentifier());
	}
}

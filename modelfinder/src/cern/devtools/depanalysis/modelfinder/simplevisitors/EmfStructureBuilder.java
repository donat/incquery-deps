/*
 * File EmfModelCreatorVisitor.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.simplevisitors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

import cern.devtools.depanalysis.javamodel.ApiClass;
import cern.devtools.depanalysis.javamodel.Field;
import cern.devtools.depanalysis.javamodel.JavaModelFactory;
import cern.devtools.depanalysis.javamodel.JavaModelPackage;
import cern.devtools.depanalysis.javamodel.Method;
import cern.devtools.depanalysis.javamodel.NamedElement;
import cern.devtools.depanalysis.javamodel.Project;
import cern.devtools.depanalysis.javamodel.Package;
import cern.devtools.depanalysis.javamodel.Workspace;
import cern.devtools.depanalysis.modelfinder.JdtUtils;
import cern.devtools.depanalysis.modelfinder.structurals.ClassWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.FieldWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.JavaProjectWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.MethodWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.PackageWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.VisitorFailure;
import cern.devtools.depanalysis.modelfinder.structurals.WsItemWrapper;

public class EmfStructureBuilder extends Identity {

	private final Workspace workspace;

	private EmfStructureBuilder(Workspace workspace) {
		this.workspace = workspace;
	}

	public static EmfStructureBuilder newInstance() {
		return new EmfStructureBuilder(JavaModelFactory.eINSTANCE.createWorkspace());
	}

	public static EmfStructureBuilder newInstance(Workspace workspace) {
		return new EmfStructureBuilder(workspace);
	}

	public Workspace getEmfModel() {
		if (workspace == null) {
			throw new IllegalStateException("Visitor has not been fired");
		}
		return workspace;
	}

	/**
	 * We dont want to store anything from these to items.
	 */
	
	// @Override
	// public void visitWorkspaceRoot(WorkspaceRootWrapper jdtWsRootWrapper) {
	// }
	
	// @Override
	// public void visitCompilationUnit(CompilationUnitWrapper jdtCompilationUnitWrapper) {
	// throw new UnsupportedOperationException("Auto-generated method stub; not implemented yet.");
	// }

	@Override
	public void visitProject(JavaProjectWrapper jdtProjectWrapper) {
		if (isInModel(jdtProjectWrapper)) {
			return;
		}

		try {
			IJavaProject jdtJavaProject = jdtProjectWrapper.wrappedItem();
			createNamedElement(JavaModelPackage.PROJECT, workspace, jdtJavaProject.getHandleIdentifier(),
					jdtJavaProject.getElementName());
		} catch (JavaModelException e) {
			throw new VisitorFailure(e);
		}
	}

	@Override
	public void visitPackage(PackageWrapper jdtPackageWrapper) {
		if (isInModel(jdtPackageWrapper)) {
			return;
		}
		try {
			IPackageFragment jdtPackage = jdtPackageWrapper.wrappedItem();
			Project emfProject = workspace.findElementByHandle(jdtPackage.getJavaProject().getHandleIdentifier());
			createNamedElement(JavaModelPackage.PACKAGE, emfProject, jdtPackage.getHandleIdentifier(),
					jdtPackage.getElementName());
		} catch (JavaModelException e) {
			throw new VisitorFailure(e);
		}
	}

	@Override
	public void visitClass(ClassWrapper jdtTypeWrapper) {
		if (isInModel(jdtTypeWrapper)) {
			return;
		}

		try {
			IType jdtType = jdtTypeWrapper.wrappedItem();
			Package emfPackage = workspace.findElementByHandle(jdtType.getPackageFragment().getHandleIdentifier());
			createNamedElement(JavaModelPackage.API_CLASS, emfPackage, jdtType.getHandleIdentifier(),
					jdtType.getTypeQualifiedName(), jdtType.getCompilationUnit().getHandleIdentifier());
		} catch (JavaModelException e) {
			throw new VisitorFailure(e);
		}

	}

	@Override
	public void visitMethod(MethodWrapper jdtMethodWrapper) {
		if (isInModel(jdtMethodWrapper)) {
			return;
		}
		try {
			IMethod jdtMethod = jdtMethodWrapper.wrappedItem();
			ApiClass emfClass = workspace.findElementByHandle(jdtMethod.getDeclaringType().getHandleIdentifier());

			createNamedElement(JavaModelPackage.METHOD, emfClass, jdtMethod.getHandleIdentifier(),
					JdtUtils.decodeSourceSignature(jdtMethod));
		} catch (JavaModelException e) {
			throw new VisitorFailure(e);
		}

	}

	@Override
	public void visitField(FieldWrapper jdtFieldWrapper) {
		if (isInModel(jdtFieldWrapper)) {
			return;
		}
		try {
			IField jdtField = jdtFieldWrapper.wrappedItem();
			ApiClass emfClass = workspace.findElementByHandle(jdtField.getDeclaringType().getHandleIdentifier());

			createNamedElement(JavaModelPackage.FIELD, emfClass, jdtField.getHandleIdentifier(),
					jdtField.getElementName());
		} catch (JavaModelException e) {
			throw new VisitorFailure(e);
		}
	}

	@SuppressWarnings("unchecked")
	private <T extends NamedElement> T createNamedElement(int type, EObject container, String handler, String name, Object... data)
			throws JavaModelException {
		T newElement = null;

		// instantiation
		switch (type) {
		case JavaModelPackage.PROJECT:
			newElement = (T) JavaModelFactory.eINSTANCE.createProject();
			workspace.getProjects().add((Project) newElement);
			break;

		case JavaModelPackage.PACKAGE:
			newElement = (T) JavaModelFactory.eINSTANCE.createPackage();
			((Project) container).getPackages().add((Package) newElement);
			break;

		case JavaModelPackage.API_CLASS:
			newElement = (T) JavaModelFactory.eINSTANCE.createApiClass();
			newElement.setData(data[0]);
			((Package) container).getClasses().add((ApiClass) newElement);
			break;

		case JavaModelPackage.METHOD:
			newElement = (T) JavaModelFactory.eINSTANCE.createMethod();
			((ApiClass) container).getMethods().add((Method) newElement);
			break;

		case JavaModelPackage.FIELD:
			newElement = (T) JavaModelFactory.eINSTANCE.createField();
			((ApiClass) container).getFields().add((Field) newElement);
			break;

		default:
			throw new RuntimeException("Not vaid type specified (not present in JavaModelPackage).");
		}

		// set common attributes
		newElement.setName(name);
		newElement.setHandler(handler);

		// set workspace reference and return
		workspace.getElements().add(newElement);
		return newElement;
	}

	private boolean isInModel(WsItemWrapper wsItem) {
		return workspace.findElementByHandle(wsItem.wrappedItem().getHandleIdentifier()) != null;
	}
}

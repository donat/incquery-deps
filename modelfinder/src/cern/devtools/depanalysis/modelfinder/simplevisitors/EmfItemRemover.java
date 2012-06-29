/*
 * File EmfItemRemovel.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 28, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.simplevisitors;

import java.util.LinkedList;
import java.util.List;

import cern.devtools.depanalysis.javamodel.ApiClass;
import cern.devtools.depanalysis.javamodel.Field;
import cern.devtools.depanalysis.javamodel.Method;
import cern.devtools.depanalysis.javamodel.Package;
import cern.devtools.depanalysis.javamodel.Project;
import cern.devtools.depanalysis.javamodel.Workspace;
import cern.devtools.depanalysis.modelfinder.structurals.ClassWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.CompilationUnitWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.FieldWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.JavaProjectWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.MethodWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.PackageWrapper;

public class EmfItemRemover extends Identity {

	private final Workspace workspace;

	public EmfItemRemover(Workspace workspace) {
		this.workspace = workspace;
	}

	public static EmfItemRemover newInstance(Workspace workspace) {
		return new EmfItemRemover(workspace);
	}

	// We don't delete the workspace root at all.
	// @Override
	// public void visitWorkspaceRoot(WorkspaceRootWrapper jdtWsRootWrapper) {
	// throw new UnsupportedOperationException("Auto-generated method stub; not implemented yet.");
	// }

	@Override
	public void visitProject(JavaProjectWrapper jdtProjectWrapper) {
		Project emfProject = workspace.findElementByHandle(jdtProjectWrapper.wrappedItem().getHandleIdentifier());
		workspace.getProjects().remove(emfProject);
		workspace.getElements().remove(emfProject);
	}

	@Override
	public void visitPackage(PackageWrapper jdtPackageWrapper) {
		Package emfPackage = workspace.findElementByHandle(jdtPackageWrapper.wrappedItem().getHandleIdentifier());
		emfPackage.getProject().getPackages().remove(emfPackage);
		workspace.getElements().remove(emfPackage);
	}

	@Override
	public void visitCompilationUnit(CompilationUnitWrapper jdtCompilationUnitWrapper) {
		String projectHandler = jdtCompilationUnitWrapper.wrappedItem().getJavaProject().getHandleIdentifier();
		String cuHandler = jdtCompilationUnitWrapper.wrappedItem().getHandleIdentifier();
		Project emfProject = workspace.findElementByHandle(projectHandler);
		
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
			removeApiClass(ac);
		}
	}
	
	
	private void removeApiClass(ApiClass emfClass) {
		removeInheritanceDependencies(emfClass);
		removeClassStructure(emfClass);
	}
	private void removeInheritanceDependencies(ApiClass emfClass) {
		workspace.getDependencties().removeAll(emfClass.getIncomingDependencies());
		workspace.getDependencties().removeAll(emfClass.getOutgoingDependencies());
	}

	private void removeClassStructure(ApiClass emfClass) {
		emfClass.getPackage().getClasses().remove(emfClass);
		workspace.getElements().remove(emfClass);
	}

	@Override
	public void visitClass(ClassWrapper jdtTypeWrapper) {
		ApiClass emfClass = workspace.findElementByHandle(jdtTypeWrapper.wrappedItem().getHandleIdentifier());
		removeApiClass(emfClass);
	}


	@Override
	public void visitMethod(MethodWrapper jdtMethodWrapper) {
		Method emfMethod = workspace.findElementByHandle(jdtMethodWrapper.wrappedItem().getHandleIdentifier());
		emfMethod.getClass_().getMethods().remove(emfMethod);
		workspace.getElements().remove(emfMethod);
	}

	@Override
	public void visitField(FieldWrapper jdtFieldWrapper) {
		Field emfField = workspace.findElementByHandle(jdtFieldWrapper.wrappedItem().getHandleIdentifier());
		emfField.getClass_().getFields().remove(emfField);
		workspace.getElements().remove(emfField);
	}

}

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

public class EmfStructureRemover extends Identity {

	public static EmfStructureRemover newInstance(Workspace workspace) {
		return new EmfStructureRemover(workspace);
	}

	private final Workspace workspace;

	public EmfStructureRemover(Workspace workspace) {
		this.workspace = workspace;
	}

	// We don't delete the workspace root at all.
	// @Override
	// public void visitWorkspaceRoot(WorkspaceRootWrapper jdtWsRootWrapper) {
	// throw new UnsupportedOperationException("Auto-generated method stub; not implemented yet.");
	// }

	@Override
	public void visitClass(ClassWrapper jdtTypeWrapper) {
		ApiClass emfClass = workspace.findElementByHandle(jdtTypeWrapper.wrappedItem().getHandleIdentifier());
		deleteClassStructure(emfClass);
	}

	@Override
	public void visitCompilationUnit(CompilationUnitWrapper jdtCompilationUnitWrapper) {
		String projectHandler = jdtCompilationUnitWrapper.wrappedItem().getJavaProject().getHandleIdentifier();
		String cuHandler = jdtCompilationUnitWrapper.wrappedItem().getHandleIdentifier();
		Project emfProject = workspace.findElementByHandle(projectHandler);
		
		//
		if (emfProject == null) {
			return;
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
			deleteClassStructure(ac);
		}
	}

	@Override
	public void visitField(FieldWrapper jdtFieldWrapper) {
		Field emfField = workspace.findElementByHandle(jdtFieldWrapper.wrappedItem().getHandleIdentifier());
		deleteFieldStructure(emfField);
	}

	@Override
	public void visitMethod(MethodWrapper jdtMethodWrapper) {
		Method emfMethod = workspace.findElementByHandle(jdtMethodWrapper.wrappedItem().getHandleIdentifier());
		deleteMethodStructure(emfMethod);
	}

	@Override
	public void visitPackage(PackageWrapper jdtPackageWrapper) {
		Package emfPackage = workspace.findElementByHandle(jdtPackageWrapper.wrappedItem().getHandleIdentifier());
		depetePackageStructure(emfPackage);
	}
	
	
	@Override
	public void visitProject(JavaProjectWrapper jdtProjectWrapper) {
		Project emfProject = workspace.findElementByHandle(jdtProjectWrapper.wrappedItem().getHandleIdentifier());
		deleteProjectStructure(emfProject);
	}

	private void deleteClassStructure(ApiClass emfClass) {
		emfClass.getPackage().getClasses().remove(emfClass);
		workspace.getElements().remove(emfClass);
	}


	private void deleteFieldStructure(Field emfField) {
		emfField.getClass_().getFields().remove(emfField);
		workspace.getElements().remove(emfField);
	}

	private void deleteMethodStructure(Method emfMethod) {
		emfMethod.getClass_().getMethods().remove(emfMethod);
		workspace.getElements().remove(emfMethod);
	}

	private void deleteProjectStructure(Project emfProject) {
		workspace.getProjects().remove(emfProject);
		workspace.getElements().remove(emfProject);
	}

	private void depetePackageStructure(Package emfPackage) {
		emfPackage.getProject().getPackages().remove(emfPackage);
		workspace.getElements().remove(emfPackage);
	}

}

/*
 * File EmfDependencyRemover.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 2, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.simplevisitors;

import org.eclipse.jdt.core.IJavaElement;

import cern.devtools.depanalysis.javamodel.ApiClass;
import cern.devtools.depanalysis.javamodel.Package;
import cern.devtools.depanalysis.javamodel.Project;
import cern.devtools.depanalysis.javamodel.Workspace;
import cern.devtools.depanalysis.modelfinder.structurals.ClassWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.CompilationUnitWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.FieldWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.MethodWrapper;

public class EmfOutgoingDepRemover extends Identity {
	private final Workspace workspace;

	private EmfOutgoingDepRemover(Workspace workspace) {
		this.workspace = workspace;
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
		for (Package emfPackage : emfProject.getPackages()) {
			for (ApiClass emfClass : emfPackage.getClasses()) {

				// Remove the class dependencies, if it is contained by this compilation unit
				if (cuHandler.equals(emfClass.getData())) {
					// TODO UNCOMMENT
					// workspace.getDependencties().removeAll(emfClass.getOutgoingDependencies());
				}
			}
		}

	}

	public static EmfOutgoingDepRemover newInstance(Workspace workspace) {
		return new EmfOutgoingDepRemover(workspace);
	}

	@Override
	public void visitClass(ClassWrapper jdtTypeWrapper) {
		deleteDependencies(jdtTypeWrapper.wrappedItem());
	}

	@Override
	public void visitMethod(MethodWrapper jdtMethodWrapper) {
		deleteDependencies(jdtMethodWrapper.wrappedItem());
	}

	@Override
	public void visitField(FieldWrapper jdtFieldWrapper) {
		deleteDependencies(jdtFieldWrapper.wrappedItem());
	}

	private void deleteDependencies(IJavaElement jdtElem) {
		// TODO UNCOMMENT
		// NamedElement emfElem = workspace.findElementByHandle(jdtElem.getHandleIdentifier());
		// workspace.getDependencties().removeAll(emfElem.getOutgoingDependencies());
	}

}

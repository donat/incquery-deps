/*
 * File EmfDependencyBuilderVisitor.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.simplevisitors;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;

import cern.devtools.depanalysis.javamodel.Dependency;
import cern.devtools.depanalysis.javamodel.DependencyType;
import cern.devtools.depanalysis.javamodel.JavaModelFactory;
import cern.devtools.depanalysis.javamodel.NamedElement;
import cern.devtools.depanalysis.javamodel.Workspace;
import cern.devtools.depanalysis.modelfinder.structurals.ClassWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.VisitorFailure;

public class EmfDepBuilder extends Identity {

	private final Workspace workspace;

	public EmfDepBuilder(Workspace workspace) {
		this.workspace = workspace;
	}

	@Override
	public void visitClass(ClassWrapper jdtTypeWrapper) {
		try {
			IType jdtType = jdtTypeWrapper.wrappedItem();
			ITypeHierarchy hierarchy = jdtType.newTypeHierarchy(new NullProgressMonitor());
			IType[] superTypes = hierarchy.getAllSubtypes(jdtType);
			
			for (IType superIType : superTypes) {
				String handle = superIType.getHandleIdentifier();
				
				NamedElement emfType = workspace.findElementByHandle(jdtType.getHandleIdentifier());
				NamedElement emfSuperType = workspace.findElementByHandle(handle);
				if (emfSuperType != null) {
					Dependency d = JavaModelFactory.eINSTANCE.createDependency();
					d.setType(DependencyType.INHERITANCE);
					d.setFrom(emfType);
					d.setTo(emfSuperType);
					workspace.getDependencties().add(d);
					// TODO: delete this line.
					System.err.println("Added inheritance dep: " + d);
				}
			}
			
		} catch (JavaModelException e) {
			throw new VisitorFailure(e);
		}
	}
}

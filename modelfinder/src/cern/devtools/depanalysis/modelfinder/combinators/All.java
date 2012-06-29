/*
 * File All.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.combinators;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import cern.devtools.depanalysis.modelfinder.structurals.ClassWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.CompilationUnitWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.FieldWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.JavaProjectWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.MethodWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.PackageWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.VisitorFailure;
import cern.devtools.depanalysis.modelfinder.structurals.WorkspaceRootWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.WsItemWrapperVisitor;

public class All implements WsItemWrapperVisitor {

	private WsItemWrapperVisitor v;

	public All(WsItemWrapperVisitor v) {
		this.v = v;
	}

	@Override
	public void visitWorkspaceRoot(WorkspaceRootWrapper jdtWsRootWrapper) {
		IProject[] jdtProjects = jdtWsRootWrapper.getJdtWorkspace().getProjects();
		for (IProject jdtProject : jdtProjects) {
			try {
				if (jdtProject.exists() && jdtProject.isOpen()
						&& jdtProject.isNatureEnabled("org.eclipse.jdt.core.javanature")) {
					IJavaProject jdtJavaProject = JavaCore.create(jdtProject);
					(JavaProjectWrapper.newInstance(jdtJavaProject)).accept(v);

				}
			} catch (Exception e) {
				throw new VisitorFailure(e);
			}
		}
	}

	@Override
	public void visitProject(JavaProjectWrapper jdtProjectWrapper) {
		try {
			for (IPackageFragment jdtPackage : jdtProjectWrapper.wrappedItem().getPackageFragments()) {
				if (jdtPackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
					(PackageWrapper.newInstance(jdtPackage)).accept(v);
				}
			}
		} catch (JavaModelException e) {
			throw new VisitorFailure(e);
		}
	}

	@Override
	public void visitPackage(PackageWrapper jdtPackageWrapper) {
		try {
			for (ICompilationUnit cu : jdtPackageWrapper.wrappedItem().getCompilationUnits()) {
				CompilationUnitWrapper.newInstance(cu).accept(v);
			}
		} catch (JavaModelException e) {
			throw new VisitorFailure(e);
		}
	}
	
	@Override
	public void visitCompilationUnit(CompilationUnitWrapper jdtCompilationUnitWrapper) {
		try {
			for (IType jdtType : jdtCompilationUnitWrapper.wrappedItem().getAllTypes()) {
				(ClassWrapper.newInstance(jdtType)).accept(v);
			}
		} catch (JavaModelException e) {
			throw new VisitorFailure(e);
		}
	}

	@Override
	public void visitClass(ClassWrapper jdtTypeWrapper) {
		try {
			for (IMethod jdtMethod : jdtTypeWrapper.wrappedItem().getMethods()) {
				MethodWrapper.newInstance(jdtMethod).accept(v);

			}
			for (IField jdtField : jdtTypeWrapper.wrappedItem().getFields()) {
				FieldWrapper.newInstance(jdtField).accept(v);
			}
		} catch (JavaModelException e) {
			throw new VisitorFailure(e);
		}
	}

	@Override
	public void visitMethod(MethodWrapper jdtMethodWrapper) {
		// No children => do nothing.
	}

	@Override
	public void visitField(FieldWrapper jdtFieldWrapper) {
		// No children => do nothing.
	}
}

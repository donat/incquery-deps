/*
 * File Identity.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 26, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.simplevisitors;

import cern.devtools.depanalysis.modelfinder.structurals.ClassWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.CompilationUnitWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.FieldWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.JavaProjectWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.MethodWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.PackageWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.WorkspaceRootWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.WsItemWrapperVisitor;

public class Identity implements WsItemWrapperVisitor {

	@Override
	public void visitWorkspaceRoot(WorkspaceRootWrapper jdt) {
		System.err.println("Identity " + jdt.getJdtWorkspace());
		//Do nothing.
	}

	@Override
	public void visitProject(JavaProjectWrapper jdt) {
		System.err.println("Identity " + jdt.wrappedItem());
		//Do nothing.
	}

	@Override
	public void visitPackage(PackageWrapper jdt) {
		System.err.println("Identity " + jdt.wrappedItem());
		//Do nothing.
	}

	@Override
	public void visitClass(ClassWrapper jdt) {
		System.err.println("Identity " + jdt.wrappedItem());
		//Do nothing.
	}

	@Override
	public void visitMethod(MethodWrapper jdt) {
		System.err.println("Identity " + jdt.wrappedItem());
		//Do nothing.
	}

	@Override
	public void visitField(FieldWrapper jdt) {
		System.err.println("Identity " + jdt.wrappedItem());
		//Do nothing.
	}

	@Override
	public void visitCompilationUnit(CompilationUnitWrapper jdt) {
		System.err.println("Identity " + jdt.wrappedItem());
		// Do nothing.
	}
}

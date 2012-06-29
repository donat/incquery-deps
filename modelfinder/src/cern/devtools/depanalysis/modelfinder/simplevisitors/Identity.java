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
	public void visitWorkspaceRoot(WorkspaceRootWrapper jdtWsRootWrapper) {
		//Do nothing.
	}

	@Override
	public void visitProject(JavaProjectWrapper jdtProjectWrapper) {
		//Do nothing.
	}

	@Override
	public void visitPackage(PackageWrapper jdtPackageWrapper) {
		//Do nothing.
	}

	@Override
	public void visitClass(ClassWrapper jdtTypeWrapper) {
		//Do nothing.
	}

	@Override
	public void visitMethod(MethodWrapper jdtMethodWrapper) {
		//Do nothing.
	}

	@Override
	public void visitField(FieldWrapper jdtFieldWrapper) {
		//Do nothing.
	}

	@Override
	public void visitCompilationUnit(CompilationUnitWrapper jdtCompilationUnitWrapper) {
		// Do nothing.
	}

}

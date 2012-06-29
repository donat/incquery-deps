/*
 * File Sequence.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.combinators;

import cern.devtools.depanalysis.modelfinder.structurals.ClassWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.CompilationUnitWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.FieldWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.JavaProjectWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.MethodWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.PackageWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.WorkspaceRootWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.WsItemWrapperVisitor;


public class Sequence implements WsItemWrapperVisitor {

	protected WsItemWrapperVisitor first;
	protected WsItemWrapperVisitor second;

	public Sequence(WsItemWrapperVisitor first, WsItemWrapperVisitor second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public void visitWorkspaceRoot(WorkspaceRootWrapper jdtWsRootWrapper) {
		first.visitWorkspaceRoot(jdtWsRootWrapper);
		second.visitWorkspaceRoot(jdtWsRootWrapper);
	}
	
	@Override
	public void visitProject(JavaProjectWrapper jdtProjectWrapper) {
		first.visitProject(jdtProjectWrapper);
		second.visitProject(jdtProjectWrapper);
	}

	@Override
	public void visitPackage(PackageWrapper jdtPackageWrapper) {
		first.visitPackage(jdtPackageWrapper);
		second.visitPackage(jdtPackageWrapper);
	}

	@Override
	public void visitCompilationUnit(CompilationUnitWrapper jdtCompilationUnitWrapper) {
		first.visitCompilationUnit(jdtCompilationUnitWrapper);
		second.visitCompilationUnit(jdtCompilationUnitWrapper);
	}

	@Override
	public void visitClass(ClassWrapper jdtTypeWrapper) {
		first.visitClass(jdtTypeWrapper);
		second.visitClass(jdtTypeWrapper);
	}

	@Override
	public void visitMethod(MethodWrapper jdtMethodWrapper) {
		first.visitMethod(jdtMethodWrapper);
		second.visitMethod(jdtMethodWrapper);
	}

	@Override
	public void visitField(FieldWrapper jdtFieldWrapper) {
		first.visitField(jdtFieldWrapper);
		second.visitField(jdtFieldWrapper);
	}
}

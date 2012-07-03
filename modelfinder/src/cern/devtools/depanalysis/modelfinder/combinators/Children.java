/*
 * File OneLevelDown.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 2, 2012.
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

public class Children extends All {

	public boolean levelVisited = false;

	public Children(WsItemWrapperVisitor v) {
		super(v);
	}

	@Override
	public void visitWorkspaceRoot(WorkspaceRootWrapper jdtWsRootWrapper) {
		if (!levelVisited) {
			super.visitWorkspaceRoot(jdtWsRootWrapper);
		}
		levelVisited = true;
	}

	@Override
	public void visitClass(ClassWrapper jdtTypeWrapper) {
		if (!levelVisited) {
			super.visitClass(jdtTypeWrapper);
		}
		levelVisited = true;
	}

	@Override
	public void visitCompilationUnit(CompilationUnitWrapper jdtCompilationUnitWrapper) {
		if (!levelVisited) {
			super.visitCompilationUnit(jdtCompilationUnitWrapper);
		}
		levelVisited = true;
	}

	@Override
	public void visitField(FieldWrapper jdtFieldWrapper) {
		if (!levelVisited) {
			super.visitField(jdtFieldWrapper);
		}
		levelVisited = true;
	}

	@Override
	public void visitMethod(MethodWrapper jdtMethodWrapper) {
		if (!levelVisited) {
			super.visitMethod(jdtMethodWrapper);
		}
		levelVisited = true;
	}

	@Override
	public void visitPackage(PackageWrapper jdtPackageWrapper) {
		if (!levelVisited) {
			super.visitPackage(jdtPackageWrapper);
		}
		levelVisited = true;
	}

	@Override
	public void visitProject(JavaProjectWrapper jdtProjectWrapper) {
		if (!levelVisited) {
			super.visitProject(jdtProjectWrapper);
		}
		levelVisited = true;
	}
}

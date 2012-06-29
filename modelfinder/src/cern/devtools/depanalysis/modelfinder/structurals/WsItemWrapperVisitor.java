/*
 * File WorkspaceItemVisitor.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;


public interface WsItemWrapperVisitor {
	public void visitWorkspaceRoot(WorkspaceRootWrapper jdtWsRootWrapper);
	public void visitProject(JavaProjectWrapper jdtProjectWrapper);
	public void visitPackage(PackageWrapper jdtPackageWrapper);
	public void visitCompilationUnit(CompilationUnitWrapper jdtCompilationUnitWrapper);
	public void visitClass(ClassWrapper jdtTypeWrapper);
	public void visitMethod(MethodWrapper jdtMethodWrapper);
	public void visitField(FieldWrapper jdtFieldWrapper);
}

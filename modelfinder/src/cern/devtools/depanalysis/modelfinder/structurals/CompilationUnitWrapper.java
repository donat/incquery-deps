/*
 * File CompilationUnitWrapper.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 28, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

import org.eclipse.jdt.core.ICompilationUnit;


public class CompilationUnitWrapper implements WsItemWrapper {

	private final ICompilationUnit jdtCompilationUnit;

	private CompilationUnitWrapper(ICompilationUnit jdtCompilationUnit) {
		this.jdtCompilationUnit = jdtCompilationUnit;
	}
	
	public static CompilationUnitWrapper newInstance(ICompilationUnit jdtCompilationUnit) {
		return new CompilationUnitWrapper(jdtCompilationUnit);
	}
	
	@Override
	public void accept(WsItemWrapperVisitor visitor) {
		visitor.visitCompilationUnit(this);
	}

	@Override
	public ICompilationUnit wrappedItem() {
		return jdtCompilationUnit;
	}
	
}

/*
 * File ClassWrapper.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

import org.eclipse.jdt.core.IType;


public class ClassWrapper implements WsItemWrapper {

	private final IType jdtType;

	private ClassWrapper(IType jdtType) {
		this.jdtType = jdtType;

	}
	
	public static ClassWrapper newInstance(IType jdtType) {
		return new ClassWrapper(jdtType);
	}

	@Override
	public void accept(WsItemWrapperVisitor visitor) {
		visitor.visitClass(this);
	}

	public IType wrappedItem() {
		return jdtType;
	}

}

/*
 * File MethodWrapper.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

import org.eclipse.jdt.core.IMethod;


public class MethodWrapper implements WsItemWrapper {

	private final IMethod jdtMethod;

	private MethodWrapper(IMethod jdtMethod) {
		this.jdtMethod = jdtMethod;
		
	}
	
	public static MethodWrapper newInstance(IMethod jdtMethod) {
		return new MethodWrapper(jdtMethod);
	}
	
	@Override
	public void accept(WsItemWrapperVisitor visitor) {
		visitor.visitMethod(this);
	}

	public IMethod wrappedItem() {
		return jdtMethod;
	}

}

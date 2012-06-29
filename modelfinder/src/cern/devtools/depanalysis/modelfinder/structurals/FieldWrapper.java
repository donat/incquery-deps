/*
 * File FieldWrapper.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

import org.eclipse.jdt.core.IField;


public class FieldWrapper implements WsItemWrapper {

	private final IField jdtField;

	private FieldWrapper(IField jdtField) {
		this.jdtField = jdtField;

	}
	
	public static FieldWrapper newInstance(IField jdtField) {
		return new FieldWrapper(jdtField);
	}

	@Override
	public void accept(WsItemWrapperVisitor visitor) {
		visitor.visitField(this);
	}

	public IField wrappedItem() {
		return jdtField;
	}
}

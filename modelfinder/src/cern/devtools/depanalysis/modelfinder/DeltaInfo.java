/*
 * File DeltaInfo.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Aug 5, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;

public class DeltaInfo {

	public static final int NEW_ITEM = 1;
	public static final int DELETE_ITEM = 2;
	public static final int UPDATE_ITEM = 3;

	private final int type;
	private final IJavaElement elem;
	private final IJavaElement movedFrom;
	private final IJavaElement movedTo;

	private DeltaInfo(int type, IJavaElement elem, IJavaElement movedFrom, IJavaElement movedTo) {
		this.type = type;
		this.elem = elem;
		this.movedFrom = movedFrom;
		this.movedTo = movedTo;
	}

	public static DeltaInfo newJavaElement(IJavaElement elem) {
		return new DeltaInfo(NEW_ITEM, elem, null, null);
	}

	public static DeltaInfo deleteJavaElement(IJavaElement elem) {
		return new DeltaInfo(DELETE_ITEM, elem, null, null);
	}

	public IJavaElement getElem() {
		return elem;
	}

	public int getType() {
		return type;
	}

	public boolean isStandaloneModification() {
		return movedFrom == null && movedTo == null;
	}

	/**
	 * 
	 * If returns null, the event should be discarded, because it does not modify the emf model.
	 * 
	 * @param delta
	 * @return
	 */
	public static DeltaInfo fromJdtDelta(IJavaElementDelta delta) {
		IJavaElement elem = delta.getElement();
		// Pure add, without moved from.
		if (delta.getKind() == IJavaElementDelta.ADDED) {
			if (delta.getMovedFromElement() == null) {
				if (elem instanceof IPackageFragment || elem instanceof IType || elem instanceof IMethod
						|| elem instanceof IField) {
					return newJavaElement(delta.getElement());
				} else {
					System.out.println("Individually removed element ignored: " + elem.getElementName() + "("
							+ JdtUtils.getJavaElemType(elem.getElementType()) + ")");
				}
			}
		} else if (delta.getKind() == IJavaElementDelta.REMOVED) {
			if (delta.getMovedToElement() == null) {
				if (elem instanceof IPackageFragment || elem instanceof IType || elem instanceof IMethod
						|| elem instanceof IField) {
					return deleteJavaElement(delta.getElement());
				} else {
					System.out.println("Individually removed element ignored: " + elem.getElementName() + "("
							+ JdtUtils.getJavaElemType(elem.getElementType()) + ")");
				}
			}
		}

		else if (delta.getKind() == IJavaElementDelta.CHANGED) {

		}

		// If we are not interested, then drop the delta and return null.
		return null;
	}

	@Override
	public String toString() {
		String result = "Workspace delta\n\t";
		result += "type: ";
		switch (type) {
		case NEW_ITEM:
			result += "add\n\t";
			break;
		case DELETE_ITEM:
			result += "remove\n\t";
			break;
		case UPDATE_ITEM:
			result += "update\n\t";
			break;
		default:
			throw new RuntimeException("Unknown type: " + type);
		}
		result += "element: " + elem.getElementName() + ", type: " + elem.getElementType() + "\n\t";
		result += "movedFrom: " + movedFrom + "\n\t";
		result += "movedTo: " + movedTo + "\n\t";

		return result;
	}
}

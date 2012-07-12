/*
 * File WsChangeType.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 3, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;

public enum WsChangeType {
	ADD_PROJECT, ADD_PACKAGE, ADD_CLASS, ADD_METHOD, ADD_FIELD, REMOVE_PROJECT, REMOVE_PACKAGE, REMOVE_CLASS, REMOVE_METHOD, REMOVE_FIELD, UPDATE_COMPILATION_UNIT;

	public static WsChangeType forAddingJdtItem(IJavaElement elem) {
		/*
		 * if (elem instanceof IJavaProject) { return ADD_PROJECT; } else
		 */if (elem instanceof IPackageFragment) {
			return ADD_PACKAGE;
		} else if (elem instanceof IType) {
			return ADD_CLASS;
		} else if (elem instanceof IMethod) {
			return ADD_METHOD;
		} else if (elem instanceof IField) {
			return ADD_FIELD;
		}

		// Default option
		return null;
	}

	public static WsChangeType forRemovingJdtItem(IJavaElement elem) {
		if (elem instanceof IJavaProject) {
			return REMOVE_PROJECT;
		} else if (elem instanceof IPackageFragment) {
			return REMOVE_PACKAGE;
		}

		else if (elem instanceof IType || elem instanceof ICompilationUnit) {
			return REMOVE_CLASS;
		} else if (elem instanceof IMethod) {
			return REMOVE_METHOD;
		} else if (elem instanceof IField) {
			return REMOVE_FIELD;
		}

		// Default option
		return null;
	}

	public static WsChangeType forChangingJdtItem(IJavaElement elem, IJavaElementDelta delta) {
		if (elem instanceof ICompilationUnit && (delta.getFlags() & IJavaElementDelta.F_AST_AFFECTED) != 0) {
			return UPDATE_COMPILATION_UNIT;
		}
		return null;
	}

}

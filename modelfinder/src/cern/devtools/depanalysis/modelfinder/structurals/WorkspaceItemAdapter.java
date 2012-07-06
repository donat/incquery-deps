/*
 * File WorkspaceItemAdapter.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 26, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.structurals;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;

public class WorkspaceItemAdapter {
	public static WsItemWrapper adapt(IJavaElement jdtElem) {
		// try {
		if (jdtElem instanceof IJavaProject) {
			return JavaProjectWrapper.newInstance((IJavaProject) jdtElem);
		} else if (jdtElem instanceof IPackageFragment) {
			return PackageWrapper.newInstance((IPackageFragment) jdtElem);
		} else if (jdtElem instanceof IType) {
			return ClassWrapper.newInstance((IType) jdtElem);
		} else if (jdtElem instanceof ICompilationUnit) {
			return CompilationUnitWrapper.newInstance((ICompilationUnit) jdtElem);
		} else if (jdtElem instanceof IType) {
			return ClassWrapper.newInstance((IType) jdtElem);
		} else if (jdtElem instanceof IMethod) {
			return MethodWrapper.newInstance((IMethod) jdtElem);
		} else if (jdtElem instanceof IField) {
			return FieldWrapper.newInstance((IField) jdtElem);
		} else {
			// System.err.println("Unable to adapt " + jdtElem.getClass() + " to VisitableWorkspaceItem.");
			return null;
		}
	}
}
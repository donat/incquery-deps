/*
 * File JdtUtils.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package hu.bme.incquery.deps.core;

import java.util.Collection;
import java.util.List;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

public final class JdtUtils {

	private static final String[] elementTypes = new String[17];
	private static final String[] deltaTypes = new String[5];

	static {
		elementTypes[1] = "javamodel";
		elementTypes[2] = "javaproject";
		elementTypes[3] = "packagefragmentroot";
		elementTypes[4] = "packagefragment";
		elementTypes[5] = "compilationunit";
		elementTypes[6] = "classfile";
		elementTypes[7] = "type";
		elementTypes[8] = "field";
		elementTypes[9] = "method";
		elementTypes[10] = "initializer";
		elementTypes[11] = "pkgdeclaration";
		elementTypes[12] = "importcontainer";
		elementTypes[13] = "importdeclaration";
		elementTypes[14] = "localvariable";
		elementTypes[15] = "typeparameter";
		elementTypes[16] = "annotaion";

		deltaTypes[1] = "ADDED";
		deltaTypes[2] = "REMOVED";
		deltaTypes[4] = "CHANGED";

	}

	public static String fullyQualify(IType el) {
		return el.getFullyQualifiedName().replace('$', '.');
	}

	public static String fullyQualify(IMethod method) throws JavaModelException {
		// appends the fully qualified class name
		IType type = (IType) method.getParent();
		String result = fullyQualify(type) + "#";
		result += method.getElementName();

		// process parameter list
		result += "(";
		String[] params = method.getParameterTypes();
		for (int i = 0; i < params.length; ++i) {
			result += decodeJdtSource(params[i], type);

			if (i != (params.length - 1)) {
				result += ',';
			}
		}

		// end parameter list and add return type
		result += "):";
		result += decodeJdtSource(method.getReturnType(), type);

		//System.out.println(result);
		return result;
	}
	
	public static String fullyQualify(IField el) {
		return fullyQualify((IType) el.getParent()) + "." + el.getElementName();
	}

	public static String decodeSourceSignature(IMethod method) {
		try {
			// Variable holding the source signature of the method. Initially put the name of the method in it.
			StringBuffer sSig = new StringBuffer(method.getElementName());

			// Start the parameter list.
			sSig.append("(");

			// Put all the parameter types (fully qualified)
			String comma = "";
			for (String pt : method.getParameterTypes()) {
				sSig.append(comma);
				String pType = decodeJdtSource(pt, method.getDeclaringType());
				sSig.append(pType);
				comma = ",";
			}

			// Close the parameter list.
			sSig.append("):");

			// Add the fully qualified version of the return type
			String rType = decodeJdtSource(method.getReturnType(), method.getDeclaringType());
			sSig.append(rType);
			return sSig.toString();
		} catch (JavaModelException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static String decodeJdtSource(String pt, IType container) throws JavaModelException {
		String readable = Signature.toString(pt);
		String readableWithoutArray = readable.replace("[", "").replace("]", "");
		String[][] resolved = container.resolveType(readableWithoutArray);

		if (resolved == null) {
			return readable;
		} else {
			String result = ("".equals(resolved[0][0])) ? resolved[0][1] : resolved[0][0] + "." + resolved[0][1];
			int bracketNum = (readable.length() - readableWithoutArray.length()) / 2;
			for (int i = 0; i < bracketNum; ++i) {
				result += "[]";
			}
			return result;
		}
	}

	public static String getJavaElemType(int type) {
		return elementTypes[type] == null ? "null" : elementTypes[type];
	}

	public static String getDeltaKind(int type) {
		return deltaTypes[type] == null ? "null" : deltaTypes[type];
	}
	
	public static long classesLastModificationTime(Collection<IJavaProject> projects) {
		long result = -1l;
		for (IJavaProject project : projects) {
			long ts = calcLastMod(project);
			if (ts > result) {
				result = ts;
			}
		}
		return result;
	}

	/**
	 * Calculates the last modification time of a Java project.
	 * 
	 * @return
	 */
	public static long calcLastMod(IJavaProject project) {
		try {
			List<ICompilationUnit> cus = JdtModelWalker.allCompilationUnitsIn(project);
			long maxTs = -1l;
			for (ICompilationUnit cu : cus) {
				if (cu.getResource() == null) {
					System.err.println("Resource not found for compilation unit: " + cu + ".");
				} else {
					long cuts = cu.getResource().getModificationStamp();
					if (cuts > maxTs) {
						maxTs = cuts;
					}
				}
			}
			return maxTs;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

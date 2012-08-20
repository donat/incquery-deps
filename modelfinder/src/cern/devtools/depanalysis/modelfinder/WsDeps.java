package cern.devtools.depanalysis.modelfinder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageDeclaration;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;

import cern.devtools.depanalysis.wsmodel.DependencyType;
import cern.devtools.depanalysis.wsmodel.NamedElement;

public class WsDeps {

	private static final SearchEngine engine = new SearchEngine();

	public static void searchAndInsertOutgoingDependencies(IJavaElement elem, WsBuildPrimitives buildPrimitives) {
		try {
			if (elem instanceof IMethod) {
				// Handle METHOD REFERENCE dependencies.
				for (IMethod referencedMethod : findCalledMethods((IMethod) elem)) {
					if (!elem.getJavaProject().equals(referencedMethod.getJavaProject())) {
						buildPrimitives.createDependency(DependencyType.METHOD_CALL, elem, referencedMethod);
					}

				}

				// Handle OVERRIDED METHOD dependencies.
				for (IMethod overridedMethod : findOverridenMethods((IMethod) elem)) {
					if (!elem.getJavaProject().equals(overridedMethod.getJavaProject())) {
						buildPrimitives.createDependency(DependencyType.METHOD_OVERRIDE, elem, overridedMethod);
					}
				}

				// Handle CLASS USAGE dependencies.
				for (IType usedClass : findClassUsages((IMethod) elem)) {
					if (!elem.getJavaProject().equals(usedClass.getJavaProject())) {
						buildPrimitives.createDependency(DependencyType.CLASS_USAGE, elem, usedClass);
					}
				}

				// Handle FIELD ACCESS dependencies.
				for (IField referencedField : findReferencedField((IMethod) elem)) {
					if (!elem.getJavaProject().equals(referencedField.getJavaProject())) {
						buildPrimitives.createDependency(DependencyType.FIELD_ACCESS, elem, referencedField);
					}
				}
			}

			/* else */if (elem instanceof IType) {
				// Handle Inheritance dependencies.
				for (IType superType : findSupertypes((IType) elem)) {
					if (!elem.getJavaProject().equals(superType.getJavaProject())) {

						NamedElement emfElem = buildPrimitives.findJdtElementInEmfModel(elem);
						NamedElement emfSuperType = buildPrimitives.findJdtElementInEmfModel(superType);
						if (emfElem != null && emfSuperType != null)
							buildPrimitives.createDependency(emfElem, emfSuperType, DependencyType.INHERITANCE);
					}
				}
			}
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}

	private static List<IType> findSupertypes(IType elem) throws CoreException {
		ITypeHierarchy hierarchy = elem.newTypeHierarchy(new NullProgressMonitor());
		return Arrays.asList(hierarchy.getSupertypes(elem));
	}

	private static List<IMethod> findCalledMethods(final IMethod method) throws CoreException {
		final List<IMethod> result = new LinkedList<IMethod>();
		final boolean[] finished = { false };
		SearchRequestor requestor = new SearchRequestor() {

			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				Object mo = match.getElement();
				if (mo == null) {
					return;
				} else if (mo instanceof IMethod) {
					// Remove unnecessary results (the items from the java.*
					// package).
					IMethod method = (IMethod) mo;
					ICompilationUnit cu = method.getCompilationUnit();
					if (cu != null) {
						IPackageDeclaration[] packages = cu.getPackageDeclarations();
						if (packages != null && packages.length > 0 && packages[0].getElementName().startsWith("java.")) {
							return;
						}
					}

					result.add((IMethod) mo);

				} else {
					System.err.println("Wrong type item added.");
					System.err.println("From: " + method);
					System.err.println("To:   " + mo);
				}
			}

			@Override
			public void endReporting() {
				finished[0] = true;
			}
		};

		engine.searchDeclarationsOfSentMessages(method, requestor, new NullProgressMonitor());

		while (finished[0] == false) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	private static List<IMethod> findOverridenMethods(final IMethod method) throws CoreException {
		List<IMethod> result = new LinkedList<IMethod>();

		// Find supertypes
		ITypeHierarchy hierarchy = method.getDeclaringType().newTypeHierarchy(new NullProgressMonitor());

		List<IType> superTypes = Arrays.asList(hierarchy.getSupertypes(method.getDeclaringType()));
		for (IType superType : superTypes) {
			for (IMethod superMethod : superType.getMethods()) {
				if (methodsHasSameSignature(superMethod, method)) {
					result.add(superMethod);
				}
			}
		}
		return result;
	}

	private static boolean methodsHasSameSignature(IMethod m1, IMethod m2) {
		boolean same = m1.getElementName().equals(m2.getElementName());
		same &= m1.getParameterTypes().length == m2.getParameterTypes().length;
		if (!same) {
			return false;
		}
		for (int i = 0; i < m1.getParameterTypes().length; ++i) {
			same &= m1.getParameterTypes()[i].equals(m2.getParameterTypes()[i]);
		}

		return same;
	}

	private static List<IType> findClassUsages(final IMethod method) throws CoreException {
		final List<IType> result = new LinkedList<IType>();
		final boolean[] finished = { false };
		SearchRequestor requestor = new SearchRequestor() {

			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				Object mo = match.getElement();
				if (mo == null) {
					return;
				} else if (mo instanceof IType) {
					// Remove unnecessary results (the items from the java.*
					// package).
					result.add((IType) mo);

				} else {
					System.err.println("Wrong type item added..");
					System.err.println("From: " + method);
					System.err.println("To:   " + mo);
				}
			}

			@Override
			public void endReporting() {
				finished[0] = true;
			}
		};

		engine.searchDeclarationsOfReferencedTypes(method, requestor, new NullProgressMonitor());
		return result;
	}

	private static List<IField> findReferencedField(final IMethod elem) throws CoreException {
		final List<IField> result = new LinkedList<IField>();
		final boolean[] finished = { false };
		SearchRequestor requestor = new SearchRequestor() {

			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				Object mo = match.getElement();
				if (mo == null) {
					return;
				} else if (mo instanceof IField) {
					// Remove unnecessary results (the items from the java.*
					// package).
					result.add((IField) mo);

				} else {
					System.err.println("Wrong type item added..");
					System.err.println("From: " + elem);
					System.err.println("To:   " + mo);
				}
			}

			@Override
			public void endReporting() {
				finished[0] = true;
			}
		};

		engine.searchDeclarationsOfAccessedFields(elem, requestor, new NullProgressMonitor());
		return result;
	}
}

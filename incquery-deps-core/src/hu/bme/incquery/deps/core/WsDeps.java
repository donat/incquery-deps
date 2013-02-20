package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WDependencyType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageDeclaration;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;

public class WsDeps {

//	private final SearchEngine engine = new SearchEngine();
//
//	private final List<IMethod> methods = new LinkedList<IMethod>();
//	private final List<IType> types = new LinkedList<IType>();
//
//	private AtomicLong finishedSearchRequestors = new AtomicLong(0);
//
//	private final WsBuildPrimitives buildPrimitives;
//
//	public WsDeps(WsBuildPrimitives buildPrimitives) {
//		this.buildPrimitives = buildPrimitives;
//	}
//
//	public void addMethodToSearch(IMethod method) {
//		methods.add(method);
//	}
//
//	public void addTypeToSearch(IType type) {
//		types.add(type);
//	}
//
//	public void addElementToSearch(IJavaElement elem) {
//		if (elem instanceof IType) {
//			types.add((IType) elem);
//		} else if (elem instanceof IMethod) {
//			methods.add((IMethod) elem);
//		} else {
//			throw new RuntimeException("unsupported type: " + elem.getClass());
//		}
//	}
//
//	/**
//	 * Entry point for searching
//	 * 
//	 */
//	public void execute() {
//		executeEasySearches();
//		executeSearchEngineBasedSearches();
//	}
//
//	/**
//	 * Handles method override.
//	 */
//	private void executeEasySearches() {
//
//		// 1. Find overriden methods.
//		for (IMethod method : methods) {
//			try {
//				findOverridenMethods(method);
//			} catch (CoreException e) {
//				e.printStackTrace();
//			}
//		}
//
//		// 2. Find supertypes
//		for (IType type : types) {
//			try {
//				findSupertypes(type);
//			} catch (CoreException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//	private void findOverridenMethods(final IMethod method) throws CoreException {
//		ITypeHierarchy hierarchy = method.getDeclaringType().newTypeHierarchy(new NullProgressMonitor());
//
//		List<IType> superTypes = Arrays.asList(hierarchy.getSupertypes(method.getDeclaringType()));
//		for (IType superType : superTypes) {
//			for (IMethod superMethod : superType.getMethods()) {
//				if (methodsHasSameSignature(superMethod, method)) {
//					buildPrimitives.createDependency(WDependencyType.METHOD_OVERRIDE, method, superMethod);
//				}
//			}
//		}
//	}
//
//	private void findSupertypes(IType elem) throws CoreException {
//		ITypeHierarchy hierarchy = elem.newTypeHierarchy(new NullProgressMonitor());
//		for (IType superType : hierarchy.getSupertypes(elem)) {
//			buildPrimitives.createDependency(WDependencyType.INHERITANCE, elem, superType);
//		}
//	}
//
//	/**
//	 * Handles: method call, class usage
//	 */
//	private void executeSearchEngineBasedSearches() {
//
//		// 1. Method call
//		// SearchEngine engine = new SearchEngine();
//		Map<IMethod, SearchRequestor> methodRequestors = createMethodCallFinders();
//		for (IMethod m : methodRequestors.keySet()) {
//			try {
//				engine.searchDeclarationsOfSentMessages(m, methodRequestors.get(m), new NullProgressMonitor());
//			} catch (JavaModelException e) {
//				e.printStackTrace();
//			}
//		}
//
//		// 2. Class usage
//		methodRequestors = createClassUsageFinders();
//		for (IMethod m : methodRequestors.keySet()) {
//			try {
//				engine.searchDeclarationsOfReferencedTypes(m, methodRequestors.get(m), new NullProgressMonitor());
//			} catch (JavaModelException e) {
//				e.printStackTrace();
//			}
//		}
//
//		// 3. Field reference
//		methodRequestors = createFieldRefsFinders();
//		for (IMethod m : methodRequestors.keySet()) {
//			try {
//				engine.searchDeclarationsOfAccessedFields(m, methodRequestors.get(m), new NullProgressMonitor());
//			} catch (JavaModelException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//	private final Map<IMethod, SearchRequestor> createMethodCallFinders() {
//		Map<IMethod, SearchRequestor> result = new HashMap<IMethod, SearchRequestor>();
//		for (IMethod method : methods) {
//			result.put(method, methodCallFinders(method));
//		}
//
//		return result;
//	}
//
//	private final Map<IMethod, SearchRequestor> createClassUsageFinders() {
//		Map<IMethod, SearchRequestor> result = new HashMap<IMethod, SearchRequestor>();
//		for (IMethod method : methods) {
//			result.put(method, classUsageFinders(method));
//		}
//
//		return result;
//	}
//
//	private final Map<IMethod, SearchRequestor> createFieldRefsFinders() {
//		Map<IMethod, SearchRequestor> result = new HashMap<IMethod, SearchRequestor>();
//		for (IMethod method : methods) {
//			result.put(method, fieldReferenceFinders(method));
//		}
//
//		return result;
//	}
//
//	private SearchRequestor methodCallFinders(final IMethod searchedMethod) {
//		SearchRequestor requestor = new SearchRequestor() {
//
//			@Override
//			public void acceptSearchMatch(SearchMatch match) throws CoreException {
//				Object mo = match.getElement();
//				if (mo == null) {
//					return;
//				} else if (mo instanceof IMethod) {
//					// Remove unnecessary results (the items from the java.*
//					// package).
//					IMethod method = (IMethod) mo;
//					ICompilationUnit cu = method.getCompilationUnit();
//					if (cu != null) {
//						IPackageDeclaration[] packages = cu.getPackageDeclarations();
//						if (packages != null && packages.length > 0 && packages[0].getElementName().startsWith("java.")) {
//							return;
//						}
//					}
//
//					buildPrimitives.createDependency(WDependencyType.METHOD_CALL, searchedMethod, (IMethod) mo);
//
//				} else {
//					System.err.println("Wrong type item added.");
//					System.err.println("From: " + searchedMethod);
//					System.err.println("To:   " + mo);
//				}
//			}
//
//			@Override
//			public void endReporting() {
//				finishedSearchRequestors.incrementAndGet();
//			}
//		};
//
//		return requestor;
//	}
//
//	private SearchRequestor classUsageFinders(final IMethod searchedMethod) {
//		SearchRequestor requestor = new SearchRequestor() {
//
//			@Override
//			public void acceptSearchMatch(SearchMatch match) throws CoreException {
//				Object mo = match.getElement();
//				if (mo == null) {
//					return;
//				} else if (mo instanceof IType) {
//					// Remove unnecessary results (the items from the java.*
//					// package).
//					buildPrimitives.createDependency(WDependencyType.CLASS_USAGE, searchedMethod, (IType) mo);
//
//				} else {
//					System.err.println("Wrong type item added..");
//					System.err.println("From: " + searchedMethod);
//					System.err.println("To:   " + mo);
//				}
//			}
//		};
//		return requestor;
//	}
//
//	private SearchRequestor fieldReferenceFinders(final IMethod searchedMethod) {
//		SearchRequestor requestor = new SearchRequestor() {
//
//			@Override
//			public void acceptSearchMatch(SearchMatch match) throws CoreException {
//				Object mo = match.getElement();
//				if (mo == null) {
//					return;
//				} else if (mo instanceof IField) {
//					// Remove unnecessary results (the items from the java.*
//					// package).
//					buildPrimitives.createDependency(WDependencyType.FIELD_ACCESS, searchedMethod, (IField) mo);
//				} else {
//					System.err.println("Wrong type item added..");
//					System.err.println("From: " + searchedMethod);
//					System.err.println("To:   " + mo);
//				}
//			}
//		};
//
//		return requestor;
//	}
//
//	private static boolean methodsHasSameSignature(IMethod m1, IMethod m2) {
//		boolean same = m1.getElementName().equals(m2.getElementName());
//		same &= m1.getParameterTypes().length == m2.getParameterTypes().length;
//		if (!same) {
//			return false;
//		}
//		for (int i = 0; i < m1.getParameterTypes().length; ++i) {
//			same &= m1.getParameterTypes()[i].equals(m2.getParameterTypes()[i]);
//		}
//
//		return same;
//	}
}

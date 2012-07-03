/*
 * File EmfDependencyBuilderVisitor.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jun 24, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder.simplevisitors;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;

import cern.devtools.depanalysis.javamodel.Dependency;
import cern.devtools.depanalysis.javamodel.DependencyType;
import cern.devtools.depanalysis.javamodel.JavaModelFactory;
import cern.devtools.depanalysis.javamodel.NamedElement;
import cern.devtools.depanalysis.javamodel.Workspace;
import cern.devtools.depanalysis.modelfinder.structurals.ClassWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.FieldWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.MethodWrapper;
import cern.devtools.depanalysis.modelfinder.structurals.VisitorFailure;

public class EmfDependencyAdder extends Identity {

	public static EmfDependencyAdder newInstance(Workspace workspace) {
		return new EmfDependencyAdder(workspace);
	}

	private static List<IType> findSupertypesFor(IType type) throws JavaModelException {
		ITypeHierarchy hierarchy = type.newTypeHierarchy(new NullProgressMonitor());
		return Arrays.asList(hierarchy.getSupertypes(type));
	}

	private final Workspace workspace;

	private EmfDependencyAdder(Workspace workspace) {
		this.workspace = workspace;
	}
	
	@Override
	public void visitField(FieldWrapper jdtFieldWrapper) {
		try {
			IField jdtField = jdtFieldWrapper.wrappedItem();
			findFieldReferenceDependencies(jdtField);
		} catch (CoreException e) {
			throw new VisitorFailure(e);
		}
	}
	

	private void findFieldReferenceDependencies(final IField jdtField) throws CoreException {
		SearchPattern pattern = SearchPattern.createPattern(jdtField, IJavaSearchConstants.REFERENCES);
		SearchEngine engine = new SearchEngine();
		IJavaSearchScope scope = SearchEngine.createWorkspaceScope();
		SearchRequestor requestor = new SearchRequestor() {

			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				// Search from container element.
				IType jdtFrom = null;
				Object found = match.getElement();
				if (found instanceof IMethod) {
					jdtFrom = ((IMethod) found).getDeclaringType();
				} else {
					return;
					//throw new RuntimeException("Unexpected element referencing a field: " + found.getClass());
				}

				createDependency(jdtFrom.getHandleIdentifier(), jdtField.getHandleIdentifier(),
						DependencyType.FIELD_ACCESS);

			}
		};
		engine.search(pattern, new SearchParticipant[] { SearchEngine.getDefaultSearchParticipant() }, scope,
				requestor, null);
	}

	@Override
	public void visitClass(ClassWrapper jdtTypeWrapper) {
		try {
			IType jdtType = jdtTypeWrapper.wrappedItem();
			findClassUsageDependencies(jdtType);
			findInheritanceDependencies(jdtType);

		} catch (Exception e) {
			throw new VisitorFailure(e);
		}
	}

	@Override
	public void visitMethod(MethodWrapper jdtMethodWrapper) {
		try {
			IMethod jdtMethod = jdtMethodWrapper.wrappedItem();
			findMethodCallDependencies(jdtMethod);
			findMethodOverrideDependencies(jdtMethod);
		} catch (Exception e) {
			throw new VisitorFailure(e);
		}
	}

	private void findMethodOverrideDependencies(IMethod jdtMethod) throws JavaModelException {
		List<IType> superTypes = findSupertypesFor(jdtMethod.getDeclaringType());
		for (IType superType : superTypes) {
			for (IMethod superMethod : superType.getMethods()) {
				if (methodsHasSameSignature(superMethod, jdtMethod)) {
					createDependency(jdtMethod.getHandleIdentifier(), superMethod.getHandleIdentifier(),
							DependencyType.METHOD_OVERRIDE);
				}

			}
		}

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

	private void findMethodCallDependencies(final IMethod jdtMethod) throws CoreException {

		SearchPattern pattern = SearchPattern.createPattern(jdtMethod, IJavaSearchConstants.REFERENCES);
		SearchEngine engine = new SearchEngine();
		IJavaSearchScope scope = SearchEngine.createWorkspaceScope();
		SearchRequestor requestor = new SearchRequestor() {

			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				// Search from container element.
				IMethod jdtFrom = null;
				Object found = match.getElement();
				if (found instanceof IMethod) {
					jdtFrom = (IMethod) found;
				}

				if (jdtFrom == null) {
					return;
				}

				createDependency(jdtFrom.getHandleIdentifier(), jdtMethod.getHandleIdentifier(),
						DependencyType.METHOD_CALL);

			}
		};
		engine.search(pattern, new SearchParticipant[] { SearchEngine.getDefaultSearchParticipant() }, scope,
				requestor, null);
	}

	private void createDependency(NamedElement emfFrom, NamedElement emfTo, DependencyType type) {
		if (dependencyExists(emfFrom, emfTo, type)) {
			return;
		}

		Dependency d = JavaModelFactory.eINSTANCE.createDependency();
		d.setType(type);
		d.setFrom(emfFrom);
		d.setTo(emfTo);
		workspace.getDependencties().add(d);
	}

	private void createDependency(String fromJdtHandle, String toJdtJandle, DependencyType type) {
		NamedElement emfFrom = workspace.findElementByHandle(fromJdtHandle);
		NamedElement emfTo = workspace.findElementByHandle(toJdtJandle);
		if (emfFrom != null && emfTo != null) {
			createDependency(emfFrom, emfTo, type);
		}

		
	}

	private boolean dependencyExists(NamedElement emfFrom, NamedElement emfTo, DependencyType type) {
		for (Dependency d : emfFrom.getOutgoingDependencies()) {
			if (d.getTo().equals(emfTo) && d.getType().equals(type)) {
				return true;
			}
		}
		return false;
	}

	private void findClassUsageDependencies(final IType jdtType) throws CoreException {
		SearchPattern pattern = SearchPattern.createPattern(jdtType, IJavaSearchConstants.REFERENCES);
		SearchEngine engine = new SearchEngine();
		IJavaSearchScope scope = SearchEngine.createWorkspaceScope();
		SearchRequestor requestor = new SearchRequestor() {

			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				// Search from container element.
				IType jdtFrom = null;
				Object found = match.getElement();
				if (found instanceof IType) {
					jdtFrom = (IType) found;
				} else if (found instanceof IMethod) {
					jdtFrom = ((IMethod) found).getDeclaringType();
				} else if (found instanceof IField) {
					jdtFrom = ((IField) found).getDeclaringType();
				}

				if (jdtFrom == null) {
					return;
				}

				createDependency(jdtFrom.getHandleIdentifier(), jdtType.getHandleIdentifier(),
						DependencyType.CLASS_USAGE);

			}
		};
		engine.search(pattern, new SearchParticipant[] { SearchEngine.getDefaultSearchParticipant() }, scope,
				requestor, null);
	}

	private void findInheritanceDependencies(IType jdtType) throws JavaModelException {
		List<IType> superTypes = findSupertypesFor(jdtType);

		for (IType superIType : superTypes) {
			String typeHandle = jdtType.getHandleIdentifier();
			String superTypeHandle = superIType.getHandleIdentifier();
			NamedElement emfFrom = workspace.findElementByHandle(typeHandle);
			NamedElement emfTo = workspace.findElementByHandle(superTypeHandle);
			if (emfTo != null) {
				createDependency(emfFrom, emfTo, DependencyType.INHERITANCE);
			}
		}
	}
}

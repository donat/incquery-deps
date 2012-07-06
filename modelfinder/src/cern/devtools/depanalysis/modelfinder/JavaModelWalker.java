/*
 * File JavaModelWalker.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 4, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;

public class JavaModelWalker {

	public static List<IJavaProject> childrenOf(IWorkspaceRoot root) throws CoreException {
		List<IJavaProject> result = new LinkedList<IJavaProject>();

		IProject[] projects = root.getProjects();
		for (IProject project : projects) {
			if (project.exists() && project.isOpen() && project.isNatureEnabled("org.eclipse.jdt.core.javanature")) {
				IJavaProject javaProject = JavaCore.create(project);
				result.add(javaProject);
			}
		}
		return result;
	}

	public static List<IPackageFragment> childrenOf(IJavaProject project) throws CoreException {
		List<IPackageFragment> result = new LinkedList<IPackageFragment>();
		for (IPackageFragment pkg : project.getPackageFragments()) {
			if (pkg.getKind() == IPackageFragmentRoot.K_SOURCE) {
				result.add(pkg);
			}
		}
		return result;
	}

	public static List<IType> childrenOf(IPackageFragment pkg) throws CoreException {
		List<IType> result = new LinkedList<IType>();
		for (ICompilationUnit cu : pkg.getCompilationUnits()) {
			for (IType type : cu.getAllTypes()) {
				result.add(type);
			}
		}
		return result;
	}

	public static List<IType> childrenOf(ICompilationUnit cu) throws CoreException {
		List<IType> result = new LinkedList<IType>();
		for (IType type : cu.getAllTypes()) {
			result.add(type);
		}
		return result;
	}

	public static List<IJavaElement> childrenOf(IType type) throws CoreException {
		List<IJavaElement> result = new LinkedList<IJavaElement>();
		for (IMethod method : type.getMethods()) {
			result.add(method);
		}
		for (IField jdtField : type.getFields()) {
			result.add(jdtField);
		}
		return result;
	}
	
	public static List<IJavaElement> methodsOf(IType type) throws CoreException {
		List<IJavaElement> result = new LinkedList<IJavaElement>();
		for (IMethod method : type.getMethods()) {
			result.add(method);
		}
		return result;
	}

	public static List<IJavaElement> allElements(IWorkspaceRoot root) throws CoreException {
		List<IJavaElement> result = new LinkedList<IJavaElement>();
		List<IJavaProject> projects = childrenOf(root);
		result.addAll(projects);
		for (IJavaProject project : projects) {
			List<IPackageFragment> packages = childrenOf(project);
			result.addAll(packages);
			for (IPackageFragment pkg : packages) {
				List<IType> types = childrenOf(pkg);
				result.addAll(types);
				for (IType type : types) {
					List<IJavaElement> methodOrField = childrenOf(type);
					result.addAll(methodOrField);
				}

			}
		}
		return result;
	}

	/**
	 * Returns all contained items which maybe have dependencies.
	 * 
	 * @return
	 */
	public static List<IJavaElement> allUpdatableIn(ICompilationUnit cu) throws CoreException {
		List<IJavaElement> result = new LinkedList<IJavaElement>();
		List<IType> types = childrenOf(cu);
		result.addAll(types);
		for (IType type : types) {
			List<IJavaElement> methods = methodsOf(type);
			result.addAll( methods);
		}
		return result;
	}
}

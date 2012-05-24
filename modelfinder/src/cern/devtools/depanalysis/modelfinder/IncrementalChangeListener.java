/*
 * File IncrementalChangeListener.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at 24 May 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import cern.devtools.depanalysis.javamodel.ApiClass;
import cern.devtools.depanalysis.javamodel.Field;
import cern.devtools.depanalysis.javamodel.JavaModelFactory;
import cern.devtools.depanalysis.javamodel.Method;
import cern.devtools.depanalysis.javamodel.Package;
import cern.devtools.depanalysis.javamodel.Project;
import cern.devtools.depanalysis.javamodel.Workspace;

public class IncrementalChangeListener implements IElementChangedListener {
	Workspace workspace;

	public IncrementalChangeListener() {
		reset();
	}

	@Override
	public void elementChanged(ElementChangedEvent event) {
		IJavaElementDelta delta = event.getDelta();
		traverseJavaModelRecursive(delta);
		printModel();
	}

	public void reset() {
		try {
			// Initialise the model object
			workspace = JavaModelFactory.eINSTANCE.createWorkspace();
			// load existing project information from the workspace
			loadInitialState();
			// print the initial state
			printModel();
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}

	private void loadInitialState() throws CoreException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject[] projects = root.getProjects();

		for (IProject project : projects) {
			if (project.exists() && project.isOpen() && project.isNatureEnabled("org.eclipse.jdt.core.javanature")) {
				addProject(project);
			}
		}
	}

	private void traverseJavaModelRecursive(IJavaElementDelta elem) {
		switch (elem.getKind()) {
		case IJavaElementDelta.ADDED:
			addJavaElement(elem.getElement());
			break;
		case IJavaElementDelta.REMOVED:
			removeJavaElement(elem.getElement());
			break;
		case IJavaElementDelta.CHANGED:
			updateJavaElement(elem.getMovedFromElement(), elem.getMovedToElement());
			break;
		default:

		}

		for (IJavaElementDelta child : elem.getAffectedChildren()) {
			traverseJavaModelRecursive(child);
		}
	}

	

	private void addJavaElement(IJavaElement elem) {
		try {
			if (elem instanceof IJavaProject) {
				addProject(((IJavaProject) elem).getProject());
			}
			else if (elem instanceof IPackageFragment) {
				IPackageFragment pkg = (IPackageFragment) elem;
				if (pkg.getKind() == IPackageFragmentRoot.K_SOURCE) {
					addPackage(pkg);
				}
				
			}
		} catch (JavaModelException e) {
			throw new RuntimeException(e);
		}
	}

	private void removeJavaElement(IJavaElement elem) {
		if (elem instanceof IJavaProject) {
			removeProject(((IJavaProject) elem).getProject());
			// TODO Auto-generated catch block
		}
	}
	
	private void updateJavaElement(IJavaElement from, IJavaElement to) {
		if (from instanceof IJavaProject) {
			updateProject((IJavaProject)from, (IJavaProject)to);
		}
	}

	private void addProject(IProject project) throws JavaModelException {
		Project p = JavaModelFactory.eINSTANCE.createProject();
		p.setName(project.getName());
		this.workspace.getProjects().add(p);
		IJavaProject javaProject = JavaCore.create(project);
		addAllPackages(javaProject, p);
	}
	
	private void addPackage(IPackageFragment pkg) {
		Project p = findProject(pkg.getJavaProject().getElementName());
		Package npkg = JavaModelFactory.eINSTANCE.createPackage();
		npkg.setName(pkg.getElementName());
		p.getPackages().add(npkg);
	}
	
	private Project findProject(String name) {
		Iterator<Project> iter = workspace.getProjects().iterator();
		while (iter.hasNext()) {
			Project p = iter.next();
			if (p.getName().equals(name)) {
				return p;
			}
		}
		
		return null; 
	}

	private void removeProject(IProject project) {
		Project p = findProject(project.getName());
		workspace.getProjects().remove(p);
	}
	
	private void updateProject(IJavaProject from, IJavaProject to) {
		Project p = findProject(from.getElementName());
		p.setName(to.getElementName());
	}

	private void addAllPackages(IJavaProject jdtProject, Project emfProject) throws JavaModelException {
		for (IPackageFragment p : jdtProject.getPackageFragments()) {
			if (p.getKind() == IPackageFragmentRoot.K_SOURCE) {
				Package np = JavaModelFactory.eINSTANCE.createPackage();
				np.setName(p.getElementName());
				emfProject.getPackages().add(np);
				addAllClasses(p, np);
			}
		}
	}

	private void addAllClasses(IPackageFragment jdtPackage, Package emfPackage) throws JavaModelException {
		for (ICompilationUnit cu : jdtPackage.getCompilationUnits()) {
			IType[] types = cu.getTypes();
			for (IType t : types) {
				ApiClass ac = JavaModelFactory.eINSTANCE.createApiClass();
				ac.setName(t.getElementName());
				emfPackage.getClasses().add(ac);
				addAllMethodsAndFields(t, ac);
			}
		}
	}

	private void addAllMethodsAndFields(IType jdtClass, ApiClass emfClass) throws JavaModelException {
		for (IMethod im : jdtClass.getMethods()) {
			Method m = JavaModelFactory.eINSTANCE.createMethod();
			m.setSignature(emfClass.getName() + "#" + im.getElementName() + im.getSignature());
			emfClass.getMethods().add(m);
		}
		for (IField ifi : jdtClass.getFields()) {
			Field f = JavaModelFactory.eINSTANCE.createField();
			f.setName(emfClass.getName() + "." + ifi.getElementName());
			emfClass.getFields().add(f);
		}
	}

	private void printModel() {
		System.out.println("-- workspace structure --");
		for (Project p : workspace.getProjects()) {
			System.out.println(p);
			for (Package pkg : p.getPackages()) {
				System.out.println("\t" + pkg);

				for (ApiClass ac : pkg.getClasses()) {
					System.out.println("\t\t" + ac);
					for (Method m : ac.getMethods()) {
						System.out.println("\t\t\t" + m);
					}
					for (Field f : ac.getFields()) {
						System.out.println("\t\t\t" + f);
					}
				}
			}
		}
	}
}

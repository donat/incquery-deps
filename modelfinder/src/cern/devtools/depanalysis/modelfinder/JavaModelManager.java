/*
 * File JavaModelManager.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at 22 May 2012.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
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
import cern.devtools.depanalysis.javamodel.Project;
import cern.devtools.depanalysis.javamodel.Workspace;

public class JavaModelManager {

	private Workspace workspace;
	
	private List<ModelChangeListener> listeners = new LinkedList<ModelChangeListener>();

	public static JavaModelManager INSTANCE = new JavaModelManager();

	private JavaModelManager() {
		
	}
	
	/**
	 * First attempt: ignore the delta information and recreate the entire domain model every time when the java model changes.
	 * 
	 * @param event
	 * @throws CoreException
	 */
	public void update(ElementChangedEvent event) throws CoreException {
		// new model root
		this.workspace = JavaModelFactory.eINSTANCE.createWorkspace();
		
		//
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject[] projects = root.getProjects();

		for (IProject project : projects) {
			if (project.exists() && project.isOpen() && project.isNatureEnabled("org.eclipse.jdt.core.javanature")) {
				addNewProject(project);
			}

		}

		notifyListeners();
	}
	
	private void notifyListeners() {
		for (ModelChangeListener l : listeners) {
			l.workspaceChanged(workspace);
		}
		
	}

	public void addModelChangeListener(ModelChangeListener listener) {
		listeners.add(listener);
	}
	public void removeModelChangeListener(ModelChangeListener listener) {
		listeners.remove(listener);
	}
	

	private void addNewProject(IProject project) throws JavaModelException {
		Project p = JavaModelFactory.eINSTANCE.createProject();
		p.setName(project.getName());
		this.workspace.getProjects().add(p);
		IJavaProject javaProject = JavaCore.create(project);
		addClasses(javaProject, p);
	}

	private void addClasses(IJavaProject jdtProject, Project emfProject) throws JavaModelException {
		for (IPackageFragment p : jdtProject.getPackageFragments()) {
			if (p.getKind() == IPackageFragmentRoot.K_SOURCE) {
				for (ICompilationUnit cu : p.getCompilationUnits()) {
					
					IType[] types = cu.getTypes();
					for (IType t : types) {
						ApiClass ac = JavaModelFactory.eINSTANCE.createApiClass();
						ac.setName(t.getFullyQualifiedName());
						emfProject.getClasses().add(ac);
						addMethodsAndFields(t, ac);
					}
				}
			}
		}
	}

	private void addMethodsAndFields(IType jdtClass, ApiClass emfClass) throws JavaModelException {
		for (IMethod im : jdtClass.getMethods()) {
			Method m = JavaModelFactory.eINSTANCE.createMethod();
			m.setSignature(emfClass.getName() + "#" +im.getElementName() +  im.getSignature());
			emfClass.getMethods().add(m);
		}
		for (IField ifi : jdtClass.getFields()) {
			Field f = JavaModelFactory.eINSTANCE.createField();
			f.setName(emfClass.getName() + "." + ifi.getElementName());
			emfClass.getFields().add(f);
		}
	}
}

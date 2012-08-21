/*
 * File WsBuildPrimitives.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Aug 6, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;

import cern.devtools.depanalysis.wsmodel.Dependency;
import cern.devtools.depanalysis.wsmodel.DependencyType;
import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
import cern.devtools.depanalysis.wsmodel.JavaModelFactory;
import cern.devtools.depanalysis.wsmodel.JavaProject;
import cern.devtools.depanalysis.wsmodel.NamedElement;

public class WsBuildPrimitives {

	private final EclipseWorkspace workspace;

	public WsBuildPrimitives(EclipseWorkspace workspace) {
		this.workspace = workspace;
	}

	public JavaProject addProject(IJavaProject jdtProject) {
		// Create the instance and set the properties.
		JavaProject p = JavaModelFactory.eINSTANCE.createJavaProject();
		p.setName(jdtProject.getElementName());
		p.setHandler(jdtProject.getHandleIdentifier());

		// Put it into the root objects.
		workspace.getProjects().add(p);

		// Add to the all elements list.
		workspace.getElements().add(p);

		return p;
	}

	public NamedElement addNamedElement(NamedElement container, IJavaElement jdtItem) {
		NamedElement elem = null;

		if (jdtItem instanceof IJavaProject) {
			elem = JavaModelFactory.eINSTANCE.createJavaProject();
		} else if (jdtItem instanceof IPackageFragmentRoot) {
			elem = JavaModelFactory.eINSTANCE.createPackageFragmentRoot();
		} else if (jdtItem instanceof IPackageFragment) {
			elem = JavaModelFactory.eINSTANCE.createPackageFragment();
		} else if (jdtItem instanceof ICompilationUnit) {
			elem = JavaModelFactory.eINSTANCE.createCompilationUnit();
		} else if (jdtItem instanceof IType) {
			elem = JavaModelFactory.eINSTANCE.createType();
		} else if (jdtItem instanceof IMethod) {
			elem = JavaModelFactory.eINSTANCE.createMethod();
		} else if (jdtItem instanceof IField) {
			elem = JavaModelFactory.eINSTANCE.createField();
		} else {
			throw new RuntimeException("Unsupported type");
		}

		elem.setName(jdtItem.getElementName());
		elem.setHandler(jdtItem.getHandleIdentifier());
		elem.setParent(container);

		workspace.getElements().add(elem);
		if (container != null) {
			container.addChild(elem);
		}
		// Only happens if the container is the Workspace itself.
		else {
			workspace.getProjects().add((JavaProject) elem);
		}

		return elem;
	}

	public Dependency createDependency(DependencyType type, IJavaElement from, IJavaElement to) {
		NamedElement emfFrom = findJdtElementInEmfModel(from);
		NamedElement emfTo = findJdtElementInEmfModel(to);
		if (emfFrom != null && emfTo != null) {
			return createDependency(emfFrom, emfTo, type);
		} else
			return null;
	}

	public Dependency createDependency(NamedElement from, NamedElement to, DependencyType type) {
		if (dependencyExists(from, to, type)) {
			return null;
		}

		Dependency d = JavaModelFactory.eINSTANCE.createDependency();
		d.setType(type);
		d.setFrom(from);
		d.setTo(to);
		workspace.getDependencties().add(d);
		return d;
	}

	private static boolean dependencyExists(NamedElement emfFrom, NamedElement emfTo, DependencyType type) {
		for (Dependency d : emfFrom.getOutgoingDependencies()) {
			if (d.getTo().equals(emfTo) && d.getType().equals(type)) {
				return true;
			}
		}
		return false;
	}

	public void moveItemToNewParent(EclipseWorkspace oldWorkspace, NamedElement newContainer, NamedElement itemToMove) {
		oldWorkspace.getElements().remove(itemToMove);
		itemToMove.setParent(newContainer);
		workspace.getElements().add(itemToMove);
		for (Object childObject : itemToMove.getChildren()) {
			NamedElement child = (NamedElement) childObject;
			moveItemToNewParent(oldWorkspace, itemToMove, child);
		}
	}

	public void removeNamedElement(IJavaElement elemToDelete) {
		NamedElement emfToDel = findJdtElementInEmfModel(elemToDelete);
		if (emfToDel != null)
			removeNamedElement(emfToDel);
		else {
			System.out.println("Could not delete: " + elemToDelete);
		}
	}

	private void removeNamedElement(NamedElement ne) {
		// Delete children.
		List<Object> children = new LinkedList<Object>();
		for (Object child : ne.getChildren()) {
			children.add(child);
		}

		for (Object child : children) {
			removeNamedElement((NamedElement) child);
		}

		// Delete all dependencies.
		removeAllDependencies(ne);

		// Delete this object.
		workspace.getElements().remove(ne);
		ne.getParent().getChildren().remove(ne);

	}

	public void removeAllDependencies(NamedElement elem) {
		removeDependencies(elem.getOutgoingDependencies());
		removeDependencies(elem.getIncomingDependencies());
	}

	public void removeOutgoingDependencies(NamedElement elem) {
		removeDependencies(elem.getOutgoingDependencies());
	}

	private void removeDependencies(List<Dependency> depsToDelete) {
		for (Dependency d : depsToDelete) {
			workspace.getDependencties().remove(d);
		}

		LinkedList<Pair<Dependency, EList<Dependency>>> depList = new LinkedList<Pair<Dependency, EList<Dependency>>>();

		Iterator<Dependency> iter = depsToDelete.iterator();
		while (iter.hasNext()) {
			Dependency d = iter.next();
			depList.add(Pair.newInstance(d, d.getFrom().getOutgoingDependencies()));
			depList.add(Pair.newInstance(d, d.getTo().getIncomingDependencies()));
		}

		for (Pair<Dependency, EList<Dependency>> p : depList) {
			p.getSecond().remove(p.getFirst());
		}
	}

	public void removeEntireProject(IJavaProject jdtProject) {
		Object emfProjectObject = findJdtElementInEmfModel(jdtProject);
		if (emfProjectObject != null) {
			JavaProject project = (JavaProject) emfProjectObject;
			removeNamedElementsRecursive(Arrays.asList(project));
		}
	}

	@SuppressWarnings("unchecked")
	public void removeNamedElementsRecursive(Collection<? extends NamedElement> elements) {
		List<NamedElement> elems = new LinkedList<NamedElement>();
		for (NamedElement elem : elements) {
			elems.add(elem);
		}
		
		for (NamedElement elem : elems) {
			removeNamedElementsRecursive(elem.getChildren());
			removeNamedElement(workspace, elem);
		}
	}

	private void removeNamedElement(EclipseWorkspace workspace, NamedElement elem) {
		if (elem instanceof JavaProject) {
			JavaProject project = (JavaProject) elem;
			workspace.getProjects().remove(project);
		} else {
			NamedElement container = elem.getParent();
			container.getChildren().remove(elem);
		}
		
		removeAllDependencies(elem);
		workspace.getElements().remove(elem);
	}

	public NamedElement findJdtElementInEmfModel(IJavaElement jdtElem) {
		return workspace.findElementByHandle(jdtElem.getHandleIdentifier());
	}

}

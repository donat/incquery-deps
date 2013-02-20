/*
 * File WsBuildPrimitives.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Aug 6, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package hu.bme.incquery.deps.core;

import hu.bme.incquery.deps.wsmodel.WDependency;
import hu.bme.incquery.deps.wsmodel.WDependencyType;
import hu.bme.incquery.deps.wsmodel.WField;
import hu.bme.incquery.deps.wsmodel.WMethod;
import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WProject;
import hu.bme.incquery.deps.wsmodel.WWorkspace;
import hu.bme.incquery.deps.wsmodel.WsmodelFactory;

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
import org.eclipse.jdt.core.JavaModelException;

public class WsBuildPrimitives {

	private final WWorkspace workspace;

	public WsBuildPrimitives(WWorkspace workspace) {
		this.workspace = workspace;
	}

	public WProject addProject(IJavaProject jdtProject) {
		// Create the instance and set the properties.
		WProject p = WsmodelFactory.eINSTANCE.createWProject();
		p.setName(jdtProject.getElementName());
		p.setHandler(jdtProject.getHandleIdentifier());

		// Put it into the root objects.
		workspace.getProjects().add(p);

		// Add to the all elements list.
		workspace.getElements().add(p);

		return p;
	}
	
	public WNamedElement addNamedElementToModel(WNamedElement container, IJavaElement jdtItem) {
	    WNamedElement elem = addNamedElement(container, jdtItem);


		workspace.getElements().add(elem);
		if (container != null) {
			container.addChild(elem);
		}
		// Only happens if the container is the Workspace itself.
		else {
			workspace.getProjects().add((WProject) elem);
		}

		return elem;
	}

    /**
     * @param container
     * @param jdtItem
     * @param elem
     * @return
     */
    public static WNamedElement addNamedElement(WNamedElement container, IJavaElement jdtItem) {
        WNamedElement elem = null;
        if (jdtItem instanceof IJavaProject) {
			elem = WsmodelFactory.eINSTANCE.createWProject();
		} else if (jdtItem instanceof IPackageFragmentRoot) {
			elem = WsmodelFactory.eINSTANCE.createWPackageFragmentRoot();
		} else if (jdtItem instanceof IPackageFragment) {
			elem = WsmodelFactory.eINSTANCE.createWPackageFragment();
		} else if (jdtItem instanceof ICompilationUnit) {
			elem = WsmodelFactory.eINSTANCE.createWCompilationUnit();
		} else if (jdtItem instanceof IType) {
			elem = WsmodelFactory.eINSTANCE.createWType();
		} else if (jdtItem instanceof IMethod) {
			elem = WsmodelFactory.eINSTANCE.createWMethod();
			try {
				((WMethod)elem).setSignature(JdtUtils.fullyQualify(((IMethod)jdtItem)));
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		} else if (jdtItem instanceof IField) {
			elem = WsmodelFactory.eINSTANCE.createWField();
			((WField)elem).setSignature(JdtUtils.fullyQualify(((IField)jdtItem)));
		} else {
			throw new RuntimeException("Unsupported type");
		}

		elem.setName(jdtItem.getElementName());
		elem.setHandler(jdtItem.getHandleIdentifier());
		elem.setParent(container);
        return elem;
    }

	public WDependency createDependency(WDependencyType type, IJavaElement from, IJavaElement to) {
		WNamedElement emfFrom = findJdtElementInEmfModel(from);
		WNamedElement emfTo = findJdtElementInEmfModel(to);
		if (emfFrom != null && emfTo != null) {
			return createDependency(emfFrom, emfTo, type);
		} else
			return null;
	}

	public WDependency createDependency(WNamedElement from, WNamedElement to, WDependencyType type) {
		if (dependencyExists(from, to, type)) {
			return null;
		}

		WDependency d = WsmodelFactory.eINSTANCE.createWDependency();
		d.setType(type);
		d.setFrom(from);
		d.setTo(to);
		workspace.getDependencties().add(d);
		return d;
	}

	private static boolean dependencyExists(WNamedElement emfFrom, WNamedElement emfTo, WDependencyType type) {
		for (WDependency d : emfFrom.getOutgoingDependencies()) {
			if (d.getTo().equals(emfTo) && d.getType().equals(type)) {
				return true;
			}
		}
		return false;
	}

	public void moveItemToNewParent(WWorkspace oldWorkspace, WNamedElement newContainer, WNamedElement itemToMove) {
		oldWorkspace.getElements().remove(itemToMove);
		itemToMove.setParent(newContainer);
		workspace.getElements().add(itemToMove);
		for (Object childObject : itemToMove.getChildren()) {
			WNamedElement child = (WNamedElement) childObject;
			moveItemToNewParent(oldWorkspace, itemToMove, child);
		}
	}

	public void removeNamedElement(IJavaElement elemToDelete) {
		WNamedElement emfToDel = findJdtElementInEmfModel(elemToDelete);
		if (emfToDel != null)
			removeNamedElement(emfToDel);
		else {
			System.out.println("Could not delete: " + elemToDelete);
		}
	}
	
	public void removeNamedElement(String handler) {
        WNamedElement emfToDel = findJdtElementInEmfModel(handler);
        if (emfToDel != null)
            removeNamedElement(emfToDel);
        else {
            System.out.println("Could not delete: " + handler);
        }
    }

	private void removeNamedElement(WNamedElement ne) {
		// Delete children.
		List<Object> children = new LinkedList<Object>();
		for (Object child : ne.getChildren()) {
			children.add(child);
		}

		for (Object child : children) {
			removeNamedElement((WNamedElement) child);
		}

		// Delete all dependencies.
		removeAllDependencies(ne);

		// Delete this object.
		workspace.getElements().remove(ne);
		ne.getParent().getChildren().remove(ne);

	}

	public void removeAllDependencies(WNamedElement elem) {
		removeDependencies(elem.getOutgoingDependencies());
		removeDependencies(elem.getIncomingDependencies());
	}

	public void removeOutgoingDependencies(WNamedElement elem) {
		removeDependencies(elem.getOutgoingDependencies());
	}

	private void removeDependencies(List<WDependency> depsToDelete) {
		for (WDependency d : depsToDelete) {
			workspace.getDependencties().remove(d);
		}

		LinkedList<Pair<WDependency, EList<WDependency>>> depList = new LinkedList<Pair<WDependency, EList<WDependency>>>();

		Iterator<WDependency> iter = depsToDelete.iterator();
		while (iter.hasNext()) {
			WDependency d = iter.next();
			depList.add(Pair.newInstance(d, d.getFrom().getOutgoingDependencies()));
			depList.add(Pair.newInstance(d, d.getTo().getIncomingDependencies()));
		}

		for (Pair<WDependency, EList<WDependency>> p : depList) {
			p.getSecond().remove(p.getFirst());
		}
	}

	public void removeEntireProject(IJavaProject jdtProject) {
		Object emfProjectObject = findJdtElementInEmfModel(jdtProject);
		if (emfProjectObject != null) {
			WProject project = (WProject) emfProjectObject;
			removeNamedElementsRecursive(Arrays.asList(project));
		}
	}

	@SuppressWarnings("unchecked")
	public void removeNamedElementsRecursive(Collection<? extends WNamedElement> elements) {
		List<WNamedElement> elems = new LinkedList<WNamedElement>();
		for (WNamedElement elem : elements) {
			elems.add(elem);
		}
		
		for (WNamedElement elem : elems) {
			removeNamedElementsRecursive(elem.getChildren());
			removeNamedElement(workspace, elem);
		}
	}

	private void removeNamedElement(WWorkspace workspace, WNamedElement elem) {
		if (elem instanceof WProject) {
			WProject project = (WProject) elem;
			workspace.getProjects().remove(project);
		} else {
			WNamedElement container = elem.getParent();
			container.getChildren().remove(elem);
		}
		
		removeAllDependencies(elem);
		workspace.getElements().remove(elem);
	}

	public WNamedElement findJdtElementInEmfModel(IJavaElement jdtElem) {
		return workspace.findElementByHandle(jdtElem.getHandleIdentifier());
	}
	
	public WNamedElement findJdtElementInEmfModel(String handler) {
	    return workspace.findElementByHandle(handler);
	}

}

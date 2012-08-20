/*
 * File EmfModelUtil.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 5, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package cern.devtools.depanalysis.modelfinder;

import java.util.Collection;

import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
import cern.devtools.depanalysis.wsmodel.JavaProject;
import cern.devtools.depanalysis.wsmodel.NamedElement;
import cern.devtools.depanalysis.wsmodel.PackageFragmentRoot;

public class EmfModelUtils {

	public static void printModel(EclipseWorkspace ws) {
		System.out.println("*******************");
		System.out.println("* Workspace model *");
		System.out.println("*******************");
		printModel(ws.getProjects(), "");
		
	}
	
	@SuppressWarnings("unchecked")
	private static void printModel(Collection<? extends NamedElement> cne, String indent) {
		for (NamedElement ne : cne) {
			System.out.println(indent + ne);
			printModel(ne.getChildren(), indent + "  ");
		}
	}
 
	public static void deleteNamedElement(EclipseWorkspace workspace, NamedElement elem) {
		if (elem instanceof JavaProject) {
			JavaProject project = (JavaProject) elem;
			workspace.getProjects().remove(project);
		}
		
		if (elem instanceof PackageFragmentRoot) {
			PackageFragmentRoot pfr = (PackageFragmentRoot) elem;
			JavaProject container = pfr.getJavaProject();
			container.getPackageFragmentRoots().remove(elem);
		}

		workspace.getElements().remove(elem);
	}
	
	

	// @SuppressWarnings("unchecked")
	// public static <T extends NamedElement> T createNamedElement(int type, Workspace workspace, EObject container,
	// String handler, String name, Object... data) {
	// T newElement = null;
	//
	// switch (type) {
	// case JavaModelPackage.PROJECT:
	// newElement = (T) JavaModelFactory.eINSTANCE.createProject();
	// workspace.getProjects().add((Project) newElement);
	// break;
	//
	// case JavaModelPackage.PACKAGE:
	// newElement = (T) JavaModelFactory.eINSTANCE.createPackage();
	// ((Project) container).getPackages().add((Package) newElement);
	// break;
	//
	// case JavaModelPackage.API_CLASS:
	// newElement = (T) JavaModelFactory.eINSTANCE.createApiClass();
	// newElement.setData(data[0]);
	// ((Package) container).getClasses().add((ApiClass) newElement);
	// break;
	//
	// case JavaModelPackage.METHOD:
	// newElement = (T) JavaModelFactory.eINSTANCE.createMethod();
	// ((ApiClass) container).getMethods().add((Method) newElement);
	// break;
	//
	// case JavaModelPackage.FIELD:
	// newElement = (T) JavaModelFactory.eINSTANCE.createField();
	// ((ApiClass) container).getFields().add((Field) newElement);
	// break;
	//
	// default:
	// throw new RuntimeException("Not vaid type specified (not present in JavaModelPackage).");
	// }
	//
	// // set common attributes
	// newElement.setName(name);
	// newElement.setHandler(handler);
	//
	// // set workspace reference and return
	// workspace.getElements().add(newElement);
	// return newElement;
	// }
	//

	//
	// public static Dependency createDependency(Workspace workspace, NamedElement from, NamedElement to,
	// DependencyType type) {
	// if (dependencyExists(from, to, type)) {
	// return null;
	// }
	//
	// Dependency d = JavaModelFactory.eINSTANCE.createDependency();
	// d.setType(type);
	// d.setFrom(from);
	// d.setTo(to);
	// workspace.getDependencties().add(d);
	// return d;
	// }
	//
	// private static boolean dependencyExists(NamedElement emfFrom, NamedElement emfTo, DependencyType type) {
	// for (Dependency d : emfFrom.getOutgoingDependencies()) {
	// if (d.getTo().equals(emfTo) && d.getType().equals(type)) {
	// return true;
	// }
	// }
	// return false;
	// }
	//
	// public static void deleteAllDependencies(Workspace workspace, NamedElement elem) {
	// deleteDependencies(workspace, elem.getOutgoingDependencies());
	// deleteDependencies(workspace, elem.getIncomingDependencies());
	// }
	//
	// public static void deleteOutgoingDependencies(Workspace workspace, NamedElement elem) {
	// deleteDependencies(workspace, elem.getOutgoingDependencies());
	// }
	//
	// private static void deleteDependencies(Workspace workspace, List<Dependency> depsToDelete) {
	// for (Dependency d : depsToDelete) {
	// workspace.getDependencties().remove(d);
	// }
	//
	// LinkedList<Pair<Dependency, EList<Dependency>>> depList = new LinkedList<Pair<Dependency, EList<Dependency>>>();
	//
	// Iterator<Dependency> iter = depsToDelete.iterator();
	// while (iter.hasNext()) {
	// Dependency d = iter.next();
	// depList.add(Pair.newInstance(d, d.getFrom().getOutgoingDependencies()));
	// depList.add(Pair.newInstance(d, d.getTo().getIncomingDependencies()));
	// }
	//
	// for (Pair<Dependency, EList<Dependency>> p : depList) {
	// p.getSecond().remove(p.getFirst());
	// }
	// }

	/**
	 * Testing remove dependency functionality.
	 */
	public static void main(String[] args) {
		//
		// Workspace w = JavaModelFactory.eINSTANCE.createWorkspace();
		// Project p1 = JavaModelFactory.eINSTANCE.createProject();
		// Project p2 = JavaModelFactory.eINSTANCE.createProject();
		// w.getProjects().add(p1);
		// w.getProjects().add(p2);
		// createDependency(w, p1, p2, DependencyType.METHOD_CALL);
		//
		// System.out.println("ws " + w.getDependencties().size());
		// System.out.println("pi " + p1.getIncomingDependencies().size());
		// System.out.println("po " + p1.getOutgoingDependencies().size());
		//
		// deleteAllDependencies(w, p1);
		//
		// System.out.println("ws " + w.getDependencties().size());
		// System.out.println("pi " + p1.getIncomingDependencies().size());
		// System.out.println("po " + p1.getOutgoingDependencies().size());

	}
}

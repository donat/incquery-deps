/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cern.devtools.depanalysis.javamodel.impl;

import cern.devtools.depanalysis.javamodel.ApiClass;
import cern.devtools.depanalysis.javamodel.Field;
import cern.devtools.depanalysis.javamodel.JavaModelPackage;
import cern.devtools.depanalysis.javamodel.Method;
import cern.devtools.depanalysis.javamodel.NamedElement;
import cern.devtools.depanalysis.javamodel.Package;
import cern.devtools.depanalysis.javamodel.Project;
import cern.devtools.depanalysis.javamodel.Workspace;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Workspace</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link cern.devtools.depanalysis.javamodel.impl.WorkspaceImpl#getProjects <em>Projects</em>}</li>
 * <li>{@link cern.devtools.depanalysis.javamodel.impl.WorkspaceImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WorkspaceImpl extends EObjectImpl implements Workspace {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> elements;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WorkspaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaModelPackage.Literals.WORKSPACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<Project>(Project.class, this, JavaModelPackage.WORKSPACE__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<NamedElement> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<NamedElement>(NamedElement.class, this,
					JavaModelPackage.WORKSPACE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaModelPackage.WORKSPACE__PROJECTS:
			return ((InternalEList<?>) getProjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JavaModelPackage.WORKSPACE__PROJECTS:
			return getProjects();
		case JavaModelPackage.WORKSPACE__ELEMENTS:
			return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JavaModelPackage.WORKSPACE__PROJECTS:
			getProjects().clear();
			getProjects().addAll((Collection<? extends Project>) newValue);
			return;
		case JavaModelPackage.WORKSPACE__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends NamedElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JavaModelPackage.WORKSPACE__PROJECTS:
			getProjects().clear();
			return;
		case JavaModelPackage.WORKSPACE__ELEMENTS:
			getElements().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JavaModelPackage.WORKSPACE__PROJECTS:
			return projects != null && !projects.isEmpty();
		case JavaModelPackage.WORKSPACE__ELEMENTS:
			return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("---workspace structure---\n");
		for (Project p : getProjects()) {
			result.append(p);
			result.append("\n");
			for (Package pkg : p.getPackages()) {
				result.append("\t");
				result.append(pkg);
				result.append("\n");

				for (ApiClass ac : pkg.getClasses()) {
					result.append("\t\t");
					result.append(ac);
					result.append("\n");
					for (Method m : ac.getMethods()) {
						result.append("\t\t\t");
						result.append(m);
						result.append("\n");
					}
					for (Field f : ac.getFields()) {
						result.append("\t\t\t");
						result.append(f);
						result.append("\n");
					}
				}
			}
		}
		return result.toString();
	}

} // WorkspaceImpl

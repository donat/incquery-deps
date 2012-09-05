/**
 */
package hu.bme.incquery.deps.wsmodel.impl;

import hu.bme.incquery.deps.wsmodel.WDependency;
import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WProject;
import hu.bme.incquery.deps.wsmodel.WWorkspace;
import hu.bme.incquery.deps.wsmodel.WsmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WWorkspace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WWorkspaceImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WWorkspaceImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WWorkspaceImpl#getDependencties <em>Dependencties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WWorkspaceImpl extends EObjectImpl implements WWorkspace {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<WProject> projects;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<WNamedElement> elements;

	/**
	 * The cached value of the '{@link #getDependencties() <em>Dependencties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencties()
	 * @generated
	 * @ordered
	 */
	protected EList<WDependency> dependencties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WWorkspaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsmodelPackage.Literals.WWORKSPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WProject> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentWithInverseEList<WProject>(WProject.class, this, WsmodelPackage.WWORKSPACE__PROJECTS, WsmodelPackage.WPROJECT__WORKSPACE);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WNamedElement> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<WNamedElement>(WNamedElement.class, this, WsmodelPackage.WWORKSPACE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WDependency> getDependencties() {
		if (dependencties == null) {
			dependencties = new EObjectContainmentEList<WDependency>(WDependency.class, this, WsmodelPackage.WWORKSPACE__DEPENDENCTIES);
		}
		return dependencties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsmodelPackage.WWORKSPACE__PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjects()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsmodelPackage.WWORKSPACE__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case WsmodelPackage.WWORKSPACE__DEPENDENCTIES:
				return ((InternalEList<?>)getDependencties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WsmodelPackage.WWORKSPACE__PROJECTS:
				return getProjects();
			case WsmodelPackage.WWORKSPACE__ELEMENTS:
				return getElements();
			case WsmodelPackage.WWORKSPACE__DEPENDENCTIES:
				return getDependencties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WsmodelPackage.WWORKSPACE__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends WProject>)newValue);
				return;
			case WsmodelPackage.WWORKSPACE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends WNamedElement>)newValue);
				return;
			case WsmodelPackage.WWORKSPACE__DEPENDENCTIES:
				getDependencties().clear();
				getDependencties().addAll((Collection<? extends WDependency>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WsmodelPackage.WWORKSPACE__PROJECTS:
				getProjects().clear();
				return;
			case WsmodelPackage.WWORKSPACE__ELEMENTS:
				getElements().clear();
				return;
			case WsmodelPackage.WWORKSPACE__DEPENDENCTIES:
				getDependencties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WsmodelPackage.WWORKSPACE__PROJECTS:
				return projects != null && !projects.isEmpty();
			case WsmodelPackage.WWORKSPACE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case WsmodelPackage.WWORKSPACE__DEPENDENCTIES:
				return dependencties != null && !dependencties.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public WNamedElement findElementByHandle(String handle) {
		for (WNamedElement e : getElements()) {
			if (handle.equals(e.getHandler())) {
				return e;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return EmfModelUtils.printModel(this);
	}

} //WWorkspaceImpl

/**
 */
package hu.bme.incquery.deps.cp3model.impl;

import hu.bme.incquery.deps.cp3model.CP3Dep;
import hu.bme.incquery.deps.cp3model.CP3Repo;
import hu.bme.incquery.deps.cp3model.CP3StElem;
import hu.bme.incquery.deps.cp3model.Cp3modelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CP3 Repo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3RepoImpl#getDeps <em>Deps</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3RepoImpl#getElems <em>Elems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CP3RepoImpl extends EObjectImpl implements CP3Repo {
	/**
	 * The cached value of the '{@link #getDeps() <em>Deps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeps()
	 * @generated
	 * @ordered
	 */
	protected EList<CP3Dep> deps;

	/**
	 * The cached value of the '{@link #getElems() <em>Elems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElems()
	 * @generated
	 * @ordered
	 */
	protected EList<CP3StElem> elems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CP3RepoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cp3modelPackage.Literals.CP3_REPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CP3Dep> getDeps() {
		if (deps == null) {
			deps = new EObjectContainmentEList<CP3Dep>(CP3Dep.class, this, Cp3modelPackage.CP3_REPO__DEPS);
		}
		return deps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CP3StElem> getElems() {
		if (elems == null) {
			elems = new EObjectContainmentEList<CP3StElem>(CP3StElem.class, this, Cp3modelPackage.CP3_REPO__ELEMS);
		}
		return elems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cp3modelPackage.CP3_REPO__DEPS:
				return ((InternalEList<?>)getDeps()).basicRemove(otherEnd, msgs);
			case Cp3modelPackage.CP3_REPO__ELEMS:
				return ((InternalEList<?>)getElems()).basicRemove(otherEnd, msgs);
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
			case Cp3modelPackage.CP3_REPO__DEPS:
				return getDeps();
			case Cp3modelPackage.CP3_REPO__ELEMS:
				return getElems();
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
			case Cp3modelPackage.CP3_REPO__DEPS:
				getDeps().clear();
				getDeps().addAll((Collection<? extends CP3Dep>)newValue);
				return;
			case Cp3modelPackage.CP3_REPO__ELEMS:
				getElems().clear();
				getElems().addAll((Collection<? extends CP3StElem>)newValue);
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
			case Cp3modelPackage.CP3_REPO__DEPS:
				getDeps().clear();
				return;
			case Cp3modelPackage.CP3_REPO__ELEMS:
				getElems().clear();
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
			case Cp3modelPackage.CP3_REPO__DEPS:
				return deps != null && !deps.isEmpty();
			case Cp3modelPackage.CP3_REPO__ELEMS:
				return elems != null && !elems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CP3RepoImpl

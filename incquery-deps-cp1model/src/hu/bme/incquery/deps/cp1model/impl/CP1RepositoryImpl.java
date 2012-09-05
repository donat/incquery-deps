/**
 */
package hu.bme.incquery.deps.cp1model.impl;

import hu.bme.incquery.deps.cp1model.CP1Dependency;
import hu.bme.incquery.deps.cp1model.CP1Project;
import hu.bme.incquery.deps.cp1model.CP1Repository;
import hu.bme.incquery.deps.cp1model.Cp1modelPackage;

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
 * An implementation of the model object '<em><b>CP1 Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp1model.impl.CP1RepositoryImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp1model.impl.CP1RepositoryImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CP1RepositoryImpl extends EObjectImpl implements CP1Repository {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<CP1Project> projects;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<CP1Dependency> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CP1RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cp1modelPackage.Literals.CP1_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CP1Project> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<CP1Project>(CP1Project.class, this, Cp1modelPackage.CP1_REPOSITORY__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CP1Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<CP1Dependency>(CP1Dependency.class, this, Cp1modelPackage.CP1_REPOSITORY__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cp1modelPackage.CP1_REPOSITORY__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case Cp1modelPackage.CP1_REPOSITORY__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case Cp1modelPackage.CP1_REPOSITORY__PROJECTS:
				return getProjects();
			case Cp1modelPackage.CP1_REPOSITORY__DEPENDENCIES:
				return getDependencies();
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
			case Cp1modelPackage.CP1_REPOSITORY__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends CP1Project>)newValue);
				return;
			case Cp1modelPackage.CP1_REPOSITORY__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends CP1Dependency>)newValue);
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
			case Cp1modelPackage.CP1_REPOSITORY__PROJECTS:
				getProjects().clear();
				return;
			case Cp1modelPackage.CP1_REPOSITORY__DEPENDENCIES:
				getDependencies().clear();
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
			case Cp1modelPackage.CP1_REPOSITORY__PROJECTS:
				return projects != null && !projects.isEmpty();
			case Cp1modelPackage.CP1_REPOSITORY__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CP1RepositoryImpl

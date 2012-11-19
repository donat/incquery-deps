/**
 */
package hu.bme.incquery.deps.cp3model.impl;

import hu.bme.incquery.deps.cp3model.CP3Class;
import hu.bme.incquery.deps.cp3model.CP3Field;
import hu.bme.incquery.deps.cp3model.CP3Method;
import hu.bme.incquery.deps.cp3model.CP3Project;
import hu.bme.incquery.deps.cp3model.Cp3modelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CP3 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3ClassImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3ClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3ClassImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CP3ClassImpl extends CP3AbstractItemImpl implements CP3Class {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<CP3Project> projects;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<CP3Method> methods;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<CP3Field> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CP3ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cp3modelPackage.Literals.CP3_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CP3Project> getProjects() {
		if (projects == null) {
			projects = new EObjectWithInverseResolvingEList.ManyInverse<CP3Project>(CP3Project.class, this, Cp3modelPackage.CP3_CLASS__PROJECTS, Cp3modelPackage.CP3_PROJECT__CLASSES);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CP3Method> getMethods() {
		if (methods == null) {
			methods = new EObjectWithInverseResolvingEList.ManyInverse<CP3Method>(CP3Method.class, this, Cp3modelPackage.CP3_CLASS__METHODS, Cp3modelPackage.CP3_METHOD__CLASSES);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CP3Field> getFields() {
		if (fields == null) {
			fields = new EObjectWithInverseResolvingEList.ManyInverse<CP3Field>(CP3Field.class, this, Cp3modelPackage.CP3_CLASS__FIELDS, Cp3modelPackage.CP3_FIELD__CLASSES);
		}
		return fields;
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
			case Cp3modelPackage.CP3_CLASS__PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjects()).basicAdd(otherEnd, msgs);
			case Cp3modelPackage.CP3_CLASS__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case Cp3modelPackage.CP3_CLASS__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
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
			case Cp3modelPackage.CP3_CLASS__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case Cp3modelPackage.CP3_CLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case Cp3modelPackage.CP3_CLASS__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case Cp3modelPackage.CP3_CLASS__PROJECTS:
				return getProjects();
			case Cp3modelPackage.CP3_CLASS__METHODS:
				return getMethods();
			case Cp3modelPackage.CP3_CLASS__FIELDS:
				return getFields();
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
			case Cp3modelPackage.CP3_CLASS__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends CP3Project>)newValue);
				return;
			case Cp3modelPackage.CP3_CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends CP3Method>)newValue);
				return;
			case Cp3modelPackage.CP3_CLASS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends CP3Field>)newValue);
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
			case Cp3modelPackage.CP3_CLASS__PROJECTS:
				getProjects().clear();
				return;
			case Cp3modelPackage.CP3_CLASS__METHODS:
				getMethods().clear();
				return;
			case Cp3modelPackage.CP3_CLASS__FIELDS:
				getFields().clear();
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
			case Cp3modelPackage.CP3_CLASS__PROJECTS:
				return projects != null && !projects.isEmpty();
			case Cp3modelPackage.CP3_CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case Cp3modelPackage.CP3_CLASS__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CP3ClassImpl

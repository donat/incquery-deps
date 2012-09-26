/**
 */
package hu.bme.incquery.deps.cp2model.impl;

import hu.bme.incquery.deps.cp2model.C2Methods;
import hu.bme.incquery.deps.cp2model.CP2Class;
import hu.bme.incquery.deps.cp2model.CP2Field;
import hu.bme.incquery.deps.cp2model.Cp2modelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CP2 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp2model.impl.CP2ClassImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.impl.CP2ClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.impl.CP2ClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.impl.CP2ClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.impl.CP2ClassImpl#getSimpleName <em>Simple Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CP2ClassImpl extends C2CodeElementImpl implements CP2Class {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<CP2Field> fields;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<C2Methods> methods;

	/**
	 * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected String extends_ = EXTENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplements() <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected String implements_ = IMPLEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected String simpleName = SIMPLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CP2ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cp2modelPackage.Literals.CP2_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CP2Field> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<CP2Field>(CP2Field.class, this, Cp2modelPackage.CP2_CLASS__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<C2Methods> getMethods() {
		if (methods == null) {
			methods = new EObjectResolvingEList<C2Methods>(C2Methods.class, this, Cp2modelPackage.CP2_CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(String newExtends) {
		String oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp2modelPackage.CP2_CLASS__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(String newImplements) {
		String oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp2modelPackage.CP2_CLASS__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleName() {
		return simpleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleName(String newSimpleName) {
		String oldSimpleName = simpleName;
		simpleName = newSimpleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp2modelPackage.CP2_CLASS__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cp2modelPackage.CP2_CLASS__FIELDS:
				return getFields();
			case Cp2modelPackage.CP2_CLASS__METHODS:
				return getMethods();
			case Cp2modelPackage.CP2_CLASS__EXTENDS:
				return getExtends();
			case Cp2modelPackage.CP2_CLASS__IMPLEMENTS:
				return getImplements();
			case Cp2modelPackage.CP2_CLASS__SIMPLE_NAME:
				return getSimpleName();
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
			case Cp2modelPackage.CP2_CLASS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends CP2Field>)newValue);
				return;
			case Cp2modelPackage.CP2_CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends C2Methods>)newValue);
				return;
			case Cp2modelPackage.CP2_CLASS__EXTENDS:
				setExtends((String)newValue);
				return;
			case Cp2modelPackage.CP2_CLASS__IMPLEMENTS:
				setImplements((String)newValue);
				return;
			case Cp2modelPackage.CP2_CLASS__SIMPLE_NAME:
				setSimpleName((String)newValue);
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
			case Cp2modelPackage.CP2_CLASS__FIELDS:
				getFields().clear();
				return;
			case Cp2modelPackage.CP2_CLASS__METHODS:
				getMethods().clear();
				return;
			case Cp2modelPackage.CP2_CLASS__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case Cp2modelPackage.CP2_CLASS__IMPLEMENTS:
				setImplements(IMPLEMENTS_EDEFAULT);
				return;
			case Cp2modelPackage.CP2_CLASS__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
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
			case Cp2modelPackage.CP2_CLASS__FIELDS:
				return fields != null && !fields.isEmpty();
			case Cp2modelPackage.CP2_CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case Cp2modelPackage.CP2_CLASS__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case Cp2modelPackage.CP2_CLASS__IMPLEMENTS:
				return IMPLEMENTS_EDEFAULT == null ? implements_ != null : !IMPLEMENTS_EDEFAULT.equals(implements_);
			case Cp2modelPackage.CP2_CLASS__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extends: ");
		result.append(extends_);
		result.append(", implements: ");
		result.append(implements_);
		result.append(", simpleName: ");
		result.append(simpleName);
		result.append(')');
		return result.toString();
	}

} //CP2ClassImpl

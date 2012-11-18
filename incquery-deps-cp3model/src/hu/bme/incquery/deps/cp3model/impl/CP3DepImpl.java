/**
 */
package hu.bme.incquery.deps.cp3model.impl;

import hu.bme.incquery.deps.cp3model.CP3AbstractItem;
import hu.bme.incquery.deps.cp3model.CP3Dep;
import hu.bme.incquery.deps.cp3model.Cp3modelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CP3 Dep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3DepImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3DepImpl#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3DepImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CP3DepImpl extends EObjectImpl implements CP3Dep {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final short TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected short type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected CP3AbstractItem from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected CP3AbstractItem to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CP3DepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cp3modelPackage.Literals.CP3_DEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(short newType) {
		short oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp3modelPackage.CP3_DEP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3AbstractItem getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (CP3AbstractItem)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cp3modelPackage.CP3_DEP__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3AbstractItem basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(CP3AbstractItem newFrom) {
		CP3AbstractItem oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp3modelPackage.CP3_DEP__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3AbstractItem getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (CP3AbstractItem)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cp3modelPackage.CP3_DEP__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3AbstractItem basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(CP3AbstractItem newTo) {
		CP3AbstractItem oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp3modelPackage.CP3_DEP__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cp3modelPackage.CP3_DEP__TYPE:
				return getType();
			case Cp3modelPackage.CP3_DEP__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case Cp3modelPackage.CP3_DEP__TO:
				if (resolve) return getTo();
				return basicGetTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Cp3modelPackage.CP3_DEP__TYPE:
				setType((Short)newValue);
				return;
			case Cp3modelPackage.CP3_DEP__FROM:
				setFrom((CP3AbstractItem)newValue);
				return;
			case Cp3modelPackage.CP3_DEP__TO:
				setTo((CP3AbstractItem)newValue);
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
			case Cp3modelPackage.CP3_DEP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Cp3modelPackage.CP3_DEP__FROM:
				setFrom((CP3AbstractItem)null);
				return;
			case Cp3modelPackage.CP3_DEP__TO:
				setTo((CP3AbstractItem)null);
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
			case Cp3modelPackage.CP3_DEP__TYPE:
				return type != TYPE_EDEFAULT;
			case Cp3modelPackage.CP3_DEP__FROM:
				return from != null;
			case Cp3modelPackage.CP3_DEP__TO:
				return to != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CP3DepImpl

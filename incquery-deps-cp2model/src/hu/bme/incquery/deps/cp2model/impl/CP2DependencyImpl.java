/**
 */
package hu.bme.incquery.deps.cp2model.impl;

import hu.bme.incquery.deps.cp2model.C2CodeElement;
import hu.bme.incquery.deps.cp2model.CP2Dependency;
import hu.bme.incquery.deps.cp2model.Cp2modelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CP2 Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp2model.impl.CP2DependencyImpl#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.impl.CP2DependencyImpl#getTo <em>To</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.impl.CP2DependencyImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CP2DependencyImpl extends EObjectImpl implements CP2Dependency {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected C2CodeElement from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected C2CodeElement to;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CP2DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cp2modelPackage.Literals.CP2_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C2CodeElement getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (C2CodeElement)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cp2modelPackage.CP2_DEPENDENCY__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C2CodeElement basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(C2CodeElement newFrom) {
		C2CodeElement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp2modelPackage.CP2_DEPENDENCY__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C2CodeElement getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (C2CodeElement)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cp2modelPackage.CP2_DEPENDENCY__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C2CodeElement basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(C2CodeElement newTo) {
		C2CodeElement oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp2modelPackage.CP2_DEPENDENCY__TO, oldTo, to));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cp2modelPackage.CP2_DEPENDENCY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cp2modelPackage.CP2_DEPENDENCY__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case Cp2modelPackage.CP2_DEPENDENCY__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case Cp2modelPackage.CP2_DEPENDENCY__TYPE:
				return getType();
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
			case Cp2modelPackage.CP2_DEPENDENCY__FROM:
				setFrom((C2CodeElement)newValue);
				return;
			case Cp2modelPackage.CP2_DEPENDENCY__TO:
				setTo((C2CodeElement)newValue);
				return;
			case Cp2modelPackage.CP2_DEPENDENCY__TYPE:
				setType((Short)newValue);
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
			case Cp2modelPackage.CP2_DEPENDENCY__FROM:
				setFrom((C2CodeElement)null);
				return;
			case Cp2modelPackage.CP2_DEPENDENCY__TO:
				setTo((C2CodeElement)null);
				return;
			case Cp2modelPackage.CP2_DEPENDENCY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Cp2modelPackage.CP2_DEPENDENCY__FROM:
				return from != null;
			case Cp2modelPackage.CP2_DEPENDENCY__TO:
				return to != null;
			case Cp2modelPackage.CP2_DEPENDENCY__TYPE:
				return type != TYPE_EDEFAULT;
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

} //CP2DependencyImpl

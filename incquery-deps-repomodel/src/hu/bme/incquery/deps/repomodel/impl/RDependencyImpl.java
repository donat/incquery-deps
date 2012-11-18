/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.impl;

import hu.bme.incquery.deps.repomodel.RCodeElement;
import hu.bme.incquery.deps.repomodel.RDependency;
import hu.bme.incquery.deps.repomodel.RepomodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RDependencyImpl#getRFrom <em>RFrom</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RDependencyImpl#getRTo <em>RTo</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RDependencyImpl#getDepType <em>Dep Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDependencyImpl extends RRepositoryItemImpl implements RDependency {
	/**
	 * The cached value of the '{@link #getRFrom() <em>RFrom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFrom()
	 * @generated
	 * @ordered
	 */
	protected RCodeElement rFrom;

	/**
	 * The cached value of the '{@link #getRTo() <em>RTo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTo()
	 * @generated
	 * @ordered
	 */
	protected RCodeElement rTo;

	/**
	 * The default value of the '{@link #getDepType() <em>Dep Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepType()
	 * @generated
	 * @ordered
	 */
	protected static final int DEP_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDepType() <em>Dep Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepType()
	 * @generated
	 * @ordered
	 */
	protected int depType = DEP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepomodelPackage.Literals.RDEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCodeElement getRFrom() {
		if (rFrom != null && rFrom.eIsProxy()) {
			InternalEObject oldRFrom = (InternalEObject)rFrom;
			rFrom = (RCodeElement)eResolveProxy(oldRFrom);
			if (rFrom != oldRFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepomodelPackage.RDEPENDENCY__RFROM, oldRFrom, rFrom));
			}
		}
		return rFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCodeElement basicGetRFrom() {
		return rFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRFrom(RCodeElement newRFrom, NotificationChain msgs) {
		RCodeElement oldRFrom = rFrom;
		rFrom = newRFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepomodelPackage.RDEPENDENCY__RFROM, oldRFrom, newRFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRFrom(RCodeElement newRFrom) {
		if (newRFrom != rFrom) {
			NotificationChain msgs = null;
			if (rFrom != null)
				msgs = ((InternalEObject)rFrom).eInverseRemove(this, RepomodelPackage.RCODE_ELEMENT__ROUTGOING, RCodeElement.class, msgs);
			if (newRFrom != null)
				msgs = ((InternalEObject)newRFrom).eInverseAdd(this, RepomodelPackage.RCODE_ELEMENT__ROUTGOING, RCodeElement.class, msgs);
			msgs = basicSetRFrom(newRFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RDEPENDENCY__RFROM, newRFrom, newRFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCodeElement getRTo() {
		if (rTo != null && rTo.eIsProxy()) {
			InternalEObject oldRTo = (InternalEObject)rTo;
			rTo = (RCodeElement)eResolveProxy(oldRTo);
			if (rTo != oldRTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepomodelPackage.RDEPENDENCY__RTO, oldRTo, rTo));
			}
		}
		return rTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCodeElement basicGetRTo() {
		return rTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRTo(RCodeElement newRTo, NotificationChain msgs) {
		RCodeElement oldRTo = rTo;
		rTo = newRTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepomodelPackage.RDEPENDENCY__RTO, oldRTo, newRTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRTo(RCodeElement newRTo) {
		if (newRTo != rTo) {
			NotificationChain msgs = null;
			if (rTo != null)
				msgs = ((InternalEObject)rTo).eInverseRemove(this, RepomodelPackage.RCODE_ELEMENT__RINCOMING, RCodeElement.class, msgs);
			if (newRTo != null)
				msgs = ((InternalEObject)newRTo).eInverseAdd(this, RepomodelPackage.RCODE_ELEMENT__RINCOMING, RCodeElement.class, msgs);
			msgs = basicSetRTo(newRTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RDEPENDENCY__RTO, newRTo, newRTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDepType() {
		return depType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepType(int newDepType) {
		int oldDepType = depType;
		depType = newDepType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RDEPENDENCY__DEP_TYPE, oldDepType, depType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepomodelPackage.RDEPENDENCY__RFROM:
				if (rFrom != null)
					msgs = ((InternalEObject)rFrom).eInverseRemove(this, RepomodelPackage.RCODE_ELEMENT__ROUTGOING, RCodeElement.class, msgs);
				return basicSetRFrom((RCodeElement)otherEnd, msgs);
			case RepomodelPackage.RDEPENDENCY__RTO:
				if (rTo != null)
					msgs = ((InternalEObject)rTo).eInverseRemove(this, RepomodelPackage.RCODE_ELEMENT__RINCOMING, RCodeElement.class, msgs);
				return basicSetRTo((RCodeElement)otherEnd, msgs);
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
			case RepomodelPackage.RDEPENDENCY__RFROM:
				return basicSetRFrom(null, msgs);
			case RepomodelPackage.RDEPENDENCY__RTO:
				return basicSetRTo(null, msgs);
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
			case RepomodelPackage.RDEPENDENCY__RFROM:
				if (resolve) return getRFrom();
				return basicGetRFrom();
			case RepomodelPackage.RDEPENDENCY__RTO:
				if (resolve) return getRTo();
				return basicGetRTo();
			case RepomodelPackage.RDEPENDENCY__DEP_TYPE:
				return getDepType();
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
			case RepomodelPackage.RDEPENDENCY__RFROM:
				setRFrom((RCodeElement)newValue);
				return;
			case RepomodelPackage.RDEPENDENCY__RTO:
				setRTo((RCodeElement)newValue);
				return;
			case RepomodelPackage.RDEPENDENCY__DEP_TYPE:
				setDepType((Integer)newValue);
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
			case RepomodelPackage.RDEPENDENCY__RFROM:
				setRFrom((RCodeElement)null);
				return;
			case RepomodelPackage.RDEPENDENCY__RTO:
				setRTo((RCodeElement)null);
				return;
			case RepomodelPackage.RDEPENDENCY__DEP_TYPE:
				setDepType(DEP_TYPE_EDEFAULT);
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
			case RepomodelPackage.RDEPENDENCY__RFROM:
				return rFrom != null;
			case RepomodelPackage.RDEPENDENCY__RTO:
				return rTo != null;
			case RepomodelPackage.RDEPENDENCY__DEP_TYPE:
				return depType != DEP_TYPE_EDEFAULT;
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
		result.append(" (depType: ");
		result.append(depType);
		result.append(')');
		return result.toString();
	}

} //RDependencyImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.impl;

import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.repomodel.RField;
import hu.bme.incquery.deps.repomodel.RepomodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RField</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RFieldImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RFieldImpl#getRClass <em>RClass</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RFieldImpl#isPrivate <em>Private</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RFieldImpl extends RCodeElementImpl implements RField {
	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected boolean private_ = PRIVATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepomodelPackage.Literals.RFIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RFIELD__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RClass getRClass() {
		if (eContainerFeatureID() != RepomodelPackage.RFIELD__RCLASS) return null;
		return (RClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRClass(RClass newRClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRClass, RepomodelPackage.RFIELD__RCLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRClass(RClass newRClass) {
		if (newRClass != eInternalContainer() || (eContainerFeatureID() != RepomodelPackage.RFIELD__RCLASS && newRClass != null)) {
			if (EcoreUtil.isAncestor(this, newRClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRClass != null)
				msgs = ((InternalEObject)newRClass).eInverseAdd(this, RepomodelPackage.RCLASS__RFIELDS, RClass.class, msgs);
			msgs = basicSetRClass(newRClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RFIELD__RCLASS, newRClass, newRClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(boolean newPrivate) {
		boolean oldPrivate = private_;
		private_ = newPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RFIELD__PRIVATE, oldPrivate, private_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepomodelPackage.RFIELD__RCLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRClass((RClass)otherEnd, msgs);
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
			case RepomodelPackage.RFIELD__RCLASS:
				return basicSetRClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RepomodelPackage.RFIELD__RCLASS:
				return eInternalContainer().eInverseRemove(this, RepomodelPackage.RCLASS__RFIELDS, RClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepomodelPackage.RFIELD__SIGNATURE:
				return getSignature();
			case RepomodelPackage.RFIELD__RCLASS:
				return getRClass();
			case RepomodelPackage.RFIELD__PRIVATE:
				return isPrivate();
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
			case RepomodelPackage.RFIELD__SIGNATURE:
				setSignature((String)newValue);
				return;
			case RepomodelPackage.RFIELD__RCLASS:
				setRClass((RClass)newValue);
				return;
			case RepomodelPackage.RFIELD__PRIVATE:
				setPrivate((Boolean)newValue);
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
			case RepomodelPackage.RFIELD__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case RepomodelPackage.RFIELD__RCLASS:
				setRClass((RClass)null);
				return;
			case RepomodelPackage.RFIELD__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
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
			case RepomodelPackage.RFIELD__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case RepomodelPackage.RFIELD__RCLASS:
				return getRClass() != null;
			case RepomodelPackage.RFIELD__PRIVATE:
				return private_ != PRIVATE_EDEFAULT;
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
		result.append(" (signature: ");
		result.append(signature);
		result.append(", private: ");
		result.append(private_);
		result.append(')');
		return result.toString();
	}

} //RFieldImpl

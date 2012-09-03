/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.impl;

import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.repomodel.RMethod;
import hu.bme.incquery.deps.repomodel.RepomodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RMethodImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RMethodImpl#getRClass <em>RClass</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RMethodImpl#getPrivate <em>Private</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RMethodImpl#getReferencedFields <em>Referenced Fields</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RMethodImpl#getReferencedMethods <em>Referenced Methods</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RMethodImpl#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RMethodImpl extends RCodeElementImpl implements RMethod {
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
	 * The default value of the '{@link #getPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIVATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate()
	 * @generated
	 * @ordered
	 */
	protected Boolean private_ = PRIVATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedFields() <em>Referenced Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFields()
	 * @generated
	 * @ordered
	 */
	protected EList<String> referencedFields;

	/**
	 * The cached value of the '{@link #getReferencedMethods() <em>Referenced Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> referencedMethods;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepomodelPackage.Literals.RMETHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RMETHOD__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RClass getRClass() {
		if (eContainerFeatureID() != RepomodelPackage.RMETHOD__RCLASS) return null;
		return (RClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRClass(RClass newRClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRClass, RepomodelPackage.RMETHOD__RCLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRClass(RClass newRClass) {
		if (newRClass != eInternalContainer() || (eContainerFeatureID() != RepomodelPackage.RMETHOD__RCLASS && newRClass != null)) {
			if (EcoreUtil.isAncestor(this, newRClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRClass != null)
				msgs = ((InternalEObject)newRClass).eInverseAdd(this, RepomodelPackage.RCLASS__RMETHODS, RClass.class, msgs);
			msgs = basicSetRClass(newRClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RMETHOD__RCLASS, newRClass, newRClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPrivate() {
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(Boolean newPrivate) {
		Boolean oldPrivate = private_;
		private_ = newPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RMETHOD__PRIVATE, oldPrivate, private_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferencedFields() {
		return referencedFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedFields(EList<String> newReferencedFields) {
		EList<String> oldReferencedFields = referencedFields;
		referencedFields = newReferencedFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RMETHOD__REFERENCED_FIELDS, oldReferencedFields, referencedFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferencedMethods() {
		return referencedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedMethods(EList<String> newReferencedMethods) {
		EList<String> oldReferencedMethods = referencedMethods;
		referencedMethods = newReferencedMethods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RMETHOD__REFERENCED_METHODS, oldReferencedMethods, referencedMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RMETHOD__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepomodelPackage.RMETHOD__RCLASS:
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
			case RepomodelPackage.RMETHOD__RCLASS:
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
			case RepomodelPackage.RMETHOD__RCLASS:
				return eInternalContainer().eInverseRemove(this, RepomodelPackage.RCLASS__RMETHODS, RClass.class, msgs);
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
			case RepomodelPackage.RMETHOD__SIGNATURE:
				return getSignature();
			case RepomodelPackage.RMETHOD__RCLASS:
				return getRClass();
			case RepomodelPackage.RMETHOD__PRIVATE:
				return getPrivate();
			case RepomodelPackage.RMETHOD__REFERENCED_FIELDS:
				return getReferencedFields();
			case RepomodelPackage.RMETHOD__REFERENCED_METHODS:
				return getReferencedMethods();
			case RepomodelPackage.RMETHOD__STATIC:
				return isStatic();
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
			case RepomodelPackage.RMETHOD__SIGNATURE:
				setSignature((String)newValue);
				return;
			case RepomodelPackage.RMETHOD__RCLASS:
				setRClass((RClass)newValue);
				return;
			case RepomodelPackage.RMETHOD__PRIVATE:
				setPrivate((Boolean)newValue);
				return;
			case RepomodelPackage.RMETHOD__REFERENCED_FIELDS:
				setReferencedFields((EList<String>)newValue);
				return;
			case RepomodelPackage.RMETHOD__REFERENCED_METHODS:
				setReferencedMethods((EList<String>)newValue);
				return;
			case RepomodelPackage.RMETHOD__STATIC:
				setStatic((Boolean)newValue);
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
			case RepomodelPackage.RMETHOD__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case RepomodelPackage.RMETHOD__RCLASS:
				setRClass((RClass)null);
				return;
			case RepomodelPackage.RMETHOD__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
				return;
			case RepomodelPackage.RMETHOD__REFERENCED_FIELDS:
				setReferencedFields((EList<String>)null);
				return;
			case RepomodelPackage.RMETHOD__REFERENCED_METHODS:
				setReferencedMethods((EList<String>)null);
				return;
			case RepomodelPackage.RMETHOD__STATIC:
				setStatic(STATIC_EDEFAULT);
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
			case RepomodelPackage.RMETHOD__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case RepomodelPackage.RMETHOD__RCLASS:
				return getRClass() != null;
			case RepomodelPackage.RMETHOD__PRIVATE:
				return PRIVATE_EDEFAULT == null ? private_ != null : !PRIVATE_EDEFAULT.equals(private_);
			case RepomodelPackage.RMETHOD__REFERENCED_FIELDS:
				return referencedFields != null;
			case RepomodelPackage.RMETHOD__REFERENCED_METHODS:
				return referencedMethods != null;
			case RepomodelPackage.RMETHOD__STATIC:
				return static_ != STATIC_EDEFAULT;
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
		result.append(", referencedFields: ");
		result.append(referencedFields);
		result.append(", referencedMethods: ");
		result.append(referencedMethods);
		result.append(", static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}

} //RMethodImpl

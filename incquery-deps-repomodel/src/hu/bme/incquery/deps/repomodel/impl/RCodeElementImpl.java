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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RCode Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RCodeElementImpl#getRIncoming <em>RIncoming</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RCodeElementImpl#getROutgoing <em>ROutgoing</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RCodeElementImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RCodeElementImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RCodeElementImpl extends RRepositoryItemImpl implements RCodeElement {
	/**
	 * The cached value of the '{@link #getRIncoming() <em>RIncoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<RDependency> rIncoming;

	/**
	 * The cached value of the '{@link #getROutgoing() <em>ROutgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<RDependency> rOutgoing;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> versions;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RCodeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepomodelPackage.Literals.RCODE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDependency> getRIncoming() {
		if (rIncoming == null) {
			rIncoming = new EObjectWithInverseResolvingEList<RDependency>(RDependency.class, this, RepomodelPackage.RCODE_ELEMENT__RINCOMING, RepomodelPackage.RDEPENDENCY__RTO);
		}
		return rIncoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDependency> getROutgoing() {
		if (rOutgoing == null) {
			rOutgoing = new EObjectWithInverseResolvingEList<RDependency>(RDependency.class, this, RepomodelPackage.RCODE_ELEMENT__ROUTGOING, RepomodelPackage.RDEPENDENCY__RFROM);
		}
		return rOutgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVersions() {
		if (versions == null) {
			versions = new EDataTypeUniqueEList<String>(String.class, this, RepomodelPackage.RCODE_ELEMENT__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RCODE_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case RepomodelPackage.RCODE_ELEMENT__RINCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRIncoming()).basicAdd(otherEnd, msgs);
			case RepomodelPackage.RCODE_ELEMENT__ROUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getROutgoing()).basicAdd(otherEnd, msgs);
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
			case RepomodelPackage.RCODE_ELEMENT__RINCOMING:
				return ((InternalEList<?>)getRIncoming()).basicRemove(otherEnd, msgs);
			case RepomodelPackage.RCODE_ELEMENT__ROUTGOING:
				return ((InternalEList<?>)getROutgoing()).basicRemove(otherEnd, msgs);
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
			case RepomodelPackage.RCODE_ELEMENT__RINCOMING:
				return getRIncoming();
			case RepomodelPackage.RCODE_ELEMENT__ROUTGOING:
				return getROutgoing();
			case RepomodelPackage.RCODE_ELEMENT__VERSIONS:
				return getVersions();
			case RepomodelPackage.RCODE_ELEMENT__ID:
				return getId();
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
			case RepomodelPackage.RCODE_ELEMENT__RINCOMING:
				getRIncoming().clear();
				getRIncoming().addAll((Collection<? extends RDependency>)newValue);
				return;
			case RepomodelPackage.RCODE_ELEMENT__ROUTGOING:
				getROutgoing().clear();
				getROutgoing().addAll((Collection<? extends RDependency>)newValue);
				return;
			case RepomodelPackage.RCODE_ELEMENT__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends String>)newValue);
				return;
			case RepomodelPackage.RCODE_ELEMENT__ID:
				setId((Long)newValue);
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
			case RepomodelPackage.RCODE_ELEMENT__RINCOMING:
				getRIncoming().clear();
				return;
			case RepomodelPackage.RCODE_ELEMENT__ROUTGOING:
				getROutgoing().clear();
				return;
			case RepomodelPackage.RCODE_ELEMENT__VERSIONS:
				getVersions().clear();
				return;
			case RepomodelPackage.RCODE_ELEMENT__ID:
				setId(ID_EDEFAULT);
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
			case RepomodelPackage.RCODE_ELEMENT__RINCOMING:
				return rIncoming != null && !rIncoming.isEmpty();
			case RepomodelPackage.RCODE_ELEMENT__ROUTGOING:
				return rOutgoing != null && !rOutgoing.isEmpty();
			case RepomodelPackage.RCODE_ELEMENT__VERSIONS:
				return versions != null && !versions.isEmpty();
			case RepomodelPackage.RCODE_ELEMENT__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (versions: ");
		result.append(versions);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RCodeElementImpl

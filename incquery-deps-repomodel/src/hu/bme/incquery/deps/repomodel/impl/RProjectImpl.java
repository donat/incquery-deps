/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.impl;

import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.repomodel.RProject;
import hu.bme.incquery.deps.repomodel.RepomodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RProject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RProjectImpl#getRClasses <em>RClasses</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RProjectImpl#getContainingFolders <em>Containing Folders</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RProjectImpl#getProductPath <em>Product Path</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RProjectImpl#getStoreLocation <em>Store Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RProjectImpl extends RCodeElementImpl implements RProject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRClasses() <em>RClasses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<RClass> rClasses;

	/**
	 * The default value of the '{@link #getContainingFolders() <em>Containing Folders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingFolders()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINING_FOLDERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainingFolders() <em>Containing Folders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingFolders()
	 * @generated
	 * @ordered
	 */
	protected String containingFolders = CONTAINING_FOLDERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPath() <em>Product Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPath() <em>Product Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPath()
	 * @generated
	 * @ordered
	 */
	protected String productPath = PRODUCT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoreLocation() <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreLocation() <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreLocation()
	 * @generated
	 * @ordered
	 */
	protected String storeLocation = STORE_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepomodelPackage.Literals.RPROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RPROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RClass> getRClasses() {
		if (rClasses == null) {
			rClasses = new EObjectContainmentWithInverseEList<RClass>(RClass.class, this, RepomodelPackage.RPROJECT__RCLASSES, RepomodelPackage.RCLASS__RPROJECT);
		}
		return rClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainingFolders() {
		return containingFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingFolders(String newContainingFolders) {
		String oldContainingFolders = containingFolders;
		containingFolders = newContainingFolders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RPROJECT__CONTAINING_FOLDERS, oldContainingFolders, containingFolders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductPath() {
		return productPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductPath(String newProductPath) {
		String oldProductPath = productPath;
		productPath = newProductPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RPROJECT__PRODUCT_PATH, oldProductPath, productPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoreLocation() {
		return storeLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreLocation(String newStoreLocation) {
		String oldStoreLocation = storeLocation;
		storeLocation = newStoreLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RPROJECT__STORE_LOCATION, oldStoreLocation, storeLocation));
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
			case RepomodelPackage.RPROJECT__RCLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRClasses()).basicAdd(otherEnd, msgs);
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
			case RepomodelPackage.RPROJECT__RCLASSES:
				return ((InternalEList<?>)getRClasses()).basicRemove(otherEnd, msgs);
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
			case RepomodelPackage.RPROJECT__NAME:
				return getName();
			case RepomodelPackage.RPROJECT__RCLASSES:
				return getRClasses();
			case RepomodelPackage.RPROJECT__CONTAINING_FOLDERS:
				return getContainingFolders();
			case RepomodelPackage.RPROJECT__PRODUCT_PATH:
				return getProductPath();
			case RepomodelPackage.RPROJECT__STORE_LOCATION:
				return getStoreLocation();
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
			case RepomodelPackage.RPROJECT__NAME:
				setName((String)newValue);
				return;
			case RepomodelPackage.RPROJECT__RCLASSES:
				getRClasses().clear();
				getRClasses().addAll((Collection<? extends RClass>)newValue);
				return;
			case RepomodelPackage.RPROJECT__CONTAINING_FOLDERS:
				setContainingFolders((String)newValue);
				return;
			case RepomodelPackage.RPROJECT__PRODUCT_PATH:
				setProductPath((String)newValue);
				return;
			case RepomodelPackage.RPROJECT__STORE_LOCATION:
				setStoreLocation((String)newValue);
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
			case RepomodelPackage.RPROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RepomodelPackage.RPROJECT__RCLASSES:
				getRClasses().clear();
				return;
			case RepomodelPackage.RPROJECT__CONTAINING_FOLDERS:
				setContainingFolders(CONTAINING_FOLDERS_EDEFAULT);
				return;
			case RepomodelPackage.RPROJECT__PRODUCT_PATH:
				setProductPath(PRODUCT_PATH_EDEFAULT);
				return;
			case RepomodelPackage.RPROJECT__STORE_LOCATION:
				setStoreLocation(STORE_LOCATION_EDEFAULT);
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
			case RepomodelPackage.RPROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RepomodelPackage.RPROJECT__RCLASSES:
				return rClasses != null && !rClasses.isEmpty();
			case RepomodelPackage.RPROJECT__CONTAINING_FOLDERS:
				return CONTAINING_FOLDERS_EDEFAULT == null ? containingFolders != null : !CONTAINING_FOLDERS_EDEFAULT.equals(containingFolders);
			case RepomodelPackage.RPROJECT__PRODUCT_PATH:
				return PRODUCT_PATH_EDEFAULT == null ? productPath != null : !PRODUCT_PATH_EDEFAULT.equals(productPath);
			case RepomodelPackage.RPROJECT__STORE_LOCATION:
				return STORE_LOCATION_EDEFAULT == null ? storeLocation != null : !STORE_LOCATION_EDEFAULT.equals(storeLocation);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", containingFolders: ");
		result.append(containingFolders);
		result.append(", productPath: ");
		result.append(productPath);
		result.append(", storeLocation: ");
		result.append(storeLocation);
		result.append(')');
		return result.toString();
	}

} //RProjectImpl

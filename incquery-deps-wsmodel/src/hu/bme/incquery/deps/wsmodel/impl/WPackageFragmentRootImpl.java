/**
 */
package hu.bme.incquery.deps.wsmodel.impl;

import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WPackageFragment;
import hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot;
import hu.bme.incquery.deps.wsmodel.WProject;
import hu.bme.incquery.deps.wsmodel.WsmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WPackage Fragment Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentRootImpl#getProject <em>Project</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentRootImpl#getPackageFragments <em>Package Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WPackageFragmentRootImpl extends WNamedElementImpl implements WPackageFragmentRoot {
	/**
	 * The cached value of the '{@link #getPackageFragments() <em>Package Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<WPackageFragment> packageFragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WPackageFragmentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsmodelPackage.Literals.WPACKAGE_FRAGMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WProject getProject() {
		if (eContainerFeatureID() != WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT) return null;
		return (WProject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(WProject newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(WProject newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, WsmodelPackage.WPROJECT__PACKAGE_FRAGMENT_ROOTS, WProject.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WPackageFragment> getPackageFragments() {
		if (packageFragments == null) {
			packageFragments = new EObjectContainmentWithInverseEList<WPackageFragment>(WPackageFragment.class, this, WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS, WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT);
		}
		return packageFragments;
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
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((WProject)otherEnd, msgs);
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageFragments()).basicAdd(otherEnd, msgs);
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
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT:
				return basicSetProject(null, msgs);
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				return ((InternalEList<?>)getPackageFragments()).basicRemove(otherEnd, msgs);
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
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT:
				return eInternalContainer().eInverseRemove(this, WsmodelPackage.WPROJECT__PACKAGE_FRAGMENT_ROOTS, WProject.class, msgs);
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
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT:
				return getProject();
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				return getPackageFragments();
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
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT:
				setProject((WProject)newValue);
				return;
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				getPackageFragments().clear();
				getPackageFragments().addAll((Collection<? extends WPackageFragment>)newValue);
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
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT:
				setProject((WProject)null);
				return;
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				getPackageFragments().clear();
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
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT:
				return getProject() != null;
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				return packageFragments != null && !packageFragments.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return String.format("%s (pfr%s)", getName(), getHandler());
	}

	/**
	 * @generated NOT
	 */
	@Override
	public WNamedElement getParent() {
		return getProject();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EList<? extends WNamedElement> getChildren() {
		return getPackageFragments();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void setParent(WNamedElement parent) {
		if (parent instanceof WProject) {
			this.setProject((WProject) parent);
		} else {
			throw new RuntimeException("Wrong parent type");
		}
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void addChild(WNamedElement child) {
		if (child instanceof WPackageFragment) {
			getPackageFragments().add((WPackageFragment) child);
		} else {
			throw new RuntimeException("Wrong type passed");
		}
	}

} //WPackageFragmentRootImpl

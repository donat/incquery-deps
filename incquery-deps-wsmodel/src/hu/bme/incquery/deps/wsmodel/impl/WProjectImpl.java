/**
 */
package hu.bme.incquery.deps.wsmodel.impl;

import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot;
import hu.bme.incquery.deps.wsmodel.WProject;
import hu.bme.incquery.deps.wsmodel.WWorkspace;
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
 * An implementation of the model object '<em><b>WProject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WProjectImpl#getPackageFragmentRoots <em>Package Fragment Roots</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WProjectImpl#getWorkspace <em>Workspace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WProjectImpl extends WNamedElementImpl implements WProject {
	/**
	 * The cached value of the '{@link #getPackageFragmentRoots() <em>Package Fragment Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageFragmentRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<WPackageFragmentRoot> packageFragmentRoots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsmodelPackage.Literals.WPROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WPackageFragmentRoot> getPackageFragmentRoots() {
		if (packageFragmentRoots == null) {
			packageFragmentRoots = new EObjectContainmentWithInverseEList<WPackageFragmentRoot>(WPackageFragmentRoot.class, this, WsmodelPackage.WPROJECT__PACKAGE_FRAGMENT_ROOTS, WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PROJECT);
		}
		return packageFragmentRoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WWorkspace getWorkspace() {
		if (eContainerFeatureID() != WsmodelPackage.WPROJECT__WORKSPACE) return null;
		return (WWorkspace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkspace(WWorkspace newWorkspace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorkspace, WsmodelPackage.WPROJECT__WORKSPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkspace(WWorkspace newWorkspace) {
		if (newWorkspace != eInternalContainer() || (eContainerFeatureID() != WsmodelPackage.WPROJECT__WORKSPACE && newWorkspace != null)) {
			if (EcoreUtil.isAncestor(this, newWorkspace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkspace != null)
				msgs = ((InternalEObject)newWorkspace).eInverseAdd(this, WsmodelPackage.WWORKSPACE__PROJECTS, WWorkspace.class, msgs);
			msgs = basicSetWorkspace(newWorkspace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsmodelPackage.WPROJECT__WORKSPACE, newWorkspace, newWorkspace));
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
			case WsmodelPackage.WPROJECT__PACKAGE_FRAGMENT_ROOTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageFragmentRoots()).basicAdd(otherEnd, msgs);
			case WsmodelPackage.WPROJECT__WORKSPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkspace((WWorkspace)otherEnd, msgs);
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
			case WsmodelPackage.WPROJECT__PACKAGE_FRAGMENT_ROOTS:
				return ((InternalEList<?>)getPackageFragmentRoots()).basicRemove(otherEnd, msgs);
			case WsmodelPackage.WPROJECT__WORKSPACE:
				return basicSetWorkspace(null, msgs);
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
			case WsmodelPackage.WPROJECT__WORKSPACE:
				return eInternalContainer().eInverseRemove(this, WsmodelPackage.WWORKSPACE__PROJECTS, WWorkspace.class, msgs);
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
			case WsmodelPackage.WPROJECT__PACKAGE_FRAGMENT_ROOTS:
				return getPackageFragmentRoots();
			case WsmodelPackage.WPROJECT__WORKSPACE:
				return getWorkspace();
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
			case WsmodelPackage.WPROJECT__PACKAGE_FRAGMENT_ROOTS:
				getPackageFragmentRoots().clear();
				getPackageFragmentRoots().addAll((Collection<? extends WPackageFragmentRoot>)newValue);
				return;
			case WsmodelPackage.WPROJECT__WORKSPACE:
				setWorkspace((WWorkspace)newValue);
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
			case WsmodelPackage.WPROJECT__PACKAGE_FRAGMENT_ROOTS:
				getPackageFragmentRoots().clear();
				return;
			case WsmodelPackage.WPROJECT__WORKSPACE:
				setWorkspace((WWorkspace)null);
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
			case WsmodelPackage.WPROJECT__PACKAGE_FRAGMENT_ROOTS:
				return packageFragmentRoots != null && !packageFragmentRoots.isEmpty();
			case WsmodelPackage.WPROJECT__WORKSPACE:
				return getWorkspace() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return String.format("%s (pr%s)", name, handler);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public WNamedElement getParent() {
		return null;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public EList<? extends WNamedElement> getChildren() {
		return getPackageFragmentRoots();
	}
	

	/**
	 * @generated NOT
	 */
	@Override
	public void setParent(WNamedElement parent) {
		//System.err.println("JavaProject does not have a parent, so do not set it.");
		// Do nothing.
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void addChild(WNamedElement child) {
		if (child instanceof WPackageFragmentRoot) {
			getPackageFragmentRoots().add((WPackageFragmentRoot) child);	
		}
		else {
			throw new RuntimeException("Wrong type passed");
		}
	}
	
} //WProjectImpl

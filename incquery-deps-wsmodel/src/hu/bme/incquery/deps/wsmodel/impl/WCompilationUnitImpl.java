/**
 */
package hu.bme.incquery.deps.wsmodel.impl;

import hu.bme.incquery.deps.wsmodel.WCompilationUnit;
import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WPackageFragment;
import hu.bme.incquery.deps.wsmodel.WType;
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
 * An implementation of the model object '<em><b>WCompilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WCompilationUnitImpl#getPackageFragment <em>Package Fragment</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WCompilationUnitImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WCompilationUnitImpl extends WNamedElementImpl implements WCompilationUnit {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<WType> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WCompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsmodelPackage.Literals.WCOMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WPackageFragment getPackageFragment() {
		if (eContainerFeatureID() != WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT) return null;
		return (WPackageFragment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageFragment(WPackageFragment newPackageFragment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackageFragment, WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageFragment(WPackageFragment newPackageFragment) {
		if (newPackageFragment != eInternalContainer() || (eContainerFeatureID() != WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT && newPackageFragment != null)) {
			if (EcoreUtil.isAncestor(this, newPackageFragment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackageFragment != null)
				msgs = ((InternalEObject)newPackageFragment).eInverseAdd(this, WsmodelPackage.WPACKAGE_FRAGMENT__COMPILATION_UNITS, WPackageFragment.class, msgs);
			msgs = basicSetPackageFragment(newPackageFragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT, newPackageFragment, newPackageFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<WType>(WType.class, this, WsmodelPackage.WCOMPILATION_UNIT__TYPES, WsmodelPackage.WTYPE__COMPILATION_UNIT);
		}
		return types;
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
			case WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackageFragment((WPackageFragment)otherEnd, msgs);
			case WsmodelPackage.WCOMPILATION_UNIT__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
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
			case WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT:
				return basicSetPackageFragment(null, msgs);
			case WsmodelPackage.WCOMPILATION_UNIT__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT:
				return eInternalContainer().eInverseRemove(this, WsmodelPackage.WPACKAGE_FRAGMENT__COMPILATION_UNITS, WPackageFragment.class, msgs);
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
			case WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT:
				return getPackageFragment();
			case WsmodelPackage.WCOMPILATION_UNIT__TYPES:
				return getTypes();
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
			case WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT:
				setPackageFragment((WPackageFragment)newValue);
				return;
			case WsmodelPackage.WCOMPILATION_UNIT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends WType>)newValue);
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
			case WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT:
				setPackageFragment((WPackageFragment)null);
				return;
			case WsmodelPackage.WCOMPILATION_UNIT__TYPES:
				getTypes().clear();
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
			case WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT:
				return getPackageFragment() != null;
			case WsmodelPackage.WCOMPILATION_UNIT__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return String.format("%s (cu%s)", getName(), getHandler());
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public WNamedElement getParent() {
		return getPackageFragment();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EList<? extends WNamedElement> getChildren() {
		return getTypes();
	}
	
	
	/**
	 * @generated NOT
	 */
	@Override
	public void setParent(WNamedElement parent) {
		if (parent instanceof WPackageFragment) {
			this.setPackageFragment((WPackageFragment) parent);
		}
		else {
			throw new RuntimeException("Wrong parent type");
		}
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void addChild(WNamedElement child) {
		if (child instanceof WType) {
			getTypes().add((WType) child);	
		}
		else {
			throw new RuntimeException("Wrong type passed");
		}
	}


} //WCompilationUnitImpl

/**
 */
package hu.bme.incquery.deps.wsmodel.impl;

import hu.bme.incquery.deps.wsmodel.WCompilationUnit;
import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WPackageFragment;
import hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot;
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
 * An implementation of the model object '<em><b>WPackage Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentImpl#getPackageFragmentRoot <em>Package Fragment Root</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WPackageFragmentImpl extends WNamedElementImpl implements WPackageFragment {
	/**
	 * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<WCompilationUnit> compilationUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WPackageFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsmodelPackage.Literals.WPACKAGE_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WPackageFragmentRoot getPackageFragmentRoot() {
		if (eContainerFeatureID() != WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT) return null;
		return (WPackageFragmentRoot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageFragmentRoot(WPackageFragmentRoot newPackageFragmentRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackageFragmentRoot, WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageFragmentRoot(WPackageFragmentRoot newPackageFragmentRoot) {
		if (newPackageFragmentRoot != eInternalContainer() || (eContainerFeatureID() != WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT && newPackageFragmentRoot != null)) {
			if (EcoreUtil.isAncestor(this, newPackageFragmentRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackageFragmentRoot != null)
				msgs = ((InternalEObject)newPackageFragmentRoot).eInverseAdd(this, WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS, WPackageFragmentRoot.class, msgs);
			msgs = basicSetPackageFragmentRoot(newPackageFragmentRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, newPackageFragmentRoot, newPackageFragmentRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WCompilationUnit> getCompilationUnits() {
		if (compilationUnits == null) {
			compilationUnits = new EObjectContainmentWithInverseEList<WCompilationUnit>(WCompilationUnit.class, this, WsmodelPackage.WPACKAGE_FRAGMENT__COMPILATION_UNITS, WsmodelPackage.WCOMPILATION_UNIT__PACKAGE_FRAGMENT);
		}
		return compilationUnits;
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
			case WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackageFragmentRoot((WPackageFragmentRoot)otherEnd, msgs);
			case WsmodelPackage.WPACKAGE_FRAGMENT__COMPILATION_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompilationUnits()).basicAdd(otherEnd, msgs);
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
			case WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return basicSetPackageFragmentRoot(null, msgs);
			case WsmodelPackage.WPACKAGE_FRAGMENT__COMPILATION_UNITS:
				return ((InternalEList<?>)getCompilationUnits()).basicRemove(otherEnd, msgs);
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
			case WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return eInternalContainer().eInverseRemove(this, WsmodelPackage.WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS, WPackageFragmentRoot.class, msgs);
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
			case WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return getPackageFragmentRoot();
			case WsmodelPackage.WPACKAGE_FRAGMENT__COMPILATION_UNITS:
				return getCompilationUnits();
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
			case WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				setPackageFragmentRoot((WPackageFragmentRoot)newValue);
				return;
			case WsmodelPackage.WPACKAGE_FRAGMENT__COMPILATION_UNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((Collection<? extends WCompilationUnit>)newValue);
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
			case WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				setPackageFragmentRoot((WPackageFragmentRoot)null);
				return;
			case WsmodelPackage.WPACKAGE_FRAGMENT__COMPILATION_UNITS:
				getCompilationUnits().clear();
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
			case WsmodelPackage.WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return getPackageFragmentRoot() != null;
			case WsmodelPackage.WPACKAGE_FRAGMENT__COMPILATION_UNITS:
				return compilationUnits != null && !compilationUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return String.format("%s (p%s)", name, getHandler());
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public WNamedElement getParent() {
		return getPackageFragmentRoot();
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public EList<? extends WNamedElement> getChildren() {
		return getCompilationUnits();
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void setParent(WNamedElement parent) {
		if (parent instanceof WPackageFragmentRoot) {
			this.setPackageFragmentRoot((WPackageFragmentRoot) parent);
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
		if (child instanceof WCompilationUnit) {
			getCompilationUnits().add((WCompilationUnit) child);	
		}
		else {
			throw new RuntimeException("Wrong type passed");
		}
	}

} //WPackageFragmentImpl

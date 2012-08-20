/**
 */
package cern.devtools.depanalysis.wsmodel.impl;

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

import cern.devtools.depanalysis.wsmodel.CompilationUnit;
import cern.devtools.depanalysis.wsmodel.JavaModelPackage;
import cern.devtools.depanalysis.wsmodel.NamedElement;
import cern.devtools.depanalysis.wsmodel.PackageFragment;
import cern.devtools.depanalysis.wsmodel.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.CompilationUnitImpl#getPackageFragment <em>Package Fragment</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.CompilationUnitImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilationUnitImpl extends NamedElementImpl implements CompilationUnit {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaModelPackage.Literals.COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFragment getPackageFragment() {
		if (eContainerFeatureID() != JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT) return null;
		return (PackageFragment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageFragment(PackageFragment newPackageFragment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackageFragment, JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageFragment(PackageFragment newPackageFragment) {
		if (newPackageFragment != eInternalContainer() || (eContainerFeatureID() != JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT && newPackageFragment != null)) {
			if (EcoreUtil.isAncestor(this, newPackageFragment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackageFragment != null)
				msgs = ((InternalEObject)newPackageFragment).eInverseAdd(this, JavaModelPackage.PACKAGE_FRAGMENT__COMPILATION_UNITS, PackageFragment.class, msgs);
			msgs = basicSetPackageFragment(newPackageFragment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT, newPackageFragment, newPackageFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<Type>(Type.class, this, JavaModelPackage.COMPILATION_UNIT__TYPES, JavaModelPackage.TYPE__COMPILATION_UNIT);
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
			case JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackageFragment((PackageFragment)otherEnd, msgs);
			case JavaModelPackage.COMPILATION_UNIT__TYPES:
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
			case JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT:
				return basicSetPackageFragment(null, msgs);
			case JavaModelPackage.COMPILATION_UNIT__TYPES:
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
			case JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT:
				return eInternalContainer().eInverseRemove(this, JavaModelPackage.PACKAGE_FRAGMENT__COMPILATION_UNITS, PackageFragment.class, msgs);
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
			case JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT:
				return getPackageFragment();
			case JavaModelPackage.COMPILATION_UNIT__TYPES:
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
			case JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT:
				setPackageFragment((PackageFragment)newValue);
				return;
			case JavaModelPackage.COMPILATION_UNIT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
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
			case JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT:
				setPackageFragment((PackageFragment)null);
				return;
			case JavaModelPackage.COMPILATION_UNIT__TYPES:
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
			case JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT:
				return getPackageFragment() != null;
			case JavaModelPackage.COMPILATION_UNIT__TYPES:
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
	public NamedElement getParent() {
		return getPackageFragment();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EList<? extends NamedElement> getChildren() {
		return getTypes();
	}
	
	
	/**
	 * @generated NOT
	 */
	@Override
	public void setParent(NamedElement parent) {
		if (parent instanceof PackageFragment) {
			this.setPackageFragment((PackageFragment) parent);
		}
		else {
			throw new RuntimeException("Wrong parent type");
		}
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void addChild(NamedElement child) {
		if (child instanceof Type) {
			getTypes().add((Type) child);	
		}
		else {
			throw new RuntimeException("Wrong type passed");
		}
	}

} //CompilationUnitImpl

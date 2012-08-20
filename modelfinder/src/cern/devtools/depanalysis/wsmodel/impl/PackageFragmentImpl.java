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
import cern.devtools.depanalysis.wsmodel.PackageFragmentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.PackageFragmentImpl#getPackageFragmentRoot <em>Package Fragment Root</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.PackageFragmentImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageFragmentImpl extends NamedElementImpl implements PackageFragment {
	/**
	 * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> compilationUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaModelPackage.Literals.PACKAGE_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFragmentRoot getPackageFragmentRoot() {
		if (eContainerFeatureID() != JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT) return null;
		return (PackageFragmentRoot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageFragmentRoot(PackageFragmentRoot newPackageFragmentRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackageFragmentRoot, JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageFragmentRoot(PackageFragmentRoot newPackageFragmentRoot) {
		if (newPackageFragmentRoot != eInternalContainer() || (eContainerFeatureID() != JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT && newPackageFragmentRoot != null)) {
			if (EcoreUtil.isAncestor(this, newPackageFragmentRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackageFragmentRoot != null)
				msgs = ((InternalEObject)newPackageFragmentRoot).eInverseAdd(this, JavaModelPackage.PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS, PackageFragmentRoot.class, msgs);
			msgs = basicSetPackageFragmentRoot(newPackageFragmentRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT, newPackageFragmentRoot, newPackageFragmentRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompilationUnit> getCompilationUnits() {
		if (compilationUnits == null) {
			compilationUnits = new EObjectContainmentWithInverseEList<CompilationUnit>(CompilationUnit.class, this, JavaModelPackage.PACKAGE_FRAGMENT__COMPILATION_UNITS, JavaModelPackage.COMPILATION_UNIT__PACKAGE_FRAGMENT);
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
			case JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackageFragmentRoot((PackageFragmentRoot)otherEnd, msgs);
			case JavaModelPackage.PACKAGE_FRAGMENT__COMPILATION_UNITS:
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
			case JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return basicSetPackageFragmentRoot(null, msgs);
			case JavaModelPackage.PACKAGE_FRAGMENT__COMPILATION_UNITS:
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
			case JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return eInternalContainer().eInverseRemove(this, JavaModelPackage.PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS, PackageFragmentRoot.class, msgs);
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
			case JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return getPackageFragmentRoot();
			case JavaModelPackage.PACKAGE_FRAGMENT__COMPILATION_UNITS:
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
			case JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				setPackageFragmentRoot((PackageFragmentRoot)newValue);
				return;
			case JavaModelPackage.PACKAGE_FRAGMENT__COMPILATION_UNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((Collection<? extends CompilationUnit>)newValue);
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
			case JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				setPackageFragmentRoot((PackageFragmentRoot)null);
				return;
			case JavaModelPackage.PACKAGE_FRAGMENT__COMPILATION_UNITS:
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
			case JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT:
				return getPackageFragmentRoot() != null;
			case JavaModelPackage.PACKAGE_FRAGMENT__COMPILATION_UNITS:
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
	public NamedElement getParent() {
		return getPackageFragmentRoot();
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public EList<? extends NamedElement> getChildren() {
		return getCompilationUnits();
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void setParent(NamedElement parent) {
		if (parent instanceof PackageFragmentRoot) {
			this.setPackageFragmentRoot((PackageFragmentRoot) parent);
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
		if (child instanceof CompilationUnit) {
			getCompilationUnits().add((CompilationUnit) child);	
		}
		else {
			throw new RuntimeException("Wrong type passed");
		}
	}

} //PackageFragmentImpl

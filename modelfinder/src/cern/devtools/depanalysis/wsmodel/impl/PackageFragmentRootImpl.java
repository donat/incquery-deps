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

import cern.devtools.depanalysis.wsmodel.JavaModelPackage;
import cern.devtools.depanalysis.wsmodel.JavaProject;
import cern.devtools.depanalysis.wsmodel.NamedElement;
import cern.devtools.depanalysis.wsmodel.PackageFragment;
import cern.devtools.depanalysis.wsmodel.PackageFragmentRoot;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Package Fragment Root</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.PackageFragmentRootImpl#getJavaProject <em>Java Project</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.PackageFragmentRootImpl#getPackageFragments <em>Package Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageFragmentRootImpl extends NamedElementImpl implements PackageFragmentRoot {
	/**
	 * The cached value of the '{@link #getPackageFragments() <em>Package Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackageFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageFragment> packageFragments;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageFragmentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaModelPackage.Literals.PACKAGE_FRAGMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JavaProject getJavaProject() {
		if (eContainerFeatureID() != JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT) return null;
		return (JavaProject)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaProject(JavaProject newJavaProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newJavaProject, JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaProject(JavaProject newJavaProject) {
		if (newJavaProject != eInternalContainer() || (eContainerFeatureID() != JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT && newJavaProject != null)) {
			if (EcoreUtil.isAncestor(this, newJavaProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJavaProject != null)
				msgs = ((InternalEObject)newJavaProject).eInverseAdd(this, JavaModelPackage.JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS, JavaProject.class, msgs);
			msgs = basicSetJavaProject(newJavaProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT, newJavaProject, newJavaProject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageFragment> getPackageFragments() {
		if (packageFragments == null) {
			packageFragments = new EObjectContainmentWithInverseEList<PackageFragment>(PackageFragment.class, this, JavaModelPackage.PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS, JavaModelPackage.PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT);
		}
		return packageFragments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetJavaProject((JavaProject)otherEnd, msgs);
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageFragments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT:
				return basicSetJavaProject(null, msgs);
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				return ((InternalEList<?>)getPackageFragments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT:
				return eInternalContainer().eInverseRemove(this, JavaModelPackage.JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS, JavaProject.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT:
				return getJavaProject();
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				return getPackageFragments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT:
				setJavaProject((JavaProject)newValue);
				return;
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				getPackageFragments().clear();
				getPackageFragments().addAll((Collection<? extends PackageFragment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT:
				setJavaProject((JavaProject)null);
				return;
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
				getPackageFragments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT:
				return getJavaProject() != null;
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS:
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
	public NamedElement getParent() {
		return getJavaProject();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EList<? extends NamedElement> getChildren() {
		return getPackageFragments();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void setParent(NamedElement parent) {
		if (parent instanceof JavaProject) {
			this.setJavaProject((JavaProject) parent);
		} else {
			throw new RuntimeException("Wrong parent type");
		}
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void addChild(NamedElement child) {
		if (child instanceof PackageFragment) {
			getPackageFragments().add((PackageFragment) child);
		} else {
			throw new RuntimeException("Wrong type passed");
		}
	}

} // PackageFragmentRootImpl

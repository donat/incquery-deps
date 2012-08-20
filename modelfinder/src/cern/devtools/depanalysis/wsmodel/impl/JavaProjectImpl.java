/**
 */
package cern.devtools.depanalysis.wsmodel.impl;

import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
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
import cern.devtools.depanalysis.wsmodel.PackageFragmentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.JavaProjectImpl#getPackageFragmentRoots <em>Package Fragment Roots</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.JavaProjectImpl#getEclipseWorkspace <em>Eclipse Workspace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaProjectImpl extends NamedElementImpl implements JavaProject {
	/**
	 * The cached value of the '{@link #getPackageFragmentRoots() <em>Package Fragment Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageFragmentRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageFragmentRoot> packageFragmentRoots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaModelPackage.Literals.JAVA_PROJECT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageFragmentRoot> getPackageFragmentRoots() {
		if (packageFragmentRoots == null) {
			packageFragmentRoots = new EObjectContainmentWithInverseEList<PackageFragmentRoot>(PackageFragmentRoot.class, this, JavaModelPackage.JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS, JavaModelPackage.PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT);
		}
		return packageFragmentRoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseWorkspace getEclipseWorkspace() {
		if (eContainerFeatureID() != JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE) return null;
		return (EclipseWorkspace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEclipseWorkspace(EclipseWorkspace newEclipseWorkspace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEclipseWorkspace, JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEclipseWorkspace(EclipseWorkspace newEclipseWorkspace) {
		if (newEclipseWorkspace != eInternalContainer() || (eContainerFeatureID() != JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE && newEclipseWorkspace != null)) {
			if (EcoreUtil.isAncestor(this, newEclipseWorkspace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEclipseWorkspace != null)
				msgs = ((InternalEObject)newEclipseWorkspace).eInverseAdd(this, JavaModelPackage.ECLIPSE_WORKSPACE__PROJECTS, EclipseWorkspace.class, msgs);
			msgs = basicSetEclipseWorkspace(newEclipseWorkspace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE, newEclipseWorkspace, newEclipseWorkspace));
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
			case JavaModelPackage.JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageFragmentRoots()).basicAdd(otherEnd, msgs);
			case JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEclipseWorkspace((EclipseWorkspace)otherEnd, msgs);
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
			case JavaModelPackage.JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				return ((InternalEList<?>)getPackageFragmentRoots()).basicRemove(otherEnd, msgs);
			case JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE:
				return basicSetEclipseWorkspace(null, msgs);
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
			case JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE:
				return eInternalContainer().eInverseRemove(this, JavaModelPackage.ECLIPSE_WORKSPACE__PROJECTS, EclipseWorkspace.class, msgs);
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
			case JavaModelPackage.JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				return getPackageFragmentRoots();
			case JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE:
				return getEclipseWorkspace();
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
			case JavaModelPackage.JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				getPackageFragmentRoots().clear();
				getPackageFragmentRoots().addAll((Collection<? extends PackageFragmentRoot>)newValue);
				return;
			case JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE:
				setEclipseWorkspace((EclipseWorkspace)newValue);
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
			case JavaModelPackage.JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				getPackageFragmentRoots().clear();
				return;
			case JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE:
				setEclipseWorkspace((EclipseWorkspace)null);
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
			case JavaModelPackage.JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS:
				return packageFragmentRoots != null && !packageFragmentRoots.isEmpty();
			case JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE:
				return getEclipseWorkspace() != null;
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
	public NamedElement getParent() {
		return null;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public EList<? extends NamedElement> getChildren() {
		return getPackageFragmentRoots();
	}
	

	/**
	 * @generated NOT
	 */
	@Override
	public void setParent(NamedElement parent) {
		//System.err.println("JavaProject does not have a parent, so do not set it.");
		// Do nothing.
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void addChild(NamedElement child) {
		if (child instanceof PackageFragmentRoot) {
			getPackageFragmentRoots().add((PackageFragmentRoot) child);	
		}
		else {
			throw new RuntimeException("Wrong type passed");
		}
	}

} //JavaProjectImpl

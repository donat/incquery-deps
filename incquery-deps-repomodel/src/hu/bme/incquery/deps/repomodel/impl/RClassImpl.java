/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.impl;

import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.repomodel.RField;
import hu.bme.incquery.deps.repomodel.RMethod;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#getRMethods <em>RMethods</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#getRFields <em>RFields</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#getRProject <em>RProject</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#getReferencedClasses <em>Referenced Classes</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl#getFqName <em>Fq Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RClassImpl extends RCodeElementImpl implements RClass {
	/**
	 * The default value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected String simpleName = SIMPLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRMethods() <em>RMethods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<RMethod> rMethods;

	/**
	 * The cached value of the '{@link #getRFields() <em>RFields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFields()
	 * @generated
	 * @ordered
	 */
	protected EList<RField> rFields;

	/**
	 * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected String extends_ = EXTENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplements() <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected String implements_ = IMPLEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected boolean private_ = PRIVATE_EDEFAULT;

	/**
	 * This is true if the Private attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean privateESet;

	/**
	 * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean anonymous = ANONYMOUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedClasses() <em>Referenced Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> referencedClasses;

	/**
	 * The default value of the '{@link #getFqName() <em>Fq Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqName()
	 * @generated
	 * @ordered
	 */
	protected static final String FQ_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFqName() <em>Fq Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqName()
	 * @generated
	 * @ordered
	 */
	protected String fqName = FQ_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepomodelPackage.Literals.RCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleName() {
		return simpleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleName(String newSimpleName) {
		String oldSimpleName = simpleName;
		simpleName = newSimpleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RCLASS__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RCLASS__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RMethod> getRMethods() {
		if (rMethods == null) {
			rMethods = new EObjectContainmentWithInverseEList<RMethod>(RMethod.class, this, RepomodelPackage.RCLASS__RMETHODS, RepomodelPackage.RMETHOD__RCLASS);
		}
		return rMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RField> getRFields() {
		if (rFields == null) {
			rFields = new EObjectContainmentWithInverseEList<RField>(RField.class, this, RepomodelPackage.RCLASS__RFIELDS, RepomodelPackage.RFIELD__RCLASS);
		}
		return rFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RProject getRProject() {
		if (eContainerFeatureID() != RepomodelPackage.RCLASS__RPROJECT) return null;
		return (RProject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRProject(RProject newRProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRProject, RepomodelPackage.RCLASS__RPROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRProject(RProject newRProject) {
		if (newRProject != eInternalContainer() || (eContainerFeatureID() != RepomodelPackage.RCLASS__RPROJECT && newRProject != null)) {
			if (EcoreUtil.isAncestor(this, newRProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRProject != null)
				msgs = ((InternalEObject)newRProject).eInverseAdd(this, RepomodelPackage.RPROJECT__RCLASSES, RProject.class, msgs);
			msgs = basicSetRProject(newRProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RCLASS__RPROJECT, newRProject, newRProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(String newExtends) {
		String oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RCLASS__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(String newImplements) {
		String oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RCLASS__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(boolean newPrivate) {
		boolean oldPrivate = private_;
		private_ = newPrivate;
		boolean oldPrivateESet = privateESet;
		privateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RCLASS__PRIVATE, oldPrivate, private_, !oldPrivateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrivate() {
		boolean oldPrivate = private_;
		boolean oldPrivateESet = privateESet;
		private_ = PRIVATE_EDEFAULT;
		privateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RepomodelPackage.RCLASS__PRIVATE, oldPrivate, PRIVATE_EDEFAULT, oldPrivateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrivate() {
		return privateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnonymous() {
		return anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymous(boolean newAnonymous) {
		boolean oldAnonymous = anonymous;
		anonymous = newAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RCLASS__ANONYMOUS, oldAnonymous, anonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReferencedClasses() {
		return referencedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedClasses(EList<String> newReferencedClasses) {
		EList<String> oldReferencedClasses = referencedClasses;
		referencedClasses = newReferencedClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RCLASS__REFERENCED_CLASSES, oldReferencedClasses, referencedClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFqName() {
		return fqName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFqName(String newFqName) {
		String oldFqName = fqName;
		fqName = newFqName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepomodelPackage.RCLASS__FQ_NAME, oldFqName, fqName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourcePath() {
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
			case RepomodelPackage.RCLASS__RMETHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRMethods()).basicAdd(otherEnd, msgs);
			case RepomodelPackage.RCLASS__RFIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRFields()).basicAdd(otherEnd, msgs);
			case RepomodelPackage.RCLASS__RPROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRProject((RProject)otherEnd, msgs);
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
			case RepomodelPackage.RCLASS__RMETHODS:
				return ((InternalEList<?>)getRMethods()).basicRemove(otherEnd, msgs);
			case RepomodelPackage.RCLASS__RFIELDS:
				return ((InternalEList<?>)getRFields()).basicRemove(otherEnd, msgs);
			case RepomodelPackage.RCLASS__RPROJECT:
				return basicSetRProject(null, msgs);
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
			case RepomodelPackage.RCLASS__RPROJECT:
				return eInternalContainer().eInverseRemove(this, RepomodelPackage.RPROJECT__RCLASSES, RProject.class, msgs);
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
			case RepomodelPackage.RCLASS__SIMPLE_NAME:
				return getSimpleName();
			case RepomodelPackage.RCLASS__PACKAGE_NAME:
				return getPackageName();
			case RepomodelPackage.RCLASS__RMETHODS:
				return getRMethods();
			case RepomodelPackage.RCLASS__RFIELDS:
				return getRFields();
			case RepomodelPackage.RCLASS__RPROJECT:
				return getRProject();
			case RepomodelPackage.RCLASS__EXTENDS:
				return getExtends();
			case RepomodelPackage.RCLASS__IMPLEMENTS:
				return getImplements();
			case RepomodelPackage.RCLASS__PRIVATE:
				return isPrivate();
			case RepomodelPackage.RCLASS__ANONYMOUS:
				return isAnonymous();
			case RepomodelPackage.RCLASS__REFERENCED_CLASSES:
				return getReferencedClasses();
			case RepomodelPackage.RCLASS__FQ_NAME:
				return getFqName();
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
			case RepomodelPackage.RCLASS__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case RepomodelPackage.RCLASS__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case RepomodelPackage.RCLASS__RMETHODS:
				getRMethods().clear();
				getRMethods().addAll((Collection<? extends RMethod>)newValue);
				return;
			case RepomodelPackage.RCLASS__RFIELDS:
				getRFields().clear();
				getRFields().addAll((Collection<? extends RField>)newValue);
				return;
			case RepomodelPackage.RCLASS__RPROJECT:
				setRProject((RProject)newValue);
				return;
			case RepomodelPackage.RCLASS__EXTENDS:
				setExtends((String)newValue);
				return;
			case RepomodelPackage.RCLASS__IMPLEMENTS:
				setImplements((String)newValue);
				return;
			case RepomodelPackage.RCLASS__PRIVATE:
				setPrivate((Boolean)newValue);
				return;
			case RepomodelPackage.RCLASS__ANONYMOUS:
				setAnonymous((Boolean)newValue);
				return;
			case RepomodelPackage.RCLASS__REFERENCED_CLASSES:
				setReferencedClasses((EList<String>)newValue);
				return;
			case RepomodelPackage.RCLASS__FQ_NAME:
				setFqName((String)newValue);
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
			case RepomodelPackage.RCLASS__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case RepomodelPackage.RCLASS__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case RepomodelPackage.RCLASS__RMETHODS:
				getRMethods().clear();
				return;
			case RepomodelPackage.RCLASS__RFIELDS:
				getRFields().clear();
				return;
			case RepomodelPackage.RCLASS__RPROJECT:
				setRProject((RProject)null);
				return;
			case RepomodelPackage.RCLASS__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case RepomodelPackage.RCLASS__IMPLEMENTS:
				setImplements(IMPLEMENTS_EDEFAULT);
				return;
			case RepomodelPackage.RCLASS__PRIVATE:
				unsetPrivate();
				return;
			case RepomodelPackage.RCLASS__ANONYMOUS:
				setAnonymous(ANONYMOUS_EDEFAULT);
				return;
			case RepomodelPackage.RCLASS__REFERENCED_CLASSES:
				setReferencedClasses((EList<String>)null);
				return;
			case RepomodelPackage.RCLASS__FQ_NAME:
				setFqName(FQ_NAME_EDEFAULT);
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
			case RepomodelPackage.RCLASS__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case RepomodelPackage.RCLASS__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case RepomodelPackage.RCLASS__RMETHODS:
				return rMethods != null && !rMethods.isEmpty();
			case RepomodelPackage.RCLASS__RFIELDS:
				return rFields != null && !rFields.isEmpty();
			case RepomodelPackage.RCLASS__RPROJECT:
				return getRProject() != null;
			case RepomodelPackage.RCLASS__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case RepomodelPackage.RCLASS__IMPLEMENTS:
				return IMPLEMENTS_EDEFAULT == null ? implements_ != null : !IMPLEMENTS_EDEFAULT.equals(implements_);
			case RepomodelPackage.RCLASS__PRIVATE:
				return isSetPrivate();
			case RepomodelPackage.RCLASS__ANONYMOUS:
				return anonymous != ANONYMOUS_EDEFAULT;
			case RepomodelPackage.RCLASS__REFERENCED_CLASSES:
				return referencedClasses != null;
			case RepomodelPackage.RCLASS__FQ_NAME:
				return FQ_NAME_EDEFAULT == null ? fqName != null : !FQ_NAME_EDEFAULT.equals(fqName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return "RClass[" + simpleName + "]";
	}
	
} //RClassImpl

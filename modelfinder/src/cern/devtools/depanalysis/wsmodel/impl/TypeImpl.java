/**
 */
package cern.devtools.depanalysis.wsmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import cern.devtools.depanalysis.wsmodel.CompilationUnit;
import cern.devtools.depanalysis.wsmodel.Field;
import cern.devtools.depanalysis.wsmodel.JavaModelPackage;
import cern.devtools.depanalysis.wsmodel.Method;
import cern.devtools.depanalysis.wsmodel.NamedElement;
import cern.devtools.depanalysis.wsmodel.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.TypeImpl#getCompilationUnit <em>Compilation Unit</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.TypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.TypeImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends NamedElementImpl implements Type {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> methods;
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaModelPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit getCompilationUnit() {
		if (eContainerFeatureID() != JavaModelPackage.TYPE__COMPILATION_UNIT) return null;
		return (CompilationUnit)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompilationUnit(CompilationUnit newCompilationUnit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompilationUnit, JavaModelPackage.TYPE__COMPILATION_UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompilationUnit(CompilationUnit newCompilationUnit) {
		if (newCompilationUnit != eInternalContainer() || (eContainerFeatureID() != JavaModelPackage.TYPE__COMPILATION_UNIT && newCompilationUnit != null)) {
			if (EcoreUtil.isAncestor(this, newCompilationUnit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompilationUnit != null)
				msgs = ((InternalEObject)newCompilationUnit).eInverseAdd(this, JavaModelPackage.COMPILATION_UNIT__TYPES, CompilationUnit.class, msgs);
			msgs = basicSetCompilationUnit(newCompilationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.TYPE__COMPILATION_UNIT, newCompilationUnit, newCompilationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<Method>(Method.class, this, JavaModelPackage.TYPE__METHODS, JavaModelPackage.METHOD__TYPE);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<Field>(Field.class, this, JavaModelPackage.TYPE__FIELDS, JavaModelPackage.FIELD__TYPE);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaModelPackage.TYPE__COMPILATION_UNIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompilationUnit((CompilationUnit)otherEnd, msgs);
			case JavaModelPackage.TYPE__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case JavaModelPackage.TYPE__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
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
			case JavaModelPackage.TYPE__COMPILATION_UNIT:
				return basicSetCompilationUnit(null, msgs);
			case JavaModelPackage.TYPE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case JavaModelPackage.TYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case JavaModelPackage.TYPE__COMPILATION_UNIT:
				return eInternalContainer().eInverseRemove(this, JavaModelPackage.COMPILATION_UNIT__TYPES, CompilationUnit.class, msgs);
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
			case JavaModelPackage.TYPE__COMPILATION_UNIT:
				return getCompilationUnit();
			case JavaModelPackage.TYPE__METHODS:
				return getMethods();
			case JavaModelPackage.TYPE__FIELDS:
				return getFields();
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
			case JavaModelPackage.TYPE__COMPILATION_UNIT:
				setCompilationUnit((CompilationUnit)newValue);
				return;
			case JavaModelPackage.TYPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends Method>)newValue);
				return;
			case JavaModelPackage.TYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
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
			case JavaModelPackage.TYPE__COMPILATION_UNIT:
				setCompilationUnit((CompilationUnit)null);
				return;
			case JavaModelPackage.TYPE__METHODS:
				getMethods().clear();
				return;
			case JavaModelPackage.TYPE__FIELDS:
				getFields().clear();
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
			case JavaModelPackage.TYPE__COMPILATION_UNIT:
				return getCompilationUnit() != null;
			case JavaModelPackage.TYPE__METHODS:
				return methods != null && !methods.isEmpty();
			case JavaModelPackage.TYPE__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return String.format("%s (t%s)", name, handler);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public NamedElement getParent() {
		return getCompilationUnit();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EList<? extends NamedElement> getChildren() {
		EList<NamedElement> methodsAndFields = new BasicEList<NamedElement>();
		methodsAndFields.addAll(getMethods());
		methodsAndFields.addAll(getFields());
		return methodsAndFields;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void setParent(NamedElement parent) {
		if (parent instanceof CompilationUnit) {
			this.setCompilationUnit((CompilationUnit) parent);
		} else {
			throw new RuntimeException("Wrong parent type");
		}
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void addChild(NamedElement child) {
		if (child instanceof Method) {
			getMethods().add((Method) child);
		}
		else {
			getFields().add((Field) child);
		}
	}

} // TypeImpl

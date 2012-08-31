/**
 */
package hu.bme.incquery.deps.wsmodel.impl;

import hu.bme.incquery.deps.wsmodel.WCompilationUnit;
import hu.bme.incquery.deps.wsmodel.WField;
import hu.bme.incquery.deps.wsmodel.WMethod;
import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WType;
import hu.bme.incquery.deps.wsmodel.WsmodelPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WTypeImpl#getCompilationUnit <em>Compilation Unit</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WTypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.impl.WTypeImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WTypeImpl extends WNamedElementImpl implements WType {
	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<WMethod> methods;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<WField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WsmodelPackage.Literals.WTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WCompilationUnit getCompilationUnit() {
		if (eContainerFeatureID() != WsmodelPackage.WTYPE__COMPILATION_UNIT) return null;
		return (WCompilationUnit)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompilationUnit(WCompilationUnit newCompilationUnit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompilationUnit, WsmodelPackage.WTYPE__COMPILATION_UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompilationUnit(WCompilationUnit newCompilationUnit) {
		if (newCompilationUnit != eInternalContainer() || (eContainerFeatureID() != WsmodelPackage.WTYPE__COMPILATION_UNIT && newCompilationUnit != null)) {
			if (EcoreUtil.isAncestor(this, newCompilationUnit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompilationUnit != null)
				msgs = ((InternalEObject)newCompilationUnit).eInverseAdd(this, WsmodelPackage.WCOMPILATION_UNIT__TYPES, WCompilationUnit.class, msgs);
			msgs = basicSetCompilationUnit(newCompilationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsmodelPackage.WTYPE__COMPILATION_UNIT, newCompilationUnit, newCompilationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentWithInverseEList<WMethod>(WMethod.class, this, WsmodelPackage.WTYPE__METHODS, WsmodelPackage.WMETHOD__TYPE);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<WField>(WField.class, this, WsmodelPackage.WTYPE__FIELDS, WsmodelPackage.WFIELD__TYPE);
		}
		return fields;
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
			case WsmodelPackage.WTYPE__COMPILATION_UNIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompilationUnit((WCompilationUnit)otherEnd, msgs);
			case WsmodelPackage.WTYPE__METHODS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethods()).basicAdd(otherEnd, msgs);
			case WsmodelPackage.WTYPE__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
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
			case WsmodelPackage.WTYPE__COMPILATION_UNIT:
				return basicSetCompilationUnit(null, msgs);
			case WsmodelPackage.WTYPE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case WsmodelPackage.WTYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case WsmodelPackage.WTYPE__COMPILATION_UNIT:
				return eInternalContainer().eInverseRemove(this, WsmodelPackage.WCOMPILATION_UNIT__TYPES, WCompilationUnit.class, msgs);
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
			case WsmodelPackage.WTYPE__COMPILATION_UNIT:
				return getCompilationUnit();
			case WsmodelPackage.WTYPE__METHODS:
				return getMethods();
			case WsmodelPackage.WTYPE__FIELDS:
				return getFields();
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
			case WsmodelPackage.WTYPE__COMPILATION_UNIT:
				setCompilationUnit((WCompilationUnit)newValue);
				return;
			case WsmodelPackage.WTYPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends WMethod>)newValue);
				return;
			case WsmodelPackage.WTYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends WField>)newValue);
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
			case WsmodelPackage.WTYPE__COMPILATION_UNIT:
				setCompilationUnit((WCompilationUnit)null);
				return;
			case WsmodelPackage.WTYPE__METHODS:
				getMethods().clear();
				return;
			case WsmodelPackage.WTYPE__FIELDS:
				getFields().clear();
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
			case WsmodelPackage.WTYPE__COMPILATION_UNIT:
				return getCompilationUnit() != null;
			case WsmodelPackage.WTYPE__METHODS:
				return methods != null && !methods.isEmpty();
			case WsmodelPackage.WTYPE__FIELDS:
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
	public WNamedElement getParent() {
		return getCompilationUnit();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EList<? extends WNamedElement> getChildren() {
		EList<WNamedElement> methodsAndFields = new BasicEList<WNamedElement>();
		methodsAndFields.addAll(getMethods());
		methodsAndFields.addAll(getFields());
		return methodsAndFields;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void setParent(WNamedElement parent) {
		if (parent instanceof WCompilationUnit) {
			this.setCompilationUnit((WCompilationUnit) parent);
		} else {
			throw new RuntimeException("Wrong parent type");
		}
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public void addChild(WNamedElement child) {
		if (child instanceof WMethod) {
			getMethods().add((WMethod) child);
		}
		else {
			getFields().add((WField) child);
		}
	}

} //WTypeImpl

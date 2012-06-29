/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cern.devtools.depanalysis.javamodel.impl;

import cern.devtools.depanalysis.javamodel.Dependency;
import cern.devtools.depanalysis.javamodel.JavaModelPackage;
import cern.devtools.depanalysis.javamodel.NamedElement;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.javamodel.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.impl.NamedElementImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.impl.NamedElementImpl#getIncomingDependencies <em>Incoming Dependencies</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.impl.NamedElementImpl#getOutgoingDependencies <em>Outgoing Dependencies</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.impl.NamedElementImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamedElementImpl extends EObjectImpl implements NamedElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandler() <em>Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected String handler = HANDLER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingDependencies() <em>Incoming Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> incomingDependencies;

	/**
	 * The cached value of the '{@link #getOutgoingDependencies() <em>Outgoing Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> outgoingDependencies;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Object data = DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaModelPackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.NAMED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandler() {
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandler(String newHandler) {
		String oldHandler = handler;
		handler = newHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.NAMED_ELEMENT__HANDLER, oldHandler, handler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getIncomingDependencies() {
		if (incomingDependencies == null) {
			incomingDependencies = new EObjectWithInverseResolvingEList<Dependency>(Dependency.class, this, JavaModelPackage.NAMED_ELEMENT__INCOMING_DEPENDENCIES, JavaModelPackage.DEPENDENCY__TO);
		}
		return incomingDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getOutgoingDependencies() {
		if (outgoingDependencies == null) {
			outgoingDependencies = new EObjectWithInverseResolvingEList<Dependency>(Dependency.class, this, JavaModelPackage.NAMED_ELEMENT__OUTGOING_DEPENDENCIES, JavaModelPackage.DEPENDENCY__FROM);
		}
		return outgoingDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Object newData) {
		Object oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaModelPackage.NAMED_ELEMENT__DATA, oldData, data));
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
			case JavaModelPackage.NAMED_ELEMENT__INCOMING_DEPENDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingDependencies()).basicAdd(otherEnd, msgs);
			case JavaModelPackage.NAMED_ELEMENT__OUTGOING_DEPENDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingDependencies()).basicAdd(otherEnd, msgs);
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
			case JavaModelPackage.NAMED_ELEMENT__INCOMING_DEPENDENCIES:
				return ((InternalEList<?>)getIncomingDependencies()).basicRemove(otherEnd, msgs);
			case JavaModelPackage.NAMED_ELEMENT__OUTGOING_DEPENDENCIES:
				return ((InternalEList<?>)getOutgoingDependencies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaModelPackage.NAMED_ELEMENT__NAME:
				return getName();
			case JavaModelPackage.NAMED_ELEMENT__HANDLER:
				return getHandler();
			case JavaModelPackage.NAMED_ELEMENT__INCOMING_DEPENDENCIES:
				return getIncomingDependencies();
			case JavaModelPackage.NAMED_ELEMENT__OUTGOING_DEPENDENCIES:
				return getOutgoingDependencies();
			case JavaModelPackage.NAMED_ELEMENT__DATA:
				return getData();
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
			case JavaModelPackage.NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case JavaModelPackage.NAMED_ELEMENT__HANDLER:
				setHandler((String)newValue);
				return;
			case JavaModelPackage.NAMED_ELEMENT__INCOMING_DEPENDENCIES:
				getIncomingDependencies().clear();
				getIncomingDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case JavaModelPackage.NAMED_ELEMENT__OUTGOING_DEPENDENCIES:
				getOutgoingDependencies().clear();
				getOutgoingDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case JavaModelPackage.NAMED_ELEMENT__DATA:
				setData(newValue);
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
			case JavaModelPackage.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaModelPackage.NAMED_ELEMENT__HANDLER:
				setHandler(HANDLER_EDEFAULT);
				return;
			case JavaModelPackage.NAMED_ELEMENT__INCOMING_DEPENDENCIES:
				getIncomingDependencies().clear();
				return;
			case JavaModelPackage.NAMED_ELEMENT__OUTGOING_DEPENDENCIES:
				getOutgoingDependencies().clear();
				return;
			case JavaModelPackage.NAMED_ELEMENT__DATA:
				setData(DATA_EDEFAULT);
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
			case JavaModelPackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaModelPackage.NAMED_ELEMENT__HANDLER:
				return HANDLER_EDEFAULT == null ? handler != null : !HANDLER_EDEFAULT.equals(handler);
			case JavaModelPackage.NAMED_ELEMENT__INCOMING_DEPENDENCIES:
				return incomingDependencies != null && !incomingDependencies.isEmpty();
			case JavaModelPackage.NAMED_ELEMENT__OUTGOING_DEPENDENCIES:
				return outgoingDependencies != null && !outgoingDependencies.isEmpty();
			case JavaModelPackage.NAMED_ELEMENT__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", handler: ");
		result.append(handler);
		result.append(", data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //NamedElementImpl

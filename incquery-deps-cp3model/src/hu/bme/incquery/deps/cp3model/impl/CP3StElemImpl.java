/**
 */
package hu.bme.incquery.deps.cp3model.impl;

import hu.bme.incquery.deps.cp3model.CP3StElem;
import hu.bme.incquery.deps.cp3model.Cp3modelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CP3 St Elem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3StElemImpl#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3StElemImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3StElemImpl#getSig <em>Sig</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.impl.CP3StElemImpl#getCh <em>Ch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CP3StElemImpl extends EObjectImpl implements CP3StElem {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttr() <em>Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttr()
	 * @generated
	 * @ordered
	 */
	protected static final short ATTR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttr() <em>Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttr()
	 * @generated
	 * @ordered
	 */
	protected short attr = ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSig() <em>Sig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSig()
	 * @generated
	 * @ordered
	 */
	protected static final String SIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSig() <em>Sig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSig()
	 * @generated
	 * @ordered
	 */
	protected String sig = SIG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCh() <em>Ch</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCh()
	 * @generated
	 * @ordered
	 */
	protected EList<CP3StElem> ch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CP3StElemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cp3modelPackage.Literals.CP3_ST_ELEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp3modelPackage.CP3_ST_ELEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getAttr() {
		return attr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttr(short newAttr) {
		short oldAttr = attr;
		attr = newAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp3modelPackage.CP3_ST_ELEM__ATTR, oldAttr, attr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSig() {
		return sig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSig(String newSig) {
		String oldSig = sig;
		sig = newSig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cp3modelPackage.CP3_ST_ELEM__SIG, oldSig, sig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CP3StElem> getCh() {
		if (ch == null) {
			ch = new EObjectResolvingEList<CP3StElem>(CP3StElem.class, this, Cp3modelPackage.CP3_ST_ELEM__CH);
		}
		return ch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cp3modelPackage.CP3_ST_ELEM__ID:
				return getId();
			case Cp3modelPackage.CP3_ST_ELEM__ATTR:
				return getAttr();
			case Cp3modelPackage.CP3_ST_ELEM__SIG:
				return getSig();
			case Cp3modelPackage.CP3_ST_ELEM__CH:
				return getCh();
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
			case Cp3modelPackage.CP3_ST_ELEM__ID:
				setId((Long)newValue);
				return;
			case Cp3modelPackage.CP3_ST_ELEM__ATTR:
				setAttr((Short)newValue);
				return;
			case Cp3modelPackage.CP3_ST_ELEM__SIG:
				setSig((String)newValue);
				return;
			case Cp3modelPackage.CP3_ST_ELEM__CH:
				getCh().clear();
				getCh().addAll((Collection<? extends CP3StElem>)newValue);
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
			case Cp3modelPackage.CP3_ST_ELEM__ID:
				setId(ID_EDEFAULT);
				return;
			case Cp3modelPackage.CP3_ST_ELEM__ATTR:
				setAttr(ATTR_EDEFAULT);
				return;
			case Cp3modelPackage.CP3_ST_ELEM__SIG:
				setSig(SIG_EDEFAULT);
				return;
			case Cp3modelPackage.CP3_ST_ELEM__CH:
				getCh().clear();
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
			case Cp3modelPackage.CP3_ST_ELEM__ID:
				return id != ID_EDEFAULT;
			case Cp3modelPackage.CP3_ST_ELEM__ATTR:
				return attr != ATTR_EDEFAULT;
			case Cp3modelPackage.CP3_ST_ELEM__SIG:
				return SIG_EDEFAULT == null ? sig != null : !SIG_EDEFAULT.equals(sig);
			case Cp3modelPackage.CP3_ST_ELEM__CH:
				return ch != null && !ch.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", attr: ");
		result.append(attr);
		result.append(", sig: ");
		result.append(sig);
		result.append(')');
		return result.toString();
	}

} //CP3StElemImpl

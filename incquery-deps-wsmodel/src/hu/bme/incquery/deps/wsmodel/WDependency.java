/**
 */
package hu.bme.incquery.deps.wsmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WDependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WDependency#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WDependency#getTo <em>To</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WDependency#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWDependency()
 * @model
 * @generated
 */
public interface WDependency extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getOutgoingDependencies <em>Outgoing Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(WNamedElement)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWDependency_From()
	 * @see hu.bme.incquery.deps.wsmodel.WNamedElement#getOutgoingDependencies
	 * @model opposite="outgoingDependencies" required="true"
	 * @generated
	 */
	WNamedElement getFrom();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WDependency#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(WNamedElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getIncomingDependencies <em>Incoming Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(WNamedElement)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWDependency_To()
	 * @see hu.bme.incquery.deps.wsmodel.WNamedElement#getIncomingDependencies
	 * @model opposite="incomingDependencies" required="true"
	 * @generated
	 */
	WNamedElement getTo();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WDependency#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(WNamedElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.incquery.deps.wsmodel.WDependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hu.bme.incquery.deps.wsmodel.WDependencyType
	 * @see #setType(WDependencyType)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWDependency_Type()
	 * @model
	 * @generated
	 */
	WDependencyType getType();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WDependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hu.bme.incquery.deps.wsmodel.WDependencyType
	 * @see #getType()
	 * @generated
	 */
	void setType(WDependencyType value);

} // WDependency

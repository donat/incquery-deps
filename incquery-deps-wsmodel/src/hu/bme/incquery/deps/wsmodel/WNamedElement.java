/**
 */
package hu.bme.incquery.deps.wsmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WNamed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getHandler <em>Handler</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getIncomingDependencies <em>Incoming Dependencies</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getOutgoingDependencies <em>Outgoing Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface WNamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWNamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' attribute.
	 * @see #setHandler(String)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWNamedElement_Handler()
	 * @model
	 * @generated
	 */
	String getHandler();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getHandler <em>Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' attribute.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WDependency}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WDependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Dependencies</em>' reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWNamedElement_IncomingDependencies()
	 * @see hu.bme.incquery.deps.wsmodel.WDependency#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<WDependency> getIncomingDependencies();

	/**
	 * Returns the value of the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WDependency}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WDependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Dependencies</em>' reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWNamedElement_OutgoingDependencies()
	 * @see hu.bme.incquery.deps.wsmodel.WDependency#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<WDependency> getOutgoingDependencies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	WNamedElement getParent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	EList getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parentRequired="true"
	 * @generated
	 */
	void setParent(WNamedElement parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model childRequired="true"
	 * @generated
	 */
	void addChild(WNamedElement child);

} // WNamedElement

/**
 */
package hu.bme.incquery.deps.wsmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WField#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WField#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWField()
 * @model
 * @generated
 */
public interface WField extends WNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(WType)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWField_Type()
	 * @see hu.bme.incquery.deps.wsmodel.WType#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	WType getType();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WField#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(WType value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWField_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WField#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

} // WField

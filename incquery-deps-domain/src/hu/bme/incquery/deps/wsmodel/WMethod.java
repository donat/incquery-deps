/**
 */
package hu.bme.incquery.deps.wsmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WMethod#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWMethod()
 * @model
 * @generated
 */
public interface WMethod extends WNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WType#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(WType)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWMethod_Type()
	 * @see hu.bme.incquery.deps.wsmodel.WType#getMethods
	 * @model opposite="methods" transient="false"
	 * @generated
	 */
	WType getType();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WMethod#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(WType value);

} // WMethod

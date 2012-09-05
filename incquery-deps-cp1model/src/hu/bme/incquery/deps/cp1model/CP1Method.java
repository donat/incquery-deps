/**
 */
package hu.bme.incquery.deps.cp1model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP1 Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp1model.CP1Method#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Method()
 * @model
 * @generated
 */
public interface CP1Method extends CP1CodeElement {
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
	 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Method_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp1model.CP1Method#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

} // CP1Method

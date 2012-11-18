/**
 */
package hu.bme.incquery.deps.cp2model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP2 Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp2model.CP2Field#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Field()
 * @model
 * @generated
 */
public interface CP2Field extends C2CodeElement {
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
	 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Field_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp2model.CP2Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CP2Field

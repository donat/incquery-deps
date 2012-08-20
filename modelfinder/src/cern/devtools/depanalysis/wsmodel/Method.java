/**
 */
package cern.devtools.depanalysis.wsmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.Method#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.Type#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(Type)
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getMethod_Type()
	 * @see cern.devtools.depanalysis.wsmodel.Type#getMethods
	 * @model opposite="methods" transient="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.wsmodel.Method#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Method

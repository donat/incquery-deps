/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RField#getSignature <em>Signature</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RField#getRClass <em>RClass</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RField#isPrivate <em>Private</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRField()
 * @model
 * @generated
 */
public interface RField extends RCodeElement {
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
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRField_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RField#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>RClass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.repomodel.RClass#getRFields <em>RFields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RClass</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RClass</em>' container reference.
	 * @see #setRClass(RClass)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRField_RClass()
	 * @see hu.bme.incquery.deps.repomodel.RClass#getRFields
	 * @model opposite="rFields" required="true" transient="false"
	 * @generated
	 */
	RClass getRClass();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RField#getRClass <em>RClass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RClass</em>' container reference.
	 * @see #getRClass()
	 * @generated
	 */
	void setRClass(RClass value);

	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see #setPrivate(boolean)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRField_Private()
	 * @model
	 * @generated
	 */
	boolean isPrivate();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RField#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #isPrivate()
	 * @generated
	 */
	void setPrivate(boolean value);

} // RField

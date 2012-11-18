/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RMethod#getSignature <em>Signature</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RMethod#getRClass <em>RClass</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RMethod#getPrivate <em>Private</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RMethod#getReferencedFields <em>Referenced Fields</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RMethod#getReferencedMethods <em>Referenced Methods</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RMethod#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRMethod()
 * @model
 * @generated
 */
public interface RMethod extends RCodeElement {
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
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRMethod_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RMethod#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>RClass</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.repomodel.RClass#getRMethods <em>RMethods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RClass</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RClass</em>' container reference.
	 * @see #setRClass(RClass)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRMethod_RClass()
	 * @see hu.bme.incquery.deps.repomodel.RClass#getRMethods
	 * @model opposite="rMethods" required="true" transient="false"
	 * @generated
	 */
	RClass getRClass();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RMethod#getRClass <em>RClass</em>}' container reference.
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
	 * @see #setPrivate(Boolean)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRMethod_Private()
	 * @model
	 * @generated
	 */
	Boolean getPrivate();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RMethod#getPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #getPrivate()
	 * @generated
	 */
	void setPrivate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Referenced Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Fields</em>' attribute.
	 * @see #setReferencedFields(EList)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRMethod_ReferencedFields()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<String> getReferencedFields();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RMethod#getReferencedFields <em>Referenced Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Fields</em>' attribute.
	 * @see #getReferencedFields()
	 * @generated
	 */
	void setReferencedFields(EList<String> value);

	/**
	 * Returns the value of the '<em><b>Referenced Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Methods</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Methods</em>' attribute.
	 * @see #setReferencedMethods(EList)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRMethod_ReferencedMethods()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<String> getReferencedMethods();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RMethod#getReferencedMethods <em>Referenced Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Methods</em>' attribute.
	 * @see #getReferencedMethods()
	 * @generated
	 */
	void setReferencedMethods(EList<String> value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRMethod_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RMethod#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

} // RMethod

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cern.devtools.depanalysis.javamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Field#getClass_ <em>Class</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Field#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.javamodel.ApiClass#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(ApiClass)
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getField_Class()
	 * @see cern.devtools.depanalysis.javamodel.ApiClass#getFields
	 * @model opposite="fields" required="true" transient="false"
	 * @generated
	 */
	ApiClass getClass_();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.javamodel.Field#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(ApiClass value);

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
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.javamodel.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Field

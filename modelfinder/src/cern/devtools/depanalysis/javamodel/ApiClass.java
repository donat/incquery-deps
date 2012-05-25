/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cern.devtools.depanalysis.javamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.javamodel.ApiClass#getMethods <em>Methods</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.ApiClass#getFields <em>Fields</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.ApiClass#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getApiClass()
 * @model
 * @generated
 */
public interface ApiClass extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.javamodel.Method}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.javamodel.Method#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getApiClass_Methods()
	 * @see cern.devtools.depanalysis.javamodel.Method#getClass_
	 * @model opposite="class" containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.javamodel.Field}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.javamodel.Field#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getApiClass_Fields()
	 * @see cern.devtools.depanalysis.javamodel.Field#getClass_
	 * @model opposite="class" containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.javamodel.Package#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(cern.devtools.depanalysis.javamodel.Package)
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getApiClass_Package()
	 * @see cern.devtools.depanalysis.javamodel.Package#getClasses
	 * @model opposite="classes" required="true" transient="false"
	 * @generated
	 */
	cern.devtools.depanalysis.javamodel.Package getPackage();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.javamodel.ApiClass#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(cern.devtools.depanalysis.javamodel.Package value);

} // ApiClass

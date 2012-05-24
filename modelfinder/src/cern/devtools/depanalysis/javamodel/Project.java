/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cern.devtools.depanalysis.javamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Project#getName <em>Name</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Project#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
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
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.javamodel.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.javamodel.Package}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.javamodel.Package#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getProject_Packages()
	 * @see cern.devtools.depanalysis.javamodel.Package#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<cern.devtools.depanalysis.javamodel.Package> getPackages();

} // Project

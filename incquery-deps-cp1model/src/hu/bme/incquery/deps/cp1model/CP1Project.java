/**
 */
package hu.bme.incquery.deps.cp1model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP1 Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp1model.CP1Project#getClasses <em>Classes</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp1model.CP1Project#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Project()
 * @model
 * @generated
 */
public interface CP1Project extends CP1CodeElement {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp1model.CP1Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Project_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CP1Class> getClasses();

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
	 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Project_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp1model.CP1Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CP1Project

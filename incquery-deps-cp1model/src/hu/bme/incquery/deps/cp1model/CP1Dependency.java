/**
 */
package hu.bme.incquery.deps.cp1model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP1 Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp1model.CP1Dependency#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp1model.CP1Dependency#getTo <em>To</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp1model.CP1Dependency#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Dependency()
 * @model
 * @generated
 */
public interface CP1Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(CP1CodeElement)
	 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Dependency_From()
	 * @model required="true"
	 * @generated
	 */
	CP1CodeElement getFrom();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp1model.CP1Dependency#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(CP1CodeElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(CP1CodeElement)
	 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Dependency_To()
	 * @model required="true"
	 * @generated
	 */
	CP1CodeElement getTo();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp1model.CP1Dependency#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(CP1CodeElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.incquery.deps.cp1model.CP1DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hu.bme.incquery.deps.cp1model.CP1DependencyType
	 * @see #setType(CP1DependencyType)
	 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Dependency_Type()
	 * @model
	 * @generated
	 */
	CP1DependencyType getType();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp1model.CP1Dependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hu.bme.incquery.deps.cp1model.CP1DependencyType
	 * @see #getType()
	 * @generated
	 */
	void setType(CP1DependencyType value);

} // CP1Dependency

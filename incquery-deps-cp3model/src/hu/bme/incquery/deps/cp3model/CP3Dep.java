/**
 */
package hu.bme.incquery.deps.cp3model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP3 Dep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3Dep#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3Dep#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3Dep#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Dep()
 * @model
 * @generated
 */
public interface CP3Dep extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(short)
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Dep_Type()
	 * @model
	 * @generated
	 */
	short getType();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp3model.CP3Dep#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(short value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(CP3AbstractItem)
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Dep_From()
	 * @model required="true"
	 * @generated
	 */
	CP3AbstractItem getFrom();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp3model.CP3Dep#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(CP3AbstractItem value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(CP3AbstractItem)
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Dep_To()
	 * @model required="true"
	 * @generated
	 */
	CP3AbstractItem getTo();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp3model.CP3Dep#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(CP3AbstractItem value);

} // CP3Dep

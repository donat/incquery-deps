/**
 */
package hu.bme.incquery.deps.cp2model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP2 Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp2model.CP2Dependency#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.CP2Dependency#getTo <em>To</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.CP2Dependency#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Dependency()
 * @model
 * @generated
 */
public interface CP2Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(C2CodeElement)
	 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Dependency_From()
	 * @model required="true"
	 * @generated
	 */
	C2CodeElement getFrom();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp2model.CP2Dependency#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(C2CodeElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(C2CodeElement)
	 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Dependency_To()
	 * @model required="true"
	 * @generated
	 */
	C2CodeElement getTo();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp2model.CP2Dependency#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(C2CodeElement value);

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
	 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Dependency_Type()
	 * @model
	 * @generated
	 */
	short getType();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp2model.CP2Dependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(short value);

} // CP2Dependency

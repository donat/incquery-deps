/**
 */
package hu.bme.incquery.deps.cp2model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP2 Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp2model.CP2Class#getFields <em>Fields</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.CP2Class#getMethods <em>Methods</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.CP2Class#getExtends <em>Extends</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.CP2Class#getImplements <em>Implements</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp2model.CP2Class#getSimpleName <em>Simple Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Class()
 * @model
 * @generated
 */
public interface CP2Class extends C2CodeElement {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp2model.CP2Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Class_Fields()
	 * @model
	 * @generated
	 */
	EList<CP2Field> getFields();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp2model.C2Methods}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Class_Methods()
	 * @model
	 * @generated
	 */
	EList<C2Methods> getMethods();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' attribute.
	 * @see #setExtends(String)
	 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Class_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp2model.CP2Class#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' attribute.
	 * @see #setImplements(String)
	 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Class_Implements()
	 * @model
	 * @generated
	 */
	String getImplements();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp2model.CP2Class#getImplements <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' attribute.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(String value);

	/**
	 * Returns the value of the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Name</em>' attribute.
	 * @see #setSimpleName(String)
	 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#getCP2Class_SimpleName()
	 * @model
	 * @generated
	 */
	String getSimpleName();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp2model.CP2Class#getSimpleName <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Name</em>' attribute.
	 * @see #getSimpleName()
	 * @generated
	 */
	void setSimpleName(String value);

} // CP2Class

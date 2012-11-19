/**
 */
package hu.bme.incquery.deps.cp3model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP3 Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3Class#getProjects <em>Projects</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3Class#getMethods <em>Methods</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3Class#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Class()
 * @model
 * @generated
 */
public interface CP3Class extends CP3AbstractItem {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp3model.CP3Project}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.cp3model.CP3Project#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Class_Projects()
	 * @see hu.bme.incquery.deps.cp3model.CP3Project#getClasses
	 * @model opposite="classes"
	 * @generated
	 */
	EList<CP3Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp3model.CP3Method}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.cp3model.CP3Method#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Class_Methods()
	 * @see hu.bme.incquery.deps.cp3model.CP3Method#getClasses
	 * @model opposite="classes"
	 * @generated
	 */
	EList<CP3Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp3model.CP3Field}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.cp3model.CP3Field#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Class_Fields()
	 * @see hu.bme.incquery.deps.cp3model.CP3Field#getClasses
	 * @model opposite="classes"
	 * @generated
	 */
	EList<CP3Field> getFields();

} // CP3Class

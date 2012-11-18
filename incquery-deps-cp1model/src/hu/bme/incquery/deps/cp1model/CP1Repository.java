/**
 */
package hu.bme.incquery.deps.cp1model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP1 Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp1model.CP1Repository#getProjects <em>Projects</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp1model.CP1Repository#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Repository()
 * @model
 * @generated
 */
public interface CP1Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp1model.CP1Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Repository_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<CP1Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp1model.CP1Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#getCP1Repository_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<CP1Dependency> getDependencies();

} // CP1Repository

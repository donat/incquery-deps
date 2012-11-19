/**
 */
package hu.bme.incquery.deps.cp3model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP3 Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3Project#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Project()
 * @model
 * @generated
 */
public interface CP3Project extends CP3AbstractItem {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp3model.CP3Class}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.cp3model.CP3Class#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Project_Classes()
	 * @see hu.bme.incquery.deps.cp3model.CP3Class#getProjects
	 * @model opposite="projects"
	 * @generated
	 */
	EList<CP3Class> getClasses();

} // CP3Project

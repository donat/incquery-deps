/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RRepository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RRepository#getRDependencies <em>RDependencies</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RRepository#getRProjects <em>RProjects</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRRepository()
 * @model
 * @generated
 */
public interface RRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>RDependencies</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.repomodel.RDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDependencies</em>' containment reference list.
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRRepository_RDependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDependency> getRDependencies();

	/**
	 * Returns the value of the '<em><b>RProjects</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.repomodel.RProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RProjects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RProjects</em>' containment reference list.
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRRepository_RProjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<RProject> getRProjects();

} // RRepository

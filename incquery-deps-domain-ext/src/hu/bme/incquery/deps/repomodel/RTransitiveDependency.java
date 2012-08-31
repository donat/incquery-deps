/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTransitive Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RTransitiveDependency#getRTtransitiveFrom <em>RTtransitive From</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRTransitiveDependency()
 * @model
 * @generated
 */
public interface RTransitiveDependency extends RDependency {
	/**
	 * Returns the value of the '<em><b>RTtransitive From</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.repomodel.RDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTtransitive From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTtransitive From</em>' reference list.
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRTransitiveDependency_RTtransitiveFrom()
	 * @model
	 * @generated
	 */
	EList<RDependency> getRTtransitiveFrom();

} // RTransitiveDependency

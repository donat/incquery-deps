/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage
 * @generated
 */
public interface RepomodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepomodelFactory eINSTANCE = hu.bme.incquery.deps.repomodel.impl.RepomodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RProject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RProject</em>'.
	 * @generated
	 */
	RProject createRProject();

	/**
	 * Returns a new object of class '<em>RClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RClass</em>'.
	 * @generated
	 */
	RClass createRClass();

	/**
	 * Returns a new object of class '<em>RMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RMethod</em>'.
	 * @generated
	 */
	RMethod createRMethod();

	/**
	 * Returns a new object of class '<em>RField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RField</em>'.
	 * @generated
	 */
	RField createRField();

	/**
	 * Returns a new object of class '<em>RDependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDependency</em>'.
	 * @generated
	 */
	RDependency createRDependency();

	/**
	 * Returns a new object of class '<em>RRepository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RRepository</em>'.
	 * @generated
	 */
	RRepository createRRepository();

	/**
	 * Returns a new object of class '<em>RTransitive Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTransitive Dependency</em>'.
	 * @generated
	 */
	RTransitiveDependency createRTransitiveDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RepomodelPackage getRepomodelPackage();

} //RepomodelFactory

/**
 */
package hu.bme.incquery.deps.wsmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage
 * @generated
 */
public interface WsmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WsmodelFactory eINSTANCE = hu.bme.incquery.deps.wsmodel.impl.WsmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>WProject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WProject</em>'.
	 * @generated
	 */
	WProject createWProject();

	/**
	 * Returns a new object of class '<em>WWorkspace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WWorkspace</em>'.
	 * @generated
	 */
	WWorkspace createWWorkspace();

	/**
	 * Returns a new object of class '<em>WDependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WDependency</em>'.
	 * @generated
	 */
	WDependency createWDependency();

	/**
	 * Returns a new object of class '<em>WPackage Fragment Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WPackage Fragment Root</em>'.
	 * @generated
	 */
	WPackageFragmentRoot createWPackageFragmentRoot();

	/**
	 * Returns a new object of class '<em>WPackage Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WPackage Fragment</em>'.
	 * @generated
	 */
	WPackageFragment createWPackageFragment();

	/**
	 * Returns a new object of class '<em>WCompilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WCompilation Unit</em>'.
	 * @generated
	 */
	WCompilationUnit createWCompilationUnit();

	/**
	 * Returns a new object of class '<em>WType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WType</em>'.
	 * @generated
	 */
	WType createWType();

	/**
	 * Returns a new object of class '<em>WMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WMethod</em>'.
	 * @generated
	 */
	WMethod createWMethod();

	/**
	 * Returns a new object of class '<em>WField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WField</em>'.
	 * @generated
	 */
	WField createWField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WsmodelPackage getWsmodelPackage();

} //WsmodelFactory

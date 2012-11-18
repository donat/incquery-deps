/**
 */
package hu.bme.incquery.deps.cp2model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage
 * @generated
 */
public interface Cp2modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cp2modelFactory eINSTANCE = hu.bme.incquery.deps.cp2model.impl.Cp2modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CP2 Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP2 Repository</em>'.
	 * @generated
	 */
	CP2Repository createCP2Repository();

	/**
	 * Returns a new object of class '<em>CP2 Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP2 Project</em>'.
	 * @generated
	 */
	CP2Project createCP2Project();

	/**
	 * Returns a new object of class '<em>CP2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP2 Class</em>'.
	 * @generated
	 */
	CP2Class createCP2Class();

	/**
	 * Returns a new object of class '<em>CP2 Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP2 Field</em>'.
	 * @generated
	 */
	CP2Field createCP2Field();

	/**
	 * Returns a new object of class '<em>C2 Methods</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C2 Methods</em>'.
	 * @generated
	 */
	C2Methods createC2Methods();

	/**
	 * Returns a new object of class '<em>CP2 Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP2 Dependency</em>'.
	 * @generated
	 */
	CP2Dependency createCP2Dependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Cp2modelPackage getCp2modelPackage();

} //Cp2modelFactory

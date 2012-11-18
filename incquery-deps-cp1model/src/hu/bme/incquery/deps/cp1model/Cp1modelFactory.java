/**
 */
package hu.bme.incquery.deps.cp1model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage
 * @generated
 */
public interface Cp1modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cp1modelFactory eINSTANCE = hu.bme.incquery.deps.cp1model.impl.Cp1modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CP1 Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP1 Repository</em>'.
	 * @generated
	 */
	CP1Repository createCP1Repository();

	/**
	 * Returns a new object of class '<em>CP1 Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP1 Project</em>'.
	 * @generated
	 */
	CP1Project createCP1Project();

	/**
	 * Returns a new object of class '<em>CP1 Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP1 Dependency</em>'.
	 * @generated
	 */
	CP1Dependency createCP1Dependency();

	/**
	 * Returns a new object of class '<em>CP1 Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP1 Class</em>'.
	 * @generated
	 */
	CP1Class createCP1Class();

	/**
	 * Returns a new object of class '<em>CP1 Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP1 Method</em>'.
	 * @generated
	 */
	CP1Method createCP1Method();

	/**
	 * Returns a new object of class '<em>CP1 Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP1 Field</em>'.
	 * @generated
	 */
	CP1Field createCP1Field();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Cp1modelPackage getCp1modelPackage();

} //Cp1modelFactory

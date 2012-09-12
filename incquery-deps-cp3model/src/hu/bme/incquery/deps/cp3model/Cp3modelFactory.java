/**
 */
package hu.bme.incquery.deps.cp3model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage
 * @generated
 */
public interface Cp3modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cp3modelFactory eINSTANCE = hu.bme.incquery.deps.cp3model.impl.Cp3modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CP3 St Elem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP3 St Elem</em>'.
	 * @generated
	 */
	CP3StElem createCP3StElem();

	/**
	 * Returns a new object of class '<em>CP3 Dep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP3 Dep</em>'.
	 * @generated
	 */
	CP3Dep createCP3Dep();

	/**
	 * Returns a new object of class '<em>CP3 Repo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CP3 Repo</em>'.
	 * @generated
	 */
	CP3Repo createCP3Repo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Cp3modelPackage getCp3modelPackage();

} //Cp3modelFactory

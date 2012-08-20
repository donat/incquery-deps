/**
 */
package cern.devtools.depanalysis.wsmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage
 * @generated
 */
public interface JavaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaModelFactory eINSTANCE = cern.devtools.depanalysis.wsmodel.impl.JavaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Java Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Project</em>'.
	 * @generated
	 */
	JavaProject createJavaProject();

	/**
	 * Returns a new object of class '<em>Eclipse Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eclipse Workspace</em>'.
	 * @generated
	 */
	EclipseWorkspace createEclipseWorkspace();

	/**
	 * Returns a new object of class '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency</em>'.
	 * @generated
	 */
	Dependency createDependency();

	/**
	 * Returns a new object of class '<em>Package Fragment Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Fragment Root</em>'.
	 * @generated
	 */
	PackageFragmentRoot createPackageFragmentRoot();

	/**
	 * Returns a new object of class '<em>Package Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Fragment</em>'.
	 * @generated
	 */
	PackageFragment createPackageFragment();

	/**
	 * Returns a new object of class '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Unit</em>'.
	 * @generated
	 */
	CompilationUnit createCompilationUnit();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaModelPackage getJavaModelPackage();

} //JavaModelFactory

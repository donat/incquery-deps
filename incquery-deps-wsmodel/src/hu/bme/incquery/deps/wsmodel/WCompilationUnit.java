/**
 */
package hu.bme.incquery.deps.wsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WCompilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WCompilationUnit#getPackageFragment <em>Package Fragment</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WCompilationUnit#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWCompilationUnit()
 * @model
 * @generated
 */
public interface WCompilationUnit extends WNamedElement {
	/**
	 * Returns the value of the '<em><b>Package Fragment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WPackageFragment#getCompilationUnits <em>Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragment</em>' container reference.
	 * @see #setPackageFragment(WPackageFragment)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWCompilationUnit_PackageFragment()
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragment#getCompilationUnits
	 * @model opposite="compilationUnits" transient="false"
	 * @generated
	 */
	WPackageFragment getPackageFragment();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WCompilationUnit#getPackageFragment <em>Package Fragment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Fragment</em>' container reference.
	 * @see #getPackageFragment()
	 * @generated
	 */
	void setPackageFragment(WPackageFragment value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WType}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WType#getCompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWCompilationUnit_Types()
	 * @see hu.bme.incquery.deps.wsmodel.WType#getCompilationUnit
	 * @model opposite="compilationUnit" containment="true"
	 * @generated
	 */
	EList<WType> getTypes();

} // WCompilationUnit

/**
 */
package hu.bme.incquery.deps.wsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WPackage Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WPackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WPackageFragment#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWPackageFragment()
 * @model
 * @generated
 */
public interface WPackageFragment extends WNamedElement {
	/**
	 * Returns the value of the '<em><b>Package Fragment Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getPackageFragments <em>Package Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragment Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragment Root</em>' container reference.
	 * @see #setPackageFragmentRoot(WPackageFragmentRoot)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWPackageFragment_PackageFragmentRoot()
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getPackageFragments
	 * @model opposite="packageFragments" transient="false"
	 * @generated
	 */
	WPackageFragmentRoot getPackageFragmentRoot();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WPackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Fragment Root</em>' container reference.
	 * @see #getPackageFragmentRoot()
	 * @generated
	 */
	void setPackageFragmentRoot(WPackageFragmentRoot value);

	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WCompilationUnit}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WCompilationUnit#getPackageFragment <em>Package Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' containment reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWPackageFragment_CompilationUnits()
	 * @see hu.bme.incquery.deps.wsmodel.WCompilationUnit#getPackageFragment
	 * @model opposite="packageFragment" containment="true"
	 * @generated
	 */
	EList<WCompilationUnit> getCompilationUnits();

} // WPackageFragment

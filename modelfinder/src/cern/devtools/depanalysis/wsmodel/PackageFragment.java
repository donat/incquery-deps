/**
 */
package cern.devtools.depanalysis.wsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.PackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.PackageFragment#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getPackageFragment()
 * @model
 * @generated
 */
public interface PackageFragment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Package Fragment Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getPackageFragments <em>Package Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragment Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragment Root</em>' container reference.
	 * @see #setPackageFragmentRoot(PackageFragmentRoot)
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getPackageFragment_PackageFragmentRoot()
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getPackageFragments
	 * @model opposite="packageFragments" transient="false"
	 * @generated
	 */
	PackageFragmentRoot getPackageFragmentRoot();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.wsmodel.PackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Fragment Root</em>' container reference.
	 * @see #getPackageFragmentRoot()
	 * @generated
	 */
	void setPackageFragmentRoot(PackageFragmentRoot value);

	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.wsmodel.CompilationUnit}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.CompilationUnit#getPackageFragment <em>Package Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' containment reference list.
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getPackageFragment_CompilationUnits()
	 * @see cern.devtools.depanalysis.wsmodel.CompilationUnit#getPackageFragment
	 * @model opposite="packageFragment" containment="true"
	 * @generated
	 */
	EList<CompilationUnit> getCompilationUnits();

} // PackageFragment

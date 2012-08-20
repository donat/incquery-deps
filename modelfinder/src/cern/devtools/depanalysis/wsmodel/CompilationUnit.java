/**
 */
package cern.devtools.depanalysis.wsmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.CompilationUnit#getPackageFragment <em>Package Fragment</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.CompilationUnit#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Package Fragment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.PackageFragment#getCompilationUnits <em>Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragment</em>' container reference.
	 * @see #setPackageFragment(PackageFragment)
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getCompilationUnit_PackageFragment()
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragment#getCompilationUnits
	 * @model opposite="compilationUnits" transient="false"
	 * @generated
	 */
	PackageFragment getPackageFragment();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.wsmodel.CompilationUnit#getPackageFragment <em>Package Fragment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Fragment</em>' container reference.
	 * @see #getPackageFragment()
	 * @generated
	 */
	void setPackageFragment(PackageFragment value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.wsmodel.Type}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.Type#getCompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getCompilationUnit_Types()
	 * @see cern.devtools.depanalysis.wsmodel.Type#getCompilationUnit
	 * @model opposite="compilationUnit" containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // CompilationUnit

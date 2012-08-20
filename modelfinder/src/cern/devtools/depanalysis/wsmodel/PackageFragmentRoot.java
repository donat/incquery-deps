/**
 */
package cern.devtools.depanalysis.wsmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Fragment Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getJavaProject <em>Java Project</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getPackageFragments <em>Package Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getPackageFragmentRoot()
 * @model
 * @generated
 */
public interface PackageFragmentRoot extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Java Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.JavaProject#getPackageFragmentRoots <em>Package Fragment Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Project</em>' container reference.
	 * @see #setJavaProject(JavaProject)
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getPackageFragmentRoot_JavaProject()
	 * @see cern.devtools.depanalysis.wsmodel.JavaProject#getPackageFragmentRoots
	 * @model opposite="packageFragmentRoots" required="true" transient="false"
	 * @generated
	 */
	JavaProject getJavaProject();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getJavaProject <em>Java Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Project</em>' container reference.
	 * @see #getJavaProject()
	 * @generated
	 */
	void setJavaProject(JavaProject value);

	/**
	 * Returns the value of the '<em><b>Package Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.wsmodel.PackageFragment}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.PackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragments</em>' containment reference list.
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getPackageFragmentRoot_PackageFragments()
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragment#getPackageFragmentRoot
	 * @model opposite="packageFragmentRoot" containment="true"
	 * @generated
	 */
	EList<PackageFragment> getPackageFragments();
} // PackageFragmentRoot

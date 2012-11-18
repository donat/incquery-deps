/**
 */
package hu.bme.incquery.deps.wsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WPackage Fragment Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getProject <em>Project</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getPackageFragments <em>Package Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWPackageFragmentRoot()
 * @model
 * @generated
 */
public interface WPackageFragmentRoot extends WNamedElement {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WProject#getPackageFragmentRoots <em>Package Fragment Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(WProject)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWPackageFragmentRoot_Project()
	 * @see hu.bme.incquery.deps.wsmodel.WProject#getPackageFragmentRoots
	 * @model opposite="packageFragmentRoots" required="true" transient="false"
	 * @generated
	 */
	WProject getProject();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(WProject value);

	/**
	 * Returns the value of the '<em><b>Package Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WPackageFragment}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WPackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragments</em>' containment reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWPackageFragmentRoot_PackageFragments()
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragment#getPackageFragmentRoot
	 * @model opposite="packageFragmentRoot" containment="true"
	 * @generated
	 */
	EList<WPackageFragment> getPackageFragments();

} // WPackageFragmentRoot

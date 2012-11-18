/**
 */
package hu.bme.incquery.deps.wsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WProject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WProject#getPackageFragmentRoots <em>Package Fragment Roots</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WProject#getWorkspace <em>Workspace</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWProject()
 * @model
 * @generated
 */
public interface WProject extends WNamedElement {
	/**
	 * Returns the value of the '<em><b>Package Fragment Roots</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragment Roots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragment Roots</em>' containment reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWProject_PackageFragmentRoots()
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<WPackageFragmentRoot> getPackageFragmentRoots();

	/**
	 * Returns the value of the '<em><b>Workspace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WWorkspace#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workspace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workspace</em>' container reference.
	 * @see #setWorkspace(WWorkspace)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWProject_Workspace()
	 * @see hu.bme.incquery.deps.wsmodel.WWorkspace#getProjects
	 * @model opposite="projects" transient="false"
	 * @generated
	 */
	WWorkspace getWorkspace();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WProject#getWorkspace <em>Workspace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workspace</em>' container reference.
	 * @see #getWorkspace()
	 * @generated
	 */
	void setWorkspace(WWorkspace value);

} // WProject

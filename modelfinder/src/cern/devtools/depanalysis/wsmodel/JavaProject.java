/**
 */
package cern.devtools.depanalysis.wsmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.JavaProject#getPackageFragmentRoots <em>Package Fragment Roots</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.JavaProject#getEclipseWorkspace <em>Eclipse Workspace</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getJavaProject()
 * @model
 * @generated
 */
public interface JavaProject extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Package Fragment Roots</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.wsmodel.PackageFragmentRoot}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getJavaProject <em>Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Fragment Roots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Fragment Roots</em>' containment reference list.
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getJavaProject_PackageFragmentRoots()
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getJavaProject
	 * @model opposite="javaProject" containment="true"
	 * @generated
	 */
	EList<PackageFragmentRoot> getPackageFragmentRoots();

	/**
	 * Returns the value of the '<em><b>Eclipse Workspace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eclipse Workspace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclipse Workspace</em>' container reference.
	 * @see #setEclipseWorkspace(EclipseWorkspace)
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getJavaProject_EclipseWorkspace()
	 * @see cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getProjects
	 * @model opposite="projects" transient="false"
	 * @generated
	 */
	EclipseWorkspace getEclipseWorkspace();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.wsmodel.JavaProject#getEclipseWorkspace <em>Eclipse Workspace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclipse Workspace</em>' container reference.
	 * @see #getEclipseWorkspace()
	 * @generated
	 */
	void setEclipseWorkspace(EclipseWorkspace value);
} // JavaProject

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cern.devtools.depanalysis.javamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Project#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.javamodel.Package}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.javamodel.Package#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getProject_Packages()
	 * @see cern.devtools.depanalysis.javamodel.Package#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<cern.devtools.depanalysis.javamodel.Package> getPackages();

} // Project

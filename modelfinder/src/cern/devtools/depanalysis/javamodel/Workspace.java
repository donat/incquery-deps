/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cern.devtools.depanalysis.javamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Workspace#getProjects <em>Projects</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Workspace#getElements <em>Elements</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Workspace#getDependencties <em>Dependencties</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.javamodel.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getWorkspace_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.javamodel.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getWorkspace_Elements()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getElements();

	/**
	 * Returns the value of the '<em><b>Dependencties</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.javamodel.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencties</em>' containment reference list.
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getWorkspace_Dependencties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencties();
	
	/**
	 * @generated NOT
	 * @return
	 */
	public <T extends NamedElement> T findElementByHandle(String handle);

} // Workspace

/**
 */
package cern.devtools.depanalysis.wsmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclipse Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getProjects <em>Projects</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getElements <em>Elements</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getDependencties <em>Dependencties</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getEclipseWorkspace()
 * @model
 * @generated
 */
public interface EclipseWorkspace extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.wsmodel.JavaProject}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.JavaProject#getEclipseWorkspace <em>Eclipse Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getEclipseWorkspace_Projects()
	 * @see cern.devtools.depanalysis.wsmodel.JavaProject#getEclipseWorkspace
	 * @model opposite="eclipseWorkspace" containment="true"
	 * @generated
	 */
	EList<JavaProject> getProjects();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.wsmodel.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getEclipseWorkspace_Elements()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getElements();

	/**
	 * Returns the value of the '<em><b>Dependencties</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.wsmodel.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencties</em>' containment reference list.
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getEclipseWorkspace_Dependencties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencties();
	
	/**
	 * @generated NOT
	 * @return
	 */
	public NamedElement findElementByHandle(String handle);

} // EclipseWorkspace

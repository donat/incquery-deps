/**
 */
package hu.bme.incquery.deps.wsmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WWorkspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WWorkspace#getProjects <em>Projects</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WWorkspace#getElements <em>Elements</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WWorkspace#getDependencties <em>Dependencties</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWWorkspace()
 * @model
 * @generated
 */
public interface WWorkspace extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WProject}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WProject#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWWorkspace_Projects()
	 * @see hu.bme.incquery.deps.wsmodel.WProject#getWorkspace
	 * @model opposite="workspace" containment="true"
	 * @generated
	 */
	EList<WProject> getProjects();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WNamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWWorkspace_Elements()
	 * @model
	 * @generated
	 */
	EList<WNamedElement> getElements();

	/**
	 * Returns the value of the '<em><b>Dependencties</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencties</em>' containment reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWWorkspace_Dependencties()
	 * @model containment="true"
	 * @generated
	 */
	EList<WDependency> getDependencties();

	/**
	 * @param handle
	 * @return
	 * @generated NOT
	 */
	WNamedElement findElementByHandle(String handle);

} // WWorkspace

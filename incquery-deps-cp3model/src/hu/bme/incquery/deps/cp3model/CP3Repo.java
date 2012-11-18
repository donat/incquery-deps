/**
 */
package hu.bme.incquery.deps.cp3model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP3 Repo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3Repo#getDeps <em>Deps</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3Repo#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Repo()
 * @model
 * @generated
 */
public interface CP3Repo extends EObject {
	/**
	 * Returns the value of the '<em><b>Deps</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp3model.CP3Dep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deps</em>' containment reference list.
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Repo_Deps()
	 * @model containment="true"
	 * @generated
	 */
	EList<CP3Dep> getDeps();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp3model.CP3AbstractItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3Repo_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<CP3AbstractItem> getItems();

} // CP3Repo

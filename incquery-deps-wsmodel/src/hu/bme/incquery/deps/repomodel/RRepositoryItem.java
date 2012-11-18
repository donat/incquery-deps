/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RRepository Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RRepositoryItem#getUuid <em>Uuid</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRRepositoryItem()
 * @model abstract="true"
 * @generated
 */
public interface RRepositoryItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRRepositoryItem_Uuid()
	 * @model id="true" required="true"
	 *        annotation="ExtendedMetaData name='uuid' namespace='http://cern.ch/be/co/devtools-deps-analysis/2.0.0'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RRepositoryItem#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // RRepositoryItem

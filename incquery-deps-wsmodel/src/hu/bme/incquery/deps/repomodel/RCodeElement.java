/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RCode Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RCodeElement#getRIncoming <em>RIncoming</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RCodeElement#getROutgoing <em>ROutgoing</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RCodeElement#getVersions <em>Versions</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RCodeElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRCodeElement()
 * @model abstract="true"
 * @generated
 */
public interface RCodeElement extends RRepositoryItem {
	/**
	 * Returns the value of the '<em><b>RIncoming</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.repomodel.RDependency}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.repomodel.RDependency#getRTo <em>RTo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RIncoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RIncoming</em>' reference list.
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRCodeElement_RIncoming()
	 * @see hu.bme.incquery.deps.repomodel.RDependency#getRTo
	 * @model opposite="rTo"
	 * @generated
	 */
	EList<RDependency> getRIncoming();

	/**
	 * Returns the value of the '<em><b>ROutgoing</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.repomodel.RDependency}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.repomodel.RDependency#getRFrom <em>RFrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ROutgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROutgoing</em>' reference list.
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRCodeElement_ROutgoing()
	 * @see hu.bme.incquery.deps.repomodel.RDependency#getRFrom
	 * @model opposite="rFrom"
	 * @generated
	 */
	EList<RDependency> getROutgoing();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' attribute list.
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRCodeElement_Versions()
	 * @model
	 * @generated
	 */
	EList<String> getVersions();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRCodeElement_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RCodeElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getDisplayName();

} // RCodeElement

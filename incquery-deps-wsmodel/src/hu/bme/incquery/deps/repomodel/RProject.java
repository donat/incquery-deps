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
 * A representation of the model object '<em><b>RProject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RProject#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RProject#getRClasses <em>RClasses</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RProject#getContainingFolders <em>Containing Folders</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RProject#getProductPath <em>Product Path</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RProject#getStoreLocation <em>Store Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRProject()
 * @model
 * @generated
 */
public interface RProject extends RCodeElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>RClasses</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.repomodel.RClass}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.repomodel.RClass#getRProject <em>RProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RClasses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RClasses</em>' containment reference list.
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRProject_RClasses()
	 * @see hu.bme.incquery.deps.repomodel.RClass#getRProject
	 * @model opposite="rProject" containment="true"
	 * @generated
	 */
	EList<RClass> getRClasses();

	/**
	 * Returns the value of the '<em><b>Containing Folders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Folders</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Folders</em>' attribute.
	 * @see #setContainingFolders(String)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRProject_ContainingFolders()
	 * @model
	 * @generated
	 */
	String getContainingFolders();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RProject#getContainingFolders <em>Containing Folders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Folders</em>' attribute.
	 * @see #getContainingFolders()
	 * @generated
	 */
	void setContainingFolders(String value);

	/**
	 * Returns the value of the '<em><b>Product Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Path</em>' attribute.
	 * @see #setProductPath(String)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRProject_ProductPath()
	 * @model
	 * @generated
	 */
	String getProductPath();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RProject#getProductPath <em>Product Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Path</em>' attribute.
	 * @see #getProductPath()
	 * @generated
	 */
	void setProductPath(String value);

	/**
	 * Returns the value of the '<em><b>Store Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Location</em>' attribute.
	 * @see #setStoreLocation(String)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRProject_StoreLocation()
	 * @model
	 * @generated
	 */
	String getStoreLocation();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RProject#getStoreLocation <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Location</em>' attribute.
	 * @see #getStoreLocation()
	 * @generated
	 */
	void setStoreLocation(String value);

} // RProject

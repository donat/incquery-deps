/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RDependency#getRFrom <em>RFrom</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RDependency#getRTo <em>RTo</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RDependency#getDepType <em>Dep Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRDependency()
 * @model
 * @generated
 */
public interface RDependency extends RRepositoryItem {
	/**
	 * Returns the value of the '<em><b>RFrom</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.repomodel.RCodeElement#getROutgoing <em>ROutgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RFrom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RFrom</em>' reference.
	 * @see #setRFrom(RCodeElement)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRDependency_RFrom()
	 * @see hu.bme.incquery.deps.repomodel.RCodeElement#getROutgoing
	 * @model opposite="rOutgoing" required="true"
	 * @generated
	 */
	RCodeElement getRFrom();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RDependency#getRFrom <em>RFrom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RFrom</em>' reference.
	 * @see #getRFrom()
	 * @generated
	 */
	void setRFrom(RCodeElement value);

	/**
	 * Returns the value of the '<em><b>RTo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.repomodel.RCodeElement#getRIncoming <em>RIncoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTo</em>' reference.
	 * @see #setRTo(RCodeElement)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRDependency_RTo()
	 * @see hu.bme.incquery.deps.repomodel.RCodeElement#getRIncoming
	 * @model opposite="rIncoming" required="true"
	 * @generated
	 */
	RCodeElement getRTo();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RDependency#getRTo <em>RTo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RTo</em>' reference.
	 * @see #getRTo()
	 * @generated
	 */
	void setRTo(RCodeElement value);

	/**
	 * Returns the value of the '<em><b>Dep Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dep Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dep Type</em>' attribute.
	 * @see #setDepType(int)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRDependency_DepType()
	 * @model default="0"
	 * @generated
	 */
	int getDepType();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RDependency#getDepType <em>Dep Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dep Type</em>' attribute.
	 * @see #getDepType()
	 * @generated
	 */
	void setDepType(int value);

} // RDependency

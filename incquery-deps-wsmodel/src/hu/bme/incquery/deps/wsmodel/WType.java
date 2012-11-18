/**
 */
package hu.bme.incquery.deps.wsmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WType#getCompilationUnit <em>Compilation Unit</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WType#getMethods <em>Methods</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.wsmodel.WType#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWType()
 * @model
 * @generated
 */
public interface WType extends WNamedElement {
	/**
	 * Returns the value of the '<em><b>Compilation Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WCompilationUnit#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Unit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Unit</em>' container reference.
	 * @see #setCompilationUnit(WCompilationUnit)
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWType_CompilationUnit()
	 * @see hu.bme.incquery.deps.wsmodel.WCompilationUnit#getTypes
	 * @model opposite="types" transient="false"
	 * @generated
	 */
	WCompilationUnit getCompilationUnit();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.wsmodel.WType#getCompilationUnit <em>Compilation Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compilation Unit</em>' container reference.
	 * @see #getCompilationUnit()
	 * @generated
	 */
	void setCompilationUnit(WCompilationUnit value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WMethod}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WMethod#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWType_Methods()
	 * @see hu.bme.incquery.deps.wsmodel.WMethod#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<WMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.wsmodel.WField}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.wsmodel.WField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#getWType_Fields()
	 * @see hu.bme.incquery.deps.wsmodel.WField#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<WField> getFields();

} // WType

/**
 */
package cern.devtools.depanalysis.wsmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.Type#getCompilationUnit <em>Compilation Unit</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.Type#getMethods <em>Methods</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.Type#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getType()
 * @model
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Compilation Unit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.CompilationUnit#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Unit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Unit</em>' container reference.
	 * @see #setCompilationUnit(CompilationUnit)
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getType_CompilationUnit()
	 * @see cern.devtools.depanalysis.wsmodel.CompilationUnit#getTypes
	 * @model opposite="types" transient="false"
	 * @generated
	 */
	CompilationUnit getCompilationUnit();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.wsmodel.Type#getCompilationUnit <em>Compilation Unit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compilation Unit</em>' container reference.
	 * @see #getCompilationUnit()
	 * @generated
	 */
	void setCompilationUnit(CompilationUnit value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.wsmodel.Method}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.Method#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getType_Methods()
	 * @see cern.devtools.depanalysis.wsmodel.Method#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.wsmodel.Field}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.wsmodel.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#getType_Fields()
	 * @see cern.devtools.depanalysis.wsmodel.Field#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // Type

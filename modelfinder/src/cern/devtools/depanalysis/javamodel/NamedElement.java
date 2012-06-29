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
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.javamodel.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.NamedElement#getHandler <em>Handler</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.NamedElement#getIncomingDependencies <em>Incoming Dependencies</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.NamedElement#getOutgoingDependencies <em>Outgoing Dependencies</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.NamedElement#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {
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
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getNamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.javamodel.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' attribute.
	 * @see #setHandler(String)
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getNamedElement_Handler()
	 * @model
	 * @generated
	 */
	String getHandler();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.javamodel.NamedElement#getHandler <em>Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' attribute.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.javamodel.Dependency}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.javamodel.Dependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Dependencies</em>' reference list.
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getNamedElement_IncomingDependencies()
	 * @see cern.devtools.depanalysis.javamodel.Dependency#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Dependency> getIncomingDependencies();

	/**
	 * Returns the value of the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * The list contents are of type {@link cern.devtools.depanalysis.javamodel.Dependency}.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.javamodel.Dependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Dependencies</em>' reference list.
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getNamedElement_OutgoingDependencies()
	 * @see cern.devtools.depanalysis.javamodel.Dependency#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Dependency> getOutgoingDependencies();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(Object)
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getNamedElement_Data()
	 * @model transient="true"
	 * @generated
	 */
	Object getData();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.javamodel.NamedElement#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(Object value);

} // NamedElement

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cern.devtools.depanalysis.javamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Dependency#getFrom <em>From</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Dependency#getTo <em>To</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.javamodel.Dependency#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.javamodel.NamedElement#getOutgoingDependencies <em>Outgoing Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(NamedElement)
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getDependency_From()
	 * @see cern.devtools.depanalysis.javamodel.NamedElement#getOutgoingDependencies
	 * @model opposite="outgoingDependencies" required="true"
	 * @generated
	 */
	NamedElement getFrom();

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.javamodel.Dependency#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(NamedElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cern.devtools.depanalysis.javamodel.NamedElement#getIncomingDependencies <em>Incoming Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(NamedElement)
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getDependency_To()
	 * @see cern.devtools.depanalysis.javamodel.NamedElement#getIncomingDependencies
	 * @model opposite="incomingDependencies" required="true"
	 * @generated
	 */
	NamedElement getTo(); 

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.javamodel.Dependency#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cern.devtools.depanalysis.javamodel.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cern.devtools.depanalysis.javamodel.DependencyType
	 * @see #setType(DependencyType)
	 * @see cern.devtools.depanalysis.javamodel.JavaModelPackage#getDependency_Type()
	 * @model
	 * @generated
	 */
	DependencyType getType(); 

	/**
	 * Sets the value of the '{@link cern.devtools.depanalysis.javamodel.Dependency#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cern.devtools.depanalysis.javamodel.DependencyType
	 * @see #getType()
	 * @generated
	 */
	void setType(DependencyType value);

} // Dependency

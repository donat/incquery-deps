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
 * A representation of the model object '<em><b>RClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#getRMethods <em>RMethods</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#getRFields <em>RFields</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#getRProject <em>RProject</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#isPrivate <em>Private</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#getReferencedClasses <em>Referenced Classes</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.RClass#getFqName <em>Fq Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass()
 * @model
 * @generated
 */
public interface RClass extends RCodeElement {
	/**
	 * Returns the value of the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Name</em>' attribute.
	 * @see #setSimpleName(String)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_SimpleName()
	 * @model
	 * @generated
	 */
	String getSimpleName();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#getSimpleName <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Name</em>' attribute.
	 * @see #getSimpleName()
	 * @generated
	 */
	void setSimpleName(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>RMethods</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.repomodel.RMethod}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.repomodel.RMethod#getRClass <em>RClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RMethods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RMethods</em>' containment reference list.
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_RMethods()
	 * @see hu.bme.incquery.deps.repomodel.RMethod#getRClass
	 * @model opposite="rClass" containment="true"
	 * @generated
	 */
	EList<RMethod> getRMethods();

	/**
	 * Returns the value of the '<em><b>RFields</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.repomodel.RField}.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.repomodel.RField#getRClass <em>RClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RFields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RFields</em>' containment reference list.
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_RFields()
	 * @see hu.bme.incquery.deps.repomodel.RField#getRClass
	 * @model opposite="rClass" containment="true"
	 * @generated
	 */
	EList<RField> getRFields();

	/**
	 * Returns the value of the '<em><b>RProject</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.incquery.deps.repomodel.RProject#getRClasses <em>RClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RProject</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RProject</em>' container reference.
	 * @see #setRProject(RProject)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_RProject()
	 * @see hu.bme.incquery.deps.repomodel.RProject#getRClasses
	 * @model opposite="rClasses" required="true" transient="false"
	 * @generated
	 */
	RProject getRProject();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#getRProject <em>RProject</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RProject</em>' container reference.
	 * @see #getRProject()
	 * @generated
	 */
	void setRProject(RProject value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' attribute.
	 * @see #setExtends(String)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_Extends()
	 * @model
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' attribute.
	 * @see #setImplements(String)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_Implements()
	 * @model
	 * @generated
	 */
	String getImplements();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#getImplements <em>Implements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' attribute.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(String value);

	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see #isSetPrivate()
	 * @see #unsetPrivate()
	 * @see #setPrivate(boolean)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_Private()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isPrivate();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #isSetPrivate()
	 * @see #unsetPrivate()
	 * @see #isPrivate()
	 * @generated
	 */
	void setPrivate(boolean value);

	/**
	 * Unsets the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrivate()
	 * @see #isPrivate()
	 * @see #setPrivate(boolean)
	 * @generated
	 */
	void unsetPrivate();

	/**
	 * Returns whether the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#isPrivate <em>Private</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Private</em>' attribute is set.
	 * @see #unsetPrivate()
	 * @see #isPrivate()
	 * @see #setPrivate(boolean)
	 * @generated
	 */
	boolean isSetPrivate();

	/**
	 * Returns the value of the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous</em>' attribute.
	 * @see #setAnonymous(boolean)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_Anonymous()
	 * @model
	 * @generated
	 */
	boolean isAnonymous();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#isAnonymous <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous</em>' attribute.
	 * @see #isAnonymous()
	 * @generated
	 */
	void setAnonymous(boolean value);

	/**
	 * Returns the value of the '<em><b>Referenced Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Classes</em>' attribute.
	 * @see #setReferencedClasses(EList)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_ReferencedClasses()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<String> getReferencedClasses();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#getReferencedClasses <em>Referenced Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Classes</em>' attribute.
	 * @see #getReferencedClasses()
	 * @generated
	 */
	void setReferencedClasses(EList<String> value);

	/**
	 * Returns the value of the '<em><b>Fq Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fq Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fq Name</em>' attribute.
	 * @see #setFqName(String)
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#getRClass_FqName()
	 * @model
	 * @generated
	 */
	String getFqName();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.repomodel.RClass#getFqName <em>Fq Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fq Name</em>' attribute.
	 * @see #getFqName()
	 * @generated
	 */
	void setFqName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSourcePath();

} // RClass

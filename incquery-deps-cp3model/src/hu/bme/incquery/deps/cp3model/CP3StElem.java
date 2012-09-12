/**
 */
package hu.bme.incquery.deps.cp3model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CP3 St Elem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3StElem#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3StElem#getAttr <em>Attr</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3StElem#getSig <em>Sig</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.cp3model.CP3StElem#getCh <em>Ch</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3StElem()
 * @model
 * @generated
 */
public interface CP3StElem extends EObject {
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
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3StElem_Id()
	 * @model id="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp3model.CP3StElem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' attribute.
	 * @see #setAttr(short)
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3StElem_Attr()
	 * @model
	 * @generated
	 */
	short getAttr();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp3model.CP3StElem#getAttr <em>Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr</em>' attribute.
	 * @see #getAttr()
	 * @generated
	 */
	void setAttr(short value);

	/**
	 * Returns the value of the '<em><b>Sig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sig</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sig</em>' attribute.
	 * @see #setSig(String)
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3StElem_Sig()
	 * @model
	 * @generated
	 */
	String getSig();

	/**
	 * Sets the value of the '{@link hu.bme.incquery.deps.cp3model.CP3StElem#getSig <em>Sig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig</em>' attribute.
	 * @see #getSig()
	 * @generated
	 */
	void setSig(String value);

	/**
	 * Returns the value of the '<em><b>Ch</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.incquery.deps.cp3model.CP3StElem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ch</em>' reference list.
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#getCP3StElem_Ch()
	 * @model
	 * @generated
	 */
	EList<CP3StElem> getCh();

} // CP3StElem

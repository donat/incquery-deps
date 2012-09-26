/**
 */
package hu.bme.incquery.deps.cp2model.util;

import hu.bme.incquery.deps.cp2model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage
 * @generated
 */
public class Cp2modelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cp2modelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp2modelSwitch() {
		if (modelPackage == null) {
			modelPackage = Cp2modelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Cp2modelPackage.CP2_REPOSITORY: {
				CP2Repository cp2Repository = (CP2Repository)theEObject;
				T result = caseCP2Repository(cp2Repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp2modelPackage.CP2_PROJECT: {
				CP2Project cp2Project = (CP2Project)theEObject;
				T result = caseCP2Project(cp2Project);
				if (result == null) result = caseC2CodeElement(cp2Project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp2modelPackage.CP2_CLASS: {
				CP2Class cp2Class = (CP2Class)theEObject;
				T result = caseCP2Class(cp2Class);
				if (result == null) result = caseC2CodeElement(cp2Class);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp2modelPackage.CP2_FIELD: {
				CP2Field cp2Field = (CP2Field)theEObject;
				T result = caseCP2Field(cp2Field);
				if (result == null) result = caseC2CodeElement(cp2Field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp2modelPackage.C2_CODE_ELEMENT: {
				C2CodeElement c2CodeElement = (C2CodeElement)theEObject;
				T result = caseC2CodeElement(c2CodeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp2modelPackage.C2_METHODS: {
				C2Methods c2Methods = (C2Methods)theEObject;
				T result = caseC2Methods(c2Methods);
				if (result == null) result = caseC2CodeElement(c2Methods);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp2modelPackage.CP2_DEPENDENCY: {
				CP2Dependency cp2Dependency = (CP2Dependency)theEObject;
				T result = caseCP2Dependency(cp2Dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP2 Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP2 Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP2Repository(CP2Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP2 Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP2 Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP2Project(CP2Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP2Class(CP2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP2 Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP2 Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP2Field(CP2Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C2 Code Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C2 Code Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC2CodeElement(C2CodeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C2 Methods</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C2 Methods</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC2Methods(C2Methods object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP2 Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP2 Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP2Dependency(CP2Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Cp2modelSwitch

/**
 */
package hu.bme.incquery.deps.cp1model.util;

import hu.bme.incquery.deps.cp1model.*;

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
 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage
 * @generated
 */
public class Cp1modelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cp1modelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp1modelSwitch() {
		if (modelPackage == null) {
			modelPackage = Cp1modelPackage.eINSTANCE;
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
			case Cp1modelPackage.CP1_REPOSITORY: {
				CP1Repository cp1Repository = (CP1Repository)theEObject;
				T result = caseCP1Repository(cp1Repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp1modelPackage.CP1_PROJECT: {
				CP1Project cp1Project = (CP1Project)theEObject;
				T result = caseCP1Project(cp1Project);
				if (result == null) result = caseCP1CodeElement(cp1Project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp1modelPackage.CP1_DEPENDENCY: {
				CP1Dependency cp1Dependency = (CP1Dependency)theEObject;
				T result = caseCP1Dependency(cp1Dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp1modelPackage.CP1_CLASS: {
				CP1Class cp1Class = (CP1Class)theEObject;
				T result = caseCP1Class(cp1Class);
				if (result == null) result = caseCP1CodeElement(cp1Class);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp1modelPackage.CP1_METHOD: {
				CP1Method cp1Method = (CP1Method)theEObject;
				T result = caseCP1Method(cp1Method);
				if (result == null) result = caseCP1CodeElement(cp1Method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp1modelPackage.CP1_FIELD: {
				CP1Field cp1Field = (CP1Field)theEObject;
				T result = caseCP1Field(cp1Field);
				if (result == null) result = caseCP1CodeElement(cp1Field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp1modelPackage.CP1_CODE_ELEMENT: {
				CP1CodeElement cp1CodeElement = (CP1CodeElement)theEObject;
				T result = caseCP1CodeElement(cp1CodeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP1 Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP1 Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP1Repository(CP1Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP1 Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP1 Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP1Project(CP1Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP1 Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP1 Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP1Dependency(CP1Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP1 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP1 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP1Class(CP1Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP1 Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP1 Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP1Method(CP1Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP1 Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP1 Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP1Field(CP1Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP1 Code Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP1 Code Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP1CodeElement(CP1CodeElement object) {
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

} //Cp1modelSwitch

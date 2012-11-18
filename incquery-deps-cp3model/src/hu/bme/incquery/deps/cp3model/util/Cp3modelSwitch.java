/**
 */
package hu.bme.incquery.deps.cp3model.util;

import hu.bme.incquery.deps.cp3model.*;

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
 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage
 * @generated
 */
public class Cp3modelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cp3modelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp3modelSwitch() {
		if (modelPackage == null) {
			modelPackage = Cp3modelPackage.eINSTANCE;
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
			case Cp3modelPackage.CP3_DEP: {
				CP3Dep cp3Dep = (CP3Dep)theEObject;
				T result = caseCP3Dep(cp3Dep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp3modelPackage.CP3_REPO: {
				CP3Repo cp3Repo = (CP3Repo)theEObject;
				T result = caseCP3Repo(cp3Repo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp3modelPackage.CP3_PROJECT: {
				CP3Project cp3Project = (CP3Project)theEObject;
				T result = caseCP3Project(cp3Project);
				if (result == null) result = caseCP3AbstractItem(cp3Project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp3modelPackage.CP3_CLASS: {
				CP3Class cp3Class = (CP3Class)theEObject;
				T result = caseCP3Class(cp3Class);
				if (result == null) result = caseCP3AbstractItem(cp3Class);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp3modelPackage.CP3_ABSTRACT_ITEM: {
				CP3AbstractItem cp3AbstractItem = (CP3AbstractItem)theEObject;
				T result = caseCP3AbstractItem(cp3AbstractItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp3modelPackage.CP3_METHOD: {
				CP3Method cp3Method = (CP3Method)theEObject;
				T result = caseCP3Method(cp3Method);
				if (result == null) result = caseCP3AbstractItem(cp3Method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cp3modelPackage.CP3_FIELD: {
				CP3Field cp3Field = (CP3Field)theEObject;
				T result = caseCP3Field(cp3Field);
				if (result == null) result = caseCP3AbstractItem(cp3Field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP3 Dep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP3 Dep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP3Dep(CP3Dep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP3 Repo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP3 Repo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP3Repo(CP3Repo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP3 Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP3 Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP3Project(CP3Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP3 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP3 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP3Class(CP3Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP3 Abstract Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP3 Abstract Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP3AbstractItem(CP3AbstractItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP3 Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP3 Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP3Method(CP3Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CP3 Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CP3 Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCP3Field(CP3Field object) {
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

} //Cp3modelSwitch

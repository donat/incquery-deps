/**
 */
package hu.bme.incquery.deps.wsmodel.util;

import hu.bme.incquery.deps.wsmodel.*;

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
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage
 * @generated
 */
public class WsmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WsmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = WsmodelPackage.eINSTANCE;
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
			case WsmodelPackage.WPROJECT: {
				WProject wProject = (WProject)theEObject;
				T result = caseWProject(wProject);
				if (result == null) result = caseWNamedElement(wProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsmodelPackage.WWORKSPACE: {
				WWorkspace wWorkspace = (WWorkspace)theEObject;
				T result = caseWWorkspace(wWorkspace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsmodelPackage.WNAMED_ELEMENT: {
				WNamedElement wNamedElement = (WNamedElement)theEObject;
				T result = caseWNamedElement(wNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsmodelPackage.WDEPENDENCY: {
				WDependency wDependency = (WDependency)theEObject;
				T result = caseWDependency(wDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT: {
				WPackageFragmentRoot wPackageFragmentRoot = (WPackageFragmentRoot)theEObject;
				T result = caseWPackageFragmentRoot(wPackageFragmentRoot);
				if (result == null) result = caseWNamedElement(wPackageFragmentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsmodelPackage.WPACKAGE_FRAGMENT: {
				WPackageFragment wPackageFragment = (WPackageFragment)theEObject;
				T result = caseWPackageFragment(wPackageFragment);
				if (result == null) result = caseWNamedElement(wPackageFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsmodelPackage.WCOMPILATION_UNIT: {
				WCompilationUnit wCompilationUnit = (WCompilationUnit)theEObject;
				T result = caseWCompilationUnit(wCompilationUnit);
				if (result == null) result = caseWNamedElement(wCompilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsmodelPackage.WTYPE: {
				WType wType = (WType)theEObject;
				T result = caseWType(wType);
				if (result == null) result = caseWNamedElement(wType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsmodelPackage.WMETHOD: {
				WMethod wMethod = (WMethod)theEObject;
				T result = caseWMethod(wMethod);
				if (result == null) result = caseWNamedElement(wMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WsmodelPackage.WFIELD: {
				WField wField = (WField)theEObject;
				T result = caseWField(wField);
				if (result == null) result = caseWNamedElement(wField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WProject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WProject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWProject(WProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WWorkspace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WWorkspace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWWorkspace(WWorkspace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWNamedElement(WNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WDependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WDependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWDependency(WDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WPackage Fragment Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WPackage Fragment Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWPackageFragmentRoot(WPackageFragmentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WPackage Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WPackage Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWPackageFragment(WPackageFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WCompilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WCompilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWCompilationUnit(WCompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWType(WType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWMethod(WMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWField(WField object) {
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

} //WsmodelSwitch

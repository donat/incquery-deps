/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.util;

import hu.bme.incquery.deps.repomodel.*;

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
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage
 * @generated
 */
public class RepomodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RepomodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepomodelSwitch() {
		if (modelPackage == null) {
			modelPackage = RepomodelPackage.eINSTANCE;
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
			case RepomodelPackage.RREPOSITORY_ITEM: {
				RRepositoryItem rRepositoryItem = (RRepositoryItem)theEObject;
				T result = caseRRepositoryItem(rRepositoryItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepomodelPackage.RCODE_ELEMENT: {
				RCodeElement rCodeElement = (RCodeElement)theEObject;
				T result = caseRCodeElement(rCodeElement);
				if (result == null) result = caseRRepositoryItem(rCodeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepomodelPackage.RPROJECT: {
				RProject rProject = (RProject)theEObject;
				T result = caseRProject(rProject);
				if (result == null) result = caseRCodeElement(rProject);
				if (result == null) result = caseRRepositoryItem(rProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepomodelPackage.RCLASS: {
				RClass rClass = (RClass)theEObject;
				T result = caseRClass(rClass);
				if (result == null) result = caseRCodeElement(rClass);
				if (result == null) result = caseRRepositoryItem(rClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepomodelPackage.RMETHOD: {
				RMethod rMethod = (RMethod)theEObject;
				T result = caseRMethod(rMethod);
				if (result == null) result = caseRCodeElement(rMethod);
				if (result == null) result = caseRRepositoryItem(rMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepomodelPackage.RFIELD: {
				RField rField = (RField)theEObject;
				T result = caseRField(rField);
				if (result == null) result = caseRCodeElement(rField);
				if (result == null) result = caseRRepositoryItem(rField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepomodelPackage.RDEPENDENCY: {
				RDependency rDependency = (RDependency)theEObject;
				T result = caseRDependency(rDependency);
				if (result == null) result = caseRRepositoryItem(rDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepomodelPackage.RREPOSITORY: {
				RRepository rRepository = (RRepository)theEObject;
				T result = caseRRepository(rRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RepomodelPackage.RTRANSITIVE_DEPENDENCY: {
				RTransitiveDependency rTransitiveDependency = (RTransitiveDependency)theEObject;
				T result = caseRTransitiveDependency(rTransitiveDependency);
				if (result == null) result = caseRDependency(rTransitiveDependency);
				if (result == null) result = caseRRepositoryItem(rTransitiveDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RRepository Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RRepository Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRRepositoryItem(RRepositoryItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RCode Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RCode Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRCodeElement(RCodeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RProject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RProject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRProject(RProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRClass(RClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMethod(RMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRField(RField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDependency(RDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RRepository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RRepository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRRepository(RRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTransitive Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTransitive Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTransitiveDependency(RTransitiveDependency object) {
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

} //RepomodelSwitch

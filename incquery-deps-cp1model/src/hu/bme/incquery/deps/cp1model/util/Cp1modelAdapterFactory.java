/**
 */
package hu.bme.incquery.deps.cp1model.util;

import hu.bme.incquery.deps.cp1model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage
 * @generated
 */
public class Cp1modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cp1modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp1modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Cp1modelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cp1modelSwitch<Adapter> modelSwitch =
		new Cp1modelSwitch<Adapter>() {
			@Override
			public Adapter caseCP1Repository(CP1Repository object) {
				return createCP1RepositoryAdapter();
			}
			@Override
			public Adapter caseCP1Project(CP1Project object) {
				return createCP1ProjectAdapter();
			}
			@Override
			public Adapter caseCP1Dependency(CP1Dependency object) {
				return createCP1DependencyAdapter();
			}
			@Override
			public Adapter caseCP1Class(CP1Class object) {
				return createCP1ClassAdapter();
			}
			@Override
			public Adapter caseCP1Method(CP1Method object) {
				return createCP1MethodAdapter();
			}
			@Override
			public Adapter caseCP1Field(CP1Field object) {
				return createCP1FieldAdapter();
			}
			@Override
			public Adapter caseCP1CodeElement(CP1CodeElement object) {
				return createCP1CodeElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp1model.CP1Repository <em>CP1 Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp1model.CP1Repository
	 * @generated
	 */
	public Adapter createCP1RepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp1model.CP1Project <em>CP1 Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp1model.CP1Project
	 * @generated
	 */
	public Adapter createCP1ProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp1model.CP1Dependency <em>CP1 Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp1model.CP1Dependency
	 * @generated
	 */
	public Adapter createCP1DependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp1model.CP1Class <em>CP1 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp1model.CP1Class
	 * @generated
	 */
	public Adapter createCP1ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp1model.CP1Method <em>CP1 Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp1model.CP1Method
	 * @generated
	 */
	public Adapter createCP1MethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp1model.CP1Field <em>CP1 Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp1model.CP1Field
	 * @generated
	 */
	public Adapter createCP1FieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp1model.CP1CodeElement <em>CP1 Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp1model.CP1CodeElement
	 * @generated
	 */
	public Adapter createCP1CodeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Cp1modelAdapterFactory

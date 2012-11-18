/**
 */
package hu.bme.incquery.deps.cp3model.util;

import hu.bme.incquery.deps.cp3model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage
 * @generated
 */
public class Cp3modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cp3modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp3modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Cp3modelPackage.eINSTANCE;
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
	protected Cp3modelSwitch<Adapter> modelSwitch =
		new Cp3modelSwitch<Adapter>() {
			@Override
			public Adapter caseCP3Dep(CP3Dep object) {
				return createCP3DepAdapter();
			}
			@Override
			public Adapter caseCP3Repo(CP3Repo object) {
				return createCP3RepoAdapter();
			}
			@Override
			public Adapter caseCP3Project(CP3Project object) {
				return createCP3ProjectAdapter();
			}
			@Override
			public Adapter caseCP3Class(CP3Class object) {
				return createCP3ClassAdapter();
			}
			@Override
			public Adapter caseCP3AbstractItem(CP3AbstractItem object) {
				return createCP3AbstractItemAdapter();
			}
			@Override
			public Adapter caseCP3Method(CP3Method object) {
				return createCP3MethodAdapter();
			}
			@Override
			public Adapter caseCP3Field(CP3Field object) {
				return createCP3FieldAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp3model.CP3Dep <em>CP3 Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp3model.CP3Dep
	 * @generated
	 */
	public Adapter createCP3DepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp3model.CP3Repo <em>CP3 Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp3model.CP3Repo
	 * @generated
	 */
	public Adapter createCP3RepoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp3model.CP3Project <em>CP3 Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp3model.CP3Project
	 * @generated
	 */
	public Adapter createCP3ProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp3model.CP3Class <em>CP3 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp3model.CP3Class
	 * @generated
	 */
	public Adapter createCP3ClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp3model.CP3AbstractItem <em>CP3 Abstract Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp3model.CP3AbstractItem
	 * @generated
	 */
	public Adapter createCP3AbstractItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp3model.CP3Method <em>CP3 Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp3model.CP3Method
	 * @generated
	 */
	public Adapter createCP3MethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.cp3model.CP3Field <em>CP3 Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.cp3model.CP3Field
	 * @generated
	 */
	public Adapter createCP3FieldAdapter() {
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

} //Cp3modelAdapterFactory

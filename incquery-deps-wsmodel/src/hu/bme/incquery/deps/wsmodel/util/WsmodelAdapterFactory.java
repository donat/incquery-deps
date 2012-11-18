/**
 */
package hu.bme.incquery.deps.wsmodel.util;

import hu.bme.incquery.deps.wsmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage
 * @generated
 */
public class WsmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WsmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WsmodelPackage.eINSTANCE;
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
	protected WsmodelSwitch<Adapter> modelSwitch =
		new WsmodelSwitch<Adapter>() {
			@Override
			public Adapter caseWProject(WProject object) {
				return createWProjectAdapter();
			}
			@Override
			public Adapter caseWWorkspace(WWorkspace object) {
				return createWWorkspaceAdapter();
			}
			@Override
			public Adapter caseWNamedElement(WNamedElement object) {
				return createWNamedElementAdapter();
			}
			@Override
			public Adapter caseWDependency(WDependency object) {
				return createWDependencyAdapter();
			}
			@Override
			public Adapter caseWPackageFragmentRoot(WPackageFragmentRoot object) {
				return createWPackageFragmentRootAdapter();
			}
			@Override
			public Adapter caseWPackageFragment(WPackageFragment object) {
				return createWPackageFragmentAdapter();
			}
			@Override
			public Adapter caseWCompilationUnit(WCompilationUnit object) {
				return createWCompilationUnitAdapter();
			}
			@Override
			public Adapter caseWType(WType object) {
				return createWTypeAdapter();
			}
			@Override
			public Adapter caseWMethod(WMethod object) {
				return createWMethodAdapter();
			}
			@Override
			public Adapter caseWField(WField object) {
				return createWFieldAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.wsmodel.WProject <em>WProject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.wsmodel.WProject
	 * @generated
	 */
	public Adapter createWProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.wsmodel.WWorkspace <em>WWorkspace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.wsmodel.WWorkspace
	 * @generated
	 */
	public Adapter createWWorkspaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.wsmodel.WNamedElement <em>WNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.wsmodel.WNamedElement
	 * @generated
	 */
	public Adapter createWNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.wsmodel.WDependency <em>WDependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.wsmodel.WDependency
	 * @generated
	 */
	public Adapter createWDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot <em>WPackage Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot
	 * @generated
	 */
	public Adapter createWPackageFragmentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.wsmodel.WPackageFragment <em>WPackage Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragment
	 * @generated
	 */
	public Adapter createWPackageFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.wsmodel.WCompilationUnit <em>WCompilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.wsmodel.WCompilationUnit
	 * @generated
	 */
	public Adapter createWCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.wsmodel.WType <em>WType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.wsmodel.WType
	 * @generated
	 */
	public Adapter createWTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.wsmodel.WMethod <em>WMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.wsmodel.WMethod
	 * @generated
	 */
	public Adapter createWMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.wsmodel.WField <em>WField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.wsmodel.WField
	 * @generated
	 */
	public Adapter createWFieldAdapter() {
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

} //WsmodelAdapterFactory

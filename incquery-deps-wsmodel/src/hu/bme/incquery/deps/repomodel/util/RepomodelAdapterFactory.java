/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.util;

import hu.bme.incquery.deps.repomodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage
 * @generated
 */
public class RepomodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RepomodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepomodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RepomodelPackage.eINSTANCE;
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
	protected RepomodelSwitch<Adapter> modelSwitch =
		new RepomodelSwitch<Adapter>() {
			@Override
			public Adapter caseRRepositoryItem(RRepositoryItem object) {
				return createRRepositoryItemAdapter();
			}
			@Override
			public Adapter caseRCodeElement(RCodeElement object) {
				return createRCodeElementAdapter();
			}
			@Override
			public Adapter caseRProject(RProject object) {
				return createRProjectAdapter();
			}
			@Override
			public Adapter caseRClass(RClass object) {
				return createRClassAdapter();
			}
			@Override
			public Adapter caseRMethod(RMethod object) {
				return createRMethodAdapter();
			}
			@Override
			public Adapter caseRField(RField object) {
				return createRFieldAdapter();
			}
			@Override
			public Adapter caseRDependency(RDependency object) {
				return createRDependencyAdapter();
			}
			@Override
			public Adapter caseRRepository(RRepository object) {
				return createRRepositoryAdapter();
			}
			@Override
			public Adapter caseRTransitiveDependency(RTransitiveDependency object) {
				return createRTransitiveDependencyAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.repomodel.RRepositoryItem <em>RRepository Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.repomodel.RRepositoryItem
	 * @generated
	 */
	public Adapter createRRepositoryItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.repomodel.RCodeElement <em>RCode Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.repomodel.RCodeElement
	 * @generated
	 */
	public Adapter createRCodeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.repomodel.RProject <em>RProject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.repomodel.RProject
	 * @generated
	 */
	public Adapter createRProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.repomodel.RClass <em>RClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.repomodel.RClass
	 * @generated
	 */
	public Adapter createRClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.repomodel.RMethod <em>RMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.repomodel.RMethod
	 * @generated
	 */
	public Adapter createRMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.repomodel.RField <em>RField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.repomodel.RField
	 * @generated
	 */
	public Adapter createRFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.repomodel.RDependency <em>RDependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.repomodel.RDependency
	 * @generated
	 */
	public Adapter createRDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.repomodel.RRepository <em>RRepository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.repomodel.RRepository
	 * @generated
	 */
	public Adapter createRRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.incquery.deps.repomodel.RTransitiveDependency <em>RTransitive Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.incquery.deps.repomodel.RTransitiveDependency
	 * @generated
	 */
	public Adapter createRTransitiveDependencyAdapter() {
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

} //RepomodelAdapterFactory

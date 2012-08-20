/**
 */
package cern.devtools.depanalysis.wsmodel.util;

import cern.devtools.depanalysis.wsmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage
 * @generated
 */
public class JavaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaModelPackage.eINSTANCE;
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
	protected JavaModelSwitch<Adapter> modelSwitch =
		new JavaModelSwitch<Adapter>() {
			@Override
			public Adapter caseJavaProject(JavaProject object) {
				return createJavaProjectAdapter();
			}
			@Override
			public Adapter caseEclipseWorkspace(EclipseWorkspace object) {
				return createEclipseWorkspaceAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter casePackageFragmentRoot(PackageFragmentRoot object) {
				return createPackageFragmentRootAdapter();
			}
			@Override
			public Adapter casePackageFragment(PackageFragment object) {
				return createPackageFragmentAdapter();
			}
			@Override
			public Adapter caseCompilationUnit(CompilationUnit object) {
				return createCompilationUnitAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
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
	 * Creates a new adapter for an object of class '{@link cern.devtools.depanalysis.wsmodel.JavaProject <em>Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cern.devtools.depanalysis.wsmodel.JavaProject
	 * @generated
	 */
	public Adapter createJavaProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cern.devtools.depanalysis.wsmodel.EclipseWorkspace <em>Eclipse Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cern.devtools.depanalysis.wsmodel.EclipseWorkspace
	 * @generated
	 */
	public Adapter createEclipseWorkspaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cern.devtools.depanalysis.wsmodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cern.devtools.depanalysis.wsmodel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cern.devtools.depanalysis.wsmodel.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cern.devtools.depanalysis.wsmodel.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cern.devtools.depanalysis.wsmodel.PackageFragmentRoot <em>Package Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragmentRoot
	 * @generated
	 */
	public Adapter createPackageFragmentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cern.devtools.depanalysis.wsmodel.PackageFragment <em>Package Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragment
	 * @generated
	 */
	public Adapter createPackageFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cern.devtools.depanalysis.wsmodel.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cern.devtools.depanalysis.wsmodel.CompilationUnit
	 * @generated
	 */
	public Adapter createCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cern.devtools.depanalysis.wsmodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cern.devtools.depanalysis.wsmodel.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cern.devtools.depanalysis.wsmodel.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cern.devtools.depanalysis.wsmodel.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cern.devtools.depanalysis.wsmodel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cern.devtools.depanalysis.wsmodel.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
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

} //JavaModelAdapterFactory

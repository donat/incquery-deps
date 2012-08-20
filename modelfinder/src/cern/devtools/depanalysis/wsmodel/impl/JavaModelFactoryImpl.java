/**
 */
package cern.devtools.depanalysis.wsmodel.impl;

import cern.devtools.depanalysis.wsmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaModelFactoryImpl extends EFactoryImpl implements JavaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaModelFactory init() {
		try {
			JavaModelFactory theJavaModelFactory = (JavaModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://github.com/donat/incquery-deps/eclipse-workspace-model"); 
			if (theJavaModelFactory != null) {
				return theJavaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavaModelPackage.JAVA_PROJECT: return createJavaProject();
			case JavaModelPackage.ECLIPSE_WORKSPACE: return createEclipseWorkspace();
			case JavaModelPackage.DEPENDENCY: return createDependency();
			case JavaModelPackage.PACKAGE_FRAGMENT_ROOT: return createPackageFragmentRoot();
			case JavaModelPackage.PACKAGE_FRAGMENT: return createPackageFragment();
			case JavaModelPackage.COMPILATION_UNIT: return createCompilationUnit();
			case JavaModelPackage.TYPE: return createType();
			case JavaModelPackage.METHOD: return createMethod();
			case JavaModelPackage.FIELD: return createField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JavaModelPackage.DEPENDENCY_TYPE:
				return createDependencyTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JavaModelPackage.DEPENDENCY_TYPE:
				return convertDependencyTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaProject createJavaProject() {
		JavaProjectImpl javaProject = new JavaProjectImpl();
		return javaProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipseWorkspace createEclipseWorkspace() {
		EclipseWorkspaceImpl eclipseWorkspace = new EclipseWorkspaceImpl();
		return eclipseWorkspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFragmentRoot createPackageFragmentRoot() {
		PackageFragmentRootImpl packageFragmentRoot = new PackageFragmentRootImpl();
		return packageFragmentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFragment createPackageFragment() {
		PackageFragmentImpl packageFragment = new PackageFragmentImpl();
		return packageFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType createDependencyTypeFromString(EDataType eDataType, String initialValue) {
		DependencyType result = DependencyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependencyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaModelPackage getJavaModelPackage() {
		return (JavaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaModelPackage getPackage() {
		return JavaModelPackage.eINSTANCE;
	}

} //JavaModelFactoryImpl

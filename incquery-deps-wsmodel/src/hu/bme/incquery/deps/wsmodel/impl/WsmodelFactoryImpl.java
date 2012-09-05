/**
 */
package hu.bme.incquery.deps.wsmodel.impl;

import hu.bme.incquery.deps.wsmodel.*;

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
public class WsmodelFactoryImpl extends EFactoryImpl implements WsmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WsmodelFactory init() {
		try {
			WsmodelFactory theWsmodelFactory = (WsmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://inf.mit.bme.hu/donat/incquery-deps/wsmodel"); 
			if (theWsmodelFactory != null) {
				return theWsmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WsmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsmodelFactoryImpl() {
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
			case WsmodelPackage.WPROJECT: return createWProject();
			case WsmodelPackage.WWORKSPACE: return createWWorkspace();
			case WsmodelPackage.WDEPENDENCY: return createWDependency();
			case WsmodelPackage.WPACKAGE_FRAGMENT_ROOT: return createWPackageFragmentRoot();
			case WsmodelPackage.WPACKAGE_FRAGMENT: return createWPackageFragment();
			case WsmodelPackage.WCOMPILATION_UNIT: return createWCompilationUnit();
			case WsmodelPackage.WTYPE: return createWType();
			case WsmodelPackage.WMETHOD: return createWMethod();
			case WsmodelPackage.WFIELD: return createWField();
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
			case WsmodelPackage.WDEPENDENCY_TYPE:
				return createWDependencyTypeFromString(eDataType, initialValue);
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
			case WsmodelPackage.WDEPENDENCY_TYPE:
				return convertWDependencyTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WProject createWProject() {
		WProjectImpl wProject = new WProjectImpl();
		return wProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WWorkspace createWWorkspace() {
		WWorkspaceImpl wWorkspace = new WWorkspaceImpl();
		return wWorkspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WDependency createWDependency() {
		WDependencyImpl wDependency = new WDependencyImpl();
		return wDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WPackageFragmentRoot createWPackageFragmentRoot() {
		WPackageFragmentRootImpl wPackageFragmentRoot = new WPackageFragmentRootImpl();
		return wPackageFragmentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WPackageFragment createWPackageFragment() {
		WPackageFragmentImpl wPackageFragment = new WPackageFragmentImpl();
		return wPackageFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WCompilationUnit createWCompilationUnit() {
		WCompilationUnitImpl wCompilationUnit = new WCompilationUnitImpl();
		return wCompilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WType createWType() {
		WTypeImpl wType = new WTypeImpl();
		return wType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WMethod createWMethod() {
		WMethodImpl wMethod = new WMethodImpl();
		return wMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WField createWField() {
		WFieldImpl wField = new WFieldImpl();
		return wField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WDependencyType createWDependencyTypeFromString(EDataType eDataType, String initialValue) {
		WDependencyType result = WDependencyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWDependencyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsmodelPackage getWsmodelPackage() {
		return (WsmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WsmodelPackage getPackage() {
		return WsmodelPackage.eINSTANCE;
	}

} //WsmodelFactoryImpl

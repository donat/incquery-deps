/**
 */
package hu.bme.incquery.deps.cp1model.impl;

import hu.bme.incquery.deps.cp1model.*;

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
public class Cp1modelFactoryImpl extends EFactoryImpl implements Cp1modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cp1modelFactory init() {
		try {
			Cp1modelFactory theCp1modelFactory = (Cp1modelFactory)EPackage.Registry.INSTANCE.getEFactory("http://inf.mit.bme.hu/donat/incquery-deps/cp1model"); 
			if (theCp1modelFactory != null) {
				return theCp1modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cp1modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp1modelFactoryImpl() {
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
			case Cp1modelPackage.CP1_REPOSITORY: return createCP1Repository();
			case Cp1modelPackage.CP1_PROJECT: return createCP1Project();
			case Cp1modelPackage.CP1_DEPENDENCY: return createCP1Dependency();
			case Cp1modelPackage.CP1_CLASS: return createCP1Class();
			case Cp1modelPackage.CP1_METHOD: return createCP1Method();
			case Cp1modelPackage.CP1_FIELD: return createCP1Field();
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
			case Cp1modelPackage.CP1_DEPENDENCY_TYPE:
				return createCP1DependencyTypeFromString(eDataType, initialValue);
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
			case Cp1modelPackage.CP1_DEPENDENCY_TYPE:
				return convertCP1DependencyTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP1Repository createCP1Repository() {
		CP1RepositoryImpl cp1Repository = new CP1RepositoryImpl();
		return cp1Repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP1Project createCP1Project() {
		CP1ProjectImpl cp1Project = new CP1ProjectImpl();
		return cp1Project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP1Dependency createCP1Dependency() {
		CP1DependencyImpl cp1Dependency = new CP1DependencyImpl();
		return cp1Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP1Class createCP1Class() {
		CP1ClassImpl cp1Class = new CP1ClassImpl();
		return cp1Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP1Method createCP1Method() {
		CP1MethodImpl cp1Method = new CP1MethodImpl();
		return cp1Method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP1Field createCP1Field() {
		CP1FieldImpl cp1Field = new CP1FieldImpl();
		return cp1Field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP1DependencyType createCP1DependencyTypeFromString(EDataType eDataType, String initialValue) {
		CP1DependencyType result = CP1DependencyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCP1DependencyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp1modelPackage getCp1modelPackage() {
		return (Cp1modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cp1modelPackage getPackage() {
		return Cp1modelPackage.eINSTANCE;
	}

} //Cp1modelFactoryImpl

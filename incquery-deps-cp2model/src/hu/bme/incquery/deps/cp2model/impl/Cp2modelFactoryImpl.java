/**
 */
package hu.bme.incquery.deps.cp2model.impl;

import hu.bme.incquery.deps.cp2model.*;

import org.eclipse.emf.ecore.EClass;
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
public class Cp2modelFactoryImpl extends EFactoryImpl implements Cp2modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cp2modelFactory init() {
		try {
			Cp2modelFactory theCp2modelFactory = (Cp2modelFactory)EPackage.Registry.INSTANCE.getEFactory("http://inf.mit.bme.hu/donat/incquery-deps/cp2model"); 
			if (theCp2modelFactory != null) {
				return theCp2modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cp2modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp2modelFactoryImpl() {
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
			case Cp2modelPackage.CP2_REPOSITORY: return createCP2Repository();
			case Cp2modelPackage.CP2_PROJECT: return createCP2Project();
			case Cp2modelPackage.CP2_CLASS: return createCP2Class();
			case Cp2modelPackage.CP2_FIELD: return createCP2Field();
			case Cp2modelPackage.C2_METHODS: return createC2Methods();
			case Cp2modelPackage.CP2_DEPENDENCY: return createCP2Dependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP2Repository createCP2Repository() {
		CP2RepositoryImpl cp2Repository = new CP2RepositoryImpl();
		return cp2Repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP2Project createCP2Project() {
		CP2ProjectImpl cp2Project = new CP2ProjectImpl();
		return cp2Project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP2Class createCP2Class() {
		CP2ClassImpl cp2Class = new CP2ClassImpl();
		return cp2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP2Field createCP2Field() {
		CP2FieldImpl cp2Field = new CP2FieldImpl();
		return cp2Field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C2Methods createC2Methods() {
		C2MethodsImpl c2Methods = new C2MethodsImpl();
		return c2Methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP2Dependency createCP2Dependency() {
		CP2DependencyImpl cp2Dependency = new CP2DependencyImpl();
		return cp2Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp2modelPackage getCp2modelPackage() {
		return (Cp2modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cp2modelPackage getPackage() {
		return Cp2modelPackage.eINSTANCE;
	}

} //Cp2modelFactoryImpl

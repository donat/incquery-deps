/**
 */
package hu.bme.incquery.deps.cp3model.impl;

import hu.bme.incquery.deps.cp3model.*;

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
public class Cp3modelFactoryImpl extends EFactoryImpl implements Cp3modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cp3modelFactory init() {
		try {
			Cp3modelFactory theCp3modelFactory = (Cp3modelFactory)EPackage.Registry.INSTANCE.getEFactory("http://inf.mit.bme.hu/donat/incquery-deps/cp3model"); 
			if (theCp3modelFactory != null) {
				return theCp3modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cp3modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp3modelFactoryImpl() {
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
			case Cp3modelPackage.CP3_DEP: return createCP3Dep();
			case Cp3modelPackage.CP3_REPO: return createCP3Repo();
			case Cp3modelPackage.CP3_PROJECT: return createCP3Project();
			case Cp3modelPackage.CP3_CLASS: return createCP3Class();
			case Cp3modelPackage.CP3_METHOD: return createCP3Method();
			case Cp3modelPackage.CP3_FIELD: return createCP3Field();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3Dep createCP3Dep() {
		CP3DepImpl cp3Dep = new CP3DepImpl();
		return cp3Dep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3Repo createCP3Repo() {
		CP3RepoImpl cp3Repo = new CP3RepoImpl();
		return cp3Repo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3Project createCP3Project() {
		CP3ProjectImpl cp3Project = new CP3ProjectImpl();
		return cp3Project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3Class createCP3Class() {
		CP3ClassImpl cp3Class = new CP3ClassImpl();
		return cp3Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3Method createCP3Method() {
		CP3MethodImpl cp3Method = new CP3MethodImpl();
		return cp3Method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3Field createCP3Field() {
		CP3FieldImpl cp3Field = new CP3FieldImpl();
		return cp3Field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp3modelPackage getCp3modelPackage() {
		return (Cp3modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cp3modelPackage getPackage() {
		return Cp3modelPackage.eINSTANCE;
	}

} //Cp3modelFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.impl;

import hu.bme.incquery.deps.repomodel.*;

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
public class RepomodelFactoryImpl extends EFactoryImpl implements RepomodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepomodelFactory init() {
		try {
			RepomodelFactory theRepomodelFactory = (RepomodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://inf.mit.bme.hu/donat/incquery-deps/repomodel"); 
			if (theRepomodelFactory != null) {
				return theRepomodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RepomodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepomodelFactoryImpl() {
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
			case RepomodelPackage.RPROJECT: return createRProject();
			case RepomodelPackage.RCLASS: return createRClass();
			case RepomodelPackage.RMETHOD: return createRMethod();
			case RepomodelPackage.RFIELD: return createRField();
			case RepomodelPackage.RDEPENDENCY: return createRDependency();
			case RepomodelPackage.RREPOSITORY: return createRRepository();
			case RepomodelPackage.RTRANSITIVE_DEPENDENCY: return createRTransitiveDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RProject createRProject() {
		RProjectImpl rProject = new RProjectImpl();
		return rProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RClass createRClass() {
		RClassImpl rClass = new RClassImpl();
		return rClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMethod createRMethod() {
		RMethodImpl rMethod = new RMethodImpl();
		return rMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RField createRField() {
		RFieldImpl rField = new RFieldImpl();
		return rField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDependency createRDependency() {
		RDependencyImpl rDependency = new RDependencyImpl();
		return rDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RRepository createRRepository() {
		RRepositoryImpl rRepository = new RRepositoryImpl();
		return rRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTransitiveDependency createRTransitiveDependency() {
		RTransitiveDependencyImpl rTransitiveDependency = new RTransitiveDependencyImpl();
		return rTransitiveDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepomodelPackage getRepomodelPackage() {
		return (RepomodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RepomodelPackage getPackage() {
		return RepomodelPackage.eINSTANCE;
	}

} //RepomodelFactoryImpl

/**
 */
package hu.bme.incquery.deps.cp3model.impl;

import hu.bme.incquery.deps.cp3model.CP3Dep;
import hu.bme.incquery.deps.cp3model.CP3Repo;
import hu.bme.incquery.deps.cp3model.CP3StElem;
import hu.bme.incquery.deps.cp3model.Cp3modelFactory;
import hu.bme.incquery.deps.cp3model.Cp3modelPackage;
import hu.bme.incquery.deps.cp3model.Types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cp3modelPackageImpl extends EPackageImpl implements Cp3modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp3StElemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp3DepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp3RepoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.incquery.deps.cp3model.Cp3modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Cp3modelPackageImpl() {
		super(eNS_URI, Cp3modelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Cp3modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Cp3modelPackage init() {
		if (isInited) return (Cp3modelPackage)EPackage.Registry.INSTANCE.getEPackage(Cp3modelPackage.eNS_URI);

		// Obtain or create and register package
		Cp3modelPackageImpl theCp3modelPackage = (Cp3modelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Cp3modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Cp3modelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCp3modelPackage.createPackageContents();

		// Initialize created meta-data
		theCp3modelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCp3modelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Cp3modelPackage.eNS_URI, theCp3modelPackage);
		return theCp3modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP3StElem() {
		return cp3StElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP3StElem_Id() {
		return (EAttribute)cp3StElemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP3StElem_Attr() {
		return (EAttribute)cp3StElemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP3StElem_Sig() {
		return (EAttribute)cp3StElemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3StElem_Ch() {
		return (EReference)cp3StElemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP3Dep() {
		return cp3DepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Dep_From() {
		return (EReference)cp3DepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Dep_To() {
		return (EReference)cp3DepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP3Dep_Type() {
		return (EAttribute)cp3DepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP3Repo() {
		return cp3RepoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Repo_Deps() {
		return (EReference)cp3RepoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Repo_Elems() {
		return (EReference)cp3RepoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypes() {
		return typesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp3modelFactory getCp3modelFactory() {
		return (Cp3modelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cp3StElemEClass = createEClass(CP3_ST_ELEM);
		createEAttribute(cp3StElemEClass, CP3_ST_ELEM__ID);
		createEAttribute(cp3StElemEClass, CP3_ST_ELEM__ATTR);
		createEAttribute(cp3StElemEClass, CP3_ST_ELEM__SIG);
		createEReference(cp3StElemEClass, CP3_ST_ELEM__CH);

		cp3DepEClass = createEClass(CP3_DEP);
		createEReference(cp3DepEClass, CP3_DEP__FROM);
		createEReference(cp3DepEClass, CP3_DEP__TO);
		createEAttribute(cp3DepEClass, CP3_DEP__TYPE);

		cp3RepoEClass = createEClass(CP3_REPO);
		createEReference(cp3RepoEClass, CP3_REPO__DEPS);
		createEReference(cp3RepoEClass, CP3_REPO__ELEMS);

		// Create enums
		typesEEnum = createEEnum(TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cp3StElemEClass, CP3StElem.class, "CP3StElem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCP3StElem_Id(), ecorePackage.getELong(), "id", null, 0, 1, CP3StElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP3StElem_Attr(), ecorePackage.getEShort(), "attr", null, 0, 1, CP3StElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP3StElem_Sig(), ecorePackage.getEString(), "sig", null, 0, 1, CP3StElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP3StElem_Ch(), this.getCP3StElem(), null, "ch", null, 0, -1, CP3StElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp3DepEClass, CP3Dep.class, "CP3Dep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP3Dep_From(), this.getCP3StElem(), null, "from", null, 0, 1, CP3Dep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP3Dep_To(), this.getCP3StElem(), null, "to", null, 0, 1, CP3Dep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP3Dep_Type(), ecorePackage.getEShort(), "type", null, 0, 1, CP3Dep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp3RepoEClass, CP3Repo.class, "CP3Repo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP3Repo_Deps(), this.getCP3Dep(), null, "deps", null, 0, -1, CP3Repo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP3Repo_Elems(), this.getCP3StElem(), null, "elems", null, 0, -1, CP3Repo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typesEEnum, Types.class, "Types");
		addEEnumLiteral(typesEEnum, Types.PROJECT);
		addEEnumLiteral(typesEEnum, Types.CLASS);
		addEEnumLiteral(typesEEnum, Types.METHOD);
		addEEnumLiteral(typesEEnum, Types.FIELD);

		// Create resource
		createResource(eNS_URI);
	}

} //Cp3modelPackageImpl

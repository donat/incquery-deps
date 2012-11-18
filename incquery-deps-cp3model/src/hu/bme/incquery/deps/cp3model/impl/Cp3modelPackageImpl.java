/**
 */
package hu.bme.incquery.deps.cp3model.impl;

import hu.bme.incquery.deps.cp3model.CP3AbstractItem;
import hu.bme.incquery.deps.cp3model.CP3Class;
import hu.bme.incquery.deps.cp3model.CP3Dep;
import hu.bme.incquery.deps.cp3model.CP3Field;
import hu.bme.incquery.deps.cp3model.CP3Method;
import hu.bme.incquery.deps.cp3model.CP3Project;
import hu.bme.incquery.deps.cp3model.CP3Repo;
import hu.bme.incquery.deps.cp3model.Cp3modelFactory;
import hu.bme.incquery.deps.cp3model.Cp3modelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass cp3ProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp3ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp3AbstractItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp3MethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp3FieldEClass = null;

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
	public EClass getCP3Dep() {
		return cp3DepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP3Dep_Type() {
		return (EAttribute)cp3DepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Dep_From() {
		return (EReference)cp3DepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Dep_To() {
		return (EReference)cp3DepEClass.getEStructuralFeatures().get(2);
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
	public EReference getCP3Repo_Items() {
		return (EReference)cp3RepoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP3Project() {
		return cp3ProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Project_Classes() {
		return (EReference)cp3ProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP3Class() {
		return cp3ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Class_Projects() {
		return (EReference)cp3ClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Class_Methods() {
		return (EReference)cp3ClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Class_Fields() {
		return (EReference)cp3ClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP3AbstractItem() {
		return cp3AbstractItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP3AbstractItem_Id() {
		return (EAttribute)cp3AbstractItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP3AbstractItem_Name() {
		return (EAttribute)cp3AbstractItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP3Method() {
		return cp3MethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Method_Classes() {
		return (EReference)cp3MethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP3Field() {
		return cp3FieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP3Field_Classes() {
		return (EReference)cp3FieldEClass.getEStructuralFeatures().get(0);
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
		cp3DepEClass = createEClass(CP3_DEP);
		createEAttribute(cp3DepEClass, CP3_DEP__TYPE);
		createEReference(cp3DepEClass, CP3_DEP__FROM);
		createEReference(cp3DepEClass, CP3_DEP__TO);

		cp3RepoEClass = createEClass(CP3_REPO);
		createEReference(cp3RepoEClass, CP3_REPO__DEPS);
		createEReference(cp3RepoEClass, CP3_REPO__ITEMS);

		cp3ProjectEClass = createEClass(CP3_PROJECT);
		createEReference(cp3ProjectEClass, CP3_PROJECT__CLASSES);

		cp3ClassEClass = createEClass(CP3_CLASS);
		createEReference(cp3ClassEClass, CP3_CLASS__PROJECTS);
		createEReference(cp3ClassEClass, CP3_CLASS__METHODS);
		createEReference(cp3ClassEClass, CP3_CLASS__FIELDS);

		cp3AbstractItemEClass = createEClass(CP3_ABSTRACT_ITEM);
		createEAttribute(cp3AbstractItemEClass, CP3_ABSTRACT_ITEM__ID);
		createEAttribute(cp3AbstractItemEClass, CP3_ABSTRACT_ITEM__NAME);

		cp3MethodEClass = createEClass(CP3_METHOD);
		createEReference(cp3MethodEClass, CP3_METHOD__CLASSES);

		cp3FieldEClass = createEClass(CP3_FIELD);
		createEReference(cp3FieldEClass, CP3_FIELD__CLASSES);
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
		cp3ProjectEClass.getESuperTypes().add(this.getCP3AbstractItem());
		cp3ClassEClass.getESuperTypes().add(this.getCP3AbstractItem());
		cp3MethodEClass.getESuperTypes().add(this.getCP3AbstractItem());
		cp3FieldEClass.getESuperTypes().add(this.getCP3AbstractItem());

		// Initialize classes and features; add operations and parameters
		initEClass(cp3DepEClass, CP3Dep.class, "CP3Dep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCP3Dep_Type(), ecorePackage.getEShort(), "type", null, 0, 1, CP3Dep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP3Dep_From(), this.getCP3AbstractItem(), null, "from", null, 1, 1, CP3Dep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP3Dep_To(), this.getCP3AbstractItem(), null, "to", null, 1, 1, CP3Dep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp3RepoEClass, CP3Repo.class, "CP3Repo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP3Repo_Deps(), this.getCP3Dep(), null, "deps", null, 0, -1, CP3Repo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP3Repo_Items(), this.getCP3AbstractItem(), null, "items", null, 0, -1, CP3Repo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp3ProjectEClass, CP3Project.class, "CP3Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP3Project_Classes(), this.getCP3Class(), this.getCP3Class_Projects(), "classes", null, 0, -1, CP3Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp3ClassEClass, CP3Class.class, "CP3Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP3Class_Projects(), this.getCP3Project(), this.getCP3Project_Classes(), "projects", null, 0, -1, CP3Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP3Class_Methods(), this.getCP3Method(), this.getCP3Method_Classes(), "methods", null, 0, -1, CP3Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP3Class_Fields(), this.getCP3Field(), this.getCP3Field_Classes(), "fields", null, 0, -1, CP3Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp3AbstractItemEClass, CP3AbstractItem.class, "CP3AbstractItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCP3AbstractItem_Id(), ecorePackage.getELong(), "id", null, 0, 1, CP3AbstractItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP3AbstractItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, CP3AbstractItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp3MethodEClass, CP3Method.class, "CP3Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP3Method_Classes(), this.getCP3Class(), this.getCP3Class_Methods(), "classes", null, 0, -1, CP3Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp3FieldEClass, CP3Field.class, "CP3Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP3Field_Classes(), this.getCP3Class(), this.getCP3Class_Fields(), "classes", null, 0, -1, CP3Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Cp3modelPackageImpl

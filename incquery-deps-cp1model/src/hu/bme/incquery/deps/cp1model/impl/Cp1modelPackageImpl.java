/**
 */
package hu.bme.incquery.deps.cp1model.impl;

import hu.bme.incquery.deps.cp1model.CP1Class;
import hu.bme.incquery.deps.cp1model.CP1CodeElement;
import hu.bme.incquery.deps.cp1model.CP1Dependency;
import hu.bme.incquery.deps.cp1model.CP1DependencyType;
import hu.bme.incquery.deps.cp1model.CP1Field;
import hu.bme.incquery.deps.cp1model.CP1Method;
import hu.bme.incquery.deps.cp1model.CP1Project;
import hu.bme.incquery.deps.cp1model.CP1Repository;
import hu.bme.incquery.deps.cp1model.Cp1modelFactory;
import hu.bme.incquery.deps.cp1model.Cp1modelPackage;

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
public class Cp1modelPackageImpl extends EPackageImpl implements Cp1modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp1RepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp1ProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp1DependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp1ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp1MethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp1FieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp1CodeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cp1DependencyTypeEEnum = null;

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
	 * @see hu.bme.incquery.deps.cp1model.Cp1modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Cp1modelPackageImpl() {
		super(eNS_URI, Cp1modelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Cp1modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Cp1modelPackage init() {
		if (isInited) return (Cp1modelPackage)EPackage.Registry.INSTANCE.getEPackage(Cp1modelPackage.eNS_URI);

		// Obtain or create and register package
		Cp1modelPackageImpl theCp1modelPackage = (Cp1modelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Cp1modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Cp1modelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCp1modelPackage.createPackageContents();

		// Initialize created meta-data
		theCp1modelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCp1modelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Cp1modelPackage.eNS_URI, theCp1modelPackage);
		return theCp1modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP1Repository() {
		return cp1RepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP1Repository_Projects() {
		return (EReference)cp1RepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP1Repository_Dependencies() {
		return (EReference)cp1RepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP1Project() {
		return cp1ProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP1Project_Classes() {
		return (EReference)cp1ProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP1Project_Name() {
		return (EAttribute)cp1ProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP1Dependency() {
		return cp1DependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP1Dependency_From() {
		return (EReference)cp1DependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP1Dependency_To() {
		return (EReference)cp1DependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP1Dependency_Type() {
		return (EAttribute)cp1DependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP1Class() {
		return cp1ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP1Class_Methods() {
		return (EReference)cp1ClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP1Class_Fields() {
		return (EReference)cp1ClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP1Class_Extends() {
		return (EAttribute)cp1ClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP1Class_Implements() {
		return (EAttribute)cp1ClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP1Class_SimpleName() {
		return (EAttribute)cp1ClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP1Class_PackageName() {
		return (EAttribute)cp1ClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP1Method() {
		return cp1MethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP1Method_Signature() {
		return (EAttribute)cp1MethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP1Field() {
		return cp1FieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP1Field_Signature() {
		return (EAttribute)cp1FieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP1CodeElement() {
		return cp1CodeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP1CodeElement_Id() {
		return (EAttribute)cp1CodeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCP1DependencyType() {
		return cp1DependencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp1modelFactory getCp1modelFactory() {
		return (Cp1modelFactory)getEFactoryInstance();
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
		cp1RepositoryEClass = createEClass(CP1_REPOSITORY);
		createEReference(cp1RepositoryEClass, CP1_REPOSITORY__PROJECTS);
		createEReference(cp1RepositoryEClass, CP1_REPOSITORY__DEPENDENCIES);

		cp1ProjectEClass = createEClass(CP1_PROJECT);
		createEReference(cp1ProjectEClass, CP1_PROJECT__CLASSES);
		createEAttribute(cp1ProjectEClass, CP1_PROJECT__NAME);

		cp1DependencyEClass = createEClass(CP1_DEPENDENCY);
		createEReference(cp1DependencyEClass, CP1_DEPENDENCY__FROM);
		createEReference(cp1DependencyEClass, CP1_DEPENDENCY__TO);
		createEAttribute(cp1DependencyEClass, CP1_DEPENDENCY__TYPE);

		cp1ClassEClass = createEClass(CP1_CLASS);
		createEReference(cp1ClassEClass, CP1_CLASS__METHODS);
		createEReference(cp1ClassEClass, CP1_CLASS__FIELDS);
		createEAttribute(cp1ClassEClass, CP1_CLASS__EXTENDS);
		createEAttribute(cp1ClassEClass, CP1_CLASS__IMPLEMENTS);
		createEAttribute(cp1ClassEClass, CP1_CLASS__SIMPLE_NAME);
		createEAttribute(cp1ClassEClass, CP1_CLASS__PACKAGE_NAME);

		cp1MethodEClass = createEClass(CP1_METHOD);
		createEAttribute(cp1MethodEClass, CP1_METHOD__SIGNATURE);

		cp1FieldEClass = createEClass(CP1_FIELD);
		createEAttribute(cp1FieldEClass, CP1_FIELD__SIGNATURE);

		cp1CodeElementEClass = createEClass(CP1_CODE_ELEMENT);
		createEAttribute(cp1CodeElementEClass, CP1_CODE_ELEMENT__ID);

		// Create enums
		cp1DependencyTypeEEnum = createEEnum(CP1_DEPENDENCY_TYPE);
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
		cp1ProjectEClass.getESuperTypes().add(this.getCP1CodeElement());
		cp1ClassEClass.getESuperTypes().add(this.getCP1CodeElement());
		cp1MethodEClass.getESuperTypes().add(this.getCP1CodeElement());
		cp1FieldEClass.getESuperTypes().add(this.getCP1CodeElement());

		// Initialize classes and features; add operations and parameters
		initEClass(cp1RepositoryEClass, CP1Repository.class, "CP1Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP1Repository_Projects(), this.getCP1Project(), null, "projects", null, 0, -1, CP1Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP1Repository_Dependencies(), this.getCP1Dependency(), null, "dependencies", null, 0, -1, CP1Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp1ProjectEClass, CP1Project.class, "CP1Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP1Project_Classes(), this.getCP1Class(), null, "classes", null, 0, -1, CP1Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP1Project_Name(), ecorePackage.getEString(), "name", null, 0, 1, CP1Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp1DependencyEClass, CP1Dependency.class, "CP1Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP1Dependency_From(), this.getCP1CodeElement(), null, "from", null, 1, 1, CP1Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP1Dependency_To(), this.getCP1CodeElement(), null, "to", null, 1, 1, CP1Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP1Dependency_Type(), this.getCP1DependencyType(), "type", null, 0, 1, CP1Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp1ClassEClass, CP1Class.class, "CP1Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP1Class_Methods(), this.getCP1Method(), null, "methods", null, 0, -1, CP1Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP1Class_Fields(), this.getCP1Field(), null, "fields", null, 0, -1, CP1Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP1Class_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, CP1Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP1Class_Implements(), ecorePackage.getEString(), "implements", null, 0, 1, CP1Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP1Class_SimpleName(), ecorePackage.getEString(), "simpleName", null, 0, 1, CP1Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP1Class_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, CP1Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp1MethodEClass, CP1Method.class, "CP1Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCP1Method_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, CP1Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp1FieldEClass, CP1Field.class, "CP1Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCP1Field_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, CP1Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp1CodeElementEClass, CP1CodeElement.class, "CP1CodeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCP1CodeElement_Id(), ecorePackage.getELong(), "id", null, 0, 1, CP1CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cp1DependencyTypeEEnum, CP1DependencyType.class, "CP1DependencyType");
		addEEnumLiteral(cp1DependencyTypeEEnum, CP1DependencyType.INHERITANCE);
		addEEnumLiteral(cp1DependencyTypeEEnum, CP1DependencyType.METHOD_CALL);
		addEEnumLiteral(cp1DependencyTypeEEnum, CP1DependencyType.METHOD_OVERRIDE);
		addEEnumLiteral(cp1DependencyTypeEEnum, CP1DependencyType.FIELD_REFERENCE);
		addEEnumLiteral(cp1DependencyTypeEEnum, CP1DependencyType.CLASS_USAGE);

		// Create resource
		createResource(eNS_URI);
	}

} //Cp1modelPackageImpl

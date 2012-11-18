/**
 */
package hu.bme.incquery.deps.cp2model.impl;

import hu.bme.incquery.deps.cp2model.C2CodeElement;
import hu.bme.incquery.deps.cp2model.C2Methods;
import hu.bme.incquery.deps.cp2model.CP2Class;
import hu.bme.incquery.deps.cp2model.CP2Dependency;
import hu.bme.incquery.deps.cp2model.CP2Field;
import hu.bme.incquery.deps.cp2model.CP2Project;
import hu.bme.incquery.deps.cp2model.CP2Repository;
import hu.bme.incquery.deps.cp2model.Cp2modelFactory;
import hu.bme.incquery.deps.cp2model.Cp2modelPackage;

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
public class Cp2modelPackageImpl extends EPackageImpl implements Cp2modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp2RepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp2ProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp2FieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c2CodeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c2MethodsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cp2DependencyEClass = null;

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
	 * @see hu.bme.incquery.deps.cp2model.Cp2modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Cp2modelPackageImpl() {
		super(eNS_URI, Cp2modelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Cp2modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Cp2modelPackage init() {
		if (isInited) return (Cp2modelPackage)EPackage.Registry.INSTANCE.getEPackage(Cp2modelPackage.eNS_URI);

		// Obtain or create and register package
		Cp2modelPackageImpl theCp2modelPackage = (Cp2modelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Cp2modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Cp2modelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCp2modelPackage.createPackageContents();

		// Initialize created meta-data
		theCp2modelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCp2modelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Cp2modelPackage.eNS_URI, theCp2modelPackage);
		return theCp2modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP2Repository() {
		return cp2RepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP2Repository_Elements() {
		return (EReference)cp2RepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP2Project() {
		return cp2ProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP2Project_Classes() {
		return (EReference)cp2ProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP2Project_Name() {
		return (EAttribute)cp2ProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP2Class() {
		return cp2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP2Class_Fields() {
		return (EReference)cp2ClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP2Class_Methods() {
		return (EReference)cp2ClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP2Class_Extends() {
		return (EAttribute)cp2ClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP2Class_Implements() {
		return (EAttribute)cp2ClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP2Class_SimpleName() {
		return (EAttribute)cp2ClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP2Field() {
		return cp2FieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP2Field_Name() {
		return (EAttribute)cp2FieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC2CodeElement() {
		return c2CodeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC2CodeElement_Id() {
		return (EAttribute)c2CodeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC2Methods() {
		return c2MethodsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC2Methods_Name() {
		return (EAttribute)c2MethodsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCP2Dependency() {
		return cp2DependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP2Dependency_From() {
		return (EReference)cp2DependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCP2Dependency_To() {
		return (EReference)cp2DependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCP2Dependency_Type() {
		return (EAttribute)cp2DependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cp2modelFactory getCp2modelFactory() {
		return (Cp2modelFactory)getEFactoryInstance();
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
		cp2RepositoryEClass = createEClass(CP2_REPOSITORY);
		createEReference(cp2RepositoryEClass, CP2_REPOSITORY__ELEMENTS);

		cp2ProjectEClass = createEClass(CP2_PROJECT);
		createEReference(cp2ProjectEClass, CP2_PROJECT__CLASSES);
		createEAttribute(cp2ProjectEClass, CP2_PROJECT__NAME);

		cp2ClassEClass = createEClass(CP2_CLASS);
		createEReference(cp2ClassEClass, CP2_CLASS__FIELDS);
		createEReference(cp2ClassEClass, CP2_CLASS__METHODS);
		createEAttribute(cp2ClassEClass, CP2_CLASS__EXTENDS);
		createEAttribute(cp2ClassEClass, CP2_CLASS__IMPLEMENTS);
		createEAttribute(cp2ClassEClass, CP2_CLASS__SIMPLE_NAME);

		cp2FieldEClass = createEClass(CP2_FIELD);
		createEAttribute(cp2FieldEClass, CP2_FIELD__NAME);

		c2CodeElementEClass = createEClass(C2_CODE_ELEMENT);
		createEAttribute(c2CodeElementEClass, C2_CODE_ELEMENT__ID);

		c2MethodsEClass = createEClass(C2_METHODS);
		createEAttribute(c2MethodsEClass, C2_METHODS__NAME);

		cp2DependencyEClass = createEClass(CP2_DEPENDENCY);
		createEReference(cp2DependencyEClass, CP2_DEPENDENCY__FROM);
		createEReference(cp2DependencyEClass, CP2_DEPENDENCY__TO);
		createEAttribute(cp2DependencyEClass, CP2_DEPENDENCY__TYPE);
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
		cp2ProjectEClass.getESuperTypes().add(this.getC2CodeElement());
		cp2ClassEClass.getESuperTypes().add(this.getC2CodeElement());
		cp2FieldEClass.getESuperTypes().add(this.getC2CodeElement());
		c2MethodsEClass.getESuperTypes().add(this.getC2CodeElement());

		// Initialize classes and features; add operations and parameters
		initEClass(cp2RepositoryEClass, CP2Repository.class, "CP2Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP2Repository_Elements(), this.getC2CodeElement(), null, "elements", null, 0, -1, CP2Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp2ProjectEClass, CP2Project.class, "CP2Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP2Project_Classes(), this.getCP2Class(), null, "classes", null, 0, -1, CP2Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP2Project_Name(), ecorePackage.getEString(), "name", null, 0, 1, CP2Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp2ClassEClass, CP2Class.class, "CP2Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP2Class_Fields(), this.getCP2Field(), null, "fields", null, 0, -1, CP2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP2Class_Methods(), this.getC2Methods(), null, "methods", null, 0, -1, CP2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP2Class_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, CP2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP2Class_Implements(), ecorePackage.getEString(), "implements", null, 0, 1, CP2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP2Class_SimpleName(), ecorePackage.getEString(), "simpleName", null, 0, 1, CP2Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp2FieldEClass, CP2Field.class, "CP2Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCP2Field_Name(), ecorePackage.getEString(), "name", null, 0, 1, CP2Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c2CodeElementEClass, C2CodeElement.class, "C2CodeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC2CodeElement_Id(), ecorePackage.getELong(), "id", null, 0, 1, C2CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c2MethodsEClass, C2Methods.class, "C2Methods", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC2Methods_Name(), ecorePackage.getEString(), "name", null, 0, 1, C2Methods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cp2DependencyEClass, CP2Dependency.class, "CP2Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCP2Dependency_From(), this.getC2CodeElement(), null, "from", null, 1, 1, CP2Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCP2Dependency_To(), this.getC2CodeElement(), null, "to", null, 1, 1, CP2Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCP2Dependency_Type(), ecorePackage.getEShort(), "type", null, 0, 1, CP2Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Cp2modelPackageImpl

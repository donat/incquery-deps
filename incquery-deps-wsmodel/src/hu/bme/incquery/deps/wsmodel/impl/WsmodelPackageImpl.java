/**
 */
package hu.bme.incquery.deps.wsmodel.impl;

import hu.bme.incquery.deps.wsmodel.WCompilationUnit;
import hu.bme.incquery.deps.wsmodel.WDependency;
import hu.bme.incquery.deps.wsmodel.WDependencyType;
import hu.bme.incquery.deps.wsmodel.WField;
import hu.bme.incquery.deps.wsmodel.WMethod;
import hu.bme.incquery.deps.wsmodel.WNamedElement;
import hu.bme.incquery.deps.wsmodel.WPackageFragment;
import hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot;
import hu.bme.incquery.deps.wsmodel.WProject;
import hu.bme.incquery.deps.wsmodel.WType;
import hu.bme.incquery.deps.wsmodel.WWorkspace;
import hu.bme.incquery.deps.wsmodel.WsmodelFactory;
import hu.bme.incquery.deps.wsmodel.WsmodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WsmodelPackageImpl extends EPackageImpl implements WsmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wWorkspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wPackageFragmentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wPackageFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wCompilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wDependencyTypeEEnum = null;

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
	 * @see hu.bme.incquery.deps.wsmodel.WsmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WsmodelPackageImpl() {
		super(eNS_URI, WsmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WsmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WsmodelPackage init() {
		if (isInited) return (WsmodelPackage)EPackage.Registry.INSTANCE.getEPackage(WsmodelPackage.eNS_URI);

		// Obtain or create and register package
		WsmodelPackageImpl theWsmodelPackage = (WsmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WsmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WsmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWsmodelPackage.createPackageContents();

		// Initialize created meta-data
		theWsmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWsmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WsmodelPackage.eNS_URI, theWsmodelPackage);
		return theWsmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWProject() {
		return wProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWProject_PackageFragmentRoots() {
		return (EReference)wProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWProject_Workspace() {
		return (EReference)wProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWWorkspace() {
		return wWorkspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWWorkspace_Projects() {
		return (EReference)wWorkspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWWorkspace_Elements() {
		return (EReference)wWorkspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWWorkspace_Dependencties() {
		return (EReference)wWorkspaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWNamedElement() {
		return wNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWNamedElement_Name() {
		return (EAttribute)wNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWNamedElement_Handler() {
		return (EAttribute)wNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWNamedElement_IncomingDependencies() {
		return (EReference)wNamedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWNamedElement_OutgoingDependencies() {
		return (EReference)wNamedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWDependency() {
		return wDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWDependency_From() {
		return (EReference)wDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWDependency_To() {
		return (EReference)wDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWDependency_Type() {
		return (EAttribute)wDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWPackageFragmentRoot() {
		return wPackageFragmentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWPackageFragmentRoot_Project() {
		return (EReference)wPackageFragmentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWPackageFragmentRoot_PackageFragments() {
		return (EReference)wPackageFragmentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWPackageFragment() {
		return wPackageFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWPackageFragment_PackageFragmentRoot() {
		return (EReference)wPackageFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWPackageFragment_CompilationUnits() {
		return (EReference)wPackageFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWCompilationUnit() {
		return wCompilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWCompilationUnit_PackageFragment() {
		return (EReference)wCompilationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWCompilationUnit_Types() {
		return (EReference)wCompilationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWType() {
		return wTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWType_CompilationUnit() {
		return (EReference)wTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWType_Methods() {
		return (EReference)wTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWType_Fields() {
		return (EReference)wTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWMethod() {
		return wMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWMethod_Type() {
		return (EReference)wMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWMethod_Signature() {
		return (EAttribute)wMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWField() {
		return wFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWField_Type() {
		return (EReference)wFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWField_Signature() {
		return (EAttribute)wFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWDependencyType() {
		return wDependencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsmodelFactory getWsmodelFactory() {
		return (WsmodelFactory)getEFactoryInstance();
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
		wProjectEClass = createEClass(WPROJECT);
		createEReference(wProjectEClass, WPROJECT__PACKAGE_FRAGMENT_ROOTS);
		createEReference(wProjectEClass, WPROJECT__WORKSPACE);

		wWorkspaceEClass = createEClass(WWORKSPACE);
		createEReference(wWorkspaceEClass, WWORKSPACE__PROJECTS);
		createEReference(wWorkspaceEClass, WWORKSPACE__ELEMENTS);
		createEReference(wWorkspaceEClass, WWORKSPACE__DEPENDENCTIES);

		wNamedElementEClass = createEClass(WNAMED_ELEMENT);
		createEAttribute(wNamedElementEClass, WNAMED_ELEMENT__NAME);
		createEAttribute(wNamedElementEClass, WNAMED_ELEMENT__HANDLER);
		createEReference(wNamedElementEClass, WNAMED_ELEMENT__INCOMING_DEPENDENCIES);
		createEReference(wNamedElementEClass, WNAMED_ELEMENT__OUTGOING_DEPENDENCIES);

		wDependencyEClass = createEClass(WDEPENDENCY);
		createEReference(wDependencyEClass, WDEPENDENCY__FROM);
		createEReference(wDependencyEClass, WDEPENDENCY__TO);
		createEAttribute(wDependencyEClass, WDEPENDENCY__TYPE);

		wPackageFragmentRootEClass = createEClass(WPACKAGE_FRAGMENT_ROOT);
		createEReference(wPackageFragmentRootEClass, WPACKAGE_FRAGMENT_ROOT__PROJECT);
		createEReference(wPackageFragmentRootEClass, WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS);

		wPackageFragmentEClass = createEClass(WPACKAGE_FRAGMENT);
		createEReference(wPackageFragmentEClass, WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT);
		createEReference(wPackageFragmentEClass, WPACKAGE_FRAGMENT__COMPILATION_UNITS);

		wCompilationUnitEClass = createEClass(WCOMPILATION_UNIT);
		createEReference(wCompilationUnitEClass, WCOMPILATION_UNIT__PACKAGE_FRAGMENT);
		createEReference(wCompilationUnitEClass, WCOMPILATION_UNIT__TYPES);

		wTypeEClass = createEClass(WTYPE);
		createEReference(wTypeEClass, WTYPE__COMPILATION_UNIT);
		createEReference(wTypeEClass, WTYPE__METHODS);
		createEReference(wTypeEClass, WTYPE__FIELDS);

		wMethodEClass = createEClass(WMETHOD);
		createEReference(wMethodEClass, WMETHOD__TYPE);
		createEAttribute(wMethodEClass, WMETHOD__SIGNATURE);

		wFieldEClass = createEClass(WFIELD);
		createEReference(wFieldEClass, WFIELD__TYPE);
		createEAttribute(wFieldEClass, WFIELD__SIGNATURE);

		// Create enums
		wDependencyTypeEEnum = createEEnum(WDEPENDENCY_TYPE);
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
		wProjectEClass.getESuperTypes().add(this.getWNamedElement());
		wPackageFragmentRootEClass.getESuperTypes().add(this.getWNamedElement());
		wPackageFragmentEClass.getESuperTypes().add(this.getWNamedElement());
		wCompilationUnitEClass.getESuperTypes().add(this.getWNamedElement());
		wTypeEClass.getESuperTypes().add(this.getWNamedElement());
		wMethodEClass.getESuperTypes().add(this.getWNamedElement());
		wFieldEClass.getESuperTypes().add(this.getWNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(wProjectEClass, WProject.class, "WProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWProject_PackageFragmentRoots(), this.getWPackageFragmentRoot(), this.getWPackageFragmentRoot_Project(), "packageFragmentRoots", null, 0, -1, WProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWProject_Workspace(), this.getWWorkspace(), this.getWWorkspace_Projects(), "workspace", null, 0, 1, WProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wWorkspaceEClass, WWorkspace.class, "WWorkspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWWorkspace_Projects(), this.getWProject(), this.getWProject_Workspace(), "projects", null, 0, -1, WWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWWorkspace_Elements(), this.getWNamedElement(), null, "elements", null, 0, -1, WWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWWorkspace_Dependencties(), this.getWDependency(), null, "dependencties", null, 0, -1, WWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wNamedElementEClass, WNamedElement.class, "WNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, WNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWNamedElement_Handler(), ecorePackage.getEString(), "handler", null, 0, 1, WNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWNamedElement_IncomingDependencies(), this.getWDependency(), this.getWDependency_To(), "incomingDependencies", null, 0, -1, WNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWNamedElement_OutgoingDependencies(), this.getWDependency(), this.getWDependency_From(), "outgoingDependencies", null, 0, -1, WNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(wNamedElementEClass, this.getWNamedElement(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(wNamedElementEClass, null, "getChildren", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(this.getWNamedElement());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(wNamedElementEClass, null, "setParent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWNamedElement(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(wNamedElementEClass, null, "addChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWNamedElement(), "child", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(wDependencyEClass, WDependency.class, "WDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWDependency_From(), this.getWNamedElement(), this.getWNamedElement_OutgoingDependencies(), "from", null, 1, 1, WDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWDependency_To(), this.getWNamedElement(), this.getWNamedElement_IncomingDependencies(), "to", null, 1, 1, WDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWDependency_Type(), this.getWDependencyType(), "type", null, 0, 1, WDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wPackageFragmentRootEClass, WPackageFragmentRoot.class, "WPackageFragmentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWPackageFragmentRoot_Project(), this.getWProject(), this.getWProject_PackageFragmentRoots(), "project", null, 1, 1, WPackageFragmentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWPackageFragmentRoot_PackageFragments(), this.getWPackageFragment(), this.getWPackageFragment_PackageFragmentRoot(), "packageFragments", null, 0, -1, WPackageFragmentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wPackageFragmentEClass, WPackageFragment.class, "WPackageFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWPackageFragment_PackageFragmentRoot(), this.getWPackageFragmentRoot(), this.getWPackageFragmentRoot_PackageFragments(), "packageFragmentRoot", null, 0, 1, WPackageFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWPackageFragment_CompilationUnits(), this.getWCompilationUnit(), this.getWCompilationUnit_PackageFragment(), "compilationUnits", null, 0, -1, WPackageFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wCompilationUnitEClass, WCompilationUnit.class, "WCompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWCompilationUnit_PackageFragment(), this.getWPackageFragment(), this.getWPackageFragment_CompilationUnits(), "packageFragment", null, 0, 1, WCompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWCompilationUnit_Types(), this.getWType(), this.getWType_CompilationUnit(), "types", null, 0, -1, WCompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wTypeEClass, WType.class, "WType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWType_CompilationUnit(), this.getWCompilationUnit(), this.getWCompilationUnit_Types(), "compilationUnit", null, 0, 1, WType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWType_Methods(), this.getWMethod(), this.getWMethod_Type(), "methods", null, 0, -1, WType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWType_Fields(), this.getWField(), this.getWField_Type(), "fields", null, 0, -1, WType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wMethodEClass, WMethod.class, "WMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWMethod_Type(), this.getWType(), this.getWType_Methods(), "type", null, 0, 1, WMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWMethod_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, WMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wFieldEClass, WField.class, "WField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWField_Type(), this.getWType(), this.getWType_Fields(), "type", null, 0, 1, WField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWField_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, WField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(wDependencyTypeEEnum, WDependencyType.class, "WDependencyType");
		addEEnumLiteral(wDependencyTypeEEnum, WDependencyType.CLASS_USAGE);
		addEEnumLiteral(wDependencyTypeEEnum, WDependencyType.METHOD_CALL);
		addEEnumLiteral(wDependencyTypeEEnum, WDependencyType.METHOD_OVERRIDE);
		addEEnumLiteral(wDependencyTypeEEnum, WDependencyType.INHERITANCE);
		addEEnumLiteral(wDependencyTypeEEnum, WDependencyType.FIELD_ACCESS);

		// Create resource
		createResource(eNS_URI);
	}

} //WsmodelPackageImpl

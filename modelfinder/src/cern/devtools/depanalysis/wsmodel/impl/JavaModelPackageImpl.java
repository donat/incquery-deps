/**
 */
package cern.devtools.depanalysis.wsmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import cern.devtools.depanalysis.wsmodel.CompilationUnit;
import cern.devtools.depanalysis.wsmodel.Dependency;
import cern.devtools.depanalysis.wsmodel.DependencyType;
import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
import cern.devtools.depanalysis.wsmodel.Field;
import cern.devtools.depanalysis.wsmodel.JavaModelFactory;
import cern.devtools.depanalysis.wsmodel.JavaModelPackage;
import cern.devtools.depanalysis.wsmodel.JavaProject;
import cern.devtools.depanalysis.wsmodel.Method;
import cern.devtools.depanalysis.wsmodel.NamedElement;
import cern.devtools.depanalysis.wsmodel.PackageFragment;
import cern.devtools.depanalysis.wsmodel.PackageFragmentRoot;
import cern.devtools.depanalysis.wsmodel.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaModelPackageImpl extends EPackageImpl implements JavaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipseWorkspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageFragmentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependencyTypeEEnum = null;

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
	 * @see cern.devtools.depanalysis.wsmodel.JavaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaModelPackageImpl() {
		super(eNS_URI, JavaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JavaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaModelPackage init() {
		if (isInited) return (JavaModelPackage)EPackage.Registry.INSTANCE.getEPackage(JavaModelPackage.eNS_URI);

		// Obtain or create and register package
		JavaModelPackageImpl theJavaModelPackage = (JavaModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavaModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavaModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJavaModelPackage.createPackageContents();

		// Initialize created meta-data
		theJavaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaModelPackage.eNS_URI, theJavaModelPackage);
		return theJavaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaProject() {
		return javaProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaProject_PackageFragmentRoots() {
		return (EReference)javaProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaProject_EclipseWorkspace() {
		return (EReference)javaProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclipseWorkspace() {
		return eclipseWorkspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseWorkspace_Projects() {
		return (EReference)eclipseWorkspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseWorkspace_Elements() {
		return (EReference)eclipseWorkspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipseWorkspace_Dependencties() {
		return (EReference)eclipseWorkspaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Handler() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_IncomingDependencies() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_OutgoingDependencies() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_From() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_To() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_Type() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageFragmentRoot() {
		return packageFragmentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageFragmentRoot_JavaProject() {
		return (EReference)packageFragmentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageFragmentRoot_PackageFragments() {
		return (EReference)packageFragmentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageFragment() {
		return packageFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageFragment_PackageFragmentRoot() {
		return (EReference)packageFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageFragment_CompilationUnits() {
		return (EReference)packageFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_PackageFragment() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_Types() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_CompilationUnit() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Methods() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Fields() {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Type() {
		return (EReference)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Type() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDependencyType() {
		return dependencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaModelFactory getJavaModelFactory() {
		return (JavaModelFactory)getEFactoryInstance();
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
		javaProjectEClass = createEClass(JAVA_PROJECT);
		createEReference(javaProjectEClass, JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS);
		createEReference(javaProjectEClass, JAVA_PROJECT__ECLIPSE_WORKSPACE);

		eclipseWorkspaceEClass = createEClass(ECLIPSE_WORKSPACE);
		createEReference(eclipseWorkspaceEClass, ECLIPSE_WORKSPACE__PROJECTS);
		createEReference(eclipseWorkspaceEClass, ECLIPSE_WORKSPACE__ELEMENTS);
		createEReference(eclipseWorkspaceEClass, ECLIPSE_WORKSPACE__DEPENDENCTIES);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__HANDLER);
		createEReference(namedElementEClass, NAMED_ELEMENT__INCOMING_DEPENDENCIES);
		createEReference(namedElementEClass, NAMED_ELEMENT__OUTGOING_DEPENDENCIES);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__FROM);
		createEReference(dependencyEClass, DEPENDENCY__TO);
		createEAttribute(dependencyEClass, DEPENDENCY__TYPE);

		packageFragmentRootEClass = createEClass(PACKAGE_FRAGMENT_ROOT);
		createEReference(packageFragmentRootEClass, PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT);
		createEReference(packageFragmentRootEClass, PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS);

		packageFragmentEClass = createEClass(PACKAGE_FRAGMENT);
		createEReference(packageFragmentEClass, PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT);
		createEReference(packageFragmentEClass, PACKAGE_FRAGMENT__COMPILATION_UNITS);

		compilationUnitEClass = createEClass(COMPILATION_UNIT);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__PACKAGE_FRAGMENT);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__TYPES);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__COMPILATION_UNIT);
		createEReference(typeEClass, TYPE__METHODS);
		createEReference(typeEClass, TYPE__FIELDS);

		methodEClass = createEClass(METHOD);
		createEReference(methodEClass, METHOD__TYPE);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__TYPE);

		// Create enums
		dependencyTypeEEnum = createEEnum(DEPENDENCY_TYPE);
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
		javaProjectEClass.getESuperTypes().add(this.getNamedElement());
		packageFragmentRootEClass.getESuperTypes().add(this.getNamedElement());
		packageFragmentEClass.getESuperTypes().add(this.getNamedElement());
		compilationUnitEClass.getESuperTypes().add(this.getNamedElement());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		methodEClass.getESuperTypes().add(this.getNamedElement());
		fieldEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(javaProjectEClass, JavaProject.class, "JavaProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaProject_PackageFragmentRoots(), this.getPackageFragmentRoot(), this.getPackageFragmentRoot_JavaProject(), "packageFragmentRoots", null, 0, -1, JavaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaProject_EclipseWorkspace(), this.getEclipseWorkspace(), this.getEclipseWorkspace_Projects(), "eclipseWorkspace", null, 0, 1, JavaProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eclipseWorkspaceEClass, EclipseWorkspace.class, "EclipseWorkspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEclipseWorkspace_Projects(), this.getJavaProject(), this.getJavaProject_EclipseWorkspace(), "projects", null, 0, -1, EclipseWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipseWorkspace_Elements(), this.getNamedElement(), null, "elements", null, 0, -1, EclipseWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipseWorkspace_Dependencties(), this.getDependency(), null, "dependencties", null, 0, -1, EclipseWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Handler(), ecorePackage.getEString(), "handler", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_IncomingDependencies(), this.getDependency(), this.getDependency_To(), "incomingDependencies", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_OutgoingDependencies(), this.getDependency(), this.getDependency_From(), "outgoingDependencies", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(namedElementEClass, this.getNamedElement(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(namedElementEClass, ecorePackage.getEEList(), "getChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(namedElementEClass, null, "setParent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(namedElementEClass, null, "addChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "child", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_From(), this.getNamedElement(), this.getNamedElement_OutgoingDependencies(), "from", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_To(), this.getNamedElement(), this.getNamedElement_IncomingDependencies(), "to", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_Type(), this.getDependencyType(), "type", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageFragmentRootEClass, PackageFragmentRoot.class, "PackageFragmentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageFragmentRoot_JavaProject(), this.getJavaProject(), this.getJavaProject_PackageFragmentRoots(), "javaProject", null, 1, 1, PackageFragmentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageFragmentRoot_PackageFragments(), this.getPackageFragment(), this.getPackageFragment_PackageFragmentRoot(), "packageFragments", null, 0, -1, PackageFragmentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageFragmentEClass, PackageFragment.class, "PackageFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageFragment_PackageFragmentRoot(), this.getPackageFragmentRoot(), this.getPackageFragmentRoot_PackageFragments(), "packageFragmentRoot", null, 0, 1, PackageFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageFragment_CompilationUnits(), this.getCompilationUnit(), this.getCompilationUnit_PackageFragment(), "compilationUnits", null, 0, -1, PackageFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompilationUnit_PackageFragment(), this.getPackageFragment(), this.getPackageFragment_CompilationUnits(), "packageFragment", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompilationUnit_Types(), this.getType(), this.getType_CompilationUnit(), "types", null, 0, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_CompilationUnit(), this.getCompilationUnit(), this.getCompilationUnit_Types(), "compilationUnit", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Methods(), this.getMethod(), this.getMethod_Type(), "methods", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Fields(), this.getField(), this.getField_Type(), "fields", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethod_Type(), this.getType(), this.getType_Methods(), "type", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Type(), this.getType(), this.getType_Fields(), "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dependencyTypeEEnum, DependencyType.class, "DependencyType");
		addEEnumLiteral(dependencyTypeEEnum, DependencyType.CLASS_USAGE);
		addEEnumLiteral(dependencyTypeEEnum, DependencyType.METHOD_CALL);
		addEEnumLiteral(dependencyTypeEEnum, DependencyType.METHOD_OVERRIDE);
		addEEnumLiteral(dependencyTypeEEnum, DependencyType.INHERITANCE);
		addEEnumLiteral(dependencyTypeEEnum, DependencyType.FIELD_ACCESS);

		// Create resource
		createResource(eNS_URI);
	}

} //JavaModelPackageImpl

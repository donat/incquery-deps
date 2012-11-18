/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.impl;

import hu.bme.incquery.deps.repomodel.RClass;
import hu.bme.incquery.deps.repomodel.RCodeElement;
import hu.bme.incquery.deps.repomodel.RDependency;
import hu.bme.incquery.deps.repomodel.RField;
import hu.bme.incquery.deps.repomodel.RMethod;
import hu.bme.incquery.deps.repomodel.RProject;
import hu.bme.incquery.deps.repomodel.RRepository;
import hu.bme.incquery.deps.repomodel.RRepositoryItem;
import hu.bme.incquery.deps.repomodel.RTransitiveDependency;
import hu.bme.incquery.deps.repomodel.RepomodelFactory;
import hu.bme.incquery.deps.repomodel.RepomodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepomodelPackageImpl extends EPackageImpl implements RepomodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rRepositoryItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rCodeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rTransitiveDependencyEClass = null;

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
	 * @see hu.bme.incquery.deps.repomodel.RepomodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RepomodelPackageImpl() {
		super(eNS_URI, RepomodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RepomodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RepomodelPackage init() {
		if (isInited) return (RepomodelPackage)EPackage.Registry.INSTANCE.getEPackage(RepomodelPackage.eNS_URI);

		// Obtain or create and register package
		RepomodelPackageImpl theRepomodelPackage = (RepomodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RepomodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RepomodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRepomodelPackage.createPackageContents();

		// Initialize created meta-data
		theRepomodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRepomodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RepomodelPackage.eNS_URI, theRepomodelPackage);
		return theRepomodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRRepositoryItem() {
		return rRepositoryItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRRepositoryItem_Uuid() {
		return (EAttribute)rRepositoryItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRCodeElement() {
		return rCodeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRCodeElement_RIncoming() {
		return (EReference)rCodeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRCodeElement_ROutgoing() {
		return (EReference)rCodeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRCodeElement_Versions() {
		return (EAttribute)rCodeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRCodeElement_Id() {
		return (EAttribute)rCodeElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRProject() {
		return rProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRProject_Name() {
		return (EAttribute)rProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRProject_RClasses() {
		return (EReference)rProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRProject_ContainingFolders() {
		return (EAttribute)rProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRProject_ProductPath() {
		return (EAttribute)rProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRProject_StoreLocation() {
		return (EAttribute)rProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRClass() {
		return rClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRClass_SimpleName() {
		return (EAttribute)rClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRClass_PackageName() {
		return (EAttribute)rClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRClass_RMethods() {
		return (EReference)rClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRClass_RFields() {
		return (EReference)rClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRClass_RProject() {
		return (EReference)rClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRClass_Extends() {
		return (EAttribute)rClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRClass_Implements() {
		return (EAttribute)rClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRClass_Private() {
		return (EAttribute)rClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRClass_Anonymous() {
		return (EAttribute)rClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRClass_ReferencedClasses() {
		return (EAttribute)rClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRClass_FqName() {
		return (EAttribute)rClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMethod() {
		return rMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMethod_Signature() {
		return (EAttribute)rMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRMethod_RClass() {
		return (EReference)rMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMethod_Private() {
		return (EAttribute)rMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMethod_ReferencedFields() {
		return (EAttribute)rMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMethod_ReferencedMethods() {
		return (EAttribute)rMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRMethod_Static() {
		return (EAttribute)rMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRField() {
		return rFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRField_Signature() {
		return (EAttribute)rFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRField_RClass() {
		return (EReference)rFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRField_Private() {
		return (EAttribute)rFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDependency() {
		return rDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDependency_RFrom() {
		return (EReference)rDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDependency_RTo() {
		return (EReference)rDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRDependency_DepType() {
		return (EAttribute)rDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRRepository() {
		return rRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRRepository_RDependencies() {
		return (EReference)rRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRRepository_RProjects() {
		return (EReference)rRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTransitiveDependency() {
		return rTransitiveDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTransitiveDependency_RTtransitiveFrom() {
		return (EReference)rTransitiveDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepomodelFactory getRepomodelFactory() {
		return (RepomodelFactory)getEFactoryInstance();
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
		rRepositoryItemEClass = createEClass(RREPOSITORY_ITEM);
		createEAttribute(rRepositoryItemEClass, RREPOSITORY_ITEM__UUID);

		rCodeElementEClass = createEClass(RCODE_ELEMENT);
		createEReference(rCodeElementEClass, RCODE_ELEMENT__RINCOMING);
		createEReference(rCodeElementEClass, RCODE_ELEMENT__ROUTGOING);
		createEAttribute(rCodeElementEClass, RCODE_ELEMENT__VERSIONS);
		createEAttribute(rCodeElementEClass, RCODE_ELEMENT__ID);

		rProjectEClass = createEClass(RPROJECT);
		createEAttribute(rProjectEClass, RPROJECT__NAME);
		createEReference(rProjectEClass, RPROJECT__RCLASSES);
		createEAttribute(rProjectEClass, RPROJECT__CONTAINING_FOLDERS);
		createEAttribute(rProjectEClass, RPROJECT__PRODUCT_PATH);
		createEAttribute(rProjectEClass, RPROJECT__STORE_LOCATION);

		rClassEClass = createEClass(RCLASS);
		createEAttribute(rClassEClass, RCLASS__SIMPLE_NAME);
		createEAttribute(rClassEClass, RCLASS__PACKAGE_NAME);
		createEReference(rClassEClass, RCLASS__RMETHODS);
		createEReference(rClassEClass, RCLASS__RFIELDS);
		createEReference(rClassEClass, RCLASS__RPROJECT);
		createEAttribute(rClassEClass, RCLASS__EXTENDS);
		createEAttribute(rClassEClass, RCLASS__IMPLEMENTS);
		createEAttribute(rClassEClass, RCLASS__PRIVATE);
		createEAttribute(rClassEClass, RCLASS__ANONYMOUS);
		createEAttribute(rClassEClass, RCLASS__REFERENCED_CLASSES);
		createEAttribute(rClassEClass, RCLASS__FQ_NAME);

		rMethodEClass = createEClass(RMETHOD);
		createEAttribute(rMethodEClass, RMETHOD__SIGNATURE);
		createEReference(rMethodEClass, RMETHOD__RCLASS);
		createEAttribute(rMethodEClass, RMETHOD__PRIVATE);
		createEAttribute(rMethodEClass, RMETHOD__REFERENCED_FIELDS);
		createEAttribute(rMethodEClass, RMETHOD__REFERENCED_METHODS);
		createEAttribute(rMethodEClass, RMETHOD__STATIC);

		rFieldEClass = createEClass(RFIELD);
		createEAttribute(rFieldEClass, RFIELD__SIGNATURE);
		createEReference(rFieldEClass, RFIELD__RCLASS);
		createEAttribute(rFieldEClass, RFIELD__PRIVATE);

		rDependencyEClass = createEClass(RDEPENDENCY);
		createEReference(rDependencyEClass, RDEPENDENCY__RFROM);
		createEReference(rDependencyEClass, RDEPENDENCY__RTO);
		createEAttribute(rDependencyEClass, RDEPENDENCY__DEP_TYPE);

		rRepositoryEClass = createEClass(RREPOSITORY);
		createEReference(rRepositoryEClass, RREPOSITORY__RDEPENDENCIES);
		createEReference(rRepositoryEClass, RREPOSITORY__RPROJECTS);

		rTransitiveDependencyEClass = createEClass(RTRANSITIVE_DEPENDENCY);
		createEReference(rTransitiveDependencyEClass, RTRANSITIVE_DEPENDENCY__RTTRANSITIVE_FROM);
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
		rCodeElementEClass.getESuperTypes().add(this.getRRepositoryItem());
		rProjectEClass.getESuperTypes().add(this.getRCodeElement());
		rClassEClass.getESuperTypes().add(this.getRCodeElement());
		rMethodEClass.getESuperTypes().add(this.getRCodeElement());
		rFieldEClass.getESuperTypes().add(this.getRCodeElement());
		rDependencyEClass.getESuperTypes().add(this.getRRepositoryItem());
		rTransitiveDependencyEClass.getESuperTypes().add(this.getRDependency());

		// Initialize classes and features; add operations and parameters
		initEClass(rRepositoryItemEClass, RRepositoryItem.class, "RRepositoryItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRRepositoryItem_Uuid(), ecorePackage.getEString(), "uuid", null, 1, 1, RRepositoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rCodeElementEClass, RCodeElement.class, "RCodeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRCodeElement_RIncoming(), this.getRDependency(), this.getRDependency_RTo(), "rIncoming", null, 0, -1, RCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRCodeElement_ROutgoing(), this.getRDependency(), this.getRDependency_RFrom(), "rOutgoing", null, 0, -1, RCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRCodeElement_Versions(), ecorePackage.getEString(), "versions", null, 0, -1, RCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRCodeElement_Id(), ecorePackage.getELong(), "id", null, 0, 1, RCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(rCodeElementEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rProjectEClass, RProject.class, "RProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, RProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRProject_RClasses(), this.getRClass(), this.getRClass_RProject(), "rClasses", null, 0, -1, RProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRProject_ContainingFolders(), ecorePackage.getEString(), "containingFolders", null, 0, 1, RProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRProject_ProductPath(), ecorePackage.getEString(), "productPath", null, 0, 1, RProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRProject_StoreLocation(), ecorePackage.getEString(), "storeLocation", null, 0, 1, RProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rClassEClass, RClass.class, "RClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRClass_SimpleName(), ecorePackage.getEString(), "simpleName", null, 0, 1, RClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRClass_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, RClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRClass_RMethods(), this.getRMethod(), this.getRMethod_RClass(), "rMethods", null, 0, -1, RClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRClass_RFields(), this.getRField(), this.getRField_RClass(), "rFields", null, 0, -1, RClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRClass_RProject(), this.getRProject(), this.getRProject_RClasses(), "rProject", null, 1, 1, RClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRClass_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, RClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRClass_Implements(), ecorePackage.getEString(), "implements", null, 0, 1, RClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRClass_Private(), ecorePackage.getEBoolean(), "private", null, 0, 1, RClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRClass_Anonymous(), ecorePackage.getEBoolean(), "anonymous", null, 0, 1, RClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getRClass_ReferencedClasses(), g1, "referencedClasses", null, 0, 1, RClass.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRClass_FqName(), ecorePackage.getEString(), "fqName", null, 0, 1, RClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(rClassEClass, ecorePackage.getEString(), "getSourcePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rMethodEClass, RMethod.class, "RMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRMethod_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, RMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRMethod_RClass(), this.getRClass(), this.getRClass_RMethods(), "rClass", null, 1, 1, RMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRMethod_Private(), ecorePackage.getEBooleanObject(), "private", null, 0, 1, RMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getRMethod_ReferencedFields(), g1, "referencedFields", null, 0, 1, RMethod.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getRMethod_ReferencedMethods(), g1, "referencedMethods", null, 0, 1, RMethod.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRMethod_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, RMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rFieldEClass, RField.class, "RField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRField_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, RField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRField_RClass(), this.getRClass(), this.getRClass_RFields(), "rClass", null, 1, 1, RField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRField_Private(), ecorePackage.getEBoolean(), "private", null, 0, 1, RField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rDependencyEClass, RDependency.class, "RDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDependency_RFrom(), this.getRCodeElement(), this.getRCodeElement_ROutgoing(), "rFrom", null, 1, 1, RDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRDependency_RTo(), this.getRCodeElement(), this.getRCodeElement_RIncoming(), "rTo", null, 1, 1, RDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRDependency_DepType(), ecorePackage.getEInt(), "depType", "0", 0, 1, RDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rRepositoryEClass, RRepository.class, "RRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRRepository_RDependencies(), this.getRDependency(), null, "rDependencies", null, 0, -1, RRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRRepository_RProjects(), this.getRProject(), null, "rProjects", null, 0, -1, RRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rTransitiveDependencyEClass, RTransitiveDependency.class, "RTransitiveDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTransitiveDependency_RTtransitiveFrom(), this.getRDependency(), null, "rTtransitiveFrom", null, 0, -1, RTransitiveDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "ExtendedMetaData";		
		addAnnotation
		  (getRRepositoryItem_Uuid(), 
		   source, 
		   new String[] {
			 "name", "uuid",
			 "namespace", "http://cern.ch/be/co/devtools-deps-analysis/2.0.0"
		   });
	}

} //RepomodelPackageImpl

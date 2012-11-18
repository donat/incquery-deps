/**
 */
package hu.bme.incquery.deps.cp3model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.incquery.deps.cp3model.Cp3modelFactory
 * @model kind="package"
 * @generated
 */
public interface Cp3modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cp3model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/donat/incquery-deps/cp3model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cp3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cp3modelPackage eINSTANCE = hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3DepImpl <em>CP3 Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp3model.impl.CP3DepImpl
	 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Dep()
	 * @generated
	 */
	int CP3_DEP = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_DEP__TYPE = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_DEP__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_DEP__TO = 2;

	/**
	 * The number of structural features of the '<em>CP3 Dep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_DEP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3RepoImpl <em>CP3 Repo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp3model.impl.CP3RepoImpl
	 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Repo()
	 * @generated
	 */
	int CP3_REPO = 1;

	/**
	 * The feature id for the '<em><b>Deps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_REPO__DEPS = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_REPO__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>CP3 Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_REPO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3AbstractItemImpl <em>CP3 Abstract Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp3model.impl.CP3AbstractItemImpl
	 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3AbstractItem()
	 * @generated
	 */
	int CP3_ABSTRACT_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_ABSTRACT_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_ABSTRACT_ITEM__NAME = 1;

	/**
	 * The number of structural features of the '<em>CP3 Abstract Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_ABSTRACT_ITEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3ProjectImpl <em>CP3 Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp3model.impl.CP3ProjectImpl
	 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Project()
	 * @generated
	 */
	int CP3_PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_PROJECT__ID = CP3_ABSTRACT_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_PROJECT__NAME = CP3_ABSTRACT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_PROJECT__CLASSES = CP3_ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CP3 Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_PROJECT_FEATURE_COUNT = CP3_ABSTRACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3ClassImpl <em>CP3 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp3model.impl.CP3ClassImpl
	 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Class()
	 * @generated
	 */
	int CP3_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_CLASS__ID = CP3_ABSTRACT_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_CLASS__NAME = CP3_ABSTRACT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_CLASS__PROJECTS = CP3_ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_CLASS__METHODS = CP3_ABSTRACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_CLASS__FIELDS = CP3_ABSTRACT_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CP3 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_CLASS_FEATURE_COUNT = CP3_ABSTRACT_ITEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3MethodImpl <em>CP3 Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp3model.impl.CP3MethodImpl
	 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Method()
	 * @generated
	 */
	int CP3_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_METHOD__ID = CP3_ABSTRACT_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_METHOD__NAME = CP3_ABSTRACT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_METHOD__CLASSES = CP3_ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CP3 Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_METHOD_FEATURE_COUNT = CP3_ABSTRACT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3FieldImpl <em>CP3 Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp3model.impl.CP3FieldImpl
	 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Field()
	 * @generated
	 */
	int CP3_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_FIELD__ID = CP3_ABSTRACT_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_FIELD__NAME = CP3_ABSTRACT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_FIELD__CLASSES = CP3_ABSTRACT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CP3 Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_FIELD_FEATURE_COUNT = CP3_ABSTRACT_ITEM_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp3model.CP3Dep <em>CP3 Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP3 Dep</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Dep
	 * @generated
	 */
	EClass getCP3Dep();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp3model.CP3Dep#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Dep#getType()
	 * @see #getCP3Dep()
	 * @generated
	 */
	EAttribute getCP3Dep_Type();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.incquery.deps.cp3model.CP3Dep#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Dep#getFrom()
	 * @see #getCP3Dep()
	 * @generated
	 */
	EReference getCP3Dep_From();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.incquery.deps.cp3model.CP3Dep#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Dep#getTo()
	 * @see #getCP3Dep()
	 * @generated
	 */
	EReference getCP3Dep_To();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp3model.CP3Repo <em>CP3 Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP3 Repo</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Repo
	 * @generated
	 */
	EClass getCP3Repo();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.cp3model.CP3Repo#getDeps <em>Deps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deps</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Repo#getDeps()
	 * @see #getCP3Repo()
	 * @generated
	 */
	EReference getCP3Repo_Deps();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.cp3model.CP3Repo#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Repo#getItems()
	 * @see #getCP3Repo()
	 * @generated
	 */
	EReference getCP3Repo_Items();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp3model.CP3Project <em>CP3 Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP3 Project</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Project
	 * @generated
	 */
	EClass getCP3Project();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.cp3model.CP3Project#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Project#getClasses()
	 * @see #getCP3Project()
	 * @generated
	 */
	EReference getCP3Project_Classes();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp3model.CP3Class <em>CP3 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP3 Class</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Class
	 * @generated
	 */
	EClass getCP3Class();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.cp3model.CP3Class#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Class#getProjects()
	 * @see #getCP3Class()
	 * @generated
	 */
	EReference getCP3Class_Projects();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.cp3model.CP3Class#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Methods</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Class#getMethods()
	 * @see #getCP3Class()
	 * @generated
	 */
	EReference getCP3Class_Methods();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.cp3model.CP3Class#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Class#getFields()
	 * @see #getCP3Class()
	 * @generated
	 */
	EReference getCP3Class_Fields();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp3model.CP3AbstractItem <em>CP3 Abstract Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP3 Abstract Item</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3AbstractItem
	 * @generated
	 */
	EClass getCP3AbstractItem();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp3model.CP3AbstractItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3AbstractItem#getId()
	 * @see #getCP3AbstractItem()
	 * @generated
	 */
	EAttribute getCP3AbstractItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp3model.CP3AbstractItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3AbstractItem#getName()
	 * @see #getCP3AbstractItem()
	 * @generated
	 */
	EAttribute getCP3AbstractItem_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp3model.CP3Method <em>CP3 Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP3 Method</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Method
	 * @generated
	 */
	EClass getCP3Method();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.cp3model.CP3Method#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Method#getClasses()
	 * @see #getCP3Method()
	 * @generated
	 */
	EReference getCP3Method_Classes();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp3model.CP3Field <em>CP3 Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP3 Field</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Field
	 * @generated
	 */
	EClass getCP3Field();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.cp3model.CP3Field#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Field#getClasses()
	 * @see #getCP3Field()
	 * @generated
	 */
	EReference getCP3Field_Classes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Cp3modelFactory getCp3modelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3DepImpl <em>CP3 Dep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp3model.impl.CP3DepImpl
		 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Dep()
		 * @generated
		 */
		EClass CP3_DEP = eINSTANCE.getCP3Dep();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP3_DEP__TYPE = eINSTANCE.getCP3Dep_Type();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_DEP__FROM = eINSTANCE.getCP3Dep_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_DEP__TO = eINSTANCE.getCP3Dep_To();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3RepoImpl <em>CP3 Repo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp3model.impl.CP3RepoImpl
		 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Repo()
		 * @generated
		 */
		EClass CP3_REPO = eINSTANCE.getCP3Repo();

		/**
		 * The meta object literal for the '<em><b>Deps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_REPO__DEPS = eINSTANCE.getCP3Repo_Deps();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_REPO__ITEMS = eINSTANCE.getCP3Repo_Items();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3ProjectImpl <em>CP3 Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp3model.impl.CP3ProjectImpl
		 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Project()
		 * @generated
		 */
		EClass CP3_PROJECT = eINSTANCE.getCP3Project();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_PROJECT__CLASSES = eINSTANCE.getCP3Project_Classes();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3ClassImpl <em>CP3 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp3model.impl.CP3ClassImpl
		 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Class()
		 * @generated
		 */
		EClass CP3_CLASS = eINSTANCE.getCP3Class();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_CLASS__PROJECTS = eINSTANCE.getCP3Class_Projects();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_CLASS__METHODS = eINSTANCE.getCP3Class_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_CLASS__FIELDS = eINSTANCE.getCP3Class_Fields();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3AbstractItemImpl <em>CP3 Abstract Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp3model.impl.CP3AbstractItemImpl
		 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3AbstractItem()
		 * @generated
		 */
		EClass CP3_ABSTRACT_ITEM = eINSTANCE.getCP3AbstractItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP3_ABSTRACT_ITEM__ID = eINSTANCE.getCP3AbstractItem_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP3_ABSTRACT_ITEM__NAME = eINSTANCE.getCP3AbstractItem_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3MethodImpl <em>CP3 Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp3model.impl.CP3MethodImpl
		 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Method()
		 * @generated
		 */
		EClass CP3_METHOD = eINSTANCE.getCP3Method();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_METHOD__CLASSES = eINSTANCE.getCP3Method_Classes();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3FieldImpl <em>CP3 Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp3model.impl.CP3FieldImpl
		 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Field()
		 * @generated
		 */
		EClass CP3_FIELD = eINSTANCE.getCP3Field();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_FIELD__CLASSES = eINSTANCE.getCP3Field_Classes();

	}

} //Cp3modelPackage

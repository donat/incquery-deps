/**
 */
package hu.bme.incquery.deps.cp1model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hu.bme.incquery.deps.cp1model.Cp1modelFactory
 * @model kind="package"
 * @generated
 */
public interface Cp1modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cp1model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/donat/incquery-deps/cp1model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cp1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cp1modelPackage eINSTANCE = hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1RepositoryImpl <em>CP1 Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp1model.impl.CP1RepositoryImpl
	 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Repository()
	 * @generated
	 */
	int CP1_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_REPOSITORY__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_REPOSITORY__DEPENDENCIES = 1;

	/**
	 * The number of structural features of the '<em>CP1 Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1CodeElementImpl <em>CP1 Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp1model.impl.CP1CodeElementImpl
	 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1CodeElement()
	 * @generated
	 */
	int CP1_CODE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_CODE_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>CP1 Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_CODE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1ProjectImpl <em>CP1 Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp1model.impl.CP1ProjectImpl
	 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Project()
	 * @generated
	 */
	int CP1_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_PROJECT__ID = CP1_CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_PROJECT__CLASSES = CP1_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_PROJECT__NAME = CP1_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CP1 Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_PROJECT_FEATURE_COUNT = CP1_CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1DependencyImpl <em>CP1 Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp1model.impl.CP1DependencyImpl
	 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Dependency()
	 * @generated
	 */
	int CP1_DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_DEPENDENCY__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_DEPENDENCY__TO = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_DEPENDENCY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>CP1 Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_DEPENDENCY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1ClassImpl <em>CP1 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp1model.impl.CP1ClassImpl
	 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Class()
	 * @generated
	 */
	int CP1_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_CLASS__ID = CP1_CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_CLASS__METHODS = CP1_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_CLASS__FIELDS = CP1_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_CLASS__EXTENDS = CP1_CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_CLASS__IMPLEMENTS = CP1_CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_CLASS__SIMPLE_NAME = CP1_CODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_CLASS__PACKAGE_NAME = CP1_CODE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>CP1 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_CLASS_FEATURE_COUNT = CP1_CODE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1MethodImpl <em>CP1 Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp1model.impl.CP1MethodImpl
	 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Method()
	 * @generated
	 */
	int CP1_METHOD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_METHOD__ID = CP1_CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_METHOD__SIGNATURE = CP1_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CP1 Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_METHOD_FEATURE_COUNT = CP1_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1FieldImpl <em>CP1 Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp1model.impl.CP1FieldImpl
	 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Field()
	 * @generated
	 */
	int CP1_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_FIELD__ID = CP1_CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_FIELD__SIGNATURE = CP1_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CP1 Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP1_FIELD_FEATURE_COUNT = CP1_CODE_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp1model.CP1DependencyType <em>CP1 Dependency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp1model.CP1DependencyType
	 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1DependencyType()
	 * @generated
	 */
	int CP1_DEPENDENCY_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp1model.CP1Repository <em>CP1 Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP1 Repository</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Repository
	 * @generated
	 */
	EClass getCP1Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.cp1model.CP1Repository#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Repository#getProjects()
	 * @see #getCP1Repository()
	 * @generated
	 */
	EReference getCP1Repository_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.cp1model.CP1Repository#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Repository#getDependencies()
	 * @see #getCP1Repository()
	 * @generated
	 */
	EReference getCP1Repository_Dependencies();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp1model.CP1Project <em>CP1 Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP1 Project</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Project
	 * @generated
	 */
	EClass getCP1Project();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.cp1model.CP1Project#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Project#getClasses()
	 * @see #getCP1Project()
	 * @generated
	 */
	EReference getCP1Project_Classes();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp1model.CP1Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Project#getName()
	 * @see #getCP1Project()
	 * @generated
	 */
	EAttribute getCP1Project_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp1model.CP1Dependency <em>CP1 Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP1 Dependency</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Dependency
	 * @generated
	 */
	EClass getCP1Dependency();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.incquery.deps.cp1model.CP1Dependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Dependency#getFrom()
	 * @see #getCP1Dependency()
	 * @generated
	 */
	EReference getCP1Dependency_From();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.incquery.deps.cp1model.CP1Dependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Dependency#getTo()
	 * @see #getCP1Dependency()
	 * @generated
	 */
	EReference getCP1Dependency_To();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp1model.CP1Dependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Dependency#getType()
	 * @see #getCP1Dependency()
	 * @generated
	 */
	EAttribute getCP1Dependency_Type();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp1model.CP1Class <em>CP1 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP1 Class</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Class
	 * @generated
	 */
	EClass getCP1Class();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.cp1model.CP1Class#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Class#getMethods()
	 * @see #getCP1Class()
	 * @generated
	 */
	EReference getCP1Class_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.cp1model.CP1Class#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Class#getFields()
	 * @see #getCP1Class()
	 * @generated
	 */
	EReference getCP1Class_Fields();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp1model.CP1Class#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Class#getExtends()
	 * @see #getCP1Class()
	 * @generated
	 */
	EAttribute getCP1Class_Extends();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp1model.CP1Class#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Class#getImplements()
	 * @see #getCP1Class()
	 * @generated
	 */
	EAttribute getCP1Class_Implements();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp1model.CP1Class#getSimpleName <em>Simple Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Name</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Class#getSimpleName()
	 * @see #getCP1Class()
	 * @generated
	 */
	EAttribute getCP1Class_SimpleName();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp1model.CP1Class#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Class#getPackageName()
	 * @see #getCP1Class()
	 * @generated
	 */
	EAttribute getCP1Class_PackageName();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp1model.CP1Method <em>CP1 Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP1 Method</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Method
	 * @generated
	 */
	EClass getCP1Method();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp1model.CP1Method#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Method#getSignature()
	 * @see #getCP1Method()
	 * @generated
	 */
	EAttribute getCP1Method_Signature();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp1model.CP1Field <em>CP1 Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP1 Field</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Field
	 * @generated
	 */
	EClass getCP1Field();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp1model.CP1Field#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1Field#getSignature()
	 * @see #getCP1Field()
	 * @generated
	 */
	EAttribute getCP1Field_Signature();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp1model.CP1CodeElement <em>CP1 Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP1 Code Element</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1CodeElement
	 * @generated
	 */
	EClass getCP1CodeElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp1model.CP1CodeElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1CodeElement#getId()
	 * @see #getCP1CodeElement()
	 * @generated
	 */
	EAttribute getCP1CodeElement_Id();

	/**
	 * Returns the meta object for enum '{@link hu.bme.incquery.deps.cp1model.CP1DependencyType <em>CP1 Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CP1 Dependency Type</em>'.
	 * @see hu.bme.incquery.deps.cp1model.CP1DependencyType
	 * @generated
	 */
	EEnum getCP1DependencyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Cp1modelFactory getCp1modelFactory();

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
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1RepositoryImpl <em>CP1 Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp1model.impl.CP1RepositoryImpl
		 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Repository()
		 * @generated
		 */
		EClass CP1_REPOSITORY = eINSTANCE.getCP1Repository();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP1_REPOSITORY__PROJECTS = eINSTANCE.getCP1Repository_Projects();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP1_REPOSITORY__DEPENDENCIES = eINSTANCE.getCP1Repository_Dependencies();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1ProjectImpl <em>CP1 Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp1model.impl.CP1ProjectImpl
		 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Project()
		 * @generated
		 */
		EClass CP1_PROJECT = eINSTANCE.getCP1Project();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP1_PROJECT__CLASSES = eINSTANCE.getCP1Project_Classes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP1_PROJECT__NAME = eINSTANCE.getCP1Project_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1DependencyImpl <em>CP1 Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp1model.impl.CP1DependencyImpl
		 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Dependency()
		 * @generated
		 */
		EClass CP1_DEPENDENCY = eINSTANCE.getCP1Dependency();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP1_DEPENDENCY__FROM = eINSTANCE.getCP1Dependency_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP1_DEPENDENCY__TO = eINSTANCE.getCP1Dependency_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP1_DEPENDENCY__TYPE = eINSTANCE.getCP1Dependency_Type();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1ClassImpl <em>CP1 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp1model.impl.CP1ClassImpl
		 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Class()
		 * @generated
		 */
		EClass CP1_CLASS = eINSTANCE.getCP1Class();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP1_CLASS__METHODS = eINSTANCE.getCP1Class_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP1_CLASS__FIELDS = eINSTANCE.getCP1Class_Fields();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP1_CLASS__EXTENDS = eINSTANCE.getCP1Class_Extends();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP1_CLASS__IMPLEMENTS = eINSTANCE.getCP1Class_Implements();

		/**
		 * The meta object literal for the '<em><b>Simple Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP1_CLASS__SIMPLE_NAME = eINSTANCE.getCP1Class_SimpleName();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP1_CLASS__PACKAGE_NAME = eINSTANCE.getCP1Class_PackageName();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1MethodImpl <em>CP1 Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp1model.impl.CP1MethodImpl
		 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Method()
		 * @generated
		 */
		EClass CP1_METHOD = eINSTANCE.getCP1Method();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP1_METHOD__SIGNATURE = eINSTANCE.getCP1Method_Signature();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1FieldImpl <em>CP1 Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp1model.impl.CP1FieldImpl
		 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1Field()
		 * @generated
		 */
		EClass CP1_FIELD = eINSTANCE.getCP1Field();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP1_FIELD__SIGNATURE = eINSTANCE.getCP1Field_Signature();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp1model.impl.CP1CodeElementImpl <em>CP1 Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp1model.impl.CP1CodeElementImpl
		 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1CodeElement()
		 * @generated
		 */
		EClass CP1_CODE_ELEMENT = eINSTANCE.getCP1CodeElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP1_CODE_ELEMENT__ID = eINSTANCE.getCP1CodeElement_Id();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp1model.CP1DependencyType <em>CP1 Dependency Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp1model.CP1DependencyType
		 * @see hu.bme.incquery.deps.cp1model.impl.Cp1modelPackageImpl#getCP1DependencyType()
		 * @generated
		 */
		EEnum CP1_DEPENDENCY_TYPE = eINSTANCE.getCP1DependencyType();

	}

} //Cp1modelPackage

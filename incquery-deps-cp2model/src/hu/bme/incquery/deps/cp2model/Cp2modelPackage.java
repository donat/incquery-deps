/**
 */
package hu.bme.incquery.deps.cp2model;

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
 * @see hu.bme.incquery.deps.cp2model.Cp2modelFactory
 * @model kind="package"
 * @generated
 */
public interface Cp2modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cp2model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/donat/incquery-deps/cp2model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cp2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cp2modelPackage eINSTANCE = hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp2model.impl.CP2RepositoryImpl <em>CP2 Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp2model.impl.CP2RepositoryImpl
	 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getCP2Repository()
	 * @generated
	 */
	int CP2_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_REPOSITORY__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>CP2 Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp2model.impl.C2CodeElementImpl <em>C2 Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp2model.impl.C2CodeElementImpl
	 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getC2CodeElement()
	 * @generated
	 */
	int C2_CODE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_CODE_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>C2 Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_CODE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp2model.impl.CP2ProjectImpl <em>CP2 Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp2model.impl.CP2ProjectImpl
	 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getCP2Project()
	 * @generated
	 */
	int CP2_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_PROJECT__ID = C2_CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_PROJECT__CLASSES = C2_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_PROJECT__NAME = C2_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CP2 Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_PROJECT_FEATURE_COUNT = C2_CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp2model.impl.CP2ClassImpl <em>CP2 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp2model.impl.CP2ClassImpl
	 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getCP2Class()
	 * @generated
	 */
	int CP2_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_CLASS__ID = C2_CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_CLASS__FIELDS = C2_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_CLASS__METHODS = C2_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_CLASS__EXTENDS = C2_CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_CLASS__IMPLEMENTS = C2_CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_CLASS__SIMPLE_NAME = C2_CODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>CP2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_CLASS_FEATURE_COUNT = C2_CODE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp2model.impl.CP2FieldImpl <em>CP2 Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp2model.impl.CP2FieldImpl
	 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getCP2Field()
	 * @generated
	 */
	int CP2_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_FIELD__ID = C2_CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_FIELD__NAME = C2_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CP2 Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_FIELD_FEATURE_COUNT = C2_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp2model.impl.C2MethodsImpl <em>C2 Methods</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp2model.impl.C2MethodsImpl
	 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getC2Methods()
	 * @generated
	 */
	int C2_METHODS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_METHODS__ID = C2_CODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_METHODS__NAME = C2_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>C2 Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C2_METHODS_FEATURE_COUNT = C2_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp2model.impl.CP2DependencyImpl <em>CP2 Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp2model.impl.CP2DependencyImpl
	 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getCP2Dependency()
	 * @generated
	 */
	int CP2_DEPENDENCY = 6;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_DEPENDENCY__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_DEPENDENCY__TO = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_DEPENDENCY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>CP2 Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP2_DEPENDENCY_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp2model.CP2Repository <em>CP2 Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP2 Repository</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Repository
	 * @generated
	 */
	EClass getCP2Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.cp2model.CP2Repository#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Repository#getElements()
	 * @see #getCP2Repository()
	 * @generated
	 */
	EReference getCP2Repository_Elements();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp2model.CP2Project <em>CP2 Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP2 Project</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Project
	 * @generated
	 */
	EClass getCP2Project();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.cp2model.CP2Project#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Project#getClasses()
	 * @see #getCP2Project()
	 * @generated
	 */
	EReference getCP2Project_Classes();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp2model.CP2Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Project#getName()
	 * @see #getCP2Project()
	 * @generated
	 */
	EAttribute getCP2Project_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp2model.CP2Class <em>CP2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP2 Class</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Class
	 * @generated
	 */
	EClass getCP2Class();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.cp2model.CP2Class#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Class#getFields()
	 * @see #getCP2Class()
	 * @generated
	 */
	EReference getCP2Class_Fields();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.cp2model.CP2Class#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Methods</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Class#getMethods()
	 * @see #getCP2Class()
	 * @generated
	 */
	EReference getCP2Class_Methods();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp2model.CP2Class#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Class#getExtends()
	 * @see #getCP2Class()
	 * @generated
	 */
	EAttribute getCP2Class_Extends();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp2model.CP2Class#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Class#getImplements()
	 * @see #getCP2Class()
	 * @generated
	 */
	EAttribute getCP2Class_Implements();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp2model.CP2Class#getSimpleName <em>Simple Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Name</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Class#getSimpleName()
	 * @see #getCP2Class()
	 * @generated
	 */
	EAttribute getCP2Class_SimpleName();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp2model.CP2Field <em>CP2 Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP2 Field</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Field
	 * @generated
	 */
	EClass getCP2Field();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp2model.CP2Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Field#getName()
	 * @see #getCP2Field()
	 * @generated
	 */
	EAttribute getCP2Field_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp2model.C2CodeElement <em>C2 Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C2 Code Element</em>'.
	 * @see hu.bme.incquery.deps.cp2model.C2CodeElement
	 * @generated
	 */
	EClass getC2CodeElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp2model.C2CodeElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.incquery.deps.cp2model.C2CodeElement#getId()
	 * @see #getC2CodeElement()
	 * @generated
	 */
	EAttribute getC2CodeElement_Id();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp2model.C2Methods <em>C2 Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C2 Methods</em>'.
	 * @see hu.bme.incquery.deps.cp2model.C2Methods
	 * @generated
	 */
	EClass getC2Methods();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp2model.C2Methods#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.incquery.deps.cp2model.C2Methods#getName()
	 * @see #getC2Methods()
	 * @generated
	 */
	EAttribute getC2Methods_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp2model.CP2Dependency <em>CP2 Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP2 Dependency</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Dependency
	 * @generated
	 */
	EClass getCP2Dependency();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.incquery.deps.cp2model.CP2Dependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Dependency#getFrom()
	 * @see #getCP2Dependency()
	 * @generated
	 */
	EReference getCP2Dependency_From();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.incquery.deps.cp2model.CP2Dependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Dependency#getTo()
	 * @see #getCP2Dependency()
	 * @generated
	 */
	EReference getCP2Dependency_To();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp2model.CP2Dependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.bme.incquery.deps.cp2model.CP2Dependency#getType()
	 * @see #getCP2Dependency()
	 * @generated
	 */
	EAttribute getCP2Dependency_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Cp2modelFactory getCp2modelFactory();

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
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp2model.impl.CP2RepositoryImpl <em>CP2 Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp2model.impl.CP2RepositoryImpl
		 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getCP2Repository()
		 * @generated
		 */
		EClass CP2_REPOSITORY = eINSTANCE.getCP2Repository();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP2_REPOSITORY__ELEMENTS = eINSTANCE.getCP2Repository_Elements();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp2model.impl.CP2ProjectImpl <em>CP2 Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp2model.impl.CP2ProjectImpl
		 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getCP2Project()
		 * @generated
		 */
		EClass CP2_PROJECT = eINSTANCE.getCP2Project();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP2_PROJECT__CLASSES = eINSTANCE.getCP2Project_Classes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP2_PROJECT__NAME = eINSTANCE.getCP2Project_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp2model.impl.CP2ClassImpl <em>CP2 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp2model.impl.CP2ClassImpl
		 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getCP2Class()
		 * @generated
		 */
		EClass CP2_CLASS = eINSTANCE.getCP2Class();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP2_CLASS__FIELDS = eINSTANCE.getCP2Class_Fields();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP2_CLASS__METHODS = eINSTANCE.getCP2Class_Methods();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP2_CLASS__EXTENDS = eINSTANCE.getCP2Class_Extends();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP2_CLASS__IMPLEMENTS = eINSTANCE.getCP2Class_Implements();

		/**
		 * The meta object literal for the '<em><b>Simple Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP2_CLASS__SIMPLE_NAME = eINSTANCE.getCP2Class_SimpleName();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp2model.impl.CP2FieldImpl <em>CP2 Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp2model.impl.CP2FieldImpl
		 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getCP2Field()
		 * @generated
		 */
		EClass CP2_FIELD = eINSTANCE.getCP2Field();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP2_FIELD__NAME = eINSTANCE.getCP2Field_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp2model.impl.C2CodeElementImpl <em>C2 Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp2model.impl.C2CodeElementImpl
		 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getC2CodeElement()
		 * @generated
		 */
		EClass C2_CODE_ELEMENT = eINSTANCE.getC2CodeElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute C2_CODE_ELEMENT__ID = eINSTANCE.getC2CodeElement_Id();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp2model.impl.C2MethodsImpl <em>C2 Methods</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp2model.impl.C2MethodsImpl
		 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getC2Methods()
		 * @generated
		 */
		EClass C2_METHODS = eINSTANCE.getC2Methods();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute C2_METHODS__NAME = eINSTANCE.getC2Methods_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp2model.impl.CP2DependencyImpl <em>CP2 Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp2model.impl.CP2DependencyImpl
		 * @see hu.bme.incquery.deps.cp2model.impl.Cp2modelPackageImpl#getCP2Dependency()
		 * @generated
		 */
		EClass CP2_DEPENDENCY = eINSTANCE.getCP2Dependency();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP2_DEPENDENCY__FROM = eINSTANCE.getCP2Dependency_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP2_DEPENDENCY__TO = eINSTANCE.getCP2Dependency_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP2_DEPENDENCY__TYPE = eINSTANCE.getCP2Dependency_Type();

	}

} //Cp2modelPackage

/**
 */
package hu.bme.incquery.deps.cp3model;

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
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3StElemImpl <em>CP3 St Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp3model.impl.CP3StElemImpl
	 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3StElem()
	 * @generated
	 */
	int CP3_ST_ELEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_ST_ELEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_ST_ELEM__ATTR = 1;

	/**
	 * The feature id for the '<em><b>Sig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_ST_ELEM__SIG = 2;

	/**
	 * The feature id for the '<em><b>Ch</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_ST_ELEM__CH = 3;

	/**
	 * The number of structural features of the '<em>CP3 St Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_ST_ELEM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3DepImpl <em>CP3 Dep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp3model.impl.CP3DepImpl
	 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3Dep()
	 * @generated
	 */
	int CP3_DEP = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_DEP__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_DEP__TO = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_DEP__TYPE = 2;

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
	int CP3_REPO = 2;

	/**
	 * The feature id for the '<em><b>Deps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_REPO__DEPS = 0;

	/**
	 * The feature id for the '<em><b>Elems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_REPO__ELEMS = 1;

	/**
	 * The number of structural features of the '<em>CP3 Repo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CP3_REPO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.cp3model.Types <em>Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.cp3model.Types
	 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getTypes()
	 * @generated
	 */
	int TYPES = 3;


	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.cp3model.CP3StElem <em>CP3 St Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CP3 St Elem</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3StElem
	 * @generated
	 */
	EClass getCP3StElem();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp3model.CP3StElem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3StElem#getId()
	 * @see #getCP3StElem()
	 * @generated
	 */
	EAttribute getCP3StElem_Id();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp3model.CP3StElem#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3StElem#getAttr()
	 * @see #getCP3StElem()
	 * @generated
	 */
	EAttribute getCP3StElem_Attr();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.cp3model.CP3StElem#getSig <em>Sig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sig</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3StElem#getSig()
	 * @see #getCP3StElem()
	 * @generated
	 */
	EAttribute getCP3StElem_Sig();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.cp3model.CP3StElem#getCh <em>Ch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ch</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3StElem#getCh()
	 * @see #getCP3StElem()
	 * @generated
	 */
	EReference getCP3StElem_Ch();

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
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.cp3model.CP3Repo#getElems <em>Elems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elems</em>'.
	 * @see hu.bme.incquery.deps.cp3model.CP3Repo#getElems()
	 * @see #getCP3Repo()
	 * @generated
	 */
	EReference getCP3Repo_Elems();

	/**
	 * Returns the meta object for enum '{@link hu.bme.incquery.deps.cp3model.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Types</em>'.
	 * @see hu.bme.incquery.deps.cp3model.Types
	 * @generated
	 */
	EEnum getTypes();

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
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp3model.impl.CP3StElemImpl <em>CP3 St Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp3model.impl.CP3StElemImpl
		 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getCP3StElem()
		 * @generated
		 */
		EClass CP3_ST_ELEM = eINSTANCE.getCP3StElem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP3_ST_ELEM__ID = eINSTANCE.getCP3StElem_Id();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP3_ST_ELEM__ATTR = eINSTANCE.getCP3StElem_Attr();

		/**
		 * The meta object literal for the '<em><b>Sig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP3_ST_ELEM__SIG = eINSTANCE.getCP3StElem_Sig();

		/**
		 * The meta object literal for the '<em><b>Ch</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_ST_ELEM__CH = eINSTANCE.getCP3StElem_Ch();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CP3_DEP__TYPE = eINSTANCE.getCP3Dep_Type();

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
		 * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CP3_REPO__ELEMS = eINSTANCE.getCP3Repo_Elems();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.cp3model.Types <em>Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.cp3model.Types
		 * @see hu.bme.incquery.deps.cp3model.impl.Cp3modelPackageImpl#getTypes()
		 * @generated
		 */
		EEnum TYPES = eINSTANCE.getTypes();

	}

} //Cp3modelPackage

/**
 */
package hu.bme.incquery.deps.wsmodel;

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
 * @see hu.bme.incquery.deps.wsmodel.WsmodelFactory
 * @model kind="package"
 * @generated
 */
public interface WsmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wsmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/donat/incquery-deps/wsmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WsmodelPackage eINSTANCE = hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.impl.WNamedElementImpl <em>WNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.impl.WNamedElementImpl
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWNamedElement()
	 * @generated
	 */
	int WNAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_ELEMENT__HANDLER = 1;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_ELEMENT__INCOMING_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_ELEMENT__OUTGOING_DEPENDENCIES = 3;

	/**
	 * The number of structural features of the '<em>WNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNAMED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.impl.WProjectImpl <em>WProject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.impl.WProjectImpl
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWProject()
	 * @generated
	 */
	int WPROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROJECT__NAME = WNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROJECT__HANDLER = WNAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROJECT__INCOMING_DEPENDENCIES = WNAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROJECT__OUTGOING_DEPENDENCIES = WNAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Package Fragment Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROJECT__PACKAGE_FRAGMENT_ROOTS = WNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROJECT__WORKSPACE = WNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WProject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPROJECT_FEATURE_COUNT = WNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.impl.WWorkspaceImpl <em>WWorkspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.impl.WWorkspaceImpl
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWWorkspace()
	 * @generated
	 */
	int WWORKSPACE = 1;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WWORKSPACE__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WWORKSPACE__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Dependencties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WWORKSPACE__DEPENDENCTIES = 2;

	/**
	 * The number of structural features of the '<em>WWorkspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WWORKSPACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.impl.WDependencyImpl <em>WDependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.impl.WDependencyImpl
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWDependency()
	 * @generated
	 */
	int WDEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDEPENDENCY__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDEPENDENCY__TO = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDEPENDENCY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>WDependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDEPENDENCY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentRootImpl <em>WPackage Fragment Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentRootImpl
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWPackageFragmentRoot()
	 * @generated
	 */
	int WPACKAGE_FRAGMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT_ROOT__NAME = WNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT_ROOT__HANDLER = WNAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT_ROOT__INCOMING_DEPENDENCIES = WNAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT_ROOT__OUTGOING_DEPENDENCIES = WNAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT_ROOT__PROJECT = WNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS = WNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WPackage Fragment Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT_ROOT_FEATURE_COUNT = WNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentImpl <em>WPackage Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentImpl
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWPackageFragment()
	 * @generated
	 */
	int WPACKAGE_FRAGMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT__NAME = WNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT__HANDLER = WNAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT__INCOMING_DEPENDENCIES = WNAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT__OUTGOING_DEPENDENCIES = WNAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Package Fragment Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT = WNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compilation Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT__COMPILATION_UNITS = WNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WPackage Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPACKAGE_FRAGMENT_FEATURE_COUNT = WNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.impl.WCompilationUnitImpl <em>WCompilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.impl.WCompilationUnitImpl
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWCompilationUnit()
	 * @generated
	 */
	int WCOMPILATION_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCOMPILATION_UNIT__NAME = WNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCOMPILATION_UNIT__HANDLER = WNAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCOMPILATION_UNIT__INCOMING_DEPENDENCIES = WNAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCOMPILATION_UNIT__OUTGOING_DEPENDENCIES = WNAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Package Fragment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCOMPILATION_UNIT__PACKAGE_FRAGMENT = WNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCOMPILATION_UNIT__TYPES = WNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WCompilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCOMPILATION_UNIT_FEATURE_COUNT = WNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.impl.WTypeImpl <em>WType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.impl.WTypeImpl
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWType()
	 * @generated
	 */
	int WTYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTYPE__NAME = WNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTYPE__HANDLER = WNAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTYPE__INCOMING_DEPENDENCIES = WNAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTYPE__OUTGOING_DEPENDENCIES = WNAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Compilation Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTYPE__COMPILATION_UNIT = WNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTYPE__METHODS = WNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTYPE__FIELDS = WNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>WType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTYPE_FEATURE_COUNT = WNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.impl.WMethodImpl <em>WMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.impl.WMethodImpl
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWMethod()
	 * @generated
	 */
	int WMETHOD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD__NAME = WNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD__HANDLER = WNAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD__INCOMING_DEPENDENCIES = WNAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD__OUTGOING_DEPENDENCIES = WNAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD__TYPE = WNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD__SIGNATURE = WNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>WMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WMETHOD_FEATURE_COUNT = WNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.impl.WFieldImpl <em>WField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.impl.WFieldImpl
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWField()
	 * @generated
	 */
	int WFIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFIELD__NAME = WNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFIELD__HANDLER = WNAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFIELD__INCOMING_DEPENDENCIES = WNAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFIELD__OUTGOING_DEPENDENCIES = WNAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFIELD__TYPE = WNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFIELD_FEATURE_COUNT = WNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.wsmodel.WDependencyType <em>WDependency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.wsmodel.WDependencyType
	 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWDependencyType()
	 * @generated
	 */
	int WDEPENDENCY_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.wsmodel.WProject <em>WProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WProject</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WProject
	 * @generated
	 */
	EClass getWProject();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.wsmodel.WProject#getPackageFragmentRoots <em>Package Fragment Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Fragment Roots</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WProject#getPackageFragmentRoots()
	 * @see #getWProject()
	 * @generated
	 */
	EReference getWProject_PackageFragmentRoots();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.incquery.deps.wsmodel.WProject#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Workspace</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WProject#getWorkspace()
	 * @see #getWProject()
	 * @generated
	 */
	EReference getWProject_Workspace();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.wsmodel.WWorkspace <em>WWorkspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WWorkspace</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WWorkspace
	 * @generated
	 */
	EClass getWWorkspace();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.wsmodel.WWorkspace#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WWorkspace#getProjects()
	 * @see #getWWorkspace()
	 * @generated
	 */
	EReference getWWorkspace_Projects();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.wsmodel.WWorkspace#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WWorkspace#getElements()
	 * @see #getWWorkspace()
	 * @generated
	 */
	EReference getWWorkspace_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.wsmodel.WWorkspace#getDependencties <em>Dependencties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencties</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WWorkspace#getDependencties()
	 * @see #getWWorkspace()
	 * @generated
	 */
	EReference getWWorkspace_Dependencties();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.wsmodel.WNamedElement <em>WNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WNamed Element</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WNamedElement
	 * @generated
	 */
	EClass getWNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WNamedElement#getName()
	 * @see #getWNamedElement()
	 * @generated
	 */
	EAttribute getWNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WNamedElement#getHandler()
	 * @see #getWNamedElement()
	 * @generated
	 */
	EAttribute getWNamedElement_Handler();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getIncomingDependencies <em>Incoming Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Dependencies</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WNamedElement#getIncomingDependencies()
	 * @see #getWNamedElement()
	 * @generated
	 */
	EReference getWNamedElement_IncomingDependencies();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.wsmodel.WNamedElement#getOutgoingDependencies <em>Outgoing Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Dependencies</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WNamedElement#getOutgoingDependencies()
	 * @see #getWNamedElement()
	 * @generated
	 */
	EReference getWNamedElement_OutgoingDependencies();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.wsmodel.WDependency <em>WDependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WDependency</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WDependency
	 * @generated
	 */
	EClass getWDependency();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.incquery.deps.wsmodel.WDependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WDependency#getFrom()
	 * @see #getWDependency()
	 * @generated
	 */
	EReference getWDependency_From();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.incquery.deps.wsmodel.WDependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WDependency#getTo()
	 * @see #getWDependency()
	 * @generated
	 */
	EReference getWDependency_To();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.wsmodel.WDependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WDependency#getType()
	 * @see #getWDependency()
	 * @generated
	 */
	EAttribute getWDependency_Type();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot <em>WPackage Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WPackage Fragment Root</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot
	 * @generated
	 */
	EClass getWPackageFragmentRoot();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getProject()
	 * @see #getWPackageFragmentRoot()
	 * @generated
	 */
	EReference getWPackageFragmentRoot_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getPackageFragments <em>Package Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Fragments</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot#getPackageFragments()
	 * @see #getWPackageFragmentRoot()
	 * @generated
	 */
	EReference getWPackageFragmentRoot_PackageFragments();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.wsmodel.WPackageFragment <em>WPackage Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WPackage Fragment</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragment
	 * @generated
	 */
	EClass getWPackageFragment();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.incquery.deps.wsmodel.WPackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package Fragment Root</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragment#getPackageFragmentRoot()
	 * @see #getWPackageFragment()
	 * @generated
	 */
	EReference getWPackageFragment_PackageFragmentRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.wsmodel.WPackageFragment#getCompilationUnits <em>Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compilation Units</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WPackageFragment#getCompilationUnits()
	 * @see #getWPackageFragment()
	 * @generated
	 */
	EReference getWPackageFragment_CompilationUnits();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.wsmodel.WCompilationUnit <em>WCompilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WCompilation Unit</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WCompilationUnit
	 * @generated
	 */
	EClass getWCompilationUnit();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.incquery.deps.wsmodel.WCompilationUnit#getPackageFragment <em>Package Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package Fragment</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WCompilationUnit#getPackageFragment()
	 * @see #getWCompilationUnit()
	 * @generated
	 */
	EReference getWCompilationUnit_PackageFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.wsmodel.WCompilationUnit#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WCompilationUnit#getTypes()
	 * @see #getWCompilationUnit()
	 * @generated
	 */
	EReference getWCompilationUnit_Types();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.wsmodel.WType <em>WType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WType</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WType
	 * @generated
	 */
	EClass getWType();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.incquery.deps.wsmodel.WType#getCompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compilation Unit</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WType#getCompilationUnit()
	 * @see #getWType()
	 * @generated
	 */
	EReference getWType_CompilationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.wsmodel.WType#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WType#getMethods()
	 * @see #getWType()
	 * @generated
	 */
	EReference getWType_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.wsmodel.WType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WType#getFields()
	 * @see #getWType()
	 * @generated
	 */
	EReference getWType_Fields();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.wsmodel.WMethod <em>WMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WMethod</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WMethod
	 * @generated
	 */
	EClass getWMethod();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.incquery.deps.wsmodel.WMethod#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WMethod#getType()
	 * @see #getWMethod()
	 * @generated
	 */
	EReference getWMethod_Type();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.wsmodel.WMethod#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WMethod#getSignature()
	 * @see #getWMethod()
	 * @generated
	 */
	EAttribute getWMethod_Signature();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.wsmodel.WField <em>WField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WField</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WField
	 * @generated
	 */
	EClass getWField();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.incquery.deps.wsmodel.WField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WField#getType()
	 * @see #getWField()
	 * @generated
	 */
	EReference getWField_Type();

	/**
	 * Returns the meta object for enum '{@link hu.bme.incquery.deps.wsmodel.WDependencyType <em>WDependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WDependency Type</em>'.
	 * @see hu.bme.incquery.deps.wsmodel.WDependencyType
	 * @generated
	 */
	EEnum getWDependencyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WsmodelFactory getWsmodelFactory();

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
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.impl.WProjectImpl <em>WProject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.impl.WProjectImpl
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWProject()
		 * @generated
		 */
		EClass WPROJECT = eINSTANCE.getWProject();

		/**
		 * The meta object literal for the '<em><b>Package Fragment Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPROJECT__PACKAGE_FRAGMENT_ROOTS = eINSTANCE.getWProject_PackageFragmentRoots();

		/**
		 * The meta object literal for the '<em><b>Workspace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPROJECT__WORKSPACE = eINSTANCE.getWProject_Workspace();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.impl.WWorkspaceImpl <em>WWorkspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.impl.WWorkspaceImpl
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWWorkspace()
		 * @generated
		 */
		EClass WWORKSPACE = eINSTANCE.getWWorkspace();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WWORKSPACE__PROJECTS = eINSTANCE.getWWorkspace_Projects();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WWORKSPACE__ELEMENTS = eINSTANCE.getWWorkspace_Elements();

		/**
		 * The meta object literal for the '<em><b>Dependencties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WWORKSPACE__DEPENDENCTIES = eINSTANCE.getWWorkspace_Dependencties();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.impl.WNamedElementImpl <em>WNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.impl.WNamedElementImpl
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWNamedElement()
		 * @generated
		 */
		EClass WNAMED_ELEMENT = eINSTANCE.getWNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WNAMED_ELEMENT__NAME = eINSTANCE.getWNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WNAMED_ELEMENT__HANDLER = eINSTANCE.getWNamedElement_Handler();

		/**
		 * The meta object literal for the '<em><b>Incoming Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WNAMED_ELEMENT__INCOMING_DEPENDENCIES = eINSTANCE.getWNamedElement_IncomingDependencies();

		/**
		 * The meta object literal for the '<em><b>Outgoing Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WNAMED_ELEMENT__OUTGOING_DEPENDENCIES = eINSTANCE.getWNamedElement_OutgoingDependencies();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.impl.WDependencyImpl <em>WDependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.impl.WDependencyImpl
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWDependency()
		 * @generated
		 */
		EClass WDEPENDENCY = eINSTANCE.getWDependency();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WDEPENDENCY__FROM = eINSTANCE.getWDependency_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WDEPENDENCY__TO = eINSTANCE.getWDependency_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WDEPENDENCY__TYPE = eINSTANCE.getWDependency_Type();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentRootImpl <em>WPackage Fragment Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentRootImpl
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWPackageFragmentRoot()
		 * @generated
		 */
		EClass WPACKAGE_FRAGMENT_ROOT = eINSTANCE.getWPackageFragmentRoot();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPACKAGE_FRAGMENT_ROOT__PROJECT = eINSTANCE.getWPackageFragmentRoot_Project();

		/**
		 * The meta object literal for the '<em><b>Package Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS = eINSTANCE.getWPackageFragmentRoot_PackageFragments();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentImpl <em>WPackage Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.impl.WPackageFragmentImpl
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWPackageFragment()
		 * @generated
		 */
		EClass WPACKAGE_FRAGMENT = eINSTANCE.getWPackageFragment();

		/**
		 * The meta object literal for the '<em><b>Package Fragment Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT = eINSTANCE.getWPackageFragment_PackageFragmentRoot();

		/**
		 * The meta object literal for the '<em><b>Compilation Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPACKAGE_FRAGMENT__COMPILATION_UNITS = eINSTANCE.getWPackageFragment_CompilationUnits();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.impl.WCompilationUnitImpl <em>WCompilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.impl.WCompilationUnitImpl
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWCompilationUnit()
		 * @generated
		 */
		EClass WCOMPILATION_UNIT = eINSTANCE.getWCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Package Fragment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCOMPILATION_UNIT__PACKAGE_FRAGMENT = eINSTANCE.getWCompilationUnit_PackageFragment();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCOMPILATION_UNIT__TYPES = eINSTANCE.getWCompilationUnit_Types();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.impl.WTypeImpl <em>WType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.impl.WTypeImpl
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWType()
		 * @generated
		 */
		EClass WTYPE = eINSTANCE.getWType();

		/**
		 * The meta object literal for the '<em><b>Compilation Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WTYPE__COMPILATION_UNIT = eINSTANCE.getWType_CompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WTYPE__METHODS = eINSTANCE.getWType_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WTYPE__FIELDS = eINSTANCE.getWType_Fields();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.impl.WMethodImpl <em>WMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.impl.WMethodImpl
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWMethod()
		 * @generated
		 */
		EClass WMETHOD = eINSTANCE.getWMethod();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WMETHOD__TYPE = eINSTANCE.getWMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WMETHOD__SIGNATURE = eINSTANCE.getWMethod_Signature();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.impl.WFieldImpl <em>WField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.impl.WFieldImpl
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWField()
		 * @generated
		 */
		EClass WFIELD = eINSTANCE.getWField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFIELD__TYPE = eINSTANCE.getWField_Type();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.wsmodel.WDependencyType <em>WDependency Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.wsmodel.WDependencyType
		 * @see hu.bme.incquery.deps.wsmodel.impl.WsmodelPackageImpl#getWDependencyType()
		 * @generated
		 */
		EEnum WDEPENDENCY_TYPE = eINSTANCE.getWDependencyType();

	}

} //WsmodelPackage

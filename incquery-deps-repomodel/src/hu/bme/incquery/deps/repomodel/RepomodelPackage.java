/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel;

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
 * @see hu.bme.incquery.deps.repomodel.RepomodelFactory
 * @model kind="package"
 * @generated
 */
public interface RepomodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repomodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/donat/incquery-deps/repomodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepomodelPackage eINSTANCE = hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.repomodel.impl.RRepositoryItemImpl <em>RRepository Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.repomodel.impl.RRepositoryItemImpl
	 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRRepositoryItem()
	 * @generated
	 */
	int RREPOSITORY_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREPOSITORY_ITEM__UUID = 0;

	/**
	 * The number of structural features of the '<em>RRepository Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREPOSITORY_ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.repomodel.impl.RCodeElementImpl <em>RCode Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.repomodel.impl.RCodeElementImpl
	 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRCodeElement()
	 * @generated
	 */
	int RCODE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCODE_ELEMENT__UUID = RREPOSITORY_ITEM__UUID;

	/**
	 * The feature id for the '<em><b>RIncoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCODE_ELEMENT__RINCOMING = RREPOSITORY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ROutgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCODE_ELEMENT__ROUTGOING = RREPOSITORY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCODE_ELEMENT__VERSIONS = RREPOSITORY_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCODE_ELEMENT__ID = RREPOSITORY_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>RCode Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCODE_ELEMENT_FEATURE_COUNT = RREPOSITORY_ITEM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.repomodel.impl.RProjectImpl <em>RProject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.repomodel.impl.RProjectImpl
	 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRProject()
	 * @generated
	 */
	int RPROJECT = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT__UUID = RCODE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>RIncoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT__RINCOMING = RCODE_ELEMENT__RINCOMING;

	/**
	 * The feature id for the '<em><b>ROutgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT__ROUTGOING = RCODE_ELEMENT__ROUTGOING;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT__VERSIONS = RCODE_ELEMENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT__ID = RCODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT__NAME = RCODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RClasses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT__RCLASSES = RCODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containing Folders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT__CONTAINING_FOLDERS = RCODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT__PRODUCT_PATH = RCODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Store Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT__STORE_LOCATION = RCODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>RProject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPROJECT_FEATURE_COUNT = RCODE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl <em>RClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.repomodel.impl.RClassImpl
	 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRClass()
	 * @generated
	 */
	int RCLASS = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__UUID = RCODE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>RIncoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__RINCOMING = RCODE_ELEMENT__RINCOMING;

	/**
	 * The feature id for the '<em><b>ROutgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__ROUTGOING = RCODE_ELEMENT__ROUTGOING;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__VERSIONS = RCODE_ELEMENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__ID = RCODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__SIMPLE_NAME = RCODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__PACKAGE_NAME = RCODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RMethods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__RMETHODS = RCODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>RFields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__RFIELDS = RCODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>RProject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__RPROJECT = RCODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__EXTENDS = RCODE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__IMPLEMENTS = RCODE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__PRIVATE = RCODE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__ANONYMOUS = RCODE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Referenced Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__REFERENCED_CLASSES = RCODE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fq Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS__FQ_NAME = RCODE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>RClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RCLASS_FEATURE_COUNT = RCODE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.repomodel.impl.RMethodImpl <em>RMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.repomodel.impl.RMethodImpl
	 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRMethod()
	 * @generated
	 */
	int RMETHOD = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__UUID = RCODE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>RIncoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__RINCOMING = RCODE_ELEMENT__RINCOMING;

	/**
	 * The feature id for the '<em><b>ROutgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__ROUTGOING = RCODE_ELEMENT__ROUTGOING;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__VERSIONS = RCODE_ELEMENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__ID = RCODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__SIGNATURE = RCODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RClass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__RCLASS = RCODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__PRIVATE = RCODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referenced Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__REFERENCED_FIELDS = RCODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Referenced Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__REFERENCED_METHODS = RCODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD__STATIC = RCODE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>RMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMETHOD_FEATURE_COUNT = RCODE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.repomodel.impl.RFieldImpl <em>RField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.repomodel.impl.RFieldImpl
	 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRField()
	 * @generated
	 */
	int RFIELD = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFIELD__UUID = RCODE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>RIncoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFIELD__RINCOMING = RCODE_ELEMENT__RINCOMING;

	/**
	 * The feature id for the '<em><b>ROutgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFIELD__ROUTGOING = RCODE_ELEMENT__ROUTGOING;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFIELD__VERSIONS = RCODE_ELEMENT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFIELD__ID = RCODE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFIELD__SIGNATURE = RCODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RClass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFIELD__RCLASS = RCODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFIELD__PRIVATE = RCODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFIELD_FEATURE_COUNT = RCODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.repomodel.impl.RDependencyImpl <em>RDependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.repomodel.impl.RDependencyImpl
	 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRDependency()
	 * @generated
	 */
	int RDEPENDENCY = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDEPENDENCY__UUID = RREPOSITORY_ITEM__UUID;

	/**
	 * The feature id for the '<em><b>RFrom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDEPENDENCY__RFROM = RREPOSITORY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RTo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDEPENDENCY__RTO = RREPOSITORY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dep Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDEPENDENCY__DEP_TYPE = RREPOSITORY_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RDependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDEPENDENCY_FEATURE_COUNT = RREPOSITORY_ITEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.repomodel.impl.RRepositoryImpl <em>RRepository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.repomodel.impl.RRepositoryImpl
	 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRRepository()
	 * @generated
	 */
	int RREPOSITORY = 7;

	/**
	 * The feature id for the '<em><b>RDependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREPOSITORY__RDEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>RProjects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREPOSITORY__RPROJECTS = 1;

	/**
	 * The number of structural features of the '<em>RRepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RREPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.incquery.deps.repomodel.impl.RTransitiveDependencyImpl <em>RTransitive Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.incquery.deps.repomodel.impl.RTransitiveDependencyImpl
	 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRTransitiveDependency()
	 * @generated
	 */
	int RTRANSITIVE_DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTRANSITIVE_DEPENDENCY__UUID = RDEPENDENCY__UUID;

	/**
	 * The feature id for the '<em><b>RFrom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTRANSITIVE_DEPENDENCY__RFROM = RDEPENDENCY__RFROM;

	/**
	 * The feature id for the '<em><b>RTo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTRANSITIVE_DEPENDENCY__RTO = RDEPENDENCY__RTO;

	/**
	 * The feature id for the '<em><b>Dep Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTRANSITIVE_DEPENDENCY__DEP_TYPE = RDEPENDENCY__DEP_TYPE;

	/**
	 * The feature id for the '<em><b>RTtransitive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTRANSITIVE_DEPENDENCY__RTTRANSITIVE_FROM = RDEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RTransitive Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTRANSITIVE_DEPENDENCY_FEATURE_COUNT = RDEPENDENCY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.repomodel.RRepositoryItem <em>RRepository Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RRepository Item</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RRepositoryItem
	 * @generated
	 */
	EClass getRRepositoryItem();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RRepositoryItem#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RRepositoryItem#getUuid()
	 * @see #getRRepositoryItem()
	 * @generated
	 */
	EAttribute getRRepositoryItem_Uuid();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.repomodel.RCodeElement <em>RCode Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RCode Element</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RCodeElement
	 * @generated
	 */
	EClass getRCodeElement();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.repomodel.RCodeElement#getRIncoming <em>RIncoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RIncoming</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RCodeElement#getRIncoming()
	 * @see #getRCodeElement()
	 * @generated
	 */
	EReference getRCodeElement_RIncoming();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.repomodel.RCodeElement#getROutgoing <em>ROutgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ROutgoing</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RCodeElement#getROutgoing()
	 * @see #getRCodeElement()
	 * @generated
	 */
	EReference getRCodeElement_ROutgoing();

	/**
	 * Returns the meta object for the attribute list '{@link hu.bme.incquery.deps.repomodel.RCodeElement#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Versions</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RCodeElement#getVersions()
	 * @see #getRCodeElement()
	 * @generated
	 */
	EAttribute getRCodeElement_Versions();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RCodeElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RCodeElement#getId()
	 * @see #getRCodeElement()
	 * @generated
	 */
	EAttribute getRCodeElement_Id();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.repomodel.RProject <em>RProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RProject</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RProject
	 * @generated
	 */
	EClass getRProject();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RProject#getName()
	 * @see #getRProject()
	 * @generated
	 */
	EAttribute getRProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.repomodel.RProject#getRClasses <em>RClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RClasses</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RProject#getRClasses()
	 * @see #getRProject()
	 * @generated
	 */
	EReference getRProject_RClasses();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RProject#getContainingFolders <em>Containing Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containing Folders</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RProject#getContainingFolders()
	 * @see #getRProject()
	 * @generated
	 */
	EAttribute getRProject_ContainingFolders();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RProject#getProductPath <em>Product Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Path</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RProject#getProductPath()
	 * @see #getRProject()
	 * @generated
	 */
	EAttribute getRProject_ProductPath();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RProject#getStoreLocation <em>Store Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Location</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RProject#getStoreLocation()
	 * @see #getRProject()
	 * @generated
	 */
	EAttribute getRProject_StoreLocation();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.repomodel.RClass <em>RClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RClass</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass
	 * @generated
	 */
	EClass getRClass();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RClass#getSimpleName <em>Simple Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Name</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#getSimpleName()
	 * @see #getRClass()
	 * @generated
	 */
	EAttribute getRClass_SimpleName();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RClass#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#getPackageName()
	 * @see #getRClass()
	 * @generated
	 */
	EAttribute getRClass_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.repomodel.RClass#getRMethods <em>RMethods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RMethods</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#getRMethods()
	 * @see #getRClass()
	 * @generated
	 */
	EReference getRClass_RMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.repomodel.RClass#getRFields <em>RFields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RFields</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#getRFields()
	 * @see #getRClass()
	 * @generated
	 */
	EReference getRClass_RFields();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.incquery.deps.repomodel.RClass#getRProject <em>RProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>RProject</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#getRProject()
	 * @see #getRClass()
	 * @generated
	 */
	EReference getRClass_RProject();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#getExtends()
	 * @see #getRClass()
	 * @generated
	 */
	EAttribute getRClass_Extends();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implements</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#getImplements()
	 * @see #getRClass()
	 * @generated
	 */
	EAttribute getRClass_Implements();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RClass#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#isPrivate()
	 * @see #getRClass()
	 * @generated
	 */
	EAttribute getRClass_Private();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RClass#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#isAnonymous()
	 * @see #getRClass()
	 * @generated
	 */
	EAttribute getRClass_Anonymous();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RClass#getReferencedClasses <em>Referenced Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Classes</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#getReferencedClasses()
	 * @see #getRClass()
	 * @generated
	 */
	EAttribute getRClass_ReferencedClasses();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RClass#getFqName <em>Fq Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fq Name</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RClass#getFqName()
	 * @see #getRClass()
	 * @generated
	 */
	EAttribute getRClass_FqName();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.repomodel.RMethod <em>RMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RMethod</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RMethod
	 * @generated
	 */
	EClass getRMethod();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RMethod#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RMethod#getSignature()
	 * @see #getRMethod()
	 * @generated
	 */
	EAttribute getRMethod_Signature();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.incquery.deps.repomodel.RMethod#getRClass <em>RClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>RClass</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RMethod#getRClass()
	 * @see #getRMethod()
	 * @generated
	 */
	EReference getRMethod_RClass();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RMethod#getPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RMethod#getPrivate()
	 * @see #getRMethod()
	 * @generated
	 */
	EAttribute getRMethod_Private();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RMethod#getReferencedFields <em>Referenced Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Fields</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RMethod#getReferencedFields()
	 * @see #getRMethod()
	 * @generated
	 */
	EAttribute getRMethod_ReferencedFields();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RMethod#getReferencedMethods <em>Referenced Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Methods</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RMethod#getReferencedMethods()
	 * @see #getRMethod()
	 * @generated
	 */
	EAttribute getRMethod_ReferencedMethods();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RMethod#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RMethod#isStatic()
	 * @see #getRMethod()
	 * @generated
	 */
	EAttribute getRMethod_Static();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.repomodel.RField <em>RField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RField</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RField
	 * @generated
	 */
	EClass getRField();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RField#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RField#getSignature()
	 * @see #getRField()
	 * @generated
	 */
	EAttribute getRField_Signature();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.incquery.deps.repomodel.RField#getRClass <em>RClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>RClass</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RField#getRClass()
	 * @see #getRField()
	 * @generated
	 */
	EReference getRField_RClass();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RField#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RField#isPrivate()
	 * @see #getRField()
	 * @generated
	 */
	EAttribute getRField_Private();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.repomodel.RDependency <em>RDependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDependency</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RDependency
	 * @generated
	 */
	EClass getRDependency();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.incquery.deps.repomodel.RDependency#getRFrom <em>RFrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RFrom</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RDependency#getRFrom()
	 * @see #getRDependency()
	 * @generated
	 */
	EReference getRDependency_RFrom();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.incquery.deps.repomodel.RDependency#getRTo <em>RTo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>RTo</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RDependency#getRTo()
	 * @see #getRDependency()
	 * @generated
	 */
	EReference getRDependency_RTo();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.incquery.deps.repomodel.RDependency#getDepType <em>Dep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dep Type</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RDependency#getDepType()
	 * @see #getRDependency()
	 * @generated
	 */
	EAttribute getRDependency_DepType();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.repomodel.RRepository <em>RRepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RRepository</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RRepository
	 * @generated
	 */
	EClass getRRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.repomodel.RRepository#getRDependencies <em>RDependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RDependencies</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RRepository#getRDependencies()
	 * @see #getRRepository()
	 * @generated
	 */
	EReference getRRepository_RDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.incquery.deps.repomodel.RRepository#getRProjects <em>RProjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RProjects</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RRepository#getRProjects()
	 * @see #getRRepository()
	 * @generated
	 */
	EReference getRRepository_RProjects();

	/**
	 * Returns the meta object for class '{@link hu.bme.incquery.deps.repomodel.RTransitiveDependency <em>RTransitive Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTransitive Dependency</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RTransitiveDependency
	 * @generated
	 */
	EClass getRTransitiveDependency();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.incquery.deps.repomodel.RTransitiveDependency#getRTtransitiveFrom <em>RTtransitive From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RTtransitive From</em>'.
	 * @see hu.bme.incquery.deps.repomodel.RTransitiveDependency#getRTtransitiveFrom()
	 * @see #getRTransitiveDependency()
	 * @generated
	 */
	EReference getRTransitiveDependency_RTtransitiveFrom();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepomodelFactory getRepomodelFactory();

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
		 * The meta object literal for the '{@link hu.bme.incquery.deps.repomodel.impl.RRepositoryItemImpl <em>RRepository Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.repomodel.impl.RRepositoryItemImpl
		 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRRepositoryItem()
		 * @generated
		 */
		EClass RREPOSITORY_ITEM = eINSTANCE.getRRepositoryItem();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RREPOSITORY_ITEM__UUID = eINSTANCE.getRRepositoryItem_Uuid();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.repomodel.impl.RCodeElementImpl <em>RCode Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.repomodel.impl.RCodeElementImpl
		 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRCodeElement()
		 * @generated
		 */
		EClass RCODE_ELEMENT = eINSTANCE.getRCodeElement();

		/**
		 * The meta object literal for the '<em><b>RIncoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCODE_ELEMENT__RINCOMING = eINSTANCE.getRCodeElement_RIncoming();

		/**
		 * The meta object literal for the '<em><b>ROutgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCODE_ELEMENT__ROUTGOING = eINSTANCE.getRCodeElement_ROutgoing();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCODE_ELEMENT__VERSIONS = eINSTANCE.getRCodeElement_Versions();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCODE_ELEMENT__ID = eINSTANCE.getRCodeElement_Id();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.repomodel.impl.RProjectImpl <em>RProject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.repomodel.impl.RProjectImpl
		 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRProject()
		 * @generated
		 */
		EClass RPROJECT = eINSTANCE.getRProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPROJECT__NAME = eINSTANCE.getRProject_Name();

		/**
		 * The meta object literal for the '<em><b>RClasses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPROJECT__RCLASSES = eINSTANCE.getRProject_RClasses();

		/**
		 * The meta object literal for the '<em><b>Containing Folders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPROJECT__CONTAINING_FOLDERS = eINSTANCE.getRProject_ContainingFolders();

		/**
		 * The meta object literal for the '<em><b>Product Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPROJECT__PRODUCT_PATH = eINSTANCE.getRProject_ProductPath();

		/**
		 * The meta object literal for the '<em><b>Store Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPROJECT__STORE_LOCATION = eINSTANCE.getRProject_StoreLocation();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.repomodel.impl.RClassImpl <em>RClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.repomodel.impl.RClassImpl
		 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRClass()
		 * @generated
		 */
		EClass RCLASS = eINSTANCE.getRClass();

		/**
		 * The meta object literal for the '<em><b>Simple Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCLASS__SIMPLE_NAME = eINSTANCE.getRClass_SimpleName();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCLASS__PACKAGE_NAME = eINSTANCE.getRClass_PackageName();

		/**
		 * The meta object literal for the '<em><b>RMethods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCLASS__RMETHODS = eINSTANCE.getRClass_RMethods();

		/**
		 * The meta object literal for the '<em><b>RFields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCLASS__RFIELDS = eINSTANCE.getRClass_RFields();

		/**
		 * The meta object literal for the '<em><b>RProject</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RCLASS__RPROJECT = eINSTANCE.getRClass_RProject();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCLASS__EXTENDS = eINSTANCE.getRClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCLASS__IMPLEMENTS = eINSTANCE.getRClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCLASS__PRIVATE = eINSTANCE.getRClass_Private();

		/**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCLASS__ANONYMOUS = eINSTANCE.getRClass_Anonymous();

		/**
		 * The meta object literal for the '<em><b>Referenced Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCLASS__REFERENCED_CLASSES = eINSTANCE.getRClass_ReferencedClasses();

		/**
		 * The meta object literal for the '<em><b>Fq Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RCLASS__FQ_NAME = eINSTANCE.getRClass_FqName();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.repomodel.impl.RMethodImpl <em>RMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.repomodel.impl.RMethodImpl
		 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRMethod()
		 * @generated
		 */
		EClass RMETHOD = eINSTANCE.getRMethod();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RMETHOD__SIGNATURE = eINSTANCE.getRMethod_Signature();

		/**
		 * The meta object literal for the '<em><b>RClass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RMETHOD__RCLASS = eINSTANCE.getRMethod_RClass();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RMETHOD__PRIVATE = eINSTANCE.getRMethod_Private();

		/**
		 * The meta object literal for the '<em><b>Referenced Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RMETHOD__REFERENCED_FIELDS = eINSTANCE.getRMethod_ReferencedFields();

		/**
		 * The meta object literal for the '<em><b>Referenced Methods</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RMETHOD__REFERENCED_METHODS = eINSTANCE.getRMethod_ReferencedMethods();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RMETHOD__STATIC = eINSTANCE.getRMethod_Static();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.repomodel.impl.RFieldImpl <em>RField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.repomodel.impl.RFieldImpl
		 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRField()
		 * @generated
		 */
		EClass RFIELD = eINSTANCE.getRField();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RFIELD__SIGNATURE = eINSTANCE.getRField_Signature();

		/**
		 * The meta object literal for the '<em><b>RClass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RFIELD__RCLASS = eINSTANCE.getRField_RClass();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RFIELD__PRIVATE = eINSTANCE.getRField_Private();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.repomodel.impl.RDependencyImpl <em>RDependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.repomodel.impl.RDependencyImpl
		 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRDependency()
		 * @generated
		 */
		EClass RDEPENDENCY = eINSTANCE.getRDependency();

		/**
		 * The meta object literal for the '<em><b>RFrom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDEPENDENCY__RFROM = eINSTANCE.getRDependency_RFrom();

		/**
		 * The meta object literal for the '<em><b>RTo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDEPENDENCY__RTO = eINSTANCE.getRDependency_RTo();

		/**
		 * The meta object literal for the '<em><b>Dep Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDEPENDENCY__DEP_TYPE = eINSTANCE.getRDependency_DepType();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.repomodel.impl.RRepositoryImpl <em>RRepository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.repomodel.impl.RRepositoryImpl
		 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRRepository()
		 * @generated
		 */
		EClass RREPOSITORY = eINSTANCE.getRRepository();

		/**
		 * The meta object literal for the '<em><b>RDependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREPOSITORY__RDEPENDENCIES = eINSTANCE.getRRepository_RDependencies();

		/**
		 * The meta object literal for the '<em><b>RProjects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RREPOSITORY__RPROJECTS = eINSTANCE.getRRepository_RProjects();

		/**
		 * The meta object literal for the '{@link hu.bme.incquery.deps.repomodel.impl.RTransitiveDependencyImpl <em>RTransitive Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.incquery.deps.repomodel.impl.RTransitiveDependencyImpl
		 * @see hu.bme.incquery.deps.repomodel.impl.RepomodelPackageImpl#getRTransitiveDependency()
		 * @generated
		 */
		EClass RTRANSITIVE_DEPENDENCY = eINSTANCE.getRTransitiveDependency();

		/**
		 * The meta object literal for the '<em><b>RTtransitive From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTRANSITIVE_DEPENDENCY__RTTRANSITIVE_FROM = eINSTANCE.getRTransitiveDependency_RTtransitiveFrom();

	}

} //RepomodelPackage

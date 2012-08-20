/**
 */
package cern.devtools.depanalysis.wsmodel;

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
 * @see cern.devtools.depanalysis.wsmodel.JavaModelFactory
 * @model kind="package"
 * @generated
 */
public interface JavaModelPackage extends EPackage {
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
	String eNS_URI = "http://github.com/donat/incquery-deps/eclipse-workspace-model";

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
	JavaModelPackage eINSTANCE = cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.impl.NamedElementImpl
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__HANDLER = 1;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__INCOMING_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OUTGOING_DEPENDENCIES = 3;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.impl.JavaProjectImpl <em>Java Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaProjectImpl
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getJavaProject()
	 * @generated
	 */
	int JAVA_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__HANDLER = NAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__INCOMING_DEPENDENCIES = NAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__OUTGOING_DEPENDENCIES = NAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Package Fragment Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eclipse Workspace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__ECLIPSE_WORKSPACE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.impl.EclipseWorkspaceImpl <em>Eclipse Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.impl.EclipseWorkspaceImpl
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getEclipseWorkspace()
	 * @generated
	 */
	int ECLIPSE_WORKSPACE = 1;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_WORKSPACE__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_WORKSPACE__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Dependencties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_WORKSPACE__DEPENDENCTIES = 2;

	/**
	 * The number of structural features of the '<em>Eclipse Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_WORKSPACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.impl.DependencyImpl
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TO = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.impl.PackageFragmentRootImpl <em>Package Fragment Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.impl.PackageFragmentRootImpl
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getPackageFragmentRoot()
	 * @generated
	 */
	int PACKAGE_FRAGMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__HANDLER = NAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__INCOMING_DEPENDENCIES = NAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__OUTGOING_DEPENDENCIES = NAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Java Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Fragment Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_ROOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.impl.PackageFragmentImpl <em>Package Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.impl.PackageFragmentImpl
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getPackageFragment()
	 * @generated
	 */
	int PACKAGE_FRAGMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__HANDLER = NAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__INCOMING_DEPENDENCIES = NAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__OUTGOING_DEPENDENCIES = NAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Package Fragment Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compilation Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT__COMPILATION_UNITS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FRAGMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.impl.CompilationUnitImpl
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__HANDLER = NAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__INCOMING_DEPENDENCIES = NAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__OUTGOING_DEPENDENCIES = NAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Package Fragment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PACKAGE_FRAGMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__TYPES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.impl.TypeImpl
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__HANDLER = NAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INCOMING_DEPENDENCIES = NAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OUTGOING_DEPENDENCIES = NAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Compilation Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMPILATION_UNIT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__METHODS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__FIELDS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.impl.MethodImpl
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__HANDLER = NAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INCOMING_DEPENDENCIES = NAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OUTGOING_DEPENDENCIES = NAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.impl.FieldImpl
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__HANDLER = NAMED_ELEMENT__HANDLER;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INCOMING_DEPENDENCIES = NAMED_ELEMENT__INCOMING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OUTGOING_DEPENDENCIES = NAMED_ELEMENT__OUTGOING_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cern.devtools.depanalysis.wsmodel.DependencyType <em>Dependency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cern.devtools.depanalysis.wsmodel.DependencyType
	 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getDependencyType()
	 * @generated
	 */
	int DEPENDENCY_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link cern.devtools.depanalysis.wsmodel.JavaProject <em>Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Project</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.JavaProject
	 * @generated
	 */
	EClass getJavaProject();

	/**
	 * Returns the meta object for the containment reference list '{@link cern.devtools.depanalysis.wsmodel.JavaProject#getPackageFragmentRoots <em>Package Fragment Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Fragment Roots</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.JavaProject#getPackageFragmentRoots()
	 * @see #getJavaProject()
	 * @generated
	 */
	EReference getJavaProject_PackageFragmentRoots();

	/**
	 * Returns the meta object for the container reference '{@link cern.devtools.depanalysis.wsmodel.JavaProject#getEclipseWorkspace <em>Eclipse Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Eclipse Workspace</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.JavaProject#getEclipseWorkspace()
	 * @see #getJavaProject()
	 * @generated
	 */
	EReference getJavaProject_EclipseWorkspace();

	/**
	 * Returns the meta object for class '{@link cern.devtools.depanalysis.wsmodel.EclipseWorkspace <em>Eclipse Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eclipse Workspace</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.EclipseWorkspace
	 * @generated
	 */
	EClass getEclipseWorkspace();

	/**
	 * Returns the meta object for the containment reference list '{@link cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getProjects()
	 * @see #getEclipseWorkspace()
	 * @generated
	 */
	EReference getEclipseWorkspace_Projects();

	/**
	 * Returns the meta object for the reference list '{@link cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getElements()
	 * @see #getEclipseWorkspace()
	 * @generated
	 */
	EReference getEclipseWorkspace_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getDependencties <em>Dependencties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencties</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.EclipseWorkspace#getDependencties()
	 * @see #getEclipseWorkspace()
	 * @generated
	 */
	EReference getEclipseWorkspace_Dependencties();

	/**
	 * Returns the meta object for class '{@link cern.devtools.depanalysis.wsmodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link cern.devtools.depanalysis.wsmodel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link cern.devtools.depanalysis.wsmodel.NamedElement#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.NamedElement#getHandler()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Handler();

	/**
	 * Returns the meta object for the reference list '{@link cern.devtools.depanalysis.wsmodel.NamedElement#getIncomingDependencies <em>Incoming Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Dependencies</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.NamedElement#getIncomingDependencies()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_IncomingDependencies();

	/**
	 * Returns the meta object for the reference list '{@link cern.devtools.depanalysis.wsmodel.NamedElement#getOutgoingDependencies <em>Outgoing Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Dependencies</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.NamedElement#getOutgoingDependencies()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_OutgoingDependencies();

	/**
	 * Returns the meta object for class '{@link cern.devtools.depanalysis.wsmodel.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link cern.devtools.depanalysis.wsmodel.Dependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Dependency#getFrom()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_From();

	/**
	 * Returns the meta object for the reference '{@link cern.devtools.depanalysis.wsmodel.Dependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Dependency#getTo()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_To();

	/**
	 * Returns the meta object for the attribute '{@link cern.devtools.depanalysis.wsmodel.Dependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Dependency#getType()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Type();

	/**
	 * Returns the meta object for class '{@link cern.devtools.depanalysis.wsmodel.PackageFragmentRoot <em>Package Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Fragment Root</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragmentRoot
	 * @generated
	 */
	EClass getPackageFragmentRoot();

	/**
	 * Returns the meta object for the container reference '{@link cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getJavaProject <em>Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Java Project</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getJavaProject()
	 * @see #getPackageFragmentRoot()
	 * @generated
	 */
	EReference getPackageFragmentRoot_JavaProject();

	/**
	 * Returns the meta object for the containment reference list '{@link cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getPackageFragments <em>Package Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Fragments</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragmentRoot#getPackageFragments()
	 * @see #getPackageFragmentRoot()
	 * @generated
	 */
	EReference getPackageFragmentRoot_PackageFragments();

	/**
	 * Returns the meta object for class '{@link cern.devtools.depanalysis.wsmodel.PackageFragment <em>Package Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Fragment</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragment
	 * @generated
	 */
	EClass getPackageFragment();

	/**
	 * Returns the meta object for the container reference '{@link cern.devtools.depanalysis.wsmodel.PackageFragment#getPackageFragmentRoot <em>Package Fragment Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package Fragment Root</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragment#getPackageFragmentRoot()
	 * @see #getPackageFragment()
	 * @generated
	 */
	EReference getPackageFragment_PackageFragmentRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link cern.devtools.depanalysis.wsmodel.PackageFragment#getCompilationUnits <em>Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compilation Units</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.PackageFragment#getCompilationUnits()
	 * @see #getPackageFragment()
	 * @generated
	 */
	EReference getPackageFragment_CompilationUnits();

	/**
	 * Returns the meta object for class '{@link cern.devtools.depanalysis.wsmodel.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the container reference '{@link cern.devtools.depanalysis.wsmodel.CompilationUnit#getPackageFragment <em>Package Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package Fragment</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.CompilationUnit#getPackageFragment()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_PackageFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link cern.devtools.depanalysis.wsmodel.CompilationUnit#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.CompilationUnit#getTypes()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Types();

	/**
	 * Returns the meta object for class '{@link cern.devtools.depanalysis.wsmodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the container reference '{@link cern.devtools.depanalysis.wsmodel.Type#getCompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compilation Unit</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Type#getCompilationUnit()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_CompilationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link cern.devtools.depanalysis.wsmodel.Type#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Type#getMethods()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link cern.devtools.depanalysis.wsmodel.Type#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Type#getFields()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Fields();

	/**
	 * Returns the meta object for class '{@link cern.devtools.depanalysis.wsmodel.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the container reference '{@link cern.devtools.depanalysis.wsmodel.Method#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Method#getType()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Type();

	/**
	 * Returns the meta object for class '{@link cern.devtools.depanalysis.wsmodel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the container reference '{@link cern.devtools.depanalysis.wsmodel.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for enum '{@link cern.devtools.depanalysis.wsmodel.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Type</em>'.
	 * @see cern.devtools.depanalysis.wsmodel.DependencyType
	 * @generated
	 */
	EEnum getDependencyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaModelFactory getJavaModelFactory();

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
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.impl.JavaProjectImpl <em>Java Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaProjectImpl
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getJavaProject()
		 * @generated
		 */
		EClass JAVA_PROJECT = eINSTANCE.getJavaProject();

		/**
		 * The meta object literal for the '<em><b>Package Fragment Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_PROJECT__PACKAGE_FRAGMENT_ROOTS = eINSTANCE.getJavaProject_PackageFragmentRoots();

		/**
		 * The meta object literal for the '<em><b>Eclipse Workspace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_PROJECT__ECLIPSE_WORKSPACE = eINSTANCE.getJavaProject_EclipseWorkspace();

		/**
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.impl.EclipseWorkspaceImpl <em>Eclipse Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.impl.EclipseWorkspaceImpl
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getEclipseWorkspace()
		 * @generated
		 */
		EClass ECLIPSE_WORKSPACE = eINSTANCE.getEclipseWorkspace();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_WORKSPACE__PROJECTS = eINSTANCE.getEclipseWorkspace_Projects();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_WORKSPACE__ELEMENTS = eINSTANCE.getEclipseWorkspace_Elements();

		/**
		 * The meta object literal for the '<em><b>Dependencties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_WORKSPACE__DEPENDENCTIES = eINSTANCE.getEclipseWorkspace_Dependencties();

		/**
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.impl.NamedElementImpl
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__HANDLER = eINSTANCE.getNamedElement_Handler();

		/**
		 * The meta object literal for the '<em><b>Incoming Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__INCOMING_DEPENDENCIES = eINSTANCE.getNamedElement_IncomingDependencies();

		/**
		 * The meta object literal for the '<em><b>Outgoing Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__OUTGOING_DEPENDENCIES = eINSTANCE.getNamedElement_OutgoingDependencies();

		/**
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.impl.DependencyImpl
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__FROM = eINSTANCE.getDependency_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__TO = eINSTANCE.getDependency_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__TYPE = eINSTANCE.getDependency_Type();

		/**
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.impl.PackageFragmentRootImpl <em>Package Fragment Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.impl.PackageFragmentRootImpl
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getPackageFragmentRoot()
		 * @generated
		 */
		EClass PACKAGE_FRAGMENT_ROOT = eINSTANCE.getPackageFragmentRoot();

		/**
		 * The meta object literal for the '<em><b>Java Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_FRAGMENT_ROOT__JAVA_PROJECT = eINSTANCE.getPackageFragmentRoot_JavaProject();

		/**
		 * The meta object literal for the '<em><b>Package Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_FRAGMENT_ROOT__PACKAGE_FRAGMENTS = eINSTANCE.getPackageFragmentRoot_PackageFragments();

		/**
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.impl.PackageFragmentImpl <em>Package Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.impl.PackageFragmentImpl
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getPackageFragment()
		 * @generated
		 */
		EClass PACKAGE_FRAGMENT = eINSTANCE.getPackageFragment();

		/**
		 * The meta object literal for the '<em><b>Package Fragment Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_FRAGMENT__PACKAGE_FRAGMENT_ROOT = eINSTANCE.getPackageFragment_PackageFragmentRoot();

		/**
		 * The meta object literal for the '<em><b>Compilation Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_FRAGMENT__COMPILATION_UNITS = eINSTANCE.getPackageFragment_CompilationUnits();

		/**
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.impl.CompilationUnitImpl
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Package Fragment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__PACKAGE_FRAGMENT = eINSTANCE.getCompilationUnit_PackageFragment();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__TYPES = eINSTANCE.getCompilationUnit_Types();

		/**
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.impl.TypeImpl
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Compilation Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__COMPILATION_UNIT = eINSTANCE.getType_CompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__METHODS = eINSTANCE.getType_Methods();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__FIELDS = eINSTANCE.getType_Fields();

		/**
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.impl.MethodImpl
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__TYPE = eINSTANCE.getMethod_Type();

		/**
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.impl.FieldImpl
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link cern.devtools.depanalysis.wsmodel.DependencyType <em>Dependency Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cern.devtools.depanalysis.wsmodel.DependencyType
		 * @see cern.devtools.depanalysis.wsmodel.impl.JavaModelPackageImpl#getDependencyType()
		 * @generated
		 */
		EEnum DEPENDENCY_TYPE = eINSTANCE.getDependencyType();

	}

} //JavaModelPackage

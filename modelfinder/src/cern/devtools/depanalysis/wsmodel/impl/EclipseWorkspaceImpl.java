/**
 */
package cern.devtools.depanalysis.wsmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import cern.devtools.depanalysis.modelfinder.EmfModelUtils;
import cern.devtools.depanalysis.wsmodel.Dependency;
import cern.devtools.depanalysis.wsmodel.EclipseWorkspace;
import cern.devtools.depanalysis.wsmodel.JavaModelPackage;
import cern.devtools.depanalysis.wsmodel.JavaProject;
import cern.devtools.depanalysis.wsmodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eclipse Workspace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.EclipseWorkspaceImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.EclipseWorkspaceImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link cern.devtools.depanalysis.wsmodel.impl.EclipseWorkspaceImpl#getDependencties <em>Dependencties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EclipseWorkspaceImpl extends EObjectImpl implements EclipseWorkspace {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaProject> projects;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> elements;

	/**
	 * The cached value of the '{@link #getDependencties() <em>Dependencties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencties()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EclipseWorkspaceImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaModelPackage.Literals.ECLIPSE_WORKSPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaProject> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentWithInverseEList<JavaProject>(JavaProject.class, this, JavaModelPackage.ECLIPSE_WORKSPACE__PROJECTS, JavaModelPackage.JAVA_PROJECT__ECLIPSE_WORKSPACE);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, JavaModelPackage.ECLIPSE_WORKSPACE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependencties() {
		if (dependencties == null) {
			dependencties = new EObjectContainmentEList<Dependency>(Dependency.class, this, JavaModelPackage.ECLIPSE_WORKSPACE__DEPENDENCTIES);
		}
		return dependencties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaModelPackage.ECLIPSE_WORKSPACE__PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjects()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaModelPackage.ECLIPSE_WORKSPACE__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case JavaModelPackage.ECLIPSE_WORKSPACE__DEPENDENCTIES:
				return ((InternalEList<?>)getDependencties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaModelPackage.ECLIPSE_WORKSPACE__PROJECTS:
				return getProjects();
			case JavaModelPackage.ECLIPSE_WORKSPACE__ELEMENTS:
				return getElements();
			case JavaModelPackage.ECLIPSE_WORKSPACE__DEPENDENCTIES:
				return getDependencties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaModelPackage.ECLIPSE_WORKSPACE__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends JavaProject>)newValue);
				return;
			case JavaModelPackage.ECLIPSE_WORKSPACE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case JavaModelPackage.ECLIPSE_WORKSPACE__DEPENDENCTIES:
				getDependencties().clear();
				getDependencties().addAll((Collection<? extends Dependency>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaModelPackage.ECLIPSE_WORKSPACE__PROJECTS:
				getProjects().clear();
				return;
			case JavaModelPackage.ECLIPSE_WORKSPACE__ELEMENTS:
				getElements().clear();
				return;
			case JavaModelPackage.ECLIPSE_WORKSPACE__DEPENDENCTIES:
				getDependencties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaModelPackage.ECLIPSE_WORKSPACE__PROJECTS:
				return projects != null && !projects.isEmpty();
			case JavaModelPackage.ECLIPSE_WORKSPACE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case JavaModelPackage.ECLIPSE_WORKSPACE__DEPENDENCTIES:
				return dependencties != null && !dependencties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NamedElement findElementByHandle(String handle) {
		for (NamedElement e : getElements()) {
			if (handle.equals(e.getHandler())) {
				return e;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return EmfModelUtils.printModel(this);
	}

} //EclipseWorkspaceImpl

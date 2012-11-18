/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.impl;

import hu.bme.incquery.deps.repomodel.RDependency;
import hu.bme.incquery.deps.repomodel.RProject;
import hu.bme.incquery.deps.repomodel.RRepository;
import hu.bme.incquery.deps.repomodel.RepomodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RRepository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RRepositoryImpl#getRDependencies <em>RDependencies</em>}</li>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RRepositoryImpl#getRProjects <em>RProjects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RRepositoryImpl extends EObjectImpl implements RRepository {
	/**
	 * The cached value of the '{@link #getRDependencies() <em>RDependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<RDependency> rDependencies;

	/**
	 * The cached value of the '{@link #getRProjects() <em>RProjects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<RProject> rProjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepomodelPackage.Literals.RREPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDependency> getRDependencies() {
		if (rDependencies == null) {
			rDependencies = new EObjectContainmentEList<RDependency>(RDependency.class, this, RepomodelPackage.RREPOSITORY__RDEPENDENCIES);
		}
		return rDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RProject> getRProjects() {
		if (rProjects == null) {
			rProjects = new EObjectContainmentEList<RProject>(RProject.class, this, RepomodelPackage.RREPOSITORY__RPROJECTS);
		}
		return rProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepomodelPackage.RREPOSITORY__RDEPENDENCIES:
				return ((InternalEList<?>)getRDependencies()).basicRemove(otherEnd, msgs);
			case RepomodelPackage.RREPOSITORY__RPROJECTS:
				return ((InternalEList<?>)getRProjects()).basicRemove(otherEnd, msgs);
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
			case RepomodelPackage.RREPOSITORY__RDEPENDENCIES:
				return getRDependencies();
			case RepomodelPackage.RREPOSITORY__RPROJECTS:
				return getRProjects();
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
			case RepomodelPackage.RREPOSITORY__RDEPENDENCIES:
				getRDependencies().clear();
				getRDependencies().addAll((Collection<? extends RDependency>)newValue);
				return;
			case RepomodelPackage.RREPOSITORY__RPROJECTS:
				getRProjects().clear();
				getRProjects().addAll((Collection<? extends RProject>)newValue);
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
			case RepomodelPackage.RREPOSITORY__RDEPENDENCIES:
				getRDependencies().clear();
				return;
			case RepomodelPackage.RREPOSITORY__RPROJECTS:
				getRProjects().clear();
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
			case RepomodelPackage.RREPOSITORY__RDEPENDENCIES:
				return rDependencies != null && !rDependencies.isEmpty();
			case RepomodelPackage.RREPOSITORY__RPROJECTS:
				return rProjects != null && !rProjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RRepositoryImpl

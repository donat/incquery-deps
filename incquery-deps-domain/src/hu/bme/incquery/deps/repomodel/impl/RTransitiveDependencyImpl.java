/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.bme.incquery.deps.repomodel.impl;

import hu.bme.incquery.deps.repomodel.RDependency;
import hu.bme.incquery.deps.repomodel.RTransitiveDependency;
import hu.bme.incquery.deps.repomodel.RepomodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTransitive Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.incquery.deps.repomodel.impl.RTransitiveDependencyImpl#getRTtransitiveFrom <em>RTtransitive From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTransitiveDependencyImpl extends RDependencyImpl implements RTransitiveDependency {
	/**
	 * The cached value of the '{@link #getRTtransitiveFrom() <em>RTtransitive From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTtransitiveFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RDependency> rTtransitiveFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTransitiveDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepomodelPackage.Literals.RTRANSITIVE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDependency> getRTtransitiveFrom() {
		if (rTtransitiveFrom == null) {
			rTtransitiveFrom = new EObjectResolvingEList<RDependency>(RDependency.class, this, RepomodelPackage.RTRANSITIVE_DEPENDENCY__RTTRANSITIVE_FROM);
		}
		return rTtransitiveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepomodelPackage.RTRANSITIVE_DEPENDENCY__RTTRANSITIVE_FROM:
				return getRTtransitiveFrom();
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
			case RepomodelPackage.RTRANSITIVE_DEPENDENCY__RTTRANSITIVE_FROM:
				getRTtransitiveFrom().clear();
				getRTtransitiveFrom().addAll((Collection<? extends RDependency>)newValue);
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
			case RepomodelPackage.RTRANSITIVE_DEPENDENCY__RTTRANSITIVE_FROM:
				getRTtransitiveFrom().clear();
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
			case RepomodelPackage.RTRANSITIVE_DEPENDENCY__RTTRANSITIVE_FROM:
				return rTtransitiveFrom != null && !rTtransitiveFrom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RTransitiveDependencyImpl

/**
 */
package bscm.p2pnetwork.impl;

import bscm.p2pnetwork.NetworkTopology;
import bscm.p2pnetwork.P2PNetwork;
import bscm.p2pnetwork.P2pnetworkPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>P2P Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.impl.P2PNetworkImpl#getTopology <em>Topology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class P2PNetworkImpl extends EntityImpl implements P2PNetwork {
	/**
	 * The cached value of the '{@link #getTopology() <em>Topology</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopology()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkTopology> topology;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected P2PNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2pnetworkPackage.Literals.P2P_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NetworkTopology> getTopology() {
		if (topology == null) {
			topology = new EObjectContainmentEList<NetworkTopology>(NetworkTopology.class, this, P2pnetworkPackage.P2P_NETWORK__TOPOLOGY);
		}
		return topology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case P2pnetworkPackage.P2P_NETWORK__TOPOLOGY:
				return ((InternalEList<?>)getTopology()).basicRemove(otherEnd, msgs);
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
			case P2pnetworkPackage.P2P_NETWORK__TOPOLOGY:
				return getTopology();
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
			case P2pnetworkPackage.P2P_NETWORK__TOPOLOGY:
				getTopology().clear();
				getTopology().addAll((Collection<? extends NetworkTopology>)newValue);
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
			case P2pnetworkPackage.P2P_NETWORK__TOPOLOGY:
				getTopology().clear();
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
			case P2pnetworkPackage.P2P_NETWORK__TOPOLOGY:
				return topology != null && !topology.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //P2PNetworkImpl

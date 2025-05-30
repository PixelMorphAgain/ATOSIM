/**
 */
package bscm.p2pnetwork.impl;

import bscm.p2pnetwork.NetworkTopology;
import bscm.p2pnetwork.P2pnetworkPackage;

import org.eclipse.emf.ecore.EClass;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Topology</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NetworkTopologyImpl extends EntityImpl implements NetworkTopology {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkTopologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2pnetworkPackage.Literals.NETWORK_TOPOLOGY;
	}

} //NetworkTopologyImpl

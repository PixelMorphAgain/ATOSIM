/**
 */
package bscm.p2pnetwork;

import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>P2P Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.P2PNetwork#getTopology <em>Topology</em>}</li>
 * </ul>
 *
 * @see bscm.p2pnetwork.P2pnetworkPackage#getP2PNetwork()
 * @model
 * @generated
 */
public interface P2PNetwork extends Entity {
	/**
	 * Returns the value of the '<em><b>Topology</b></em>' containment reference list.
	 * The list contents are of type {@link bscm.p2pnetwork.NetworkTopology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology</em>' containment reference list.
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getP2PNetwork_Topology()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkTopology> getTopology();

} // P2PNetwork

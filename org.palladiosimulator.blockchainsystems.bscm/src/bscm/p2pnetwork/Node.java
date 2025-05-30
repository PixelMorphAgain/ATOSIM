/**
 */
package bscm.p2pnetwork;

import bscm.nodeallocation.NodeAllocation;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.Node#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @see bscm.p2pnetwork.P2pnetworkPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Entity {
	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' reference.
	 * @see #setAllocation(NodeAllocation)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getNode_Allocation()
	 * @model required="true"
	 * @generated
	 */
	NodeAllocation getAllocation();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.Node#getAllocation <em>Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' reference.
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(NodeAllocation value);

} // Node

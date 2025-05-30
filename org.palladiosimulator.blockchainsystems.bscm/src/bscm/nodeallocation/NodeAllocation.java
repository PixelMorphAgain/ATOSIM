/**
 */
package bscm.nodeallocation;

import bscm.nodeenvironment.NodeEnvironment;

import bscm.nodegeographicalenvironment.NodeGeographicalEnvironment;

import bscm.nodesystem.BlockchainSystemNodeSystem;

import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.nodeallocation.NodeAllocation#getAllocationContexts <em>Allocation Contexts</em>}</li>
 *   <li>{@link bscm.nodeallocation.NodeAllocation#getNodeAllocationEnvironment <em>Node Allocation Environment</em>}</li>
 *   <li>{@link bscm.nodeallocation.NodeAllocation#getNodeSystem <em>Node System</em>}</li>
 *   <li>{@link bscm.nodeallocation.NodeAllocation#getNodeGeographicalEnvironment <em>Node Geographical Environment</em>}</li>
 * </ul>
 *
 * @see bscm.nodeallocation.NodeallocationPackage#getNodeAllocation()
 * @model
 * @generated
 */
public interface NodeAllocation extends Entity {
	/**
	 * Returns the value of the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link bscm.nodeallocation.NodeAllocationContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts</em>' containment reference list.
	 * @see bscm.nodeallocation.NodeallocationPackage#getNodeAllocation_AllocationContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeAllocationContext> getAllocationContexts();

	/**
	 * Returns the value of the '<em><b>Node Allocation Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Allocation Environment</em>' reference.
	 * @see #setNodeAllocationEnvironment(NodeEnvironment)
	 * @see bscm.nodeallocation.NodeallocationPackage#getNodeAllocation_NodeAllocationEnvironment()
	 * @model required="true"
	 * @generated
	 */
	NodeEnvironment getNodeAllocationEnvironment();

	/**
	 * Sets the value of the '{@link bscm.nodeallocation.NodeAllocation#getNodeAllocationEnvironment <em>Node Allocation Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Allocation Environment</em>' reference.
	 * @see #getNodeAllocationEnvironment()
	 * @generated
	 */
	void setNodeAllocationEnvironment(NodeEnvironment value);

	/**
	 * Returns the value of the '<em><b>Node System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node System</em>' reference.
	 * @see #setNodeSystem(BlockchainSystemNodeSystem)
	 * @see bscm.nodeallocation.NodeallocationPackage#getNodeAllocation_NodeSystem()
	 * @model required="true"
	 * @generated
	 */
	BlockchainSystemNodeSystem getNodeSystem();

	/**
	 * Sets the value of the '{@link bscm.nodeallocation.NodeAllocation#getNodeSystem <em>Node System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node System</em>' reference.
	 * @see #getNodeSystem()
	 * @generated
	 */
	void setNodeSystem(BlockchainSystemNodeSystem value);

	/**
	 * Returns the value of the '<em><b>Node Geographical Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Geographical Environment</em>' reference.
	 * @see #setNodeGeographicalEnvironment(NodeGeographicalEnvironment)
	 * @see bscm.nodeallocation.NodeallocationPackage#getNodeAllocation_NodeGeographicalEnvironment()
	 * @model required="true"
	 * @generated
	 */
	NodeGeographicalEnvironment getNodeGeographicalEnvironment();

	/**
	 * Sets the value of the '{@link bscm.nodeallocation.NodeAllocation#getNodeGeographicalEnvironment <em>Node Geographical Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Geographical Environment</em>' reference.
	 * @see #getNodeGeographicalEnvironment()
	 * @generated
	 */
	void setNodeGeographicalEnvironment(NodeGeographicalEnvironment value);

} // NodeAllocation

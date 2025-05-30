/**
 */
package bscm.nodeallocation;

import bscm.nodeenvironment.NodeResourceContainer;

import bscm.nodegeographicalenvironment.NodeGeographicalRegionSpecification;

import bscm.nodesystem.BlockchainSystemNodeAssemblyContext;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.nodeallocation.NodeAllocationContext#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link bscm.nodeallocation.NodeAllocationContext#getResourceContainer <em>Resource Container</em>}</li>
 *   <li>{@link bscm.nodeallocation.NodeAllocationContext#getNodeGeographicalRegionSpecification <em>Node Geographical Region Specification</em>}</li>
 * </ul>
 *
 * @see bscm.nodeallocation.NodeallocationPackage#getNodeAllocationContext()
 * @model
 * @generated
 */
public interface NodeAllocationContext extends Entity {
	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(BlockchainSystemNodeAssemblyContext)
	 * @see bscm.nodeallocation.NodeallocationPackage#getNodeAllocationContext_AssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	BlockchainSystemNodeAssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link bscm.nodeallocation.NodeAllocationContext#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(BlockchainSystemNodeAssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference.
	 * @see #setResourceContainer(NodeResourceContainer)
	 * @see bscm.nodeallocation.NodeallocationPackage#getNodeAllocationContext_ResourceContainer()
	 * @model required="true"
	 * @generated
	 */
	NodeResourceContainer getResourceContainer();

	/**
	 * Sets the value of the '{@link bscm.nodeallocation.NodeAllocationContext#getResourceContainer <em>Resource Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container</em>' reference.
	 * @see #getResourceContainer()
	 * @generated
	 */
	void setResourceContainer(NodeResourceContainer value);

	/**
	 * Returns the value of the '<em><b>Node Geographical Region Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Geographical Region Specification</em>' reference.
	 * @see #setNodeGeographicalRegionSpecification(NodeGeographicalRegionSpecification)
	 * @see bscm.nodeallocation.NodeallocationPackage#getNodeAllocationContext_NodeGeographicalRegionSpecification()
	 * @model required="true"
	 * @generated
	 */
	NodeGeographicalRegionSpecification getNodeGeographicalRegionSpecification();

	/**
	 * Sets the value of the '{@link bscm.nodeallocation.NodeAllocationContext#getNodeGeographicalRegionSpecification <em>Node Geographical Region Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Geographical Region Specification</em>' reference.
	 * @see #getNodeGeographicalRegionSpecification()
	 * @generated
	 */
	void setNodeGeographicalRegionSpecification(NodeGeographicalRegionSpecification value);

} // NodeAllocationContext

/**
 */
package bscm.nodeallocation.impl;

import bscm.nodeallocation.NodeAllocationContext;
import bscm.nodeallocation.NodeallocationPackage;

import bscm.nodeenvironment.NodeResourceContainer;

import bscm.nodegeographicalenvironment.NodeGeographicalRegionSpecification;

import bscm.nodesystem.BlockchainSystemNodeAssemblyContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.nodeallocation.impl.NodeAllocationContextImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link bscm.nodeallocation.impl.NodeAllocationContextImpl#getResourceContainer <em>Resource Container</em>}</li>
 *   <li>{@link bscm.nodeallocation.impl.NodeAllocationContextImpl#getNodeGeographicalRegionSpecification <em>Node Geographical Region Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeAllocationContextImpl extends EntityImpl implements NodeAllocationContext {
	/**
	 * The cached value of the '{@link #getAssemblyContext() <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected BlockchainSystemNodeAssemblyContext assemblyContext;

	/**
	 * The cached value of the '{@link #getResourceContainer() <em>Resource Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected NodeResourceContainer resourceContainer;

	/**
	 * The cached value of the '{@link #getNodeGeographicalRegionSpecification() <em>Node Geographical Region Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeGeographicalRegionSpecification()
	 * @generated
	 * @ordered
	 */
	protected NodeGeographicalRegionSpecification nodeGeographicalRegionSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeAllocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodeallocationPackage.Literals.NODE_ALLOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockchainSystemNodeAssemblyContext getAssemblyContext() {
		if (assemblyContext != null && assemblyContext.eIsProxy()) {
			InternalEObject oldAssemblyContext = (InternalEObject)assemblyContext;
			assemblyContext = (BlockchainSystemNodeAssemblyContext)eResolveProxy(oldAssemblyContext);
			if (assemblyContext != oldAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodeallocationPackage.NODE_ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, oldAssemblyContext, assemblyContext));
			}
		}
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainSystemNodeAssemblyContext basicGetAssemblyContext() {
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssemblyContext(BlockchainSystemNodeAssemblyContext newAssemblyContext) {
		BlockchainSystemNodeAssemblyContext oldAssemblyContext = assemblyContext;
		assemblyContext = newAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodeallocationPackage.NODE_ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, oldAssemblyContext, assemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeResourceContainer getResourceContainer() {
		if (resourceContainer != null && resourceContainer.eIsProxy()) {
			InternalEObject oldResourceContainer = (InternalEObject)resourceContainer;
			resourceContainer = (NodeResourceContainer)eResolveProxy(oldResourceContainer);
			if (resourceContainer != oldResourceContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodeallocationPackage.NODE_ALLOCATION_CONTEXT__RESOURCE_CONTAINER, oldResourceContainer, resourceContainer));
			}
		}
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeResourceContainer basicGetResourceContainer() {
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceContainer(NodeResourceContainer newResourceContainer) {
		NodeResourceContainer oldResourceContainer = resourceContainer;
		resourceContainer = newResourceContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodeallocationPackage.NODE_ALLOCATION_CONTEXT__RESOURCE_CONTAINER, oldResourceContainer, resourceContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeGeographicalRegionSpecification getNodeGeographicalRegionSpecification() {
		if (nodeGeographicalRegionSpecification != null && nodeGeographicalRegionSpecification.eIsProxy()) {
			InternalEObject oldNodeGeographicalRegionSpecification = (InternalEObject)nodeGeographicalRegionSpecification;
			nodeGeographicalRegionSpecification = (NodeGeographicalRegionSpecification)eResolveProxy(oldNodeGeographicalRegionSpecification);
			if (nodeGeographicalRegionSpecification != oldNodeGeographicalRegionSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodeallocationPackage.NODE_ALLOCATION_CONTEXT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION, oldNodeGeographicalRegionSpecification, nodeGeographicalRegionSpecification));
			}
		}
		return nodeGeographicalRegionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeGeographicalRegionSpecification basicGetNodeGeographicalRegionSpecification() {
		return nodeGeographicalRegionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeGeographicalRegionSpecification(NodeGeographicalRegionSpecification newNodeGeographicalRegionSpecification) {
		NodeGeographicalRegionSpecification oldNodeGeographicalRegionSpecification = nodeGeographicalRegionSpecification;
		nodeGeographicalRegionSpecification = newNodeGeographicalRegionSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodeallocationPackage.NODE_ALLOCATION_CONTEXT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION, oldNodeGeographicalRegionSpecification, nodeGeographicalRegionSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
				if (resolve) return getAssemblyContext();
				return basicGetAssemblyContext();
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__RESOURCE_CONTAINER:
				if (resolve) return getResourceContainer();
				return basicGetResourceContainer();
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION:
				if (resolve) return getNodeGeographicalRegionSpecification();
				return basicGetNodeGeographicalRegionSpecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
				setAssemblyContext((BlockchainSystemNodeAssemblyContext)newValue);
				return;
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__RESOURCE_CONTAINER:
				setResourceContainer((NodeResourceContainer)newValue);
				return;
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION:
				setNodeGeographicalRegionSpecification((NodeGeographicalRegionSpecification)newValue);
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
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
				setAssemblyContext((BlockchainSystemNodeAssemblyContext)null);
				return;
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__RESOURCE_CONTAINER:
				setResourceContainer((NodeResourceContainer)null);
				return;
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION:
				setNodeGeographicalRegionSpecification((NodeGeographicalRegionSpecification)null);
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
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
				return assemblyContext != null;
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__RESOURCE_CONTAINER:
				return resourceContainer != null;
			case NodeallocationPackage.NODE_ALLOCATION_CONTEXT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION:
				return nodeGeographicalRegionSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeAllocationContextImpl

/**
 */
package bscm.nodeallocation.impl;

import bscm.nodeallocation.NodeAllocation;
import bscm.nodeallocation.NodeAllocationContext;
import bscm.nodeallocation.NodeallocationPackage;

import bscm.nodeenvironment.NodeEnvironment;

import bscm.nodegeographicalenvironment.NodeGeographicalEnvironment;

import bscm.nodesystem.BlockchainSystemNodeSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.nodeallocation.impl.NodeAllocationImpl#getAllocationContexts <em>Allocation Contexts</em>}</li>
 *   <li>{@link bscm.nodeallocation.impl.NodeAllocationImpl#getNodeAllocationEnvironment <em>Node Allocation Environment</em>}</li>
 *   <li>{@link bscm.nodeallocation.impl.NodeAllocationImpl#getNodeSystem <em>Node System</em>}</li>
 *   <li>{@link bscm.nodeallocation.impl.NodeAllocationImpl#getNodeGeographicalEnvironment <em>Node Geographical Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeAllocationImpl extends EntityImpl implements NodeAllocation {
	/**
	 * The cached value of the '{@link #getAllocationContexts() <em>Allocation Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeAllocationContext> allocationContexts;

	/**
	 * The cached value of the '{@link #getNodeAllocationEnvironment() <em>Node Allocation Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeAllocationEnvironment()
	 * @generated
	 * @ordered
	 */
	protected NodeEnvironment nodeAllocationEnvironment;

	/**
	 * The cached value of the '{@link #getNodeSystem() <em>Node System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeSystem()
	 * @generated
	 * @ordered
	 */
	protected BlockchainSystemNodeSystem nodeSystem;

	/**
	 * The cached value of the '{@link #getNodeGeographicalEnvironment() <em>Node Geographical Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeGeographicalEnvironment()
	 * @generated
	 * @ordered
	 */
	protected NodeGeographicalEnvironment nodeGeographicalEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodeallocationPackage.Literals.NODE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NodeAllocationContext> getAllocationContexts() {
		if (allocationContexts == null) {
			allocationContexts = new EObjectContainmentEList<NodeAllocationContext>(NodeAllocationContext.class, this, NodeallocationPackage.NODE_ALLOCATION__ALLOCATION_CONTEXTS);
		}
		return allocationContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeEnvironment getNodeAllocationEnvironment() {
		if (nodeAllocationEnvironment != null && nodeAllocationEnvironment.eIsProxy()) {
			InternalEObject oldNodeAllocationEnvironment = (InternalEObject)nodeAllocationEnvironment;
			nodeAllocationEnvironment = (NodeEnvironment)eResolveProxy(oldNodeAllocationEnvironment);
			if (nodeAllocationEnvironment != oldNodeAllocationEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodeallocationPackage.NODE_ALLOCATION__NODE_ALLOCATION_ENVIRONMENT, oldNodeAllocationEnvironment, nodeAllocationEnvironment));
			}
		}
		return nodeAllocationEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeEnvironment basicGetNodeAllocationEnvironment() {
		return nodeAllocationEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeAllocationEnvironment(NodeEnvironment newNodeAllocationEnvironment) {
		NodeEnvironment oldNodeAllocationEnvironment = nodeAllocationEnvironment;
		nodeAllocationEnvironment = newNodeAllocationEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodeallocationPackage.NODE_ALLOCATION__NODE_ALLOCATION_ENVIRONMENT, oldNodeAllocationEnvironment, nodeAllocationEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockchainSystemNodeSystem getNodeSystem() {
		if (nodeSystem != null && nodeSystem.eIsProxy()) {
			InternalEObject oldNodeSystem = (InternalEObject)nodeSystem;
			nodeSystem = (BlockchainSystemNodeSystem)eResolveProxy(oldNodeSystem);
			if (nodeSystem != oldNodeSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodeallocationPackage.NODE_ALLOCATION__NODE_SYSTEM, oldNodeSystem, nodeSystem));
			}
		}
		return nodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainSystemNodeSystem basicGetNodeSystem() {
		return nodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeSystem(BlockchainSystemNodeSystem newNodeSystem) {
		BlockchainSystemNodeSystem oldNodeSystem = nodeSystem;
		nodeSystem = newNodeSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodeallocationPackage.NODE_ALLOCATION__NODE_SYSTEM, oldNodeSystem, nodeSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeGeographicalEnvironment getNodeGeographicalEnvironment() {
		if (nodeGeographicalEnvironment != null && nodeGeographicalEnvironment.eIsProxy()) {
			InternalEObject oldNodeGeographicalEnvironment = (InternalEObject)nodeGeographicalEnvironment;
			nodeGeographicalEnvironment = (NodeGeographicalEnvironment)eResolveProxy(oldNodeGeographicalEnvironment);
			if (nodeGeographicalEnvironment != oldNodeGeographicalEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodeallocationPackage.NODE_ALLOCATION__NODE_GEOGRAPHICAL_ENVIRONMENT, oldNodeGeographicalEnvironment, nodeGeographicalEnvironment));
			}
		}
		return nodeGeographicalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeGeographicalEnvironment basicGetNodeGeographicalEnvironment() {
		return nodeGeographicalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeGeographicalEnvironment(NodeGeographicalEnvironment newNodeGeographicalEnvironment) {
		NodeGeographicalEnvironment oldNodeGeographicalEnvironment = nodeGeographicalEnvironment;
		nodeGeographicalEnvironment = newNodeGeographicalEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodeallocationPackage.NODE_ALLOCATION__NODE_GEOGRAPHICAL_ENVIRONMENT, oldNodeGeographicalEnvironment, nodeGeographicalEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NodeallocationPackage.NODE_ALLOCATION__ALLOCATION_CONTEXTS:
				return ((InternalEList<?>)getAllocationContexts()).basicRemove(otherEnd, msgs);
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
			case NodeallocationPackage.NODE_ALLOCATION__ALLOCATION_CONTEXTS:
				return getAllocationContexts();
			case NodeallocationPackage.NODE_ALLOCATION__NODE_ALLOCATION_ENVIRONMENT:
				if (resolve) return getNodeAllocationEnvironment();
				return basicGetNodeAllocationEnvironment();
			case NodeallocationPackage.NODE_ALLOCATION__NODE_SYSTEM:
				if (resolve) return getNodeSystem();
				return basicGetNodeSystem();
			case NodeallocationPackage.NODE_ALLOCATION__NODE_GEOGRAPHICAL_ENVIRONMENT:
				if (resolve) return getNodeGeographicalEnvironment();
				return basicGetNodeGeographicalEnvironment();
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
			case NodeallocationPackage.NODE_ALLOCATION__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				getAllocationContexts().addAll((Collection<? extends NodeAllocationContext>)newValue);
				return;
			case NodeallocationPackage.NODE_ALLOCATION__NODE_ALLOCATION_ENVIRONMENT:
				setNodeAllocationEnvironment((NodeEnvironment)newValue);
				return;
			case NodeallocationPackage.NODE_ALLOCATION__NODE_SYSTEM:
				setNodeSystem((BlockchainSystemNodeSystem)newValue);
				return;
			case NodeallocationPackage.NODE_ALLOCATION__NODE_GEOGRAPHICAL_ENVIRONMENT:
				setNodeGeographicalEnvironment((NodeGeographicalEnvironment)newValue);
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
			case NodeallocationPackage.NODE_ALLOCATION__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				return;
			case NodeallocationPackage.NODE_ALLOCATION__NODE_ALLOCATION_ENVIRONMENT:
				setNodeAllocationEnvironment((NodeEnvironment)null);
				return;
			case NodeallocationPackage.NODE_ALLOCATION__NODE_SYSTEM:
				setNodeSystem((BlockchainSystemNodeSystem)null);
				return;
			case NodeallocationPackage.NODE_ALLOCATION__NODE_GEOGRAPHICAL_ENVIRONMENT:
				setNodeGeographicalEnvironment((NodeGeographicalEnvironment)null);
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
			case NodeallocationPackage.NODE_ALLOCATION__ALLOCATION_CONTEXTS:
				return allocationContexts != null && !allocationContexts.isEmpty();
			case NodeallocationPackage.NODE_ALLOCATION__NODE_ALLOCATION_ENVIRONMENT:
				return nodeAllocationEnvironment != null;
			case NodeallocationPackage.NODE_ALLOCATION__NODE_SYSTEM:
				return nodeSystem != null;
			case NodeallocationPackage.NODE_ALLOCATION__NODE_GEOGRAPHICAL_ENVIRONMENT:
				return nodeGeographicalEnvironment != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeAllocationImpl

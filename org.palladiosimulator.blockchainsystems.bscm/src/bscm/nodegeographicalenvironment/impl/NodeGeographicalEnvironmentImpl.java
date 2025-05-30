/**
 */
package bscm.nodegeographicalenvironment.impl;

import bscm.nodegeographicalenvironment.NodeGeographicalEnvironment;
import bscm.nodegeographicalenvironment.NodeGeographicalRegionSpecification;
import bscm.nodegeographicalenvironment.NodegeographicalenvironmentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Geographical Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.nodegeographicalenvironment.impl.NodeGeographicalEnvironmentImpl#getNodeGeographicalRegionSpecification <em>Node Geographical Region Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeGeographicalEnvironmentImpl extends MinimalEObjectImpl.Container implements NodeGeographicalEnvironment {
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
	protected NodeGeographicalEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodegeographicalenvironmentPackage.Literals.NODE_GEOGRAPHICAL_ENVIRONMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodegeographicalenvironmentPackage.NODE_GEOGRAPHICAL_ENVIRONMENT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION, oldNodeGeographicalRegionSpecification, nodeGeographicalRegionSpecification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NodegeographicalenvironmentPackage.NODE_GEOGRAPHICAL_ENVIRONMENT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION, oldNodeGeographicalRegionSpecification, nodeGeographicalRegionSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NodegeographicalenvironmentPackage.NODE_GEOGRAPHICAL_ENVIRONMENT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION:
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
			case NodegeographicalenvironmentPackage.NODE_GEOGRAPHICAL_ENVIRONMENT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION:
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
			case NodegeographicalenvironmentPackage.NODE_GEOGRAPHICAL_ENVIRONMENT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION:
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
			case NodegeographicalenvironmentPackage.NODE_GEOGRAPHICAL_ENVIRONMENT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION:
				return nodeGeographicalRegionSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeGeographicalEnvironmentImpl

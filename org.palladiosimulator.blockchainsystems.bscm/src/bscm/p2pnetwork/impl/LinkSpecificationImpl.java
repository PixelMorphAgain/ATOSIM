/**
 */
package bscm.p2pnetwork.impl;

import bscm.p2pnetwork.LinkLatencySpecification;
import bscm.p2pnetwork.LinkSpecification;
import bscm.p2pnetwork.LinkThroughputSpecification;
import bscm.p2pnetwork.P2pnetworkPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.impl.LinkSpecificationImpl#getLatencySpecification <em>Latency Specification</em>}</li>
 *   <li>{@link bscm.p2pnetwork.impl.LinkSpecificationImpl#getThroughputSpecification <em>Throughput Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkSpecificationImpl extends EntityImpl implements LinkSpecification {
	/**
	 * The cached value of the '{@link #getLatencySpecification() <em>Latency Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencySpecification()
	 * @generated
	 * @ordered
	 */
	protected LinkLatencySpecification latencySpecification;

	/**
	 * The cached value of the '{@link #getThroughputSpecification() <em>Throughput Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputSpecification()
	 * @generated
	 * @ordered
	 */
	protected LinkThroughputSpecification throughputSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2pnetworkPackage.Literals.LINK_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkLatencySpecification getLatencySpecification() {
		if (latencySpecification != null && latencySpecification.eIsProxy()) {
			InternalEObject oldLatencySpecification = (InternalEObject)latencySpecification;
			latencySpecification = (LinkLatencySpecification)eResolveProxy(oldLatencySpecification);
			if (latencySpecification != oldLatencySpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, P2pnetworkPackage.LINK_SPECIFICATION__LATENCY_SPECIFICATION, oldLatencySpecification, latencySpecification));
			}
		}
		return latencySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkLatencySpecification basicGetLatencySpecification() {
		return latencySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatencySpecification(LinkLatencySpecification newLatencySpecification) {
		LinkLatencySpecification oldLatencySpecification = latencySpecification;
		latencySpecification = newLatencySpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.LINK_SPECIFICATION__LATENCY_SPECIFICATION, oldLatencySpecification, latencySpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkThroughputSpecification getThroughputSpecification() {
		if (throughputSpecification != null && throughputSpecification.eIsProxy()) {
			InternalEObject oldThroughputSpecification = (InternalEObject)throughputSpecification;
			throughputSpecification = (LinkThroughputSpecification)eResolveProxy(oldThroughputSpecification);
			if (throughputSpecification != oldThroughputSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, P2pnetworkPackage.LINK_SPECIFICATION__THROUGHPUT_SPECIFICATION, oldThroughputSpecification, throughputSpecification));
			}
		}
		return throughputSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkThroughputSpecification basicGetThroughputSpecification() {
		return throughputSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThroughputSpecification(LinkThroughputSpecification newThroughputSpecification) {
		LinkThroughputSpecification oldThroughputSpecification = throughputSpecification;
		throughputSpecification = newThroughputSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.LINK_SPECIFICATION__THROUGHPUT_SPECIFICATION, oldThroughputSpecification, throughputSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case P2pnetworkPackage.LINK_SPECIFICATION__LATENCY_SPECIFICATION:
				if (resolve) return getLatencySpecification();
				return basicGetLatencySpecification();
			case P2pnetworkPackage.LINK_SPECIFICATION__THROUGHPUT_SPECIFICATION:
				if (resolve) return getThroughputSpecification();
				return basicGetThroughputSpecification();
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
			case P2pnetworkPackage.LINK_SPECIFICATION__LATENCY_SPECIFICATION:
				setLatencySpecification((LinkLatencySpecification)newValue);
				return;
			case P2pnetworkPackage.LINK_SPECIFICATION__THROUGHPUT_SPECIFICATION:
				setThroughputSpecification((LinkThroughputSpecification)newValue);
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
			case P2pnetworkPackage.LINK_SPECIFICATION__LATENCY_SPECIFICATION:
				setLatencySpecification((LinkLatencySpecification)null);
				return;
			case P2pnetworkPackage.LINK_SPECIFICATION__THROUGHPUT_SPECIFICATION:
				setThroughputSpecification((LinkThroughputSpecification)null);
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
			case P2pnetworkPackage.LINK_SPECIFICATION__LATENCY_SPECIFICATION:
				return latencySpecification != null;
			case P2pnetworkPackage.LINK_SPECIFICATION__THROUGHPUT_SPECIFICATION:
				return throughputSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkSpecificationImpl

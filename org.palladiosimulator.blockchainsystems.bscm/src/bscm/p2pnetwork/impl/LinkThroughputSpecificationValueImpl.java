/**
 */
package bscm.p2pnetwork.impl;

import bscm.p2pnetwork.LinkThroughputSpecificationValue;
import bscm.p2pnetwork.P2pnetworkPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Throughput Specification Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.impl.LinkThroughputSpecificationValueImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link bscm.p2pnetwork.impl.LinkThroughputSpecificationValueImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkThroughputSpecificationValueImpl extends MinimalEObjectImpl.Container implements LinkThroughputSpecificationValue {
	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final int THROUGHPUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected int throughput = THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkThroughputSpecificationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2pnetworkPackage.Literals.LINK_THROUGHPUT_SPECIFICATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThroughput(int newThroughput) {
		int oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE__THROUGHPUT, oldThroughput, throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE__THROUGHPUT:
				return getThroughput();
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE__PROBABILITY:
				return getProbability();
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
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE__THROUGHPUT:
				setThroughput((Integer)newValue);
				return;
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE__PROBABILITY:
				setProbability((Double)newValue);
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
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE__THROUGHPUT:
				setThroughput(THROUGHPUT_EDEFAULT);
				return;
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
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
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE__THROUGHPUT:
				return throughput != THROUGHPUT_EDEFAULT;
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Throughput: ");
		result.append(throughput);
		result.append(", Probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //LinkThroughputSpecificationValueImpl

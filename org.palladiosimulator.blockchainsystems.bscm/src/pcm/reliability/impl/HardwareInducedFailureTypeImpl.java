/**
 */
package pcm.reliability.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.reliability.HardwareInducedFailureType;
import pcm.reliability.ReliabilityPackage;

import pcm.resourcetype.ProcessingResourceType;
import pcm.resourcetype.ResourcetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.reliability.impl.HardwareInducedFailureTypeImpl#getProcessingResourceType__HardwareInducedFailureType <em>Processing Resource Type Hardware Induced Failure Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareInducedFailureTypeImpl extends FailureTypeImpl implements HardwareInducedFailureType {
	/**
	 * The cached value of the '{@link #getProcessingResourceType__HardwareInducedFailureType() <em>Processing Resource Type Hardware Induced Failure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingResourceType__HardwareInducedFailureType()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceType processingResourceType__HardwareInducedFailureType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareInducedFailureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReliabilityPackage.Literals.HARDWARE_INDUCED_FAILURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingResourceType getProcessingResourceType__HardwareInducedFailureType() {
		if (processingResourceType__HardwareInducedFailureType != null && processingResourceType__HardwareInducedFailureType.eIsProxy()) {
			InternalEObject oldProcessingResourceType__HardwareInducedFailureType = (InternalEObject)processingResourceType__HardwareInducedFailureType;
			processingResourceType__HardwareInducedFailureType = (ProcessingResourceType)eResolveProxy(oldProcessingResourceType__HardwareInducedFailureType);
			if (processingResourceType__HardwareInducedFailureType != oldProcessingResourceType__HardwareInducedFailureType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE, oldProcessingResourceType__HardwareInducedFailureType, processingResourceType__HardwareInducedFailureType));
			}
		}
		return processingResourceType__HardwareInducedFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType basicGetProcessingResourceType__HardwareInducedFailureType() {
		return processingResourceType__HardwareInducedFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingResourceType__HardwareInducedFailureType(ProcessingResourceType newProcessingResourceType__HardwareInducedFailureType, NotificationChain msgs) {
		ProcessingResourceType oldProcessingResourceType__HardwareInducedFailureType = processingResourceType__HardwareInducedFailureType;
		processingResourceType__HardwareInducedFailureType = newProcessingResourceType__HardwareInducedFailureType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE, oldProcessingResourceType__HardwareInducedFailureType, newProcessingResourceType__HardwareInducedFailureType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessingResourceType__HardwareInducedFailureType(ProcessingResourceType newProcessingResourceType__HardwareInducedFailureType) {
		if (newProcessingResourceType__HardwareInducedFailureType != processingResourceType__HardwareInducedFailureType) {
			NotificationChain msgs = null;
			if (processingResourceType__HardwareInducedFailureType != null)
				msgs = ((InternalEObject)processingResourceType__HardwareInducedFailureType).eInverseRemove(this, ResourcetypePackage.PROCESSING_RESOURCE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_PROCESSING_RESOURCE_TYPE, ProcessingResourceType.class, msgs);
			if (newProcessingResourceType__HardwareInducedFailureType != null)
				msgs = ((InternalEObject)newProcessingResourceType__HardwareInducedFailureType).eInverseAdd(this, ResourcetypePackage.PROCESSING_RESOURCE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_PROCESSING_RESOURCE_TYPE, ProcessingResourceType.class, msgs);
			msgs = basicSetProcessingResourceType__HardwareInducedFailureType(newProcessingResourceType__HardwareInducedFailureType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE, newProcessingResourceType__HardwareInducedFailureType, newProcessingResourceType__HardwareInducedFailureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
				if (processingResourceType__HardwareInducedFailureType != null)
					msgs = ((InternalEObject)processingResourceType__HardwareInducedFailureType).eInverseRemove(this, ResourcetypePackage.PROCESSING_RESOURCE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_PROCESSING_RESOURCE_TYPE, ProcessingResourceType.class, msgs);
				return basicSetProcessingResourceType__HardwareInducedFailureType((ProcessingResourceType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
				return basicSetProcessingResourceType__HardwareInducedFailureType(null, msgs);
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
			case ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
				if (resolve) return getProcessingResourceType__HardwareInducedFailureType();
				return basicGetProcessingResourceType__HardwareInducedFailureType();
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
			case ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
				setProcessingResourceType__HardwareInducedFailureType((ProcessingResourceType)newValue);
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
			case ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
				setProcessingResourceType__HardwareInducedFailureType((ProcessingResourceType)null);
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
			case ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE:
				return processingResourceType__HardwareInducedFailureType != null;
		}
		return super.eIsSet(featureID);
	}

} //HardwareInducedFailureTypeImpl

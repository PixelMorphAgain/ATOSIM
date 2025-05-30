/**
 */
package pcm.resourceenvironment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.PCMRandomVariable;

import pcm.resourceenvironment.HDDProcessingResourceSpecification;
import pcm.resourceenvironment.ResourceContainer;
import pcm.resourceenvironment.ResourceenvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HDD Processing Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.resourceenvironment.impl.HDDProcessingResourceSpecificationImpl#getWriteProcessingRate <em>Write Processing Rate</em>}</li>
 *   <li>{@link pcm.resourceenvironment.impl.HDDProcessingResourceSpecificationImpl#getReadProcessingRate <em>Read Processing Rate</em>}</li>
 *   <li>{@link pcm.resourceenvironment.impl.HDDProcessingResourceSpecificationImpl#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HDDProcessingResourceSpecificationImpl extends ProcessingResourceSpecificationImpl implements HDDProcessingResourceSpecification {
	/**
	 * The cached value of the '{@link #getWriteProcessingRate() <em>Write Processing Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable writeProcessingRate;

	/**
	 * The cached value of the '{@link #getReadProcessingRate() <em>Read Processing Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadProcessingRate()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable readProcessingRate;

	/**
	 * The cached value of the '{@link #getResourceContainer() <em>Resource Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected ResourceContainer resourceContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDDProcessingResourceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceenvironmentPackage.Literals.HDD_PROCESSING_RESOURCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMRandomVariable getWriteProcessingRate() {
		return writeProcessingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteProcessingRate(PCMRandomVariable newWriteProcessingRate, NotificationChain msgs) {
		PCMRandomVariable oldWriteProcessingRate = writeProcessingRate;
		writeProcessingRate = newWriteProcessingRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE, oldWriteProcessingRate, newWriteProcessingRate);
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
	public void setWriteProcessingRate(PCMRandomVariable newWriteProcessingRate) {
		if (newWriteProcessingRate != writeProcessingRate) {
			NotificationChain msgs = null;
			if (writeProcessingRate != null)
				msgs = ((InternalEObject)writeProcessingRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE, null, msgs);
			if (newWriteProcessingRate != null)
				msgs = ((InternalEObject)newWriteProcessingRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE, null, msgs);
			msgs = basicSetWriteProcessingRate(newWriteProcessingRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE, newWriteProcessingRate, newWriteProcessingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMRandomVariable getReadProcessingRate() {
		return readProcessingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadProcessingRate(PCMRandomVariable newReadProcessingRate, NotificationChain msgs) {
		PCMRandomVariable oldReadProcessingRate = readProcessingRate;
		readProcessingRate = newReadProcessingRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE, oldReadProcessingRate, newReadProcessingRate);
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
	public void setReadProcessingRate(PCMRandomVariable newReadProcessingRate) {
		if (newReadProcessingRate != readProcessingRate) {
			NotificationChain msgs = null;
			if (readProcessingRate != null)
				msgs = ((InternalEObject)readProcessingRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE, null, msgs);
			if (newReadProcessingRate != null)
				msgs = ((InternalEObject)newReadProcessingRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE, null, msgs);
			msgs = basicSetReadProcessingRate(newReadProcessingRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE, newReadProcessingRate, newReadProcessingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceContainer getResourceContainer() {
		if (resourceContainer != null && resourceContainer.eIsProxy()) {
			InternalEObject oldResourceContainer = (InternalEObject)resourceContainer;
			resourceContainer = (ResourceContainer)eResolveProxy(oldResourceContainer);
			if (resourceContainer != oldResourceContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER, oldResourceContainer, resourceContainer));
			}
		}
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer basicGetResourceContainer() {
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceContainer(ResourceContainer newResourceContainer, NotificationChain msgs) {
		ResourceContainer oldResourceContainer = resourceContainer;
		resourceContainer = newResourceContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER, oldResourceContainer, newResourceContainer);
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
	public void setResourceContainer(ResourceContainer newResourceContainer) {
		if (newResourceContainer != resourceContainer) {
			NotificationChain msgs = null;
			if (resourceContainer != null)
				msgs = ((InternalEObject)resourceContainer).eInverseRemove(this, ResourceenvironmentPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS, ResourceContainer.class, msgs);
			if (newResourceContainer != null)
				msgs = ((InternalEObject)newResourceContainer).eInverseAdd(this, ResourceenvironmentPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS, ResourceContainer.class, msgs);
			msgs = basicSetResourceContainer(newResourceContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER, newResourceContainer, newResourceContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				if (resourceContainer != null)
					msgs = ((InternalEObject)resourceContainer).eInverseRemove(this, ResourceenvironmentPackage.RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS, ResourceContainer.class, msgs);
				return basicSetResourceContainer((ResourceContainer)otherEnd, msgs);
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
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE:
				return basicSetWriteProcessingRate(null, msgs);
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE:
				return basicSetReadProcessingRate(null, msgs);
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				return basicSetResourceContainer(null, msgs);
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
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE:
				return getWriteProcessingRate();
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE:
				return getReadProcessingRate();
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				if (resolve) return getResourceContainer();
				return basicGetResourceContainer();
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
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE:
				setWriteProcessingRate((PCMRandomVariable)newValue);
				return;
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE:
				setReadProcessingRate((PCMRandomVariable)newValue);
				return;
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				setResourceContainer((ResourceContainer)newValue);
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
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE:
				setWriteProcessingRate((PCMRandomVariable)null);
				return;
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE:
				setReadProcessingRate((PCMRandomVariable)null);
				return;
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				setResourceContainer((ResourceContainer)null);
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
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE:
				return writeProcessingRate != null;
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE:
				return readProcessingRate != null;
			case ResourceenvironmentPackage.HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER:
				return resourceContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //HDDProcessingResourceSpecificationImpl

/**
 */
package pcm.seff.seff_performance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import pcm.core.CorePackage;
import pcm.core.PCMRandomVariable;

import pcm.core.entity.ResourceRequiredRole;

import pcm.resourcetype.ResourceSignature;

import pcm.seff.AbstractInternalControlFlowAction;
import pcm.seff.SeffPackage;

import pcm.seff.impl.CallActionImpl;

import pcm.seff.seff_performance.ResourceCall;
import pcm.seff.seff_performance.Seff_performancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.seff_performance.impl.ResourceCallImpl#getAction__ResourceCall <em>Action Resource Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.impl.ResourceCallImpl#getResourceRequiredRole__ResourceCall <em>Resource Required Role Resource Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.impl.ResourceCallImpl#getSignature__ResourceCall <em>Signature Resource Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.impl.ResourceCallImpl#getNumberOfCalls__ResourceCall <em>Number Of Calls Resource Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceCallImpl extends CallActionImpl implements ResourceCall {
	/**
	 * The cached value of the '{@link #getResourceRequiredRole__ResourceCall() <em>Resource Required Role Resource Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRequiredRole__ResourceCall()
	 * @generated
	 * @ordered
	 */
	protected ResourceRequiredRole resourceRequiredRole__ResourceCall;

	/**
	 * The cached value of the '{@link #getSignature__ResourceCall() <em>Signature Resource Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature__ResourceCall()
	 * @generated
	 * @ordered
	 */
	protected ResourceSignature signature__ResourceCall;

	/**
	 * The cached value of the '{@link #getNumberOfCalls__ResourceCall() <em>Number Of Calls Resource Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCalls__ResourceCall()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable numberOfCalls__ResourceCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seff_performancePackage.Literals.RESOURCE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractInternalControlFlowAction getAction__ResourceCall() {
		if (eContainerFeatureID() != Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL) return null;
		return (AbstractInternalControlFlowAction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction__ResourceCall(AbstractInternalControlFlowAction newAction__ResourceCall, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAction__ResourceCall, Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction__ResourceCall(AbstractInternalControlFlowAction newAction__ResourceCall) {
		if (newAction__ResourceCall != eInternalContainer() || (eContainerFeatureID() != Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL && newAction__ResourceCall != null)) {
			if (EcoreUtil.isAncestor(this, newAction__ResourceCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAction__ResourceCall != null)
				msgs = ((InternalEObject)newAction__ResourceCall).eInverseAdd(this, SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION, AbstractInternalControlFlowAction.class, msgs);
			msgs = basicSetAction__ResourceCall(newAction__ResourceCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL, newAction__ResourceCall, newAction__ResourceCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceRequiredRole getResourceRequiredRole__ResourceCall() {
		if (resourceRequiredRole__ResourceCall != null && resourceRequiredRole__ResourceCall.eIsProxy()) {
			InternalEObject oldResourceRequiredRole__ResourceCall = (InternalEObject)resourceRequiredRole__ResourceCall;
			resourceRequiredRole__ResourceCall = (ResourceRequiredRole)eResolveProxy(oldResourceRequiredRole__ResourceCall);
			if (resourceRequiredRole__ResourceCall != oldResourceRequiredRole__ResourceCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_performancePackage.RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL, oldResourceRequiredRole__ResourceCall, resourceRequiredRole__ResourceCall));
			}
		}
		return resourceRequiredRole__ResourceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequiredRole basicGetResourceRequiredRole__ResourceCall() {
		return resourceRequiredRole__ResourceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceRequiredRole__ResourceCall(ResourceRequiredRole newResourceRequiredRole__ResourceCall) {
		ResourceRequiredRole oldResourceRequiredRole__ResourceCall = resourceRequiredRole__ResourceCall;
		resourceRequiredRole__ResourceCall = newResourceRequiredRole__ResourceCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_performancePackage.RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL, oldResourceRequiredRole__ResourceCall, resourceRequiredRole__ResourceCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceSignature getSignature__ResourceCall() {
		if (signature__ResourceCall != null && signature__ResourceCall.eIsProxy()) {
			InternalEObject oldSignature__ResourceCall = (InternalEObject)signature__ResourceCall;
			signature__ResourceCall = (ResourceSignature)eResolveProxy(oldSignature__ResourceCall);
			if (signature__ResourceCall != oldSignature__ResourceCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_performancePackage.RESOURCE_CALL__SIGNATURE_RESOURCE_CALL, oldSignature__ResourceCall, signature__ResourceCall));
			}
		}
		return signature__ResourceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSignature basicGetSignature__ResourceCall() {
		return signature__ResourceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature__ResourceCall(ResourceSignature newSignature__ResourceCall) {
		ResourceSignature oldSignature__ResourceCall = signature__ResourceCall;
		signature__ResourceCall = newSignature__ResourceCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_performancePackage.RESOURCE_CALL__SIGNATURE_RESOURCE_CALL, oldSignature__ResourceCall, signature__ResourceCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMRandomVariable getNumberOfCalls__ResourceCall() {
		return numberOfCalls__ResourceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfCalls__ResourceCall(PCMRandomVariable newNumberOfCalls__ResourceCall, NotificationChain msgs) {
		PCMRandomVariable oldNumberOfCalls__ResourceCall = numberOfCalls__ResourceCall;
		numberOfCalls__ResourceCall = newNumberOfCalls__ResourceCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Seff_performancePackage.RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL, oldNumberOfCalls__ResourceCall, newNumberOfCalls__ResourceCall);
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
	public void setNumberOfCalls__ResourceCall(PCMRandomVariable newNumberOfCalls__ResourceCall) {
		if (newNumberOfCalls__ResourceCall != numberOfCalls__ResourceCall) {
			NotificationChain msgs = null;
			if (numberOfCalls__ResourceCall != null)
				msgs = ((InternalEObject)numberOfCalls__ResourceCall).eInverseRemove(this, CorePackage.PCM_RANDOM_VARIABLE__RESOURCE_CALL_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
			if (newNumberOfCalls__ResourceCall != null)
				msgs = ((InternalEObject)newNumberOfCalls__ResourceCall).eInverseAdd(this, CorePackage.PCM_RANDOM_VARIABLE__RESOURCE_CALL_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
			msgs = basicSetNumberOfCalls__ResourceCall(newNumberOfCalls__ResourceCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_performancePackage.RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL, newNumberOfCalls__ResourceCall, newNumberOfCalls__ResourceCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAction__ResourceCall((AbstractInternalControlFlowAction)otherEnd, msgs);
			case Seff_performancePackage.RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL:
				if (numberOfCalls__ResourceCall != null)
					msgs = ((InternalEObject)numberOfCalls__ResourceCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Seff_performancePackage.RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL, null, msgs);
				return basicSetNumberOfCalls__ResourceCall((PCMRandomVariable)otherEnd, msgs);
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
			case Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL:
				return basicSetAction__ResourceCall(null, msgs);
			case Seff_performancePackage.RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL:
				return basicSetNumberOfCalls__ResourceCall(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL:
				return eInternalContainer().eInverseRemove(this, SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION, AbstractInternalControlFlowAction.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL:
				return getAction__ResourceCall();
			case Seff_performancePackage.RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL:
				if (resolve) return getResourceRequiredRole__ResourceCall();
				return basicGetResourceRequiredRole__ResourceCall();
			case Seff_performancePackage.RESOURCE_CALL__SIGNATURE_RESOURCE_CALL:
				if (resolve) return getSignature__ResourceCall();
				return basicGetSignature__ResourceCall();
			case Seff_performancePackage.RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL:
				return getNumberOfCalls__ResourceCall();
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
			case Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL:
				setAction__ResourceCall((AbstractInternalControlFlowAction)newValue);
				return;
			case Seff_performancePackage.RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL:
				setResourceRequiredRole__ResourceCall((ResourceRequiredRole)newValue);
				return;
			case Seff_performancePackage.RESOURCE_CALL__SIGNATURE_RESOURCE_CALL:
				setSignature__ResourceCall((ResourceSignature)newValue);
				return;
			case Seff_performancePackage.RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL:
				setNumberOfCalls__ResourceCall((PCMRandomVariable)newValue);
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
			case Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL:
				setAction__ResourceCall((AbstractInternalControlFlowAction)null);
				return;
			case Seff_performancePackage.RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL:
				setResourceRequiredRole__ResourceCall((ResourceRequiredRole)null);
				return;
			case Seff_performancePackage.RESOURCE_CALL__SIGNATURE_RESOURCE_CALL:
				setSignature__ResourceCall((ResourceSignature)null);
				return;
			case Seff_performancePackage.RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL:
				setNumberOfCalls__ResourceCall((PCMRandomVariable)null);
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
			case Seff_performancePackage.RESOURCE_CALL__ACTION_RESOURCE_CALL:
				return getAction__ResourceCall() != null;
			case Seff_performancePackage.RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_RESOURCE_CALL:
				return resourceRequiredRole__ResourceCall != null;
			case Seff_performancePackage.RESOURCE_CALL__SIGNATURE_RESOURCE_CALL:
				return signature__ResourceCall != null;
			case Seff_performancePackage.RESOURCE_CALL__NUMBER_OF_CALLS_RESOURCE_CALL:
				return numberOfCalls__ResourceCall != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceCallImpl

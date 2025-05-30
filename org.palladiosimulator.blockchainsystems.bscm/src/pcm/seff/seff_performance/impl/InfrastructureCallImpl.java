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

import pcm.repository.InfrastructureRequiredRole;
import pcm.repository.InfrastructureSignature;

import pcm.seff.AbstractInternalControlFlowAction;
import pcm.seff.SeffPackage;

import pcm.seff.impl.CallActionImpl;

import pcm.seff.seff_performance.InfrastructureCall;
import pcm.seff.seff_performance.Seff_performancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.seff_performance.impl.InfrastructureCallImpl#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.impl.InfrastructureCallImpl#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.impl.InfrastructureCallImpl#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.impl.InfrastructureCallImpl#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureCallImpl extends CallActionImpl implements InfrastructureCall {
	/**
	 * The cached value of the '{@link #getSignature__InfrastructureCall() <em>Signature Infrastructure Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature__InfrastructureCall()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureSignature signature__InfrastructureCall;

	/**
	 * The cached value of the '{@link #getNumberOfCalls__InfrastructureCall() <em>Number Of Calls Infrastructure Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCalls__InfrastructureCall()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable numberOfCalls__InfrastructureCall;

	/**
	 * The cached value of the '{@link #getRequiredRole__InfrastructureCall() <em>Required Role Infrastructure Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole__InfrastructureCall()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureRequiredRole requiredRole__InfrastructureCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seff_performancePackage.Literals.INFRASTRUCTURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureSignature getSignature__InfrastructureCall() {
		if (signature__InfrastructureCall != null && signature__InfrastructureCall.eIsProxy()) {
			InternalEObject oldSignature__InfrastructureCall = (InternalEObject)signature__InfrastructureCall;
			signature__InfrastructureCall = (InfrastructureSignature)eResolveProxy(oldSignature__InfrastructureCall);
			if (signature__InfrastructureCall != oldSignature__InfrastructureCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_performancePackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL, oldSignature__InfrastructureCall, signature__InfrastructureCall));
			}
		}
		return signature__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureSignature basicGetSignature__InfrastructureCall() {
		return signature__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature__InfrastructureCall(InfrastructureSignature newSignature__InfrastructureCall) {
		InfrastructureSignature oldSignature__InfrastructureCall = signature__InfrastructureCall;
		signature__InfrastructureCall = newSignature__InfrastructureCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_performancePackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL, oldSignature__InfrastructureCall, signature__InfrastructureCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMRandomVariable getNumberOfCalls__InfrastructureCall() {
		return numberOfCalls__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfCalls__InfrastructureCall(PCMRandomVariable newNumberOfCalls__InfrastructureCall, NotificationChain msgs) {
		PCMRandomVariable oldNumberOfCalls__InfrastructureCall = numberOfCalls__InfrastructureCall;
		numberOfCalls__InfrastructureCall = newNumberOfCalls__InfrastructureCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Seff_performancePackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL, oldNumberOfCalls__InfrastructureCall, newNumberOfCalls__InfrastructureCall);
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
	public void setNumberOfCalls__InfrastructureCall(PCMRandomVariable newNumberOfCalls__InfrastructureCall) {
		if (newNumberOfCalls__InfrastructureCall != numberOfCalls__InfrastructureCall) {
			NotificationChain msgs = null;
			if (numberOfCalls__InfrastructureCall != null)
				msgs = ((InternalEObject)numberOfCalls__InfrastructureCall).eInverseRemove(this, CorePackage.PCM_RANDOM_VARIABLE__INFRASTRUCTURE_CALL_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
			if (newNumberOfCalls__InfrastructureCall != null)
				msgs = ((InternalEObject)newNumberOfCalls__InfrastructureCall).eInverseAdd(this, CorePackage.PCM_RANDOM_VARIABLE__INFRASTRUCTURE_CALL_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
			msgs = basicSetNumberOfCalls__InfrastructureCall(newNumberOfCalls__InfrastructureCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_performancePackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL, newNumberOfCalls__InfrastructureCall, newNumberOfCalls__InfrastructureCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractInternalControlFlowAction getAction__InfrastructureCall() {
		if (eContainerFeatureID() != Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL) return null;
		return (AbstractInternalControlFlowAction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction__InfrastructureCall(AbstractInternalControlFlowAction newAction__InfrastructureCall, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAction__InfrastructureCall, Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction__InfrastructureCall(AbstractInternalControlFlowAction newAction__InfrastructureCall) {
		if (newAction__InfrastructureCall != eInternalContainer() || (eContainerFeatureID() != Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL && newAction__InfrastructureCall != null)) {
			if (EcoreUtil.isAncestor(this, newAction__InfrastructureCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAction__InfrastructureCall != null)
				msgs = ((InternalEObject)newAction__InfrastructureCall).eInverseAdd(this, SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION, AbstractInternalControlFlowAction.class, msgs);
			msgs = basicSetAction__InfrastructureCall(newAction__InfrastructureCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL, newAction__InfrastructureCall, newAction__InfrastructureCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureRequiredRole getRequiredRole__InfrastructureCall() {
		if (requiredRole__InfrastructureCall != null && requiredRole__InfrastructureCall.eIsProxy()) {
			InternalEObject oldRequiredRole__InfrastructureCall = (InternalEObject)requiredRole__InfrastructureCall;
			requiredRole__InfrastructureCall = (InfrastructureRequiredRole)eResolveProxy(oldRequiredRole__InfrastructureCall);
			if (requiredRole__InfrastructureCall != oldRequiredRole__InfrastructureCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_performancePackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL, oldRequiredRole__InfrastructureCall, requiredRole__InfrastructureCall));
			}
		}
		return requiredRole__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRequiredRole basicGetRequiredRole__InfrastructureCall() {
		return requiredRole__InfrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredRole__InfrastructureCall(InfrastructureRequiredRole newRequiredRole__InfrastructureCall) {
		InfrastructureRequiredRole oldRequiredRole__InfrastructureCall = requiredRole__InfrastructureCall;
		requiredRole__InfrastructureCall = newRequiredRole__InfrastructureCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_performancePackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL, oldRequiredRole__InfrastructureCall, requiredRole__InfrastructureCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Seff_performancePackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				if (numberOfCalls__InfrastructureCall != null)
					msgs = ((InternalEObject)numberOfCalls__InfrastructureCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Seff_performancePackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL, null, msgs);
				return basicSetNumberOfCalls__InfrastructureCall((PCMRandomVariable)otherEnd, msgs);
			case Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAction__InfrastructureCall((AbstractInternalControlFlowAction)otherEnd, msgs);
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
			case Seff_performancePackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				return basicSetNumberOfCalls__InfrastructureCall(null, msgs);
			case Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				return basicSetAction__InfrastructureCall(null, msgs);
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
			case Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				return eInternalContainer().eInverseRemove(this, SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION, AbstractInternalControlFlowAction.class, msgs);
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
			case Seff_performancePackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
				if (resolve) return getSignature__InfrastructureCall();
				return basicGetSignature__InfrastructureCall();
			case Seff_performancePackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				return getNumberOfCalls__InfrastructureCall();
			case Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				return getAction__InfrastructureCall();
			case Seff_performancePackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
				if (resolve) return getRequiredRole__InfrastructureCall();
				return basicGetRequiredRole__InfrastructureCall();
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
			case Seff_performancePackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
				setSignature__InfrastructureCall((InfrastructureSignature)newValue);
				return;
			case Seff_performancePackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				setNumberOfCalls__InfrastructureCall((PCMRandomVariable)newValue);
				return;
			case Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				setAction__InfrastructureCall((AbstractInternalControlFlowAction)newValue);
				return;
			case Seff_performancePackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
				setRequiredRole__InfrastructureCall((InfrastructureRequiredRole)newValue);
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
			case Seff_performancePackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
				setSignature__InfrastructureCall((InfrastructureSignature)null);
				return;
			case Seff_performancePackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				setNumberOfCalls__InfrastructureCall((PCMRandomVariable)null);
				return;
			case Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				setAction__InfrastructureCall((AbstractInternalControlFlowAction)null);
				return;
			case Seff_performancePackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
				setRequiredRole__InfrastructureCall((InfrastructureRequiredRole)null);
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
			case Seff_performancePackage.INFRASTRUCTURE_CALL__SIGNATURE_INFRASTRUCTURE_CALL:
				return signature__InfrastructureCall != null;
			case Seff_performancePackage.INFRASTRUCTURE_CALL__NUMBER_OF_CALLS_INFRASTRUCTURE_CALL:
				return numberOfCalls__InfrastructureCall != null;
			case Seff_performancePackage.INFRASTRUCTURE_CALL__ACTION_INFRASTRUCTURE_CALL:
				return getAction__InfrastructureCall() != null;
			case Seff_performancePackage.INFRASTRUCTURE_CALL__REQUIRED_ROLE_INFRASTRUCTURE_CALL:
				return requiredRole__InfrastructureCall != null;
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureCallImpl

/**
 */
package pcm.seff.seff_reliability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.seff.impl.AbstractInternalControlFlowActionImpl;

import pcm.seff.seff_reliability.RecoveryAction;
import pcm.seff.seff_reliability.RecoveryActionBehaviour;
import pcm.seff.seff_reliability.Seff_reliabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recovery Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.seff_reliability.impl.RecoveryActionImpl#getPrimaryBehaviour__RecoveryAction <em>Primary Behaviour Recovery Action</em>}</li>
 *   <li>{@link pcm.seff.seff_reliability.impl.RecoveryActionImpl#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecoveryActionImpl extends AbstractInternalControlFlowActionImpl implements RecoveryAction {
	/**
	 * The cached value of the '{@link #getPrimaryBehaviour__RecoveryAction() <em>Primary Behaviour Recovery Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryBehaviour__RecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected RecoveryActionBehaviour primaryBehaviour__RecoveryAction;

	/**
	 * The cached value of the '{@link #getRecoveryActionBehaviours__RecoveryAction() <em>Recovery Action Behaviours Recovery Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryActionBehaviours__RecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected EList<RecoveryActionBehaviour> recoveryActionBehaviours__RecoveryAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecoveryActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seff_reliabilityPackage.Literals.RECOVERY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecoveryActionBehaviour getPrimaryBehaviour__RecoveryAction() {
		if (primaryBehaviour__RecoveryAction != null && primaryBehaviour__RecoveryAction.eIsProxy()) {
			InternalEObject oldPrimaryBehaviour__RecoveryAction = (InternalEObject)primaryBehaviour__RecoveryAction;
			primaryBehaviour__RecoveryAction = (RecoveryActionBehaviour)eResolveProxy(oldPrimaryBehaviour__RecoveryAction);
			if (primaryBehaviour__RecoveryAction != oldPrimaryBehaviour__RecoveryAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff_reliabilityPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION, oldPrimaryBehaviour__RecoveryAction, primaryBehaviour__RecoveryAction));
			}
		}
		return primaryBehaviour__RecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoveryActionBehaviour basicGetPrimaryBehaviour__RecoveryAction() {
		return primaryBehaviour__RecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryBehaviour__RecoveryAction(RecoveryActionBehaviour newPrimaryBehaviour__RecoveryAction) {
		RecoveryActionBehaviour oldPrimaryBehaviour__RecoveryAction = primaryBehaviour__RecoveryAction;
		primaryBehaviour__RecoveryAction = newPrimaryBehaviour__RecoveryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_reliabilityPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION, oldPrimaryBehaviour__RecoveryAction, primaryBehaviour__RecoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecoveryActionBehaviour> getRecoveryActionBehaviours__RecoveryAction() {
		if (recoveryActionBehaviours__RecoveryAction == null) {
			recoveryActionBehaviours__RecoveryAction = new EObjectContainmentWithInverseEList<RecoveryActionBehaviour>(RecoveryActionBehaviour.class, this, Seff_reliabilityPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION, Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR);
		}
		return recoveryActionBehaviours__RecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Seff_reliabilityPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecoveryActionBehaviours__RecoveryAction()).basicAdd(otherEnd, msgs);
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
			case Seff_reliabilityPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				return ((InternalEList<?>)getRecoveryActionBehaviours__RecoveryAction()).basicRemove(otherEnd, msgs);
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
			case Seff_reliabilityPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION:
				if (resolve) return getPrimaryBehaviour__RecoveryAction();
				return basicGetPrimaryBehaviour__RecoveryAction();
			case Seff_reliabilityPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				return getRecoveryActionBehaviours__RecoveryAction();
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
			case Seff_reliabilityPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION:
				setPrimaryBehaviour__RecoveryAction((RecoveryActionBehaviour)newValue);
				return;
			case Seff_reliabilityPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				getRecoveryActionBehaviours__RecoveryAction().clear();
				getRecoveryActionBehaviours__RecoveryAction().addAll((Collection<? extends RecoveryActionBehaviour>)newValue);
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
			case Seff_reliabilityPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION:
				setPrimaryBehaviour__RecoveryAction((RecoveryActionBehaviour)null);
				return;
			case Seff_reliabilityPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				getRecoveryActionBehaviours__RecoveryAction().clear();
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
			case Seff_reliabilityPackage.RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION:
				return primaryBehaviour__RecoveryAction != null;
			case Seff_reliabilityPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION:
				return recoveryActionBehaviours__RecoveryAction != null && !recoveryActionBehaviours__RecoveryAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecoveryActionImpl

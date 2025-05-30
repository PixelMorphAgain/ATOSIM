/**
 */
package pcm.seff.seff_reliability.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.seff.AbstractAction;
import pcm.seff.AbstractBranchTransition;
import pcm.seff.AbstractLoopAction;
import pcm.seff.ResourceDemandingBehaviour;
import pcm.seff.SeffPackage;

import pcm.seff.seff_reliability.RecoveryAction;
import pcm.seff.seff_reliability.RecoveryActionBehaviour;
import pcm.seff.seff_reliability.Seff_reliabilityPackage;

import pcm.seff.util.SeffValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recovery Action Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.seff_reliability.impl.RecoveryActionBehaviourImpl#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}</li>
 *   <li>{@link pcm.seff.seff_reliability.impl.RecoveryActionBehaviourImpl#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}</li>
 *   <li>{@link pcm.seff.seff_reliability.impl.RecoveryActionBehaviourImpl#getSteps_Behaviour <em>Steps Behaviour</em>}</li>
 *   <li>{@link pcm.seff.seff_reliability.impl.RecoveryActionBehaviourImpl#getFailureHandlingAlternatives__RecoveryActionBehaviour <em>Failure Handling Alternatives Recovery Action Behaviour</em>}</li>
 *   <li>{@link pcm.seff.seff_reliability.impl.RecoveryActionBehaviourImpl#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecoveryActionBehaviourImpl extends FailureHandlingEntityImpl implements RecoveryActionBehaviour {
	/**
	 * The cached value of the '{@link #getSteps_Behaviour() <em>Steps Behaviour</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps_Behaviour()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAction> steps_Behaviour;

	/**
	 * The cached value of the '{@link #getFailureHandlingAlternatives__RecoveryActionBehaviour() <em>Failure Handling Alternatives Recovery Action Behaviour</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureHandlingAlternatives__RecoveryActionBehaviour()
	 * @generated
	 * @ordered
	 */
	protected EList<RecoveryActionBehaviour> failureHandlingAlternatives__RecoveryActionBehaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecoveryActionBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seff_reliabilityPackage.Literals.RECOVERY_ACTION_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractLoopAction getAbstractLoopAction_ResourceDemandingBehaviour() {
		if (eContainerFeatureID() != Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR) return null;
		return (AbstractLoopAction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction newAbstractLoopAction_ResourceDemandingBehaviour, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAbstractLoopAction_ResourceDemandingBehaviour, Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction newAbstractLoopAction_ResourceDemandingBehaviour) {
		if (newAbstractLoopAction_ResourceDemandingBehaviour != eInternalContainer() || (eContainerFeatureID() != Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR && newAbstractLoopAction_ResourceDemandingBehaviour != null)) {
			if (EcoreUtil.isAncestor(this, newAbstractLoopAction_ResourceDemandingBehaviour))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstractLoopAction_ResourceDemandingBehaviour != null)
				msgs = ((InternalEObject)newAbstractLoopAction_ResourceDemandingBehaviour).eInverseAdd(this, SeffPackage.ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP, AbstractLoopAction.class, msgs);
			msgs = basicSetAbstractLoopAction_ResourceDemandingBehaviour(newAbstractLoopAction_ResourceDemandingBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR, newAbstractLoopAction_ResourceDemandingBehaviour, newAbstractLoopAction_ResourceDemandingBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractBranchTransition getAbstractBranchTransition_ResourceDemandingBehaviour() {
		if (eContainerFeatureID() != Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR) return null;
		return (AbstractBranchTransition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition newAbstractBranchTransition_ResourceDemandingBehaviour, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAbstractBranchTransition_ResourceDemandingBehaviour, Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition newAbstractBranchTransition_ResourceDemandingBehaviour) {
		if (newAbstractBranchTransition_ResourceDemandingBehaviour != eInternalContainer() || (eContainerFeatureID() != Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR && newAbstractBranchTransition_ResourceDemandingBehaviour != null)) {
			if (EcoreUtil.isAncestor(this, newAbstractBranchTransition_ResourceDemandingBehaviour))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstractBranchTransition_ResourceDemandingBehaviour != null)
				msgs = ((InternalEObject)newAbstractBranchTransition_ResourceDemandingBehaviour).eInverseAdd(this, SeffPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION, AbstractBranchTransition.class, msgs);
			msgs = basicSetAbstractBranchTransition_ResourceDemandingBehaviour(newAbstractBranchTransition_ResourceDemandingBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR, newAbstractBranchTransition_ResourceDemandingBehaviour, newAbstractBranchTransition_ResourceDemandingBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractAction> getSteps_Behaviour() {
		if (steps_Behaviour == null) {
			steps_Behaviour = new EObjectContainmentWithInverseEList<AbstractAction>(AbstractAction.class, this, Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR, SeffPackage.ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION);
		}
		return steps_Behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecoveryActionBehaviour> getFailureHandlingAlternatives__RecoveryActionBehaviour() {
		if (failureHandlingAlternatives__RecoveryActionBehaviour == null) {
			failureHandlingAlternatives__RecoveryActionBehaviour = new EObjectResolvingEList<RecoveryActionBehaviour>(RecoveryActionBehaviour.class, this, Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR);
		}
		return failureHandlingAlternatives__RecoveryActionBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecoveryAction getRecoveryAction__RecoveryActionBehaviour() {
		if (eContainerFeatureID() != Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR) return null;
		return (RecoveryAction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecoveryAction__RecoveryActionBehaviour(RecoveryAction newRecoveryAction__RecoveryActionBehaviour, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRecoveryAction__RecoveryActionBehaviour, Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecoveryAction__RecoveryActionBehaviour(RecoveryAction newRecoveryAction__RecoveryActionBehaviour) {
		if (newRecoveryAction__RecoveryActionBehaviour != eInternalContainer() || (eContainerFeatureID() != Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR && newRecoveryAction__RecoveryActionBehaviour != null)) {
			if (EcoreUtil.isAncestor(this, newRecoveryAction__RecoveryActionBehaviour))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRecoveryAction__RecoveryActionBehaviour != null)
				msgs = ((InternalEObject)newRecoveryAction__RecoveryActionBehaviour).eInverseAdd(this, Seff_reliabilityPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION, RecoveryAction.class, msgs);
			msgs = basicSetRecoveryAction__RecoveryActionBehaviour(newRecoveryAction__RecoveryActionBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR, newRecoveryAction__RecoveryActionBehaviour, newRecoveryAction__RecoveryActionBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean startActionNeedsRouteToStopAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SeffValidator.DIAGNOSTIC_SOURCE,
						 SeffValidator.RESOURCE_DEMANDING_BEHAVIOUR__START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "startActionNeedsRouteToStopAction", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
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
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)otherEnd, msgs);
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)otherEnd, msgs);
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps_Behaviour()).basicAdd(otherEnd, msgs);
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRecoveryAction__RecoveryActionBehaviour((RecoveryAction)otherEnd, msgs);
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
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				return basicSetAbstractLoopAction_ResourceDemandingBehaviour(null, msgs);
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				return basicSetAbstractBranchTransition_ResourceDemandingBehaviour(null, msgs);
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
				return ((InternalEList<?>)getSteps_Behaviour()).basicRemove(otherEnd, msgs);
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
				return basicSetRecoveryAction__RecoveryActionBehaviour(null, msgs);
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
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				return eInternalContainer().eInverseRemove(this, SeffPackage.ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP, AbstractLoopAction.class, msgs);
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				return eInternalContainer().eInverseRemove(this, SeffPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION, AbstractBranchTransition.class, msgs);
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
				return eInternalContainer().eInverseRemove(this, Seff_reliabilityPackage.RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION, RecoveryAction.class, msgs);
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
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				return getAbstractLoopAction_ResourceDemandingBehaviour();
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				return getAbstractBranchTransition_ResourceDemandingBehaviour();
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
				return getSteps_Behaviour();
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR:
				return getFailureHandlingAlternatives__RecoveryActionBehaviour();
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
				return getRecoveryAction__RecoveryActionBehaviour();
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
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				setAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)newValue);
				return;
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				setAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)newValue);
				return;
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
				getSteps_Behaviour().clear();
				getSteps_Behaviour().addAll((Collection<? extends AbstractAction>)newValue);
				return;
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR:
				getFailureHandlingAlternatives__RecoveryActionBehaviour().clear();
				getFailureHandlingAlternatives__RecoveryActionBehaviour().addAll((Collection<? extends RecoveryActionBehaviour>)newValue);
				return;
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
				setRecoveryAction__RecoveryActionBehaviour((RecoveryAction)newValue);
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
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				setAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)null);
				return;
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				setAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)null);
				return;
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
				getSteps_Behaviour().clear();
				return;
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR:
				getFailureHandlingAlternatives__RecoveryActionBehaviour().clear();
				return;
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
				setRecoveryAction__RecoveryActionBehaviour((RecoveryAction)null);
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
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				return getAbstractLoopAction_ResourceDemandingBehaviour() != null;
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				return getAbstractBranchTransition_ResourceDemandingBehaviour() != null;
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR:
				return steps_Behaviour != null && !steps_Behaviour.isEmpty();
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR:
				return failureHandlingAlternatives__RecoveryActionBehaviour != null && !failureHandlingAlternatives__RecoveryActionBehaviour.isEmpty();
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR:
				return getRecoveryAction__RecoveryActionBehaviour() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceDemandingBehaviour.class) {
			switch (derivedFeatureID) {
				case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;
				case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;
				case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceDemandingBehaviour.class) {
			switch (baseFeatureID) {
				case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR: return Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;
				case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR: return Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;
				case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR: return Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ResourceDemandingBehaviour.class) {
			switch (baseOperationID) {
				case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP: return Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP:
				return startActionNeedsRouteToStopAction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RecoveryActionBehaviourImpl

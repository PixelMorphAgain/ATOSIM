/**
 */
package pcm.seff.util;

import identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.seff.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.seff.SeffPackage
 * @generated
 */
public class SeffValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SeffValidator INSTANCE = new SeffValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.seff";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Start Action Needs Route To Stop Action' of 'Resource Demanding Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_DEMANDING_BEHAVIOUR__START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffValidator() {
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SeffPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SeffPackage.STOP_ACTION:
				return validateStopAction((StopAction)value, diagnostics, context);
			case SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION:
				return validateAbstractInternalControlFlowAction((AbstractInternalControlFlowAction)value, diagnostics, context);
			case SeffPackage.ABSTRACT_ACTION:
				return validateAbstractAction((AbstractAction)value, diagnostics, context);
			case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR:
				return validateResourceDemandingBehaviour((ResourceDemandingBehaviour)value, diagnostics, context);
			case SeffPackage.ABSTRACT_LOOP_ACTION:
				return validateAbstractLoopAction((AbstractLoopAction)value, diagnostics, context);
			case SeffPackage.ABSTRACT_BRANCH_TRANSITION:
				return validateAbstractBranchTransition((AbstractBranchTransition)value, diagnostics, context);
			case SeffPackage.BRANCH_ACTION:
				return validateBranchAction((BranchAction)value, diagnostics, context);
			case SeffPackage.CALL_ACTION:
				return validateCallAction((CallAction)value, diagnostics, context);
			case SeffPackage.START_ACTION:
				return validateStartAction((StartAction)value, diagnostics, context);
			case SeffPackage.SERVICE_EFFECT_SPECIFICATION:
				return validateServiceEffectSpecification((ServiceEffectSpecification)value, diagnostics, context);
			case SeffPackage.RESOURCE_DEMANDING_SEFF:
				return validateResourceDemandingSEFF((ResourceDemandingSEFF)value, diagnostics, context);
			case SeffPackage.RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR:
				return validateResourceDemandingInternalBehaviour((ResourceDemandingInternalBehaviour)value, diagnostics, context);
			case SeffPackage.RELEASE_ACTION:
				return validateReleaseAction((ReleaseAction)value, diagnostics, context);
			case SeffPackage.LOOP_ACTION:
				return validateLoopAction((LoopAction)value, diagnostics, context);
			case SeffPackage.FORK_ACTION:
				return validateForkAction((ForkAction)value, diagnostics, context);
			case SeffPackage.FORKED_BEHAVIOUR:
				return validateForkedBehaviour((ForkedBehaviour)value, diagnostics, context);
			case SeffPackage.SYNCHRONISATION_POINT:
				return validateSynchronisationPoint((SynchronisationPoint)value, diagnostics, context);
			case SeffPackage.EXTERNAL_CALL_ACTION:
				return validateExternalCallAction((ExternalCallAction)value, diagnostics, context);
			case SeffPackage.CALL_RETURN_ACTION:
				return validateCallReturnAction((CallReturnAction)value, diagnostics, context);
			case SeffPackage.PROBABILISTIC_BRANCH_TRANSITION:
				return validateProbabilisticBranchTransition((ProbabilisticBranchTransition)value, diagnostics, context);
			case SeffPackage.ACQUIRE_ACTION:
				return validateAcquireAction((AcquireAction)value, diagnostics, context);
			case SeffPackage.COLLECTION_ITERATOR_ACTION:
				return validateCollectionIteratorAction((CollectionIteratorAction)value, diagnostics, context);
			case SeffPackage.GUARDED_BRANCH_TRANSITION:
				return validateGuardedBranchTransition((GuardedBranchTransition)value, diagnostics, context);
			case SeffPackage.SET_VARIABLE_ACTION:
				return validateSetVariableAction((SetVariableAction)value, diagnostics, context);
			case SeffPackage.INTERNAL_CALL_ACTION:
				return validateInternalCallAction((InternalCallAction)value, diagnostics, context);
			case SeffPackage.EMIT_EVENT_ACTION:
				return validateEmitEventAction((EmitEventAction)value, diagnostics, context);
			case SeffPackage.INTERNAL_ACTION:
				return validateInternalAction((InternalAction)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopAction(StopAction stopAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stopAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(stopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStopAction_stopActionSuccessorMustNotBeDefined(stopAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the stopActionSuccessorMustNotBeDefined constraint of '<em>Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STOP_ACTION__STOP_ACTION_SUCCESSOR_MUST_NOT_BE_DEFINED__EEXPRESSION = "self.successor_AbstractAction.oclIsUndefined()";

	/**
	 * Validates the stopActionSuccessorMustNotBeDefined constraint of '<em>Stop Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopAction_stopActionSuccessorMustNotBeDefined(StopAction stopAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.STOP_ACTION,
				 stopAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "stopActionSuccessorMustNotBeDefined",
				 STOP_ACTION__STOP_ACTION_SUCCESSOR_MUST_NOT_BE_DEFINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractInternalControlFlowAction(AbstractInternalControlFlowAction abstractInternalControlFlowAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractInternalControlFlowAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractInternalControlFlowAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(abstractInternalControlFlowAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractAction(AbstractAction abstractAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(abstractAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceDemandingBehaviour(ResourceDemandingBehaviour resourceDemandingBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceDemandingBehaviour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_exactlyOneStopAction(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_exactlyOneStartAction(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(resourceDemandingBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_startActionNeedsRouteToStopAction(resourceDemandingBehaviour, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the exactlyOneStopAction constraint of '<em>Resource Demanding Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_DEMANDING_BEHAVIOUR__EXACTLY_ONE_STOP_ACTION__EEXPRESSION = "self.steps_Behaviour->select(s|s.oclIsTypeOf(StopAction))->size() = 1";

	/**
	 * Validates the exactlyOneStopAction constraint of '<em>Resource Demanding Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceDemandingBehaviour_exactlyOneStopAction(ResourceDemandingBehaviour resourceDemandingBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.RESOURCE_DEMANDING_BEHAVIOUR,
				 resourceDemandingBehaviour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "exactlyOneStopAction",
				 RESOURCE_DEMANDING_BEHAVIOUR__EXACTLY_ONE_STOP_ACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the exactlyOneStartAction constraint of '<em>Resource Demanding Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_DEMANDING_BEHAVIOUR__EXACTLY_ONE_START_ACTION__EEXPRESSION = "self.steps_Behaviour->select(s|s.oclIsTypeOf(StartAction))->size() = 1";

	/**
	 * Validates the exactlyOneStartAction constraint of '<em>Resource Demanding Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceDemandingBehaviour_exactlyOneStartAction(ResourceDemandingBehaviour resourceDemandingBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.RESOURCE_DEMANDING_BEHAVIOUR,
				 resourceDemandingBehaviour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "exactlyOneStartAction",
				 RESOURCE_DEMANDING_BEHAVIOUR__EXACTLY_ONE_START_ACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor constraint of '<em>Resource Demanding Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_DEMANDING_BEHAVIOUR__EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR__EEXPRESSION = "not self.steps_Behaviour->select(s|not s.oclIsTypeOf(StartAction) and not s.oclIsTypeOf(StopAction))->exists(a|a.oclAsType(AbstractAction).predecessor_AbstractAction.oclIsUndefined()) and not self.steps_Behaviour->select(s|not s.oclIsTypeOf(StartAction) and not s.oclIsTypeOf(StopAction))->exists(a|a.oclAsType(AbstractAction).successor_AbstractAction.oclIsUndefined())";

	/**
	 * Validates the eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor constraint of '<em>Resource Demanding Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceDemandingBehaviour_eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(ResourceDemandingBehaviour resourceDemandingBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.RESOURCE_DEMANDING_BEHAVIOUR,
				 resourceDemandingBehaviour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor",
				 RESOURCE_DEMANDING_BEHAVIOUR__EACH_ACTION_EXCEPT_START_ACTIONAND_STOP_ACTION_MUST_HHAVE_APREDECESSOR_AND_SUCCESSOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the startActionNeedsRouteToStopAction constraint of '<em>Resource Demanding Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceDemandingBehaviour_startActionNeedsRouteToStopAction(ResourceDemandingBehaviour resourceDemandingBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceDemandingBehaviour.startActionNeedsRouteToStopAction(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractLoopAction(AbstractLoopAction abstractLoopAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractLoopAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractLoopAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(abstractLoopAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractBranchTransition(AbstractBranchTransition abstractBranchTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractBranchTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(abstractBranchTransition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchAction(BranchAction branchAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(branchAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranchAction_eitherGuardedBranchesOrProbabilisiticBranchTransitions(branchAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranchAction_allProbabilisticBranchProbabilitiesMustSumUpTo1(branchAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the eitherGuardedBranchesOrProbabilisiticBranchTransitions constraint of '<em>Branch Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BRANCH_ACTION__EITHER_GUARDED_BRANCHES_OR_PROBABILISITIC_BRANCH_TRANSITIONS__EEXPRESSION = "self.branches_Branch->forAll(bt|bt.oclIsTypeOf(ProbabilisticBranchTransition)) \r\n" +
		"or self.branches_Branch->forAll(bt|bt.oclIsTypeOf(GuardedBranchTransition))";

	/**
	 * Validates the eitherGuardedBranchesOrProbabilisiticBranchTransitions constraint of '<em>Branch Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchAction_eitherGuardedBranchesOrProbabilisiticBranchTransitions(BranchAction branchAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.BRANCH_ACTION,
				 branchAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "eitherGuardedBranchesOrProbabilisiticBranchTransitions",
				 BRANCH_ACTION__EITHER_GUARDED_BRANCHES_OR_PROBABILISITIC_BRANCH_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the allProbabilisticBranchProbabilitiesMustSumUpTo1 constraint of '<em>Branch Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BRANCH_ACTION__ALL_PROBABILISTIC_BRANCH_PROBABILITIES_MUST_SUM_UP_TO1__EEXPRESSION = "if self.branches_Branch->forAll(oclIsTypeOf(ProbabilisticBranchTransition)) then \r\n" +
		"\tself.branches_Branch->select(pbt|pbt.oclIsTypeOf(ProbabilisticBranchTransition))->collect(pbt|pbt.oclAsType(ProbabilisticBranchTransition).branchProbability)->sum() > 0.9999 \r\n" +
		"\tand self.branches_Branch->select(pbt|pbt.oclIsTypeOf(ProbabilisticBranchTransition))->collect(pbt|pbt.oclAsType(ProbabilisticBranchTransition).branchProbability)->sum() < 1.0001 \r\n" +
		"\telse true \r\n" +
		"endif";

	/**
	 * Validates the allProbabilisticBranchProbabilitiesMustSumUpTo1 constraint of '<em>Branch Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchAction_allProbabilisticBranchProbabilitiesMustSumUpTo1(BranchAction branchAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.BRANCH_ACTION,
				 branchAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "allProbabilisticBranchProbabilitiesMustSumUpTo1",
				 BRANCH_ACTION__ALL_PROBABILISTIC_BRANCH_PROBABILITIES_MUST_SUM_UP_TO1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction(CallAction callAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(callAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartAction(StartAction startAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(startAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartAction_startActionPredecessorMustNotBeDefined(startAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the startActionPredecessorMustNotBeDefined constraint of '<em>Start Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START_ACTION__START_ACTION_PREDECESSOR_MUST_NOT_BE_DEFINED__EEXPRESSION = "self.predecessor_AbstractAction.oclIsUndefined()";

	/**
	 * Validates the startActionPredecessorMustNotBeDefined constraint of '<em>Start Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartAction_startActionPredecessorMustNotBeDefined(StartAction startAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.START_ACTION,
				 startAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "startActionPredecessorMustNotBeDefined",
				 START_ACTION__START_ACTION_PREDECESSOR_MUST_NOT_BE_DEFINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEffectSpecification(ServiceEffectSpecification serviceEffectSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceEffectSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceEffectSpecification_referencedOperationSignatureMustBelongToInterfaceReferencedByProvidedRole(serviceEffectSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceEffectSpecification_referencedEventTypeMustBelongToEventGroupReferencedByProvidedRole(serviceEffectSpecification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the referencedOperationSignatureMustBelongToInterfaceReferencedByProvidedRole constraint of '<em>Service Effect Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_EFFECT_SPECIFICATION__REFERENCED_OPERATION_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE__EEXPRESSION = "let describedService : repository::Signature = self.describedService__SEFF in\n" +
		"    not describedService.oclIsKindOf(repository::OperationSignature) or\n" +
		"    let providedRoles : Set(repository::ProvidedRole) = self.basicComponent_ServiceEffectSpecification.providedRoles_InterfaceProvidingEntity in\n" +
		"        -- collect all directly provided interfaces\n" +
		"        let directlyProvidedInterfaces : Set(repository::Interface) = providedRoles->selectByKind(repository::OperationProvidedRole).providedInterface__OperationProvidedRole->selectByKind(repository::Interface)->asSet() in\n" +
		"            -- collect all provided interfaces including parent interfaces\n" +
		"            let providedInterfaces : Set(repository::Interface) = directlyProvidedInterfaces->closure(interface : repository::Interface | interface.parentInterfaces__Interface)->union(directlyProvidedInterfaces) in\n" +
		"                -- collect all provided signatures\n" +
		"                let providedSignatures : Set(repository::Signature) = providedInterfaces->selectByKind(repository::OperationInterface).signatures__OperationInterface->selectByKind(repository::Signature)->asSet() in\n" +
		"                    -- compare signatures\n" +
		"                    providedSignatures->includes(self.describedService__SEFF)";

	/**
	 * Validates the referencedOperationSignatureMustBelongToInterfaceReferencedByProvidedRole constraint of '<em>Service Effect Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEffectSpecification_referencedOperationSignatureMustBelongToInterfaceReferencedByProvidedRole(ServiceEffectSpecification serviceEffectSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION,
				 serviceEffectSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "referencedOperationSignatureMustBelongToInterfaceReferencedByProvidedRole",
				 SERVICE_EFFECT_SPECIFICATION__REFERENCED_OPERATION_SIGNATURE_MUST_BELONG_TO_INTERFACE_REFERENCED_BY_PROVIDED_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the referencedEventTypeMustBelongToEventGroupReferencedByProvidedRole constraint of '<em>Service Effect Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_EFFECT_SPECIFICATION__REFERENCED_EVENT_TYPE_MUST_BELONG_TO_EVENT_GROUP_REFERENCED_BY_PROVIDED_ROLE__EEXPRESSION = "let describedService : pcm::repository::Signature = self.describedService__SEFF in\n" +
		"    not describedService.oclIsKindOf(pcm::repository::EventType) or\n" +
		"    let providedRoles : Set(pcm::repository::ProvidedRole) = self.basicComponent_ServiceEffectSpecification.providedRoles_InterfaceProvidingEntity in\n" +
		"        -- collect all directly provided interfaces\n" +
		"        let directlyProvidedInterfaces : Set(pcm::repository::Interface) = providedRoles->selectByKind(pcm::repository::SinkRole).eventGroup__SinkRole->selectByKind(pcm::repository::Interface)->asSet() in\n" +
		"            -- collect all provided interfaces including parent interfaces\n" +
		"            let providedInterfaces : Set(pcm::repository::Interface) = directlyProvidedInterfaces->closure(interface : pcm::repository::Interface | interface.parentInterfaces__Interface)->union(directlyProvidedInterfaces) in\n" +
		"                -- collect all provided signatures\n" +
		"                let providedSignatures : Set(pcm::repository::Signature) = providedInterfaces->selectByKind(pcm::repository::EventGroup).eventTypes__EventGroup->selectByKind(pcm::repository::Signature)->asSet() in\n" +
		"                    -- compare signatures\n" +
		"                    providedSignatures->includes(self.describedService__SEFF)";

	/**
	 * Validates the referencedEventTypeMustBelongToEventGroupReferencedByProvidedRole constraint of '<em>Service Effect Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEffectSpecification_referencedEventTypeMustBelongToEventGroupReferencedByProvidedRole(ServiceEffectSpecification serviceEffectSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.SERVICE_EFFECT_SPECIFICATION,
				 serviceEffectSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "referencedEventTypeMustBelongToEventGroupReferencedByProvidedRole",
				 SERVICE_EFFECT_SPECIFICATION__REFERENCED_EVENT_TYPE_MUST_BELONG_TO_EVENT_GROUP_REFERENCED_BY_PROVIDED_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceDemandingSEFF(ResourceDemandingSEFF resourceDemandingSEFF, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceDemandingSEFF, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceEffectSpecification_referencedOperationSignatureMustBelongToInterfaceReferencedByProvidedRole(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceEffectSpecification_referencedEventTypeMustBelongToEventGroupReferencedByProvidedRole(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_exactlyOneStopAction(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_exactlyOneStartAction(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(resourceDemandingSEFF, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_startActionNeedsRouteToStopAction(resourceDemandingSEFF, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceDemandingInternalBehaviour(ResourceDemandingInternalBehaviour resourceDemandingInternalBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceDemandingInternalBehaviour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_exactlyOneStopAction(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_exactlyOneStartAction(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(resourceDemandingInternalBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_startActionNeedsRouteToStopAction(resourceDemandingInternalBehaviour, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleaseAction(ReleaseAction releaseAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(releaseAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(releaseAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(releaseAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopAction(LoopAction loopAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loopAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loopAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(loopAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkAction(ForkAction forkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(forkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(forkAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(forkAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkedBehaviour(ForkedBehaviour forkedBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(forkedBehaviour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_exactlyOneStopAction(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_exactlyOneStartAction(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(forkedBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceDemandingBehaviour_startActionNeedsRouteToStopAction(forkedBehaviour, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchronisationPoint(SynchronisationPoint synchronisationPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(synchronisationPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(synchronisationPoint, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(synchronisationPoint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCallAction(ExternalCallAction externalCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalCallAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalCallAction_signatureBelongsToRole(externalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalCallAction_operationRequiredRoleMustBeReferencedByContainer(externalCallAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the signatureBelongsToRole constraint of '<em>External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTERNAL_CALL_ACTION__SIGNATURE_BELONGS_TO_ROLE__EEXPRESSION = "self.role_ExternalService.requiredInterface__OperationRequiredRole.signatures__OperationInterface->includes(self.calledService_ExternalService)";

	/**
	 * Validates the signatureBelongsToRole constraint of '<em>External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCallAction_signatureBelongsToRole(ExternalCallAction externalCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.EXTERNAL_CALL_ACTION,
				 externalCallAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "signatureBelongsToRole",
				 EXTERNAL_CALL_ACTION__SIGNATURE_BELONGS_TO_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the operationRequiredRoleMustBeReferencedByContainer constraint of '<em>External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTERNAL_CALL_ACTION__OPERATION_REQUIRED_ROLE_MUST_BE_REFERENCED_BY_CONTAINER__EEXPRESSION = "self.oclAsType(ecore::EObject)->closure(eContainer())->select( entity | entity.oclIsKindOf(pcm::core::entity::InterfaceRequiringEntity)).oclAsType(pcm::core::entity::InterfaceRequiringEntity).requiredRoles_InterfaceRequiringEntity->includes(self.role_ExternalService)";

	/**
	 * Validates the operationRequiredRoleMustBeReferencedByContainer constraint of '<em>External Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalCallAction_operationRequiredRoleMustBeReferencedByContainer(ExternalCallAction externalCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.EXTERNAL_CALL_ACTION,
				 externalCallAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "operationRequiredRoleMustBeReferencedByContainer",
				 EXTERNAL_CALL_ACTION__OPERATION_REQUIRED_ROLE_MUST_BE_REFERENCED_BY_CONTAINER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallReturnAction(CallReturnAction callReturnAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callReturnAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callReturnAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(callReturnAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilisticBranchTransition(ProbabilisticBranchTransition probabilisticBranchTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(probabilisticBranchTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(probabilisticBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(probabilisticBranchTransition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcquireAction(AcquireAction acquireAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(acquireAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(acquireAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcquireAction_timeoutValueOfAcquireActionMustNotBeNegative(acquireAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the timeoutValueOfAcquireActionMustNotBeNegative constraint of '<em>Acquire Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACQUIRE_ACTION__TIMEOUT_VALUE_OF_ACQUIRE_ACTION_MUST_NOT_BE_NEGATIVE__EEXPRESSION = "self.timeoutValue.oclAsType(Real) >= 0.0";

	/**
	 * Validates the timeoutValueOfAcquireActionMustNotBeNegative constraint of '<em>Acquire Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcquireAction_timeoutValueOfAcquireActionMustNotBeNegative(AcquireAction acquireAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.ACQUIRE_ACTION,
				 acquireAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "timeoutValueOfAcquireActionMustNotBeNegative",
				 ACQUIRE_ACTION__TIMEOUT_VALUE_OF_ACQUIRE_ACTION_MUST_NOT_BE_NEGATIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionIteratorAction(CollectionIteratorAction collectionIteratorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionIteratorAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionIteratorAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(collectionIteratorAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardedBranchTransition(GuardedBranchTransition guardedBranchTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(guardedBranchTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(guardedBranchTransition, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(guardedBranchTransition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetVariableAction(SetVariableAction setVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(setVariableAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(setVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(setVariableAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalCallAction(InternalCallAction internalCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalCallAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(internalCallAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmitEventAction(EmitEventAction emitEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(emitEventAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(emitEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emitEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emitEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emitEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(emitEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(emitEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(emitEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emitEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(emitEventAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalAction(InternalAction internalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalAction_multipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed(internalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalAction_sumOfInternalActionFailureProbabilitiesMustNotExceed1(internalAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed constraint of '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERNAL_ACTION__MULTIPLE_INTERNAL_OCCURRENCE_DESCRIPTIONS_PER_FAILURE_TYPE_NOT_ALLOWED__EEXPRESSION = "self.internalFailureOccurrenceDescriptions__InternalAction->forAll(x:pcm::reliability::InternalFailureOccurrenceDescription,y:pcm::reliability::InternalFailureOccurrenceDescription  | x<>y implies x.softwareInducedFailureType__InternalFailureOccurrenceDescription <> y.softwareInducedFailureType__InternalFailureOccurrenceDescription )\r\n" +
		"";

	/**
	 * Validates the multipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed constraint of '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalAction_multipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed(InternalAction internalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.INTERNAL_ACTION,
				 internalAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "multipleInternalOccurrenceDescriptionsPerFailureTypeNotAllowed",
				 INTERNAL_ACTION__MULTIPLE_INTERNAL_OCCURRENCE_DESCRIPTIONS_PER_FAILURE_TYPE_NOT_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the sumOfInternalActionFailureProbabilitiesMustNotExceed1 constraint of '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERNAL_ACTION__SUM_OF_INTERNAL_ACTION_FAILURE_PROBABILITIES_MUST_NOT_EXCEED1__EEXPRESSION = "self.internalFailureOccurrenceDescriptions__InternalAction.failureProbability.oclAsType(Real)->sum()<=1.0\r\n" +
		"";

	/**
	 * Validates the sumOfInternalActionFailureProbabilitiesMustNotExceed1 constraint of '<em>Internal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalAction_sumOfInternalActionFailureProbabilitiesMustNotExceed1(InternalAction internalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SeffPackage.Literals.INTERNAL_ACTION,
				 internalAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "sumOfInternalActionFailureProbabilitiesMustNotExceed1",
				 INTERNAL_ACTION__SUM_OF_INTERNAL_ACTION_FAILURE_PROBABILITIES_MUST_NOT_EXCEED1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SeffValidator

/**
 */
package pcm.usagemodel.util;

import identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.usagemodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.usagemodel.UsagemodelPackage
 * @generated
 */
public class UsagemodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UsagemodelValidator INSTANCE = new UsagemodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.usagemodel";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Route From Start To Stop Action' of 'Scenario Behaviour'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCENARIO_BEHAVIOUR__ROUTE_FROM_START_TO_STOP_ACTION = 1;

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
	public UsagemodelValidator() {
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
	  return UsagemodelPackage.eINSTANCE;
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
			case UsagemodelPackage.WORKLOAD:
				return validateWorkload((Workload)value, diagnostics, context);
			case UsagemodelPackage.USAGE_SCENARIO:
				return validateUsageScenario((UsageScenario)value, diagnostics, context);
			case UsagemodelPackage.USER_DATA:
				return validateUserData((UserData)value, diagnostics, context);
			case UsagemodelPackage.USAGE_MODEL:
				return validateUsageModel((UsageModel)value, diagnostics, context);
			case UsagemodelPackage.ENTRY_LEVEL_SYSTEM_CALL:
				return validateEntryLevelSystemCall((EntryLevelSystemCall)value, diagnostics, context);
			case UsagemodelPackage.ABSTRACT_USER_ACTION:
				return validateAbstractUserAction((AbstractUserAction)value, diagnostics, context);
			case UsagemodelPackage.SCENARIO_BEHAVIOUR:
				return validateScenarioBehaviour((ScenarioBehaviour)value, diagnostics, context);
			case UsagemodelPackage.BRANCH_TRANSITION:
				return validateBranchTransition((BranchTransition)value, diagnostics, context);
			case UsagemodelPackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case UsagemodelPackage.LOOP:
				return validateLoop((Loop)value, diagnostics, context);
			case UsagemodelPackage.STOP:
				return validateStop((Stop)value, diagnostics, context);
			case UsagemodelPackage.START:
				return validateStart((Start)value, diagnostics, context);
			case UsagemodelPackage.OPEN_WORKLOAD:
				return validateOpenWorkload((OpenWorkload)value, diagnostics, context);
			case UsagemodelPackage.DELAY:
				return validateDelay((Delay)value, diagnostics, context);
			case UsagemodelPackage.CLOSED_WORKLOAD:
				return validateClosedWorkload((ClosedWorkload)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkload(Workload workload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workload, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageScenario(UsageScenario usageScenario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(usageScenario, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(usageScenario, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(usageScenario, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserData(UserData userData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageModel(UsageModel usageModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usageModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryLevelSystemCall(EntryLevelSystemCall entryLevelSystemCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entryLevelSystemCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntryLevelSystemCall_entryLevelSystemCallMustReferenceProvidedRoleOfASystem(entryLevelSystemCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntryLevelSystemCall_entryLevelSystemCallSignatureMustMatchItsProvidedRole(entryLevelSystemCall, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the entryLevelSystemCallMustReferenceProvidedRoleOfASystem constraint of '<em>Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTRY_LEVEL_SYSTEM_CALL__ENTRY_LEVEL_SYSTEM_CALL_MUST_REFERENCE_PROVIDED_ROLE_OF_ASYSTEM__EEXPRESSION = "self.providedRole_EntryLevelSystemCall.providingEntity_ProvidedRole.oclIsTypeOf(pcm::system::System)";

	/**
	 * Validates the entryLevelSystemCallMustReferenceProvidedRoleOfASystem constraint of '<em>Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryLevelSystemCall_entryLevelSystemCallMustReferenceProvidedRoleOfASystem(EntryLevelSystemCall entryLevelSystemCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.ENTRY_LEVEL_SYSTEM_CALL,
				 entryLevelSystemCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "entryLevelSystemCallMustReferenceProvidedRoleOfASystem",
				 ENTRY_LEVEL_SYSTEM_CALL__ENTRY_LEVEL_SYSTEM_CALL_MUST_REFERENCE_PROVIDED_ROLE_OF_ASYSTEM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the entryLevelSystemCallSignatureMustMatchItsProvidedRole constraint of '<em>Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTRY_LEVEL_SYSTEM_CALL__ENTRY_LEVEL_SYSTEM_CALL_SIGNATURE_MUST_MATCH_ITS_PROVIDED_ROLE__EEXPRESSION = "self.providedRole_EntryLevelSystemCall.providedInterface__OperationProvidedRole.signatures__OperationInterface->includes(self.operationSignature__EntryLevelSystemCall)";

	/**
	 * Validates the entryLevelSystemCallSignatureMustMatchItsProvidedRole constraint of '<em>Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryLevelSystemCall_entryLevelSystemCallSignatureMustMatchItsProvidedRole(EntryLevelSystemCall entryLevelSystemCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.ENTRY_LEVEL_SYSTEM_CALL,
				 entryLevelSystemCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "entryLevelSystemCallSignatureMustMatchItsProvidedRole",
				 ENTRY_LEVEL_SYSTEM_CALL__ENTRY_LEVEL_SYSTEM_CALL_SIGNATURE_MUST_MATCH_ITS_PROVIDED_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractUserAction(AbstractUserAction abstractUserAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractUserAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractUserAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(abstractUserAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scenarioBehaviour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateScenarioBehaviour_eachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateScenarioBehaviour_exactlyonestart(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateScenarioBehaviour_exactlyonestop(scenarioBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateScenarioBehaviour_routeFromStartToStopAction(scenarioBehaviour, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the eachuseractionexceptStartandStopmusthaveapredecessorandsuccessor constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCENARIO_BEHAVIOUR__EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR__EEXPRESSION = "not self.actions_ScenarioBehaviour->select(s|not s.oclIsTypeOf(Start) and not s.oclIsTypeOf(Stop))->exists(a|a.oclAsType(AbstractUserAction).predecessor.oclIsUndefined()) and not self.actions_ScenarioBehaviour->select(s|not s.oclIsTypeOf(Start) and not s.oclIsTypeOf(Stop))->exists(a|a.oclAsType(AbstractUserAction).successor.oclIsUndefined())";

	/**
	 * Validates the eachuseractionexceptStartandStopmusthaveapredecessorandsuccessor constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour_eachuseractionexceptStartandStopmusthaveapredecessorandsuccessor(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR,
				 scenarioBehaviour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "eachuseractionexceptStartandStopmusthaveapredecessorandsuccessor",
				 SCENARIO_BEHAVIOUR__EACHUSERACTIONEXCEPT_STARTAND_STOPMUSTHAVEAPREDECESSORANDSUCCESSOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the exactlyonestart constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCENARIO_BEHAVIOUR__EXACTLYONESTART__EEXPRESSION = "self.actions_ScenarioBehaviour->select(s|s.oclIsTypeOf(Start))->size() = 1";

	/**
	 * Validates the exactlyonestart constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour_exactlyonestart(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR,
				 scenarioBehaviour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "exactlyonestart",
				 SCENARIO_BEHAVIOUR__EXACTLYONESTART__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the exactlyonestop constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCENARIO_BEHAVIOUR__EXACTLYONESTOP__EEXPRESSION = "self.actions_ScenarioBehaviour->select(s|s.oclIsTypeOf(Stop))->size() = 1";

	/**
	 * Validates the exactlyonestop constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour_exactlyonestop(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.SCENARIO_BEHAVIOUR,
				 scenarioBehaviour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "exactlyonestop",
				 SCENARIO_BEHAVIOUR__EXACTLYONESTOP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the routeFromStartToStopAction constraint of '<em>Scenario Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenarioBehaviour_routeFromStartToStopAction(ScenarioBehaviour scenarioBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scenarioBehaviour.routeFromStartToStopAction(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchTransition(BranchTransition branchTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branchTransition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(branch, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(branch, diagnostics, context);
		if (result || diagnostics != null) result &= validateBranch_allBranchProbabilitiesMustSumUpTo1(branch, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the allBranchProbabilitiesMustSumUpTo1 constraint of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BRANCH__ALL_BRANCH_PROBABILITIES_MUST_SUM_UP_TO1__EEXPRESSION = "self->collect(branchTransitions_Branch.branchProbability)->sum() > 0.999 and self->collect(branchTransitions_Branch.branchProbability)->sum() <1.001";

	/**
	 * Validates the allBranchProbabilitiesMustSumUpTo1 constraint of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch_allBranchProbabilitiesMustSumUpTo1(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.BRANCH,
				 branch,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "allBranchProbabilitiesMustSumUpTo1",
				 BRANCH__ALL_BRANCH_PROBABILITIES_MUST_SUM_UP_TO1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loop, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(loop, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStop(Stop stop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stop, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(stop, diagnostics, context);
		if (result || diagnostics != null) result &= validateStop_stopHasNoSuccessor(stop, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the stopHasNoSuccessor constraint of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STOP__STOP_HAS_NO_SUCCESSOR__EEXPRESSION = "self.successor.oclIsUndefined()";

	/**
	 * Validates the stopHasNoSuccessor constraint of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStop_stopHasNoSuccessor(Stop stop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.STOP,
				 stop,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "stopHasNoSuccessor",
				 STOP__STOP_HAS_NO_SUCCESSOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(start, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(start, diagnostics, context);
		if (result || diagnostics != null) result &= validateStart_startHasNoPredecessor(start, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the startHasNoPredecessor constraint of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START__START_HAS_NO_PREDECESSOR__EEXPRESSION = "self.predecessor.oclIsUndefined()";

	/**
	 * Validates the startHasNoPredecessor constraint of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStart_startHasNoPredecessor(Start start, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.START,
				 start,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "startHasNoPredecessor",
				 START__START_HAS_NO_PREDECESSOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpenWorkload(OpenWorkload openWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(openWorkload, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(openWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpenWorkload_interArrivalTimeInOpenWorkloadNeedsToBeSpecified(openWorkload, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the interArrivalTimeInOpenWorkloadNeedsToBeSpecified constraint of '<em>Open Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPEN_WORKLOAD__INTER_ARRIVAL_TIME_IN_OPEN_WORKLOAD_NEEDS_TO_BE_SPECIFIED__EEXPRESSION = "not self.interArrivalTime_OpenWorkload.oclIsUndefined() and self.interArrivalTime_OpenWorkload.specification <> ''";

	/**
	 * Validates the interArrivalTimeInOpenWorkloadNeedsToBeSpecified constraint of '<em>Open Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpenWorkload_interArrivalTimeInOpenWorkloadNeedsToBeSpecified(OpenWorkload openWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.OPEN_WORKLOAD,
				 openWorkload,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "interArrivalTimeInOpenWorkloadNeedsToBeSpecified",
				 OPEN_WORKLOAD__INTER_ARRIVAL_TIME_IN_OPEN_WORKLOAD_NEEDS_TO_BE_SPECIFIED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelay(Delay delay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delay, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delay, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(delay, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosedWorkload(ClosedWorkload closedWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(closedWorkload, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validateClosedWorkload_populationInClosedWorkloadNeedsToBeGreaterZero(closedWorkload, diagnostics, context);
		if (result || diagnostics != null) result &= validateClosedWorkload_thinkTimeInClosedWorkloadNeedsToBeSpecified(closedWorkload, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the populationInClosedWorkloadNeedsToBeGreaterZero constraint of '<em>Closed Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLOSED_WORKLOAD__POPULATION_IN_CLOSED_WORKLOAD_NEEDS_TO_BE_GREATER_ZERO__EEXPRESSION = "not self.population.oclIsUndefined() and self.population > 0";

	/**
	 * Validates the populationInClosedWorkloadNeedsToBeGreaterZero constraint of '<em>Closed Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosedWorkload_populationInClosedWorkloadNeedsToBeGreaterZero(ClosedWorkload closedWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.CLOSED_WORKLOAD,
				 closedWorkload,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "populationInClosedWorkloadNeedsToBeGreaterZero",
				 CLOSED_WORKLOAD__POPULATION_IN_CLOSED_WORKLOAD_NEEDS_TO_BE_GREATER_ZERO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the thinkTimeInClosedWorkloadNeedsToBeSpecified constraint of '<em>Closed Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLOSED_WORKLOAD__THINK_TIME_IN_CLOSED_WORKLOAD_NEEDS_TO_BE_SPECIFIED__EEXPRESSION = "not self.thinkTime_ClosedWorkload.oclIsUndefined() and self.thinkTime_ClosedWorkload.specification <> ''";

	/**
	 * Validates the thinkTimeInClosedWorkloadNeedsToBeSpecified constraint of '<em>Closed Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClosedWorkload_thinkTimeInClosedWorkloadNeedsToBeSpecified(ClosedWorkload closedWorkload, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UsagemodelPackage.Literals.CLOSED_WORKLOAD,
				 closedWorkload,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "thinkTimeInClosedWorkloadNeedsToBeSpecified",
				 CLOSED_WORKLOAD__THINK_TIME_IN_CLOSED_WORKLOAD_NEEDS_TO_BE_SPECIFIED__EEXPRESSION,
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

} //UsagemodelValidator

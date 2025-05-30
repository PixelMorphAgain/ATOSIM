/**
 */
package pcm.seff.seff_reliability.util;

import identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.seff.seff_reliability.*;

import pcm.seff.util.SeffValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.seff.seff_reliability.Seff_reliabilityPackage
 * @generated
 */
public class Seff_reliabilityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Seff_reliabilityValidator INSTANCE = new Seff_reliabilityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.seff.seff_reliability";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeffValidator seffValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seff_reliabilityValidator() {
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
		seffValidator = SeffValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Seff_reliabilityPackage.eINSTANCE;
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
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR:
				return validateRecoveryActionBehaviour((RecoveryActionBehaviour)value, diagnostics, context);
			case Seff_reliabilityPackage.RECOVERY_ACTION:
				return validateRecoveryAction((RecoveryAction)value, diagnostics, context);
			case Seff_reliabilityPackage.FAILURE_HANDLING_ENTITY:
				return validateFailureHandlingEntity((FailureHandlingEntity)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryActionBehaviour(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recoveryActionBehaviour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= seffValidator.validateResourceDemandingBehaviour_exactlyOneStopAction(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= seffValidator.validateResourceDemandingBehaviour_exactlyOneStartAction(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= seffValidator.validateResourceDemandingBehaviour_eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= seffValidator.validateResourceDemandingBehaviour_startActionNeedsRouteToStopAction(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecoveryActionBehaviour_recoveryActionBehaviourHasOnlyOnePredecessor(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecoveryActionBehaviour_recoveryActionBehaviourIsNotSuccessorOfItself(recoveryActionBehaviour, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecoveryActionBehaviour_successorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(recoveryActionBehaviour, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the recoveryActionBehaviourHasOnlyOnePredecessor constraint of '<em>Recovery Action Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_BEHAVIOUR_HAS_ONLY_ONE_PREDECESSOR__EEXPRESSION = "not self.recoveryAction__RecoveryActionBehaviour.recoveryActionBehaviours__RecoveryAction->\r\n" +
		"\texists(x,y:RecoveryActionBehaviour | x<>y\r\n" +
		"\t\tand x.failureHandlingAlternatives__RecoveryActionBehaviour->includes(self)\r\n" +
		"\t\tand y.failureHandlingAlternatives__RecoveryActionBehaviour->includes(self))";

	/**
	 * Validates the recoveryActionBehaviourHasOnlyOnePredecessor constraint of '<em>Recovery Action Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryActionBehaviour_recoveryActionBehaviourHasOnlyOnePredecessor(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_reliabilityPackage.Literals.RECOVERY_ACTION_BEHAVIOUR,
				 recoveryActionBehaviour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "recoveryActionBehaviourHasOnlyOnePredecessor",
				 RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_BEHAVIOUR_HAS_ONLY_ONE_PREDECESSOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the recoveryActionBehaviourIsNotSuccessorOfItself constraint of '<em>Recovery Action Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_BEHAVIOUR_IS_NOT_SUCCESSOR_OF_ITSELF__EEXPRESSION = "not self.failureHandlingAlternatives__RecoveryActionBehaviour->includes(self)";

	/**
	 * Validates the recoveryActionBehaviourIsNotSuccessorOfItself constraint of '<em>Recovery Action Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryActionBehaviour_recoveryActionBehaviourIsNotSuccessorOfItself(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_reliabilityPackage.Literals.RECOVERY_ACTION_BEHAVIOUR,
				 recoveryActionBehaviour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "recoveryActionBehaviourIsNotSuccessorOfItself",
				 RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_BEHAVIOUR_IS_NOT_SUCCESSOR_OF_ITSELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the successorsOfRecoveryActionBehaviourHandleDisjointFailureTypes constraint of '<em>Recovery Action Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECOVERY_ACTION_BEHAVIOUR__SUCCESSORS_OF_RECOVERY_ACTION_BEHAVIOUR_HANDLE_DISJOINT_FAILURE_TYPES__EEXPRESSION = "not self.failureHandlingAlternatives__RecoveryActionBehaviour->\r\n" +
		"\texists(x,y:RecoveryActionBehaviour | x<>y and\r\n" +
		"\tx.failureTypes_FailureHandlingEntity->\r\n" +
		"\t\texists(f:pcm::reliability::FailureType |\r\n" +
		"\t\ty.failureTypes_FailureHandlingEntity->includes(f)))";

	/**
	 * Validates the successorsOfRecoveryActionBehaviourHandleDisjointFailureTypes constraint of '<em>Recovery Action Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryActionBehaviour_successorsOfRecoveryActionBehaviourHandleDisjointFailureTypes(RecoveryActionBehaviour recoveryActionBehaviour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_reliabilityPackage.Literals.RECOVERY_ACTION_BEHAVIOUR,
				 recoveryActionBehaviour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "successorsOfRecoveryActionBehaviourHandleDisjointFailureTypes",
				 RECOVERY_ACTION_BEHAVIOUR__SUCCESSORS_OF_RECOVERY_ACTION_BEHAVIOUR_HANDLE_DISJOINT_FAILURE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryAction(RecoveryAction recoveryAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recoveryAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(recoveryAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecoveryAction_primaryBehaviourOfRecoveryActionMustBeSet(recoveryAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the primaryBehaviourOfRecoveryActionMustBeSet constraint of '<em>Recovery Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECOVERY_ACTION__PRIMARY_BEHAVIOUR_OF_RECOVERY_ACTION_MUST_BE_SET__EEXPRESSION = "self.primaryBehaviour__RecoveryAction <> null";

	/**
	 * Validates the primaryBehaviourOfRecoveryActionMustBeSet constraint of '<em>Recovery Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecoveryAction_primaryBehaviourOfRecoveryActionMustBeSet(RecoveryAction recoveryAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_reliabilityPackage.Literals.RECOVERY_ACTION,
				 recoveryAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "primaryBehaviourOfRecoveryActionMustBeSet",
				 RECOVERY_ACTION__PRIMARY_BEHAVIOUR_OF_RECOVERY_ACTION_MUST_BE_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureHandlingEntity(FailureHandlingEntity failureHandlingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(failureHandlingEntity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(failureHandlingEntity, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(failureHandlingEntity, diagnostics, context);
		return result;
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

} //Seff_reliabilityValidator

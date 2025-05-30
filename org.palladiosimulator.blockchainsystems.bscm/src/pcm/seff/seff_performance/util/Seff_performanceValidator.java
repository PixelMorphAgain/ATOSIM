/**
 */
package pcm.seff.seff_performance.util;

import identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.seff.seff_performance.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.seff.seff_performance.Seff_performancePackage
 * @generated
 */
public class Seff_performanceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Seff_performanceValidator INSTANCE = new Seff_performanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.seff.seff_performance";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seff_performanceValidator() {
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
	  return Seff_performancePackage.eINSTANCE;
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
			case Seff_performancePackage.INFRASTRUCTURE_CALL:
				return validateInfrastructureCall((InfrastructureCall)value, diagnostics, context);
			case Seff_performancePackage.RESOURCE_CALL:
				return validateResourceCall((ResourceCall)value, diagnostics, context);
			case Seff_performancePackage.PARAMETRIC_RESOURCE_DEMAND:
				return validateParametricResourceDemand((ParametricResourceDemand)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureCall(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infrastructureCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfrastructureCall_signatureMustBelongToUsedRequiredRole(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfrastructureCall_referencedRequiredRoleMustBeRequiredByComponent(infrastructureCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfrastructureCall_signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(infrastructureCall, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the signatureMustBelongToUsedRequiredRole constraint of '<em>Infrastructure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFRASTRUCTURE_CALL__SIGNATURE_MUST_BELONG_TO_USED_REQUIRED_ROLE__EEXPRESSION = "signature__InfrastructureCall.infrastructureInterface__InfrastructureSignature = requiredRole__InfrastructureCall.requiredInterface__InfrastructureRequiredRole";

	/**
	 * Validates the signatureMustBelongToUsedRequiredRole constraint of '<em>Infrastructure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureCall_signatureMustBelongToUsedRequiredRole(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_performancePackage.Literals.INFRASTRUCTURE_CALL,
				 infrastructureCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "signatureMustBelongToUsedRequiredRole",
				 INFRASTRUCTURE_CALL__SIGNATURE_MUST_BELONG_TO_USED_REQUIRED_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the referencedRequiredRoleMustBeRequiredByComponent constraint of '<em>Infrastructure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFRASTRUCTURE_CALL__REFERENCED_REQUIRED_ROLE_MUST_BE_REQUIRED_BY_COMPONENT__EEXPRESSION = "self.oclAsType(ecore::EObject)->closure(eContainer())->select( entity | entity.oclIsKindOf(pcm::core::entity::InterfaceRequiringEntity)).oclAsType(pcm::core::entity::InterfaceRequiringEntity).requiredRoles_InterfaceRequiringEntity->includes(self.requiredRole__InfrastructureCall)";

	/**
	 * Validates the referencedRequiredRoleMustBeRequiredByComponent constraint of '<em>Infrastructure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureCall_referencedRequiredRoleMustBeRequiredByComponent(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_performancePackage.Literals.INFRASTRUCTURE_CALL,
				 infrastructureCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "referencedRequiredRoleMustBeRequiredByComponent",
				 INFRASTRUCTURE_CALL__REFERENCED_REQUIRED_ROLE_MUST_BE_REQUIRED_BY_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Infrastructure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFRASTRUCTURE_CALL__SIGNATURE_ROLE_COMBINATION_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__EEXPRESSION = "self.action__InfrastructureCall.infrastructureCall__Action->select(call | call.requiredRole__InfrastructureCall = self.requiredRole__InfrastructureCall and call.signature__InfrastructureCall=self.signature__InfrastructureCall)->size() = 1";

	/**
	 * Validates the signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Infrastructure Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureCall_signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(InfrastructureCall infrastructureCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_performancePackage.Literals.INFRASTRUCTURE_CALL,
				 infrastructureCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction",
				 INFRASTRUCTURE_CALL__SIGNATURE_ROLE_COMBINATION_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceCall(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceCall_resourceSignatureBelongsToResourceRequiredRole(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceCall_resourceRequiredRoleMustBeReferencedByComponent(resourceCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceCall_signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(resourceCall, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the resourceSignatureBelongsToResourceRequiredRole constraint of '<em>Resource Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CALL__RESOURCE_SIGNATURE_BELONGS_TO_RESOURCE_REQUIRED_ROLE__EEXPRESSION = "self.resourceRequiredRole__ResourceCall.requiredResourceInterface__ResourceRequiredRole.resourceSignatures__ResourceInterface->includes(self.signature__ResourceCall)";

	/**
	 * Validates the resourceSignatureBelongsToResourceRequiredRole constraint of '<em>Resource Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceCall_resourceSignatureBelongsToResourceRequiredRole(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_performancePackage.Literals.RESOURCE_CALL,
				 resourceCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "resourceSignatureBelongsToResourceRequiredRole",
				 RESOURCE_CALL__RESOURCE_SIGNATURE_BELONGS_TO_RESOURCE_REQUIRED_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the resourceRequiredRoleMustBeReferencedByComponent constraint of '<em>Resource Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_MUST_BE_REFERENCED_BY_COMPONENT__EEXPRESSION = "self.oclAsType(ecore::EObject)->closure(eContainer())->select( entity | entity.oclIsKindOf(pcm::core::entity::ResourceInterfaceRequiringEntity)).oclAsType(pcm::core::entity::ResourceInterfaceRequiringEntity).resourceRequiredRoles__ResourceInterfaceRequiringEntity->includes(self.resourceRequiredRole__ResourceCall)";

	/**
	 * Validates the resourceRequiredRoleMustBeReferencedByComponent constraint of '<em>Resource Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceCall_resourceRequiredRoleMustBeReferencedByComponent(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_performancePackage.Literals.RESOURCE_CALL,
				 resourceCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "resourceRequiredRoleMustBeReferencedByComponent",
				 RESOURCE_CALL__RESOURCE_REQUIRED_ROLE_MUST_BE_REFERENCED_BY_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Resource Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE_CALL__SIGNATURE_ROLE_COMBINATION_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__EEXPRESSION = "self.action__ResourceCall.resourceCall__Action->select(call | call.resourceRequiredRole__ResourceCall=self.resourceRequiredRole__ResourceCall and call.signature__ResourceCall=self.signature__ResourceCall)->size() = 1";

	/**
	 * Validates the signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Resource Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceCall_signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction(ResourceCall resourceCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_performancePackage.Literals.RESOURCE_CALL,
				 resourceCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction",
				 RESOURCE_CALL__SIGNATURE_ROLE_COMBINATION_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametricResourceDemand(ParametricResourceDemand parametricResourceDemand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parametricResourceDemand, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parametricResourceDemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parametricResourceDemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parametricResourceDemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parametricResourceDemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parametricResourceDemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parametricResourceDemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parametricResourceDemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parametricResourceDemand, diagnostics, context);
		if (result || diagnostics != null) result &= validateParametricResourceDemand_demandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction(parametricResourceDemand, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the demandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Parametric Resource Demand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETRIC_RESOURCE_DEMAND__DEMANDED_PROCESSING_RESOURCE_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__EEXPRESSION = "self.action_ParametricResourceDemand.resourceDemand_Action->select(prd | prd.requiredResource_ParametricResourceDemand=self.requiredResource_ParametricResourceDemand)->size() = 1";

	/**
	 * Validates the demandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction constraint of '<em>Parametric Resource Demand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametricResourceDemand_demandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction(ParametricResourceDemand parametricResourceDemand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Seff_performancePackage.Literals.PARAMETRIC_RESOURCE_DEMAND,
				 parametricResourceDemand,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "demandedProcessingResourceMustBeUniqueWithinAbstractInternalControlFlowAction",
				 PARAMETRIC_RESOURCE_DEMAND__DEMANDED_PROCESSING_RESOURCE_MUST_BE_UNIQUE_WITHIN_ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__EEXPRESSION,
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

} //Seff_performanceValidator

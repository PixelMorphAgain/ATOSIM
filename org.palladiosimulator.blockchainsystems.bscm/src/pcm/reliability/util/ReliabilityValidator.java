/**
 */
package pcm.reliability.util;

import identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.reliability.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.reliability.ReliabilityPackage
 * @generated
 */
public class ReliabilityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ReliabilityValidator INSTANCE = new ReliabilityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.reliability";

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
	public ReliabilityValidator() {
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
	  return ReliabilityPackage.eINSTANCE;
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
			case ReliabilityPackage.FAILURE_OCCURRENCE_DESCRIPTION:
				return validateFailureOccurrenceDescription((FailureOccurrenceDescription)value, diagnostics, context);
			case ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE:
				return validateHardwareInducedFailureType((HardwareInducedFailureType)value, diagnostics, context);
			case ReliabilityPackage.SOFTWARE_INDUCED_FAILURE_TYPE:
				return validateSoftwareInducedFailureType((SoftwareInducedFailureType)value, diagnostics, context);
			case ReliabilityPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				return validateInternalFailureOccurrenceDescription((InternalFailureOccurrenceDescription)value, diagnostics, context);
			case ReliabilityPackage.NETWORK_INDUCED_FAILURE_TYPE:
				return validateNetworkInducedFailureType((NetworkInducedFailureType)value, diagnostics, context);
			case ReliabilityPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION:
				return validateExternalFailureOccurrenceDescription((ExternalFailureOccurrenceDescription)value, diagnostics, context);
			case ReliabilityPackage.RESOURCE_TIMEOUT_FAILURE_TYPE:
				return validateResourceTimeoutFailureType((ResourceTimeoutFailureType)value, diagnostics, context);
			case ReliabilityPackage.FAILURE_TYPE:
				return validateFailureType((FailureType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureOccurrenceDescription(FailureOccurrenceDescription failureOccurrenceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(failureOccurrenceDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(failureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(failureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(failureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(failureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(failureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(failureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(failureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(failureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateFailureOccurrenceDescription_ensureValidFailureProbabilityRange(failureOccurrenceDescription, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ensureValidFailureProbabilityRange constraint of '<em>Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FAILURE_OCCURRENCE_DESCRIPTION__ENSURE_VALID_FAILURE_PROBABILITY_RANGE__EEXPRESSION = "(self.failureProbability.oclAsType(Real) <= 1.0) and (self.failureProbability.oclAsType(Real) >= 0.0)";

	/**
	 * Validates the ensureValidFailureProbabilityRange constraint of '<em>Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureOccurrenceDescription_ensureValidFailureProbabilityRange(FailureOccurrenceDescription failureOccurrenceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReliabilityPackage.Literals.FAILURE_OCCURRENCE_DESCRIPTION,
				 failureOccurrenceDescription,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "ensureValidFailureProbabilityRange",
				 FAILURE_OCCURRENCE_DESCRIPTION__ENSURE_VALID_FAILURE_PROBABILITY_RANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareInducedFailureType(HardwareInducedFailureType hardwareInducedFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hardwareInducedFailureType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(hardwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validateHardwareInducedFailureType_hardwareInducedFailureTypeHasProcessingResourceType(hardwareInducedFailureType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hardwareInducedFailureTypeHasProcessingResourceType constraint of '<em>Hardware Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HARDWARE_INDUCED_FAILURE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_HAS_PROCESSING_RESOURCE_TYPE__EEXPRESSION = "( self.processingResourceType__HardwareInducedFailureType <> null ) and ( not ( self.processingResourceType__HardwareInducedFailureType.oclIsTypeOf( pcm::resourcetype::CommunicationLinkResourceType ) ) )";

	/**
	 * Validates the hardwareInducedFailureTypeHasProcessingResourceType constraint of '<em>Hardware Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareInducedFailureType_hardwareInducedFailureTypeHasProcessingResourceType(HardwareInducedFailureType hardwareInducedFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReliabilityPackage.Literals.HARDWARE_INDUCED_FAILURE_TYPE,
				 hardwareInducedFailureType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "hardwareInducedFailureTypeHasProcessingResourceType",
				 HARDWARE_INDUCED_FAILURE_TYPE__HARDWARE_INDUCED_FAILURE_TYPE_HAS_PROCESSING_RESOURCE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareInducedFailureType(SoftwareInducedFailureType softwareInducedFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(softwareInducedFailureType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(softwareInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(softwareInducedFailureType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalFailureOccurrenceDescription(InternalFailureOccurrenceDescription internalFailureOccurrenceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalFailureOccurrenceDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateFailureOccurrenceDescription_ensureValidFailureProbabilityRange(internalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalFailureOccurrenceDescription_noResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription(internalFailureOccurrenceDescription, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription constraint of '<em>Internal Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__NO_RESOURCE_TIMEOUT_FAILURE_ALLOWED_FOR_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__EEXPRESSION = "not self.softwareInducedFailureType__InternalFailureOccurrenceDescription.oclIsTypeOf(ResourceTimeoutFailureType)";

	/**
	 * Validates the noResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription constraint of '<em>Internal Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalFailureOccurrenceDescription_noResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription(InternalFailureOccurrenceDescription internalFailureOccurrenceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReliabilityPackage.Literals.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION,
				 internalFailureOccurrenceDescription,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "noResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription",
				 INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__NO_RESOURCE_TIMEOUT_FAILURE_ALLOWED_FOR_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkInducedFailureType(NetworkInducedFailureType networkInducedFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkInducedFailureType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(networkInducedFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkInducedFailureType_networkInducedFailureTypeHasCommunicationLinkResourceType(networkInducedFailureType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the networkInducedFailureTypeHasCommunicationLinkResourceType constraint of '<em>Network Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NETWORK_INDUCED_FAILURE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_HAS_COMMUNICATION_LINK_RESOURCE_TYPE__EEXPRESSION = "self.communicationLinkResourceType__NetworkInducedFailureType <> null";

	/**
	 * Validates the networkInducedFailureTypeHasCommunicationLinkResourceType constraint of '<em>Network Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkInducedFailureType_networkInducedFailureTypeHasCommunicationLinkResourceType(NetworkInducedFailureType networkInducedFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReliabilityPackage.Literals.NETWORK_INDUCED_FAILURE_TYPE,
				 networkInducedFailureType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "networkInducedFailureTypeHasCommunicationLinkResourceType",
				 NETWORK_INDUCED_FAILURE_TYPE__NETWORK_INDUCED_FAILURE_TYPE_HAS_COMMUNICATION_LINK_RESOURCE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalFailureOccurrenceDescription(ExternalFailureOccurrenceDescription externalFailureOccurrenceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalFailureOccurrenceDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateFailureOccurrenceDescription_ensureValidFailureProbabilityRange(externalFailureOccurrenceDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalFailureOccurrenceDescription_noResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription(externalFailureOccurrenceDescription, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription constraint of '<em>External Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__NO_RESOURCE_TIMEOUT_FAILURE_ALLOWED_FOR_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__EEXPRESSION = "not self.failureType__ExternalFailureOccurrenceDescription.oclIsTypeOf(ResourceTimeoutFailureType)";

	/**
	 * Validates the noResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription constraint of '<em>External Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalFailureOccurrenceDescription_noResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription(ExternalFailureOccurrenceDescription externalFailureOccurrenceDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ReliabilityPackage.Literals.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION,
				 externalFailureOccurrenceDescription,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "noResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription",
				 EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__NO_RESOURCE_TIMEOUT_FAILURE_ALLOWED_FOR_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceTimeoutFailureType(ResourceTimeoutFailureType resourceTimeoutFailureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceTimeoutFailureType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceTimeoutFailureType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(resourceTimeoutFailureType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureType(FailureType failureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(failureType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(failureType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(failureType, diagnostics, context);
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

} //ReliabilityValidator

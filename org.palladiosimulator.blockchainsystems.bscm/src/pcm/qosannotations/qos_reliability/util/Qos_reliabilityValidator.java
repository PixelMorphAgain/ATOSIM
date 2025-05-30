/**
 */
package pcm.qosannotations.qos_reliability.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.qosannotations.qos_reliability.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.qosannotations.qos_reliability.Qos_reliabilityPackage
 * @generated
 */
public class Qos_reliabilityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Qos_reliabilityValidator INSTANCE = new Qos_reliabilityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.qosannotations.qos_reliability";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qos_reliabilityValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Qos_reliabilityPackage.eINSTANCE;
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
			case Qos_reliabilityPackage.SPECIFIED_RELIABILITY_ANNOTATION:
				return validateSpecifiedReliabilityAnnotation((SpecifiedReliabilityAnnotation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecifiedReliabilityAnnotation(SpecifiedReliabilityAnnotation specifiedReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specifiedReliabilityAnnotation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specifiedReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specifiedReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specifiedReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specifiedReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specifiedReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specifiedReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specifiedReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specifiedReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecifiedReliabilityAnnotation_specifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(specifiedReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecifiedReliabilityAnnotation_multipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(specifiedReliabilityAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecifiedReliabilityAnnotation_sumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(specifiedReliabilityAnnotation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the specifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem constraint of '<em>Specified Reliability Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPECIFIED_RELIABILITY_ANNOTATION__SPECIFIED_RELIABILITY_ANNOTATION_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM__EEXPRESSION = "(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(pcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(pcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(pcm::system::System))\r\n" +
		"\r\n" +
		"\r\n" +
		"";

	/**
	 * Validates the specifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem constraint of '<em>Specified Reliability Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecifiedReliabilityAnnotation_specifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem(SpecifiedReliabilityAnnotation specifiedReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Qos_reliabilityPackage.Literals.SPECIFIED_RELIABILITY_ANNOTATION,
				 specifiedReliabilityAnnotation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "specifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem",
				 SPECIFIED_RELIABILITY_ANNOTATION__SPECIFIED_RELIABILITY_ANNOTATION_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed constraint of '<em>Specified Reliability Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPECIFIED_RELIABILITY_ANNOTATION__MULTIPLE_EXTERNAL_OCCURRENCE_DESCRIPTIONS_PER_FAILURE_TYPE_NOT_ALLOWED__EEXPRESSION = "self.externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation->forAll(x:pcm::reliability::ExternalFailureOccurrenceDescription,y:pcm::reliability::ExternalFailureOccurrenceDescription  | x<>y implies x.failureType__ExternalFailureOccurrenceDescription <> y.failureType__ExternalFailureOccurrenceDescription )";

	/**
	 * Validates the multipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed constraint of '<em>Specified Reliability Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecifiedReliabilityAnnotation_multipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed(SpecifiedReliabilityAnnotation specifiedReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Qos_reliabilityPackage.Literals.SPECIFIED_RELIABILITY_ANNOTATION,
				 specifiedReliabilityAnnotation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "multipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed",
				 SPECIFIED_RELIABILITY_ANNOTATION__MULTIPLE_EXTERNAL_OCCURRENCE_DESCRIPTIONS_PER_FAILURE_TYPE_NOT_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the sumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1 constraint of '<em>Specified Reliability Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPECIFIED_RELIABILITY_ANNOTATION__SUM_OF_RELIABILITY_ANNOTATION_FAILURE_PROBABILITIES_MUST_NOT_EXCEED1__EEXPRESSION = "self.externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation.failureProbability.oclAsType(Real)->sum()<=1.0";

	/**
	 * Validates the sumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1 constraint of '<em>Specified Reliability Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecifiedReliabilityAnnotation_sumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1(SpecifiedReliabilityAnnotation specifiedReliabilityAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Qos_reliabilityPackage.Literals.SPECIFIED_RELIABILITY_ANNOTATION,
				 specifiedReliabilityAnnotation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "sumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1",
				 SPECIFIED_RELIABILITY_ANNOTATION__SUM_OF_RELIABILITY_ANNOTATION_FAILURE_PROBABILITIES_MUST_NOT_EXCEED1__EEXPRESSION,
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

} //Qos_reliabilityValidator

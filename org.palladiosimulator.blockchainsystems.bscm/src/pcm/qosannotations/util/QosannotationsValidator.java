/**
 */
package pcm.qosannotations.util;

import identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.qosannotations.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.qosannotations.QosannotationsPackage
 * @generated
 */
public class QosannotationsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QosannotationsValidator INSTANCE = new QosannotationsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.qosannotations";

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
	public QosannotationsValidator() {
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
	  return QosannotationsPackage.eINSTANCE;
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
			case QosannotationsPackage.SPECIFIED_QO_SANNOTATION:
				return validateSpecifiedQoSAnnotation((SpecifiedQoSAnnotation)value, diagnostics, context);
			case QosannotationsPackage.QO_SANNOTATIONS:
				return validateQoSAnnotations((QoSAnnotations)value, diagnostics, context);
			case QosannotationsPackage.SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION:
				return validateSpecifiedOutputParameterAbstraction((SpecifiedOutputParameterAbstraction)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecifiedQoSAnnotation(SpecifiedQoSAnnotation specifiedQoSAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specifiedQoSAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQoSAnnotations(QoSAnnotations qoSAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qoSAnnotations, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qoSAnnotations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qoSAnnotations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qoSAnnotations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qoSAnnotations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qoSAnnotations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qoSAnnotations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qoSAnnotations, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qoSAnnotations, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(qoSAnnotations, diagnostics, context);
		if (result || diagnostics != null) result &= validateQoSAnnotations_multipleReliabilityAnnotationsPerExternalCallNotAllowed(qoSAnnotations, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multipleReliabilityAnnotationsPerExternalCallNotAllowed constraint of '<em>Qo SAnnotations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QO_SANNOTATIONS__MULTIPLE_RELIABILITY_ANNOTATIONS_PER_EXTERNAL_CALL_NOT_ALLOWED__EEXPRESSION = "self.specifiedQoSAnnotations_QoSAnnotations->select(oclIsTypeOf(pcm::qosannotations::qos_reliability::SpecifiedReliabilityAnnotation))->forAll( x, y | ( x<>y ) implies ( ( x.role_SpecifiedQoSAnnotation <> y.role_SpecifiedQoSAnnotation )  or ( x.signature_SpecifiedQoSAnnation <> y.signature_SpecifiedQoSAnnation ) ) )";

	/**
	 * Validates the multipleReliabilityAnnotationsPerExternalCallNotAllowed constraint of '<em>Qo SAnnotations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQoSAnnotations_multipleReliabilityAnnotationsPerExternalCallNotAllowed(QoSAnnotations qoSAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(QosannotationsPackage.Literals.QO_SANNOTATIONS,
				 qoSAnnotations,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "multipleReliabilityAnnotationsPerExternalCallNotAllowed",
				 QO_SANNOTATIONS__MULTIPLE_RELIABILITY_ANNOTATIONS_PER_EXTERNAL_CALL_NOT_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecifiedOutputParameterAbstraction(SpecifiedOutputParameterAbstraction specifiedOutputParameterAbstraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specifiedOutputParameterAbstraction, diagnostics, context);
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

} //QosannotationsValidator

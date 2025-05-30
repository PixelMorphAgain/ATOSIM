/**
 */
package pcm.qosannotations.qos_reliability;

import org.eclipse.emf.common.util.EList;

import pcm.qosannotations.SpecifiedQoSAnnotation;

import pcm.reliability.ExternalFailureOccurrenceDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specified Reliability Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SpecifiedFailureProbability of a service resembles its "Probability of Failure on Demand" (POFOD). Whenever the service is called, this values states the probability that it returns successfully. For reliability prediction, the PCMRandomVariable specified in its superclass SpecifiedQoSAnnotation must evaluate to a real number between 0 and 1.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}</li>
 * </ul>
 *
 * @see pcm.qosannotations.qos_reliability.Qos_reliabilityPackage#getSpecifiedReliabilityAnnotation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='specifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem multipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed sumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG specifiedReliabilityAnnotationMustReferenceRequiredRoleOfASystem='(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(pcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(pcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(pcm::system::System))\r\n\r\n\r\n' sumOfReliabilityAnnotationFailureProbabilitiesMustNotExceed1='self.externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation.failureProbability.oclAsType(Real)-&gt;sum()&lt;=1.0' multipleExternalOccurrenceDescriptionsPerFailureTypeNotAllowed='self.externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation-&gt;forAll(x:pcm::reliability::ExternalFailureOccurrenceDescription,y:pcm::reliability::ExternalFailureOccurrenceDescription  | x&lt;&gt;y implies x.failureType__ExternalFailureOccurrenceDescription &lt;&gt; y.failureType__ExternalFailureOccurrenceDescription )'"
 * @generated
 */
public interface SpecifiedReliabilityAnnotation extends SpecifiedQoSAnnotation {
	/**
	 * Returns the value of the '<em><b>External Failure Occurrence Descriptions Specified Reliability Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.reliability.ExternalFailureOccurrenceDescription}.
	 * It is bidirectional and its opposite is '{@link pcm.reliability.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>' containment reference list.
	 * @see pcm.qosannotations.qos_reliability.Qos_reliabilityPackage#getSpecifiedReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()
	 * @see pcm.reliability.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription
	 * @model opposite="specifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ExternalFailureOccurrenceDescription> getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();

} // SpecifiedReliabilityAnnotation

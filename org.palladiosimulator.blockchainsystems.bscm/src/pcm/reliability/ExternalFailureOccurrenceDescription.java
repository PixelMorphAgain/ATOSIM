/**
 */
package pcm.reliability;

import pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Failure Occurrence Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Special&nbsp;case&nbsp;of&nbsp;a&nbsp;FailureOccurenceDescription&nbsp;specifying&nbsp;the&nbsp;failure&nbsp;potential&nbsp;of&nbsp;system-external&nbsp;calls.&nbsp;Can&nbsp;relate&nbsp;to
 * any FailureType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.reliability.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}</li>
 *   <li>{@link pcm.reliability.ExternalFailureOccurrenceDescription#getFailureType__ExternalFailureOccurrenceDescription <em>Failure Type External Failure Occurrence Description</em>}</li>
 * </ul>
 *
 * @see pcm.reliability.ReliabilityPackage#getExternalFailureOccurrenceDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG noResourceTimeoutFailureAllowedForExternalFailureOccurrenceDescription='not self.failureType__ExternalFailureOccurrenceDescription.oclIsTypeOf(ResourceTimeoutFailureType)'"
 * @generated
 */
public interface ExternalFailureOccurrenceDescription extends FailureOccurrenceDescription {
	/**
	 * Returns the value of the '<em><b>Specified Reliability Annotation External Failure Occurrence Description</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Reliability Annotation External Failure Occurrence Description</em>' container reference.
	 * @see #setSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(SpecifiedReliabilityAnnotation)
	 * @see pcm.reliability.ReliabilityPackage#getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription()
	 * @see pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation
	 * @model opposite="externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation" required="true" transient="false" ordered="false"
	 * @generated
	 */
	SpecifiedReliabilityAnnotation getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription();

	/**
	 * Sets the value of the '{@link pcm.reliability.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specified Reliability Annotation External Failure Occurrence Description</em>' container reference.
	 * @see #getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription()
	 * @generated
	 */
	void setSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription(SpecifiedReliabilityAnnotation value);

	/**
	 * Returns the value of the '<em><b>Failure Type External Failure Occurrence Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Type External Failure Occurrence Description</em>' reference.
	 * @see #setFailureType__ExternalFailureOccurrenceDescription(FailureType)
	 * @see pcm.reliability.ReliabilityPackage#getExternalFailureOccurrenceDescription_FailureType__ExternalFailureOccurrenceDescription()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FailureType getFailureType__ExternalFailureOccurrenceDescription();

	/**
	 * Sets the value of the '{@link pcm.reliability.ExternalFailureOccurrenceDescription#getFailureType__ExternalFailureOccurrenceDescription <em>Failure Type External Failure Occurrence Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Type External Failure Occurrence Description</em>' reference.
	 * @see #getFailureType__ExternalFailureOccurrenceDescription()
	 * @generated
	 */
	void setFailureType__ExternalFailureOccurrenceDescription(FailureType value);

} // ExternalFailureOccurrenceDescription

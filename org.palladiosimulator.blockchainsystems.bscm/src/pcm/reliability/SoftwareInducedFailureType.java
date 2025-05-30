/**
 */
package pcm.reliability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Type definition for a software-induced failure, i.e. a failure-on-demand occurrence&nbsp;due to a software fault. Type
 *     definitions are created by modellers for a certain PCM instance to distinguish&nbsp;different types of software
 *     failure-on-demand occurrences. Possible examples are: "EncryptionFailure", "ProtocolFailure", "WebServerFailure".
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.reliability.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType <em>Internal Failure Occurrence Descriptions Software Induced Failure Type</em>}</li>
 * </ul>
 *
 * @see pcm.reliability.ReliabilityPackage#getSoftwareInducedFailureType()
 * @model
 * @generated
 */
public interface SoftwareInducedFailureType extends FailureType {
	/**
	 * Returns the value of the '<em><b>Internal Failure Occurrence Descriptions Software Induced Failure Type</b></em>' reference list.
	 * The list contents are of type {@link pcm.reliability.InternalFailureOccurrenceDescription}.
	 * It is bidirectional and its opposite is '{@link pcm.reliability.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription <em>Software Induced Failure Type Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Failure Occurrence Descriptions Software Induced Failure Type</em>' reference list.
	 * @see pcm.reliability.ReliabilityPackage#getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType()
	 * @see pcm.reliability.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription
	 * @model opposite="softwareInducedFailureType__InternalFailureOccurrenceDescription" ordered="false"
	 * @generated
	 */
	EList<InternalFailureOccurrenceDescription> getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType();

} // SoftwareInducedFailureType

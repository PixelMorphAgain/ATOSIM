/**
 */
package pcm.reliability;

import pcm.resourcetype.ProcessingResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Type definition for a hardware-induced failure, i.e. a failure-on-demand occurrence&nbsp;due to an unavailable
 *     resource. Standard types&nbsp;are pre-defined according to the pre-defined ProcessingResourceTypes: CPU, HDD, DELAY.
 *     Further types may be defined by the modeller for a certain PCM instance, together with a custom ProcessingResourceType.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.reliability.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType <em>Processing Resource Type Hardware Induced Failure Type</em>}</li>
 * </ul>
 *
 * @see pcm.reliability.ReliabilityPackage#getHardwareInducedFailureType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hardwareInducedFailureTypeHasProcessingResourceType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG hardwareInducedFailureTypeHasProcessingResourceType='( self.processingResourceType__HardwareInducedFailureType &lt;&gt; null ) and ( not ( self.processingResourceType__HardwareInducedFailureType.oclIsTypeOf( pcm::resourcetype::CommunicationLinkResourceType ) ) )'"
 * @generated
 */
public interface HardwareInducedFailureType extends FailureType {
	/**
	 * Returns the value of the '<em><b>Processing Resource Type Hardware Induced Failure Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcm.resourcetype.ProcessingResourceType#getHardwareInducedFailureType__ProcessingResourceType <em>Hardware Induced Failure Type Processing Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Resource Type Hardware Induced Failure Type</em>' reference.
	 * @see #setProcessingResourceType__HardwareInducedFailureType(ProcessingResourceType)
	 * @see pcm.reliability.ReliabilityPackage#getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType()
	 * @see pcm.resourcetype.ProcessingResourceType#getHardwareInducedFailureType__ProcessingResourceType
	 * @model opposite="hardwareInducedFailureType__ProcessingResourceType" required="true" ordered="false"
	 * @generated
	 */
	ProcessingResourceType getProcessingResourceType__HardwareInducedFailureType();

	/**
	 * Sets the value of the '{@link pcm.reliability.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType <em>Processing Resource Type Hardware Induced Failure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Resource Type Hardware Induced Failure Type</em>' reference.
	 * @see #getProcessingResourceType__HardwareInducedFailureType()
	 * @generated
	 */
	void setProcessingResourceType__HardwareInducedFailureType(ProcessingResourceType value);

} // HardwareInducedFailureType

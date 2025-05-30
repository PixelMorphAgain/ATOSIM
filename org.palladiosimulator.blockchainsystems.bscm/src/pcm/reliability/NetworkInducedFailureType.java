/**
 */
package pcm.reliability;

import pcm.resourcetype.CommunicationLinkResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Type definition for a network-induced failure, i.e. a failure-on-demand occurrence&nbsp;due to a communication link
 *     fault. One standard type&nbsp;is pre-defined according to the pre-defined CommunicationLinkResourceType: LAN.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.reliability.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}</li>
 * </ul>
 *
 * @see pcm.reliability.ReliabilityPackage#getNetworkInducedFailureType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='networkInducedFailureTypeHasCommunicationLinkResourceType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG networkInducedFailureTypeHasCommunicationLinkResourceType='self.communicationLinkResourceType__NetworkInducedFailureType &lt;&gt; null'"
 * @generated
 */
public interface NetworkInducedFailureType extends FailureType {
	/**
	 * Returns the value of the '<em><b>Communication Link Resource Type Network Induced Failure Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcm.resourcetype.CommunicationLinkResourceType#getNetworkInducedFailureType__CommunicationLinkResourceType <em>Network Induced Failure Type Communication Link Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Link Resource Type Network Induced Failure Type</em>' reference.
	 * @see #setCommunicationLinkResourceType__NetworkInducedFailureType(CommunicationLinkResourceType)
	 * @see pcm.reliability.ReliabilityPackage#getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType()
	 * @see pcm.resourcetype.CommunicationLinkResourceType#getNetworkInducedFailureType__CommunicationLinkResourceType
	 * @model opposite="networkInducedFailureType__CommunicationLinkResourceType" required="true" ordered="false"
	 * @generated
	 */
	CommunicationLinkResourceType getCommunicationLinkResourceType__NetworkInducedFailureType();

	/**
	 * Sets the value of the '{@link pcm.reliability.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Link Resource Type Network Induced Failure Type</em>' reference.
	 * @see #getCommunicationLinkResourceType__NetworkInducedFailureType()
	 * @generated
	 */
	void setCommunicationLinkResourceType__NetworkInducedFailureType(CommunicationLinkResourceType value);

} // NetworkInducedFailureType

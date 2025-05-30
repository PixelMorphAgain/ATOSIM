/**
 */
package pcm.reliability;

import pcm.seff.InternalAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Failure Occurrence Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Special&nbsp;case&nbsp;of&nbsp;a&nbsp;FailureOccurenceDescription&nbsp;specifying the software-induced failure potential of
 * InternalActions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.reliability.InternalFailureOccurrenceDescription#getInternalAction__InternalFailureOccurrenceDescription <em>Internal Action Internal Failure Occurrence Description</em>}</li>
 *   <li>{@link pcm.reliability.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription <em>Software Induced Failure Type Internal Failure Occurrence Description</em>}</li>
 * </ul>
 *
 * @see pcm.reliability.ReliabilityPackage#getInternalFailureOccurrenceDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG noResourceTimeoutFailureAllowedForInternalFailureOccurrenceDescription='not self.softwareInducedFailureType__InternalFailureOccurrenceDescription.oclIsTypeOf(ResourceTimeoutFailureType)'"
 * @generated
 */
public interface InternalFailureOccurrenceDescription extends FailureOccurrenceDescription {
	/**
	 * Returns the value of the '<em><b>Internal Action Internal Failure Occurrence Description</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.seff.InternalAction#getInternalFailureOccurrenceDescriptions__InternalAction <em>Internal Failure Occurrence Descriptions Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Action Internal Failure Occurrence Description</em>' container reference.
	 * @see #setInternalAction__InternalFailureOccurrenceDescription(InternalAction)
	 * @see pcm.reliability.ReliabilityPackage#getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription()
	 * @see pcm.seff.InternalAction#getInternalFailureOccurrenceDescriptions__InternalAction
	 * @model opposite="internalFailureOccurrenceDescriptions__InternalAction" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InternalAction getInternalAction__InternalFailureOccurrenceDescription();

	/**
	 * Sets the value of the '{@link pcm.reliability.InternalFailureOccurrenceDescription#getInternalAction__InternalFailureOccurrenceDescription <em>Internal Action Internal Failure Occurrence Description</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Action Internal Failure Occurrence Description</em>' container reference.
	 * @see #getInternalAction__InternalFailureOccurrenceDescription()
	 * @generated
	 */
	void setInternalAction__InternalFailureOccurrenceDescription(InternalAction value);

	/**
	 * Returns the value of the '<em><b>Software Induced Failure Type Internal Failure Occurrence Description</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcm.reliability.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType <em>Internal Failure Occurrence Descriptions Software Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Induced Failure Type Internal Failure Occurrence Description</em>' reference.
	 * @see #setSoftwareInducedFailureType__InternalFailureOccurrenceDescription(SoftwareInducedFailureType)
	 * @see pcm.reliability.ReliabilityPackage#getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription()
	 * @see pcm.reliability.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType
	 * @model opposite="internalFailureOccurrenceDescriptions__SoftwareInducedFailureType" required="true" ordered="false"
	 * @generated
	 */
	SoftwareInducedFailureType getSoftwareInducedFailureType__InternalFailureOccurrenceDescription();

	/**
	 * Sets the value of the '{@link pcm.reliability.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription <em>Software Induced Failure Type Internal Failure Occurrence Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Induced Failure Type Internal Failure Occurrence Description</em>' reference.
	 * @see #getSoftwareInducedFailureType__InternalFailureOccurrenceDescription()
	 * @generated
	 */
	void setSoftwareInducedFailureType__InternalFailureOccurrenceDescription(SoftwareInducedFailureType value);

} // InternalFailureOccurrenceDescription

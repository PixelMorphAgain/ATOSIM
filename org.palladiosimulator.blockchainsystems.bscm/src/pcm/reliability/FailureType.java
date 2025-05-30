/**
 */
package pcm.reliability;

import pcm.core.entity.Entity;

import pcm.repository.Repository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Abstract super class that&nbsp;provides a type definition for&nbsp;any failure-on-demand occurrence during service
 *     execution.&nbsp;
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.reliability.FailureType#getRepository__FailureType <em>Repository Failure Type</em>}</li>
 * </ul>
 *
 * @see pcm.reliability.ReliabilityPackage#getFailureType()
 * @model abstract="true"
 * @generated
 */
public interface FailureType extends Entity {
	/**
	 * Returns the value of the '<em><b>Repository Failure Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.repository.Repository#getFailureTypes__Repository <em>Failure Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Failure Type</em>' container reference.
	 * @see #setRepository__FailureType(Repository)
	 * @see pcm.reliability.ReliabilityPackage#getFailureType_Repository__FailureType()
	 * @see pcm.repository.Repository#getFailureTypes__Repository
	 * @model opposite="failureTypes__Repository" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Repository getRepository__FailureType();

	/**
	 * Sets the value of the '{@link pcm.reliability.FailureType#getRepository__FailureType <em>Repository Failure Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Failure Type</em>' container reference.
	 * @see #getRepository__FailureType()
	 * @generated
	 */
	void setRepository__FailureType(Repository value);

} // FailureType

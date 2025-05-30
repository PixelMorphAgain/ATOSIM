/**
 */
package pcm.reliability;

import pcm.PCMBaseClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Occurrence Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Abstract superclass that connects a failure type definition to an occurrence probability. Used to describe the failure
 *     potential of certain points of failure within the control and data flow (i.e. Actions within
 *     ResourceDemandingBehaviours).
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.reliability.FailureOccurrenceDescription#getFailureProbability <em>Failure Probability</em>}</li>
 * </ul>
 *
 * @see pcm.reliability.ReliabilityPackage#getFailureOccurrenceDescription()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ensureValidFailureProbabilityRange'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG ensureValidFailureProbabilityRange='(self.failureProbability.oclAsType(Real) &lt;= 1.0) and (self.failureProbability.oclAsType(Real) &gt;= 0.0)'"
 * @generated
 */
public interface FailureOccurrenceDescription extends PCMBaseClass {
	/**
	 * Returns the value of the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Probability</em>' attribute.
	 * @see #setFailureProbability(double)
	 * @see pcm.reliability.ReliabilityPackage#getFailureOccurrenceDescription_FailureProbability()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getFailureProbability();

	/**
	 * Sets the value of the '{@link pcm.reliability.FailureOccurrenceDescription#getFailureProbability <em>Failure Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Probability</em>' attribute.
	 * @see #getFailureProbability()
	 * @generated
	 */
	void setFailureProbability(double value);

} // FailureOccurrenceDescription

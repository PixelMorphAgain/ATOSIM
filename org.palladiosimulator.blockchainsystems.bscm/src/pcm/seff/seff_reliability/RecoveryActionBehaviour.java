/**
 */
package pcm.seff.seff_reliability;

import org.eclipse.emf.common.util.EList;

import pcm.seff.ResourceDemandingBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recovery Action Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Recovery block alternative haviours represent alternatives of recovery blocks. They are resource demanding behaviours,
 *     thus any behaviour can be defined as an alternative.
 * </p>
 * <p>
 *     The alternatives of a recovery block form a chain. They are failure handling entities, i.e.&nbsp;they can handle
 *     failures that occur in previous alternatives. If one alternative fails, the next alternative is executed that can
 *     handle the failure type.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.seff_reliability.RecoveryActionBehaviour#getFailureHandlingAlternatives__RecoveryActionBehaviour <em>Failure Handling Alternatives Recovery Action Behaviour</em>}</li>
 *   <li>{@link pcm.seff.seff_reliability.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}</li>
 * </ul>
 *
 * @see pcm.seff.seff_reliability.Seff_reliabilityPackage#getRecoveryActionBehaviour()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG recoveryActionBehaviourHasOnlyOnePredecessor='not self.recoveryAction__RecoveryActionBehaviour.recoveryActionBehaviours__RecoveryAction-&gt;\r\n\texists(x,y:RecoveryActionBehaviour | x&lt;&gt;y\r\n\t\tand x.failureHandlingAlternatives__RecoveryActionBehaviour-&gt;includes(self)\r\n\t\tand y.failureHandlingAlternatives__RecoveryActionBehaviour-&gt;includes(self))' recoveryActionBehaviourIsNotSuccessorOfItself='not self.failureHandlingAlternatives__RecoveryActionBehaviour-&gt;includes(self)' successorsOfRecoveryActionBehaviourHandleDisjointFailureTypes='not self.failureHandlingAlternatives__RecoveryActionBehaviour-&gt;\r\n\texists(x,y:RecoveryActionBehaviour | x&lt;&gt;y and\r\n\tx.failureTypes_FailureHandlingEntity-&gt;\r\n\t\texists(f:pcm::reliability::FailureType |\r\n\t\ty.failureTypes_FailureHandlingEntity-&gt;includes(f)))'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='recoveryActionBehaviourHasOnlyOnePredecessor recoveryActionBehaviourIsNotSuccessorOfItself successorsOfRecoveryActionBehaviourHandleDisjointFailureTypes'"
 * @generated
 */
public interface RecoveryActionBehaviour extends FailureHandlingEntity, ResourceDemandingBehaviour {
	/**
	 * Returns the value of the '<em><b>Failure Handling Alternatives Recovery Action Behaviour</b></em>' reference list.
	 * The list contents are of type {@link pcm.seff.seff_reliability.RecoveryActionBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Handling Alternatives Recovery Action Behaviour</em>' reference list.
	 * @see pcm.seff.seff_reliability.Seff_reliabilityPackage#getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RecoveryActionBehaviour> getFailureHandlingAlternatives__RecoveryActionBehaviour();

	/**
	 * Returns the value of the '<em><b>Recovery Action Recovery Action Behaviour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.seff.seff_reliability.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Action Recovery Action Behaviour</em>' container reference.
	 * @see #setRecoveryAction__RecoveryActionBehaviour(RecoveryAction)
	 * @see pcm.seff.seff_reliability.Seff_reliabilityPackage#getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour()
	 * @see pcm.seff.seff_reliability.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction
	 * @model opposite="recoveryActionBehaviours__RecoveryAction" required="true" transient="false" ordered="false"
	 * @generated
	 */
	RecoveryAction getRecoveryAction__RecoveryActionBehaviour();

	/**
	 * Sets the value of the '{@link pcm.seff.seff_reliability.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Action Recovery Action Behaviour</em>' container reference.
	 * @see #getRecoveryAction__RecoveryActionBehaviour()
	 * @generated
	 */
	void setRecoveryAction__RecoveryActionBehaviour(RecoveryAction value);

} // RecoveryActionBehaviour

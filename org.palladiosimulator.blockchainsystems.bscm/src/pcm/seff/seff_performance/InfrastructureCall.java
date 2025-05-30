/**
 */
package pcm.seff.seff_performance;

import pcm.core.PCMRandomVariable;

import pcm.repository.InfrastructureRequiredRole;
import pcm.repository.InfrastructureSignature;

import pcm.seff.AbstractInternalControlFlowAction;
import pcm.seff.CallAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.seff_performance.InfrastructureCall#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.InfrastructureCall#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.InfrastructureCall#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}</li>
 * </ul>
 *
 * @see pcm.seff.seff_performance.Seff_performancePackage#getInfrastructureCall()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='signatureMustBelongToUsedRequiredRole referencedRequiredRoleMustBeRequiredByComponent signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG signatureMustBelongToUsedRequiredRole='signature__InfrastructureCall.infrastructureInterface__InfrastructureSignature = requiredRole__InfrastructureCall.requiredInterface__InfrastructureRequiredRole' referencedRequiredRoleMustBeRequiredByComponent='self.oclAsType(ecore::EObject)-&gt;closure(eContainer())-&gt;select( entity | entity.oclIsKindOf(pcm::core::entity::InterfaceRequiringEntity)).oclAsType(pcm::core::entity::InterfaceRequiringEntity).requiredRoles_InterfaceRequiringEntity-&gt;includes(self.requiredRole__InfrastructureCall)' signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction='self.action__InfrastructureCall.infrastructureCall__Action-&gt;select(call | call.requiredRole__InfrastructureCall = self.requiredRole__InfrastructureCall and call.signature__InfrastructureCall=self.signature__InfrastructureCall)-&gt;size() = 1'"
 * @generated
 */
public interface InfrastructureCall extends CallAction {
	/**
	 * Returns the value of the '<em><b>Signature Infrastructure Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Infrastructure Call</em>' reference.
	 * @see #setSignature__InfrastructureCall(InfrastructureSignature)
	 * @see pcm.seff.seff_performance.Seff_performancePackage#getInfrastructureCall_Signature__InfrastructureCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureSignature getSignature__InfrastructureCall();

	/**
	 * Sets the value of the '{@link pcm.seff.seff_performance.InfrastructureCall#getSignature__InfrastructureCall <em>Signature Infrastructure Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Infrastructure Call</em>' reference.
	 * @see #getSignature__InfrastructureCall()
	 * @generated
	 */
	void setSignature__InfrastructureCall(InfrastructureSignature value);

	/**
	 * Returns the value of the '<em><b>Number Of Calls Infrastructure Call</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pcm.core.PCMRandomVariable#getInfrastructureCall__PCMRandomVariable <em>Infrastructure Call PCM Random Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Calls Infrastructure Call</em>' containment reference.
	 * @see #setNumberOfCalls__InfrastructureCall(PCMRandomVariable)
	 * @see pcm.seff.seff_performance.Seff_performancePackage#getInfrastructureCall_NumberOfCalls__InfrastructureCall()
	 * @see pcm.core.PCMRandomVariable#getInfrastructureCall__PCMRandomVariable
	 * @model opposite="infrastructureCall__PCMRandomVariable" containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getNumberOfCalls__InfrastructureCall();

	/**
	 * Sets the value of the '{@link pcm.seff.seff_performance.InfrastructureCall#getNumberOfCalls__InfrastructureCall <em>Number Of Calls Infrastructure Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Calls Infrastructure Call</em>' containment reference.
	 * @see #getNumberOfCalls__InfrastructureCall()
	 * @generated
	 */
	void setNumberOfCalls__InfrastructureCall(PCMRandomVariable value);

	/**
	 * Returns the value of the '<em><b>Action Infrastructure Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.seff.AbstractInternalControlFlowAction#getInfrastructureCall__Action <em>Infrastructure Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Infrastructure Call</em>' container reference.
	 * @see #setAction__InfrastructureCall(AbstractInternalControlFlowAction)
	 * @see pcm.seff.seff_performance.Seff_performancePackage#getInfrastructureCall_Action__InfrastructureCall()
	 * @see pcm.seff.AbstractInternalControlFlowAction#getInfrastructureCall__Action
	 * @model opposite="infrastructureCall__Action" required="true" transient="false" ordered="false"
	 * @generated
	 */
	AbstractInternalControlFlowAction getAction__InfrastructureCall();

	/**
	 * Sets the value of the '{@link pcm.seff.seff_performance.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Infrastructure Call</em>' container reference.
	 * @see #getAction__InfrastructureCall()
	 * @generated
	 */
	void setAction__InfrastructureCall(AbstractInternalControlFlowAction value);

	/**
	 * Returns the value of the '<em><b>Required Role Infrastructure Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role Infrastructure Call</em>' reference.
	 * @see #setRequiredRole__InfrastructureCall(InfrastructureRequiredRole)
	 * @see pcm.seff.seff_performance.Seff_performancePackage#getInfrastructureCall_RequiredRole__InfrastructureCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureRequiredRole getRequiredRole__InfrastructureCall();

	/**
	 * Sets the value of the '{@link pcm.seff.seff_performance.InfrastructureCall#getRequiredRole__InfrastructureCall <em>Required Role Infrastructure Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role Infrastructure Call</em>' reference.
	 * @see #getRequiredRole__InfrastructureCall()
	 * @generated
	 */
	void setRequiredRole__InfrastructureCall(InfrastructureRequiredRole value);

} // InfrastructureCall

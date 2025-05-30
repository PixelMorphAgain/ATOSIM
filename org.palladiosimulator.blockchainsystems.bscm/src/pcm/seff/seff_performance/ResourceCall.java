/**
 */
package pcm.seff.seff_performance;

import pcm.core.PCMRandomVariable;

import pcm.core.entity.ResourceRequiredRole;

import pcm.resourcetype.ResourceSignature;

import pcm.seff.AbstractInternalControlFlowAction;
import pcm.seff.CallAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.seff_performance.ResourceCall#getAction__ResourceCall <em>Action Resource Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.ResourceCall#getResourceRequiredRole__ResourceCall <em>Resource Required Role Resource Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.ResourceCall#getSignature__ResourceCall <em>Signature Resource Call</em>}</li>
 *   <li>{@link pcm.seff.seff_performance.ResourceCall#getNumberOfCalls__ResourceCall <em>Number Of Calls Resource Call</em>}</li>
 * </ul>
 *
 * @see pcm.seff.seff_performance.Seff_performancePackage#getResourceCall()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='resourceSignatureBelongsToResourceRequiredRole resourceRequiredRoleMustBeReferencedByComponent signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG resourceSignatureBelongsToResourceRequiredRole='self.resourceRequiredRole__ResourceCall.requiredResourceInterface__ResourceRequiredRole.resourceSignatures__ResourceInterface-&gt;includes(self.signature__ResourceCall)' resourceRequiredRoleMustBeReferencedByComponent='self.oclAsType(ecore::EObject)-&gt;closure(eContainer())-&gt;select( entity | entity.oclIsKindOf(pcm::core::entity::ResourceInterfaceRequiringEntity)).oclAsType(pcm::core::entity::ResourceInterfaceRequiringEntity).resourceRequiredRoles__ResourceInterfaceRequiringEntity-&gt;includes(self.resourceRequiredRole__ResourceCall)' signatureRoleCombinationMustBeUniqueWithinAbstractInternalControlFlowAction='self.action__ResourceCall.resourceCall__Action-&gt;select(call | call.resourceRequiredRole__ResourceCall=self.resourceRequiredRole__ResourceCall and call.signature__ResourceCall=self.signature__ResourceCall)-&gt;size() = 1'"
 * @generated
 */
public interface ResourceCall extends CallAction {
	/**
	 * Returns the value of the '<em><b>Action Resource Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.seff.AbstractInternalControlFlowAction#getResourceCall__Action <em>Resource Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Resource Call</em>' container reference.
	 * @see #setAction__ResourceCall(AbstractInternalControlFlowAction)
	 * @see pcm.seff.seff_performance.Seff_performancePackage#getResourceCall_Action__ResourceCall()
	 * @see pcm.seff.AbstractInternalControlFlowAction#getResourceCall__Action
	 * @model opposite="resourceCall__Action" required="true" transient="false" ordered="false"
	 * @generated
	 */
	AbstractInternalControlFlowAction getAction__ResourceCall();

	/**
	 * Sets the value of the '{@link pcm.seff.seff_performance.ResourceCall#getAction__ResourceCall <em>Action Resource Call</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Resource Call</em>' container reference.
	 * @see #getAction__ResourceCall()
	 * @generated
	 */
	void setAction__ResourceCall(AbstractInternalControlFlowAction value);

	/**
	 * Returns the value of the '<em><b>Resource Required Role Resource Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Required Role Resource Call</em>' reference.
	 * @see #setResourceRequiredRole__ResourceCall(ResourceRequiredRole)
	 * @see pcm.seff.seff_performance.Seff_performancePackage#getResourceCall_ResourceRequiredRole__ResourceCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceRequiredRole getResourceRequiredRole__ResourceCall();

	/**
	 * Sets the value of the '{@link pcm.seff.seff_performance.ResourceCall#getResourceRequiredRole__ResourceCall <em>Resource Required Role Resource Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Required Role Resource Call</em>' reference.
	 * @see #getResourceRequiredRole__ResourceCall()
	 * @generated
	 */
	void setResourceRequiredRole__ResourceCall(ResourceRequiredRole value);

	/**
	 * Returns the value of the '<em><b>Signature Resource Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Resource Call</em>' reference.
	 * @see #setSignature__ResourceCall(ResourceSignature)
	 * @see pcm.seff.seff_performance.Seff_performancePackage#getResourceCall_Signature__ResourceCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceSignature getSignature__ResourceCall();

	/**
	 * Sets the value of the '{@link pcm.seff.seff_performance.ResourceCall#getSignature__ResourceCall <em>Signature Resource Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Resource Call</em>' reference.
	 * @see #getSignature__ResourceCall()
	 * @generated
	 */
	void setSignature__ResourceCall(ResourceSignature value);

	/**
	 * Returns the value of the '<em><b>Number Of Calls Resource Call</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pcm.core.PCMRandomVariable#getResourceCall__PCMRandomVariable <em>Resource Call PCM Random Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Calls Resource Call</em>' containment reference.
	 * @see #setNumberOfCalls__ResourceCall(PCMRandomVariable)
	 * @see pcm.seff.seff_performance.Seff_performancePackage#getResourceCall_NumberOfCalls__ResourceCall()
	 * @see pcm.core.PCMRandomVariable#getResourceCall__PCMRandomVariable
	 * @model opposite="resourceCall__PCMRandomVariable" containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getNumberOfCalls__ResourceCall();

	/**
	 * Sets the value of the '{@link pcm.seff.seff_performance.ResourceCall#getNumberOfCalls__ResourceCall <em>Number Of Calls Resource Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Calls Resource Call</em>' containment reference.
	 * @see #getNumberOfCalls__ResourceCall()
	 * @generated
	 */
	void setNumberOfCalls__ResourceCall(PCMRandomVariable value);

} // ResourceCall

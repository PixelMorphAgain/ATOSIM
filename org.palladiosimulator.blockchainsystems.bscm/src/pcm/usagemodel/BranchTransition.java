/**
 */
package pcm.usagemodel;

import pcm.PCMBaseClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The BranchTransition is an association class that realises the containment of ScenarioBehaviours in in the branches of a Branch action. It is a separate meta class because it has the additional attribute branchProbability that specifies how probably it is that the references ScenarioBehaviour is executed in the Branch action. 
 * 
 * See also Branch.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.usagemodel.BranchTransition#getBranchProbability <em>Branch Probability</em>}</li>
 *   <li>{@link pcm.usagemodel.BranchTransition#getBranch_BranchTransition <em>Branch Branch Transition</em>}</li>
 *   <li>{@link pcm.usagemodel.BranchTransition#getBranchedBehaviour_BranchTransition <em>Branched Behaviour Branch Transition</em>}</li>
 * </ul>
 *
 * @see pcm.usagemodel.UsagemodelPackage#getBranchTransition()
 * @model
 * @generated
 */
public interface BranchTransition extends PCMBaseClass {
	/**
	 * Returns the value of the '<em><b>Branch Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Probability</em>' attribute.
	 * @see #setBranchProbability(double)
	 * @see pcm.usagemodel.UsagemodelPackage#getBranchTransition_BranchProbability()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getBranchProbability();

	/**
	 * Sets the value of the '{@link pcm.usagemodel.BranchTransition#getBranchProbability <em>Branch Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Probability</em>' attribute.
	 * @see #getBranchProbability()
	 * @generated
	 */
	void setBranchProbability(double value);

	/**
	 * Returns the value of the '<em><b>Branch Branch Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.usagemodel.Branch#getBranchTransitions_Branch <em>Branch Transitions Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Branch Transition</em>' container reference.
	 * @see #setBranch_BranchTransition(Branch)
	 * @see pcm.usagemodel.UsagemodelPackage#getBranchTransition_Branch_BranchTransition()
	 * @see pcm.usagemodel.Branch#getBranchTransitions_Branch
	 * @model opposite="branchTransitions_Branch" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Branch getBranch_BranchTransition();

	/**
	 * Sets the value of the '{@link pcm.usagemodel.BranchTransition#getBranch_BranchTransition <em>Branch Branch Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Branch Transition</em>' container reference.
	 * @see #getBranch_BranchTransition()
	 * @generated
	 */
	void setBranch_BranchTransition(Branch value);

	/**
	 * Returns the value of the '<em><b>Branched Behaviour Branch Transition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pcm.usagemodel.ScenarioBehaviour#getBranchTransition_ScenarioBehaviour <em>Branch Transition Scenario Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branched Behaviour Branch Transition</em>' containment reference.
	 * @see #setBranchedBehaviour_BranchTransition(ScenarioBehaviour)
	 * @see pcm.usagemodel.UsagemodelPackage#getBranchTransition_BranchedBehaviour_BranchTransition()
	 * @see pcm.usagemodel.ScenarioBehaviour#getBranchTransition_ScenarioBehaviour
	 * @model opposite="branchTransition_ScenarioBehaviour" containment="true" required="true" ordered="false"
	 * @generated
	 */
	ScenarioBehaviour getBranchedBehaviour_BranchTransition();

	/**
	 * Sets the value of the '{@link pcm.usagemodel.BranchTransition#getBranchedBehaviour_BranchTransition <em>Branched Behaviour Branch Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branched Behaviour Branch Transition</em>' containment reference.
	 * @see #getBranchedBehaviour_BranchTransition()
	 * @generated
	 */
	void setBranchedBehaviour_BranchTransition(ScenarioBehaviour value);

} // BranchTransition

/**
 */
package pcm.usagemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Branch splits the user flow with a XOR-semantic: one of the included BranchTransitions
 * is taken depending on the specified branch probabilities. Each BranchTransition contains a
 * nested ScenarioBehaviour, which a user executes once this branch transition is chosen. After
 * execution of the complete nested ScenarioBehaviour, the next action in the user flow after the
 * Branch is its successor action.
 * 
 * A constraint ensures that all branchProbabilities of the included BranchTransitions sum up to 1. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.usagemodel.Branch#getBranchTransitions_Branch <em>Branch Transitions Branch</em>}</li>
 * </ul>
 *
 * @see pcm.usagemodel.UsagemodelPackage#getBranch()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='allBranchProbabilitiesMustSumUpTo1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG allBranchProbabilitiesMustSumUpTo1='self-&gt;collect(branchTransitions_Branch.branchProbability)-&gt;sum() &gt; 0.999 and self-&gt;collect(branchTransitions_Branch.branchProbability)-&gt;sum() &lt;1.001'"
 * @generated
 */
public interface Branch extends AbstractUserAction {
	/**
	 * Returns the value of the '<em><b>Branch Transitions Branch</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.usagemodel.BranchTransition}.
	 * It is bidirectional and its opposite is '{@link pcm.usagemodel.BranchTransition#getBranch_BranchTransition <em>Branch Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Transitions Branch</em>' containment reference list.
	 * @see pcm.usagemodel.UsagemodelPackage#getBranch_BranchTransitions_Branch()
	 * @see pcm.usagemodel.BranchTransition#getBranch_BranchTransition
	 * @model opposite="branch_BranchTransition" containment="true" ordered="false"
	 * @generated
	 */
	EList<BranchTransition> getBranchTransitions_Branch();

} // Branch

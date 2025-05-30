/**
 */
package pcm.seff;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The BranchAction splits the RDSEFF control flow with an XOR-semantic, meaning that the control flow continues on exactly one of its attached AbstractBranchTransitions. The RDSEFF supports two different kinds of branch transitions, GuardedBranchTransitions, and  ProbabilisticBranchTransitions. RDSEFFs do not allow to use both kinds of transitions on a single BranchAction. Analysis or simulation tools must select exactly one transition based on the included guard or probability, before continuing at a BranchAction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.BranchAction#getBranches_Branch <em>Branches Branch</em>}</li>
 * </ul>
 *
 * @see pcm.seff.SeffPackage#getBranchAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='eitherGuardedBranchesOrProbabilisiticBranchTransitions allProbabilisticBranchProbabilitiesMustSumUpTo1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG eitherGuardedBranchesOrProbabilisiticBranchTransitions='self.branches_Branch-&gt;forAll(bt|bt.oclIsTypeOf(ProbabilisticBranchTransition)) \r\nor self.branches_Branch-&gt;forAll(bt|bt.oclIsTypeOf(GuardedBranchTransition))' allProbabilisticBranchProbabilitiesMustSumUpTo1='if self.branches_Branch-&gt;forAll(oclIsTypeOf(ProbabilisticBranchTransition)) then \r\n\tself.branches_Branch-&gt;select(pbt|pbt.oclIsTypeOf(ProbabilisticBranchTransition))-&gt;collect(pbt|pbt.oclAsType(ProbabilisticBranchTransition).branchProbability)-&gt;sum() &gt; 0.9999 \r\n\tand self.branches_Branch-&gt;select(pbt|pbt.oclIsTypeOf(ProbabilisticBranchTransition))-&gt;collect(pbt|pbt.oclAsType(ProbabilisticBranchTransition).branchProbability)-&gt;sum() &lt; 1.0001 \r\n\telse true \r\nendif'"
 * @generated
 */
public interface BranchAction extends AbstractInternalControlFlowAction {
	/**
	 * Returns the value of the '<em><b>Branches Branch</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.seff.AbstractBranchTransition}.
	 * It is bidirectional and its opposite is '{@link pcm.seff.AbstractBranchTransition#getBranchAction_AbstractBranchTransition <em>Branch Action Abstract Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches Branch</em>' containment reference list.
	 * @see pcm.seff.SeffPackage#getBranchAction_Branches_Branch()
	 * @see pcm.seff.AbstractBranchTransition#getBranchAction_AbstractBranchTransition
	 * @model opposite="branchAction_AbstractBranchTransition" containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractBranchTransition> getBranches_Branch();

} // BranchAction

/**
 */
package pcm.usagemodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ScenarioBehaviour specifies possible sequences of executing services provided by the system.
 * It contains a set of AbstractUserActions, each referencing a predecessor and successor (except the
 * first and last action), thereby forming a sequence of actions. 
 * 
 * See the AbstractAction documentation for why it is advantageous
 * to model control flow in this way, as the same principle is used in the RDSEFF language. 
 * 
 * Concrete user actions of the usage model are:
 * - Branch
 * - Loop
 * - EntryLevelSystemCall
 * - Delay
 * - Start 
 * - Stop
 * 
 * So far, ScenarioBehaviours do not include forks in the user flow (i.e., splitting the flow with an
 * AND semantic), as it is assumed that users always act sequentially.
 * 
 * As there are no random variables depending on other variables in the
 * usage model, there are no equivalent actions to GuardedBranchTransitions or CollectionIteratorActions.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.usagemodel.ScenarioBehaviour#getUsageScenario_SenarioBehaviour <em>Usage Scenario Senario Behaviour</em>}</li>
 *   <li>{@link pcm.usagemodel.ScenarioBehaviour#getBranchTransition_ScenarioBehaviour <em>Branch Transition Scenario Behaviour</em>}</li>
 *   <li>{@link pcm.usagemodel.ScenarioBehaviour#getLoop_ScenarioBehaviour <em>Loop Scenario Behaviour</em>}</li>
 *   <li>{@link pcm.usagemodel.ScenarioBehaviour#getActions_ScenarioBehaviour <em>Actions Scenario Behaviour</em>}</li>
 * </ul>
 *
 * @see pcm.usagemodel.UsagemodelPackage#getScenarioBehaviour()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='eachuseractionexceptStartandStopmusthaveapredecessorandsuccessor exactlyonestart exactlyonestop'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG eachuseractionexceptStartandStopmusthaveapredecessorandsuccessor='not self.actions_ScenarioBehaviour-&gt;select(s|not s.oclIsTypeOf(Start) and not s.oclIsTypeOf(Stop))-&gt;exists(a|a.oclAsType(AbstractUserAction).predecessor.oclIsUndefined()) and not self.actions_ScenarioBehaviour-&gt;select(s|not s.oclIsTypeOf(Start) and not s.oclIsTypeOf(Stop))-&gt;exists(a|a.oclAsType(AbstractUserAction).successor.oclIsUndefined())' exactlyonestart='self.actions_ScenarioBehaviour-&gt;select(s|s.oclIsTypeOf(Start))-&gt;size() = 1' exactlyonestop='self.actions_ScenarioBehaviour-&gt;select(s|s.oclIsTypeOf(Stop))-&gt;size() = 1'"
 * @generated
 */
public interface ScenarioBehaviour extends Entity {
	/**
	 * Returns the value of the '<em><b>Usage Scenario Senario Behaviour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.usagemodel.UsageScenario#getScenarioBehaviour_UsageScenario <em>Scenario Behaviour Usage Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Scenario Senario Behaviour</em>' container reference.
	 * @see #setUsageScenario_SenarioBehaviour(UsageScenario)
	 * @see pcm.usagemodel.UsagemodelPackage#getScenarioBehaviour_UsageScenario_SenarioBehaviour()
	 * @see pcm.usagemodel.UsageScenario#getScenarioBehaviour_UsageScenario
	 * @model opposite="scenarioBehaviour_UsageScenario" transient="false" ordered="false"
	 * @generated
	 */
	UsageScenario getUsageScenario_SenarioBehaviour();

	/**
	 * Sets the value of the '{@link pcm.usagemodel.ScenarioBehaviour#getUsageScenario_SenarioBehaviour <em>Usage Scenario Senario Behaviour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Scenario Senario Behaviour</em>' container reference.
	 * @see #getUsageScenario_SenarioBehaviour()
	 * @generated
	 */
	void setUsageScenario_SenarioBehaviour(UsageScenario value);

	/**
	 * Returns the value of the '<em><b>Branch Transition Scenario Behaviour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.usagemodel.BranchTransition#getBranchedBehaviour_BranchTransition <em>Branched Behaviour Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Transition Scenario Behaviour</em>' container reference.
	 * @see #setBranchTransition_ScenarioBehaviour(BranchTransition)
	 * @see pcm.usagemodel.UsagemodelPackage#getScenarioBehaviour_BranchTransition_ScenarioBehaviour()
	 * @see pcm.usagemodel.BranchTransition#getBranchedBehaviour_BranchTransition
	 * @model opposite="branchedBehaviour_BranchTransition" transient="false" ordered="false"
	 * @generated
	 */
	BranchTransition getBranchTransition_ScenarioBehaviour();

	/**
	 * Sets the value of the '{@link pcm.usagemodel.ScenarioBehaviour#getBranchTransition_ScenarioBehaviour <em>Branch Transition Scenario Behaviour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Transition Scenario Behaviour</em>' container reference.
	 * @see #getBranchTransition_ScenarioBehaviour()
	 * @generated
	 */
	void setBranchTransition_ScenarioBehaviour(BranchTransition value);

	/**
	 * Returns the value of the '<em><b>Loop Scenario Behaviour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.usagemodel.Loop#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Scenario Behaviour</em>' container reference.
	 * @see #setLoop_ScenarioBehaviour(Loop)
	 * @see pcm.usagemodel.UsagemodelPackage#getScenarioBehaviour_Loop_ScenarioBehaviour()
	 * @see pcm.usagemodel.Loop#getBodyBehaviour_Loop
	 * @model opposite="bodyBehaviour_Loop" transient="false" ordered="false"
	 * @generated
	 */
	Loop getLoop_ScenarioBehaviour();

	/**
	 * Sets the value of the '{@link pcm.usagemodel.ScenarioBehaviour#getLoop_ScenarioBehaviour <em>Loop Scenario Behaviour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Scenario Behaviour</em>' container reference.
	 * @see #getLoop_ScenarioBehaviour()
	 * @generated
	 */
	void setLoop_ScenarioBehaviour(Loop value);

	/**
	 * Returns the value of the '<em><b>Actions Scenario Behaviour</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.usagemodel.AbstractUserAction}.
	 * It is bidirectional and its opposite is '{@link pcm.usagemodel.AbstractUserAction#getScenarioBehaviour_AbstractUserAction <em>Scenario Behaviour Abstract User Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Scenario Behaviour</em>' containment reference list.
	 * @see pcm.usagemodel.UsagemodelPackage#getScenarioBehaviour_Actions_ScenarioBehaviour()
	 * @see pcm.usagemodel.AbstractUserAction#getScenarioBehaviour_AbstractUserAction
	 * @model opposite="scenarioBehaviour_AbstractUserAction" containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractUserAction> getActions_ScenarioBehaviour();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model diagnosticsRequired="true" contextRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore invariant='true'"
	 * @generated
	 */
	boolean routeFromStartToStopAction(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ScenarioBehaviour

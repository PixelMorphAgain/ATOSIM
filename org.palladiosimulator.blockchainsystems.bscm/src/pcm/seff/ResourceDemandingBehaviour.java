/**
 */
package pcm.seff;

import identifier.Identifier;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import pcm.PCMBaseClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Demanding Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Models the behaviour of a component service as a sequence of internal actions with resource demands, control flow constructs, and external
 * calls. Therefore, the class contains a chain of AbstractActions. The emphasis in this type of behaviour is on the resource demands attached to internal actions, which mainly influence performance analysis.
 * Each action in a ResourceDemandingBehaviour references a predecessor and a successor action. Exceptions are the first and last action, which do not reference a predecessor and a successor respectively. A behaviour is valid, if there is a continuous path from the first to last action, which includes all actions. The chain must not include cycles. To specify control flow branches, loops, or forks, component developers need to use special types of actions, which contain nested inner ResourceDemandingBehaviours to specify the behaviour inside branches or loop bodies. Any ResourceDemandingBehaviour can have at most one starting and one finishing action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.ResourceDemandingBehaviour#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}</li>
 *   <li>{@link pcm.seff.ResourceDemandingBehaviour#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}</li>
 *   <li>{@link pcm.seff.ResourceDemandingBehaviour#getSteps_Behaviour <em>Steps Behaviour</em>}</li>
 * </ul>
 *
 * @see pcm.seff.SeffPackage#getResourceDemandingBehaviour()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='exactlyOneStopAction exactlyOneStartAction eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG exactlyOneStopAction='self.steps_Behaviour-&gt;select(s|s.oclIsTypeOf(StopAction))-&gt;size() = 1' exactlyOneStartAction='self.steps_Behaviour-&gt;select(s|s.oclIsTypeOf(StartAction))-&gt;size() = 1' eachActionExceptStartActionandStopActionMustHhaveAPredecessorAndSuccessor='not self.steps_Behaviour-&gt;select(s|not s.oclIsTypeOf(StartAction) and not s.oclIsTypeOf(StopAction))-&gt;exists(a|a.oclAsType(AbstractAction).predecessor_AbstractAction.oclIsUndefined()) and not self.steps_Behaviour-&gt;select(s|not s.oclIsTypeOf(StartAction) and not s.oclIsTypeOf(StopAction))-&gt;exists(a|a.oclAsType(AbstractAction).successor_AbstractAction.oclIsUndefined())'"
 * @generated
 */
public interface ResourceDemandingBehaviour extends Identifier, PCMBaseClass {
	/**
	 * Returns the value of the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.seff.AbstractLoopAction#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Loop Action Resource Demanding Behaviour</em>' container reference.
	 * @see #setAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction)
	 * @see pcm.seff.SeffPackage#getResourceDemandingBehaviour_AbstractLoopAction_ResourceDemandingBehaviour()
	 * @see pcm.seff.AbstractLoopAction#getBodyBehaviour_Loop
	 * @model opposite="bodyBehaviour_Loop" transient="false" ordered="false"
	 * @generated
	 */
	AbstractLoopAction getAbstractLoopAction_ResourceDemandingBehaviour();

	/**
	 * Sets the value of the '{@link pcm.seff.ResourceDemandingBehaviour#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Loop Action Resource Demanding Behaviour</em>' container reference.
	 * @see #getAbstractLoopAction_ResourceDemandingBehaviour()
	 * @generated
	 */
	void setAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction value);

	/**
	 * Returns the value of the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.seff.AbstractBranchTransition#getBranchBehaviour_BranchTransition <em>Branch Behaviour Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Branch Transition Resource Demanding Behaviour</em>' container reference.
	 * @see #setAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition)
	 * @see pcm.seff.SeffPackage#getResourceDemandingBehaviour_AbstractBranchTransition_ResourceDemandingBehaviour()
	 * @see pcm.seff.AbstractBranchTransition#getBranchBehaviour_BranchTransition
	 * @model opposite="branchBehaviour_BranchTransition" transient="false" ordered="false"
	 * @generated
	 */
	AbstractBranchTransition getAbstractBranchTransition_ResourceDemandingBehaviour();

	/**
	 * Sets the value of the '{@link pcm.seff.ResourceDemandingBehaviour#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Branch Transition Resource Demanding Behaviour</em>' container reference.
	 * @see #getAbstractBranchTransition_ResourceDemandingBehaviour()
	 * @generated
	 */
	void setAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition value);

	/**
	 * Returns the value of the '<em><b>Steps Behaviour</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.seff.AbstractAction}.
	 * It is bidirectional and its opposite is '{@link pcm.seff.AbstractAction#getResourceDemandingBehaviour_AbstractAction <em>Resource Demanding Behaviour Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps Behaviour</em>' containment reference list.
	 * @see pcm.seff.SeffPackage#getResourceDemandingBehaviour_Steps_Behaviour()
	 * @see pcm.seff.AbstractAction#getResourceDemandingBehaviour_AbstractAction
	 * @model opposite="resourceDemandingBehaviour_AbstractAction" containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractAction> getSteps_Behaviour();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model diagnosticsRequired="true" contextRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore invariant='true'"
	 * @generated
	 */
	boolean startActionNeedsRouteToStopAction(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ResourceDemandingBehaviour

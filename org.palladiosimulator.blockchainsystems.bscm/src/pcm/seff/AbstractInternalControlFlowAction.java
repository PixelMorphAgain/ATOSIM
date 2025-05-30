/**
 */
package pcm.seff;

import org.eclipse.emf.common.util.EList;

import pcm.seff.seff_performance.InfrastructureCall;
import pcm.seff.seff_performance.ParametricResourceDemand;
import pcm.seff.seff_performance.ResourceCall;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Internal Control Flow Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Abstract parent class of any internal control flow (e.g. InternalAction)
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.AbstractInternalControlFlowAction#getResourceDemand_Action <em>Resource Demand Action</em>}</li>
 *   <li>{@link pcm.seff.AbstractInternalControlFlowAction#getInfrastructureCall__Action <em>Infrastructure Call Action</em>}</li>
 *   <li>{@link pcm.seff.AbstractInternalControlFlowAction#getResourceCall__Action <em>Resource Call Action</em>}</li>
 * </ul>
 *
 * @see pcm.seff.SeffPackage#getAbstractInternalControlFlowAction()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInternalControlFlowAction extends AbstractAction {
	/**
	 * Returns the value of the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.seff.seff_performance.ParametricResourceDemand}.
	 * It is bidirectional and its opposite is '{@link pcm.seff.seff_performance.ParametricResourceDemand#getAction_ParametricResourceDemand <em>Action Parametric Resource Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Demand Action</em>' containment reference list.
	 * @see pcm.seff.SeffPackage#getAbstractInternalControlFlowAction_ResourceDemand_Action()
	 * @see pcm.seff.seff_performance.ParametricResourceDemand#getAction_ParametricResourceDemand
	 * @model opposite="action_ParametricResourceDemand" containment="true" ordered="false"
	 * @generated
	 */
	EList<ParametricResourceDemand> getResourceDemand_Action();

	/**
	 * Returns the value of the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.seff.seff_performance.InfrastructureCall}.
	 * It is bidirectional and its opposite is '{@link pcm.seff.seff_performance.InfrastructureCall#getAction__InfrastructureCall <em>Action Infrastructure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Call Action</em>' containment reference list.
	 * @see pcm.seff.SeffPackage#getAbstractInternalControlFlowAction_InfrastructureCall__Action()
	 * @see pcm.seff.seff_performance.InfrastructureCall#getAction__InfrastructureCall
	 * @model opposite="action__InfrastructureCall" containment="true" ordered="false"
	 * @generated
	 */
	EList<InfrastructureCall> getInfrastructureCall__Action();

	/**
	 * Returns the value of the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.seff.seff_performance.ResourceCall}.
	 * It is bidirectional and its opposite is '{@link pcm.seff.seff_performance.ResourceCall#getAction__ResourceCall <em>Action Resource Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Call Action</em>' containment reference list.
	 * @see pcm.seff.SeffPackage#getAbstractInternalControlFlowAction_ResourceCall__Action()
	 * @see pcm.seff.seff_performance.ResourceCall#getAction__ResourceCall
	 * @model opposite="action__ResourceCall" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceCall> getResourceCall__Action();

} // AbstractInternalControlFlowAction

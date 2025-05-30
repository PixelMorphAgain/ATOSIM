/**
 */
package pcm.usagemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each ScenarioBehaviour has exactly one Start action which marks the action where the control flows begins. Start actions have no predecessor.
 * <!-- end-model-doc -->
 *
 *
 * @see pcm.usagemodel.UsagemodelPackage#getStart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='startHasNoPredecessor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG startHasNoPredecessor='self.predecessor.oclIsUndefined()'"
 * @generated
 */
public interface Start extends AbstractUserAction {
} // Start

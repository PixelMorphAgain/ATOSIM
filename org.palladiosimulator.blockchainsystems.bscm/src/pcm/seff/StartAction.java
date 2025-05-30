/**
 */
package pcm.seff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StartActions initiate a scenario behaviour and contain only a successor.
 * <!-- end-model-doc -->
 *
 *
 * @see pcm.seff.SeffPackage#getStartAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='startActionPredecessorMustNotBeDefined'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG startActionPredecessorMustNotBeDefined='self.predecessor_AbstractAction.oclIsUndefined()'"
 * @generated
 */
public interface StartAction extends AbstractInternalControlFlowAction {
} // StartAction

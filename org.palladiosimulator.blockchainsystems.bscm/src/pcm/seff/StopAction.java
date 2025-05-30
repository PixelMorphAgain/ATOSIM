/**
 */
package pcm.seff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StopActions end a scenario behaviour and contain only a predecessor.
 * <!-- end-model-doc -->
 *
 *
 * @see pcm.seff.SeffPackage#getStopAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='stopActionSuccessorMustNotBeDefined'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG stopActionSuccessorMustNotBeDefined='self.successor_AbstractAction.oclIsUndefined()'"
 * @generated
 */
public interface StopAction extends AbstractInternalControlFlowAction {
} // StopAction

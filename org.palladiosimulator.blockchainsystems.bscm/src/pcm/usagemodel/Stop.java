/**
 */
package pcm.usagemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each ScenarioBehaviour has exactly one Stop action which marks the action where the control flows ends. Stop actions have no successor.
 * <!-- end-model-doc -->
 *
 *
 * @see pcm.usagemodel.UsagemodelPackage#getStop()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='stopHasNoSuccessor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG stopHasNoSuccessor='self.successor.oclIsUndefined()'"
 * @generated
 */
public interface Stop extends AbstractUserAction {
} // Stop

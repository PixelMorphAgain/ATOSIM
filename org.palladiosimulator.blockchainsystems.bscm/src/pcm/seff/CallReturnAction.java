/**
 */
package pcm.seff;

import org.eclipse.emf.common.util.EList;

import pcm.parameter.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Return Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic class realising call relations between behaviours (e.g. method call) for calls with parameters send to the called signature and return values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.CallReturnAction#getReturnVariableUsage__CallReturnAction <em>Return Variable Usage Call Return Action</em>}</li>
 * </ul>
 *
 * @see pcm.seff.SeffPackage#getCallReturnAction()
 * @model
 * @generated
 */
public interface CallReturnAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Return Variable Usage Call Return Action</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.parameter.VariableUsage}.
	 * It is bidirectional and its opposite is '{@link pcm.parameter.VariableUsage#getCallReturnAction__VariableUsage <em>Call Return Action Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Variable Usage Call Return Action</em>' containment reference list.
	 * @see pcm.seff.SeffPackage#getCallReturnAction_ReturnVariableUsage__CallReturnAction()
	 * @see pcm.parameter.VariableUsage#getCallReturnAction__VariableUsage
	 * @model opposite="callReturnAction__VariableUsage" containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getReturnVariableUsage__CallReturnAction();

} // CallReturnAction

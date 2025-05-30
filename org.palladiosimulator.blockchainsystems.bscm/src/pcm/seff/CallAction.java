/**
 */
package pcm.seff;

import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

import pcm.parameter.VariableUsage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic class realising call relations between behaviours (e.g. method call).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.CallAction#getInputVariableUsages__CallAction <em>Input Variable Usages Call Action</em>}</li>
 * </ul>
 *
 * @see pcm.seff.SeffPackage#getCallAction()
 * @model abstract="true"
 * @generated
 */
public interface CallAction extends Entity {
	/**
	 * Returns the value of the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.parameter.VariableUsage}.
	 * It is bidirectional and its opposite is '{@link pcm.parameter.VariableUsage#getCallAction__VariableUsage <em>Call Action Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Variable Usages Call Action</em>' containment reference list.
	 * @see pcm.seff.SeffPackage#getCallAction_InputVariableUsages__CallAction()
	 * @see pcm.parameter.VariableUsage#getCallAction__VariableUsage
	 * @model opposite="callAction__VariableUsage" containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getInputVariableUsages__CallAction();

} // CallAction

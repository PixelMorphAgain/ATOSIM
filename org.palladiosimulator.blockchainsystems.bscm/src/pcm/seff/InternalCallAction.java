/**
 */
package pcm.seff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A "SubSEFF"-Action: Realises an internal method call within a SEFF.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.InternalCallAction#getCalledResourceDemandingInternalBehaviour <em>Called Resource Demanding Internal Behaviour</em>}</li>
 * </ul>
 *
 * @see pcm.seff.SeffPackage#getInternalCallAction()
 * @model
 * @generated
 */
public interface InternalCallAction extends CallAction, AbstractInternalControlFlowAction {
	/**
	 * Returns the value of the '<em><b>Called Resource Demanding Internal Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Resource Demanding Internal Behaviour</em>' reference.
	 * @see #setCalledResourceDemandingInternalBehaviour(ResourceDemandingInternalBehaviour)
	 * @see pcm.seff.SeffPackage#getInternalCallAction_CalledResourceDemandingInternalBehaviour()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceDemandingInternalBehaviour getCalledResourceDemandingInternalBehaviour();

	/**
	 * Sets the value of the '{@link pcm.seff.InternalCallAction#getCalledResourceDemandingInternalBehaviour <em>Called Resource Demanding Internal Behaviour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Resource Demanding Internal Behaviour</em>' reference.
	 * @see #getCalledResourceDemandingInternalBehaviour()
	 * @generated
	 */
	void setCalledResourceDemandingInternalBehaviour(ResourceDemandingInternalBehaviour value);

} // InternalCallAction

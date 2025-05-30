/**
 */
package pcm.seff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Demanding Internal Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class representing component-internal behaviour not accessible from the component's interface. Comparable to internal method in object-oriented programming. This behaviour can be called from within a resource demanding behaviour using an InternalCallAction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.ResourceDemandingInternalBehaviour#getResourceDemandingSEFF_ResourceDemandingInternalBehaviour <em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>}</li>
 * </ul>
 *
 * @see pcm.seff.SeffPackage#getResourceDemandingInternalBehaviour()
 * @model
 * @generated
 */
public interface ResourceDemandingInternalBehaviour extends ResourceDemandingBehaviour {
	/**
	 * Returns the value of the '<em><b>Resource Demanding SEFF Resource Demanding Internal Behaviour</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.seff.ResourceDemandingSEFF#getResourceDemandingInternalBehaviours <em>Resource Demanding Internal Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>' container reference.
	 * @see #setResourceDemandingSEFF_ResourceDemandingInternalBehaviour(ResourceDemandingSEFF)
	 * @see pcm.seff.SeffPackage#getResourceDemandingInternalBehaviour_ResourceDemandingSEFF_ResourceDemandingInternalBehaviour()
	 * @see pcm.seff.ResourceDemandingSEFF#getResourceDemandingInternalBehaviours
	 * @model opposite="resourceDemandingInternalBehaviours" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ResourceDemandingSEFF getResourceDemandingSEFF_ResourceDemandingInternalBehaviour();

	/**
	 * Sets the value of the '{@link pcm.seff.ResourceDemandingInternalBehaviour#getResourceDemandingSEFF_ResourceDemandingInternalBehaviour <em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>' container reference.
	 * @see #getResourceDemandingSEFF_ResourceDemandingInternalBehaviour()
	 * @generated
	 */
	void setResourceDemandingSEFF_ResourceDemandingInternalBehaviour(ResourceDemandingSEFF value);

} // ResourceDemandingInternalBehaviour

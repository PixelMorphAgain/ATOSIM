/**
 */
package pcm.resourcetype;

import org.eclipse.emf.common.util.EList;

import pcm.PCMBaseClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extendable repository of resource types of the PCM. The resource type repository is intentionally left open to support
 * arbitrary resources in the future
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.resourcetype.ResourceRepository#getResourceInterfaces__ResourceRepository <em>Resource Interfaces Resource Repository</em>}</li>
 *   <li>{@link pcm.resourcetype.ResourceRepository#getSchedulingPolicies__ResourceRepository <em>Scheduling Policies Resource Repository</em>}</li>
 *   <li>{@link pcm.resourcetype.ResourceRepository#getAvailableResourceTypes_ResourceRepository <em>Available Resource Types Resource Repository</em>}</li>
 * </ul>
 *
 * @see pcm.resourcetype.ResourcetypePackage#getResourceRepository()
 * @model
 * @generated
 */
public interface ResourceRepository extends PCMBaseClass {
	/**
	 * Returns the value of the '<em><b>Resource Interfaces Resource Repository</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.resourcetype.ResourceInterface}.
	 * It is bidirectional and its opposite is '{@link pcm.resourcetype.ResourceInterface#getResourceRepository__ResourceInterface <em>Resource Repository Resource Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Interfaces Resource Repository</em>' containment reference list.
	 * @see pcm.resourcetype.ResourcetypePackage#getResourceRepository_ResourceInterfaces__ResourceRepository()
	 * @see pcm.resourcetype.ResourceInterface#getResourceRepository__ResourceInterface
	 * @model opposite="resourceRepository__ResourceInterface" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceInterface> getResourceInterfaces__ResourceRepository();

	/**
	 * Returns the value of the '<em><b>Scheduling Policies Resource Repository</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.resourcetype.SchedulingPolicy}.
	 * It is bidirectional and its opposite is '{@link pcm.resourcetype.SchedulingPolicy#getResourceRepository__SchedulingPolicy <em>Resource Repository Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Policies Resource Repository</em>' containment reference list.
	 * @see pcm.resourcetype.ResourcetypePackage#getResourceRepository_SchedulingPolicies__ResourceRepository()
	 * @see pcm.resourcetype.SchedulingPolicy#getResourceRepository__SchedulingPolicy
	 * @model opposite="resourceRepository__SchedulingPolicy" containment="true" ordered="false"
	 * @generated
	 */
	EList<SchedulingPolicy> getSchedulingPolicies__ResourceRepository();

	/**
	 * Returns the value of the '<em><b>Available Resource Types Resource Repository</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.resourcetype.ResourceType}.
	 * It is bidirectional and its opposite is '{@link pcm.resourcetype.ResourceType#getResourceRepository_ResourceType <em>Resource Repository Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Resource Types Resource Repository</em>' containment reference list.
	 * @see pcm.resourcetype.ResourcetypePackage#getResourceRepository_AvailableResourceTypes_ResourceRepository()
	 * @see pcm.resourcetype.ResourceType#getResourceRepository_ResourceType
	 * @model opposite="resourceRepository_ResourceType" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceType> getAvailableResourceTypes_ResourceRepository();

} // ResourceRepository

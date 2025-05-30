/**
 */
package pcm.core.entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interface Providing Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.entity.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity <em>Resource Provided Roles Resource Interface Providing Entity</em>}</li>
 * </ul>
 *
 * @see pcm.core.entity.EntityPackage#getResourceInterfaceProvidingEntity()
 * @model
 * @generated
 */
public interface ResourceInterfaceProvidingEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Provided Roles Resource Interface Providing Entity</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.core.entity.ResourceProvidedRole}.
	 * It is bidirectional and its opposite is '{@link pcm.core.entity.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole <em>Resource Interface Providing Entity Resource Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Provided Roles Resource Interface Providing Entity</em>' containment reference list.
	 * @see pcm.core.entity.EntityPackage#getResourceInterfaceProvidingEntity_ResourceProvidedRoles__ResourceInterfaceProvidingEntity()
	 * @see pcm.core.entity.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole
	 * @model opposite="resourceInterfaceProvidingEntity__ResourceProvidedRole" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceProvidedRole> getResourceProvidedRoles__ResourceInterfaceProvidingEntity();

} // ResourceInterfaceProvidingEntity

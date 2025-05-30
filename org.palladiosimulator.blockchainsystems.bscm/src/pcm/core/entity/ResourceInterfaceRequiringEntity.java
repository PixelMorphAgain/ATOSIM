/**
 */
package pcm.core.entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Interface Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.entity.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}</li>
 * </ul>
 *
 * @see pcm.core.entity.EntityPackage#getResourceInterfaceRequiringEntity()
 * @model
 * @generated
 */
public interface ResourceInterfaceRequiringEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.core.entity.ResourceRequiredRole}.
	 * It is bidirectional and its opposite is '{@link pcm.core.entity.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Required Roles Resource Interface Requiring Entity</em>' containment reference list.
	 * @see pcm.core.entity.EntityPackage#getResourceInterfaceRequiringEntity_ResourceRequiredRoles__ResourceInterfaceRequiringEntity()
	 * @see pcm.core.entity.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole
	 * @model opposite="resourceInterfaceRequiringEntity__ResourceRequiredRole" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceRequiredRole> getResourceRequiredRoles__ResourceInterfaceRequiringEntity();

} // ResourceInterfaceRequiringEntity

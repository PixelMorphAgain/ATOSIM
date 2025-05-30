/**
 */
package pcm.repository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.InfrastructureRequiredRole#getRequiredInterface__InfrastructureRequiredRole <em>Required Interface Infrastructure Required Role</em>}</li>
 * </ul>
 *
 * @see pcm.repository.RepositoryPackage#getInfrastructureRequiredRole()
 * @model
 * @generated
 */
public interface InfrastructureRequiredRole extends RequiredRole {
	/**
	 * Returns the value of the '<em><b>Required Interface Infrastructure Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interface Infrastructure Required Role</em>' reference.
	 * @see #setRequiredInterface__InfrastructureRequiredRole(InfrastructureInterface)
	 * @see pcm.repository.RepositoryPackage#getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureInterface getRequiredInterface__InfrastructureRequiredRole();

	/**
	 * Sets the value of the '{@link pcm.repository.InfrastructureRequiredRole#getRequiredInterface__InfrastructureRequiredRole <em>Required Interface Infrastructure Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Interface Infrastructure Required Role</em>' reference.
	 * @see #getRequiredInterface__InfrastructureRequiredRole()
	 * @generated
	 */
	void setRequiredInterface__InfrastructureRequiredRole(InfrastructureInterface value);

} // InfrastructureRequiredRole

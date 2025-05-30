/**
 */
package pcm.core.composition;

import pcm.repository.InfrastructureProvidedRole;
import pcm.repository.InfrastructureRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Infrastructure Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.composition.AssemblyInfrastructureConnector#getProvidedRole__AssemblyInfrastructureConnector <em>Provided Role Assembly Infrastructure Connector</em>}</li>
 *   <li>{@link pcm.core.composition.AssemblyInfrastructureConnector#getRequiredRole__AssemblyInfrastructureConnector <em>Required Role Assembly Infrastructure Connector</em>}</li>
 *   <li>{@link pcm.core.composition.AssemblyInfrastructureConnector#getProvidingAssemblyContext__AssemblyInfrastructureConnector <em>Providing Assembly Context Assembly Infrastructure Connector</em>}</li>
 *   <li>{@link pcm.core.composition.AssemblyInfrastructureConnector#getRequiringAssemblyContext__AssemblyInfrastructureConnector <em>Requiring Assembly Context Assembly Infrastructure Connector</em>}</li>
 * </ul>
 *
 * @see pcm.core.composition.CompositionPackage#getAssemblyInfrastructureConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='referencedInfrastructureRequiredRoleNotRequiredByAssemblyContext InfrastructureInterfacesNotCompatible referencedInfrastructureProvidedRoleNotProvidedByAssemblyContext'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG referencedInfrastructureProvidedRoleNotProvidedByAssemblyContext='self.providingAssemblyContext__AssemblyInfrastructureConnector.encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity-&gt;includes(self.providedRole__AssemblyInfrastructureConnector)\n' referencedInfrastructureRequiredRoleNotRequiredByAssemblyContext='self.requiringAssemblyContext__AssemblyInfrastructureConnector.encapsulatedComponent__AssemblyContext.requiredRoles_InterfaceRequiringEntity-&gt;includes(self.requiredRole__AssemblyInfrastructureConnector)' InfrastructureInterfacesNotCompatible='\tself.providedRole__AssemblyInfrastructureConnector.providedInterface__InfrastructureProvidedRole = self.requiredRole__AssemblyInfrastructureConnector.requiredInterface__InfrastructureRequiredRole  or self.providedRole__AssemblyInfrastructureConnector.providedInterface__InfrastructureProvidedRole.parentInterfaces__Interface-&gt;includes(self.requiredRole__AssemblyInfrastructureConnector.requiredInterface__InfrastructureRequiredRole)'"
 * @generated
 */
public interface AssemblyInfrastructureConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Provided Role Assembly Infrastructure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role Assembly Infrastructure Connector</em>' reference.
	 * @see #setProvidedRole__AssemblyInfrastructureConnector(InfrastructureProvidedRole)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyInfrastructureConnector_ProvidedRole__AssemblyInfrastructureConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureProvidedRole getProvidedRole__AssemblyInfrastructureConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyInfrastructureConnector#getProvidedRole__AssemblyInfrastructureConnector <em>Provided Role Assembly Infrastructure Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role Assembly Infrastructure Connector</em>' reference.
	 * @see #getProvidedRole__AssemblyInfrastructureConnector()
	 * @generated
	 */
	void setProvidedRole__AssemblyInfrastructureConnector(InfrastructureProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Required Role Assembly Infrastructure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role Assembly Infrastructure Connector</em>' reference.
	 * @see #setRequiredRole__AssemblyInfrastructureConnector(InfrastructureRequiredRole)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyInfrastructureConnector_RequiredRole__AssemblyInfrastructureConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InfrastructureRequiredRole getRequiredRole__AssemblyInfrastructureConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyInfrastructureConnector#getRequiredRole__AssemblyInfrastructureConnector <em>Required Role Assembly Infrastructure Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role Assembly Infrastructure Connector</em>' reference.
	 * @see #getRequiredRole__AssemblyInfrastructureConnector()
	 * @generated
	 */
	void setRequiredRole__AssemblyInfrastructureConnector(InfrastructureRequiredRole value);

	/**
	 * Returns the value of the '<em><b>Providing Assembly Context Assembly Infrastructure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Assembly Context Assembly Infrastructure Connector</em>' reference.
	 * @see #setProvidingAssemblyContext__AssemblyInfrastructureConnector(AssemblyContext)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyInfrastructureConnector_ProvidingAssemblyContext__AssemblyInfrastructureConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getProvidingAssemblyContext__AssemblyInfrastructureConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyInfrastructureConnector#getProvidingAssemblyContext__AssemblyInfrastructureConnector <em>Providing Assembly Context Assembly Infrastructure Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providing Assembly Context Assembly Infrastructure Connector</em>' reference.
	 * @see #getProvidingAssemblyContext__AssemblyInfrastructureConnector()
	 * @generated
	 */
	void setProvidingAssemblyContext__AssemblyInfrastructureConnector(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Requiring Assembly Context Assembly Infrastructure Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Assembly Context Assembly Infrastructure Connector</em>' reference.
	 * @see #setRequiringAssemblyContext__AssemblyInfrastructureConnector(AssemblyContext)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyInfrastructureConnector_RequiringAssemblyContext__AssemblyInfrastructureConnector()
	 * @model ordered="false"
	 * @generated
	 */
	AssemblyContext getRequiringAssemblyContext__AssemblyInfrastructureConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyInfrastructureConnector#getRequiringAssemblyContext__AssemblyInfrastructureConnector <em>Requiring Assembly Context Assembly Infrastructure Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiring Assembly Context Assembly Infrastructure Connector</em>' reference.
	 * @see #getRequiringAssemblyContext__AssemblyInfrastructureConnector()
	 * @generated
	 */
	void setRequiringAssemblyContext__AssemblyInfrastructureConnector(AssemblyContext value);

} // AssemblyInfrastructureConnector

/**
 */
package pcm.core.composition;

import pcm.repository.OperationProvidedRole;
import pcm.repository.OperationRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AssemblyConnector is a bidirectional link of two assembly contexts. Intuitively, an AssemblyConnector connects a
 * provided and a required interface of two different components. AssemblyContext must refer to the tuple (Role,
 * AssemblyContext) in order to uniquely identify which component roles communicate with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.composition.AssemblyConnector#getRequiringAssemblyContext_AssemblyConnector <em>Requiring Assembly Context Assembly Connector</em>}</li>
 *   <li>{@link pcm.core.composition.AssemblyConnector#getProvidingAssemblyContext_AssemblyConnector <em>Providing Assembly Context Assembly Connector</em>}</li>
 *   <li>{@link pcm.core.composition.AssemblyConnector#getProvidedRole_AssemblyConnector <em>Provided Role Assembly Connector</em>}</li>
 *   <li>{@link pcm.core.composition.AssemblyConnector#getRequiredRole_AssemblyConnector <em>Required Role Assembly Connector</em>}</li>
 * </ul>
 *
 * @see pcm.core.composition.CompositionPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='assemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch assemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch assemblyConnectorsReferencedInterfacesMustMatch'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG assemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch='self.providingAssemblyContext_AssemblyConnector.encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity-&gt;includes(self.providedRole_AssemblyConnector)\r\n\r\n' assemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch='self.requiringAssemblyContext_AssemblyConnector.encapsulatedComponent__AssemblyContext.requiredRoles_InterfaceRequiringEntity-&gt;includes(self.requiredRole_AssemblyConnector)\r\n\r\n' assemblyConnectorsReferencedInterfacesMustMatch='self.providedRole_AssemblyConnector.providedInterface__OperationProvidedRole = self.requiredRole_AssemblyConnector.requiredInterface__OperationRequiredRole'"
 * @generated
 */
public interface AssemblyConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Requiring Assembly Context Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiring Assembly Context Assembly Connector</em>' reference.
	 * @see #setRequiringAssemblyContext_AssemblyConnector(AssemblyContext)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyConnector_RequiringAssemblyContext_AssemblyConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getRequiringAssemblyContext_AssemblyConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyConnector#getRequiringAssemblyContext_AssemblyConnector <em>Requiring Assembly Context Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiring Assembly Context Assembly Connector</em>' reference.
	 * @see #getRequiringAssemblyContext_AssemblyConnector()
	 * @generated
	 */
	void setRequiringAssemblyContext_AssemblyConnector(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Providing Assembly Context Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providing Assembly Context Assembly Connector</em>' reference.
	 * @see #setProvidingAssemblyContext_AssemblyConnector(AssemblyContext)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyConnector_ProvidingAssemblyContext_AssemblyConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getProvidingAssemblyContext_AssemblyConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyConnector#getProvidingAssemblyContext_AssemblyConnector <em>Providing Assembly Context Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providing Assembly Context Assembly Connector</em>' reference.
	 * @see #getProvidingAssemblyContext_AssemblyConnector()
	 * @generated
	 */
	void setProvidingAssemblyContext_AssemblyConnector(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Provided Role Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role Assembly Connector</em>' reference.
	 * @see #setProvidedRole_AssemblyConnector(OperationProvidedRole)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyConnector_ProvidedRole_AssemblyConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationProvidedRole getProvidedRole_AssemblyConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyConnector#getProvidedRole_AssemblyConnector <em>Provided Role Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role Assembly Connector</em>' reference.
	 * @see #getProvidedRole_AssemblyConnector()
	 * @generated
	 */
	void setProvidedRole_AssemblyConnector(OperationProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Required Role Assembly Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role Assembly Connector</em>' reference.
	 * @see #setRequiredRole_AssemblyConnector(OperationRequiredRole)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyConnector_RequiredRole_AssemblyConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationRequiredRole getRequiredRole_AssemblyConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyConnector#getRequiredRole_AssemblyConnector <em>Required Role Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role Assembly Connector</em>' reference.
	 * @see #getRequiredRole_AssemblyConnector()
	 * @generated
	 */
	void setRequiredRole_AssemblyConnector(OperationRequiredRole value);

} // AssemblyConnector

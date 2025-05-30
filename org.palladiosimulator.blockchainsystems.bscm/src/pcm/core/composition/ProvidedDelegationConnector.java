/**
 */
package pcm.core.composition;

import pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ProvidedDelegationConnector delegates incoming calls of provided roles to inner provided roles of encapsulated assembly
 * contexts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.composition.ProvidedDelegationConnector#getInnerProvidedRole_ProvidedDelegationConnector <em>Inner Provided Role Provided Delegation Connector</em>}</li>
 *   <li>{@link pcm.core.composition.ProvidedDelegationConnector#getOuterProvidedRole_ProvidedDelegationConnector <em>Outer Provided Role Provided Delegation Connector</em>}</li>
 *   <li>{@link pcm.core.composition.ProvidedDelegationConnector#getAssemblyContext_ProvidedDelegationConnector <em>Assembly Context Provided Delegation Connector</em>}</li>
 * </ul>
 *
 * @see pcm.core.composition.CompositionPackage#getProvidedDelegationConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='componentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame providedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG componentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame='self.innerProvidedRole_ProvidedDelegationConnector.providingEntity_ProvidedRole = self.assemblyContext_ProvidedDelegationConnector.encapsulatedComponent__AssemblyContext' providedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure='self.parentStructure__Connector = self.assemblyContext_ProvidedDelegationConnector.parentStructure__AssemblyContext'"
 * @generated
 */
public interface ProvidedDelegationConnector extends DelegationConnector {
	/**
	 * Returns the value of the '<em><b>Inner Provided Role Provided Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Provided Role Provided Delegation Connector</em>' reference.
	 * @see #setInnerProvidedRole_ProvidedDelegationConnector(OperationProvidedRole)
	 * @see pcm.core.composition.CompositionPackage#getProvidedDelegationConnector_InnerProvidedRole_ProvidedDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationProvidedRole getInnerProvidedRole_ProvidedDelegationConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.ProvidedDelegationConnector#getInnerProvidedRole_ProvidedDelegationConnector <em>Inner Provided Role Provided Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Provided Role Provided Delegation Connector</em>' reference.
	 * @see #getInnerProvidedRole_ProvidedDelegationConnector()
	 * @generated
	 */
	void setInnerProvidedRole_ProvidedDelegationConnector(OperationProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Outer Provided Role Provided Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Provided Role Provided Delegation Connector</em>' reference.
	 * @see #setOuterProvidedRole_ProvidedDelegationConnector(OperationProvidedRole)
	 * @see pcm.core.composition.CompositionPackage#getProvidedDelegationConnector_OuterProvidedRole_ProvidedDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationProvidedRole getOuterProvidedRole_ProvidedDelegationConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.ProvidedDelegationConnector#getOuterProvidedRole_ProvidedDelegationConnector <em>Outer Provided Role Provided Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Provided Role Provided Delegation Connector</em>' reference.
	 * @see #getOuterProvidedRole_ProvidedDelegationConnector()
	 * @generated
	 */
	void setOuterProvidedRole_ProvidedDelegationConnector(OperationProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Assembly Context Provided Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context Provided Delegation Connector</em>' reference.
	 * @see #setAssemblyContext_ProvidedDelegationConnector(AssemblyContext)
	 * @see pcm.core.composition.CompositionPackage#getProvidedDelegationConnector_AssemblyContext_ProvidedDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext_ProvidedDelegationConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.ProvidedDelegationConnector#getAssemblyContext_ProvidedDelegationConnector <em>Assembly Context Provided Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context Provided Delegation Connector</em>' reference.
	 * @see #getAssemblyContext_ProvidedDelegationConnector()
	 * @generated
	 */
	void setAssemblyContext_ProvidedDelegationConnector(AssemblyContext value);

} // ProvidedDelegationConnector

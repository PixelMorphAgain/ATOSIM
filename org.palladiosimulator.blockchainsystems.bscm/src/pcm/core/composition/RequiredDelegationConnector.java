/**
 */
package pcm.core.composition;

import pcm.repository.OperationRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RequiredDelegationConnector delegates required roles of encapsulated assembly contexts to&nbsp;outer&nbsp;required roles
 * .
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.composition.RequiredDelegationConnector#getInnerRequiredRole_RequiredDelegationConnector <em>Inner Required Role Required Delegation Connector</em>}</li>
 *   <li>{@link pcm.core.composition.RequiredDelegationConnector#getOuterRequiredRole_RequiredDelegationConnector <em>Outer Required Role Required Delegation Connector</em>}</li>
 *   <li>{@link pcm.core.composition.RequiredDelegationConnector#getAssemblyContext_RequiredDelegationConnector <em>Assembly Context Required Delegation Connector</em>}</li>
 * </ul>
 *
 * @see pcm.core.composition.CompositionPackage#getRequiredDelegationConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='componentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame requiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector requiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG componentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame='self.innerRequiredRole_RequiredDelegationConnector.requiringEntity_RequiredRole = self.assemblyContext_RequiredDelegationConnector.encapsulatedComponent__AssemblyContext' requiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector='self.outerRequiredRole_RequiredDelegationConnector.requiringEntity_RequiredRole=self.parentStructure__Connector' requiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure='self.parentStructure__Connector = self.assemblyContext_RequiredDelegationConnector.parentStructure__AssemblyContext'"
 * @generated
 */
public interface RequiredDelegationConnector extends DelegationConnector {
	/**
	 * Returns the value of the '<em><b>Inner Required Role Required Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Required Role Required Delegation Connector</em>' reference.
	 * @see #setInnerRequiredRole_RequiredDelegationConnector(OperationRequiredRole)
	 * @see pcm.core.composition.CompositionPackage#getRequiredDelegationConnector_InnerRequiredRole_RequiredDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationRequiredRole getInnerRequiredRole_RequiredDelegationConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.RequiredDelegationConnector#getInnerRequiredRole_RequiredDelegationConnector <em>Inner Required Role Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Required Role Required Delegation Connector</em>' reference.
	 * @see #getInnerRequiredRole_RequiredDelegationConnector()
	 * @generated
	 */
	void setInnerRequiredRole_RequiredDelegationConnector(OperationRequiredRole value);

	/**
	 * Returns the value of the '<em><b>Outer Required Role Required Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Required Role Required Delegation Connector</em>' reference.
	 * @see #setOuterRequiredRole_RequiredDelegationConnector(OperationRequiredRole)
	 * @see pcm.core.composition.CompositionPackage#getRequiredDelegationConnector_OuterRequiredRole_RequiredDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationRequiredRole getOuterRequiredRole_RequiredDelegationConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.RequiredDelegationConnector#getOuterRequiredRole_RequiredDelegationConnector <em>Outer Required Role Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Required Role Required Delegation Connector</em>' reference.
	 * @see #getOuterRequiredRole_RequiredDelegationConnector()
	 * @generated
	 */
	void setOuterRequiredRole_RequiredDelegationConnector(OperationRequiredRole value);

	/**
	 * Returns the value of the '<em><b>Assembly Context Required Delegation Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context Required Delegation Connector</em>' reference.
	 * @see #setAssemblyContext_RequiredDelegationConnector(AssemblyContext)
	 * @see pcm.core.composition.CompositionPackage#getRequiredDelegationConnector_AssemblyContext_RequiredDelegationConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext_RequiredDelegationConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.RequiredDelegationConnector#getAssemblyContext_RequiredDelegationConnector <em>Assembly Context Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context Required Delegation Connector</em>' reference.
	 * @see #getAssemblyContext_RequiredDelegationConnector()
	 * @generated
	 */
	void setAssemblyContext_RequiredDelegationConnector(AssemblyContext value);

} // RequiredDelegationConnector

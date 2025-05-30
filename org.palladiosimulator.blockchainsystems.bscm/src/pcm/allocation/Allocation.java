/**
 */
package pcm.allocation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

import pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The allocation repository holding all available allocation contexts of a model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.allocation.Allocation#getTargetResourceEnvironment_Allocation <em>Target Resource Environment Allocation</em>}</li>
 *   <li>{@link pcm.allocation.Allocation#getSystem_Allocation <em>System Allocation</em>}</li>
 *   <li>{@link pcm.allocation.Allocation#getAllocationContexts_Allocation <em>Allocation Contexts Allocation</em>}</li>
 * </ul>
 *
 * @see pcm.allocation.AllocationPackage#getAllocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='communicatingServersHaveToBeConnectedByLinkingResource'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG communicatingServersHaveToBeConnectedByLinkingResource='self.allocationContexts_Allocation-&gt;forAll(a | self.allocationContexts_Allocation-&gt;forAll(b | \r\n    --- if a and b are not on the same server\r\n    (a.resourceContainer_AllocationContext &lt;&gt; b.resourceContainer_AllocationContext \r\n    and\r\n    --  and if the assembly contexts of a and b are connected\r\n      self.system_Allocation.connectors__ComposedStructure-&gt;select(conn | conn.oclIsTypeOf(pcm::core::composition::AssemblyConnector)).oclAsType(pcm::core::composition::AssemblyConnector)-&gt;exists(conn | \r\n         (conn.providingAssemblyContext_AssemblyConnector = a.assemblyContext_AllocationContext  \r\n         and \r\n         conn.requiringAssemblyContext_AssemblyConnector = b.assemblyContext_AllocationContext )\r\n         or \r\n          (conn.providingAssemblyContext_AssemblyConnector = b.assemblyContext_AllocationContext  \r\n         and \r\n         conn.requiringAssemblyContext_AssemblyConnector = a.assemblyContext_AllocationContext )\r\n       )\r\n     )\r\n     -- then the servers have to be connected by a linking resource\r\n     implies \r\n     self.targetResourceEnvironment_Allocation.linkingResources__ResourceEnvironment-&gt;exists(l | \r\n        -- l connects the two\r\n        l.connectedResourceContainers_LinkingResource-&gt;includes(a.resourceContainer_AllocationContext)\r\n        and \r\n        l.connectedResourceContainers_LinkingResource-&gt;includes(b.resourceContainer_AllocationContext)\r\n     )\r\n  ))'"
 * @generated
 */
public interface Allocation extends Entity {
	/**
	 * Returns the value of the '<em><b>Target Resource Environment Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Resource Environment Allocation</em>' reference.
	 * @see #setTargetResourceEnvironment_Allocation(ResourceEnvironment)
	 * @see pcm.allocation.AllocationPackage#getAllocation_TargetResourceEnvironment_Allocation()
	 * @model ordered="false"
	 * @generated
	 */
	ResourceEnvironment getTargetResourceEnvironment_Allocation();

	/**
	 * Sets the value of the '{@link pcm.allocation.Allocation#getTargetResourceEnvironment_Allocation <em>Target Resource Environment Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Resource Environment Allocation</em>' reference.
	 * @see #getTargetResourceEnvironment_Allocation()
	 * @generated
	 */
	void setTargetResourceEnvironment_Allocation(ResourceEnvironment value);

	/**
	 * Returns the value of the '<em><b>System Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Allocation</em>' reference.
	 * @see #setSystem_Allocation(pcm.system.System)
	 * @see pcm.allocation.AllocationPackage#getAllocation_System_Allocation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	pcm.system.System getSystem_Allocation();

	/**
	 * Sets the value of the '{@link pcm.allocation.Allocation#getSystem_Allocation <em>System Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Allocation</em>' reference.
	 * @see #getSystem_Allocation()
	 * @generated
	 */
	void setSystem_Allocation(pcm.system.System value);

	/**
	 * Returns the value of the '<em><b>Allocation Contexts Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.allocation.AllocationContext}.
	 * It is bidirectional and its opposite is '{@link pcm.allocation.AllocationContext#getAllocation_AllocationContext <em>Allocation Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts Allocation</em>' containment reference list.
	 * @see pcm.allocation.AllocationPackage#getAllocation_AllocationContexts_Allocation()
	 * @see pcm.allocation.AllocationContext#getAllocation_AllocationContext
	 * @model opposite="allocation_AllocationContext" containment="true" ordered="false"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts_Allocation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" diagnosticsRequired="true" contextRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore invariant='true'"
	 * @generated
	 */
	boolean validateEachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Allocation

/**
 */
package pcm.allocation;

import pcm.core.composition.AssemblyContext;
import pcm.core.composition.EventChannel;

import pcm.core.entity.Entity;

import pcm.resourceenvironment.ResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mapping between AssemblyContext and Resource. Sometimes referred to as "Deployment".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.allocation.AllocationContext#getResourceContainer_AllocationContext <em>Resource Container Allocation Context</em>}</li>
 *   <li>{@link pcm.allocation.AllocationContext#getAssemblyContext_AllocationContext <em>Assembly Context Allocation Context</em>}</li>
 *   <li>{@link pcm.allocation.AllocationContext#getAllocation_AllocationContext <em>Allocation Allocation Context</em>}</li>
 *   <li>{@link pcm.allocation.AllocationContext#getEventChannel__AllocationContext <em>Event Channel Allocation Context</em>}</li>
 * </ul>
 *
 * @see pcm.allocation.AllocationPackage#getAllocationContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneAssemblyContextOrOneEventChannelShouldBeReferred'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG oneAssemblyContextOrOneEventChannelShouldBeReferred='not(self.assemblyContext_AllocationContext.oclIsUndefined()) xor not(self.eventChannel__AllocationContext.oclIsUndefined())'"
 * @generated
 */
public interface AllocationContext extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Container Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container Allocation Context</em>' reference.
	 * @see #setResourceContainer_AllocationContext(ResourceContainer)
	 * @see pcm.allocation.AllocationPackage#getAllocationContext_ResourceContainer_AllocationContext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceContainer getResourceContainer_AllocationContext();

	/**
	 * Sets the value of the '{@link pcm.allocation.AllocationContext#getResourceContainer_AllocationContext <em>Resource Container Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container Allocation Context</em>' reference.
	 * @see #getResourceContainer_AllocationContext()
	 * @generated
	 */
	void setResourceContainer_AllocationContext(ResourceContainer value);

	/**
	 * Returns the value of the '<em><b>Assembly Context Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context Allocation Context</em>' reference.
	 * @see #setAssemblyContext_AllocationContext(AssemblyContext)
	 * @see pcm.allocation.AllocationPackage#getAllocationContext_AssemblyContext_AllocationContext()
	 * @model ordered="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext_AllocationContext();

	/**
	 * Sets the value of the '{@link pcm.allocation.AllocationContext#getAssemblyContext_AllocationContext <em>Assembly Context Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context Allocation Context</em>' reference.
	 * @see #getAssemblyContext_AllocationContext()
	 * @generated
	 */
	void setAssemblyContext_AllocationContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Allocation Allocation Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.allocation.Allocation#getAllocationContexts_Allocation <em>Allocation Contexts Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Allocation Context</em>' container reference.
	 * @see #setAllocation_AllocationContext(Allocation)
	 * @see pcm.allocation.AllocationPackage#getAllocationContext_Allocation_AllocationContext()
	 * @see pcm.allocation.Allocation#getAllocationContexts_Allocation
	 * @model opposite="allocationContexts_Allocation" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Allocation getAllocation_AllocationContext();

	/**
	 * Sets the value of the '{@link pcm.allocation.AllocationContext#getAllocation_AllocationContext <em>Allocation Allocation Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Allocation Context</em>' container reference.
	 * @see #getAllocation_AllocationContext()
	 * @generated
	 */
	void setAllocation_AllocationContext(Allocation value);

	/**
	 * Returns the value of the '<em><b>Event Channel Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Channel Allocation Context</em>' reference.
	 * @see #setEventChannel__AllocationContext(EventChannel)
	 * @see pcm.allocation.AllocationPackage#getAllocationContext_EventChannel__AllocationContext()
	 * @model ordered="false"
	 * @generated
	 */
	EventChannel getEventChannel__AllocationContext();

	/**
	 * Sets the value of the '{@link pcm.allocation.AllocationContext#getEventChannel__AllocationContext <em>Event Channel Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Channel Allocation Context</em>' reference.
	 * @see #getEventChannel__AllocationContext()
	 * @generated
	 */
	void setEventChannel__AllocationContext(EventChannel value);

} // AllocationContext

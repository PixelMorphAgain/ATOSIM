/**
 */
package pcm.core.composition;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO/FIXME: The distinction between ComposedStructure and ComposedProvidingRequiringStructure does not make sense at the moment, because the ComposedStructure already talks about inner provided / required delegation connectors, which only make sense if there are outer roles for interfaces -> ComposedProvidingRequiringStructure. IDEA: Move the delegation connector attributes to ComposedProvidingRequiringStructure. I'm not sure about the assembly connectors. SEE ALSO: ComposedProvidingRequiringStructure 
 * However, as AssemblyContexts of ComposedStructure always contain InterfaceProvidingRequiringEntities at the moment, the above might not help... -- Anne
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.composition.ComposedStructure#getAssemblyContexts__ComposedStructure <em>Assembly Contexts Composed Structure</em>}</li>
 *   <li>{@link pcm.core.composition.ComposedStructure#getResourceRequiredDelegationConnectors_ComposedStructure <em>Resource Required Delegation Connectors Composed Structure</em>}</li>
 *   <li>{@link pcm.core.composition.ComposedStructure#getEventChannel__ComposedStructure <em>Event Channel Composed Structure</em>}</li>
 *   <li>{@link pcm.core.composition.ComposedStructure#getConnectors__ComposedStructure <em>Connectors Composed Structure</em>}</li>
 * </ul>
 *
 * @see pcm.core.composition.CompositionPackage#getComposedStructure()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multipleConnectorsConstraint multipleConnectorsConstraintForAssemblyConnectors'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG multipleConnectorsConstraint='self.connectors__ComposedStructure-&gt;select(conn | conn.oclIsTypeOf(pcm::core::composition::ProvidedDelegationConnector)).oclAsType(pcm::core::composition::ProvidedDelegationConnector)-&gt;forAll( c1, c2 | c1 &lt;&gt; c2 implies c1.outerProvidedRole_ProvidedDelegationConnector &lt;&gt; c2.outerProvidedRole_ProvidedDelegationConnector)\r\n' multipleConnectorsConstraintForAssemblyConnectors='self.connectors__ComposedStructure-&gt;select(conn | conn.oclIsTypeOf(pcm::core::composition::AssemblyConnector)).oclAsType(AssemblyConnector)-&gt;forAll( c1, c2 | ( (c1 &lt;&gt; c2) and ( c1.requiringAssemblyContext_AssemblyConnector = c2.requiringAssemblyContext_AssemblyConnector ) ) implies c1.requiredRole_AssemblyConnector &lt;&gt; c2.requiredRole_AssemblyConnector )\r\n'"
 * @generated
 */
public interface ComposedStructure extends Entity {
	/**
	 * Returns the value of the '<em><b>Assembly Contexts Composed Structure</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.core.composition.AssemblyContext}.
	 * It is bidirectional and its opposite is '{@link pcm.core.composition.AssemblyContext#getParentStructure__AssemblyContext <em>Parent Structure Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Contexts Composed Structure</em>' containment reference list.
	 * @see pcm.core.composition.CompositionPackage#getComposedStructure_AssemblyContexts__ComposedStructure()
	 * @see pcm.core.composition.AssemblyContext#getParentStructure__AssemblyContext
	 * @model opposite="parentStructure__AssemblyContext" containment="true" ordered="false"
	 * @generated
	 */
	EList<AssemblyContext> getAssemblyContexts__ComposedStructure();

	/**
	 * Returns the value of the '<em><b>Resource Required Delegation Connectors Composed Structure</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.core.composition.ResourceRequiredDelegationConnector}.
	 * It is bidirectional and its opposite is '{@link pcm.core.composition.ResourceRequiredDelegationConnector#getParentStructure_ResourceRequiredDelegationConnector <em>Parent Structure Resource Required Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Required Delegation Connectors Composed Structure</em>' containment reference list.
	 * @see pcm.core.composition.CompositionPackage#getComposedStructure_ResourceRequiredDelegationConnectors_ComposedStructure()
	 * @see pcm.core.composition.ResourceRequiredDelegationConnector#getParentStructure_ResourceRequiredDelegationConnector
	 * @model opposite="parentStructure_ResourceRequiredDelegationConnector" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceRequiredDelegationConnector> getResourceRequiredDelegationConnectors_ComposedStructure();

	/**
	 * Returns the value of the '<em><b>Event Channel Composed Structure</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.core.composition.EventChannel}.
	 * It is bidirectional and its opposite is '{@link pcm.core.composition.EventChannel#getParentStructure__EventChannel <em>Parent Structure Event Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Channel Composed Structure</em>' containment reference list.
	 * @see pcm.core.composition.CompositionPackage#getComposedStructure_EventChannel__ComposedStructure()
	 * @see pcm.core.composition.EventChannel#getParentStructure__EventChannel
	 * @model opposite="parentStructure__EventChannel" containment="true" ordered="false"
	 * @generated
	 */
	EList<EventChannel> getEventChannel__ComposedStructure();

	/**
	 * Returns the value of the '<em><b>Connectors Composed Structure</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.core.composition.Connector}.
	 * It is bidirectional and its opposite is '{@link pcm.core.composition.Connector#getParentStructure__Connector <em>Parent Structure Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors Composed Structure</em>' containment reference list.
	 * @see pcm.core.composition.CompositionPackage#getComposedStructure_Connectors__ComposedStructure()
	 * @see pcm.core.composition.Connector#getParentStructure__Connector
	 * @model opposite="parentStructure__Connector" containment="true" ordered="false"
	 * @generated
	 */
	EList<Connector> getConnectors__ComposedStructure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model diagnosticsRequired="true" contextRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore invariant='true'"
	 * @generated
	 */
	boolean validateSameSubsystemMustNotBeInstantiatedMoreThanOnce(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ComposedStructure

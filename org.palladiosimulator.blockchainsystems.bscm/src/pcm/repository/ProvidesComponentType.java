/**
 */
package pcm.repository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provided (Component) Types abstract a component to its provided interfaces, leaving its requirements and implementation details open. So, provided types subsume components which offer the same functionality, but with different implementations. As different implementations might require different services from the environment, provided types omit required interfaces. Provided types allow software architects to focus on a component’s functionality and introduce weak substitutability to the PCM. Using provided types, software architects can draft ideas on how functionality can be partitioned among different components without worrying about their implementation. In the initial phases of architectural design, it often does not make sense to arrange all details of a component, since most of them depend on the actual implementation and thus need to be specified by component developers. As during this phase the actual implementation is unknown, also the required interfaces of a component cannot be stated. However, software architects can still pre-evaluate a software architecture containing provided-types. This gives rough estimates about the quality of the build software system and defines QoS requirements for the component implementation.
 * <!-- end-model-doc -->
 *
 *
 * @see pcm.repository.RepositoryPackage#getProvidesComponentType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atLeastOneInterfaceHasToBeProvidedByAUsefullProvidesComponentType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG atLeastOneInterfaceHasToBeProvidedByAUsefullProvidesComponentType='self.oclIsTypeOf(ProvidesComponentType)\r\nimplies\r\nself.providedRoles_InterfaceProvidingEntity-&gt;size() &gt;= 1'"
 * @generated
 */
public interface ProvidesComponentType extends RepositoryComponent {
} // ProvidesComponentType

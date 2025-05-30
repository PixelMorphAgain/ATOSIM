/**
 */
package pcm.seff;

import org.eclipse.emf.ecore.EObject;

import pcm.repository.BasicComponent;
import pcm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Effect Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Service Effect Specification Models the effect of invoking a specific service of a basic component. Therefore, it references a Signature from an Interface, for which the component takes a ProvidedRole, to identify the described service. This class is abstract and SEFFs for specific analysis purposes need to inherit from this class. A BasicComponent may have an arbitrary number of SEFFs. It can have multiple SEFFs of a different type for a single provided service. For example, one SEFF can express all external service calls with no particular order, while another one includes a restricted order, or still another one expresses resource demands of the service.
 * While different SEFF types have been proposed, the only type currently included in the meta-model is the ResourceDemandingSEFF for performance prediction. Different types of SEFFs should not contradict each other if the languages are equally powerful. For example, the order of allowed external service calls should be the same for each SEFF type modelling sequences of such calls if the modelling languages have the same expressiveness. SEFFs are part of a component and not part of an interface, because they are implementation dependent. The SEFFs of a CompositeComponent are not represented in the meta-model and can be derived automatically by connecting the SEFFs of the encapsulated components of its nested AssemblyContexts. Different SEFFs of a single component access the same component parameter specifications. That means that parameter dependencies to the same component parameters in different SEFF types refer also to the same characterisations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.ServiceEffectSpecification#getSeffTypeID <em>Seff Type ID</em>}</li>
 *   <li>{@link pcm.seff.ServiceEffectSpecification#getDescribedService__SEFF <em>Described Service SEFF</em>}</li>
 *   <li>{@link pcm.seff.ServiceEffectSpecification#getBasicComponent_ServiceEffectSpecification <em>Basic Component Service Effect Specification</em>}</li>
 * </ul>
 *
 * @see pcm.seff.SeffPackage#getServiceEffectSpecification()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='referencedOperationSignatureMustBelongToInterfaceReferencedByProvidedRole referencedEventTypeMustBelongToEventGroupReferencedByProvidedRole'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG referencedOperationSignatureMustBelongToInterfaceReferencedByProvidedRole='let describedService : repository::Signature = self.describedService__SEFF in\n    not describedService.oclIsKindOf(repository::OperationSignature) or\n    let providedRoles : Set(repository::ProvidedRole) = self.basicComponent_ServiceEffectSpecification.providedRoles_InterfaceProvidingEntity in\n        -- collect all directly provided interfaces\n        let directlyProvidedInterfaces : Set(repository::Interface) = providedRoles-&gt;selectByKind(repository::OperationProvidedRole).providedInterface__OperationProvidedRole-&gt;selectByKind(repository::Interface)-&gt;asSet() in\n            -- collect all provided interfaces including parent interfaces\n            let providedInterfaces : Set(repository::Interface) = directlyProvidedInterfaces-&gt;closure(interface : repository::Interface | interface.parentInterfaces__Interface)-&gt;union(directlyProvidedInterfaces) in\n                -- collect all provided signatures\n                let providedSignatures : Set(repository::Signature) = providedInterfaces-&gt;selectByKind(repository::OperationInterface).signatures__OperationInterface-&gt;selectByKind(repository::Signature)-&gt;asSet() in\n                    -- compare signatures\n                    providedSignatures-&gt;includes(self.describedService__SEFF)' referencedEventTypeMustBelongToEventGroupReferencedByProvidedRole='let describedService : pcm::repository::Signature = self.describedService__SEFF in\n    not describedService.oclIsKindOf(pcm::repository::EventType) or\n    let providedRoles : Set(pcm::repository::ProvidedRole) = self.basicComponent_ServiceEffectSpecification.providedRoles_InterfaceProvidingEntity in\n        -- collect all directly provided interfaces\n        let directlyProvidedInterfaces : Set(pcm::repository::Interface) = providedRoles-&gt;selectByKind(pcm::repository::SinkRole).eventGroup__SinkRole-&gt;selectByKind(pcm::repository::Interface)-&gt;asSet() in\n            -- collect all provided interfaces including parent interfaces\n            let providedInterfaces : Set(pcm::repository::Interface) = directlyProvidedInterfaces-&gt;closure(interface : pcm::repository::Interface | interface.parentInterfaces__Interface)-&gt;union(directlyProvidedInterfaces) in\n                -- collect all provided signatures\n                let providedSignatures : Set(pcm::repository::Signature) = providedInterfaces-&gt;selectByKind(pcm::repository::EventGroup).eventTypes__EventGroup-&gt;selectByKind(pcm::repository::Signature)-&gt;asSet() in\n                    -- compare signatures\n                    providedSignatures-&gt;includes(self.describedService__SEFF)'"
 * @generated
 */
public interface ServiceEffectSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Seff Type ID</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seff Type ID</em>' attribute.
	 * @see #setSeffTypeID(String)
	 * @see pcm.seff.SeffPackage#getServiceEffectSpecification_SeffTypeID()
	 * @model default="1" required="true" ordered="false"
	 * @generated
	 */
	String getSeffTypeID();

	/**
	 * Sets the value of the '{@link pcm.seff.ServiceEffectSpecification#getSeffTypeID <em>Seff Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seff Type ID</em>' attribute.
	 * @see #getSeffTypeID()
	 * @generated
	 */
	void setSeffTypeID(String value);

	/**
	 * Returns the value of the '<em><b>Described Service SEFF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described Service SEFF</em>' reference.
	 * @see #setDescribedService__SEFF(Signature)
	 * @see pcm.seff.SeffPackage#getServiceEffectSpecification_DescribedService__SEFF()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Signature getDescribedService__SEFF();

	/**
	 * Sets the value of the '{@link pcm.seff.ServiceEffectSpecification#getDescribedService__SEFF <em>Described Service SEFF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described Service SEFF</em>' reference.
	 * @see #getDescribedService__SEFF()
	 * @generated
	 */
	void setDescribedService__SEFF(Signature value);

	/**
	 * Returns the value of the '<em><b>Basic Component Service Effect Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.repository.BasicComponent#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Component Service Effect Specification</em>' container reference.
	 * @see #setBasicComponent_ServiceEffectSpecification(BasicComponent)
	 * @see pcm.seff.SeffPackage#getServiceEffectSpecification_BasicComponent_ServiceEffectSpecification()
	 * @see pcm.repository.BasicComponent#getServiceEffectSpecifications__BasicComponent
	 * @model opposite="serviceEffectSpecifications__BasicComponent" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BasicComponent getBasicComponent_ServiceEffectSpecification();

	/**
	 * Sets the value of the '{@link pcm.seff.ServiceEffectSpecification#getBasicComponent_ServiceEffectSpecification <em>Basic Component Service Effect Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Component Service Effect Specification</em>' container reference.
	 * @see #getBasicComponent_ServiceEffectSpecification()
	 * @generated
	 */
	void setBasicComponent_ServiceEffectSpecification(BasicComponent value);

} // ServiceEffectSpecification

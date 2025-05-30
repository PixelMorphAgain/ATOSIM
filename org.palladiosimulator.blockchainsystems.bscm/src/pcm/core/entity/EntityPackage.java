/**
 */
package pcm.core.entity;

import identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pcm.PcmPackage;

import pcm.core.composition.CompositionPackage;

import pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This  set of abstract meta-classes gives a conceptual view on interfaces, entities and their relationships: Two roles can be identified a software entity can take relative to an interface. Any entity can claim to implement the functionality specified in an interface as well as to request that functionality. 
 * 
 * Base of the inheritance hierarchy are Identifier and NamedElement, both of which Entity and all inheriting classes are derived from. 
 * 
 * The relationship of Entities and Interfaces is described with the three meta classes InterfaceProvidingEntity, InterfaceRequiringEntity, and InterfaceProvidingRequiringEntity. The abstract meta-class InterfaceProvidingEntity is inherited by all entities which can potentially offer interface implementations. Similarly, the meta-class InterfaceRequiringEntity is inherited by all entities which are allowed to request functionality offer by entities providing this functionality. InterfaceProvidingRequiringEntity inherits from both of them and thus combines their properties. 
 * <!-- end-model-doc -->
 * @see pcm.core.entity.EntityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG'"
 * @generated
 */
public interface EntityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/Core/Entity/5.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "entity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityPackage eINSTANCE = pcm.core.entity.impl.EntityPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.EntityImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ECLASS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___EIS_PROXY = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ERESOURCE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ECONTAINER = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ECONTAINING_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ECONTAINMENT_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ECONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___EALL_CONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ECROSS_REFERENCES = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___EGET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___EIS_SET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___EUNSET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___EINVOKE__EOPERATION_ELIST = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.ResourceProvidedRoleImpl <em>Resource Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.ResourceProvidedRoleImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getResourceProvidedRole()
	 * @generated
	 */
	int RESOURCE_PROVIDED_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE__ID = RepositoryPackage.ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE__ENTITY_NAME = RepositoryPackage.ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Interface Providing Entity Resource Provided Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE = RepositoryPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Resource Interface Resource Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE = RepositoryPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE_FEATURE_COUNT = RepositoryPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___ECLASS = RepositoryPackage.ROLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___EIS_PROXY = RepositoryPackage.ROLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___ERESOURCE = RepositoryPackage.ROLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___ECONTAINER = RepositoryPackage.ROLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___ECONTAINING_FEATURE = RepositoryPackage.ROLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___ECONTAINMENT_FEATURE = RepositoryPackage.ROLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___ECONTENTS = RepositoryPackage.ROLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___EALL_CONTENTS = RepositoryPackage.ROLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___ECROSS_REFERENCES = RepositoryPackage.ROLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE = RepositoryPackage.ROLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = RepositoryPackage.ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = RepositoryPackage.ROLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___EIS_SET__ESTRUCTURALFEATURE = RepositoryPackage.ROLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___EUNSET__ESTRUCTURALFEATURE = RepositoryPackage.ROLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE___EINVOKE__EOPERATION_ELIST = RepositoryPackage.ROLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Resource Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDED_ROLE_OPERATION_COUNT = RepositoryPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.InterfaceProvidingEntityImpl <em>Interface Providing Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.InterfaceProvidingEntityImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getInterfaceProvidingEntity()
	 * @generated
	 */
	int INTERFACE_PROVIDING_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY__ENTITY_NAME = ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Providing Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___ECLASS = ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___EIS_PROXY = ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___ERESOURCE = ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___ECONTAINER = ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___ECONTAINING_FEATURE = ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___ECONTAINMENT_FEATURE = ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___ECONTENTS = ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___EALL_CONTENTS = ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___ECROSS_REFERENCES = ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___EGET__ESTRUCTURALFEATURE = ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT = ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___EIS_SET__ESTRUCTURALFEATURE = ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___EUNSET__ESTRUCTURALFEATURE = ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY___EINVOKE__EOPERATION_ELIST = ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Interface Providing Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.InterfaceProvidingRequiringEntityImpl <em>Interface Providing Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.InterfaceProvidingRequiringEntityImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getInterfaceProvidingRequiringEntity()
	 * @generated
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY__ID = INTERFACE_PROVIDING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME = INTERFACE_PROVIDING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = INTERFACE_PROVIDING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = INTERFACE_PROVIDING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT = INTERFACE_PROVIDING_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___ECLASS = INTERFACE_PROVIDING_ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___EIS_PROXY = INTERFACE_PROVIDING_ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___ERESOURCE = INTERFACE_PROVIDING_ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTAINER = INTERFACE_PROVIDING_ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTAINING_FEATURE = INTERFACE_PROVIDING_ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTAINMENT_FEATURE = INTERFACE_PROVIDING_ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTENTS = INTERFACE_PROVIDING_ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___EALL_CONTENTS = INTERFACE_PROVIDING_ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___ECROSS_REFERENCES = INTERFACE_PROVIDING_ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE = INTERFACE_PROVIDING_ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = INTERFACE_PROVIDING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT = INTERFACE_PROVIDING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___EIS_SET__ESTRUCTURALFEATURE = INTERFACE_PROVIDING_ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___EUNSET__ESTRUCTURALFEATURE = INTERFACE_PROVIDING_ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY___EINVOKE__EOPERATION_ELIST = INTERFACE_PROVIDING_ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Interface Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT = INTERFACE_PROVIDING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.InterfaceRequiringEntityImpl <em>Interface Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.InterfaceRequiringEntityImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getInterfaceRequiringEntity()
	 * @generated
	 */
	int INTERFACE_REQUIRING_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY__ENTITY_NAME = ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___ECLASS = ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___EIS_PROXY = ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___ERESOURCE = ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___ECONTAINER = ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___ECONTAINING_FEATURE = ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___ECONTAINMENT_FEATURE = ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___ECONTENTS = ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___EALL_CONTENTS = ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___ECROSS_REFERENCES = ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE = ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT = ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___EIS_SET__ESTRUCTURALFEATURE = ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___EUNSET__ESTRUCTURALFEATURE = ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY___EINVOKE__EOPERATION_ELIST = ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Interface Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REQUIRING_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.ResourceInterfaceRequiringEntityImpl <em>Resource Interface Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.ResourceInterfaceRequiringEntityImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getResourceInterfaceRequiringEntity()
	 * @generated
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY__ENTITY_NAME = ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Interface Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___ECLASS = ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___EIS_PROXY = ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___ERESOURCE = ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___ECONTAINER = ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___ECONTAINING_FEATURE = ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___ECONTAINMENT_FEATURE = ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___ECONTENTS = ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___EALL_CONTENTS = ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___ECROSS_REFERENCES = ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE = ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT = ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___EIS_SET__ESTRUCTURALFEATURE = ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___EUNSET__ESTRUCTURALFEATURE = ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY___EINVOKE__EOPERATION_ELIST = ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Resource Interface Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_REQUIRING_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.ResourceRequiredRoleImpl <em>Resource Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.ResourceRequiredRoleImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getResourceRequiredRole()
	 * @generated
	 */
	int RESOURCE_REQUIRED_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE__ID = RepositoryPackage.ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE__ENTITY_NAME = RepositoryPackage.ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Required Resource Interface Resource Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE = RepositoryPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Interface Requiring Entity Resource Required Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE = RepositoryPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE_FEATURE_COUNT = RepositoryPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___ECLASS = RepositoryPackage.ROLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___EIS_PROXY = RepositoryPackage.ROLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___ERESOURCE = RepositoryPackage.ROLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___ECONTAINER = RepositoryPackage.ROLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___ECONTAINING_FEATURE = RepositoryPackage.ROLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___ECONTAINMENT_FEATURE = RepositoryPackage.ROLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___ECONTENTS = RepositoryPackage.ROLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___EALL_CONTENTS = RepositoryPackage.ROLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___ECROSS_REFERENCES = RepositoryPackage.ROLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE = RepositoryPackage.ROLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = RepositoryPackage.ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = RepositoryPackage.ROLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___EIS_SET__ESTRUCTURALFEATURE = RepositoryPackage.ROLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___EUNSET__ESTRUCTURALFEATURE = RepositoryPackage.ROLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE___EINVOKE__EOPERATION_ELIST = RepositoryPackage.ROLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Resource Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIRED_ROLE_OPERATION_COUNT = RepositoryPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.ResourceInterfaceProvidingEntityImpl <em>Resource Interface Providing Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.ResourceInterfaceProvidingEntityImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getResourceInterfaceProvidingEntity()
	 * @generated
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY__ENTITY_NAME = ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Provided Roles Resource Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Interface Providing Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___ECLASS = ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___EIS_PROXY = ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___ERESOURCE = ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___ECONTAINER = ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___ECONTAINING_FEATURE = ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___ECONTAINMENT_FEATURE = ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___ECONTENTS = ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___EALL_CONTENTS = ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___ECROSS_REFERENCES = ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___EGET__ESTRUCTURALFEATURE = ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT = ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___EIS_SET__ESTRUCTURALFEATURE = ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___EUNSET__ESTRUCTURALFEATURE = ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY___EINVOKE__EOPERATION_ELIST = ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Resource Interface Providing Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.ComposedProvidingRequiringEntityImpl <em>Composed Providing Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.ComposedProvidingRequiringEntityImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getComposedProvidingRequiringEntity()
	 * @generated
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__ID = CompositionPackage.COMPOSED_STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME = CompositionPackage.COMPOSED_STRUCTURE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Assembly Contexts Composed Structure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE = CompositionPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Resource Required Delegation Connectors Composed Structure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE = CompositionPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Event Channel Composed Structure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__EVENT_CHANNEL_COMPOSED_STRUCTURE = CompositionPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Connectors Composed Structure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__CONNECTORS_COMPOSED_STRUCTURE = CompositionPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = CompositionPackage.COMPOSED_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = CompositionPackage.COMPOSED_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = CompositionPackage.COMPOSED_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composed Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT = CompositionPackage.COMPOSED_STRUCTURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___ECLASS = CompositionPackage.COMPOSED_STRUCTURE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___EIS_PROXY = CompositionPackage.COMPOSED_STRUCTURE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___ERESOURCE = CompositionPackage.COMPOSED_STRUCTURE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___ECONTAINER = CompositionPackage.COMPOSED_STRUCTURE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___ECONTAINING_FEATURE = CompositionPackage.COMPOSED_STRUCTURE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___ECONTAINMENT_FEATURE = CompositionPackage.COMPOSED_STRUCTURE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___ECONTENTS = CompositionPackage.COMPOSED_STRUCTURE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___EALL_CONTENTS = CompositionPackage.COMPOSED_STRUCTURE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___ECROSS_REFERENCES = CompositionPackage.COMPOSED_STRUCTURE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE = CompositionPackage.COMPOSED_STRUCTURE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = CompositionPackage.COMPOSED_STRUCTURE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT = CompositionPackage.COMPOSED_STRUCTURE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___EIS_SET__ESTRUCTURALFEATURE = CompositionPackage.COMPOSED_STRUCTURE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___EUNSET__ESTRUCTURALFEATURE = CompositionPackage.COMPOSED_STRUCTURE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___EINVOKE__EOPERATION_ELIST = CompositionPackage.COMPOSED_STRUCTURE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Validate Same Subsystem Must Not Be Instantiated More Than Once</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY___VALIDATE_SAME_SUBSYSTEM_MUST_NOT_BE_INSTANTIATED_MORE_THAN_ONCE__DIAGNOSTICCHAIN_MAP = CompositionPackage.COMPOSED_STRUCTURE___VALIDATE_SAME_SUBSYSTEM_MUST_NOT_BE_INSTANTIATED_MORE_THAN_ONCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Composed Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT = CompositionPackage.COMPOSED_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.NamedElementImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ENTITY_NAME = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ECLASS = PcmPackage.PCM_BASE_CLASS___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___EIS_PROXY = PcmPackage.PCM_BASE_CLASS___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ERESOURCE = PcmPackage.PCM_BASE_CLASS___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ECONTAINER = PcmPackage.PCM_BASE_CLASS___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ECONTAINING_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ECONTAINMENT_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ECONTENTS = PcmPackage.PCM_BASE_CLASS___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___EALL_CONTENTS = PcmPackage.PCM_BASE_CLASS___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ECROSS_REFERENCES = PcmPackage.PCM_BASE_CLASS___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT = PcmPackage.PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST = PcmPackage.PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = PcmPackage.PCM_BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.core.entity.impl.ResourceInterfaceProvidingRequiringEntityImpl <em>Resource Interface Providing Requiring Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.entity.impl.ResourceInterfaceProvidingRequiringEntityImpl
	 * @see pcm.core.entity.impl.EntityPackageImpl#getResourceInterfaceProvidingRequiringEntity()
	 * @generated
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__ID = RESOURCE_INTERFACE_REQUIRING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME = RESOURCE_INTERFACE_REQUIRING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Resource Provided Roles Resource Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY = RESOURCE_INTERFACE_REQUIRING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Interface Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT = RESOURCE_INTERFACE_REQUIRING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___ECLASS = RESOURCE_INTERFACE_REQUIRING_ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___EIS_PROXY = RESOURCE_INTERFACE_REQUIRING_ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___ERESOURCE = RESOURCE_INTERFACE_REQUIRING_ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTAINER = RESOURCE_INTERFACE_REQUIRING_ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTAINING_FEATURE = RESOURCE_INTERFACE_REQUIRING_ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTAINMENT_FEATURE = RESOURCE_INTERFACE_REQUIRING_ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTENTS = RESOURCE_INTERFACE_REQUIRING_ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___EALL_CONTENTS = RESOURCE_INTERFACE_REQUIRING_ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___ECROSS_REFERENCES = RESOURCE_INTERFACE_REQUIRING_ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE = RESOURCE_INTERFACE_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = RESOURCE_INTERFACE_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT = RESOURCE_INTERFACE_REQUIRING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___EIS_SET__ESTRUCTURALFEATURE = RESOURCE_INTERFACE_REQUIRING_ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___EUNSET__ESTRUCTURALFEATURE = RESOURCE_INTERFACE_REQUIRING_ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY___EINVOKE__EOPERATION_ELIST = RESOURCE_INTERFACE_REQUIRING_ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Resource Interface Providing Requiring Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT = RESOURCE_INTERFACE_REQUIRING_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcm.core.entity.ResourceProvidedRole <em>Resource Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Provided Role</em>'.
	 * @see pcm.core.entity.ResourceProvidedRole
	 * @generated
	 */
	EClass getResourceProvidedRole();

	/**
	 * Returns the meta object for the container reference '{@link pcm.core.entity.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole <em>Resource Interface Providing Entity Resource Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Interface Providing Entity Resource Provided Role</em>'.
	 * @see pcm.core.entity.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole()
	 * @see #getResourceProvidedRole()
	 * @generated
	 */
	EReference getResourceProvidedRole_ResourceInterfaceProvidingEntity__ResourceProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link pcm.core.entity.ResourceProvidedRole#getProvidedResourceInterface__ResourceProvidedRole <em>Provided Resource Interface Resource Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Resource Interface Resource Provided Role</em>'.
	 * @see pcm.core.entity.ResourceProvidedRole#getProvidedResourceInterface__ResourceProvidedRole()
	 * @see #getResourceProvidedRole()
	 * @generated
	 */
	EReference getResourceProvidedRole_ProvidedResourceInterface__ResourceProvidedRole();

	/**
	 * Returns the meta object for class '{@link pcm.core.entity.InterfaceProvidingRequiringEntity <em>Interface Providing Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Providing Requiring Entity</em>'.
	 * @see pcm.core.entity.InterfaceProvidingRequiringEntity
	 * @generated
	 */
	EClass getInterfaceProvidingRequiringEntity();

	/**
	 * Returns the meta object for class '{@link pcm.core.entity.InterfaceProvidingEntity <em>Interface Providing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Providing Entity</em>'.
	 * @see pcm.core.entity.InterfaceProvidingEntity
	 * @generated
	 */
	EClass getInterfaceProvidingEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.core.entity.InterfaceProvidingEntity#getProvidedRoles_InterfaceProvidingEntity <em>Provided Roles Interface Providing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Roles Interface Providing Entity</em>'.
	 * @see pcm.core.entity.InterfaceProvidingEntity#getProvidedRoles_InterfaceProvidingEntity()
	 * @see #getInterfaceProvidingEntity()
	 * @generated
	 */
	EReference getInterfaceProvidingEntity_ProvidedRoles_InterfaceProvidingEntity();

	/**
	 * Returns the meta object for class '{@link pcm.core.entity.InterfaceRequiringEntity <em>Interface Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Requiring Entity</em>'.
	 * @see pcm.core.entity.InterfaceRequiringEntity
	 * @generated
	 */
	EClass getInterfaceRequiringEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.core.entity.InterfaceRequiringEntity#getRequiredRoles_InterfaceRequiringEntity <em>Required Roles Interface Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Roles Interface Requiring Entity</em>'.
	 * @see pcm.core.entity.InterfaceRequiringEntity#getRequiredRoles_InterfaceRequiringEntity()
	 * @see #getInterfaceRequiringEntity()
	 * @generated
	 */
	EReference getInterfaceRequiringEntity_RequiredRoles_InterfaceRequiringEntity();

	/**
	 * Returns the meta object for class '{@link pcm.core.entity.ResourceInterfaceRequiringEntity <em>Resource Interface Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interface Requiring Entity</em>'.
	 * @see pcm.core.entity.ResourceInterfaceRequiringEntity
	 * @generated
	 */
	EClass getResourceInterfaceRequiringEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.core.entity.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Required Roles Resource Interface Requiring Entity</em>'.
	 * @see pcm.core.entity.ResourceInterfaceRequiringEntity#getResourceRequiredRoles__ResourceInterfaceRequiringEntity()
	 * @see #getResourceInterfaceRequiringEntity()
	 * @generated
	 */
	EReference getResourceInterfaceRequiringEntity_ResourceRequiredRoles__ResourceInterfaceRequiringEntity();

	/**
	 * Returns the meta object for class '{@link pcm.core.entity.ResourceRequiredRole <em>Resource Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Required Role</em>'.
	 * @see pcm.core.entity.ResourceRequiredRole
	 * @generated
	 */
	EClass getResourceRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link pcm.core.entity.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole <em>Required Resource Interface Resource Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Resource Interface Resource Required Role</em>'.
	 * @see pcm.core.entity.ResourceRequiredRole#getRequiredResourceInterface__ResourceRequiredRole()
	 * @see #getResourceRequiredRole()
	 * @generated
	 */
	EReference getResourceRequiredRole_RequiredResourceInterface__ResourceRequiredRole();

	/**
	 * Returns the meta object for the container reference '{@link pcm.core.entity.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole <em>Resource Interface Requiring Entity Resource Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Interface Requiring Entity Resource Required Role</em>'.
	 * @see pcm.core.entity.ResourceRequiredRole#getResourceInterfaceRequiringEntity__ResourceRequiredRole()
	 * @see #getResourceRequiredRole()
	 * @generated
	 */
	EReference getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole();

	/**
	 * Returns the meta object for class '{@link pcm.core.entity.ResourceInterfaceProvidingEntity <em>Resource Interface Providing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interface Providing Entity</em>'.
	 * @see pcm.core.entity.ResourceInterfaceProvidingEntity
	 * @generated
	 */
	EClass getResourceInterfaceProvidingEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.core.entity.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity <em>Resource Provided Roles Resource Interface Providing Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Provided Roles Resource Interface Providing Entity</em>'.
	 * @see pcm.core.entity.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity()
	 * @see #getResourceInterfaceProvidingEntity()
	 * @generated
	 */
	EReference getResourceInterfaceProvidingEntity_ResourceProvidedRoles__ResourceInterfaceProvidingEntity();

	/**
	 * Returns the meta object for class '{@link pcm.core.entity.ComposedProvidingRequiringEntity <em>Composed Providing Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Providing Requiring Entity</em>'.
	 * @see pcm.core.entity.ComposedProvidingRequiringEntity
	 * @generated
	 */
	EClass getComposedProvidingRequiringEntity();

	/**
	 * Returns the meta object for class '{@link pcm.core.entity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see pcm.core.entity.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link pcm.core.entity.NamedElement#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see pcm.core.entity.NamedElement#getEntityName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_EntityName();

	/**
	 * Returns the meta object for class '{@link pcm.core.entity.ResourceInterfaceProvidingRequiringEntity <em>Resource Interface Providing Requiring Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Interface Providing Requiring Entity</em>'.
	 * @see pcm.core.entity.ResourceInterfaceProvidingRequiringEntity
	 * @generated
	 */
	EClass getResourceInterfaceProvidingRequiringEntity();

	/**
	 * Returns the meta object for class '{@link pcm.core.entity.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see pcm.core.entity.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntityFactory getEntityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.ResourceProvidedRoleImpl <em>Resource Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.ResourceProvidedRoleImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getResourceProvidedRole()
		 * @generated
		 */
		EClass RESOURCE_PROVIDED_ROLE = eINSTANCE.getResourceProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Resource Interface Providing Entity Resource Provided Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE = eINSTANCE.getResourceProvidedRole_ResourceInterfaceProvidingEntity__ResourceProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Provided Resource Interface Resource Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PROVIDED_ROLE__PROVIDED_RESOURCE_INTERFACE_RESOURCE_PROVIDED_ROLE = eINSTANCE.getResourceProvidedRole_ProvidedResourceInterface__ResourceProvidedRole();

		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.InterfaceProvidingRequiringEntityImpl <em>Interface Providing Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.InterfaceProvidingRequiringEntityImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getInterfaceProvidingRequiringEntity()
		 * @generated
		 */
		EClass INTERFACE_PROVIDING_REQUIRING_ENTITY = eINSTANCE.getInterfaceProvidingRequiringEntity();

		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.InterfaceProvidingEntityImpl <em>Interface Providing Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.InterfaceProvidingEntityImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getInterfaceProvidingEntity()
		 * @generated
		 */
		EClass INTERFACE_PROVIDING_ENTITY = eINSTANCE.getInterfaceProvidingEntity();

		/**
		 * The meta object literal for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = eINSTANCE.getInterfaceProvidingEntity_ProvidedRoles_InterfaceProvidingEntity();

		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.InterfaceRequiringEntityImpl <em>Interface Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.InterfaceRequiringEntityImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getInterfaceRequiringEntity()
		 * @generated
		 */
		EClass INTERFACE_REQUIRING_ENTITY = eINSTANCE.getInterfaceRequiringEntity();

		/**
		 * The meta object literal for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = eINSTANCE.getInterfaceRequiringEntity_RequiredRoles_InterfaceRequiringEntity();

		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.ResourceInterfaceRequiringEntityImpl <em>Resource Interface Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.ResourceInterfaceRequiringEntityImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getResourceInterfaceRequiringEntity()
		 * @generated
		 */
		EClass RESOURCE_INTERFACE_REQUIRING_ENTITY = eINSTANCE.getResourceInterfaceRequiringEntity();

		/**
		 * The meta object literal for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = eINSTANCE.getResourceInterfaceRequiringEntity_ResourceRequiredRoles__ResourceInterfaceRequiringEntity();

		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.ResourceRequiredRoleImpl <em>Resource Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.ResourceRequiredRoleImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getResourceRequiredRole()
		 * @generated
		 */
		EClass RESOURCE_REQUIRED_ROLE = eINSTANCE.getResourceRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Required Resource Interface Resource Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIRED_ROLE__REQUIRED_RESOURCE_INTERFACE_RESOURCE_REQUIRED_ROLE = eINSTANCE.getResourceRequiredRole_RequiredResourceInterface__ResourceRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Resource Interface Requiring Entity Resource Required Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE = eINSTANCE.getResourceRequiredRole_ResourceInterfaceRequiringEntity__ResourceRequiredRole();

		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.ResourceInterfaceProvidingEntityImpl <em>Resource Interface Providing Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.ResourceInterfaceProvidingEntityImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getResourceInterfaceProvidingEntity()
		 * @generated
		 */
		EClass RESOURCE_INTERFACE_PROVIDING_ENTITY = eINSTANCE.getResourceInterfaceProvidingEntity();

		/**
		 * The meta object literal for the '<em><b>Resource Provided Roles Resource Interface Providing Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY = eINSTANCE.getResourceInterfaceProvidingEntity_ResourceProvidedRoles__ResourceInterfaceProvidingEntity();

		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.ComposedProvidingRequiringEntityImpl <em>Composed Providing Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.ComposedProvidingRequiringEntityImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getComposedProvidingRequiringEntity()
		 * @generated
		 */
		EClass COMPOSED_PROVIDING_REQUIRING_ENTITY = eINSTANCE.getComposedProvidingRequiringEntity();

		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.NamedElementImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Entity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ENTITY_NAME = eINSTANCE.getNamedElement_EntityName();

		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.ResourceInterfaceProvidingRequiringEntityImpl <em>Resource Interface Providing Requiring Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.ResourceInterfaceProvidingRequiringEntityImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getResourceInterfaceProvidingRequiringEntity()
		 * @generated
		 */
		EClass RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY = eINSTANCE.getResourceInterfaceProvidingRequiringEntity();

		/**
		 * The meta object literal for the '{@link pcm.core.entity.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.core.entity.impl.EntityImpl
		 * @see pcm.core.entity.impl.EntityPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

	}

} //EntityPackage

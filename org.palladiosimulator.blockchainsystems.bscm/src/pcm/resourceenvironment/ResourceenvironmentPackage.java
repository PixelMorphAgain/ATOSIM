/**
 */
package pcm.resourceenvironment;

import identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pcm.core.entity.EntityPackage;

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
 * Package of entities representing the execution environment of a component based software system
 * <!-- end-model-doc -->
 * @see pcm.resourceenvironment.ResourceenvironmentFactory
 * @model kind="package"
 * @generated
 */
public interface ResourceenvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourceenvironment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/ResourceEnvironment/5.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resourceenvironment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceenvironmentPackage eINSTANCE = pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcm.resourceenvironment.impl.ResourceEnvironmentImpl <em>Resource Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.resourceenvironment.impl.ResourceEnvironmentImpl
	 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getResourceEnvironment()
	 * @generated
	 */
	int RESOURCE_ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Linking Resources Resource Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Container Resource Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___ECLASS = EntityPackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___EIS_PROXY = EntityPackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___ERESOURCE = EntityPackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___ECONTAINER = EntityPackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___ECONTAINING_FEATURE = EntityPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___ECONTAINMENT_FEATURE = EntityPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___ECONTENTS = EntityPackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___EALL_CONTENTS = EntityPackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___ECROSS_REFERENCES = EntityPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___EGET__ESTRUCTURALFEATURE = EntityPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___EUNSET__ESTRUCTURALFEATURE = EntityPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT___EINVOKE__EOPERATION_ELIST = EntityPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Resource Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENVIRONMENT_OPERATION_COUNT = EntityPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.resourceenvironment.impl.LinkingResourceImpl <em>Linking Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.resourceenvironment.impl.LinkingResourceImpl
	 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getLinkingResource()
	 * @generated
	 */
	int LINKING_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Connected Resource Containers Linking Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Specifications Linking Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Environment Linking Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Linking Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Linking Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_RESOURCE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.resourceenvironment.impl.ResourceContainerImpl <em>Resource Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.resourceenvironment.impl.ResourceContainerImpl
	 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getResourceContainer()
	 * @generated
	 */
	int RESOURCE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Environment Resource Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nested Resource Containers Resource Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Resource Container Resource Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hdd Resource Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resource Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Resource Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl <em>Processing Resource Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl
	 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getProcessingResourceSpecification()
	 * @generated
	 */
	int PROCESSING_RESOURCE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>MTTR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__MTTR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MTTF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__MTTF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required By Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Processing Rate Processing Resource Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Number Of Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resource Container Processing Resource Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Processing Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___ECLASS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___EIS_PROXY = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___ERESOURCE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___ECONTAINER = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___ECONTAINING_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___ECONTAINMENT_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___ECONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___EALL_CONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___ECROSS_REFERENCES = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___EGET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___EUNSET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION___EINVOKE__EOPERATION_ELIST = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Processing Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_SPECIFICATION_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl <em>Communication Link Resource Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl
	 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Linking Resource Communication Link Resource Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Type Communication Link Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Latency Communication Link Resource Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Throughput Communication Link Resource Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Communication Link Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___ECLASS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___EIS_PROXY = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___ERESOURCE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___ECONTAINER = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___ECONTAINING_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___ECONTAINMENT_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___ECONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___EALL_CONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___ECROSS_REFERENCES = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___EGET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___EUNSET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION___EINVOKE__EOPERATION_ELIST = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Communication Link Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_RESOURCE_SPECIFICATION_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link pcm.resourceenvironment.impl.HDDProcessingResourceSpecificationImpl <em>HDD Processing Resource Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.resourceenvironment.impl.HDDProcessingResourceSpecificationImpl
	 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getHDDProcessingResourceSpecification()
	 * @generated
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__ID = PROCESSING_RESOURCE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>MTTR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__MTTR = PROCESSING_RESOURCE_SPECIFICATION__MTTR;

	/**
	 * The feature id for the '<em><b>MTTF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__MTTF = PROCESSING_RESOURCE_SPECIFICATION__MTTF;

	/**
	 * The feature id for the '<em><b>Required By Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER = PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY = PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY;

	/**
	 * The feature id for the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION = PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Processing Rate Processing Resource Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION = PROCESSING_RESOURCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Number Of Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS = PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS;

	/**
	 * The feature id for the '<em><b>Resource Container Processing Resource Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION = PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Write Processing Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE = PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Processing Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE = PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER = PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>HDD Processing Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT = PROCESSING_RESOURCE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___ECLASS = PROCESSING_RESOURCE_SPECIFICATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___EIS_PROXY = PROCESSING_RESOURCE_SPECIFICATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___ERESOURCE = PROCESSING_RESOURCE_SPECIFICATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___ECONTAINER = PROCESSING_RESOURCE_SPECIFICATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___ECONTAINING_FEATURE = PROCESSING_RESOURCE_SPECIFICATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___ECONTAINMENT_FEATURE = PROCESSING_RESOURCE_SPECIFICATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___ECONTENTS = PROCESSING_RESOURCE_SPECIFICATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___EALL_CONTENTS = PROCESSING_RESOURCE_SPECIFICATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___ECROSS_REFERENCES = PROCESSING_RESOURCE_SPECIFICATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___EGET__ESTRUCTURALFEATURE = PROCESSING_RESOURCE_SPECIFICATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = PROCESSING_RESOURCE_SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT = PROCESSING_RESOURCE_SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE = PROCESSING_RESOURCE_SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___EUNSET__ESTRUCTURALFEATURE = PROCESSING_RESOURCE_SPECIFICATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION___EINVOKE__EOPERATION_ELIST = PROCESSING_RESOURCE_SPECIFICATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>HDD Processing Resource Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_PROCESSING_RESOURCE_SPECIFICATION_OPERATION_COUNT = PROCESSING_RESOURCE_SPECIFICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcm.resourceenvironment.ResourceEnvironment <em>Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Environment</em>'.
	 * @see pcm.resourceenvironment.ResourceEnvironment
	 * @generated
	 */
	EClass getResourceEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.resourceenvironment.ResourceEnvironment#getLinkingResources__ResourceEnvironment <em>Linking Resources Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linking Resources Resource Environment</em>'.
	 * @see pcm.resourceenvironment.ResourceEnvironment#getLinkingResources__ResourceEnvironment()
	 * @see #getResourceEnvironment()
	 * @generated
	 */
	EReference getResourceEnvironment_LinkingResources__ResourceEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.resourceenvironment.ResourceEnvironment#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Container Resource Environment</em>'.
	 * @see pcm.resourceenvironment.ResourceEnvironment#getResourceContainer_ResourceEnvironment()
	 * @see #getResourceEnvironment()
	 * @generated
	 */
	EReference getResourceEnvironment_ResourceContainer_ResourceEnvironment();

	/**
	 * Returns the meta object for class '{@link pcm.resourceenvironment.LinkingResource <em>Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linking Resource</em>'.
	 * @see pcm.resourceenvironment.LinkingResource
	 * @generated
	 */
	EClass getLinkingResource();

	/**
	 * Returns the meta object for the reference list '{@link pcm.resourceenvironment.LinkingResource#getConnectedResourceContainers_LinkingResource <em>Connected Resource Containers Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Resource Containers Linking Resource</em>'.
	 * @see pcm.resourceenvironment.LinkingResource#getConnectedResourceContainers_LinkingResource()
	 * @see #getLinkingResource()
	 * @generated
	 */
	EReference getLinkingResource_ConnectedResourceContainers_LinkingResource();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.resourceenvironment.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication Link Resource Specifications Linking Resource</em>'.
	 * @see pcm.resourceenvironment.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource()
	 * @see #getLinkingResource()
	 * @generated
	 */
	EReference getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource();

	/**
	 * Returns the meta object for the container reference '{@link pcm.resourceenvironment.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Environment Linking Resource</em>'.
	 * @see pcm.resourceenvironment.LinkingResource#getResourceEnvironment_LinkingResource()
	 * @see #getLinkingResource()
	 * @generated
	 */
	EReference getLinkingResource_ResourceEnvironment_LinkingResource();

	/**
	 * Returns the meta object for class '{@link pcm.resourceenvironment.ResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Container</em>'.
	 * @see pcm.resourceenvironment.ResourceContainer
	 * @generated
	 */
	EClass getResourceContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.resourceenvironment.ResourceContainer#getActiveResourceSpecifications_ResourceContainer <em>Active Resource Specifications Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Active Resource Specifications Resource Container</em>'.
	 * @see pcm.resourceenvironment.ResourceContainer#getActiveResourceSpecifications_ResourceContainer()
	 * @see #getResourceContainer()
	 * @generated
	 */
	EReference getResourceContainer_ActiveResourceSpecifications_ResourceContainer();

	/**
	 * Returns the meta object for the container reference '{@link pcm.resourceenvironment.ResourceContainer#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Environment Resource Container</em>'.
	 * @see pcm.resourceenvironment.ResourceContainer#getResourceEnvironment_ResourceContainer()
	 * @see #getResourceContainer()
	 * @generated
	 */
	EReference getResourceContainer_ResourceEnvironment_ResourceContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.resourceenvironment.ResourceContainer#getNestedResourceContainers__ResourceContainer <em>Nested Resource Containers Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Resource Containers Resource Container</em>'.
	 * @see pcm.resourceenvironment.ResourceContainer#getNestedResourceContainers__ResourceContainer()
	 * @see #getResourceContainer()
	 * @generated
	 */
	EReference getResourceContainer_NestedResourceContainers__ResourceContainer();

	/**
	 * Returns the meta object for the container reference '{@link pcm.resourceenvironment.ResourceContainer#getParentResourceContainer__ResourceContainer <em>Parent Resource Container Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Resource Container Resource Container</em>'.
	 * @see pcm.resourceenvironment.ResourceContainer#getParentResourceContainer__ResourceContainer()
	 * @see #getResourceContainer()
	 * @generated
	 */
	EReference getResourceContainer_ParentResourceContainer__ResourceContainer();

	/**
	 * Returns the meta object for the reference list '{@link pcm.resourceenvironment.ResourceContainer#getHddResourceSpecifications <em>Hdd Resource Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hdd Resource Specifications</em>'.
	 * @see pcm.resourceenvironment.ResourceContainer#getHddResourceSpecifications()
	 * @see #getResourceContainer()
	 * @generated
	 */
	EReference getResourceContainer_HddResourceSpecifications();

	/**
	 * Returns the meta object for class '{@link pcm.resourceenvironment.ProcessingResourceSpecification <em>Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Specification</em>'.
	 * @see pcm.resourceenvironment.ProcessingResourceSpecification
	 * @generated
	 */
	EClass getProcessingResourceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pcm.resourceenvironment.ProcessingResourceSpecification#getMTTR <em>MTTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MTTR</em>'.
	 * @see pcm.resourceenvironment.ProcessingResourceSpecification#getMTTR()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EAttribute getProcessingResourceSpecification_MTTR();

	/**
	 * Returns the meta object for the attribute '{@link pcm.resourceenvironment.ProcessingResourceSpecification#getMTTF <em>MTTF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MTTF</em>'.
	 * @see pcm.resourceenvironment.ProcessingResourceSpecification#getMTTF()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EAttribute getProcessingResourceSpecification_MTTF();

	/**
	 * Returns the meta object for the attribute '{@link pcm.resourceenvironment.ProcessingResourceSpecification#isRequiredByContainer <em>Required By Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required By Container</em>'.
	 * @see pcm.resourceenvironment.ProcessingResourceSpecification#isRequiredByContainer()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EAttribute getProcessingResourceSpecification_RequiredByContainer();

	/**
	 * Returns the meta object for the reference '{@link pcm.resourceenvironment.ProcessingResourceSpecification#getSchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduling Policy</em>'.
	 * @see pcm.resourceenvironment.ProcessingResourceSpecification#getSchedulingPolicy()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EReference getProcessingResourceSpecification_SchedulingPolicy();

	/**
	 * Returns the meta object for the reference '{@link pcm.resourceenvironment.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification <em>Active Resource Type Active Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Resource Type Active Resource Specification</em>'.
	 * @see pcm.resourceenvironment.ProcessingResourceSpecification#getActiveResourceType_ActiveResourceSpecification()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EReference getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.resourceenvironment.ProcessingResourceSpecification#getProcessingRate_ProcessingResourceSpecification <em>Processing Rate Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Rate Processing Resource Specification</em>'.
	 * @see pcm.resourceenvironment.ProcessingResourceSpecification#getProcessingRate_ProcessingResourceSpecification()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EReference getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pcm.resourceenvironment.ProcessingResourceSpecification#getNumberOfReplicas <em>Number Of Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Replicas</em>'.
	 * @see pcm.resourceenvironment.ProcessingResourceSpecification#getNumberOfReplicas()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EAttribute getProcessingResourceSpecification_NumberOfReplicas();

	/**
	 * Returns the meta object for the container reference '{@link pcm.resourceenvironment.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification <em>Resource Container Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Container Processing Resource Specification</em>'.
	 * @see pcm.resourceenvironment.ProcessingResourceSpecification#getResourceContainer_ProcessingResourceSpecification()
	 * @see #getProcessingResourceSpecification()
	 * @generated
	 */
	EReference getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification();

	/**
	 * Returns the meta object for class '{@link pcm.resourceenvironment.CommunicationLinkResourceSpecification <em>Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link Resource Specification</em>'.
	 * @see pcm.resourceenvironment.CommunicationLinkResourceSpecification
	 * @generated
	 */
	EClass getCommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for the container reference '{@link pcm.resourceenvironment.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification <em>Linking Resource Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Linking Resource Communication Link Resource Specification</em>'.
	 * @see pcm.resourceenvironment.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification()
	 * @see #getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pcm.resourceenvironment.CommunicationLinkResourceSpecification#getFailureProbability <em>Failure Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Probability</em>'.
	 * @see pcm.resourceenvironment.CommunicationLinkResourceSpecification#getFailureProbability()
	 * @see #getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	EAttribute getCommunicationLinkResourceSpecification_FailureProbability();

	/**
	 * Returns the meta object for the reference '{@link pcm.resourceenvironment.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification <em>Communication Link Resource Type Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Link Resource Type Communication Link Resource Specification</em>'.
	 * @see pcm.resourceenvironment.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification()
	 * @see #getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.resourceenvironment.CommunicationLinkResourceSpecification#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency Communication Link Resource Specification</em>'.
	 * @see pcm.resourceenvironment.CommunicationLinkResourceSpecification#getLatency_CommunicationLinkResourceSpecification()
	 * @see #getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.resourceenvironment.CommunicationLinkResourceSpecification#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throughput Communication Link Resource Specification</em>'.
	 * @see pcm.resourceenvironment.CommunicationLinkResourceSpecification#getThroughput_CommunicationLinkResourceSpecification()
	 * @see #getCommunicationLinkResourceSpecification()
	 * @generated
	 */
	EReference getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification();

	/**
	 * Returns the meta object for class '{@link pcm.resourceenvironment.HDDProcessingResourceSpecification <em>HDD Processing Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDD Processing Resource Specification</em>'.
	 * @see pcm.resourceenvironment.HDDProcessingResourceSpecification
	 * @generated
	 */
	EClass getHDDProcessingResourceSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.resourceenvironment.HDDProcessingResourceSpecification#getWriteProcessingRate <em>Write Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Write Processing Rate</em>'.
	 * @see pcm.resourceenvironment.HDDProcessingResourceSpecification#getWriteProcessingRate()
	 * @see #getHDDProcessingResourceSpecification()
	 * @generated
	 */
	EReference getHDDProcessingResourceSpecification_WriteProcessingRate();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.resourceenvironment.HDDProcessingResourceSpecification#getReadProcessingRate <em>Read Processing Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Processing Rate</em>'.
	 * @see pcm.resourceenvironment.HDDProcessingResourceSpecification#getReadProcessingRate()
	 * @see #getHDDProcessingResourceSpecification()
	 * @generated
	 */
	EReference getHDDProcessingResourceSpecification_ReadProcessingRate();

	/**
	 * Returns the meta object for the reference '{@link pcm.resourceenvironment.HDDProcessingResourceSpecification#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Container</em>'.
	 * @see pcm.resourceenvironment.HDDProcessingResourceSpecification#getResourceContainer()
	 * @see #getHDDProcessingResourceSpecification()
	 * @generated
	 */
	EReference getHDDProcessingResourceSpecification_ResourceContainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourceenvironmentFactory getResourceenvironmentFactory();

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
		 * The meta object literal for the '{@link pcm.resourceenvironment.impl.ResourceEnvironmentImpl <em>Resource Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.resourceenvironment.impl.ResourceEnvironmentImpl
		 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getResourceEnvironment()
		 * @generated
		 */
		EClass RESOURCE_ENVIRONMENT = eINSTANCE.getResourceEnvironment();

		/**
		 * The meta object literal for the '<em><b>Linking Resources Resource Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT = eINSTANCE.getResourceEnvironment_LinkingResources__ResourceEnvironment();

		/**
		 * The meta object literal for the '<em><b>Resource Container Resource Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT = eINSTANCE.getResourceEnvironment_ResourceContainer_ResourceEnvironment();

		/**
		 * The meta object literal for the '{@link pcm.resourceenvironment.impl.LinkingResourceImpl <em>Linking Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.resourceenvironment.impl.LinkingResourceImpl
		 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getLinkingResource()
		 * @generated
		 */
		EClass LINKING_RESOURCE = eINSTANCE.getLinkingResource();

		/**
		 * The meta object literal for the '<em><b>Connected Resource Containers Linking Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE = eINSTANCE.getLinkingResource_ConnectedResourceContainers_LinkingResource();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Specifications Linking Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE = eINSTANCE.getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource();

		/**
		 * The meta object literal for the '<em><b>Resource Environment Linking Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE = eINSTANCE.getLinkingResource_ResourceEnvironment_LinkingResource();

		/**
		 * The meta object literal for the '{@link pcm.resourceenvironment.impl.ResourceContainerImpl <em>Resource Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.resourceenvironment.impl.ResourceContainerImpl
		 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getResourceContainer()
		 * @generated
		 */
		EClass RESOURCE_CONTAINER = eINSTANCE.getResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Active Resource Specifications Resource Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER = eINSTANCE.getResourceContainer_ActiveResourceSpecifications_ResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Resource Environment Resource Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER = eINSTANCE.getResourceContainer_ResourceEnvironment_ResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Nested Resource Containers Resource Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER = eINSTANCE.getResourceContainer_NestedResourceContainers__ResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Parent Resource Container Resource Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER = eINSTANCE.getResourceContainer_ParentResourceContainer__ResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Hdd Resource Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS = eINSTANCE.getResourceContainer_HddResourceSpecifications();

		/**
		 * The meta object literal for the '{@link pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl <em>Processing Resource Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.resourceenvironment.impl.ProcessingResourceSpecificationImpl
		 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getProcessingResourceSpecification()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>MTTR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_SPECIFICATION__MTTR = eINSTANCE.getProcessingResourceSpecification_MTTR();

		/**
		 * The meta object literal for the '<em><b>MTTF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_SPECIFICATION__MTTF = eINSTANCE.getProcessingResourceSpecification_MTTF();

		/**
		 * The meta object literal for the '<em><b>Required By Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER = eINSTANCE.getProcessingResourceSpecification_RequiredByContainer();

		/**
		 * The meta object literal for the '<em><b>Scheduling Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY = eINSTANCE.getProcessingResourceSpecification_SchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>Active Resource Type Active Resource Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Processing Rate Processing Resource Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Number Of Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS = eINSTANCE.getProcessingResourceSpecification_NumberOfReplicas();

		/**
		 * The meta object literal for the '<em><b>Resource Container Processing Resource Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification();

		/**
		 * The meta object literal for the '{@link pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl <em>Communication Link Resource Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.resourceenvironment.impl.CommunicationLinkResourceSpecificationImpl
		 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getCommunicationLinkResourceSpecification()
		 * @generated
		 */
		EClass COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Linking Resource Communication Link Resource Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Failure Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY = eINSTANCE.getCommunicationLinkResourceSpecification_FailureProbability();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Type Communication Link Resource Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Latency Communication Link Resource Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Throughput Communication Link Resource Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION = eINSTANCE.getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification();

		/**
		 * The meta object literal for the '{@link pcm.resourceenvironment.impl.HDDProcessingResourceSpecificationImpl <em>HDD Processing Resource Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.resourceenvironment.impl.HDDProcessingResourceSpecificationImpl
		 * @see pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl#getHDDProcessingResourceSpecification()
		 * @generated
		 */
		EClass HDD_PROCESSING_RESOURCE_SPECIFICATION = eINSTANCE.getHDDProcessingResourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Write Processing Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE = eINSTANCE.getHDDProcessingResourceSpecification_WriteProcessingRate();

		/**
		 * The meta object literal for the '<em><b>Read Processing Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE = eINSTANCE.getHDDProcessingResourceSpecification_ReadProcessingRate();

		/**
		 * The meta object literal for the '<em><b>Resource Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER = eINSTANCE.getHDDProcessingResourceSpecification_ResourceContainer();

	}

} //ResourceenvironmentPackage

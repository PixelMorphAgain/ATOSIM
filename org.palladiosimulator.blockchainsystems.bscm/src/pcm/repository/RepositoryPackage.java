/**
 */
package pcm.repository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pcm.PcmPackage;

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
 * The main package contributing component types and interfaces.
 * <!-- end-model-doc -->
 * @see pcm.repository.RepositoryFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG'"
 * @generated
 */
public interface RepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/Repository/5.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "repository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepositoryPackage eINSTANCE = pcm.repository.impl.RepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcm.repository.impl.PassiveResourceImpl <em>Passive Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.PassiveResourceImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getPassiveResource()
	 * @generated
	 */
	int PASSIVE_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Capacity Passive Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Basic Component Passive Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Timeout Failure Type Passive Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Passive Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Passive Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.RepositoryComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.RepositoryComponentImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getRepositoryComponent()
	 * @generated
	 */
	int REPOSITORY_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__ID = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__ENTITY_NAME = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT_FEATURE_COUNT = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___ECLASS = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___EIS_PROXY = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___ERESOURCE = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___ECONTAINER = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___ECONTAINING_FEATURE = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___ECONTAINMENT_FEATURE = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___ECONTENTS = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___EALL_CONTENTS = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___ECROSS_REFERENCES = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___EGET__ESTRUCTURALFEATURE = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___EUNSET__ESTRUCTURALFEATURE = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT___EINVOKE__EOPERATION_ELIST = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_COMPONENT_OPERATION_COUNT = EntityPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.ImplementationComponentTypeImpl <em>Implementation Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.ImplementationComponentTypeImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getImplementationComponentType()
	 * @generated
	 */
	int IMPLEMENTATION_COMPONENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__ID = REPOSITORY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__ENTITY_NAME = REPOSITORY_COMPONENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__REPOSITORY_REPOSITORY_COMPONENT = REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;

	/**
	 * The feature id for the '<em><b>Parent Complete Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES = REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = REPOSITORY_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE = REPOSITORY_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Implementation Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT = REPOSITORY_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___ECLASS = REPOSITORY_COMPONENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___EIS_PROXY = REPOSITORY_COMPONENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___ERESOURCE = REPOSITORY_COMPONENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___ECONTAINER = REPOSITORY_COMPONENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___ECONTAINING_FEATURE = REPOSITORY_COMPONENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___ECONTAINMENT_FEATURE = REPOSITORY_COMPONENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___ECONTENTS = REPOSITORY_COMPONENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___EALL_CONTENTS = REPOSITORY_COMPONENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___ECROSS_REFERENCES = REPOSITORY_COMPONENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___EGET__ESTRUCTURALFEATURE = REPOSITORY_COMPONENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = REPOSITORY_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = REPOSITORY_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___EIS_SET__ESTRUCTURALFEATURE = REPOSITORY_COMPONENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___EUNSET__ESTRUCTURALFEATURE = REPOSITORY_COMPONENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE___EINVOKE__EOPERATION_ELIST = REPOSITORY_COMPONENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Implementation Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_COMPONENT_TYPE_OPERATION_COUNT = REPOSITORY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.BasicComponentImpl <em>Basic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.BasicComponentImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getBasicComponent()
	 * @generated
	 */
	int BASIC_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__ID = IMPLEMENTATION_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__ENTITY_NAME = IMPLEMENTATION_COMPONENT_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = IMPLEMENTATION_COMPONENT_TYPE__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = IMPLEMENTATION_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT = IMPLEMENTATION_COMPONENT_TYPE__REPOSITORY_REPOSITORY_COMPONENT;

	/**
	 * The feature id for the '<em><b>Parent Complete Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES = IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES;

	/**
	 * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__COMPONENT_TYPE = IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Service Effect Specifications Basic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT = IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Passive Resource Basic Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT = IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_FEATURE_COUNT = IMPLEMENTATION_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___ECLASS = IMPLEMENTATION_COMPONENT_TYPE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___EIS_PROXY = IMPLEMENTATION_COMPONENT_TYPE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___ERESOURCE = IMPLEMENTATION_COMPONENT_TYPE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___ECONTAINER = IMPLEMENTATION_COMPONENT_TYPE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___ECONTAINING_FEATURE = IMPLEMENTATION_COMPONENT_TYPE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___ECONTAINMENT_FEATURE = IMPLEMENTATION_COMPONENT_TYPE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___ECONTENTS = IMPLEMENTATION_COMPONENT_TYPE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___EALL_CONTENTS = IMPLEMENTATION_COMPONENT_TYPE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___ECROSS_REFERENCES = IMPLEMENTATION_COMPONENT_TYPE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___EGET__ESTRUCTURALFEATURE = IMPLEMENTATION_COMPONENT_TYPE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = IMPLEMENTATION_COMPONENT_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT = IMPLEMENTATION_COMPONENT_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___EIS_SET__ESTRUCTURALFEATURE = IMPLEMENTATION_COMPONENT_TYPE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___EUNSET__ESTRUCTURALFEATURE = IMPLEMENTATION_COMPONENT_TYPE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT___EINVOKE__EOPERATION_ELIST = IMPLEMENTATION_COMPONENT_TYPE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Basic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_OPERATION_COUNT = IMPLEMENTATION_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.RoleImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.ProvidedRoleImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getProvidedRole()
	 * @generated
	 */
	int PROVIDED_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__ENTITY_NAME = ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___ECLASS = ROLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___EIS_PROXY = ROLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___ERESOURCE = ROLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___ECONTAINER = ROLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___ECONTAINING_FEATURE = ROLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___ECONTAINMENT_FEATURE = ROLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___ECONTENTS = ROLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___EALL_CONTENTS = ROLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___ECROSS_REFERENCES = ROLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE = ROLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = ROLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___EIS_SET__ESTRUCTURALFEATURE = ROLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___EUNSET__ESTRUCTURALFEATURE = ROLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE___EINVOKE__EOPERATION_ELIST = ROLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.ParameterImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Data Type Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA_TYPE_PARAMETER = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Infrastructure Signature Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Signature Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPERATION_SIGNATURE_PARAMETER = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Type Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EVENT_TYPE_PARAMETER = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_NAME = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modifier Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MODIFIER_PARAMETER = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resource Signature Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__RESOURCE_SIGNATURE_PARAMETER = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ECLASS = PcmPackage.PCM_BASE_CLASS___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___EIS_PROXY = PcmPackage.PCM_BASE_CLASS___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ERESOURCE = PcmPackage.PCM_BASE_CLASS___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ECONTAINER = PcmPackage.PCM_BASE_CLASS___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ECONTAINING_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ECONTAINMENT_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ECONTENTS = PcmPackage.PCM_BASE_CLASS___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___EALL_CONTENTS = PcmPackage.PCM_BASE_CLASS___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ECROSS_REFERENCES = PcmPackage.PCM_BASE_CLASS___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___EGET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___EGET__ESTRUCTURALFEATURE_BOOLEAN = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ESET__ESTRUCTURALFEATURE_OBJECT = PcmPackage.PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___EIS_SET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___EUNSET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___EINVOKE__EOPERATION_ELIST = PcmPackage.PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = PcmPackage.PCM_BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.DataTypeImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Repository Data Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__REPOSITORY_DATA_TYPE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ECLASS = PcmPackage.PCM_BASE_CLASS___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___EIS_PROXY = PcmPackage.PCM_BASE_CLASS___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ERESOURCE = PcmPackage.PCM_BASE_CLASS___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ECONTAINER = PcmPackage.PCM_BASE_CLASS___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ECONTAINING_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ECONTAINMENT_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ECONTENTS = PcmPackage.PCM_BASE_CLASS___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___EALL_CONTENTS = PcmPackage.PCM_BASE_CLASS___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ECROSS_REFERENCES = PcmPackage.PCM_BASE_CLASS___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___EGET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = PcmPackage.PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___EIS_SET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___EUNSET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___EINVOKE__EOPERATION_ELIST = PcmPackage.PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = PcmPackage.PCM_BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.RepositoryImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REPOSITORY_DESCRIPTION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMPONENTS_REPOSITORY = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__INTERFACES_REPOSITORY = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Failure Types Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FAILURE_TYPES_REPOSITORY = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Types Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DATA_TYPES_REPOSITORY = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.InterfaceImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT_INTERFACES_INTERFACE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PROTOCOLS_INTERFACE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REQUIRED_CHARACTERISATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repository Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REPOSITORY_INTERFACE = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Is Assignable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___IS_ASSIGNABLE_FROM__INTERFACE = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.RequiredCharacterisationImpl <em>Required Characterisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.RequiredCharacterisationImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getRequiredCharacterisation()
	 * @generated
	 */
	int REQUIRED_CHARACTERISATION = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION__TYPE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION__PARAMETER = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Required Characterisation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Required Characterisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION_FEATURE_COUNT = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___ECLASS = PcmPackage.PCM_BASE_CLASS___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___EIS_PROXY = PcmPackage.PCM_BASE_CLASS___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___ERESOURCE = PcmPackage.PCM_BASE_CLASS___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___ECONTAINER = PcmPackage.PCM_BASE_CLASS___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___ECONTAINING_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___ECONTAINMENT_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___ECONTENTS = PcmPackage.PCM_BASE_CLASS___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___EALL_CONTENTS = PcmPackage.PCM_BASE_CLASS___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___ECROSS_REFERENCES = PcmPackage.PCM_BASE_CLASS___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___EGET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___ESET__ESTRUCTURALFEATURE_OBJECT = PcmPackage.PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___EIS_SET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___EUNSET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION___EINVOKE__EOPERATION_ELIST = PcmPackage.PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Required Characterisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CHARACTERISATION_OPERATION_COUNT = PcmPackage.PCM_BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.EventGroupImpl <em>Event Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.EventGroupImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getEventGroup()
	 * @generated
	 */
	int EVENT_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__ENTITY_NAME = INTERFACE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__PARENT_INTERFACES_INTERFACE = INTERFACE__PARENT_INTERFACES_INTERFACE;

	/**
	 * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__PROTOCOLS_INTERFACE = INTERFACE__PROTOCOLS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__REQUIRED_CHARACTERISATIONS = INTERFACE__REQUIRED_CHARACTERISATIONS;

	/**
	 * The feature id for the '<em><b>Repository Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__REPOSITORY_INTERFACE = INTERFACE__REPOSITORY_INTERFACE;

	/**
	 * The feature id for the '<em><b>Event Types Event Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP__EVENT_TYPES_EVENT_GROUP = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___ECLASS = INTERFACE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___EIS_PROXY = INTERFACE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___ERESOURCE = INTERFACE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___ECONTAINER = INTERFACE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___ECONTAINING_FEATURE = INTERFACE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___ECONTAINMENT_FEATURE = INTERFACE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___ECONTENTS = INTERFACE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___EALL_CONTENTS = INTERFACE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___ECROSS_REFERENCES = INTERFACE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___EGET__ESTRUCTURALFEATURE = INTERFACE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___EGET__ESTRUCTURALFEATURE_BOOLEAN = INTERFACE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___ESET__ESTRUCTURALFEATURE_OBJECT = INTERFACE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___EIS_SET__ESTRUCTURALFEATURE = INTERFACE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___EUNSET__ESTRUCTURALFEATURE = INTERFACE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___EINVOKE__EOPERATION_ELIST = INTERFACE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Is Assignable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP___IS_ASSIGNABLE_FROM__INTERFACE = INTERFACE___IS_ASSIGNABLE_FROM__INTERFACE;

	/**
	 * The number of operations of the '<em>Event Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_GROUP_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.SignatureImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Exceptions Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__EXCEPTIONS_SIGNATURE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__FAILURE_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.EventTypeImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__ID = SIGNATURE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__ENTITY_NAME = SIGNATURE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Exceptions Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__EXCEPTIONS_SIGNATURE = SIGNATURE__EXCEPTIONS_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__FAILURE_TYPE = SIGNATURE__FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Parameter Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__PARAMETER_EVENT_TYPE = SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Group Event Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__EVENT_GROUP_EVENT_TYPE = SIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = SIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___ECLASS = SIGNATURE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___EIS_PROXY = SIGNATURE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___ERESOURCE = SIGNATURE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___ECONTAINER = SIGNATURE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___ECONTAINING_FEATURE = SIGNATURE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___ECONTAINMENT_FEATURE = SIGNATURE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___ECONTENTS = SIGNATURE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___EALL_CONTENTS = SIGNATURE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___ECROSS_REFERENCES = SIGNATURE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___EGET__ESTRUCTURALFEATURE = SIGNATURE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SIGNATURE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = SIGNATURE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___EIS_SET__ESTRUCTURALFEATURE = SIGNATURE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___EUNSET__ESTRUCTURALFEATURE = SIGNATURE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE___EINVOKE__EOPERATION_ELIST = SIGNATURE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_OPERATION_COUNT = SIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.ExceptionTypeImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getExceptionType()
	 * @generated
	 */
	int EXCEPTION_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__EXCEPTION_NAME = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__EXCEPTION_MESSAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_FEATURE_COUNT = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___ECLASS = PcmPackage.PCM_BASE_CLASS___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___EIS_PROXY = PcmPackage.PCM_BASE_CLASS___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___ERESOURCE = PcmPackage.PCM_BASE_CLASS___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___ECONTAINER = PcmPackage.PCM_BASE_CLASS___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___ECONTAINING_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___ECONTAINMENT_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___ECONTENTS = PcmPackage.PCM_BASE_CLASS___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___EALL_CONTENTS = PcmPackage.PCM_BASE_CLASS___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___ECROSS_REFERENCES = PcmPackage.PCM_BASE_CLASS___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___EGET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = PcmPackage.PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___EIS_SET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___EUNSET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE___EINVOKE__EOPERATION_ELIST = PcmPackage.PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_OPERATION_COUNT = PcmPackage.PCM_BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.InfrastructureSignatureImpl <em>Infrastructure Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.InfrastructureSignatureImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getInfrastructureSignature()
	 * @generated
	 */
	int INFRASTRUCTURE_SIGNATURE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE__ID = SIGNATURE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE__ENTITY_NAME = SIGNATURE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Exceptions Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE__EXCEPTIONS_SIGNATURE = SIGNATURE__EXCEPTIONS_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE__FAILURE_TYPE = SIGNATURE__FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters Infrastructure Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE = SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Infrastructure Interface Infrastructure Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE = SIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Infrastructure Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE_FEATURE_COUNT = SIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___ECLASS = SIGNATURE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___EIS_PROXY = SIGNATURE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___ERESOURCE = SIGNATURE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___ECONTAINER = SIGNATURE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___ECONTAINING_FEATURE = SIGNATURE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___ECONTAINMENT_FEATURE = SIGNATURE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___ECONTENTS = SIGNATURE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___EALL_CONTENTS = SIGNATURE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___ECROSS_REFERENCES = SIGNATURE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___EGET__ESTRUCTURALFEATURE = SIGNATURE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SIGNATURE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___ESET__ESTRUCTURALFEATURE_OBJECT = SIGNATURE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___EIS_SET__ESTRUCTURALFEATURE = SIGNATURE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___EUNSET__ESTRUCTURALFEATURE = SIGNATURE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE___EINVOKE__EOPERATION_ELIST = SIGNATURE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Infrastructure Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SIGNATURE_OPERATION_COUNT = SIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.InfrastructureInterfaceImpl <em>Infrastructure Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.InfrastructureInterfaceImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getInfrastructureInterface()
	 * @generated
	 */
	int INFRASTRUCTURE_INTERFACE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__ENTITY_NAME = INTERFACE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__PARENT_INTERFACES_INTERFACE = INTERFACE__PARENT_INTERFACES_INTERFACE;

	/**
	 * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__PROTOCOLS_INTERFACE = INTERFACE__PROTOCOLS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__REQUIRED_CHARACTERISATIONS = INTERFACE__REQUIRED_CHARACTERISATIONS;

	/**
	 * The feature id for the '<em><b>Repository Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__REPOSITORY_INTERFACE = INTERFACE__REPOSITORY_INTERFACE;

	/**
	 * The feature id for the '<em><b>Infrastructure Signatures Infrastructure Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___ECLASS = INTERFACE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___EIS_PROXY = INTERFACE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___ERESOURCE = INTERFACE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___ECONTAINER = INTERFACE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___ECONTAINING_FEATURE = INTERFACE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___ECONTAINMENT_FEATURE = INTERFACE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___ECONTENTS = INTERFACE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___EALL_CONTENTS = INTERFACE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___ECROSS_REFERENCES = INTERFACE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___EGET__ESTRUCTURALFEATURE = INTERFACE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___EGET__ESTRUCTURALFEATURE_BOOLEAN = INTERFACE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___ESET__ESTRUCTURALFEATURE_OBJECT = INTERFACE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___EIS_SET__ESTRUCTURALFEATURE = INTERFACE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___EUNSET__ESTRUCTURALFEATURE = INTERFACE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___EINVOKE__EOPERATION_ELIST = INTERFACE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Is Assignable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE___IS_ASSIGNABLE_FROM__INTERFACE = INTERFACE___IS_ASSIGNABLE_FROM__INTERFACE;

	/**
	 * The number of operations of the '<em>Infrastructure Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.RequiredRoleImpl <em>Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.RequiredRoleImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getRequiredRole()
	 * @generated
	 */
	int REQUIRED_ROLE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__ID = ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__ENTITY_NAME = ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___ECLASS = ROLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___EIS_PROXY = ROLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___ERESOURCE = ROLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___ECONTAINER = ROLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___ECONTAINING_FEATURE = ROLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___ECONTAINMENT_FEATURE = ROLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___ECONTENTS = ROLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___EALL_CONTENTS = ROLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___ECROSS_REFERENCES = ROLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE = ROLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = ROLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___EIS_SET__ESTRUCTURALFEATURE = ROLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___EUNSET__ESTRUCTURALFEATURE = ROLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE___EINVOKE__EOPERATION_ELIST = ROLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.InfrastructureRequiredRoleImpl <em>Infrastructure Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.InfrastructureRequiredRoleImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getInfrastructureRequiredRole()
	 * @generated
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE__ID = REQUIRED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE__ENTITY_NAME = REQUIRED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE;

	/**
	 * The feature id for the '<em><b>Required Interface Infrastructure Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE = REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE_FEATURE_COUNT = REQUIRED_ROLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___ECLASS = REQUIRED_ROLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___EIS_PROXY = REQUIRED_ROLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___ERESOURCE = REQUIRED_ROLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___ECONTAINER = REQUIRED_ROLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___ECONTAINING_FEATURE = REQUIRED_ROLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___ECONTAINMENT_FEATURE = REQUIRED_ROLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___ECONTENTS = REQUIRED_ROLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___EALL_CONTENTS = REQUIRED_ROLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___ECROSS_REFERENCES = REQUIRED_ROLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE = REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = REQUIRED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___EIS_SET__ESTRUCTURALFEATURE = REQUIRED_ROLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___EUNSET__ESTRUCTURALFEATURE = REQUIRED_ROLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE___EINVOKE__EOPERATION_ELIST = REQUIRED_ROLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Infrastructure Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUIRED_ROLE_OPERATION_COUNT = REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.OperationSignatureImpl <em>Operation Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.OperationSignatureImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getOperationSignature()
	 * @generated
	 */
	int OPERATION_SIGNATURE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__ID = SIGNATURE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__ENTITY_NAME = SIGNATURE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Exceptions Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__EXCEPTIONS_SIGNATURE = SIGNATURE__EXCEPTIONS_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__FAILURE_TYPE = SIGNATURE__FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Operation Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE = SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters Operation Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE = SIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE = SIGNATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE_FEATURE_COUNT = SIGNATURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___ECLASS = SIGNATURE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___EIS_PROXY = SIGNATURE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___ERESOURCE = SIGNATURE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___ECONTAINER = SIGNATURE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___ECONTAINING_FEATURE = SIGNATURE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___ECONTAINMENT_FEATURE = SIGNATURE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___ECONTENTS = SIGNATURE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___EALL_CONTENTS = SIGNATURE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___ECROSS_REFERENCES = SIGNATURE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___EGET__ESTRUCTURALFEATURE = SIGNATURE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SIGNATURE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___ESET__ESTRUCTURALFEATURE_OBJECT = SIGNATURE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___EIS_SET__ESTRUCTURALFEATURE = SIGNATURE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___EUNSET__ESTRUCTURALFEATURE = SIGNATURE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE___EINVOKE__EOPERATION_ELIST = SIGNATURE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Operation Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SIGNATURE_OPERATION_COUNT = SIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.OperationInterfaceImpl <em>Operation Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.OperationInterfaceImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getOperationInterface()
	 * @generated
	 */
	int OPERATION_INTERFACE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__ID = INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__ENTITY_NAME = INTERFACE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent Interfaces Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__PARENT_INTERFACES_INTERFACE = INTERFACE__PARENT_INTERFACES_INTERFACE;

	/**
	 * The feature id for the '<em><b>Protocols Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__PROTOCOLS_INTERFACE = INTERFACE__PROTOCOLS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Required Characterisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__REQUIRED_CHARACTERISATIONS = INTERFACE__REQUIRED_CHARACTERISATIONS;

	/**
	 * The feature id for the '<em><b>Repository Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__REPOSITORY_INTERFACE = INTERFACE__REPOSITORY_INTERFACE;

	/**
	 * The feature id for the '<em><b>Signatures Operation Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___ECLASS = INTERFACE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___EIS_PROXY = INTERFACE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___ERESOURCE = INTERFACE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___ECONTAINER = INTERFACE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___ECONTAINING_FEATURE = INTERFACE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___ECONTAINMENT_FEATURE = INTERFACE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___ECONTENTS = INTERFACE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___EALL_CONTENTS = INTERFACE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___ECROSS_REFERENCES = INTERFACE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___EGET__ESTRUCTURALFEATURE = INTERFACE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___EGET__ESTRUCTURALFEATURE_BOOLEAN = INTERFACE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___ESET__ESTRUCTURALFEATURE_OBJECT = INTERFACE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___EIS_SET__ESTRUCTURALFEATURE = INTERFACE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___EUNSET__ESTRUCTURALFEATURE = INTERFACE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___EINVOKE__EOPERATION_ELIST = INTERFACE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Is Assignable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE___IS_ASSIGNABLE_FROM__INTERFACE = INTERFACE___IS_ASSIGNABLE_FROM__INTERFACE;

	/**
	 * The number of operations of the '<em>Operation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.OperationRequiredRoleImpl <em>Operation Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.OperationRequiredRoleImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getOperationRequiredRole()
	 * @generated
	 */
	int OPERATION_REQUIRED_ROLE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE__ID = REQUIRED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE__ENTITY_NAME = REQUIRED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE;

	/**
	 * The feature id for the '<em><b>Required Interface Operation Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE = REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE_FEATURE_COUNT = REQUIRED_ROLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___ECLASS = REQUIRED_ROLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___EIS_PROXY = REQUIRED_ROLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___ERESOURCE = REQUIRED_ROLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___ECONTAINER = REQUIRED_ROLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___ECONTAINING_FEATURE = REQUIRED_ROLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___ECONTAINMENT_FEATURE = REQUIRED_ROLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___ECONTENTS = REQUIRED_ROLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___EALL_CONTENTS = REQUIRED_ROLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___ECROSS_REFERENCES = REQUIRED_ROLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE = REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = REQUIRED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___EIS_SET__ESTRUCTURALFEATURE = REQUIRED_ROLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___EUNSET__ESTRUCTURALFEATURE = REQUIRED_ROLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE___EINVOKE__EOPERATION_ELIST = REQUIRED_ROLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Operation Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REQUIRED_ROLE_OPERATION_COUNT = REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.SourceRoleImpl <em>Source Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.SourceRoleImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getSourceRole()
	 * @generated
	 */
	int SOURCE_ROLE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE__ID = REQUIRED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE__ENTITY_NAME = REQUIRED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Requiring Entity Required Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE;

	/**
	 * The feature id for the '<em><b>Event Group Source Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE__EVENT_GROUP_SOURCE_ROLE = REQUIRED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE_FEATURE_COUNT = REQUIRED_ROLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___ECLASS = REQUIRED_ROLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___EIS_PROXY = REQUIRED_ROLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___ERESOURCE = REQUIRED_ROLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___ECONTAINER = REQUIRED_ROLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___ECONTAINING_FEATURE = REQUIRED_ROLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___ECONTAINMENT_FEATURE = REQUIRED_ROLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___ECONTENTS = REQUIRED_ROLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___EALL_CONTENTS = REQUIRED_ROLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___ECROSS_REFERENCES = REQUIRED_ROLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___EGET__ESTRUCTURALFEATURE = REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = REQUIRED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = REQUIRED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___EIS_SET__ESTRUCTURALFEATURE = REQUIRED_ROLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___EUNSET__ESTRUCTURALFEATURE = REQUIRED_ROLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE___EINVOKE__EOPERATION_ELIST = REQUIRED_ROLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Source Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROLE_OPERATION_COUNT = REQUIRED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.SinkRoleImpl <em>Sink Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.SinkRoleImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getSinkRole()
	 * @generated
	 */
	int SINK_ROLE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE__ID = PROVIDED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE__ENTITY_NAME = PROVIDED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE;

	/**
	 * The feature id for the '<em><b>Event Group Sink Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE__EVENT_GROUP_SINK_ROLE = PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sink Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE_FEATURE_COUNT = PROVIDED_ROLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___ECLASS = PROVIDED_ROLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___EIS_PROXY = PROVIDED_ROLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___ERESOURCE = PROVIDED_ROLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___ECONTAINER = PROVIDED_ROLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___ECONTAINING_FEATURE = PROVIDED_ROLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___ECONTAINMENT_FEATURE = PROVIDED_ROLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___ECONTENTS = PROVIDED_ROLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___EALL_CONTENTS = PROVIDED_ROLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___ECROSS_REFERENCES = PROVIDED_ROLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___EGET__ESTRUCTURALFEATURE = PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = PROVIDED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___EIS_SET__ESTRUCTURALFEATURE = PROVIDED_ROLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___EUNSET__ESTRUCTURALFEATURE = PROVIDED_ROLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE___EINVOKE__EOPERATION_ELIST = PROVIDED_ROLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Sink Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_ROLE_OPERATION_COUNT = PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.OperationProvidedRoleImpl <em>Operation Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.OperationProvidedRoleImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getOperationProvidedRole()
	 * @generated
	 */
	int OPERATION_PROVIDED_ROLE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE__ID = PROVIDED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE__ENTITY_NAME = PROVIDED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE;

	/**
	 * The feature id for the '<em><b>Provided Interface Operation Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE = PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE_FEATURE_COUNT = PROVIDED_ROLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___ECLASS = PROVIDED_ROLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___EIS_PROXY = PROVIDED_ROLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___ERESOURCE = PROVIDED_ROLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___ECONTAINER = PROVIDED_ROLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___ECONTAINING_FEATURE = PROVIDED_ROLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___ECONTAINMENT_FEATURE = PROVIDED_ROLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___ECONTENTS = PROVIDED_ROLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___EALL_CONTENTS = PROVIDED_ROLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___ECROSS_REFERENCES = PROVIDED_ROLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE = PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = PROVIDED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___EIS_SET__ESTRUCTURALFEATURE = PROVIDED_ROLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___EUNSET__ESTRUCTURALFEATURE = PROVIDED_ROLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE___EINVOKE__EOPERATION_ELIST = PROVIDED_ROLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Operation Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PROVIDED_ROLE_OPERATION_COUNT = PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.InfrastructureProvidedRoleImpl <em>Infrastructure Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.InfrastructureProvidedRoleImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getInfrastructureProvidedRole()
	 * @generated
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE__ID = PROVIDED_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE__ENTITY_NAME = PROVIDED_ROLE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Providing Entity Provided Role</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE;

	/**
	 * The feature id for the '<em><b>Provided Interface Infrastructure Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE = PROVIDED_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE_FEATURE_COUNT = PROVIDED_ROLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___ECLASS = PROVIDED_ROLE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___EIS_PROXY = PROVIDED_ROLE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___ERESOURCE = PROVIDED_ROLE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___ECONTAINER = PROVIDED_ROLE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___ECONTAINING_FEATURE = PROVIDED_ROLE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___ECONTAINMENT_FEATURE = PROVIDED_ROLE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___ECONTENTS = PROVIDED_ROLE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___EALL_CONTENTS = PROVIDED_ROLE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___ECROSS_REFERENCES = PROVIDED_ROLE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE = PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PROVIDED_ROLE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT = PROVIDED_ROLE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___EIS_SET__ESTRUCTURALFEATURE = PROVIDED_ROLE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___EUNSET__ESTRUCTURALFEATURE = PROVIDED_ROLE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE___EINVOKE__EOPERATION_ELIST = PROVIDED_ROLE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Infrastructure Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_PROVIDED_ROLE_OPERATION_COUNT = PROVIDED_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.CompleteComponentTypeImpl <em>Complete Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.CompleteComponentTypeImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getCompleteComponentType()
	 * @generated
	 */
	int COMPLETE_COMPONENT_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__ID = REPOSITORY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__ENTITY_NAME = REPOSITORY_COMPONENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__REPOSITORY_REPOSITORY_COMPONENT = REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;

	/**
	 * The feature id for the '<em><b>Parent Provides Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES = REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complete Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE_FEATURE_COUNT = REPOSITORY_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___ECLASS = REPOSITORY_COMPONENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___EIS_PROXY = REPOSITORY_COMPONENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___ERESOURCE = REPOSITORY_COMPONENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___ECONTAINER = REPOSITORY_COMPONENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___ECONTAINING_FEATURE = REPOSITORY_COMPONENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___ECONTAINMENT_FEATURE = REPOSITORY_COMPONENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___ECONTENTS = REPOSITORY_COMPONENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___EALL_CONTENTS = REPOSITORY_COMPONENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___ECROSS_REFERENCES = REPOSITORY_COMPONENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___EGET__ESTRUCTURALFEATURE = REPOSITORY_COMPONENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = REPOSITORY_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = REPOSITORY_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___EIS_SET__ESTRUCTURALFEATURE = REPOSITORY_COMPONENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___EUNSET__ESTRUCTURALFEATURE = REPOSITORY_COMPONENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE___EINVOKE__EOPERATION_ELIST = REPOSITORY_COMPONENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Complete Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETE_COMPONENT_TYPE_OPERATION_COUNT = REPOSITORY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.ProvidesComponentTypeImpl <em>Provides Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.ProvidesComponentTypeImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getProvidesComponentType()
	 * @generated
	 */
	int PROVIDES_COMPONENT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE__ID = REPOSITORY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE__ENTITY_NAME = REPOSITORY_COMPONENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = REPOSITORY_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = REPOSITORY_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE__REPOSITORY_REPOSITORY_COMPONENT = REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;

	/**
	 * The number of structural features of the '<em>Provides Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE_FEATURE_COUNT = REPOSITORY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___ECLASS = REPOSITORY_COMPONENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___EIS_PROXY = REPOSITORY_COMPONENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___ERESOURCE = REPOSITORY_COMPONENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___ECONTAINER = REPOSITORY_COMPONENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___ECONTAINING_FEATURE = REPOSITORY_COMPONENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___ECONTAINMENT_FEATURE = REPOSITORY_COMPONENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___ECONTENTS = REPOSITORY_COMPONENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___EALL_CONTENTS = REPOSITORY_COMPONENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___ECROSS_REFERENCES = REPOSITORY_COMPONENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___EGET__ESTRUCTURALFEATURE = REPOSITORY_COMPONENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = REPOSITORY_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = REPOSITORY_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___EIS_SET__ESTRUCTURALFEATURE = REPOSITORY_COMPONENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___EUNSET__ESTRUCTURALFEATURE = REPOSITORY_COMPONENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE___EINVOKE__EOPERATION_ELIST = REPOSITORY_COMPONENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Provides Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_COMPONENT_TYPE_OPERATION_COUNT = REPOSITORY_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.CompositeComponentImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getCompositeComponent()
	 * @generated
	 */
	int COMPOSITE_COMPONENT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__ID = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__ENTITY_NAME = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Assembly Contexts Composed Structure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Resource Required Delegation Connectors Composed Structure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Event Channel Composed Structure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__EVENT_CHANNEL_COMPOSED_STRUCTURE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__EVENT_CHANNEL_COMPOSED_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Connectors Composed Structure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__CONNECTORS_COMPOSED_STRUCTURE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__CONNECTORS_COMPOSED_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Provided Roles Interface Providing Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;

	/**
	 * The feature id for the '<em><b>Resource Required Roles Resource Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Required Roles Interface Requiring Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;

	/**
	 * The feature id for the '<em><b>Repository Repository Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Complete Component Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT__COMPONENT_TYPE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_FEATURE_COUNT = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___ECLASS = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___EIS_PROXY = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___ERESOURCE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___ECONTAINER = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___ECONTAINING_FEATURE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___ECONTAINMENT_FEATURE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___ECONTENTS = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___EALL_CONTENTS = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___ECROSS_REFERENCES = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___EGET__ESTRUCTURALFEATURE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___EUNSET__ESTRUCTURALFEATURE = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___EINVOKE__EOPERATION_ELIST = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Validate Same Subsystem Must Not Be Instantiated More Than Once</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT___VALIDATE_SAME_SUBSYSTEM_MUST_NOT_BE_INSTANTIATED_MORE_THAN_ONCE__DIAGNOSTICCHAIN_MAP = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY___VALIDATE_SAME_SUBSYSTEM_MUST_NOT_BE_INSTANTIATED_MORE_THAN_ONCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Composite Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_OPERATION_COUNT = EntityPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.PrimitiveDataTypeImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Repository Data Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__REPOSITORY_DATA_TYPE = DATA_TYPE__REPOSITORY_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___ECLASS = DATA_TYPE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___EIS_PROXY = DATA_TYPE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___ERESOURCE = DATA_TYPE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___ECONTAINER = DATA_TYPE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___ECONTAINING_FEATURE = DATA_TYPE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___ECONTAINMENT_FEATURE = DATA_TYPE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___ECONTENTS = DATA_TYPE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___EALL_CONTENTS = DATA_TYPE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___ECROSS_REFERENCES = DATA_TYPE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___EGET__ESTRUCTURALFEATURE = DATA_TYPE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = DATA_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = DATA_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___EIS_SET__ESTRUCTURALFEATURE = DATA_TYPE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___EUNSET__ESTRUCTURALFEATURE = DATA_TYPE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE___EINVOKE__EOPERATION_ELIST = DATA_TYPE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.CollectionDataTypeImpl <em>Collection Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.CollectionDataTypeImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getCollectionDataType()
	 * @generated
	 */
	int COLLECTION_DATA_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Data Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__REPOSITORY_DATA_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner Type Collection Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Collection Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_DATA_TYPE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.CompositeDataTypeImpl <em>Composite Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.CompositeDataTypeImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getCompositeDataType()
	 * @generated
	 */
	int COMPOSITE_DATA_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Data Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__REPOSITORY_DATA_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Type Composite Data Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__PARENT_TYPE_COMPOSITE_DATA_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inner Declaration Composite Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE__INNER_DECLARATION_COMPOSITE_DATA_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Composite Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATA_TYPE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.impl.InnerDeclarationImpl <em>Inner Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.impl.InnerDeclarationImpl
	 * @see pcm.repository.impl.RepositoryPackageImpl#getInnerDeclaration()
	 * @generated
	 */
	int INNER_DECLARATION = 31;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Datatype Inner Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION__DATATYPE_INNER_DECLARATION = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composite Data Type Inner Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inner Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___ECLASS = EntityPackage.NAMED_ELEMENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___EIS_PROXY = EntityPackage.NAMED_ELEMENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___ERESOURCE = EntityPackage.NAMED_ELEMENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___ECONTAINER = EntityPackage.NAMED_ELEMENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___ECONTAINING_FEATURE = EntityPackage.NAMED_ELEMENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___ECONTAINMENT_FEATURE = EntityPackage.NAMED_ELEMENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___ECONTENTS = EntityPackage.NAMED_ELEMENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___EALL_CONTENTS = EntityPackage.NAMED_ELEMENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___ECROSS_REFERENCES = EntityPackage.NAMED_ELEMENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___EGET__ESTRUCTURALFEATURE = EntityPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.NAMED_ELEMENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.NAMED_ELEMENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.NAMED_ELEMENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___EUNSET__ESTRUCTURALFEATURE = EntityPackage.NAMED_ELEMENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION___EINVOKE__EOPERATION_ELIST = EntityPackage.NAMED_ELEMENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Inner Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_DECLARATION_OPERATION_COUNT = EntityPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.repository.ParameterModifier <em>Parameter Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.ParameterModifier
	 * @see pcm.repository.impl.RepositoryPackageImpl#getParameterModifier()
	 * @generated
	 */
	int PARAMETER_MODIFIER = 33;

	/**
	 * The meta object id for the '{@link pcm.repository.ComponentType <em>Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.ComponentType
	 * @see pcm.repository.impl.RepositoryPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 34;

	/**
	 * The meta object id for the '{@link pcm.repository.PrimitiveTypeEnum <em>Primitive Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.repository.PrimitiveTypeEnum
	 * @see pcm.repository.impl.RepositoryPackageImpl#getPrimitiveTypeEnum()
	 * @generated
	 */
	int PRIMITIVE_TYPE_ENUM = 35;


	/**
	 * Returns the meta object for class '{@link pcm.repository.PassiveResource <em>Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Resource</em>'.
	 * @see pcm.repository.PassiveResource
	 * @generated
	 */
	EClass getPassiveResource();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.repository.PassiveResource#getCapacity_PassiveResource <em>Capacity Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity Passive Resource</em>'.
	 * @see pcm.repository.PassiveResource#getCapacity_PassiveResource()
	 * @see #getPassiveResource()
	 * @generated
	 */
	EReference getPassiveResource_Capacity_PassiveResource();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.PassiveResource#getBasicComponent_PassiveResource <em>Basic Component Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Basic Component Passive Resource</em>'.
	 * @see pcm.repository.PassiveResource#getBasicComponent_PassiveResource()
	 * @see #getPassiveResource()
	 * @generated
	 */
	EReference getPassiveResource_BasicComponent_PassiveResource();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.PassiveResource#getResourceTimeoutFailureType__PassiveResource <em>Resource Timeout Failure Type Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Timeout Failure Type Passive Resource</em>'.
	 * @see pcm.repository.PassiveResource#getResourceTimeoutFailureType__PassiveResource()
	 * @see #getPassiveResource()
	 * @generated
	 */
	EReference getPassiveResource_ResourceTimeoutFailureType__PassiveResource();

	/**
	 * Returns the meta object for class '{@link pcm.repository.BasicComponent <em>Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Component</em>'.
	 * @see pcm.repository.BasicComponent
	 * @generated
	 */
	EClass getBasicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.BasicComponent#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Effect Specifications Basic Component</em>'.
	 * @see pcm.repository.BasicComponent#getServiceEffectSpecifications__BasicComponent()
	 * @see #getBasicComponent()
	 * @generated
	 */
	EReference getBasicComponent_ServiceEffectSpecifications__BasicComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.BasicComponent#getPassiveResource_BasicComponent <em>Passive Resource Basic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passive Resource Basic Component</em>'.
	 * @see pcm.repository.BasicComponent#getPassiveResource_BasicComponent()
	 * @see #getBasicComponent()
	 * @generated
	 */
	EReference getBasicComponent_PassiveResource_BasicComponent();

	/**
	 * Returns the meta object for class '{@link pcm.repository.ImplementationComponentType <em>Implementation Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Component Type</em>'.
	 * @see pcm.repository.ImplementationComponentType
	 * @generated
	 */
	EClass getImplementationComponentType();

	/**
	 * Returns the meta object for the reference list '{@link pcm.repository.ImplementationComponentType#getParentCompleteComponentTypes <em>Parent Complete Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Complete Component Types</em>'.
	 * @see pcm.repository.ImplementationComponentType#getParentCompleteComponentTypes()
	 * @see #getImplementationComponentType()
	 * @generated
	 */
	EReference getImplementationComponentType_ParentCompleteComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.ImplementationComponentType#getComponentParameterUsage_ImplementationComponentType <em>Component Parameter Usage Implementation Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Parameter Usage Implementation Component Type</em>'.
	 * @see pcm.repository.ImplementationComponentType#getComponentParameterUsage_ImplementationComponentType()
	 * @see #getImplementationComponentType()
	 * @generated
	 */
	EReference getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType();

	/**
	 * Returns the meta object for the attribute '{@link pcm.repository.ImplementationComponentType#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see pcm.repository.ImplementationComponentType#getComponentType()
	 * @see #getImplementationComponentType()
	 * @generated
	 */
	EAttribute getImplementationComponentType_ComponentType();

	/**
	 * Returns the meta object for class '{@link pcm.repository.RepositoryComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see pcm.repository.RepositoryComponent
	 * @generated
	 */
	EClass getRepositoryComponent();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.RepositoryComponent#getRepository__RepositoryComponent <em>Repository Repository Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository Repository Component</em>'.
	 * @see pcm.repository.RepositoryComponent#getRepository__RepositoryComponent()
	 * @see #getRepositoryComponent()
	 * @generated
	 */
	EReference getRepositoryComponent_Repository__RepositoryComponent();

	/**
	 * Returns the meta object for class '{@link pcm.repository.ProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Role</em>'.
	 * @see pcm.repository.ProvidedRole
	 * @generated
	 */
	EClass getProvidedRole();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.ProvidedRole#getProvidingEntity_ProvidedRole <em>Providing Entity Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Providing Entity Provided Role</em>'.
	 * @see pcm.repository.ProvidedRole#getProvidingEntity_ProvidedRole()
	 * @see #getProvidedRole()
	 * @generated
	 */
	EReference getProvidedRole_ProvidingEntity_ProvidedRole();

	/**
	 * Returns the meta object for class '{@link pcm.repository.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see pcm.repository.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.Parameter#getDataType__Parameter <em>Data Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type Parameter</em>'.
	 * @see pcm.repository.Parameter#getDataType__Parameter()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_DataType__Parameter();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.Parameter#getInfrastructureSignature__Parameter <em>Infrastructure Signature Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Infrastructure Signature Parameter</em>'.
	 * @see pcm.repository.Parameter#getInfrastructureSignature__Parameter()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_InfrastructureSignature__Parameter();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.Parameter#getOperationSignature__Parameter <em>Operation Signature Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation Signature Parameter</em>'.
	 * @see pcm.repository.Parameter#getOperationSignature__Parameter()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_OperationSignature__Parameter();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.Parameter#getEventType__Parameter <em>Event Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Event Type Parameter</em>'.
	 * @see pcm.repository.Parameter#getEventType__Parameter()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_EventType__Parameter();

	/**
	 * Returns the meta object for the attribute '{@link pcm.repository.Parameter#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see pcm.repository.Parameter#getParameterName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link pcm.repository.Parameter#getModifier__Parameter <em>Modifier Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier Parameter</em>'.
	 * @see pcm.repository.Parameter#getModifier__Parameter()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Modifier__Parameter();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.Parameter#getResourceSignature__Parameter <em>Resource Signature Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Signature Parameter</em>'.
	 * @see pcm.repository.Parameter#getResourceSignature__Parameter()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ResourceSignature__Parameter();

	/**
	 * Returns the meta object for class '{@link pcm.repository.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see pcm.repository.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.DataType#getRepository__DataType <em>Repository Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository Data Type</em>'.
	 * @see pcm.repository.DataType#getRepository__DataType()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Repository__DataType();

	/**
	 * Returns the meta object for class '{@link pcm.repository.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see pcm.repository.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link pcm.repository.Repository#getRepositoryDescription <em>Repository Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Description</em>'.
	 * @see pcm.repository.Repository#getRepositoryDescription()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_RepositoryDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.Repository#getComponents__Repository <em>Components Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components Repository</em>'.
	 * @see pcm.repository.Repository#getComponents__Repository()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Components__Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.Repository#getInterfaces__Repository <em>Interfaces Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces Repository</em>'.
	 * @see pcm.repository.Repository#getInterfaces__Repository()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Interfaces__Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.Repository#getFailureTypes__Repository <em>Failure Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Types Repository</em>'.
	 * @see pcm.repository.Repository#getFailureTypes__Repository()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_FailureTypes__Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.Repository#getDataTypes__Repository <em>Data Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types Repository</em>'.
	 * @see pcm.repository.Repository#getDataTypes__Repository()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_DataTypes__Repository();

	/**
	 * Returns the meta object for class '{@link pcm.repository.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see pcm.repository.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference list '{@link pcm.repository.Interface#getParentInterfaces__Interface <em>Parent Interfaces Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Interfaces Interface</em>'.
	 * @see pcm.repository.Interface#getParentInterfaces__Interface()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ParentInterfaces__Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.Interface#getProtocols__Interface <em>Protocols Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols Interface</em>'.
	 * @see pcm.repository.Interface#getProtocols__Interface()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Protocols__Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.Interface#getRequiredCharacterisations <em>Required Characterisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Characterisations</em>'.
	 * @see pcm.repository.Interface#getRequiredCharacterisations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_RequiredCharacterisations();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.Interface#getRepository__Interface <em>Repository Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository Interface</em>'.
	 * @see pcm.repository.Interface#getRepository__Interface()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Repository__Interface();

	/**
	 * Returns the meta object for the '{@link pcm.repository.Interface#isAssignableFrom(pcm.repository.Interface) <em>Is Assignable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Assignable From</em>' operation.
	 * @see pcm.repository.Interface#isAssignableFrom(pcm.repository.Interface)
	 * @generated
	 */
	EOperation getInterface__IsAssignableFrom__Interface();

	/**
	 * Returns the meta object for class '{@link pcm.repository.RequiredCharacterisation <em>Required Characterisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Characterisation</em>'.
	 * @see pcm.repository.RequiredCharacterisation
	 * @generated
	 */
	EClass getRequiredCharacterisation();

	/**
	 * Returns the meta object for the attribute '{@link pcm.repository.RequiredCharacterisation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pcm.repository.RequiredCharacterisation#getType()
	 * @see #getRequiredCharacterisation()
	 * @generated
	 */
	EAttribute getRequiredCharacterisation_Type();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.RequiredCharacterisation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see pcm.repository.RequiredCharacterisation#getParameter()
	 * @see #getRequiredCharacterisation()
	 * @generated
	 */
	EReference getRequiredCharacterisation_Parameter();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.RequiredCharacterisation#getInterface_RequiredCharacterisation <em>Interface Required Characterisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface Required Characterisation</em>'.
	 * @see pcm.repository.RequiredCharacterisation#getInterface_RequiredCharacterisation()
	 * @see #getRequiredCharacterisation()
	 * @generated
	 */
	EReference getRequiredCharacterisation_Interface_RequiredCharacterisation();

	/**
	 * Returns the meta object for class '{@link pcm.repository.EventGroup <em>Event Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Group</em>'.
	 * @see pcm.repository.EventGroup
	 * @generated
	 */
	EClass getEventGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.EventGroup#getEventTypes__EventGroup <em>Event Types Event Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Types Event Group</em>'.
	 * @see pcm.repository.EventGroup#getEventTypes__EventGroup()
	 * @see #getEventGroup()
	 * @generated
	 */
	EReference getEventGroup_EventTypes__EventGroup();

	/**
	 * Returns the meta object for class '{@link pcm.repository.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see pcm.repository.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.repository.EventType#getParameter__EventType <em>Parameter Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Event Type</em>'.
	 * @see pcm.repository.EventType#getParameter__EventType()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Parameter__EventType();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.EventType#getEventGroup__EventType <em>Event Group Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Event Group Event Type</em>'.
	 * @see pcm.repository.EventType#getEventGroup__EventType()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_EventGroup__EventType();

	/**
	 * Returns the meta object for class '{@link pcm.repository.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see pcm.repository.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.Signature#getExceptions__Signature <em>Exceptions Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions Signature</em>'.
	 * @see pcm.repository.Signature#getExceptions__Signature()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Exceptions__Signature();

	/**
	 * Returns the meta object for the reference list '{@link pcm.repository.Signature#getFailureType <em>Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failure Type</em>'.
	 * @see pcm.repository.Signature#getFailureType()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_FailureType();

	/**
	 * Returns the meta object for class '{@link pcm.repository.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Type</em>'.
	 * @see pcm.repository.ExceptionType
	 * @generated
	 */
	EClass getExceptionType();

	/**
	 * Returns the meta object for the attribute '{@link pcm.repository.ExceptionType#getExceptionName <em>Exception Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Name</em>'.
	 * @see pcm.repository.ExceptionType#getExceptionName()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_ExceptionName();

	/**
	 * Returns the meta object for the attribute '{@link pcm.repository.ExceptionType#getExceptionMessage <em>Exception Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Message</em>'.
	 * @see pcm.repository.ExceptionType#getExceptionMessage()
	 * @see #getExceptionType()
	 * @generated
	 */
	EAttribute getExceptionType_ExceptionMessage();

	/**
	 * Returns the meta object for class '{@link pcm.repository.InfrastructureSignature <em>Infrastructure Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Signature</em>'.
	 * @see pcm.repository.InfrastructureSignature
	 * @generated
	 */
	EClass getInfrastructureSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.InfrastructureSignature#getParameters__InfrastructureSignature <em>Parameters Infrastructure Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters Infrastructure Signature</em>'.
	 * @see pcm.repository.InfrastructureSignature#getParameters__InfrastructureSignature()
	 * @see #getInfrastructureSignature()
	 * @generated
	 */
	EReference getInfrastructureSignature_Parameters__InfrastructureSignature();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Infrastructure Interface Infrastructure Signature</em>'.
	 * @see pcm.repository.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature()
	 * @see #getInfrastructureSignature()
	 * @generated
	 */
	EReference getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature();

	/**
	 * Returns the meta object for class '{@link pcm.repository.InfrastructureInterface <em>Infrastructure Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Interface</em>'.
	 * @see pcm.repository.InfrastructureInterface
	 * @generated
	 */
	EClass getInfrastructureInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface <em>Infrastructure Signatures Infrastructure Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Signatures Infrastructure Interface</em>'.
	 * @see pcm.repository.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface()
	 * @see #getInfrastructureInterface()
	 * @generated
	 */
	EReference getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface();

	/**
	 * Returns the meta object for class '{@link pcm.repository.InfrastructureRequiredRole <em>Infrastructure Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Required Role</em>'.
	 * @see pcm.repository.InfrastructureRequiredRole
	 * @generated
	 */
	EClass getInfrastructureRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.InfrastructureRequiredRole#getRequiredInterface__InfrastructureRequiredRole <em>Required Interface Infrastructure Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Interface Infrastructure Required Role</em>'.
	 * @see pcm.repository.InfrastructureRequiredRole#getRequiredInterface__InfrastructureRequiredRole()
	 * @see #getInfrastructureRequiredRole()
	 * @generated
	 */
	EReference getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole();

	/**
	 * Returns the meta object for class '{@link pcm.repository.RequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Role</em>'.
	 * @see pcm.repository.RequiredRole
	 * @generated
	 */
	EClass getRequiredRole();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.RequiredRole#getRequiringEntity_RequiredRole <em>Requiring Entity Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requiring Entity Required Role</em>'.
	 * @see pcm.repository.RequiredRole#getRequiringEntity_RequiredRole()
	 * @see #getRequiredRole()
	 * @generated
	 */
	EReference getRequiredRole_RequiringEntity_RequiredRole();

	/**
	 * Returns the meta object for class '{@link pcm.repository.OperationSignature <em>Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Signature</em>'.
	 * @see pcm.repository.OperationSignature
	 * @generated
	 */
	EClass getOperationSignature();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.OperationSignature#getInterface__OperationSignature <em>Interface Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface Operation Signature</em>'.
	 * @see pcm.repository.OperationSignature#getInterface__OperationSignature()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EReference getOperationSignature_Interface__OperationSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.OperationSignature#getParameters__OperationSignature <em>Parameters Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters Operation Signature</em>'.
	 * @see pcm.repository.OperationSignature#getParameters__OperationSignature()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EReference getOperationSignature_Parameters__OperationSignature();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.OperationSignature#getReturnType__OperationSignature <em>Return Type Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type Operation Signature</em>'.
	 * @see pcm.repository.OperationSignature#getReturnType__OperationSignature()
	 * @see #getOperationSignature()
	 * @generated
	 */
	EReference getOperationSignature_ReturnType__OperationSignature();

	/**
	 * Returns the meta object for class '{@link pcm.repository.OperationInterface <em>Operation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Interface</em>'.
	 * @see pcm.repository.OperationInterface
	 * @generated
	 */
	EClass getOperationInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.OperationInterface#getSignatures__OperationInterface <em>Signatures Operation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures Operation Interface</em>'.
	 * @see pcm.repository.OperationInterface#getSignatures__OperationInterface()
	 * @see #getOperationInterface()
	 * @generated
	 */
	EReference getOperationInterface_Signatures__OperationInterface();

	/**
	 * Returns the meta object for class '{@link pcm.repository.OperationRequiredRole <em>Operation Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Required Role</em>'.
	 * @see pcm.repository.OperationRequiredRole
	 * @generated
	 */
	EClass getOperationRequiredRole();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.OperationRequiredRole#getRequiredInterface__OperationRequiredRole <em>Required Interface Operation Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Interface Operation Required Role</em>'.
	 * @see pcm.repository.OperationRequiredRole#getRequiredInterface__OperationRequiredRole()
	 * @see #getOperationRequiredRole()
	 * @generated
	 */
	EReference getOperationRequiredRole_RequiredInterface__OperationRequiredRole();

	/**
	 * Returns the meta object for class '{@link pcm.repository.SourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Role</em>'.
	 * @see pcm.repository.SourceRole
	 * @generated
	 */
	EClass getSourceRole();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.SourceRole#getEventGroup__SourceRole <em>Event Group Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Group Source Role</em>'.
	 * @see pcm.repository.SourceRole#getEventGroup__SourceRole()
	 * @see #getSourceRole()
	 * @generated
	 */
	EReference getSourceRole_EventGroup__SourceRole();

	/**
	 * Returns the meta object for class '{@link pcm.repository.SinkRole <em>Sink Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink Role</em>'.
	 * @see pcm.repository.SinkRole
	 * @generated
	 */
	EClass getSinkRole();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.SinkRole#getEventGroup__SinkRole <em>Event Group Sink Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Group Sink Role</em>'.
	 * @see pcm.repository.SinkRole#getEventGroup__SinkRole()
	 * @see #getSinkRole()
	 * @generated
	 */
	EReference getSinkRole_EventGroup__SinkRole();

	/**
	 * Returns the meta object for class '{@link pcm.repository.OperationProvidedRole <em>Operation Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Provided Role</em>'.
	 * @see pcm.repository.OperationProvidedRole
	 * @generated
	 */
	EClass getOperationProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.OperationProvidedRole#getProvidedInterface__OperationProvidedRole <em>Provided Interface Operation Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Interface Operation Provided Role</em>'.
	 * @see pcm.repository.OperationProvidedRole#getProvidedInterface__OperationProvidedRole()
	 * @see #getOperationProvidedRole()
	 * @generated
	 */
	EReference getOperationProvidedRole_ProvidedInterface__OperationProvidedRole();

	/**
	 * Returns the meta object for class '{@link pcm.repository.InfrastructureProvidedRole <em>Infrastructure Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Provided Role</em>'.
	 * @see pcm.repository.InfrastructureProvidedRole
	 * @generated
	 */
	EClass getInfrastructureProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.InfrastructureProvidedRole#getProvidedInterface__InfrastructureProvidedRole <em>Provided Interface Infrastructure Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Interface Infrastructure Provided Role</em>'.
	 * @see pcm.repository.InfrastructureProvidedRole#getProvidedInterface__InfrastructureProvidedRole()
	 * @see #getInfrastructureProvidedRole()
	 * @generated
	 */
	EReference getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole();

	/**
	 * Returns the meta object for class '{@link pcm.repository.CompleteComponentType <em>Complete Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complete Component Type</em>'.
	 * @see pcm.repository.CompleteComponentType
	 * @generated
	 */
	EClass getCompleteComponentType();

	/**
	 * Returns the meta object for the reference list '{@link pcm.repository.CompleteComponentType#getParentProvidesComponentTypes <em>Parent Provides Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Provides Component Types</em>'.
	 * @see pcm.repository.CompleteComponentType#getParentProvidesComponentTypes()
	 * @see #getCompleteComponentType()
	 * @generated
	 */
	EReference getCompleteComponentType_ParentProvidesComponentTypes();

	/**
	 * Returns the meta object for class '{@link pcm.repository.ProvidesComponentType <em>Provides Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Component Type</em>'.
	 * @see pcm.repository.ProvidesComponentType
	 * @generated
	 */
	EClass getProvidesComponentType();

	/**
	 * Returns the meta object for class '{@link pcm.repository.CompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component</em>'.
	 * @see pcm.repository.CompositeComponent
	 * @generated
	 */
	EClass getCompositeComponent();

	/**
	 * Returns the meta object for class '{@link pcm.repository.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see pcm.repository.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for the attribute '{@link pcm.repository.PrimitiveDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pcm.repository.PrimitiveDataType#getType()
	 * @see #getPrimitiveDataType()
	 * @generated
	 */
	EAttribute getPrimitiveDataType_Type();

	/**
	 * Returns the meta object for class '{@link pcm.repository.CollectionDataType <em>Collection Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Data Type</em>'.
	 * @see pcm.repository.CollectionDataType
	 * @generated
	 */
	EClass getCollectionDataType();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.CollectionDataType#getInnerType_CollectionDataType <em>Inner Type Collection Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Type Collection Data Type</em>'.
	 * @see pcm.repository.CollectionDataType#getInnerType_CollectionDataType()
	 * @see #getCollectionDataType()
	 * @generated
	 */
	EReference getCollectionDataType_InnerType_CollectionDataType();

	/**
	 * Returns the meta object for class '{@link pcm.repository.CompositeDataType <em>Composite Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Data Type</em>'.
	 * @see pcm.repository.CompositeDataType
	 * @generated
	 */
	EClass getCompositeDataType();

	/**
	 * Returns the meta object for the reference list '{@link pcm.repository.CompositeDataType#getParentType_CompositeDataType <em>Parent Type Composite Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Type Composite Data Type</em>'.
	 * @see pcm.repository.CompositeDataType#getParentType_CompositeDataType()
	 * @see #getCompositeDataType()
	 * @generated
	 */
	EReference getCompositeDataType_ParentType_CompositeDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.repository.CompositeDataType#getInnerDeclaration_CompositeDataType <em>Inner Declaration Composite Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Declaration Composite Data Type</em>'.
	 * @see pcm.repository.CompositeDataType#getInnerDeclaration_CompositeDataType()
	 * @see #getCompositeDataType()
	 * @generated
	 */
	EReference getCompositeDataType_InnerDeclaration_CompositeDataType();

	/**
	 * Returns the meta object for class '{@link pcm.repository.InnerDeclaration <em>Inner Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inner Declaration</em>'.
	 * @see pcm.repository.InnerDeclaration
	 * @generated
	 */
	EClass getInnerDeclaration();

	/**
	 * Returns the meta object for the reference '{@link pcm.repository.InnerDeclaration#getDatatype_InnerDeclaration <em>Datatype Inner Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype Inner Declaration</em>'.
	 * @see pcm.repository.InnerDeclaration#getDatatype_InnerDeclaration()
	 * @see #getInnerDeclaration()
	 * @generated
	 */
	EReference getInnerDeclaration_Datatype_InnerDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link pcm.repository.InnerDeclaration#getCompositeDataType_InnerDeclaration <em>Composite Data Type Inner Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Composite Data Type Inner Declaration</em>'.
	 * @see pcm.repository.InnerDeclaration#getCompositeDataType_InnerDeclaration()
	 * @see #getInnerDeclaration()
	 * @generated
	 */
	EReference getInnerDeclaration_CompositeDataType_InnerDeclaration();

	/**
	 * Returns the meta object for class '{@link pcm.repository.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see pcm.repository.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for enum '{@link pcm.repository.ParameterModifier <em>Parameter Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Modifier</em>'.
	 * @see pcm.repository.ParameterModifier
	 * @generated
	 */
	EEnum getParameterModifier();

	/**
	 * Returns the meta object for enum '{@link pcm.repository.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type</em>'.
	 * @see pcm.repository.ComponentType
	 * @generated
	 */
	EEnum getComponentType();

	/**
	 * Returns the meta object for enum '{@link pcm.repository.PrimitiveTypeEnum <em>Primitive Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type Enum</em>'.
	 * @see pcm.repository.PrimitiveTypeEnum
	 * @generated
	 */
	EEnum getPrimitiveTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepositoryFactory getRepositoryFactory();

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
		 * The meta object literal for the '{@link pcm.repository.impl.PassiveResourceImpl <em>Passive Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.PassiveResourceImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getPassiveResource()
		 * @generated
		 */
		EClass PASSIVE_RESOURCE = eINSTANCE.getPassiveResource();

		/**
		 * The meta object literal for the '<em><b>Capacity Passive Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE = eINSTANCE.getPassiveResource_Capacity_PassiveResource();

		/**
		 * The meta object literal for the '<em><b>Basic Component Passive Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE = eINSTANCE.getPassiveResource_BasicComponent_PassiveResource();

		/**
		 * The meta object literal for the '<em><b>Resource Timeout Failure Type Passive Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE = eINSTANCE.getPassiveResource_ResourceTimeoutFailureType__PassiveResource();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.BasicComponentImpl <em>Basic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.BasicComponentImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getBasicComponent()
		 * @generated
		 */
		EClass BASIC_COMPONENT = eINSTANCE.getBasicComponent();

		/**
		 * The meta object literal for the '<em><b>Service Effect Specifications Basic Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT = eINSTANCE.getBasicComponent_ServiceEffectSpecifications__BasicComponent();

		/**
		 * The meta object literal for the '<em><b>Passive Resource Basic Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT = eINSTANCE.getBasicComponent_PassiveResource_BasicComponent();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.ImplementationComponentTypeImpl <em>Implementation Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.ImplementationComponentTypeImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getImplementationComponentType()
		 * @generated
		 */
		EClass IMPLEMENTATION_COMPONENT_TYPE = eINSTANCE.getImplementationComponentType();

		/**
		 * The meta object literal for the '<em><b>Parent Complete Component Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES = eINSTANCE.getImplementationComponentType_ParentCompleteComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Component Parameter Usage Implementation Component Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE = eINSTANCE.getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE = eINSTANCE.getImplementationComponentType_ComponentType();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.RepositoryComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.RepositoryComponentImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getRepositoryComponent()
		 * @generated
		 */
		EClass REPOSITORY_COMPONENT = eINSTANCE.getRepositoryComponent();

		/**
		 * The meta object literal for the '<em><b>Repository Repository Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT = eINSTANCE.getRepositoryComponent_Repository__RepositoryComponent();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.ProvidedRoleImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getProvidedRole()
		 * @generated
		 */
		EClass PROVIDED_ROLE = eINSTANCE.getProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Providing Entity Provided Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE = eINSTANCE.getProvidedRole_ProvidingEntity_ProvidedRole();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.ParameterImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Data Type Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DATA_TYPE_PARAMETER = eINSTANCE.getParameter_DataType__Parameter();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Signature Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER = eINSTANCE.getParameter_InfrastructureSignature__Parameter();

		/**
		 * The meta object literal for the '<em><b>Operation Signature Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OPERATION_SIGNATURE_PARAMETER = eINSTANCE.getParameter_OperationSignature__Parameter();

		/**
		 * The meta object literal for the '<em><b>Event Type Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__EVENT_TYPE_PARAMETER = eINSTANCE.getParameter_EventType__Parameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_NAME = eINSTANCE.getParameter_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Modifier Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MODIFIER_PARAMETER = eINSTANCE.getParameter_Modifier__Parameter();

		/**
		 * The meta object literal for the '<em><b>Resource Signature Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__RESOURCE_SIGNATURE_PARAMETER = eINSTANCE.getParameter_ResourceSignature__Parameter();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.DataTypeImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Repository Data Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__REPOSITORY_DATA_TYPE = eINSTANCE.getDataType_Repository__DataType();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.RepositoryImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Repository Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__REPOSITORY_DESCRIPTION = eINSTANCE.getRepository_RepositoryDescription();

		/**
		 * The meta object literal for the '<em><b>Components Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__COMPONENTS_REPOSITORY = eINSTANCE.getRepository_Components__Repository();

		/**
		 * The meta object literal for the '<em><b>Interfaces Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__INTERFACES_REPOSITORY = eINSTANCE.getRepository_Interfaces__Repository();

		/**
		 * The meta object literal for the '<em><b>Failure Types Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__FAILURE_TYPES_REPOSITORY = eINSTANCE.getRepository_FailureTypes__Repository();

		/**
		 * The meta object literal for the '<em><b>Data Types Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__DATA_TYPES_REPOSITORY = eINSTANCE.getRepository_DataTypes__Repository();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.InterfaceImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Parent Interfaces Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PARENT_INTERFACES_INTERFACE = eINSTANCE.getInterface_ParentInterfaces__Interface();

		/**
		 * The meta object literal for the '<em><b>Protocols Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PROTOCOLS_INTERFACE = eINSTANCE.getInterface_Protocols__Interface();

		/**
		 * The meta object literal for the '<em><b>Required Characterisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__REQUIRED_CHARACTERISATIONS = eINSTANCE.getInterface_RequiredCharacterisations();

		/**
		 * The meta object literal for the '<em><b>Repository Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__REPOSITORY_INTERFACE = eINSTANCE.getInterface_Repository__Interface();

		/**
		 * The meta object literal for the '<em><b>Is Assignable From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERFACE___IS_ASSIGNABLE_FROM__INTERFACE = eINSTANCE.getInterface__IsAssignableFrom__Interface();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.RequiredCharacterisationImpl <em>Required Characterisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.RequiredCharacterisationImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getRequiredCharacterisation()
		 * @generated
		 */
		EClass REQUIRED_CHARACTERISATION = eINSTANCE.getRequiredCharacterisation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_CHARACTERISATION__TYPE = eINSTANCE.getRequiredCharacterisation_Type();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_CHARACTERISATION__PARAMETER = eINSTANCE.getRequiredCharacterisation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Interface Required Characterisation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION = eINSTANCE.getRequiredCharacterisation_Interface_RequiredCharacterisation();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.EventGroupImpl <em>Event Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.EventGroupImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getEventGroup()
		 * @generated
		 */
		EClass EVENT_GROUP = eINSTANCE.getEventGroup();

		/**
		 * The meta object literal for the '<em><b>Event Types Event Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_GROUP__EVENT_TYPES_EVENT_GROUP = eINSTANCE.getEventGroup_EventTypes__EventGroup();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.EventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.EventTypeImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getEventType()
		 * @generated
		 */
		EClass EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '<em><b>Parameter Event Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__PARAMETER_EVENT_TYPE = eINSTANCE.getEventType_Parameter__EventType();

		/**
		 * The meta object literal for the '<em><b>Event Group Event Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__EVENT_GROUP_EVENT_TYPE = eINSTANCE.getEventType_EventGroup__EventType();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.SignatureImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Exceptions Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__EXCEPTIONS_SIGNATURE = eINSTANCE.getSignature_Exceptions__Signature();

		/**
		 * The meta object literal for the '<em><b>Failure Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__FAILURE_TYPE = eINSTANCE.getSignature_FailureType();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.ExceptionTypeImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getExceptionType()
		 * @generated
		 */
		EClass EXCEPTION_TYPE = eINSTANCE.getExceptionType();

		/**
		 * The meta object literal for the '<em><b>Exception Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__EXCEPTION_NAME = eINSTANCE.getExceptionType_ExceptionName();

		/**
		 * The meta object literal for the '<em><b>Exception Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_TYPE__EXCEPTION_MESSAGE = eINSTANCE.getExceptionType_ExceptionMessage();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.InfrastructureSignatureImpl <em>Infrastructure Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.InfrastructureSignatureImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getInfrastructureSignature()
		 * @generated
		 */
		EClass INFRASTRUCTURE_SIGNATURE = eINSTANCE.getInfrastructureSignature();

		/**
		 * The meta object literal for the '<em><b>Parameters Infrastructure Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE = eINSTANCE.getInfrastructureSignature_Parameters__InfrastructureSignature();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Interface Infrastructure Signature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE = eINSTANCE.getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.InfrastructureInterfaceImpl <em>Infrastructure Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.InfrastructureInterfaceImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getInfrastructureInterface()
		 * @generated
		 */
		EClass INFRASTRUCTURE_INTERFACE = eINSTANCE.getInfrastructureInterface();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Signatures Infrastructure Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE = eINSTANCE.getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.InfrastructureRequiredRoleImpl <em>Infrastructure Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.InfrastructureRequiredRoleImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getInfrastructureRequiredRole()
		 * @generated
		 */
		EClass INFRASTRUCTURE_REQUIRED_ROLE = eINSTANCE.getInfrastructureRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Required Interface Infrastructure Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE = eINSTANCE.getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.RequiredRoleImpl <em>Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.RequiredRoleImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getRequiredRole()
		 * @generated
		 */
		EClass REQUIRED_ROLE = eINSTANCE.getRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Requiring Entity Required Role</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE = eINSTANCE.getRequiredRole_RequiringEntity_RequiredRole();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.OperationSignatureImpl <em>Operation Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.OperationSignatureImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getOperationSignature()
		 * @generated
		 */
		EClass OPERATION_SIGNATURE = eINSTANCE.getOperationSignature();

		/**
		 * The meta object literal for the '<em><b>Interface Operation Signature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE = eINSTANCE.getOperationSignature_Interface__OperationSignature();

		/**
		 * The meta object literal for the '<em><b>Parameters Operation Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE = eINSTANCE.getOperationSignature_Parameters__OperationSignature();

		/**
		 * The meta object literal for the '<em><b>Return Type Operation Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE = eINSTANCE.getOperationSignature_ReturnType__OperationSignature();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.OperationInterfaceImpl <em>Operation Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.OperationInterfaceImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getOperationInterface()
		 * @generated
		 */
		EClass OPERATION_INTERFACE = eINSTANCE.getOperationInterface();

		/**
		 * The meta object literal for the '<em><b>Signatures Operation Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE = eINSTANCE.getOperationInterface_Signatures__OperationInterface();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.OperationRequiredRoleImpl <em>Operation Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.OperationRequiredRoleImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getOperationRequiredRole()
		 * @generated
		 */
		EClass OPERATION_REQUIRED_ROLE = eINSTANCE.getOperationRequiredRole();

		/**
		 * The meta object literal for the '<em><b>Required Interface Operation Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE = eINSTANCE.getOperationRequiredRole_RequiredInterface__OperationRequiredRole();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.SourceRoleImpl <em>Source Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.SourceRoleImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getSourceRole()
		 * @generated
		 */
		EClass SOURCE_ROLE = eINSTANCE.getSourceRole();

		/**
		 * The meta object literal for the '<em><b>Event Group Source Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ROLE__EVENT_GROUP_SOURCE_ROLE = eINSTANCE.getSourceRole_EventGroup__SourceRole();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.SinkRoleImpl <em>Sink Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.SinkRoleImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getSinkRole()
		 * @generated
		 */
		EClass SINK_ROLE = eINSTANCE.getSinkRole();

		/**
		 * The meta object literal for the '<em><b>Event Group Sink Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK_ROLE__EVENT_GROUP_SINK_ROLE = eINSTANCE.getSinkRole_EventGroup__SinkRole();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.OperationProvidedRoleImpl <em>Operation Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.OperationProvidedRoleImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getOperationProvidedRole()
		 * @generated
		 */
		EClass OPERATION_PROVIDED_ROLE = eINSTANCE.getOperationProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Provided Interface Operation Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE = eINSTANCE.getOperationProvidedRole_ProvidedInterface__OperationProvidedRole();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.InfrastructureProvidedRoleImpl <em>Infrastructure Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.InfrastructureProvidedRoleImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getInfrastructureProvidedRole()
		 * @generated
		 */
		EClass INFRASTRUCTURE_PROVIDED_ROLE = eINSTANCE.getInfrastructureProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Provided Interface Infrastructure Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE = eINSTANCE.getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.CompleteComponentTypeImpl <em>Complete Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.CompleteComponentTypeImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getCompleteComponentType()
		 * @generated
		 */
		EClass COMPLETE_COMPONENT_TYPE = eINSTANCE.getCompleteComponentType();

		/**
		 * The meta object literal for the '<em><b>Parent Provides Component Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES = eINSTANCE.getCompleteComponentType_ParentProvidesComponentTypes();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.ProvidesComponentTypeImpl <em>Provides Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.ProvidesComponentTypeImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getProvidesComponentType()
		 * @generated
		 */
		EClass PROVIDES_COMPONENT_TYPE = eINSTANCE.getProvidesComponentType();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.CompositeComponentImpl <em>Composite Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.CompositeComponentImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getCompositeComponent()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT = eINSTANCE.getCompositeComponent();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.PrimitiveDataTypeImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DATA_TYPE__TYPE = eINSTANCE.getPrimitiveDataType_Type();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.CollectionDataTypeImpl <em>Collection Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.CollectionDataTypeImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getCollectionDataType()
		 * @generated
		 */
		EClass COLLECTION_DATA_TYPE = eINSTANCE.getCollectionDataType();

		/**
		 * The meta object literal for the '<em><b>Inner Type Collection Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE = eINSTANCE.getCollectionDataType_InnerType_CollectionDataType();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.CompositeDataTypeImpl <em>Composite Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.CompositeDataTypeImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getCompositeDataType()
		 * @generated
		 */
		EClass COMPOSITE_DATA_TYPE = eINSTANCE.getCompositeDataType();

		/**
		 * The meta object literal for the '<em><b>Parent Type Composite Data Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_TYPE__PARENT_TYPE_COMPOSITE_DATA_TYPE = eINSTANCE.getCompositeDataType_ParentType_CompositeDataType();

		/**
		 * The meta object literal for the '<em><b>Inner Declaration Composite Data Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATA_TYPE__INNER_DECLARATION_COMPOSITE_DATA_TYPE = eINSTANCE.getCompositeDataType_InnerDeclaration_CompositeDataType();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.InnerDeclarationImpl <em>Inner Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.InnerDeclarationImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getInnerDeclaration()
		 * @generated
		 */
		EClass INNER_DECLARATION = eINSTANCE.getInnerDeclaration();

		/**
		 * The meta object literal for the '<em><b>Datatype Inner Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INNER_DECLARATION__DATATYPE_INNER_DECLARATION = eINSTANCE.getInnerDeclaration_Datatype_InnerDeclaration();

		/**
		 * The meta object literal for the '<em><b>Composite Data Type Inner Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION = eINSTANCE.getInnerDeclaration_CompositeDataType_InnerDeclaration();

		/**
		 * The meta object literal for the '{@link pcm.repository.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.impl.RoleImpl
		 * @see pcm.repository.impl.RepositoryPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link pcm.repository.ParameterModifier <em>Parameter Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.ParameterModifier
		 * @see pcm.repository.impl.RepositoryPackageImpl#getParameterModifier()
		 * @generated
		 */
		EEnum PARAMETER_MODIFIER = eINSTANCE.getParameterModifier();

		/**
		 * The meta object literal for the '{@link pcm.repository.ComponentType <em>Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.ComponentType
		 * @see pcm.repository.impl.RepositoryPackageImpl#getComponentType()
		 * @generated
		 */
		EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '{@link pcm.repository.PrimitiveTypeEnum <em>Primitive Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.repository.PrimitiveTypeEnum
		 * @see pcm.repository.impl.RepositoryPackageImpl#getPrimitiveTypeEnum()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE_ENUM = eINSTANCE.getPrimitiveTypeEnum();

	}

} //RepositoryPackage

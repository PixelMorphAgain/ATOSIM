/**
 */
package bscm.blockchainsystemComponentRepository;

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
 * @see bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface BlockchainsystemComponentRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "blockchainsystemComponentRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/BlockchainSystemComponentModel/BlockchainSystemComponentRepository/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "blockchainsystemComponentRepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockchainsystemComponentRepositoryPackage eINSTANCE = bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link bscm.blockchainsystemComponentRepository.impl.BlockchainSystemNodeComponentImpl <em>Blockchain System Node Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainSystemNodeComponentImpl
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getBlockchainSystemNodeComponent()
	 * @generated
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Blockchain System Node Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Blockchain System Node Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.blockchainsystemComponentRepository.impl.BlockchainSystemNodeComponentRepositoryImpl <em>Blockchain System Node Component Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainSystemNodeComponentRepositoryImpl
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getBlockchainSystemNodeComponentRepository()
	 * @generated
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY__COMPONENTS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blockchain System Node Component Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Blockchain System Node Component Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.blockchainsystemComponentRepository.impl.BlockValidatorComponentImpl <em>Block Validator Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockValidatorComponentImpl
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getBlockValidatorComponent()
	 * @generated
	 */
	int BLOCK_VALIDATOR_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT__ID = BLOCKCHAIN_SYSTEM_NODE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT__ENTITY_NAME = BLOCKCHAIN_SYSTEM_NODE_COMPONENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Validation Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT__VALIDATION_DURATION = BLOCKCHAIN_SYSTEM_NODE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Validator Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT_FEATURE_COUNT = BLOCKCHAIN_SYSTEM_NODE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___ECLASS = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___EIS_PROXY = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___ERESOURCE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___ECONTAINER = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___ECONTAINING_FEATURE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___ECONTAINMENT_FEATURE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___ECONTENTS = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___EALL_CONTENTS = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___ECROSS_REFERENCES = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___EGET__ESTRUCTURALFEATURE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___EIS_SET__ESTRUCTURALFEATURE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___EUNSET__ESTRUCTURALFEATURE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT___EINVOKE__EOPERATION_ELIST = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Block Validator Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATOR_COMPONENT_OPERATION_COUNT = BLOCKCHAIN_SYSTEM_NODE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.blockchainsystemComponentRepository.impl.MiningProcessComponentImpl <em>Mining Process Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystemComponentRepository.impl.MiningProcessComponentImpl
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getMiningProcessComponent()
	 * @generated
	 */
	int MINING_PROCESS_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT__ID = BLOCKCHAIN_SYSTEM_NODE_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT__ENTITY_NAME = BLOCKCHAIN_SYSTEM_NODE_COMPONENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Is Mining Process Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT__IS_MINING_PROCESS_ENABLED = BLOCKCHAIN_SYSTEM_NODE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mining Process Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT_FEATURE_COUNT = BLOCKCHAIN_SYSTEM_NODE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___ECLASS = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___EIS_PROXY = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___ERESOURCE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___ECONTAINER = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___ECONTAINING_FEATURE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___ECONTAINMENT_FEATURE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___ECONTENTS = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___EALL_CONTENTS = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___ECROSS_REFERENCES = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___EGET__ESTRUCTURALFEATURE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___EIS_SET__ESTRUCTURALFEATURE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___EUNSET__ESTRUCTURALFEATURE = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT___EINVOKE__EOPERATION_ELIST = BLOCKCHAIN_SYSTEM_NODE_COMPONENT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Mining Process Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_PROCESS_COMPONENT_OPERATION_COUNT = BLOCKCHAIN_SYSTEM_NODE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.blockchainsystemComponentRepository.impl.BlockValiationDurationSpecificationImpl <em>Block Valiation Duration Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockValiationDurationSpecificationImpl
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getBlockValiationDurationSpecification()
	 * @generated
	 */
	int BLOCK_VALIATION_DURATION_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIATION_DURATION_SPECIFICATION__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Block Valiation Duration Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIATION_DURATION_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block Valiation Duration Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIATION_DURATION_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bscm.blockchainsystemComponentRepository.impl.BlockValidationDurationValueImpl <em>Block Validation Duration Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockValidationDurationValueImpl
	 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getBlockValidationDurationValue()
	 * @generated
	 */
	int BLOCK_VALIDATION_DURATION_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATION_DURATION_VALUE__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Probabilit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATION_DURATION_VALUE__PROBABILIT = 1;

	/**
	 * The number of structural features of the '<em>Block Validation Duration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATION_DURATION_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Block Validation Duration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_VALIDATION_DURATION_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystemComponentRepository.BlockchainSystemNodeComponent <em>Blockchain System Node Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockchain System Node Component</em>'.
	 * @see bscm.blockchainsystemComponentRepository.BlockchainSystemNodeComponent
	 * @generated
	 */
	EClass getBlockchainSystemNodeComponent();

	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystemComponentRepository.BlockchainSystemNodeComponentRepository <em>Blockchain System Node Component Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockchain System Node Component Repository</em>'.
	 * @see bscm.blockchainsystemComponentRepository.BlockchainSystemNodeComponentRepository
	 * @generated
	 */
	EClass getBlockchainSystemNodeComponentRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link bscm.blockchainsystemComponentRepository.BlockchainSystemNodeComponentRepository#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see bscm.blockchainsystemComponentRepository.BlockchainSystemNodeComponentRepository#getComponents()
	 * @see #getBlockchainSystemNodeComponentRepository()
	 * @generated
	 */
	EReference getBlockchainSystemNodeComponentRepository_Components();

	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystemComponentRepository.BlockValidatorComponent <em>Block Validator Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Validator Component</em>'.
	 * @see bscm.blockchainsystemComponentRepository.BlockValidatorComponent
	 * @generated
	 */
	EClass getBlockValidatorComponent();

	/**
	 * Returns the meta object for the containment reference '{@link bscm.blockchainsystemComponentRepository.BlockValidatorComponent#getValidationDuration <em>Validation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation Duration</em>'.
	 * @see bscm.blockchainsystemComponentRepository.BlockValidatorComponent#getValidationDuration()
	 * @see #getBlockValidatorComponent()
	 * @generated
	 */
	EReference getBlockValidatorComponent_ValidationDuration();

	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystemComponentRepository.MiningProcessComponent <em>Mining Process Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Process Component</em>'.
	 * @see bscm.blockchainsystemComponentRepository.MiningProcessComponent
	 * @generated
	 */
	EClass getMiningProcessComponent();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystemComponentRepository.MiningProcessComponent#isIsMiningProcessEnabled <em>Is Mining Process Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mining Process Enabled</em>'.
	 * @see bscm.blockchainsystemComponentRepository.MiningProcessComponent#isIsMiningProcessEnabled()
	 * @see #getMiningProcessComponent()
	 * @generated
	 */
	EAttribute getMiningProcessComponent_IsMiningProcessEnabled();

	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystemComponentRepository.BlockValiationDurationSpecification <em>Block Valiation Duration Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Valiation Duration Specification</em>'.
	 * @see bscm.blockchainsystemComponentRepository.BlockValiationDurationSpecification
	 * @generated
	 */
	EClass getBlockValiationDurationSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link bscm.blockchainsystemComponentRepository.BlockValiationDurationSpecification#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see bscm.blockchainsystemComponentRepository.BlockValiationDurationSpecification#getValues()
	 * @see #getBlockValiationDurationSpecification()
	 * @generated
	 */
	EReference getBlockValiationDurationSpecification_Values();

	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystemComponentRepository.BlockValidationDurationValue <em>Block Validation Duration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Validation Duration Value</em>'.
	 * @see bscm.blockchainsystemComponentRepository.BlockValidationDurationValue
	 * @generated
	 */
	EClass getBlockValidationDurationValue();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystemComponentRepository.BlockValidationDurationValue#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see bscm.blockchainsystemComponentRepository.BlockValidationDurationValue#getDuration()
	 * @see #getBlockValidationDurationValue()
	 * @generated
	 */
	EAttribute getBlockValidationDurationValue_Duration();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystemComponentRepository.BlockValidationDurationValue#getProbabilit <em>Probabilit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probabilit</em>'.
	 * @see bscm.blockchainsystemComponentRepository.BlockValidationDurationValue#getProbabilit()
	 * @see #getBlockValidationDurationValue()
	 * @generated
	 */
	EAttribute getBlockValidationDurationValue_Probabilit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlockchainsystemComponentRepositoryFactory getBlockchainsystemComponentRepositoryFactory();

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
		 * The meta object literal for the '{@link bscm.blockchainsystemComponentRepository.impl.BlockchainSystemNodeComponentImpl <em>Blockchain System Node Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainSystemNodeComponentImpl
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getBlockchainSystemNodeComponent()
		 * @generated
		 */
		EClass BLOCKCHAIN_SYSTEM_NODE_COMPONENT = eINSTANCE.getBlockchainSystemNodeComponent();

		/**
		 * The meta object literal for the '{@link bscm.blockchainsystemComponentRepository.impl.BlockchainSystemNodeComponentRepositoryImpl <em>Blockchain System Node Component Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainSystemNodeComponentRepositoryImpl
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getBlockchainSystemNodeComponentRepository()
		 * @generated
		 */
		EClass BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY = eINSTANCE.getBlockchainSystemNodeComponentRepository();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKCHAIN_SYSTEM_NODE_COMPONENT_REPOSITORY__COMPONENTS = eINSTANCE.getBlockchainSystemNodeComponentRepository_Components();

		/**
		 * The meta object literal for the '{@link bscm.blockchainsystemComponentRepository.impl.BlockValidatorComponentImpl <em>Block Validator Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockValidatorComponentImpl
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getBlockValidatorComponent()
		 * @generated
		 */
		EClass BLOCK_VALIDATOR_COMPONENT = eINSTANCE.getBlockValidatorComponent();

		/**
		 * The meta object literal for the '<em><b>Validation Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_VALIDATOR_COMPONENT__VALIDATION_DURATION = eINSTANCE.getBlockValidatorComponent_ValidationDuration();

		/**
		 * The meta object literal for the '{@link bscm.blockchainsystemComponentRepository.impl.MiningProcessComponentImpl <em>Mining Process Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystemComponentRepository.impl.MiningProcessComponentImpl
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getMiningProcessComponent()
		 * @generated
		 */
		EClass MINING_PROCESS_COMPONENT = eINSTANCE.getMiningProcessComponent();

		/**
		 * The meta object literal for the '<em><b>Is Mining Process Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINING_PROCESS_COMPONENT__IS_MINING_PROCESS_ENABLED = eINSTANCE.getMiningProcessComponent_IsMiningProcessEnabled();

		/**
		 * The meta object literal for the '{@link bscm.blockchainsystemComponentRepository.impl.BlockValiationDurationSpecificationImpl <em>Block Valiation Duration Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockValiationDurationSpecificationImpl
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getBlockValiationDurationSpecification()
		 * @generated
		 */
		EClass BLOCK_VALIATION_DURATION_SPECIFICATION = eINSTANCE.getBlockValiationDurationSpecification();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_VALIATION_DURATION_SPECIFICATION__VALUES = eINSTANCE.getBlockValiationDurationSpecification_Values();

		/**
		 * The meta object literal for the '{@link bscm.blockchainsystemComponentRepository.impl.BlockValidationDurationValueImpl <em>Block Validation Duration Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockValidationDurationValueImpl
		 * @see bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl#getBlockValidationDurationValue()
		 * @generated
		 */
		EClass BLOCK_VALIDATION_DURATION_VALUE = eINSTANCE.getBlockValidationDurationValue();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_VALIDATION_DURATION_VALUE__DURATION = eINSTANCE.getBlockValidationDurationValue_Duration();

		/**
		 * The meta object literal for the '<em><b>Probabilit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_VALIDATION_DURATION_VALUE__PROBABILIT = eINSTANCE.getBlockValidationDurationValue_Probabilit();

	}

} //BlockchainsystemComponentRepositoryPackage

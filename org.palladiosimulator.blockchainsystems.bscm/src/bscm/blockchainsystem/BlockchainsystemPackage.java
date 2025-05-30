/**
 */
package bscm.blockchainsystem;

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
 * @see bscm.blockchainsystem.BlockchainsystemFactory
 * @model kind="package"
 * @generated
 */
public interface BlockchainsystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "blockchainsystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/BlockchainSystemComponentModel/BlockchainSystem/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "blockchainsystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockchainsystemPackage eINSTANCE = bscm.blockchainsystem.impl.BlockchainsystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link bscm.blockchainsystem.impl.BlockchainSystemImpl <em>Blockchain System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystem.impl.BlockchainSystemImpl
	 * @see bscm.blockchainsystem.impl.BlockchainsystemPackageImpl#getBlockchainSystem()
	 * @generated
	 */
	int BLOCKCHAIN_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM__NETWORK = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM__SPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transactions Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Blockchain System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Blockchain System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.blockchainsystem.impl.BlockchainSystemSpecificationImpl <em>Blockchain System Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystem.impl.BlockchainSystemSpecificationImpl
	 * @see bscm.blockchainsystem.impl.BlockchainsystemPackageImpl#getBlockchainSystemSpecification()
	 * @generated
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Mean Block Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION__MEAN_BLOCK_TIME = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Of Required Security Confirmations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION__NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Hash Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION__REQUIRED_HASH_POWER = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION__MAX_BLOCK_SIZE = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Blockchain System Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Blockchain System Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKCHAIN_SYSTEM_SPECIFICATION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.blockchainsystem.impl.TransactionsSpecificationImpl <em>Transactions Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystem.impl.TransactionsSpecificationImpl
	 * @see bscm.blockchainsystem.impl.BlockchainsystemPackageImpl#getTransactionsSpecification()
	 * @generated
	 */
	int TRANSACTIONS_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Mean Transaction Creation Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION__MEAN_TRANSACTION_CREATION_INTERVAL = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transaction Properties Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION__TRANSACTION_PROPERTIES_SPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transactions Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Transactions Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONS_SPECIFICATION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.blockchainsystem.impl.TransactionPropertiesSpecificationImpl <em>Transaction Properties Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystem.impl.TransactionPropertiesSpecificationImpl
	 * @see bscm.blockchainsystem.impl.BlockchainsystemPackageImpl#getTransactionPropertiesSpecification()
	 * @generated
	 */
	int TRANSACTION_PROPERTIES_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_PROPERTIES_SPECIFICATION__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Transaction Properties Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_PROPERTIES_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transaction Properties Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_PROPERTIES_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bscm.blockchainsystem.impl.TransactionPropertiesSpecificationValueImpl <em>Transaction Properties Specification Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.blockchainsystem.impl.TransactionPropertiesSpecificationValueImpl
	 * @see bscm.blockchainsystem.impl.BlockchainsystemPackageImpl#getTransactionPropertiesSpecificationValue()
	 * @generated
	 */
	int TRANSACTION_PROPERTIES_SPECIFICATION_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__FEE = 1;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__PROBABILITY = 2;

	/**
	 * The number of structural features of the '<em>Transaction Properties Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_PROPERTIES_SPECIFICATION_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transaction Properties Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_PROPERTIES_SPECIFICATION_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystem.BlockchainSystem <em>Blockchain System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockchain System</em>'.
	 * @see bscm.blockchainsystem.BlockchainSystem
	 * @generated
	 */
	EClass getBlockchainSystem();

	/**
	 * Returns the meta object for the reference '{@link bscm.blockchainsystem.BlockchainSystem#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see bscm.blockchainsystem.BlockchainSystem#getNetwork()
	 * @see #getBlockchainSystem()
	 * @generated
	 */
	EReference getBlockchainSystem_Network();

	/**
	 * Returns the meta object for the containment reference '{@link bscm.blockchainsystem.BlockchainSystem#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see bscm.blockchainsystem.BlockchainSystem#getSpecification()
	 * @see #getBlockchainSystem()
	 * @generated
	 */
	EReference getBlockchainSystem_Specification();

	/**
	 * Returns the meta object for the containment reference '{@link bscm.blockchainsystem.BlockchainSystem#getTransactionsSpecification <em>Transactions Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transactions Specification</em>'.
	 * @see bscm.blockchainsystem.BlockchainSystem#getTransactionsSpecification()
	 * @see #getBlockchainSystem()
	 * @generated
	 */
	EReference getBlockchainSystem_TransactionsSpecification();

	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystem.BlockchainSystemSpecification <em>Blockchain System Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockchain System Specification</em>'.
	 * @see bscm.blockchainsystem.BlockchainSystemSpecification
	 * @generated
	 */
	EClass getBlockchainSystemSpecification();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystem.BlockchainSystemSpecification#getMeanBlockTime <em>Mean Block Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Block Time</em>'.
	 * @see bscm.blockchainsystem.BlockchainSystemSpecification#getMeanBlockTime()
	 * @see #getBlockchainSystemSpecification()
	 * @generated
	 */
	EAttribute getBlockchainSystemSpecification_MeanBlockTime();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystem.BlockchainSystemSpecification#getNumOfRequiredSecurityConfirmations <em>Num Of Required Security Confirmations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Required Security Confirmations</em>'.
	 * @see bscm.blockchainsystem.BlockchainSystemSpecification#getNumOfRequiredSecurityConfirmations()
	 * @see #getBlockchainSystemSpecification()
	 * @generated
	 */
	EAttribute getBlockchainSystemSpecification_NumOfRequiredSecurityConfirmations();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystem.BlockchainSystemSpecification#getRequiredHashPower <em>Required Hash Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Hash Power</em>'.
	 * @see bscm.blockchainsystem.BlockchainSystemSpecification#getRequiredHashPower()
	 * @see #getBlockchainSystemSpecification()
	 * @generated
	 */
	EAttribute getBlockchainSystemSpecification_RequiredHashPower();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystem.BlockchainSystemSpecification#getMaxBlockSize <em>Max Block Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Block Size</em>'.
	 * @see bscm.blockchainsystem.BlockchainSystemSpecification#getMaxBlockSize()
	 * @see #getBlockchainSystemSpecification()
	 * @generated
	 */
	EAttribute getBlockchainSystemSpecification_MaxBlockSize();

	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystem.TransactionsSpecification <em>Transactions Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transactions Specification</em>'.
	 * @see bscm.blockchainsystem.TransactionsSpecification
	 * @generated
	 */
	EClass getTransactionsSpecification();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystem.TransactionsSpecification#getMeanTransactionCreationInterval <em>Mean Transaction Creation Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Transaction Creation Interval</em>'.
	 * @see bscm.blockchainsystem.TransactionsSpecification#getMeanTransactionCreationInterval()
	 * @see #getTransactionsSpecification()
	 * @generated
	 */
	EAttribute getTransactionsSpecification_MeanTransactionCreationInterval();

	/**
	 * Returns the meta object for the reference '{@link bscm.blockchainsystem.TransactionsSpecification#getTransactionPropertiesSpecification <em>Transaction Properties Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transaction Properties Specification</em>'.
	 * @see bscm.blockchainsystem.TransactionsSpecification#getTransactionPropertiesSpecification()
	 * @see #getTransactionsSpecification()
	 * @generated
	 */
	EReference getTransactionsSpecification_TransactionPropertiesSpecification();

	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystem.TransactionPropertiesSpecification <em>Transaction Properties Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Properties Specification</em>'.
	 * @see bscm.blockchainsystem.TransactionPropertiesSpecification
	 * @generated
	 */
	EClass getTransactionPropertiesSpecification();

	/**
	 * Returns the meta object for the reference list '{@link bscm.blockchainsystem.TransactionPropertiesSpecification#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see bscm.blockchainsystem.TransactionPropertiesSpecification#getValues()
	 * @see #getTransactionPropertiesSpecification()
	 * @generated
	 */
	EReference getTransactionPropertiesSpecification_Values();

	/**
	 * Returns the meta object for class '{@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue <em>Transaction Properties Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Properties Specification Value</em>'.
	 * @see bscm.blockchainsystem.TransactionPropertiesSpecificationValue
	 * @generated
	 */
	EClass getTransactionPropertiesSpecificationValue();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getSize()
	 * @see #getTransactionPropertiesSpecificationValue()
	 * @generated
	 */
	EAttribute getTransactionPropertiesSpecificationValue_Size();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getFee <em>Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fee</em>'.
	 * @see bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getFee()
	 * @see #getTransactionPropertiesSpecificationValue()
	 * @generated
	 */
	EAttribute getTransactionPropertiesSpecificationValue_Fee();

	/**
	 * Returns the meta object for the attribute '{@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getProbability()
	 * @see #getTransactionPropertiesSpecificationValue()
	 * @generated
	 */
	EAttribute getTransactionPropertiesSpecificationValue_Probability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlockchainsystemFactory getBlockchainsystemFactory();

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
		 * The meta object literal for the '{@link bscm.blockchainsystem.impl.BlockchainSystemImpl <em>Blockchain System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystem.impl.BlockchainSystemImpl
		 * @see bscm.blockchainsystem.impl.BlockchainsystemPackageImpl#getBlockchainSystem()
		 * @generated
		 */
		EClass BLOCKCHAIN_SYSTEM = eINSTANCE.getBlockchainSystem();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKCHAIN_SYSTEM__NETWORK = eINSTANCE.getBlockchainSystem_Network();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKCHAIN_SYSTEM__SPECIFICATION = eINSTANCE.getBlockchainSystem_Specification();

		/**
		 * The meta object literal for the '<em><b>Transactions Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION = eINSTANCE.getBlockchainSystem_TransactionsSpecification();

		/**
		 * The meta object literal for the '{@link bscm.blockchainsystem.impl.BlockchainSystemSpecificationImpl <em>Blockchain System Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystem.impl.BlockchainSystemSpecificationImpl
		 * @see bscm.blockchainsystem.impl.BlockchainsystemPackageImpl#getBlockchainSystemSpecification()
		 * @generated
		 */
		EClass BLOCKCHAIN_SYSTEM_SPECIFICATION = eINSTANCE.getBlockchainSystemSpecification();

		/**
		 * The meta object literal for the '<em><b>Mean Block Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKCHAIN_SYSTEM_SPECIFICATION__MEAN_BLOCK_TIME = eINSTANCE.getBlockchainSystemSpecification_MeanBlockTime();

		/**
		 * The meta object literal for the '<em><b>Num Of Required Security Confirmations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKCHAIN_SYSTEM_SPECIFICATION__NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS = eINSTANCE.getBlockchainSystemSpecification_NumOfRequiredSecurityConfirmations();

		/**
		 * The meta object literal for the '<em><b>Required Hash Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKCHAIN_SYSTEM_SPECIFICATION__REQUIRED_HASH_POWER = eINSTANCE.getBlockchainSystemSpecification_RequiredHashPower();

		/**
		 * The meta object literal for the '<em><b>Max Block Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKCHAIN_SYSTEM_SPECIFICATION__MAX_BLOCK_SIZE = eINSTANCE.getBlockchainSystemSpecification_MaxBlockSize();

		/**
		 * The meta object literal for the '{@link bscm.blockchainsystem.impl.TransactionsSpecificationImpl <em>Transactions Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystem.impl.TransactionsSpecificationImpl
		 * @see bscm.blockchainsystem.impl.BlockchainsystemPackageImpl#getTransactionsSpecification()
		 * @generated
		 */
		EClass TRANSACTIONS_SPECIFICATION = eINSTANCE.getTransactionsSpecification();

		/**
		 * The meta object literal for the '<em><b>Mean Transaction Creation Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTIONS_SPECIFICATION__MEAN_TRANSACTION_CREATION_INTERVAL = eINSTANCE.getTransactionsSpecification_MeanTransactionCreationInterval();

		/**
		 * The meta object literal for the '<em><b>Transaction Properties Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTIONS_SPECIFICATION__TRANSACTION_PROPERTIES_SPECIFICATION = eINSTANCE.getTransactionsSpecification_TransactionPropertiesSpecification();

		/**
		 * The meta object literal for the '{@link bscm.blockchainsystem.impl.TransactionPropertiesSpecificationImpl <em>Transaction Properties Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystem.impl.TransactionPropertiesSpecificationImpl
		 * @see bscm.blockchainsystem.impl.BlockchainsystemPackageImpl#getTransactionPropertiesSpecification()
		 * @generated
		 */
		EClass TRANSACTION_PROPERTIES_SPECIFICATION = eINSTANCE.getTransactionPropertiesSpecification();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_PROPERTIES_SPECIFICATION__VALUES = eINSTANCE.getTransactionPropertiesSpecification_Values();

		/**
		 * The meta object literal for the '{@link bscm.blockchainsystem.impl.TransactionPropertiesSpecificationValueImpl <em>Transaction Properties Specification Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.blockchainsystem.impl.TransactionPropertiesSpecificationValueImpl
		 * @see bscm.blockchainsystem.impl.BlockchainsystemPackageImpl#getTransactionPropertiesSpecificationValue()
		 * @generated
		 */
		EClass TRANSACTION_PROPERTIES_SPECIFICATION_VALUE = eINSTANCE.getTransactionPropertiesSpecificationValue();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__SIZE = eINSTANCE.getTransactionPropertiesSpecificationValue_Size();

		/**
		 * The meta object literal for the '<em><b>Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__FEE = eINSTANCE.getTransactionPropertiesSpecificationValue_Fee();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__PROBABILITY = eINSTANCE.getTransactionPropertiesSpecificationValue_Probability();

	}

} //BlockchainsystemPackage

/**
 */
package bscm.blockchainsystem.impl;

import bscm.blockchainsystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainsystemFactoryImpl extends EFactoryImpl implements BlockchainsystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlockchainsystemFactory init() {
		try {
			BlockchainsystemFactory theBlockchainsystemFactory = (BlockchainsystemFactory)EPackage.Registry.INSTANCE.getEFactory(BlockchainsystemPackage.eNS_URI);
			if (theBlockchainsystemFactory != null) {
				return theBlockchainsystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlockchainsystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainsystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM: return createBlockchainSystem();
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION: return createBlockchainSystemSpecification();
			case BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION: return createTransactionsSpecification();
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION: return createTransactionPropertiesSpecification();
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE: return createTransactionPropertiesSpecificationValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockchainSystem createBlockchainSystem() {
		BlockchainSystemImpl blockchainSystem = new BlockchainSystemImpl();
		return blockchainSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockchainSystemSpecification createBlockchainSystemSpecification() {
		BlockchainSystemSpecificationImpl blockchainSystemSpecification = new BlockchainSystemSpecificationImpl();
		return blockchainSystemSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionsSpecification createTransactionsSpecification() {
		TransactionsSpecificationImpl transactionsSpecification = new TransactionsSpecificationImpl();
		return transactionsSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionPropertiesSpecification createTransactionPropertiesSpecification() {
		TransactionPropertiesSpecificationImpl transactionPropertiesSpecification = new TransactionPropertiesSpecificationImpl();
		return transactionPropertiesSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionPropertiesSpecificationValue createTransactionPropertiesSpecificationValue() {
		TransactionPropertiesSpecificationValueImpl transactionPropertiesSpecificationValue = new TransactionPropertiesSpecificationValueImpl();
		return transactionPropertiesSpecificationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockchainsystemPackage getBlockchainsystemPackage() {
		return (BlockchainsystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlockchainsystemPackage getPackage() {
		return BlockchainsystemPackage.eINSTANCE;
	}

} //BlockchainsystemFactoryImpl

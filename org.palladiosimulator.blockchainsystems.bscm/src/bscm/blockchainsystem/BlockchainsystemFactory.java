/**
 */
package bscm.blockchainsystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bscm.blockchainsystem.BlockchainsystemPackage
 * @generated
 */
public interface BlockchainsystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockchainsystemFactory eINSTANCE = bscm.blockchainsystem.impl.BlockchainsystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Blockchain System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blockchain System</em>'.
	 * @generated
	 */
	BlockchainSystem createBlockchainSystem();

	/**
	 * Returns a new object of class '<em>Blockchain System Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blockchain System Specification</em>'.
	 * @generated
	 */
	BlockchainSystemSpecification createBlockchainSystemSpecification();

	/**
	 * Returns a new object of class '<em>Transactions Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transactions Specification</em>'.
	 * @generated
	 */
	TransactionsSpecification createTransactionsSpecification();

	/**
	 * Returns a new object of class '<em>Transaction Properties Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Properties Specification</em>'.
	 * @generated
	 */
	TransactionPropertiesSpecification createTransactionPropertiesSpecification();

	/**
	 * Returns a new object of class '<em>Transaction Properties Specification Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Properties Specification Value</em>'.
	 * @generated
	 */
	TransactionPropertiesSpecificationValue createTransactionPropertiesSpecificationValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BlockchainsystemPackage getBlockchainsystemPackage();

} //BlockchainsystemFactory

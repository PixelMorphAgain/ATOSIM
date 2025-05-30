/**
 */
package bscm.blockchainsystem;

import bscm.p2pnetwork.P2PNetwork;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blockchain System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystem.BlockchainSystem#getNetwork <em>Network</em>}</li>
 *   <li>{@link bscm.blockchainsystem.BlockchainSystem#getSpecification <em>Specification</em>}</li>
 *   <li>{@link bscm.blockchainsystem.BlockchainSystem#getTransactionsSpecification <em>Transactions Specification</em>}</li>
 * </ul>
 *
 * @see bscm.blockchainsystem.BlockchainsystemPackage#getBlockchainSystem()
 * @model
 * @generated
 */
public interface BlockchainSystem extends Entity {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(P2PNetwork)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getBlockchainSystem_Network()
	 * @model required="true"
	 * @generated
	 */
	P2PNetwork getNetwork();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.BlockchainSystem#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(P2PNetwork value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(BlockchainSystemSpecification)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getBlockchainSystem_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BlockchainSystemSpecification getSpecification();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.BlockchainSystem#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(BlockchainSystemSpecification value);

	/**
	 * Returns the value of the '<em><b>Transactions Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions Specification</em>' containment reference.
	 * @see #setTransactionsSpecification(TransactionsSpecification)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getBlockchainSystem_TransactionsSpecification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TransactionsSpecification getTransactionsSpecification();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.BlockchainSystem#getTransactionsSpecification <em>Transactions Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactions Specification</em>' containment reference.
	 * @see #getTransactionsSpecification()
	 * @generated
	 */
	void setTransactionsSpecification(TransactionsSpecification value);

} // BlockchainSystem

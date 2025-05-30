/**
 */
package bscm.blockchainsystem;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blockchain System Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystem.BlockchainSystemSpecification#getMeanBlockTime <em>Mean Block Time</em>}</li>
 *   <li>{@link bscm.blockchainsystem.BlockchainSystemSpecification#getNumOfRequiredSecurityConfirmations <em>Num Of Required Security Confirmations</em>}</li>
 *   <li>{@link bscm.blockchainsystem.BlockchainSystemSpecification#getRequiredHashPower <em>Required Hash Power</em>}</li>
 *   <li>{@link bscm.blockchainsystem.BlockchainSystemSpecification#getMaxBlockSize <em>Max Block Size</em>}</li>
 * </ul>
 *
 * @see bscm.blockchainsystem.BlockchainsystemPackage#getBlockchainSystemSpecification()
 * @model
 * @generated
 */
public interface BlockchainSystemSpecification extends Entity {
	/**
	 * Returns the value of the '<em><b>Mean Block Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Block Time</em>' attribute.
	 * @see #setMeanBlockTime(double)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getBlockchainSystemSpecification_MeanBlockTime()
	 * @model required="true"
	 * @generated
	 */
	double getMeanBlockTime();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.BlockchainSystemSpecification#getMeanBlockTime <em>Mean Block Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Block Time</em>' attribute.
	 * @see #getMeanBlockTime()
	 * @generated
	 */
	void setMeanBlockTime(double value);

	/**
	 * Returns the value of the '<em><b>Num Of Required Security Confirmations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Required Security Confirmations</em>' attribute.
	 * @see #setNumOfRequiredSecurityConfirmations(int)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getBlockchainSystemSpecification_NumOfRequiredSecurityConfirmations()
	 * @model required="true"
	 * @generated
	 */
	int getNumOfRequiredSecurityConfirmations();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.BlockchainSystemSpecification#getNumOfRequiredSecurityConfirmations <em>Num Of Required Security Confirmations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Required Security Confirmations</em>' attribute.
	 * @see #getNumOfRequiredSecurityConfirmations()
	 * @generated
	 */
	void setNumOfRequiredSecurityConfirmations(int value);

	/**
	 * Returns the value of the '<em><b>Required Hash Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Hash Power</em>' attribute.
	 * @see #setRequiredHashPower(double)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getBlockchainSystemSpecification_RequiredHashPower()
	 * @model required="true"
	 * @generated
	 */
	double getRequiredHashPower();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.BlockchainSystemSpecification#getRequiredHashPower <em>Required Hash Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Hash Power</em>' attribute.
	 * @see #getRequiredHashPower()
	 * @generated
	 */
	void setRequiredHashPower(double value);

	/**
	 * Returns the value of the '<em><b>Max Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Block Size</em>' attribute.
	 * @see #setMaxBlockSize(int)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getBlockchainSystemSpecification_MaxBlockSize()
	 * @model required="true"
	 * @generated
	 */
	int getMaxBlockSize();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.BlockchainSystemSpecification#getMaxBlockSize <em>Max Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Block Size</em>' attribute.
	 * @see #getMaxBlockSize()
	 * @generated
	 */
	void setMaxBlockSize(int value);

} // BlockchainSystemSpecification

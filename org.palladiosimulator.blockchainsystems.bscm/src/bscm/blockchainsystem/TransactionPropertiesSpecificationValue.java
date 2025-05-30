/**
 */
package bscm.blockchainsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Properties Specification Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getSize <em>Size</em>}</li>
 *   <li>{@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getFee <em>Fee</em>}</li>
 *   <li>{@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see bscm.blockchainsystem.BlockchainsystemPackage#getTransactionPropertiesSpecificationValue()
 * @model
 * @generated
 */
public interface TransactionPropertiesSpecificationValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getTransactionPropertiesSpecificationValue_Size()
	 * @model required="true"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fee</em>' attribute.
	 * @see #setFee(int)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getTransactionPropertiesSpecificationValue_Fee()
	 * @model required="true"
	 * @generated
	 */
	int getFee();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getFee <em>Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fee</em>' attribute.
	 * @see #getFee()
	 * @generated
	 */
	void setFee(int value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getTransactionPropertiesSpecificationValue_Probability()
	 * @model required="true"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

} // TransactionPropertiesSpecificationValue

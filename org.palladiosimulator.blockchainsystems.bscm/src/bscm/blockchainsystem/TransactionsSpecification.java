/**
 */
package bscm.blockchainsystem;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transactions Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystem.TransactionsSpecification#getMeanTransactionCreationInterval <em>Mean Transaction Creation Interval</em>}</li>
 *   <li>{@link bscm.blockchainsystem.TransactionsSpecification#getTransactionPropertiesSpecification <em>Transaction Properties Specification</em>}</li>
 * </ul>
 *
 * @see bscm.blockchainsystem.BlockchainsystemPackage#getTransactionsSpecification()
 * @model
 * @generated
 */
public interface TransactionsSpecification extends Entity {
	/**
	 * Returns the value of the '<em><b>Mean Transaction Creation Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Transaction Creation Interval</em>' attribute.
	 * @see #setMeanTransactionCreationInterval(double)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getTransactionsSpecification_MeanTransactionCreationInterval()
	 * @model required="true"
	 * @generated
	 */
	double getMeanTransactionCreationInterval();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.TransactionsSpecification#getMeanTransactionCreationInterval <em>Mean Transaction Creation Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Transaction Creation Interval</em>' attribute.
	 * @see #getMeanTransactionCreationInterval()
	 * @generated
	 */
	void setMeanTransactionCreationInterval(double value);

	/**
	 * Returns the value of the '<em><b>Transaction Properties Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Properties Specification</em>' reference.
	 * @see #setTransactionPropertiesSpecification(TransactionPropertiesSpecification)
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getTransactionsSpecification_TransactionPropertiesSpecification()
	 * @model required="true"
	 * @generated
	 */
	TransactionPropertiesSpecification getTransactionPropertiesSpecification();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystem.TransactionsSpecification#getTransactionPropertiesSpecification <em>Transaction Properties Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Properties Specification</em>' reference.
	 * @see #getTransactionPropertiesSpecification()
	 * @generated
	 */
	void setTransactionPropertiesSpecification(TransactionPropertiesSpecification value);

} // TransactionsSpecification

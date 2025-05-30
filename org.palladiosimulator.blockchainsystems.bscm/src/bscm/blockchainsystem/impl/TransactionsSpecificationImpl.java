/**
 */
package bscm.blockchainsystem.impl;

import bscm.blockchainsystem.BlockchainsystemPackage;
import bscm.blockchainsystem.TransactionPropertiesSpecification;
import bscm.blockchainsystem.TransactionsSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transactions Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystem.impl.TransactionsSpecificationImpl#getMeanTransactionCreationInterval <em>Mean Transaction Creation Interval</em>}</li>
 *   <li>{@link bscm.blockchainsystem.impl.TransactionsSpecificationImpl#getTransactionPropertiesSpecification <em>Transaction Properties Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionsSpecificationImpl extends EntityImpl implements TransactionsSpecification {
	/**
	 * The default value of the '{@link #getMeanTransactionCreationInterval() <em>Mean Transaction Creation Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanTransactionCreationInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_TRANSACTION_CREATION_INTERVAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeanTransactionCreationInterval() <em>Mean Transaction Creation Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanTransactionCreationInterval()
	 * @generated
	 * @ordered
	 */
	protected double meanTransactionCreationInterval = MEAN_TRANSACTION_CREATION_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransactionPropertiesSpecification() <em>Transaction Properties Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionPropertiesSpecification()
	 * @generated
	 * @ordered
	 */
	protected TransactionPropertiesSpecification transactionPropertiesSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionsSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainsystemPackage.Literals.TRANSACTIONS_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMeanTransactionCreationInterval() {
		return meanTransactionCreationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeanTransactionCreationInterval(double newMeanTransactionCreationInterval) {
		double oldMeanTransactionCreationInterval = meanTransactionCreationInterval;
		meanTransactionCreationInterval = newMeanTransactionCreationInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__MEAN_TRANSACTION_CREATION_INTERVAL, oldMeanTransactionCreationInterval, meanTransactionCreationInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionPropertiesSpecification getTransactionPropertiesSpecification() {
		if (transactionPropertiesSpecification != null && transactionPropertiesSpecification.eIsProxy()) {
			InternalEObject oldTransactionPropertiesSpecification = (InternalEObject)transactionPropertiesSpecification;
			transactionPropertiesSpecification = (TransactionPropertiesSpecification)eResolveProxy(oldTransactionPropertiesSpecification);
			if (transactionPropertiesSpecification != oldTransactionPropertiesSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__TRANSACTION_PROPERTIES_SPECIFICATION, oldTransactionPropertiesSpecification, transactionPropertiesSpecification));
			}
		}
		return transactionPropertiesSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionPropertiesSpecification basicGetTransactionPropertiesSpecification() {
		return transactionPropertiesSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionPropertiesSpecification(TransactionPropertiesSpecification newTransactionPropertiesSpecification) {
		TransactionPropertiesSpecification oldTransactionPropertiesSpecification = transactionPropertiesSpecification;
		transactionPropertiesSpecification = newTransactionPropertiesSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__TRANSACTION_PROPERTIES_SPECIFICATION, oldTransactionPropertiesSpecification, transactionPropertiesSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__MEAN_TRANSACTION_CREATION_INTERVAL:
				return getMeanTransactionCreationInterval();
			case BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__TRANSACTION_PROPERTIES_SPECIFICATION:
				if (resolve) return getTransactionPropertiesSpecification();
				return basicGetTransactionPropertiesSpecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__MEAN_TRANSACTION_CREATION_INTERVAL:
				setMeanTransactionCreationInterval((Double)newValue);
				return;
			case BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__TRANSACTION_PROPERTIES_SPECIFICATION:
				setTransactionPropertiesSpecification((TransactionPropertiesSpecification)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__MEAN_TRANSACTION_CREATION_INTERVAL:
				setMeanTransactionCreationInterval(MEAN_TRANSACTION_CREATION_INTERVAL_EDEFAULT);
				return;
			case BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__TRANSACTION_PROPERTIES_SPECIFICATION:
				setTransactionPropertiesSpecification((TransactionPropertiesSpecification)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__MEAN_TRANSACTION_CREATION_INTERVAL:
				return meanTransactionCreationInterval != MEAN_TRANSACTION_CREATION_INTERVAL_EDEFAULT;
			case BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION__TRANSACTION_PROPERTIES_SPECIFICATION:
				return transactionPropertiesSpecification != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (MeanTransactionCreationInterval: ");
		result.append(meanTransactionCreationInterval);
		result.append(')');
		return result.toString();
	}

} //TransactionsSpecificationImpl

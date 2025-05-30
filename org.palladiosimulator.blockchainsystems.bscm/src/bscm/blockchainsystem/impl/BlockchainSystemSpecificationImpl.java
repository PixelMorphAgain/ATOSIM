/**
 */
package bscm.blockchainsystem.impl;

import bscm.blockchainsystem.BlockchainSystemSpecification;
import bscm.blockchainsystem.BlockchainsystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blockchain System Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystem.impl.BlockchainSystemSpecificationImpl#getMeanBlockTime <em>Mean Block Time</em>}</li>
 *   <li>{@link bscm.blockchainsystem.impl.BlockchainSystemSpecificationImpl#getNumOfRequiredSecurityConfirmations <em>Num Of Required Security Confirmations</em>}</li>
 *   <li>{@link bscm.blockchainsystem.impl.BlockchainSystemSpecificationImpl#getRequiredHashPower <em>Required Hash Power</em>}</li>
 *   <li>{@link bscm.blockchainsystem.impl.BlockchainSystemSpecificationImpl#getMaxBlockSize <em>Max Block Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockchainSystemSpecificationImpl extends EntityImpl implements BlockchainSystemSpecification {
	/**
	 * The default value of the '{@link #getMeanBlockTime() <em>Mean Block Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanBlockTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_BLOCK_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeanBlockTime() <em>Mean Block Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanBlockTime()
	 * @generated
	 * @ordered
	 */
	protected double meanBlockTime = MEAN_BLOCK_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumOfRequiredSecurityConfirmations() <em>Num Of Required Security Confirmations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfRequiredSecurityConfirmations()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfRequiredSecurityConfirmations() <em>Num Of Required Security Confirmations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfRequiredSecurityConfirmations()
	 * @generated
	 * @ordered
	 */
	protected int numOfRequiredSecurityConfirmations = NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredHashPower() <em>Required Hash Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredHashPower()
	 * @generated
	 * @ordered
	 */
	protected static final double REQUIRED_HASH_POWER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRequiredHashPower() <em>Required Hash Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredHashPower()
	 * @generated
	 * @ordered
	 */
	protected double requiredHashPower = REQUIRED_HASH_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBlockSize() <em>Max Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_BLOCK_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxBlockSize() <em>Max Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBlockSize()
	 * @generated
	 * @ordered
	 */
	protected int maxBlockSize = MAX_BLOCK_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockchainSystemSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainsystemPackage.Literals.BLOCKCHAIN_SYSTEM_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMeanBlockTime() {
		return meanBlockTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeanBlockTime(double newMeanBlockTime) {
		double oldMeanBlockTime = meanBlockTime;
		meanBlockTime = newMeanBlockTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__MEAN_BLOCK_TIME, oldMeanBlockTime, meanBlockTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumOfRequiredSecurityConfirmations() {
		return numOfRequiredSecurityConfirmations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumOfRequiredSecurityConfirmations(int newNumOfRequiredSecurityConfirmations) {
		int oldNumOfRequiredSecurityConfirmations = numOfRequiredSecurityConfirmations;
		numOfRequiredSecurityConfirmations = newNumOfRequiredSecurityConfirmations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS, oldNumOfRequiredSecurityConfirmations, numOfRequiredSecurityConfirmations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRequiredHashPower() {
		return requiredHashPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredHashPower(double newRequiredHashPower) {
		double oldRequiredHashPower = requiredHashPower;
		requiredHashPower = newRequiredHashPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__REQUIRED_HASH_POWER, oldRequiredHashPower, requiredHashPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxBlockSize() {
		return maxBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxBlockSize(int newMaxBlockSize) {
		int oldMaxBlockSize = maxBlockSize;
		maxBlockSize = newMaxBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__MAX_BLOCK_SIZE, oldMaxBlockSize, maxBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__MEAN_BLOCK_TIME:
				return getMeanBlockTime();
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS:
				return getNumOfRequiredSecurityConfirmations();
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__REQUIRED_HASH_POWER:
				return getRequiredHashPower();
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__MAX_BLOCK_SIZE:
				return getMaxBlockSize();
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
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__MEAN_BLOCK_TIME:
				setMeanBlockTime((Double)newValue);
				return;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS:
				setNumOfRequiredSecurityConfirmations((Integer)newValue);
				return;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__REQUIRED_HASH_POWER:
				setRequiredHashPower((Double)newValue);
				return;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__MAX_BLOCK_SIZE:
				setMaxBlockSize((Integer)newValue);
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
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__MEAN_BLOCK_TIME:
				setMeanBlockTime(MEAN_BLOCK_TIME_EDEFAULT);
				return;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS:
				setNumOfRequiredSecurityConfirmations(NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS_EDEFAULT);
				return;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__REQUIRED_HASH_POWER:
				setRequiredHashPower(REQUIRED_HASH_POWER_EDEFAULT);
				return;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__MAX_BLOCK_SIZE:
				setMaxBlockSize(MAX_BLOCK_SIZE_EDEFAULT);
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
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__MEAN_BLOCK_TIME:
				return meanBlockTime != MEAN_BLOCK_TIME_EDEFAULT;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS:
				return numOfRequiredSecurityConfirmations != NUM_OF_REQUIRED_SECURITY_CONFIRMATIONS_EDEFAULT;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__REQUIRED_HASH_POWER:
				return requiredHashPower != REQUIRED_HASH_POWER_EDEFAULT;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION__MAX_BLOCK_SIZE:
				return maxBlockSize != MAX_BLOCK_SIZE_EDEFAULT;
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
		result.append(" (MeanBlockTime: ");
		result.append(meanBlockTime);
		result.append(", NumOfRequiredSecurityConfirmations: ");
		result.append(numOfRequiredSecurityConfirmations);
		result.append(", RequiredHashPower: ");
		result.append(requiredHashPower);
		result.append(", MaxBlockSize: ");
		result.append(maxBlockSize);
		result.append(')');
		return result.toString();
	}

} //BlockchainSystemSpecificationImpl

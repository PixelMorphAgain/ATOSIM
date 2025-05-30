/**
 */
package bscm.blockchainsystem.impl;

import bscm.blockchainsystem.BlockchainsystemPackage;
import bscm.blockchainsystem.TransactionPropertiesSpecificationValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Properties Specification Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystem.impl.TransactionPropertiesSpecificationValueImpl#getSize <em>Size</em>}</li>
 *   <li>{@link bscm.blockchainsystem.impl.TransactionPropertiesSpecificationValueImpl#getFee <em>Fee</em>}</li>
 *   <li>{@link bscm.blockchainsystem.impl.TransactionPropertiesSpecificationValueImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionPropertiesSpecificationValueImpl extends MinimalEObjectImpl.Container implements TransactionPropertiesSpecificationValue {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected double size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFee() <em>Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFee()
	 * @generated
	 * @ordered
	 */
	protected static final int FEE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFee() <em>Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFee()
	 * @generated
	 * @ordered
	 */
	protected int fee = FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionPropertiesSpecificationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainsystemPackage.Literals.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(double newSize) {
		double oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFee() {
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFee(int newFee) {
		int oldFee = fee;
		fee = newFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__FEE, oldFee, fee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__SIZE:
				return getSize();
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__FEE:
				return getFee();
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__PROBABILITY:
				return getProbability();
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
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__SIZE:
				setSize((Double)newValue);
				return;
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__FEE:
				setFee((Integer)newValue);
				return;
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__PROBABILITY:
				setProbability((Double)newValue);
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
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__FEE:
				setFee(FEE_EDEFAULT);
				return;
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
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
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__SIZE:
				return size != SIZE_EDEFAULT;
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__FEE:
				return fee != FEE_EDEFAULT;
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
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
		result.append(" (Size: ");
		result.append(size);
		result.append(", Fee: ");
		result.append(fee);
		result.append(", Probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //TransactionPropertiesSpecificationValueImpl

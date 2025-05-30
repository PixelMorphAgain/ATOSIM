/**
 */
package bscm.blockchainsystemComponentRepository.impl;

import bscm.blockchainsystemComponentRepository.BlockValidationDurationValue;
import bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Validation Duration Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystemComponentRepository.impl.BlockValidationDurationValueImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link bscm.blockchainsystemComponentRepository.impl.BlockValidationDurationValueImpl#getProbabilit <em>Probabilit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockValidationDurationValueImpl extends MinimalEObjectImpl.Container implements BlockValidationDurationValue {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected long duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbabilit() <em>Probabilit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilit()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbabilit() <em>Probabilit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilit()
	 * @generated
	 * @ordered
	 */
	protected double probabilit = PROBABILIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockValidationDurationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainsystemComponentRepositoryPackage.Literals.BLOCK_VALIDATION_DURATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(long newDuration) {
		long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemComponentRepositoryPackage.BLOCK_VALIDATION_DURATION_VALUE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProbabilit() {
		return probabilit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbabilit(double newProbabilit) {
		double oldProbabilit = probabilit;
		probabilit = newProbabilit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemComponentRepositoryPackage.BLOCK_VALIDATION_DURATION_VALUE__PROBABILIT, oldProbabilit, probabilit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIDATION_DURATION_VALUE__DURATION:
				return getDuration();
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIDATION_DURATION_VALUE__PROBABILIT:
				return getProbabilit();
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
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIDATION_DURATION_VALUE__DURATION:
				setDuration((Long)newValue);
				return;
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIDATION_DURATION_VALUE__PROBABILIT:
				setProbabilit((Double)newValue);
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
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIDATION_DURATION_VALUE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIDATION_DURATION_VALUE__PROBABILIT:
				setProbabilit(PROBABILIT_EDEFAULT);
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
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIDATION_DURATION_VALUE__DURATION:
				return duration != DURATION_EDEFAULT;
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIDATION_DURATION_VALUE__PROBABILIT:
				return probabilit != PROBABILIT_EDEFAULT;
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
		result.append(" (Duration: ");
		result.append(duration);
		result.append(", Probabilit: ");
		result.append(probabilit);
		result.append(')');
		return result.toString();
	}

} //BlockValidationDurationValueImpl

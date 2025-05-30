/**
 */
package bscm.blockchainsystemComponentRepository.impl;

import bscm.blockchainsystemComponentRepository.BlockValiationDurationSpecification;
import bscm.blockchainsystemComponentRepository.BlockValidationDurationValue;
import bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Valiation Duration Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystemComponentRepository.impl.BlockValiationDurationSpecificationImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockValiationDurationSpecificationImpl extends MinimalEObjectImpl.Container implements BlockValiationDurationSpecification {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockValidationDurationValue> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockValiationDurationSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainsystemComponentRepositoryPackage.Literals.BLOCK_VALIATION_DURATION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockValidationDurationValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<BlockValidationDurationValue>(BlockValidationDurationValue.class, this, BlockchainsystemComponentRepositoryPackage.BLOCK_VALIATION_DURATION_SPECIFICATION__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIATION_DURATION_SPECIFICATION__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIATION_DURATION_SPECIFICATION__VALUES:
				return getValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIATION_DURATION_SPECIFICATION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends BlockValidationDurationValue>)newValue);
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
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIATION_DURATION_SPECIFICATION__VALUES:
				getValues().clear();
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
			case BlockchainsystemComponentRepositoryPackage.BLOCK_VALIATION_DURATION_SPECIFICATION__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockValiationDurationSpecificationImpl

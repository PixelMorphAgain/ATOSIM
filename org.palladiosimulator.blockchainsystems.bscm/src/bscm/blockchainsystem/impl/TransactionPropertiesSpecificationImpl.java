/**
 */
package bscm.blockchainsystem.impl;

import bscm.blockchainsystem.BlockchainsystemPackage;
import bscm.blockchainsystem.TransactionPropertiesSpecification;
import bscm.blockchainsystem.TransactionPropertiesSpecificationValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Properties Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystem.impl.TransactionPropertiesSpecificationImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionPropertiesSpecificationImpl extends MinimalEObjectImpl.Container implements TransactionPropertiesSpecification {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TransactionPropertiesSpecificationValue> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionPropertiesSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainsystemPackage.Literals.TRANSACTION_PROPERTIES_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransactionPropertiesSpecificationValue> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<TransactionPropertiesSpecificationValue>(TransactionPropertiesSpecificationValue.class, this, BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION__VALUES:
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
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends TransactionPropertiesSpecificationValue>)newValue);
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
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION__VALUES:
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
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransactionPropertiesSpecificationImpl

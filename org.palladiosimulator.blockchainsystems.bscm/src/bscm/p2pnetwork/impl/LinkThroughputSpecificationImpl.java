/**
 */
package bscm.p2pnetwork.impl;

import bscm.p2pnetwork.LinkThroughputSpecification;
import bscm.p2pnetwork.LinkThroughputSpecificationValue;
import bscm.p2pnetwork.P2pnetworkPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Throughput Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.impl.LinkThroughputSpecificationImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkThroughputSpecificationImpl extends MinimalEObjectImpl.Container implements LinkThroughputSpecification {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkThroughputSpecificationValue> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkThroughputSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2pnetworkPackage.Literals.LINK_THROUGHPUT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LinkThroughputSpecificationValue> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<LinkThroughputSpecificationValue>(LinkThroughputSpecificationValue.class, this, P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION__VALUES);
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
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION__VALUES:
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
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends LinkThroughputSpecificationValue>)newValue);
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
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION__VALUES:
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
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkThroughputSpecificationImpl

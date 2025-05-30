/**
 */
package bscm.blockchainsystem.impl;

import bscm.blockchainsystem.BlockchainSystem;
import bscm.blockchainsystem.BlockchainSystemSpecification;
import bscm.blockchainsystem.BlockchainsystemPackage;
import bscm.blockchainsystem.TransactionsSpecification;

import bscm.p2pnetwork.P2PNetwork;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blockchain System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystem.impl.BlockchainSystemImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link bscm.blockchainsystem.impl.BlockchainSystemImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link bscm.blockchainsystem.impl.BlockchainSystemImpl#getTransactionsSpecification <em>Transactions Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockchainSystemImpl extends EntityImpl implements BlockchainSystem {
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected P2PNetwork network;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected BlockchainSystemSpecification specification;

	/**
	 * The cached value of the '{@link #getTransactionsSpecification() <em>Transactions Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionsSpecification()
	 * @generated
	 * @ordered
	 */
	protected TransactionsSpecification transactionsSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockchainSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainsystemPackage.Literals.BLOCKCHAIN_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P2PNetwork getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (P2PNetwork)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P2PNetwork basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork(P2PNetwork newNetwork) {
		P2PNetwork oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockchainSystemSpecification getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(BlockchainSystemSpecification newSpecification, NotificationChain msgs) {
		BlockchainSystemSpecification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecification(BlockchainSystemSpecification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionsSpecification getTransactionsSpecification() {
		return transactionsSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionsSpecification(TransactionsSpecification newTransactionsSpecification, NotificationChain msgs) {
		TransactionsSpecification oldTransactionsSpecification = transactionsSpecification;
		transactionsSpecification = newTransactionsSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION, oldTransactionsSpecification, newTransactionsSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionsSpecification(TransactionsSpecification newTransactionsSpecification) {
		if (newTransactionsSpecification != transactionsSpecification) {
			NotificationChain msgs = null;
			if (transactionsSpecification != null)
				msgs = ((InternalEObject)transactionsSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION, null, msgs);
			if (newTransactionsSpecification != null)
				msgs = ((InternalEObject)newTransactionsSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION, null, msgs);
			msgs = basicSetTransactionsSpecification(newTransactionsSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION, newTransactionsSpecification, newTransactionsSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION:
				return basicSetTransactionsSpecification(null, msgs);
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
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__SPECIFICATION:
				return getSpecification();
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION:
				return getTransactionsSpecification();
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
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__NETWORK:
				setNetwork((P2PNetwork)newValue);
				return;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__SPECIFICATION:
				setSpecification((BlockchainSystemSpecification)newValue);
				return;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION:
				setTransactionsSpecification((TransactionsSpecification)newValue);
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
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__NETWORK:
				setNetwork((P2PNetwork)null);
				return;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__SPECIFICATION:
				setSpecification((BlockchainSystemSpecification)null);
				return;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION:
				setTransactionsSpecification((TransactionsSpecification)null);
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
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__NETWORK:
				return network != null;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__SPECIFICATION:
				return specification != null;
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM__TRANSACTIONS_SPECIFICATION:
				return transactionsSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockchainSystemImpl

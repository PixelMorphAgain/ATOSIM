/**
 */
package bscm.p2pnetwork.impl;

import bscm.p2pnetwork.LinkSpecification;
import bscm.p2pnetwork.P2pnetworkPackage;
import bscm.p2pnetwork.SubgraphLink;
import bscm.p2pnetwork.SubgraphSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subgraph Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.impl.SubgraphLinkImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link bscm.p2pnetwork.impl.SubgraphLinkImpl#getConnectedSubgraphs <em>Connected Subgraphs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubgraphLinkImpl extends EntityImpl implements SubgraphLink {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected LinkSpecification specification;

	/**
	 * The cached value of the '{@link #getConnectedSubgraphs() <em>Connected Subgraphs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedSubgraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<SubgraphSpecification> connectedSubgraphs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubgraphLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2pnetworkPackage.Literals.SUBGRAPH_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkSpecification getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(LinkSpecification newSpecification, NotificationChain msgs) {
		LinkSpecification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.SUBGRAPH_LINK__SPECIFICATION, oldSpecification, newSpecification);
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
	public void setSpecification(LinkSpecification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - P2pnetworkPackage.SUBGRAPH_LINK__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - P2pnetworkPackage.SUBGRAPH_LINK__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.SUBGRAPH_LINK__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubgraphSpecification> getConnectedSubgraphs() {
		if (connectedSubgraphs == null) {
			connectedSubgraphs = new EObjectResolvingEList<SubgraphSpecification>(SubgraphSpecification.class, this, P2pnetworkPackage.SUBGRAPH_LINK__CONNECTED_SUBGRAPHS);
		}
		return connectedSubgraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case P2pnetworkPackage.SUBGRAPH_LINK__SPECIFICATION:
				return basicSetSpecification(null, msgs);
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
			case P2pnetworkPackage.SUBGRAPH_LINK__SPECIFICATION:
				return getSpecification();
			case P2pnetworkPackage.SUBGRAPH_LINK__CONNECTED_SUBGRAPHS:
				return getConnectedSubgraphs();
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
			case P2pnetworkPackage.SUBGRAPH_LINK__SPECIFICATION:
				setSpecification((LinkSpecification)newValue);
				return;
			case P2pnetworkPackage.SUBGRAPH_LINK__CONNECTED_SUBGRAPHS:
				getConnectedSubgraphs().clear();
				getConnectedSubgraphs().addAll((Collection<? extends SubgraphSpecification>)newValue);
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
			case P2pnetworkPackage.SUBGRAPH_LINK__SPECIFICATION:
				setSpecification((LinkSpecification)null);
				return;
			case P2pnetworkPackage.SUBGRAPH_LINK__CONNECTED_SUBGRAPHS:
				getConnectedSubgraphs().clear();
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
			case P2pnetworkPackage.SUBGRAPH_LINK__SPECIFICATION:
				return specification != null;
			case P2pnetworkPackage.SUBGRAPH_LINK__CONNECTED_SUBGRAPHS:
				return connectedSubgraphs != null && !connectedSubgraphs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubgraphLinkImpl

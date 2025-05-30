/**
 */
package bscm.p2pnetwork.impl;

import bscm.p2pnetwork.Link;
import bscm.p2pnetwork.LinkSpecification;
import bscm.p2pnetwork.Node;
import bscm.p2pnetwork.P2pnetworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.impl.LinkImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link bscm.p2pnetwork.impl.LinkImpl#getFromNode <em>From Node</em>}</li>
 *   <li>{@link bscm.p2pnetwork.impl.LinkImpl#getToNode <em>To Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends EntityImpl implements Link {
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
	 * The cached value of the '{@link #getFromNode() <em>From Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNode()
	 * @generated
	 * @ordered
	 */
	protected Node fromNode;

	/**
	 * The cached value of the '{@link #getToNode() <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNode()
	 * @generated
	 * @ordered
	 */
	protected Node toNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2pnetworkPackage.Literals.LINK;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.LINK__SPECIFICATION, oldSpecification, newSpecification);
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
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - P2pnetworkPackage.LINK__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - P2pnetworkPackage.LINK__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.LINK__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getFromNode() {
		if (fromNode != null && fromNode.eIsProxy()) {
			InternalEObject oldFromNode = (InternalEObject)fromNode;
			fromNode = (Node)eResolveProxy(oldFromNode);
			if (fromNode != oldFromNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, P2pnetworkPackage.LINK__FROM_NODE, oldFromNode, fromNode));
			}
		}
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFromNode() {
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromNode(Node newFromNode) {
		Node oldFromNode = fromNode;
		fromNode = newFromNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.LINK__FROM_NODE, oldFromNode, fromNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getToNode() {
		if (toNode != null && toNode.eIsProxy()) {
			InternalEObject oldToNode = (InternalEObject)toNode;
			toNode = (Node)eResolveProxy(oldToNode);
			if (toNode != oldToNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, P2pnetworkPackage.LINK__TO_NODE, oldToNode, toNode));
			}
		}
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetToNode() {
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToNode(Node newToNode) {
		Node oldToNode = toNode;
		toNode = newToNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.LINK__TO_NODE, oldToNode, toNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case P2pnetworkPackage.LINK__SPECIFICATION:
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
			case P2pnetworkPackage.LINK__SPECIFICATION:
				return getSpecification();
			case P2pnetworkPackage.LINK__FROM_NODE:
				if (resolve) return getFromNode();
				return basicGetFromNode();
			case P2pnetworkPackage.LINK__TO_NODE:
				if (resolve) return getToNode();
				return basicGetToNode();
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
			case P2pnetworkPackage.LINK__SPECIFICATION:
				setSpecification((LinkSpecification)newValue);
				return;
			case P2pnetworkPackage.LINK__FROM_NODE:
				setFromNode((Node)newValue);
				return;
			case P2pnetworkPackage.LINK__TO_NODE:
				setToNode((Node)newValue);
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
			case P2pnetworkPackage.LINK__SPECIFICATION:
				setSpecification((LinkSpecification)null);
				return;
			case P2pnetworkPackage.LINK__FROM_NODE:
				setFromNode((Node)null);
				return;
			case P2pnetworkPackage.LINK__TO_NODE:
				setToNode((Node)null);
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
			case P2pnetworkPackage.LINK__SPECIFICATION:
				return specification != null;
			case P2pnetworkPackage.LINK__FROM_NODE:
				return fromNode != null;
			case P2pnetworkPackage.LINK__TO_NODE:
				return toNode != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl

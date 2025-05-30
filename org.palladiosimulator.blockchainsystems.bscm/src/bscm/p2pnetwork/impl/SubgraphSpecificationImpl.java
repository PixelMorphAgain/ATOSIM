/**
 */
package bscm.p2pnetwork.impl;

import bscm.p2pnetwork.LinkSpecification;
import bscm.p2pnetwork.P2pnetworkPackage;
import bscm.p2pnetwork.SubgraphNodeTemplate;
import bscm.p2pnetwork.SubgraphSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subgraph Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.impl.SubgraphSpecificationImpl#getNodeTemplates <em>Node Templates</em>}</li>
 *   <li>{@link bscm.p2pnetwork.impl.SubgraphSpecificationImpl#getLinkSpecification <em>Link Specification</em>}</li>
 *   <li>{@link bscm.p2pnetwork.impl.SubgraphSpecificationImpl#getConnectivity <em>Connectivity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubgraphSpecificationImpl extends EntityImpl implements SubgraphSpecification {
	/**
	 * The cached value of the '{@link #getNodeTemplates() <em>Node Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<SubgraphNodeTemplate> nodeTemplates;

	/**
	 * The cached value of the '{@link #getLinkSpecification() <em>Link Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkSpecification()
	 * @generated
	 * @ordered
	 */
	protected LinkSpecification linkSpecification;

	/**
	 * The default value of the '{@link #getConnectivity() <em>Connectivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivity()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTIVITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnectivity() <em>Connectivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivity()
	 * @generated
	 * @ordered
	 */
	protected int connectivity = CONNECTIVITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubgraphSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2pnetworkPackage.Literals.SUBGRAPH_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubgraphNodeTemplate> getNodeTemplates() {
		if (nodeTemplates == null) {
			nodeTemplates = new EObjectContainmentEList<SubgraphNodeTemplate>(SubgraphNodeTemplate.class, this, P2pnetworkPackage.SUBGRAPH_SPECIFICATION__NODE_TEMPLATES);
		}
		return nodeTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkSpecification getLinkSpecification() {
		return linkSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkSpecification(LinkSpecification newLinkSpecification, NotificationChain msgs) {
		LinkSpecification oldLinkSpecification = linkSpecification;
		linkSpecification = newLinkSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION, oldLinkSpecification, newLinkSpecification);
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
	public void setLinkSpecification(LinkSpecification newLinkSpecification) {
		if (newLinkSpecification != linkSpecification) {
			NotificationChain msgs = null;
			if (linkSpecification != null)
				msgs = ((InternalEObject)linkSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - P2pnetworkPackage.SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION, null, msgs);
			if (newLinkSpecification != null)
				msgs = ((InternalEObject)newLinkSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - P2pnetworkPackage.SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION, null, msgs);
			msgs = basicSetLinkSpecification(newLinkSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION, newLinkSpecification, newLinkSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConnectivity() {
		return connectivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectivity(int newConnectivity) {
		int oldConnectivity = connectivity;
		connectivity = newConnectivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2pnetworkPackage.SUBGRAPH_SPECIFICATION__CONNECTIVITY, oldConnectivity, connectivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__NODE_TEMPLATES:
				return ((InternalEList<?>)getNodeTemplates()).basicRemove(otherEnd, msgs);
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION:
				return basicSetLinkSpecification(null, msgs);
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
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__NODE_TEMPLATES:
				return getNodeTemplates();
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION:
				return getLinkSpecification();
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__CONNECTIVITY:
				return getConnectivity();
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
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__NODE_TEMPLATES:
				getNodeTemplates().clear();
				getNodeTemplates().addAll((Collection<? extends SubgraphNodeTemplate>)newValue);
				return;
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION:
				setLinkSpecification((LinkSpecification)newValue);
				return;
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__CONNECTIVITY:
				setConnectivity((Integer)newValue);
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
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__NODE_TEMPLATES:
				getNodeTemplates().clear();
				return;
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION:
				setLinkSpecification((LinkSpecification)null);
				return;
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__CONNECTIVITY:
				setConnectivity(CONNECTIVITY_EDEFAULT);
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
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__NODE_TEMPLATES:
				return nodeTemplates != null && !nodeTemplates.isEmpty();
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION:
				return linkSpecification != null;
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION__CONNECTIVITY:
				return connectivity != CONNECTIVITY_EDEFAULT;
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
		result.append(" (Connectivity: ");
		result.append(connectivity);
		result.append(')');
		return result.toString();
	}

} //SubgraphSpecificationImpl

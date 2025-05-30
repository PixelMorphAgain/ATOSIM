/**
 */
package pcm.core.composition.impl;

import org.eclipse.emf.ecore.EClass;

import pcm.core.composition.CompositionPackage;
import pcm.core.composition.DelegationConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DelegationConnectorImpl extends ConnectorImpl implements DelegationConnector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.DELEGATION_CONNECTOR;
	}

} //DelegationConnectorImpl

/**
 */
package pcm.core.composition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.composition.AssemblyContext;
import pcm.core.composition.CompositionPackage;
import pcm.core.composition.RequiredDelegationConnector;

import pcm.repository.OperationRequiredRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.composition.impl.RequiredDelegationConnectorImpl#getInnerRequiredRole_RequiredDelegationConnector <em>Inner Required Role Required Delegation Connector</em>}</li>
 *   <li>{@link pcm.core.composition.impl.RequiredDelegationConnectorImpl#getOuterRequiredRole_RequiredDelegationConnector <em>Outer Required Role Required Delegation Connector</em>}</li>
 *   <li>{@link pcm.core.composition.impl.RequiredDelegationConnectorImpl#getAssemblyContext_RequiredDelegationConnector <em>Assembly Context Required Delegation Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredDelegationConnectorImpl extends DelegationConnectorImpl implements RequiredDelegationConnector {
	/**
	 * The cached value of the '{@link #getInnerRequiredRole_RequiredDelegationConnector() <em>Inner Required Role Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerRequiredRole_RequiredDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected OperationRequiredRole innerRequiredRole_RequiredDelegationConnector;

	/**
	 * The cached value of the '{@link #getOuterRequiredRole_RequiredDelegationConnector() <em>Outer Required Role Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterRequiredRole_RequiredDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected OperationRequiredRole outerRequiredRole_RequiredDelegationConnector;

	/**
	 * The cached value of the '{@link #getAssemblyContext_RequiredDelegationConnector() <em>Assembly Context Required Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext_RequiredDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblyContext_RequiredDelegationConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredDelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.REQUIRED_DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationRequiredRole getInnerRequiredRole_RequiredDelegationConnector() {
		if (innerRequiredRole_RequiredDelegationConnector != null && innerRequiredRole_RequiredDelegationConnector.eIsProxy()) {
			InternalEObject oldInnerRequiredRole_RequiredDelegationConnector = (InternalEObject)innerRequiredRole_RequiredDelegationConnector;
			innerRequiredRole_RequiredDelegationConnector = (OperationRequiredRole)eResolveProxy(oldInnerRequiredRole_RequiredDelegationConnector);
			if (innerRequiredRole_RequiredDelegationConnector != oldInnerRequiredRole_RequiredDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR, oldInnerRequiredRole_RequiredDelegationConnector, innerRequiredRole_RequiredDelegationConnector));
			}
		}
		return innerRequiredRole_RequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRequiredRole basicGetInnerRequiredRole_RequiredDelegationConnector() {
		return innerRequiredRole_RequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInnerRequiredRole_RequiredDelegationConnector(OperationRequiredRole newInnerRequiredRole_RequiredDelegationConnector) {
		OperationRequiredRole oldInnerRequiredRole_RequiredDelegationConnector = innerRequiredRole_RequiredDelegationConnector;
		innerRequiredRole_RequiredDelegationConnector = newInnerRequiredRole_RequiredDelegationConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR, oldInnerRequiredRole_RequiredDelegationConnector, innerRequiredRole_RequiredDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationRequiredRole getOuterRequiredRole_RequiredDelegationConnector() {
		if (outerRequiredRole_RequiredDelegationConnector != null && outerRequiredRole_RequiredDelegationConnector.eIsProxy()) {
			InternalEObject oldOuterRequiredRole_RequiredDelegationConnector = (InternalEObject)outerRequiredRole_RequiredDelegationConnector;
			outerRequiredRole_RequiredDelegationConnector = (OperationRequiredRole)eResolveProxy(oldOuterRequiredRole_RequiredDelegationConnector);
			if (outerRequiredRole_RequiredDelegationConnector != oldOuterRequiredRole_RequiredDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR, oldOuterRequiredRole_RequiredDelegationConnector, outerRequiredRole_RequiredDelegationConnector));
			}
		}
		return outerRequiredRole_RequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRequiredRole basicGetOuterRequiredRole_RequiredDelegationConnector() {
		return outerRequiredRole_RequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOuterRequiredRole_RequiredDelegationConnector(OperationRequiredRole newOuterRequiredRole_RequiredDelegationConnector) {
		OperationRequiredRole oldOuterRequiredRole_RequiredDelegationConnector = outerRequiredRole_RequiredDelegationConnector;
		outerRequiredRole_RequiredDelegationConnector = newOuterRequiredRole_RequiredDelegationConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR, oldOuterRequiredRole_RequiredDelegationConnector, outerRequiredRole_RequiredDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getAssemblyContext_RequiredDelegationConnector() {
		if (assemblyContext_RequiredDelegationConnector != null && assemblyContext_RequiredDelegationConnector.eIsProxy()) {
			InternalEObject oldAssemblyContext_RequiredDelegationConnector = (InternalEObject)assemblyContext_RequiredDelegationConnector;
			assemblyContext_RequiredDelegationConnector = (AssemblyContext)eResolveProxy(oldAssemblyContext_RequiredDelegationConnector);
			if (assemblyContext_RequiredDelegationConnector != oldAssemblyContext_RequiredDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_DELEGATION_CONNECTOR, oldAssemblyContext_RequiredDelegationConnector, assemblyContext_RequiredDelegationConnector));
			}
		}
		return assemblyContext_RequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext_RequiredDelegationConnector() {
		return assemblyContext_RequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssemblyContext_RequiredDelegationConnector(AssemblyContext newAssemblyContext_RequiredDelegationConnector) {
		AssemblyContext oldAssemblyContext_RequiredDelegationConnector = assemblyContext_RequiredDelegationConnector;
		assemblyContext_RequiredDelegationConnector = newAssemblyContext_RequiredDelegationConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_DELEGATION_CONNECTOR, oldAssemblyContext_RequiredDelegationConnector, assemblyContext_RequiredDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR:
				if (resolve) return getInnerRequiredRole_RequiredDelegationConnector();
				return basicGetInnerRequiredRole_RequiredDelegationConnector();
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR:
				if (resolve) return getOuterRequiredRole_RequiredDelegationConnector();
				return basicGetOuterRequiredRole_RequiredDelegationConnector();
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_DELEGATION_CONNECTOR:
				if (resolve) return getAssemblyContext_RequiredDelegationConnector();
				return basicGetAssemblyContext_RequiredDelegationConnector();
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
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR:
				setInnerRequiredRole_RequiredDelegationConnector((OperationRequiredRole)newValue);
				return;
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR:
				setOuterRequiredRole_RequiredDelegationConnector((OperationRequiredRole)newValue);
				return;
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_DELEGATION_CONNECTOR:
				setAssemblyContext_RequiredDelegationConnector((AssemblyContext)newValue);
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
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR:
				setInnerRequiredRole_RequiredDelegationConnector((OperationRequiredRole)null);
				return;
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR:
				setOuterRequiredRole_RequiredDelegationConnector((OperationRequiredRole)null);
				return;
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_DELEGATION_CONNECTOR:
				setAssemblyContext_RequiredDelegationConnector((AssemblyContext)null);
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
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR:
				return innerRequiredRole_RequiredDelegationConnector != null;
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR:
				return outerRequiredRole_RequiredDelegationConnector != null;
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_DELEGATION_CONNECTOR:
				return assemblyContext_RequiredDelegationConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredDelegationConnectorImpl

/**
 */
package pcm.core.composition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.composition.AssemblyContext;
import pcm.core.composition.CompositionPackage;
import pcm.core.composition.ProvidedDelegationConnector;

import pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.composition.impl.ProvidedDelegationConnectorImpl#getInnerProvidedRole_ProvidedDelegationConnector <em>Inner Provided Role Provided Delegation Connector</em>}</li>
 *   <li>{@link pcm.core.composition.impl.ProvidedDelegationConnectorImpl#getOuterProvidedRole_ProvidedDelegationConnector <em>Outer Provided Role Provided Delegation Connector</em>}</li>
 *   <li>{@link pcm.core.composition.impl.ProvidedDelegationConnectorImpl#getAssemblyContext_ProvidedDelegationConnector <em>Assembly Context Provided Delegation Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedDelegationConnectorImpl extends DelegationConnectorImpl implements ProvidedDelegationConnector {
	/**
	 * The cached value of the '{@link #getInnerProvidedRole_ProvidedDelegationConnector() <em>Inner Provided Role Provided Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerProvidedRole_ProvidedDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected OperationProvidedRole innerProvidedRole_ProvidedDelegationConnector;

	/**
	 * The cached value of the '{@link #getOuterProvidedRole_ProvidedDelegationConnector() <em>Outer Provided Role Provided Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterProvidedRole_ProvidedDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected OperationProvidedRole outerProvidedRole_ProvidedDelegationConnector;

	/**
	 * The cached value of the '{@link #getAssemblyContext_ProvidedDelegationConnector() <em>Assembly Context Provided Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext_ProvidedDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblyContext_ProvidedDelegationConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedDelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.PROVIDED_DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationProvidedRole getInnerProvidedRole_ProvidedDelegationConnector() {
		if (innerProvidedRole_ProvidedDelegationConnector != null && innerProvidedRole_ProvidedDelegationConnector.eIsProxy()) {
			InternalEObject oldInnerProvidedRole_ProvidedDelegationConnector = (InternalEObject)innerProvidedRole_ProvidedDelegationConnector;
			innerProvidedRole_ProvidedDelegationConnector = (OperationProvidedRole)eResolveProxy(oldInnerProvidedRole_ProvidedDelegationConnector);
			if (innerProvidedRole_ProvidedDelegationConnector != oldInnerProvidedRole_ProvidedDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR, oldInnerProvidedRole_ProvidedDelegationConnector, innerProvidedRole_ProvidedDelegationConnector));
			}
		}
		return innerProvidedRole_ProvidedDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole basicGetInnerProvidedRole_ProvidedDelegationConnector() {
		return innerProvidedRole_ProvidedDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInnerProvidedRole_ProvidedDelegationConnector(OperationProvidedRole newInnerProvidedRole_ProvidedDelegationConnector) {
		OperationProvidedRole oldInnerProvidedRole_ProvidedDelegationConnector = innerProvidedRole_ProvidedDelegationConnector;
		innerProvidedRole_ProvidedDelegationConnector = newInnerProvidedRole_ProvidedDelegationConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR, oldInnerProvidedRole_ProvidedDelegationConnector, innerProvidedRole_ProvidedDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationProvidedRole getOuterProvidedRole_ProvidedDelegationConnector() {
		if (outerProvidedRole_ProvidedDelegationConnector != null && outerProvidedRole_ProvidedDelegationConnector.eIsProxy()) {
			InternalEObject oldOuterProvidedRole_ProvidedDelegationConnector = (InternalEObject)outerProvidedRole_ProvidedDelegationConnector;
			outerProvidedRole_ProvidedDelegationConnector = (OperationProvidedRole)eResolveProxy(oldOuterProvidedRole_ProvidedDelegationConnector);
			if (outerProvidedRole_ProvidedDelegationConnector != oldOuterProvidedRole_ProvidedDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR, oldOuterProvidedRole_ProvidedDelegationConnector, outerProvidedRole_ProvidedDelegationConnector));
			}
		}
		return outerProvidedRole_ProvidedDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole basicGetOuterProvidedRole_ProvidedDelegationConnector() {
		return outerProvidedRole_ProvidedDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOuterProvidedRole_ProvidedDelegationConnector(OperationProvidedRole newOuterProvidedRole_ProvidedDelegationConnector) {
		OperationProvidedRole oldOuterProvidedRole_ProvidedDelegationConnector = outerProvidedRole_ProvidedDelegationConnector;
		outerProvidedRole_ProvidedDelegationConnector = newOuterProvidedRole_ProvidedDelegationConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR, oldOuterProvidedRole_ProvidedDelegationConnector, outerProvidedRole_ProvidedDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getAssemblyContext_ProvidedDelegationConnector() {
		if (assemblyContext_ProvidedDelegationConnector != null && assemblyContext_ProvidedDelegationConnector.eIsProxy()) {
			InternalEObject oldAssemblyContext_ProvidedDelegationConnector = (InternalEObject)assemblyContext_ProvidedDelegationConnector;
			assemblyContext_ProvidedDelegationConnector = (AssemblyContext)eResolveProxy(oldAssemblyContext_ProvidedDelegationConnector);
			if (assemblyContext_ProvidedDelegationConnector != oldAssemblyContext_ProvidedDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR, oldAssemblyContext_ProvidedDelegationConnector, assemblyContext_ProvidedDelegationConnector));
			}
		}
		return assemblyContext_ProvidedDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext_ProvidedDelegationConnector() {
		return assemblyContext_ProvidedDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssemblyContext_ProvidedDelegationConnector(AssemblyContext newAssemblyContext_ProvidedDelegationConnector) {
		AssemblyContext oldAssemblyContext_ProvidedDelegationConnector = assemblyContext_ProvidedDelegationConnector;
		assemblyContext_ProvidedDelegationConnector = newAssemblyContext_ProvidedDelegationConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR, oldAssemblyContext_ProvidedDelegationConnector, assemblyContext_ProvidedDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
				if (resolve) return getInnerProvidedRole_ProvidedDelegationConnector();
				return basicGetInnerProvidedRole_ProvidedDelegationConnector();
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
				if (resolve) return getOuterProvidedRole_ProvidedDelegationConnector();
				return basicGetOuterProvidedRole_ProvidedDelegationConnector();
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR:
				if (resolve) return getAssemblyContext_ProvidedDelegationConnector();
				return basicGetAssemblyContext_ProvidedDelegationConnector();
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
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
				setInnerProvidedRole_ProvidedDelegationConnector((OperationProvidedRole)newValue);
				return;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
				setOuterProvidedRole_ProvidedDelegationConnector((OperationProvidedRole)newValue);
				return;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR:
				setAssemblyContext_ProvidedDelegationConnector((AssemblyContext)newValue);
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
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
				setInnerProvidedRole_ProvidedDelegationConnector((OperationProvidedRole)null);
				return;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
				setOuterProvidedRole_ProvidedDelegationConnector((OperationProvidedRole)null);
				return;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR:
				setAssemblyContext_ProvidedDelegationConnector((AssemblyContext)null);
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
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
				return innerProvidedRole_ProvidedDelegationConnector != null;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR:
				return outerProvidedRole_ProvidedDelegationConnector != null;
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR:
				return assemblyContext_ProvidedDelegationConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedDelegationConnectorImpl

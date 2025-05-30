/**
 */
package pcm.core.composition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.composition.AssemblyConnector;
import pcm.core.composition.AssemblyContext;
import pcm.core.composition.CompositionPackage;

import pcm.repository.OperationProvidedRole;
import pcm.repository.OperationRequiredRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.composition.impl.AssemblyConnectorImpl#getRequiringAssemblyContext_AssemblyConnector <em>Requiring Assembly Context Assembly Connector</em>}</li>
 *   <li>{@link pcm.core.composition.impl.AssemblyConnectorImpl#getProvidingAssemblyContext_AssemblyConnector <em>Providing Assembly Context Assembly Connector</em>}</li>
 *   <li>{@link pcm.core.composition.impl.AssemblyConnectorImpl#getProvidedRole_AssemblyConnector <em>Provided Role Assembly Connector</em>}</li>
 *   <li>{@link pcm.core.composition.impl.AssemblyConnectorImpl#getRequiredRole_AssemblyConnector <em>Required Role Assembly Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorImpl extends ConnectorImpl implements AssemblyConnector {
	/**
	 * The cached value of the '{@link #getRequiringAssemblyContext_AssemblyConnector() <em>Requiring Assembly Context Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringAssemblyContext_AssemblyConnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext requiringAssemblyContext_AssemblyConnector;

	/**
	 * The cached value of the '{@link #getProvidingAssemblyContext_AssemblyConnector() <em>Providing Assembly Context Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidingAssemblyContext_AssemblyConnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext providingAssemblyContext_AssemblyConnector;

	/**
	 * The cached value of the '{@link #getProvidedRole_AssemblyConnector() <em>Provided Role Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole_AssemblyConnector()
	 * @generated
	 * @ordered
	 */
	protected OperationProvidedRole providedRole_AssemblyConnector;

	/**
	 * The cached value of the '{@link #getRequiredRole_AssemblyConnector() <em>Required Role Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole_AssemblyConnector()
	 * @generated
	 * @ordered
	 */
	protected OperationRequiredRole requiredRole_AssemblyConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.ASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getRequiringAssemblyContext_AssemblyConnector() {
		if (requiringAssemblyContext_AssemblyConnector != null && requiringAssemblyContext_AssemblyConnector.eIsProxy()) {
			InternalEObject oldRequiringAssemblyContext_AssemblyConnector = (InternalEObject)requiringAssemblyContext_AssemblyConnector;
			requiringAssemblyContext_AssemblyConnector = (AssemblyContext)eResolveProxy(oldRequiringAssemblyContext_AssemblyConnector);
			if (requiringAssemblyContext_AssemblyConnector != oldRequiringAssemblyContext_AssemblyConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR, oldRequiringAssemblyContext_AssemblyConnector, requiringAssemblyContext_AssemblyConnector));
			}
		}
		return requiringAssemblyContext_AssemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetRequiringAssemblyContext_AssemblyConnector() {
		return requiringAssemblyContext_AssemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiringAssemblyContext_AssemblyConnector(AssemblyContext newRequiringAssemblyContext_AssemblyConnector) {
		AssemblyContext oldRequiringAssemblyContext_AssemblyConnector = requiringAssemblyContext_AssemblyConnector;
		requiringAssemblyContext_AssemblyConnector = newRequiringAssemblyContext_AssemblyConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR, oldRequiringAssemblyContext_AssemblyConnector, requiringAssemblyContext_AssemblyConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssemblyContext getProvidingAssemblyContext_AssemblyConnector() {
		if (providingAssemblyContext_AssemblyConnector != null && providingAssemblyContext_AssemblyConnector.eIsProxy()) {
			InternalEObject oldProvidingAssemblyContext_AssemblyConnector = (InternalEObject)providingAssemblyContext_AssemblyConnector;
			providingAssemblyContext_AssemblyConnector = (AssemblyContext)eResolveProxy(oldProvidingAssemblyContext_AssemblyConnector);
			if (providingAssemblyContext_AssemblyConnector != oldProvidingAssemblyContext_AssemblyConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR, oldProvidingAssemblyContext_AssemblyConnector, providingAssemblyContext_AssemblyConnector));
			}
		}
		return providingAssemblyContext_AssemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetProvidingAssemblyContext_AssemblyConnector() {
		return providingAssemblyContext_AssemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidingAssemblyContext_AssemblyConnector(AssemblyContext newProvidingAssemblyContext_AssemblyConnector) {
		AssemblyContext oldProvidingAssemblyContext_AssemblyConnector = providingAssemblyContext_AssemblyConnector;
		providingAssemblyContext_AssemblyConnector = newProvidingAssemblyContext_AssemblyConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR, oldProvidingAssemblyContext_AssemblyConnector, providingAssemblyContext_AssemblyConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationProvidedRole getProvidedRole_AssemblyConnector() {
		if (providedRole_AssemblyConnector != null && providedRole_AssemblyConnector.eIsProxy()) {
			InternalEObject oldProvidedRole_AssemblyConnector = (InternalEObject)providedRole_AssemblyConnector;
			providedRole_AssemblyConnector = (OperationProvidedRole)eResolveProxy(oldProvidedRole_AssemblyConnector);
			if (providedRole_AssemblyConnector != oldProvidedRole_AssemblyConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_CONNECTOR, oldProvidedRole_AssemblyConnector, providedRole_AssemblyConnector));
			}
		}
		return providedRole_AssemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole basicGetProvidedRole_AssemblyConnector() {
		return providedRole_AssemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidedRole_AssemblyConnector(OperationProvidedRole newProvidedRole_AssemblyConnector) {
		OperationProvidedRole oldProvidedRole_AssemblyConnector = providedRole_AssemblyConnector;
		providedRole_AssemblyConnector = newProvidedRole_AssemblyConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_CONNECTOR, oldProvidedRole_AssemblyConnector, providedRole_AssemblyConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationRequiredRole getRequiredRole_AssemblyConnector() {
		if (requiredRole_AssemblyConnector != null && requiredRole_AssemblyConnector.eIsProxy()) {
			InternalEObject oldRequiredRole_AssemblyConnector = (InternalEObject)requiredRole_AssemblyConnector;
			requiredRole_AssemblyConnector = (OperationRequiredRole)eResolveProxy(oldRequiredRole_AssemblyConnector);
			if (requiredRole_AssemblyConnector != oldRequiredRole_AssemblyConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_CONNECTOR, oldRequiredRole_AssemblyConnector, requiredRole_AssemblyConnector));
			}
		}
		return requiredRole_AssemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRequiredRole basicGetRequiredRole_AssemblyConnector() {
		return requiredRole_AssemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredRole_AssemblyConnector(OperationRequiredRole newRequiredRole_AssemblyConnector) {
		OperationRequiredRole oldRequiredRole_AssemblyConnector = requiredRole_AssemblyConnector;
		requiredRole_AssemblyConnector = newRequiredRole_AssemblyConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_CONNECTOR, oldRequiredRole_AssemblyConnector, requiredRole_AssemblyConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR:
				if (resolve) return getRequiringAssemblyContext_AssemblyConnector();
				return basicGetRequiringAssemblyContext_AssemblyConnector();
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR:
				if (resolve) return getProvidingAssemblyContext_AssemblyConnector();
				return basicGetProvidingAssemblyContext_AssemblyConnector();
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_CONNECTOR:
				if (resolve) return getProvidedRole_AssemblyConnector();
				return basicGetProvidedRole_AssemblyConnector();
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_CONNECTOR:
				if (resolve) return getRequiredRole_AssemblyConnector();
				return basicGetRequiredRole_AssemblyConnector();
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
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR:
				setRequiringAssemblyContext_AssemblyConnector((AssemblyContext)newValue);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR:
				setProvidingAssemblyContext_AssemblyConnector((AssemblyContext)newValue);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_CONNECTOR:
				setProvidedRole_AssemblyConnector((OperationProvidedRole)newValue);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_CONNECTOR:
				setRequiredRole_AssemblyConnector((OperationRequiredRole)newValue);
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
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR:
				setRequiringAssemblyContext_AssemblyConnector((AssemblyContext)null);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR:
				setProvidingAssemblyContext_AssemblyConnector((AssemblyContext)null);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_CONNECTOR:
				setProvidedRole_AssemblyConnector((OperationProvidedRole)null);
				return;
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_CONNECTOR:
				setRequiredRole_AssemblyConnector((OperationRequiredRole)null);
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
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR:
				return requiringAssemblyContext_AssemblyConnector != null;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR:
				return providingAssemblyContext_AssemblyConnector != null;
			case CompositionPackage.ASSEMBLY_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_CONNECTOR:
				return providedRole_AssemblyConnector != null;
			case CompositionPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_CONNECTOR:
				return requiredRole_AssemblyConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorImpl

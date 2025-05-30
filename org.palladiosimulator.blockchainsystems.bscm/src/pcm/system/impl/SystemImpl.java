/**
 */
package pcm.system.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.core.composition.AssemblyContext;
import pcm.core.composition.ComposedStructure;
import pcm.core.composition.CompositionPackage;
import pcm.core.composition.Connector;
import pcm.core.composition.EventChannel;
import pcm.core.composition.ResourceRequiredDelegationConnector;

import pcm.core.entity.ComposedProvidingRequiringEntity;
import pcm.core.entity.EntityPackage;
import pcm.core.entity.InterfaceProvidingEntity;
import pcm.core.entity.InterfaceProvidingRequiringEntity;
import pcm.core.entity.InterfaceRequiringEntity;
import pcm.core.entity.ResourceInterfaceRequiringEntity;
import pcm.core.entity.ResourceRequiredRole;

import pcm.core.entity.impl.EntityImpl;

import pcm.qosannotations.QoSAnnotations;
import pcm.qosannotations.QosannotationsPackage;

import pcm.repository.ProvidedRole;
import pcm.repository.RepositoryPackage;
import pcm.repository.RequiredRole;

import pcm.system.SystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.system.impl.SystemImpl#getAssemblyContexts__ComposedStructure <em>Assembly Contexts Composed Structure</em>}</li>
 *   <li>{@link pcm.system.impl.SystemImpl#getResourceRequiredDelegationConnectors_ComposedStructure <em>Resource Required Delegation Connectors Composed Structure</em>}</li>
 *   <li>{@link pcm.system.impl.SystemImpl#getEventChannel__ComposedStructure <em>Event Channel Composed Structure</em>}</li>
 *   <li>{@link pcm.system.impl.SystemImpl#getConnectors__ComposedStructure <em>Connectors Composed Structure</em>}</li>
 *   <li>{@link pcm.system.impl.SystemImpl#getProvidedRoles_InterfaceProvidingEntity <em>Provided Roles Interface Providing Entity</em>}</li>
 *   <li>{@link pcm.system.impl.SystemImpl#getResourceRequiredRoles__ResourceInterfaceRequiringEntity <em>Resource Required Roles Resource Interface Requiring Entity</em>}</li>
 *   <li>{@link pcm.system.impl.SystemImpl#getRequiredRoles_InterfaceRequiringEntity <em>Required Roles Interface Requiring Entity</em>}</li>
 *   <li>{@link pcm.system.impl.SystemImpl#getQosAnnotations_System <em>Qos Annotations System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends EntityImpl implements pcm.system.System {
	/**
	 * The cached value of the '{@link #getAssemblyContexts__ComposedStructure() <em>Assembly Contexts Composed Structure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContexts__ComposedStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<AssemblyContext> assemblyContexts__ComposedStructure;

	/**
	 * The cached value of the '{@link #getResourceRequiredDelegationConnectors_ComposedStructure() <em>Resource Required Delegation Connectors Composed Structure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRequiredDelegationConnectors_ComposedStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRequiredDelegationConnector> resourceRequiredDelegationConnectors_ComposedStructure;

	/**
	 * The cached value of the '{@link #getEventChannel__ComposedStructure() <em>Event Channel Composed Structure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventChannel__ComposedStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChannel> eventChannel__ComposedStructure;

	/**
	 * The cached value of the '{@link #getConnectors__ComposedStructure() <em>Connectors Composed Structure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors__ComposedStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors__ComposedStructure;

	/**
	 * The cached value of the '{@link #getProvidedRoles_InterfaceProvidingEntity() <em>Provided Roles Interface Providing Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRoles_InterfaceProvidingEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedRole> providedRoles_InterfaceProvidingEntity;

	/**
	 * The cached value of the '{@link #getResourceRequiredRoles__ResourceInterfaceRequiringEntity() <em>Resource Required Roles Resource Interface Requiring Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRequiredRoles__ResourceInterfaceRequiringEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRequiredRole> resourceRequiredRoles__ResourceInterfaceRequiringEntity;

	/**
	 * The cached value of the '{@link #getRequiredRoles_InterfaceRequiringEntity() <em>Required Roles Interface Requiring Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoles_InterfaceRequiringEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredRole> requiredRoles_InterfaceRequiringEntity;

	/**
	 * The cached value of the '{@link #getQosAnnotations_System() <em>Qos Annotations System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQosAnnotations_System()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSAnnotations> qosAnnotations_System;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssemblyContext> getAssemblyContexts__ComposedStructure() {
		if (assemblyContexts__ComposedStructure == null) {
			assemblyContexts__ComposedStructure = new EObjectContainmentWithInverseEList<AssemblyContext>(AssemblyContext.class, this, SystemPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE, CompositionPackage.ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT);
		}
		return assemblyContexts__ComposedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceRequiredDelegationConnector> getResourceRequiredDelegationConnectors_ComposedStructure() {
		if (resourceRequiredDelegationConnectors_ComposedStructure == null) {
			resourceRequiredDelegationConnectors_ComposedStructure = new EObjectContainmentWithInverseEList<ResourceRequiredDelegationConnector>(ResourceRequiredDelegationConnector.class, this, SystemPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE, CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR);
		}
		return resourceRequiredDelegationConnectors_ComposedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventChannel> getEventChannel__ComposedStructure() {
		if (eventChannel__ComposedStructure == null) {
			eventChannel__ComposedStructure = new EObjectContainmentWithInverseEList<EventChannel>(EventChannel.class, this, SystemPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE, CompositionPackage.EVENT_CHANNEL__PARENT_STRUCTURE_EVENT_CHANNEL);
		}
		return eventChannel__ComposedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectors__ComposedStructure() {
		if (connectors__ComposedStructure == null) {
			connectors__ComposedStructure = new EObjectContainmentWithInverseEList<Connector>(Connector.class, this, SystemPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE, CompositionPackage.CONNECTOR__PARENT_STRUCTURE_CONNECTOR);
		}
		return connectors__ComposedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProvidedRole> getProvidedRoles_InterfaceProvidingEntity() {
		if (providedRoles_InterfaceProvidingEntity == null) {
			providedRoles_InterfaceProvidingEntity = new EObjectContainmentWithInverseEList<ProvidedRole>(ProvidedRole.class, this, SystemPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY, RepositoryPackage.PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE);
		}
		return providedRoles_InterfaceProvidingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceRequiredRole> getResourceRequiredRoles__ResourceInterfaceRequiringEntity() {
		if (resourceRequiredRoles__ResourceInterfaceRequiringEntity == null) {
			resourceRequiredRoles__ResourceInterfaceRequiringEntity = new EObjectContainmentWithInverseEList<ResourceRequiredRole>(ResourceRequiredRole.class, this, SystemPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY, EntityPackage.RESOURCE_REQUIRED_ROLE__RESOURCE_INTERFACE_REQUIRING_ENTITY_RESOURCE_REQUIRED_ROLE);
		}
		return resourceRequiredRoles__ResourceInterfaceRequiringEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequiredRole> getRequiredRoles_InterfaceRequiringEntity() {
		if (requiredRoles_InterfaceRequiringEntity == null) {
			requiredRoles_InterfaceRequiringEntity = new EObjectContainmentWithInverseEList<RequiredRole>(RequiredRole.class, this, SystemPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY, RepositoryPackage.REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE);
		}
		return requiredRoles_InterfaceRequiringEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QoSAnnotations> getQosAnnotations_System() {
		if (qosAnnotations_System == null) {
			qosAnnotations_System = new EObjectContainmentWithInverseEList<QoSAnnotations>(QoSAnnotations.class, this, SystemPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM, QosannotationsPackage.QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS);
		}
		return qosAnnotations_System;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSameSubsystemMustNotBeInstantiatedMoreThanOnce(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		var validationSucceeded = org.palladiosimulator.pcm.core.composition.impl.ComposedStructureValidationUtil.validateSameSubsystemMustNotBeInstantiatedMoreThanOnce(this);
		if (!validationSucceeded && diagnostics != null) {
		    diagnostics.add
		        (new org.eclipse.emf.common.util.BasicDiagnostic
		            (org.eclipse.emf.common.util.Diagnostic.ERROR,
		                org.palladiosimulator.pcm.core.composition.util.CompositionValidator.DIAGNOSTIC_SOURCE,
		                org.palladiosimulator.pcm.core.composition.util.CompositionValidator.COMPOSED_STRUCTURE__VALIDATE_SAME_SUBSYSTEM_MUST_NOT_BE_INSTANTIATED_MORE_THAN_ONCE,
		                org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "sameSubsystemMustNotBeInstantiatedMoreThanOnce", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(this, context) }),
		                new Object [] { this }));
		}
		return validationSucceeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssemblyContexts__ComposedStructure()).basicAdd(otherEnd, msgs);
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceRequiredDelegationConnectors_ComposedStructure()).basicAdd(otherEnd, msgs);
			case SystemPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEventChannel__ComposedStructure()).basicAdd(otherEnd, msgs);
			case SystemPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors__ComposedStructure()).basicAdd(otherEnd, msgs);
			case SystemPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedRoles_InterfaceProvidingEntity()).basicAdd(otherEnd, msgs);
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceRequiredRoles__ResourceInterfaceRequiringEntity()).basicAdd(otherEnd, msgs);
			case SystemPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredRoles_InterfaceRequiringEntity()).basicAdd(otherEnd, msgs);
			case SystemPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQosAnnotations_System()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
				return ((InternalEList<?>)getAssemblyContexts__ComposedStructure()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
				return ((InternalEList<?>)getResourceRequiredDelegationConnectors_ComposedStructure()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
				return ((InternalEList<?>)getEventChannel__ComposedStructure()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
				return ((InternalEList<?>)getConnectors__ComposedStructure()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
				return ((InternalEList<?>)getProvidedRoles_InterfaceProvidingEntity()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
				return ((InternalEList<?>)getResourceRequiredRoles__ResourceInterfaceRequiringEntity()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
				return ((InternalEList<?>)getRequiredRoles_InterfaceRequiringEntity()).basicRemove(otherEnd, msgs);
			case SystemPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
				return ((InternalEList<?>)getQosAnnotations_System()).basicRemove(otherEnd, msgs);
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
			case SystemPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
				return getAssemblyContexts__ComposedStructure();
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
				return getResourceRequiredDelegationConnectors_ComposedStructure();
			case SystemPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
				return getEventChannel__ComposedStructure();
			case SystemPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
				return getConnectors__ComposedStructure();
			case SystemPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
				return getProvidedRoles_InterfaceProvidingEntity();
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
				return getResourceRequiredRoles__ResourceInterfaceRequiringEntity();
			case SystemPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
				return getRequiredRoles_InterfaceRequiringEntity();
			case SystemPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
				return getQosAnnotations_System();
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
			case SystemPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
				getAssemblyContexts__ComposedStructure().clear();
				getAssemblyContexts__ComposedStructure().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
				getResourceRequiredDelegationConnectors_ComposedStructure().clear();
				getResourceRequiredDelegationConnectors_ComposedStructure().addAll((Collection<? extends ResourceRequiredDelegationConnector>)newValue);
				return;
			case SystemPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
				getEventChannel__ComposedStructure().clear();
				getEventChannel__ComposedStructure().addAll((Collection<? extends EventChannel>)newValue);
				return;
			case SystemPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
				getConnectors__ComposedStructure().clear();
				getConnectors__ComposedStructure().addAll((Collection<? extends Connector>)newValue);
				return;
			case SystemPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
				getProvidedRoles_InterfaceProvidingEntity().clear();
				getProvidedRoles_InterfaceProvidingEntity().addAll((Collection<? extends ProvidedRole>)newValue);
				return;
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
				getResourceRequiredRoles__ResourceInterfaceRequiringEntity().clear();
				getResourceRequiredRoles__ResourceInterfaceRequiringEntity().addAll((Collection<? extends ResourceRequiredRole>)newValue);
				return;
			case SystemPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
				getRequiredRoles_InterfaceRequiringEntity().clear();
				getRequiredRoles_InterfaceRequiringEntity().addAll((Collection<? extends RequiredRole>)newValue);
				return;
			case SystemPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
				getQosAnnotations_System().clear();
				getQosAnnotations_System().addAll((Collection<? extends QoSAnnotations>)newValue);
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
			case SystemPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
				getAssemblyContexts__ComposedStructure().clear();
				return;
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
				getResourceRequiredDelegationConnectors_ComposedStructure().clear();
				return;
			case SystemPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
				getEventChannel__ComposedStructure().clear();
				return;
			case SystemPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
				getConnectors__ComposedStructure().clear();
				return;
			case SystemPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
				getProvidedRoles_InterfaceProvidingEntity().clear();
				return;
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
				getResourceRequiredRoles__ResourceInterfaceRequiringEntity().clear();
				return;
			case SystemPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
				getRequiredRoles_InterfaceRequiringEntity().clear();
				return;
			case SystemPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
				getQosAnnotations_System().clear();
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
			case SystemPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE:
				return assemblyContexts__ComposedStructure != null && !assemblyContexts__ComposedStructure.isEmpty();
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE:
				return resourceRequiredDelegationConnectors_ComposedStructure != null && !resourceRequiredDelegationConnectors_ComposedStructure.isEmpty();
			case SystemPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE:
				return eventChannel__ComposedStructure != null && !eventChannel__ComposedStructure.isEmpty();
			case SystemPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE:
				return connectors__ComposedStructure != null && !connectors__ComposedStructure.isEmpty();
			case SystemPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY:
				return providedRoles_InterfaceProvidingEntity != null && !providedRoles_InterfaceProvidingEntity.isEmpty();
			case SystemPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY:
				return resourceRequiredRoles__ResourceInterfaceRequiringEntity != null && !resourceRequiredRoles__ResourceInterfaceRequiringEntity.isEmpty();
			case SystemPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY:
				return requiredRoles_InterfaceRequiringEntity != null && !requiredRoles_InterfaceRequiringEntity.isEmpty();
			case SystemPackage.SYSTEM__QOS_ANNOTATIONS_SYSTEM:
				return qosAnnotations_System != null && !qosAnnotations_System.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ComposedStructure.class) {
			switch (derivedFeatureID) {
				case SystemPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE: return CompositionPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;
				case SystemPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE: return CompositionPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;
				case SystemPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE: return CompositionPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE;
				case SystemPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE: return CompositionPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingEntity.class) {
			switch (derivedFeatureID) {
				case SystemPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY: return EntityPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;
				default: return -1;
			}
		}
		if (baseClass == ResourceInterfaceRequiringEntity.class) {
			switch (derivedFeatureID) {
				case SystemPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY: return EntityPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;
				default: return -1;
			}
		}
		if (baseClass == InterfaceRequiringEntity.class) {
			switch (derivedFeatureID) {
				case SystemPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY: return EntityPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingRequiringEntity.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ComposedProvidingRequiringEntity.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ComposedStructure.class) {
			switch (baseFeatureID) {
				case CompositionPackage.COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE: return SystemPackage.SYSTEM__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE;
				case CompositionPackage.COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE: return SystemPackage.SYSTEM__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE;
				case CompositionPackage.COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE: return SystemPackage.SYSTEM__EVENT_CHANNEL_COMPOSED_STRUCTURE;
				case CompositionPackage.COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE: return SystemPackage.SYSTEM__CONNECTORS_COMPOSED_STRUCTURE;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingEntity.class) {
			switch (baseFeatureID) {
				case EntityPackage.INTERFACE_PROVIDING_ENTITY__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY: return SystemPackage.SYSTEM__PROVIDED_ROLES_INTERFACE_PROVIDING_ENTITY;
				default: return -1;
			}
		}
		if (baseClass == ResourceInterfaceRequiringEntity.class) {
			switch (baseFeatureID) {
				case EntityPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY: return SystemPackage.SYSTEM__RESOURCE_REQUIRED_ROLES_RESOURCE_INTERFACE_REQUIRING_ENTITY;
				default: return -1;
			}
		}
		if (baseClass == InterfaceRequiringEntity.class) {
			switch (baseFeatureID) {
				case EntityPackage.INTERFACE_REQUIRING_ENTITY__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY: return SystemPackage.SYSTEM__REQUIRED_ROLES_INTERFACE_REQUIRING_ENTITY;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingRequiringEntity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ComposedProvidingRequiringEntity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ComposedStructure.class) {
			switch (baseOperationID) {
				case CompositionPackage.COMPOSED_STRUCTURE___VALIDATE_SAME_SUBSYSTEM_MUST_NOT_BE_INSTANTIATED_MORE_THAN_ONCE__DIAGNOSTICCHAIN_MAP: return SystemPackage.SYSTEM___VALIDATE_SAME_SUBSYSTEM_MUST_NOT_BE_INSTANTIATED_MORE_THAN_ONCE__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingEntity.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ResourceInterfaceRequiringEntity.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == InterfaceRequiringEntity.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == InterfaceProvidingRequiringEntity.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ComposedProvidingRequiringEntity.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SystemPackage.SYSTEM___VALIDATE_SAME_SUBSYSTEM_MUST_NOT_BE_INSTANTIATED_MORE_THAN_ONCE__DIAGNOSTICCHAIN_MAP:
				return validateSameSubsystemMustNotBeInstantiatedMoreThanOnce((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemImpl

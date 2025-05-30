/**
 */
package pcm.core.composition.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import pcm.core.composition.CompositionPackage;
import pcm.core.composition.ProvidedInfrastructureDelegationConnector;

/**
 * This is the item provider adapter for a {@link pcm.core.composition.ProvidedInfrastructureDelegationConnector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProvidedInfrastructureDelegationConnectorItemProvider extends DelegationConnectorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInfrastructureDelegationConnectorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInnerProvidedRole__ProvidedInfrastructureDelegationConnectorPropertyDescriptor(object);
			addOuterProvidedRole__ProvidedInfrastructureDelegationConnectorPropertyDescriptor(object);
			addAssemblyContext__ProvidedInfrastructureDelegationConnectorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Inner Provided Role Provided Infrastructure Delegation Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInnerProvidedRole__ProvidedInfrastructureDelegationConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProvidedInfrastructureDelegationConnector_innerProvidedRole__ProvidedInfrastructureDelegationConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProvidedInfrastructureDelegationConnector_innerProvidedRole__ProvidedInfrastructureDelegationConnector_feature", "_UI_ProvidedInfrastructureDelegationConnector_type"),
				 CompositionPackage.Literals.PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outer Provided Role Provided Infrastructure Delegation Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOuterProvidedRole__ProvidedInfrastructureDelegationConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProvidedInfrastructureDelegationConnector_outerProvidedRole__ProvidedInfrastructureDelegationConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProvidedInfrastructureDelegationConnector_outerProvidedRole__ProvidedInfrastructureDelegationConnector_feature", "_UI_ProvidedInfrastructureDelegationConnector_type"),
				 CompositionPackage.Literals.PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assembly Context Provided Infrastructure Delegation Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssemblyContext__ProvidedInfrastructureDelegationConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProvidedInfrastructureDelegationConnector_assemblyContext__ProvidedInfrastructureDelegationConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProvidedInfrastructureDelegationConnector_assemblyContext__ProvidedInfrastructureDelegationConnector_feature", "_UI_ProvidedInfrastructureDelegationConnector_type"),
				 CompositionPackage.Literals.PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ProvidedInfrastructureDelegationConnector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProvidedInfrastructureDelegationConnector"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProvidedInfrastructureDelegationConnector)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ProvidedInfrastructureDelegationConnector_type") :
			getString("_UI_ProvidedInfrastructureDelegationConnector_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}

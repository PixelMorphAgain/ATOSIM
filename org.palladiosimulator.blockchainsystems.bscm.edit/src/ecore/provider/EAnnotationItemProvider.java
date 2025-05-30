/**
 */
package ecore.provider;


import bscm.blockchainsystem.BlockchainsystemFactory;

import bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryFactory;

import bscm.nodeallocation.NodeallocationFactory;

import bscm.nodeenvironment.NodeenvironmentFactory;

import bscm.nodesystem.NodesystemFactory;

import bscm.p2pnetwork.P2pnetworkFactory;

import ecore.EAnnotation;
import ecore.EcoreFactory;
import ecore.EcorePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pcm.PcmFactory;

import pcm.allocation.AllocationFactory;

import pcm.core.CoreFactory;

import pcm.core.composition.CompositionFactory;

import pcm.core.entity.EntityFactory;

import pcm.parameter.ParameterFactory;

import pcm.qosannotations.QosannotationsFactory;

import pcm.qosannotations.qos_performance.Qos_performanceFactory;

import pcm.qosannotations.qos_reliability.Qos_reliabilityFactory;

import pcm.reliability.ReliabilityFactory;

import pcm.repository.RepositoryFactory;

import pcm.resourceenvironment.ResourceenvironmentFactory;

import pcm.resourcetype.ResourcetypeFactory;

import pcm.seff.SeffFactory;

import pcm.seff.seff_performance.Seff_performanceFactory;

import pcm.seff.seff_reliability.Seff_reliabilityFactory;

import pcm.subsystem.SubsystemFactory;

import pcm.system.SystemFactory;

import pcm.usagemodel.UsagemodelFactory;

/**
 * This is the item provider adapter for a {@link ecore.EAnnotation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EAnnotationItemProvider extends EModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotationItemProvider(AdapterFactory adapterFactory) {
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

			addSourcePropertyDescriptor(object);
			addReferencesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAnnotation_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAnnotation_source_feature", "_UI_EAnnotation_type"),
				 EcorePackage.Literals.EANNOTATION__SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the References feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAnnotation_references_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAnnotation_references_feature", "_UI_EAnnotation_type"),
				 EcorePackage.Literals.EANNOTATION__REFERENCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EcorePackage.Literals.EANNOTATION__DETAILS);
			childrenFeatures.add(EcorePackage.Literals.EANNOTATION__CONTENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EAnnotation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EAnnotation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EAnnotation)object).getSource();
		return label == null || label.length() == 0 ?
			getString("_UI_EAnnotation_type") :
			getString("_UI_EAnnotation_type") + " " + label;
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

		switch (notification.getFeatureID(EAnnotation.class)) {
			case EcorePackage.EANNOTATION__SOURCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EcorePackage.EANNOTATION__DETAILS:
			case EcorePackage.EANNOTATION__CONTENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__DETAILS,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 NodeallocationFactory.eINSTANCE.createNodeAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 NodeallocationFactory.eINSTANCE.createNodeAllocationRepository()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 NodeallocationFactory.eINSTANCE.createNodeAllocationContext()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 NodesystemFactory.eINSTANCE.createBlockchainSystemNodeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 NodesystemFactory.eINSTANCE.createBlockchainSystemNodeAssemblyContext()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 NodesystemFactory.eINSTANCE.createNodeBehaviorSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 BlockchainsystemComponentRepositoryFactory.eINSTANCE.createBlockchainSystemNodeComponentRepository()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 BlockchainsystemComponentRepositoryFactory.eINSTANCE.createBlockValidatorComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 BlockchainsystemComponentRepositoryFactory.eINSTANCE.createMiningProcessComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 P2pnetworkFactory.eINSTANCE.createP2PNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 P2pnetworkFactory.eINSTANCE.createExplicitNetworkTopology()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 P2pnetworkFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 P2pnetworkFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 P2pnetworkFactory.eINSTANCE.createLinkSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 P2pnetworkFactory.eINSTANCE.createConnectedSubgraphsNetworkTopology()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 P2pnetworkFactory.eINSTANCE.createSubgraphSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 P2pnetworkFactory.eINSTANCE.createSubgraphLink()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 P2pnetworkFactory.eINSTANCE.createSubgraphNodeTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 BlockchainsystemFactory.eINSTANCE.createBlockchainSystem()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 BlockchainsystemFactory.eINSTANCE.createBlockchainSystemSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 BlockchainsystemFactory.eINSTANCE.createTransactionsSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 NodeenvironmentFactory.eINSTANCE.createNodeEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 NodeenvironmentFactory.eINSTANCE.createNodeResourceContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 PcmFactory.eINSTANCE.createDummyClass()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CoreFactory.eINSTANCE.createPCMRandomVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 EntityFactory.eINSTANCE.createResourceProvidedRole()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 EntityFactory.eINSTANCE.createResourceInterfaceRequiringEntity()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 EntityFactory.eINSTANCE.createResourceRequiredRole()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 EntityFactory.eINSTANCE.createResourceInterfaceProvidingEntity()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 EntityFactory.eINSTANCE.createResourceInterfaceProvidingRequiringEntity()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createResourceRequiredDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createEventChannel()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createEventChannelSourceConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createEventChannelSinkConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createProvidedDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createRequiredDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createAssemblyConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createAssemblyEventConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createSourceDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createSinkDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createAssemblyInfrastructureConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createProvidedInfrastructureDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createRequiredInfrastructureDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createRequiredResourceDelegationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 CompositionFactory.eINSTANCE.createAssemblyContext()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createUsageScenario()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createUserData()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createUsageModel()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createEntryLevelSystemCall()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createScenarioBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createBranchTransition()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createBranch()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createStop()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createStart()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createOpenWorkload()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 UsagemodelFactory.eINSTANCE.createClosedWorkload()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createPassiveResource()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createBasicComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createRepository()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createRequiredCharacterisation()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createEventGroup()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createEventType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createExceptionType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createInfrastructureSignature()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createInfrastructureInterface()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createInfrastructureRequiredRole()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createOperationSignature()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createOperationInterface()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createOperationRequiredRole()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createSourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createSinkRole()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createOperationProvidedRole()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createInfrastructureProvidedRole()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createCompleteComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createProvidesComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createCompositeComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createCollectionDataType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createCompositeDataType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 RepositoryFactory.eINSTANCE.createInnerDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourcetypeFactory.eINSTANCE.createResourceSignature()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourcetypeFactory.eINSTANCE.createProcessingResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourcetypeFactory.eINSTANCE.createResourceRepository()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourcetypeFactory.eINSTANCE.createSchedulingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourcetypeFactory.eINSTANCE.createCommunicationLinkResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourcetypeFactory.eINSTANCE.createResourceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ParameterFactory.eINSTANCE.createVariableUsage()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ParameterFactory.eINSTANCE.createVariableCharacterisation()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ParameterFactory.eINSTANCE.createCharacterisedVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ReliabilityFactory.eINSTANCE.createHardwareInducedFailureType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ReliabilityFactory.eINSTANCE.createSoftwareInducedFailureType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ReliabilityFactory.eINSTANCE.createInternalFailureOccurrenceDescription()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ReliabilityFactory.eINSTANCE.createNetworkInducedFailureType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ReliabilityFactory.eINSTANCE.createExternalFailureOccurrenceDescription()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ReliabilityFactory.eINSTANCE.createResourceTimeoutFailureType()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createStopAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createResourceDemandingBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createBranchAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createStartAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createResourceDemandingSEFF()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createResourceDemandingInternalBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createReleaseAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createLoopAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createForkAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createForkedBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createSynchronisationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createExternalCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createCallReturnAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createProbabilisticBranchTransition()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createAcquireAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createCollectionIteratorAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createGuardedBranchTransition()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createSetVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createInternalCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createEmitEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SeffFactory.eINSTANCE.createInternalAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 Seff_performanceFactory.eINSTANCE.createInfrastructureCall()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 Seff_performanceFactory.eINSTANCE.createResourceCall()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 Seff_performanceFactory.eINSTANCE.createParametricResourceDemand()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 Seff_reliabilityFactory.eINSTANCE.createRecoveryActionBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 Seff_reliabilityFactory.eINSTANCE.createRecoveryAction()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 QosannotationsFactory.eINSTANCE.createQoSAnnotations()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 Qos_performanceFactory.eINSTANCE.createSystemSpecifiedExecutionTime()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 Qos_performanceFactory.eINSTANCE.createComponentSpecifiedExecutionTime()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 Qos_reliabilityFactory.eINSTANCE.createSpecifiedReliabilityAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SystemFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourceenvironmentFactory.eINSTANCE.createResourceEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourceenvironmentFactory.eINSTANCE.createLinkingResource()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourceenvironmentFactory.eINSTANCE.createResourceContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourceenvironmentFactory.eINSTANCE.createProcessingResourceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourceenvironmentFactory.eINSTANCE.createCommunicationLinkResourceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 ResourceenvironmentFactory.eINSTANCE.createHDDProcessingResourceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 AllocationFactory.eINSTANCE.createAllocationContext()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 AllocationFactory.eINSTANCE.createAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(EcorePackage.Literals.EANNOTATION__CONTENTS,
				 SubsystemFactory.eINSTANCE.createSubSystem()));
	}

}

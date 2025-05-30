/**
 */
package pcm.resourceenvironment.impl;

import bscm.blockchainsystem.BlockchainsystemPackage;

import bscm.blockchainsystem.impl.BlockchainsystemPackageImpl;

import bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryPackage;

import bscm.blockchainsystemComponentRepository.impl.BlockchainsystemComponentRepositoryPackageImpl;

import bscm.nodeallocation.NodeallocationPackage;

import bscm.nodeallocation.impl.NodeallocationPackageImpl;

import bscm.nodeenvironment.NodeenvironmentPackage;

import bscm.nodeenvironment.impl.NodeenvironmentPackageImpl;

import bscm.nodegeographicalenvironment.NodegeographicalenvironmentPackage;

import bscm.nodegeographicalenvironment.impl.NodegeographicalenvironmentPackageImpl;

import bscm.nodesystem.NodesystemPackage;

import bscm.nodesystem.impl.NodesystemPackageImpl;

import bscm.p2pnetwork.P2pnetworkPackage;

import bscm.p2pnetwork.impl.P2pnetworkPackageImpl;

import ecore.EcorePackage;

import ecore.impl.EcorePackageImpl;

import identifier.IdentifierPackage;

import identifier.impl.IdentifierPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pcm.PcmPackage;

import pcm.allocation.AllocationPackage;

import pcm.allocation.impl.AllocationPackageImpl;

import pcm.core.CorePackage;

import pcm.core.composition.CompositionPackage;

import pcm.core.composition.impl.CompositionPackageImpl;

import pcm.core.entity.EntityPackage;

import pcm.core.entity.impl.EntityPackageImpl;

import pcm.core.impl.CorePackageImpl;

import pcm.impl.PcmPackageImpl;

import pcm.parameter.ParameterPackage;

import pcm.parameter.impl.ParameterPackageImpl;

import pcm.protocol.ProtocolPackage;

import pcm.protocol.impl.ProtocolPackageImpl;

import pcm.qosannotations.QosannotationsPackage;

import pcm.qosannotations.impl.QosannotationsPackageImpl;

import pcm.qosannotations.qos_performance.Qos_performancePackage;

import pcm.qosannotations.qos_performance.impl.Qos_performancePackageImpl;

import pcm.qosannotations.qos_reliability.Qos_reliabilityPackage;

import pcm.qosannotations.qos_reliability.impl.Qos_reliabilityPackageImpl;

import pcm.reliability.ReliabilityPackage;

import pcm.reliability.impl.ReliabilityPackageImpl;

import pcm.repository.RepositoryPackage;

import pcm.repository.impl.RepositoryPackageImpl;

import pcm.resourceenvironment.CommunicationLinkResourceSpecification;
import pcm.resourceenvironment.HDDProcessingResourceSpecification;
import pcm.resourceenvironment.LinkingResource;
import pcm.resourceenvironment.ProcessingResourceSpecification;
import pcm.resourceenvironment.ResourceContainer;
import pcm.resourceenvironment.ResourceEnvironment;
import pcm.resourceenvironment.ResourceenvironmentFactory;
import pcm.resourceenvironment.ResourceenvironmentPackage;

import pcm.resourcetype.ResourcetypePackage;

import pcm.resourcetype.impl.ResourcetypePackageImpl;

import pcm.seff.SeffPackage;

import pcm.seff.impl.SeffPackageImpl;

import pcm.seff.seff_performance.Seff_performancePackage;

import pcm.seff.seff_performance.impl.Seff_performancePackageImpl;

import pcm.seff.seff_reliability.Seff_reliabilityPackage;

import pcm.seff.seff_reliability.impl.Seff_reliabilityPackageImpl;

import pcm.subsystem.SubsystemPackage;

import pcm.subsystem.impl.SubsystemPackageImpl;

import pcm.system.SystemPackage;

import pcm.system.impl.SystemPackageImpl;

import pcm.usagemodel.UsagemodelPackage;

import pcm.usagemodel.impl.UsagemodelPackageImpl;

import probfunction.ProbfunctionPackage;

import probfunction.impl.ProbfunctionPackageImpl;

import stoex.StoexPackage;

import stoex.impl.StoexPackageImpl;

import units.UnitsPackage;

import units.impl.UnitsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceenvironmentPackageImpl extends EPackageImpl implements ResourceenvironmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationLinkResourceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hddProcessingResourceSpecificationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pcm.resourceenvironment.ResourceenvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourceenvironmentPackageImpl() {
		super(eNS_URI, ResourceenvironmentFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ResourceenvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourceenvironmentPackage init() {
		if (isInited) return (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResourceenvironmentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResourceenvironmentPackageImpl theResourceenvironmentPackage = registeredResourceenvironmentPackage instanceof ResourceenvironmentPackageImpl ? (ResourceenvironmentPackageImpl)registeredResourceenvironmentPackage : new ResourceenvironmentPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NodeallocationPackage.eNS_URI);
		NodeallocationPackageImpl theNodeallocationPackage = (NodeallocationPackageImpl)(registeredPackage instanceof NodeallocationPackageImpl ? registeredPackage : NodeallocationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NodesystemPackage.eNS_URI);
		NodesystemPackageImpl theNodesystemPackage = (NodesystemPackageImpl)(registeredPackage instanceof NodesystemPackageImpl ? registeredPackage : NodesystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BlockchainsystemComponentRepositoryPackage.eNS_URI);
		BlockchainsystemComponentRepositoryPackageImpl theBlockchainsystemComponentRepositoryPackage = (BlockchainsystemComponentRepositoryPackageImpl)(registeredPackage instanceof BlockchainsystemComponentRepositoryPackageImpl ? registeredPackage : BlockchainsystemComponentRepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(P2pnetworkPackage.eNS_URI);
		P2pnetworkPackageImpl theP2pnetworkPackage = (P2pnetworkPackageImpl)(registeredPackage instanceof P2pnetworkPackageImpl ? registeredPackage : P2pnetworkPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BlockchainsystemPackage.eNS_URI);
		BlockchainsystemPackageImpl theBlockchainsystemPackage = (BlockchainsystemPackageImpl)(registeredPackage instanceof BlockchainsystemPackageImpl ? registeredPackage : BlockchainsystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NodeenvironmentPackage.eNS_URI);
		NodeenvironmentPackageImpl theNodeenvironmentPackage = (NodeenvironmentPackageImpl)(registeredPackage instanceof NodeenvironmentPackageImpl ? registeredPackage : NodeenvironmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NodegeographicalenvironmentPackage.eNS_URI);
		NodegeographicalenvironmentPackageImpl theNodegeographicalenvironmentPackage = (NodegeographicalenvironmentPackageImpl)(registeredPackage instanceof NodegeographicalenvironmentPackageImpl ? registeredPackage : NodegeographicalenvironmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PcmPackage.eNS_URI);
		PcmPackageImpl thePcmPackage = (PcmPackageImpl)(registeredPackage instanceof PcmPackageImpl ? registeredPackage : PcmPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		CompositionPackageImpl theCompositionPackage = (CompositionPackageImpl)(registeredPackage instanceof CompositionPackageImpl ? registeredPackage : CompositionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);
		UsagemodelPackageImpl theUsagemodelPackage = (UsagemodelPackageImpl)(registeredPackage instanceof UsagemodelPackageImpl ? registeredPackage : UsagemodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		RepositoryPackageImpl theRepositoryPackage = (RepositoryPackageImpl)(registeredPackage instanceof RepositoryPackageImpl ? registeredPackage : RepositoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI);
		ResourcetypePackageImpl theResourcetypePackage = (ResourcetypePackageImpl)(registeredPackage instanceof ResourcetypePackageImpl ? registeredPackage : ResourcetypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);
		ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(registeredPackage instanceof ProtocolPackageImpl ? registeredPackage : ProtocolPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI);
		ParameterPackageImpl theParameterPackage = (ParameterPackageImpl)(registeredPackage instanceof ParameterPackageImpl ? registeredPackage : ParameterPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReliabilityPackage.eNS_URI);
		ReliabilityPackageImpl theReliabilityPackage = (ReliabilityPackageImpl)(registeredPackage instanceof ReliabilityPackageImpl ? registeredPackage : ReliabilityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);
		SeffPackageImpl theSeffPackage = (SeffPackageImpl)(registeredPackage instanceof SeffPackageImpl ? registeredPackage : SeffPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Seff_performancePackage.eNS_URI);
		Seff_performancePackageImpl theSeff_performancePackage = (Seff_performancePackageImpl)(registeredPackage instanceof Seff_performancePackageImpl ? registeredPackage : Seff_performancePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Seff_reliabilityPackage.eNS_URI);
		Seff_reliabilityPackageImpl theSeff_reliabilityPackage = (Seff_reliabilityPackageImpl)(registeredPackage instanceof Seff_reliabilityPackageImpl ? registeredPackage : Seff_reliabilityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QosannotationsPackage.eNS_URI);
		QosannotationsPackageImpl theQosannotationsPackage = (QosannotationsPackageImpl)(registeredPackage instanceof QosannotationsPackageImpl ? registeredPackage : QosannotationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Qos_performancePackage.eNS_URI);
		Qos_performancePackageImpl theQos_performancePackage = (Qos_performancePackageImpl)(registeredPackage instanceof Qos_performancePackageImpl ? registeredPackage : Qos_performancePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Qos_reliabilityPackage.eNS_URI);
		Qos_reliabilityPackageImpl theQos_reliabilityPackage = (Qos_reliabilityPackageImpl)(registeredPackage instanceof Qos_reliabilityPackageImpl ? registeredPackage : Qos_reliabilityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		SystemPackageImpl theSystemPackage = (SystemPackageImpl)(registeredPackage instanceof SystemPackageImpl ? registeredPackage : SystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(registeredPackage instanceof AllocationPackageImpl ? registeredPackage : AllocationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubsystemPackage.eNS_URI);
		SubsystemPackageImpl theSubsystemPackage = (SubsystemPackageImpl)(registeredPackage instanceof SubsystemPackageImpl ? registeredPackage : SubsystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		IdentifierPackageImpl theIdentifierPackage = (IdentifierPackageImpl)(registeredPackage instanceof IdentifierPackageImpl ? registeredPackage : IdentifierPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(registeredPackage instanceof EcorePackageImpl ? registeredPackage : EcorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoexPackage.eNS_URI);
		StoexPackageImpl theStoexPackage = (StoexPackageImpl)(registeredPackage instanceof StoexPackageImpl ? registeredPackage : StoexPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnitsPackage.eNS_URI);
		UnitsPackageImpl theUnitsPackage = (UnitsPackageImpl)(registeredPackage instanceof UnitsPackageImpl ? registeredPackage : UnitsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProbfunctionPackage.eNS_URI);
		ProbfunctionPackageImpl theProbfunctionPackage = (ProbfunctionPackageImpl)(registeredPackage instanceof ProbfunctionPackageImpl ? registeredPackage : ProbfunctionPackage.eINSTANCE);

		// Create package meta-data objects
		theResourceenvironmentPackage.createPackageContents();
		theNodeallocationPackage.createPackageContents();
		theNodesystemPackage.createPackageContents();
		theBlockchainsystemComponentRepositoryPackage.createPackageContents();
		theP2pnetworkPackage.createPackageContents();
		theBlockchainsystemPackage.createPackageContents();
		theNodeenvironmentPackage.createPackageContents();
		theNodegeographicalenvironmentPackage.createPackageContents();
		thePcmPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theCompositionPackage.createPackageContents();
		theUsagemodelPackage.createPackageContents();
		theRepositoryPackage.createPackageContents();
		theResourcetypePackage.createPackageContents();
		theProtocolPackage.createPackageContents();
		theParameterPackage.createPackageContents();
		theReliabilityPackage.createPackageContents();
		theSeffPackage.createPackageContents();
		theSeff_performancePackage.createPackageContents();
		theSeff_reliabilityPackage.createPackageContents();
		theQosannotationsPackage.createPackageContents();
		theQos_performancePackage.createPackageContents();
		theQos_reliabilityPackage.createPackageContents();
		theSystemPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		theSubsystemPackage.createPackageContents();
		theIdentifierPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theStoexPackage.createPackageContents();
		theUnitsPackage.createPackageContents();
		theProbfunctionPackage.createPackageContents();

		// Initialize created meta-data
		theResourceenvironmentPackage.initializePackageContents();
		theNodeallocationPackage.initializePackageContents();
		theNodesystemPackage.initializePackageContents();
		theBlockchainsystemComponentRepositoryPackage.initializePackageContents();
		theP2pnetworkPackage.initializePackageContents();
		theBlockchainsystemPackage.initializePackageContents();
		theNodeenvironmentPackage.initializePackageContents();
		theNodegeographicalenvironmentPackage.initializePackageContents();
		thePcmPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theCompositionPackage.initializePackageContents();
		theUsagemodelPackage.initializePackageContents();
		theRepositoryPackage.initializePackageContents();
		theResourcetypePackage.initializePackageContents();
		theProtocolPackage.initializePackageContents();
		theParameterPackage.initializePackageContents();
		theReliabilityPackage.initializePackageContents();
		theSeffPackage.initializePackageContents();
		theSeff_performancePackage.initializePackageContents();
		theSeff_reliabilityPackage.initializePackageContents();
		theQosannotationsPackage.initializePackageContents();
		theQos_performancePackage.initializePackageContents();
		theQos_reliabilityPackage.initializePackageContents();
		theSystemPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		theSubsystemPackage.initializePackageContents();
		theIdentifierPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theStoexPackage.initializePackageContents();
		theUnitsPackage.initializePackageContents();
		theProbfunctionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourceenvironmentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourceenvironmentPackage.eNS_URI, theResourceenvironmentPackage);
		return theResourceenvironmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceEnvironment() {
		return resourceEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceEnvironment_LinkingResources__ResourceEnvironment() {
		return (EReference)resourceEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceEnvironment_ResourceContainer_ResourceEnvironment() {
		return (EReference)resourceEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkingResource() {
		return linkingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkingResource_ConnectedResourceContainers_LinkingResource() {
		return (EReference)linkingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource() {
		return (EReference)linkingResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkingResource_ResourceEnvironment_LinkingResource() {
		return (EReference)linkingResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceContainer() {
		return resourceContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceContainer_ActiveResourceSpecifications_ResourceContainer() {
		return (EReference)resourceContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceContainer_ResourceEnvironment_ResourceContainer() {
		return (EReference)resourceContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceContainer_NestedResourceContainers__ResourceContainer() {
		return (EReference)resourceContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceContainer_ParentResourceContainer__ResourceContainer() {
		return (EReference)resourceContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceContainer_HddResourceSpecifications() {
		return (EReference)resourceContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingResourceSpecification() {
		return processingResourceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingResourceSpecification_MTTR() {
		return (EAttribute)processingResourceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingResourceSpecification_MTTF() {
		return (EAttribute)processingResourceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingResourceSpecification_RequiredByContainer() {
		return (EAttribute)processingResourceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingResourceSpecification_SchedulingPolicy() {
		return (EReference)processingResourceSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification() {
		return (EReference)processingResourceSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification() {
		return (EReference)processingResourceSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingResourceSpecification_NumberOfReplicas() {
		return (EAttribute)processingResourceSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification() {
		return (EReference)processingResourceSpecificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationLinkResourceSpecification() {
		return communicationLinkResourceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification() {
		return (EReference)communicationLinkResourceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationLinkResourceSpecification_FailureProbability() {
		return (EAttribute)communicationLinkResourceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification() {
		return (EReference)communicationLinkResourceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification() {
		return (EReference)communicationLinkResourceSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification() {
		return (EReference)communicationLinkResourceSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHDDProcessingResourceSpecification() {
		return hddProcessingResourceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHDDProcessingResourceSpecification_WriteProcessingRate() {
		return (EReference)hddProcessingResourceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHDDProcessingResourceSpecification_ReadProcessingRate() {
		return (EReference)hddProcessingResourceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHDDProcessingResourceSpecification_ResourceContainer() {
		return (EReference)hddProcessingResourceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceenvironmentFactory getResourceenvironmentFactory() {
		return (ResourceenvironmentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceEnvironmentEClass = createEClass(RESOURCE_ENVIRONMENT);
		createEReference(resourceEnvironmentEClass, RESOURCE_ENVIRONMENT__LINKING_RESOURCES_RESOURCE_ENVIRONMENT);
		createEReference(resourceEnvironmentEClass, RESOURCE_ENVIRONMENT__RESOURCE_CONTAINER_RESOURCE_ENVIRONMENT);

		linkingResourceEClass = createEClass(LINKING_RESOURCE);
		createEReference(linkingResourceEClass, LINKING_RESOURCE__CONNECTED_RESOURCE_CONTAINERS_LINKING_RESOURCE);
		createEReference(linkingResourceEClass, LINKING_RESOURCE__COMMUNICATION_LINK_RESOURCE_SPECIFICATIONS_LINKING_RESOURCE);
		createEReference(linkingResourceEClass, LINKING_RESOURCE__RESOURCE_ENVIRONMENT_LINKING_RESOURCE);

		resourceContainerEClass = createEClass(RESOURCE_CONTAINER);
		createEReference(resourceContainerEClass, RESOURCE_CONTAINER__ACTIVE_RESOURCE_SPECIFICATIONS_RESOURCE_CONTAINER);
		createEReference(resourceContainerEClass, RESOURCE_CONTAINER__RESOURCE_ENVIRONMENT_RESOURCE_CONTAINER);
		createEReference(resourceContainerEClass, RESOURCE_CONTAINER__NESTED_RESOURCE_CONTAINERS_RESOURCE_CONTAINER);
		createEReference(resourceContainerEClass, RESOURCE_CONTAINER__PARENT_RESOURCE_CONTAINER_RESOURCE_CONTAINER);
		createEReference(resourceContainerEClass, RESOURCE_CONTAINER__HDD_RESOURCE_SPECIFICATIONS);

		processingResourceSpecificationEClass = createEClass(PROCESSING_RESOURCE_SPECIFICATION);
		createEAttribute(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__MTTR);
		createEAttribute(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__MTTF);
		createEAttribute(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__REQUIRED_BY_CONTAINER);
		createEReference(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__SCHEDULING_POLICY);
		createEReference(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__ACTIVE_RESOURCE_TYPE_ACTIVE_RESOURCE_SPECIFICATION);
		createEReference(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__PROCESSING_RATE_PROCESSING_RESOURCE_SPECIFICATION);
		createEAttribute(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__NUMBER_OF_REPLICAS);
		createEReference(processingResourceSpecificationEClass, PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER_PROCESSING_RESOURCE_SPECIFICATION);

		communicationLinkResourceSpecificationEClass = createEClass(COMMUNICATION_LINK_RESOURCE_SPECIFICATION);
		createEReference(communicationLinkResourceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LINKING_RESOURCE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION);
		createEAttribute(communicationLinkResourceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_SPECIFICATION__FAILURE_PROBABILITY);
		createEReference(communicationLinkResourceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_SPECIFICATION__COMMUNICATION_LINK_RESOURCE_TYPE_COMMUNICATION_LINK_RESOURCE_SPECIFICATION);
		createEReference(communicationLinkResourceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_SPECIFICATION__LATENCY_COMMUNICATION_LINK_RESOURCE_SPECIFICATION);
		createEReference(communicationLinkResourceSpecificationEClass, COMMUNICATION_LINK_RESOURCE_SPECIFICATION__THROUGHPUT_COMMUNICATION_LINK_RESOURCE_SPECIFICATION);

		hddProcessingResourceSpecificationEClass = createEClass(HDD_PROCESSING_RESOURCE_SPECIFICATION);
		createEReference(hddProcessingResourceSpecificationEClass, HDD_PROCESSING_RESOURCE_SPECIFICATION__WRITE_PROCESSING_RATE);
		createEReference(hddProcessingResourceSpecificationEClass, HDD_PROCESSING_RESOURCE_SPECIFICATION__READ_PROCESSING_RATE);
		createEReference(hddProcessingResourceSpecificationEClass, HDD_PROCESSING_RESOURCE_SPECIFICATION__RESOURCE_CONTAINER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		PcmPackage thePcmPackage = (PcmPackage)EPackage.Registry.INSTANCE.getEPackage(PcmPackage.eNS_URI);
		ResourcetypePackage theResourcetypePackage = (ResourcetypePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceEnvironmentEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
		linkingResourceEClass.getESuperTypes().add(theEntityPackage.getEntity());
		resourceContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());
		processingResourceSpecificationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		processingResourceSpecificationEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		communicationLinkResourceSpecificationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		communicationLinkResourceSpecificationEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		hddProcessingResourceSpecificationEClass.getESuperTypes().add(this.getProcessingResourceSpecification());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceEnvironmentEClass, ResourceEnvironment.class, "ResourceEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceEnvironment_LinkingResources__ResourceEnvironment(), this.getLinkingResource(), this.getLinkingResource_ResourceEnvironment_LinkingResource(), "linkingResources__ResourceEnvironment", null, 0, -1, ResourceEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceEnvironment_ResourceContainer_ResourceEnvironment(), this.getResourceContainer(), this.getResourceContainer_ResourceEnvironment_ResourceContainer(), "resourceContainer_ResourceEnvironment", null, 0, -1, ResourceEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkingResourceEClass, LinkingResource.class, "LinkingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkingResource_ConnectedResourceContainers_LinkingResource(), this.getResourceContainer(), null, "connectedResourceContainers_LinkingResource", null, 0, -1, LinkingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource(), this.getCommunicationLinkResourceSpecification(), this.getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification(), "communicationLinkResourceSpecifications_LinkingResource", null, 1, 1, LinkingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkingResource_ResourceEnvironment_LinkingResource(), this.getResourceEnvironment(), this.getResourceEnvironment_LinkingResources__ResourceEnvironment(), "resourceEnvironment_LinkingResource", null, 1, 1, LinkingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceContainerEClass, ResourceContainer.class, "ResourceContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceContainer_ActiveResourceSpecifications_ResourceContainer(), this.getProcessingResourceSpecification(), this.getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification(), "activeResourceSpecifications_ResourceContainer", null, 0, -1, ResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceContainer_ResourceEnvironment_ResourceContainer(), this.getResourceEnvironment(), this.getResourceEnvironment_ResourceContainer_ResourceEnvironment(), "resourceEnvironment_ResourceContainer", null, 0, 1, ResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceContainer_NestedResourceContainers__ResourceContainer(), this.getResourceContainer(), this.getResourceContainer_ParentResourceContainer__ResourceContainer(), "nestedResourceContainers__ResourceContainer", null, 0, -1, ResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceContainer_ParentResourceContainer__ResourceContainer(), this.getResourceContainer(), this.getResourceContainer_NestedResourceContainers__ResourceContainer(), "parentResourceContainer__ResourceContainer", null, 0, 1, ResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceContainer_HddResourceSpecifications(), this.getHDDProcessingResourceSpecification(), this.getHDDProcessingResourceSpecification_ResourceContainer(), "hddResourceSpecifications", null, 0, -1, ResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingResourceSpecificationEClass, ProcessingResourceSpecification.class, "ProcessingResourceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingResourceSpecification_MTTR(), ecorePackage.getEDouble(), "MTTR", "0.0", 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProcessingResourceSpecification_MTTF(), ecorePackage.getEDouble(), "MTTF", "0.0", 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProcessingResourceSpecification_RequiredByContainer(), ecorePackage.getEBoolean(), "requiredByContainer", null, 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessingResourceSpecification_SchedulingPolicy(), theResourcetypePackage.getSchedulingPolicy(), null, "schedulingPolicy", null, 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessingResourceSpecification_ActiveResourceType_ActiveResourceSpecification(), theResourcetypePackage.getProcessingResourceType(), null, "activeResourceType_ActiveResourceSpecification", null, 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessingResourceSpecification_ProcessingRate_ProcessingResourceSpecification(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_ProcessingResourceSpecification_processingRate_PCMRandomVariable(), "processingRate_ProcessingResourceSpecification", null, 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProcessingResourceSpecification_NumberOfReplicas(), ecorePackage.getEInt(), "numberOfReplicas", "1", 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessingResourceSpecification_ResourceContainer_ProcessingResourceSpecification(), this.getResourceContainer(), this.getResourceContainer_ActiveResourceSpecifications_ResourceContainer(), "resourceContainer_ProcessingResourceSpecification", null, 1, 1, ProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(communicationLinkResourceSpecificationEClass, CommunicationLinkResourceSpecification.class, "CommunicationLinkResourceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification(), this.getLinkingResource(), this.getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource(), "linkingResource_CommunicationLinkResourceSpecification", null, 1, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommunicationLinkResourceSpecification_FailureProbability(), ecorePackage.getEDouble(), "failureProbability", "0.0", 1, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification(), theResourcetypePackage.getCommunicationLinkResourceType(), null, "communicationLinkResourceType_CommunicationLinkResourceSpecification", null, 1, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_CommunicationLinkResourceSpecification_latency_PCMRandomVariable(), "latency_CommunicationLinkResourceSpecification", null, 1, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_CommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable(), "throughput_CommunicationLinkResourceSpecification", null, 1, 1, CommunicationLinkResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hddProcessingResourceSpecificationEClass, HDDProcessingResourceSpecification.class, "HDDProcessingResourceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHDDProcessingResourceSpecification_WriteProcessingRate(), theCorePackage.getPCMRandomVariable(), null, "writeProcessingRate", null, 1, 1, HDDProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHDDProcessingResourceSpecification_ReadProcessingRate(), theCorePackage.getPCMRandomVariable(), null, "readProcessingRate", null, 1, 1, HDDProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHDDProcessingResourceSpecification_ResourceContainer(), this.getResourceContainer(), this.getResourceContainer_HddResourceSpecifications(), "resourceContainer", null, 0, 1, HDDProcessingResourceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ResourceenvironmentPackageImpl

/**
 */
package bscm.p2pnetwork.impl;

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

import bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology;
import bscm.p2pnetwork.ConstraintNetworkTopology;
import bscm.p2pnetwork.ExplicitNetworkTopology;
import bscm.p2pnetwork.Link;
import bscm.p2pnetwork.LinkLatencySpecification;
import bscm.p2pnetwork.LinkLatencySpecificationValue;
import bscm.p2pnetwork.LinkSpecification;
import bscm.p2pnetwork.LinkThroughputSpecification;
import bscm.p2pnetwork.LinkThroughputSpecificationValue;
import bscm.p2pnetwork.NetworkTopology;
import bscm.p2pnetwork.Node;
import bscm.p2pnetwork.P2PNetwork;
import bscm.p2pnetwork.P2pnetworkFactory;
import bscm.p2pnetwork.P2pnetworkPackage;
import bscm.p2pnetwork.SubgraphLink;
import bscm.p2pnetwork.SubgraphNodeTemplate;
import bscm.p2pnetwork.SubgraphSpecification;

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

import pcm.resourceenvironment.ResourceenvironmentPackage;

import pcm.resourceenvironment.impl.ResourceenvironmentPackageImpl;

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
public class P2pnetworkPackageImpl extends EPackageImpl implements P2pnetworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p2PNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkTopologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicitNetworkTopologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintNetworkTopologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectedSubgraphsNetworkTopologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subgraphSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subgraphLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subgraphNodeTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkLatencySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkLatencySpecificationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkThroughputSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkThroughputSpecificationValueEClass = null;

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
	 * @see bscm.p2pnetwork.P2pnetworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private P2pnetworkPackageImpl() {
		super(eNS_URI, P2pnetworkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link P2pnetworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static P2pnetworkPackage init() {
		if (isInited) return (P2pnetworkPackage)EPackage.Registry.INSTANCE.getEPackage(P2pnetworkPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredP2pnetworkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		P2pnetworkPackageImpl theP2pnetworkPackage = registeredP2pnetworkPackage instanceof P2pnetworkPackageImpl ? (P2pnetworkPackageImpl)registeredP2pnetworkPackage : new P2pnetworkPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NodeallocationPackage.eNS_URI);
		NodeallocationPackageImpl theNodeallocationPackage = (NodeallocationPackageImpl)(registeredPackage instanceof NodeallocationPackageImpl ? registeredPackage : NodeallocationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NodesystemPackage.eNS_URI);
		NodesystemPackageImpl theNodesystemPackage = (NodesystemPackageImpl)(registeredPackage instanceof NodesystemPackageImpl ? registeredPackage : NodesystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BlockchainsystemComponentRepositoryPackage.eNS_URI);
		BlockchainsystemComponentRepositoryPackageImpl theBlockchainsystemComponentRepositoryPackage = (BlockchainsystemComponentRepositoryPackageImpl)(registeredPackage instanceof BlockchainsystemComponentRepositoryPackageImpl ? registeredPackage : BlockchainsystemComponentRepositoryPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		ResourceenvironmentPackageImpl theResourceenvironmentPackage = (ResourceenvironmentPackageImpl)(registeredPackage instanceof ResourceenvironmentPackageImpl ? registeredPackage : ResourceenvironmentPackage.eINSTANCE);
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
		theP2pnetworkPackage.createPackageContents();
		theNodeallocationPackage.createPackageContents();
		theNodesystemPackage.createPackageContents();
		theBlockchainsystemComponentRepositoryPackage.createPackageContents();
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
		theResourceenvironmentPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		theSubsystemPackage.createPackageContents();
		theIdentifierPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theStoexPackage.createPackageContents();
		theUnitsPackage.createPackageContents();
		theProbfunctionPackage.createPackageContents();

		// Initialize created meta-data
		theP2pnetworkPackage.initializePackageContents();
		theNodeallocationPackage.initializePackageContents();
		theNodesystemPackage.initializePackageContents();
		theBlockchainsystemComponentRepositoryPackage.initializePackageContents();
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
		theResourceenvironmentPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		theSubsystemPackage.initializePackageContents();
		theIdentifierPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theStoexPackage.initializePackageContents();
		theUnitsPackage.initializePackageContents();
		theProbfunctionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theP2pnetworkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(P2pnetworkPackage.eNS_URI, theP2pnetworkPackage);
		return theP2pnetworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getP2PNetwork() {
		return p2PNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getP2PNetwork_Topology() {
		return (EReference)p2PNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkTopology() {
		return networkTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExplicitNetworkTopology() {
		return explicitNetworkTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExplicitNetworkTopology_Nodes() {
		return (EReference)explicitNetworkTopologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExplicitNetworkTopology_Links() {
		return (EReference)explicitNetworkTopologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraintNetworkTopology() {
		return constraintNetworkTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Allocation() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Specification() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_FromNode() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_ToNode() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkSpecification() {
		return linkSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkSpecification_LatencySpecification() {
		return (EReference)linkSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkSpecification_ThroughputSpecification() {
		return (EReference)linkSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectedSubgraphsNetworkTopology() {
		return connectedSubgraphsNetworkTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectedSubgraphsNetworkTopology_Subgraphs() {
		return (EReference)connectedSubgraphsNetworkTopologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectedSubgraphsNetworkTopology_SubgraphLinks() {
		return (EReference)connectedSubgraphsNetworkTopologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubgraphSpecification() {
		return subgraphSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubgraphSpecification_NodeTemplates() {
		return (EReference)subgraphSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubgraphSpecification_LinkSpecification() {
		return (EReference)subgraphSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubgraphSpecification_Connectivity() {
		return (EAttribute)subgraphSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubgraphLink() {
		return subgraphLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubgraphLink_Specification() {
		return (EReference)subgraphLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubgraphLink_ConnectedSubgraphs() {
		return (EReference)subgraphLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubgraphNodeTemplate() {
		return subgraphNodeTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubgraphNodeTemplate_NumberOfNodeOccurences() {
		return (EAttribute)subgraphNodeTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubgraphNodeTemplate_Allocation() {
		return (EReference)subgraphNodeTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubgraphNodeTemplate_IsSubgraphProxy() {
		return (EAttribute)subgraphNodeTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkLatencySpecification() {
		return linkLatencySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkLatencySpecification_Values() {
		return (EReference)linkLatencySpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkLatencySpecificationValue() {
		return linkLatencySpecificationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkLatencySpecificationValue_Latency() {
		return (EAttribute)linkLatencySpecificationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkLatencySpecificationValue_Probability() {
		return (EAttribute)linkLatencySpecificationValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkThroughputSpecification() {
		return linkThroughputSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkThroughputSpecification_Values() {
		return (EReference)linkThroughputSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkThroughputSpecificationValue() {
		return linkThroughputSpecificationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkThroughputSpecificationValue_Throughput() {
		return (EAttribute)linkThroughputSpecificationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkThroughputSpecificationValue_Probability() {
		return (EAttribute)linkThroughputSpecificationValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P2pnetworkFactory getP2pnetworkFactory() {
		return (P2pnetworkFactory)getEFactoryInstance();
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
		p2PNetworkEClass = createEClass(P2P_NETWORK);
		createEReference(p2PNetworkEClass, P2P_NETWORK__TOPOLOGY);

		networkTopologyEClass = createEClass(NETWORK_TOPOLOGY);

		explicitNetworkTopologyEClass = createEClass(EXPLICIT_NETWORK_TOPOLOGY);
		createEReference(explicitNetworkTopologyEClass, EXPLICIT_NETWORK_TOPOLOGY__NODES);
		createEReference(explicitNetworkTopologyEClass, EXPLICIT_NETWORK_TOPOLOGY__LINKS);

		constraintNetworkTopologyEClass = createEClass(CONSTRAINT_NETWORK_TOPOLOGY);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__ALLOCATION);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__SPECIFICATION);
		createEReference(linkEClass, LINK__FROM_NODE);
		createEReference(linkEClass, LINK__TO_NODE);

		linkSpecificationEClass = createEClass(LINK_SPECIFICATION);
		createEReference(linkSpecificationEClass, LINK_SPECIFICATION__LATENCY_SPECIFICATION);
		createEReference(linkSpecificationEClass, LINK_SPECIFICATION__THROUGHPUT_SPECIFICATION);

		connectedSubgraphsNetworkTopologyEClass = createEClass(CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY);
		createEReference(connectedSubgraphsNetworkTopologyEClass, CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY__SUBGRAPHS);
		createEReference(connectedSubgraphsNetworkTopologyEClass, CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY__SUBGRAPH_LINKS);

		subgraphSpecificationEClass = createEClass(SUBGRAPH_SPECIFICATION);
		createEReference(subgraphSpecificationEClass, SUBGRAPH_SPECIFICATION__NODE_TEMPLATES);
		createEReference(subgraphSpecificationEClass, SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION);
		createEAttribute(subgraphSpecificationEClass, SUBGRAPH_SPECIFICATION__CONNECTIVITY);

		subgraphLinkEClass = createEClass(SUBGRAPH_LINK);
		createEReference(subgraphLinkEClass, SUBGRAPH_LINK__SPECIFICATION);
		createEReference(subgraphLinkEClass, SUBGRAPH_LINK__CONNECTED_SUBGRAPHS);

		subgraphNodeTemplateEClass = createEClass(SUBGRAPH_NODE_TEMPLATE);
		createEAttribute(subgraphNodeTemplateEClass, SUBGRAPH_NODE_TEMPLATE__NUMBER_OF_NODE_OCCURENCES);
		createEReference(subgraphNodeTemplateEClass, SUBGRAPH_NODE_TEMPLATE__ALLOCATION);
		createEAttribute(subgraphNodeTemplateEClass, SUBGRAPH_NODE_TEMPLATE__IS_SUBGRAPH_PROXY);

		linkLatencySpecificationEClass = createEClass(LINK_LATENCY_SPECIFICATION);
		createEReference(linkLatencySpecificationEClass, LINK_LATENCY_SPECIFICATION__VALUES);

		linkLatencySpecificationValueEClass = createEClass(LINK_LATENCY_SPECIFICATION_VALUE);
		createEAttribute(linkLatencySpecificationValueEClass, LINK_LATENCY_SPECIFICATION_VALUE__LATENCY);
		createEAttribute(linkLatencySpecificationValueEClass, LINK_LATENCY_SPECIFICATION_VALUE__PROBABILITY);

		linkThroughputSpecificationEClass = createEClass(LINK_THROUGHPUT_SPECIFICATION);
		createEReference(linkThroughputSpecificationEClass, LINK_THROUGHPUT_SPECIFICATION__VALUES);

		linkThroughputSpecificationValueEClass = createEClass(LINK_THROUGHPUT_SPECIFICATION_VALUE);
		createEAttribute(linkThroughputSpecificationValueEClass, LINK_THROUGHPUT_SPECIFICATION_VALUE__THROUGHPUT);
		createEAttribute(linkThroughputSpecificationValueEClass, LINK_THROUGHPUT_SPECIFICATION_VALUE__PROBABILITY);
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
		NodeallocationPackage theNodeallocationPackage = (NodeallocationPackage)EPackage.Registry.INSTANCE.getEPackage(NodeallocationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		p2PNetworkEClass.getESuperTypes().add(theEntityPackage.getEntity());
		networkTopologyEClass.getESuperTypes().add(theEntityPackage.getEntity());
		explicitNetworkTopologyEClass.getESuperTypes().add(this.getNetworkTopology());
		constraintNetworkTopologyEClass.getESuperTypes().add(this.getNetworkTopology());
		nodeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		linkEClass.getESuperTypes().add(theEntityPackage.getEntity());
		linkSpecificationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		connectedSubgraphsNetworkTopologyEClass.getESuperTypes().add(this.getConstraintNetworkTopology());
		subgraphSpecificationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		subgraphLinkEClass.getESuperTypes().add(theEntityPackage.getEntity());
		subgraphNodeTemplateEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(p2PNetworkEClass, P2PNetwork.class, "P2PNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getP2PNetwork_Topology(), this.getNetworkTopology(), null, "Topology", null, 0, -1, P2PNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkTopologyEClass, NetworkTopology.class, "NetworkTopology", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(explicitNetworkTopologyEClass, ExplicitNetworkTopology.class, "ExplicitNetworkTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExplicitNetworkTopology_Nodes(), this.getNode(), null, "Nodes", null, 0, -1, ExplicitNetworkTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExplicitNetworkTopology_Links(), this.getLink(), null, "Links", null, 0, -1, ExplicitNetworkTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintNetworkTopologyEClass, ConstraintNetworkTopology.class, "ConstraintNetworkTopology", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Allocation(), theNodeallocationPackage.getNodeAllocation(), null, "Allocation", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Specification(), this.getLinkSpecification(), null, "Specification", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_FromNode(), this.getNode(), null, "FromNode", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_ToNode(), this.getNode(), null, "ToNode", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkSpecificationEClass, LinkSpecification.class, "LinkSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkSpecification_LatencySpecification(), this.getLinkLatencySpecification(), null, "latencySpecification", null, 1, 1, LinkSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkSpecification_ThroughputSpecification(), this.getLinkThroughputSpecification(), null, "throughputSpecification", null, 1, 1, LinkSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectedSubgraphsNetworkTopologyEClass, ConnectedSubgraphsNetworkTopology.class, "ConnectedSubgraphsNetworkTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectedSubgraphsNetworkTopology_Subgraphs(), this.getSubgraphSpecification(), null, "Subgraphs", null, 1, -1, ConnectedSubgraphsNetworkTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectedSubgraphsNetworkTopology_SubgraphLinks(), this.getSubgraphLink(), null, "SubgraphLinks", null, 0, -1, ConnectedSubgraphsNetworkTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subgraphSpecificationEClass, SubgraphSpecification.class, "SubgraphSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubgraphSpecification_NodeTemplates(), this.getSubgraphNodeTemplate(), null, "NodeTemplates", null, 1, -1, SubgraphSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubgraphSpecification_LinkSpecification(), this.getLinkSpecification(), null, "LinkSpecification", null, 1, 1, SubgraphSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubgraphSpecification_Connectivity(), theEcorePackage.getEInt(), "Connectivity", null, 1, 1, SubgraphSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subgraphLinkEClass, SubgraphLink.class, "SubgraphLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubgraphLink_Specification(), this.getLinkSpecification(), null, "Specification", null, 1, 1, SubgraphLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubgraphLink_ConnectedSubgraphs(), this.getSubgraphSpecification(), null, "ConnectedSubgraphs", null, 2, 2, SubgraphLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subgraphNodeTemplateEClass, SubgraphNodeTemplate.class, "SubgraphNodeTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubgraphNodeTemplate_NumberOfNodeOccurences(), theEcorePackage.getEInt(), "NumberOfNodeOccurences", null, 1, 1, SubgraphNodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubgraphNodeTemplate_Allocation(), theNodeallocationPackage.getNodeAllocation(), null, "Allocation", null, 1, 1, SubgraphNodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubgraphNodeTemplate_IsSubgraphProxy(), theEcorePackage.getEBoolean(), "IsSubgraphProxy", null, 1, 1, SubgraphNodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkLatencySpecificationEClass, LinkLatencySpecification.class, "LinkLatencySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkLatencySpecification_Values(), this.getLinkLatencySpecificationValue(), null, "Values", null, 0, -1, LinkLatencySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkLatencySpecificationValueEClass, LinkLatencySpecificationValue.class, "LinkLatencySpecificationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkLatencySpecificationValue_Latency(), theEcorePackage.getEDouble(), "Latency", null, 1, 1, LinkLatencySpecificationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkLatencySpecificationValue_Probability(), theEcorePackage.getEDouble(), "Probability", null, 1, 1, LinkLatencySpecificationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkThroughputSpecificationEClass, LinkThroughputSpecification.class, "LinkThroughputSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkThroughputSpecification_Values(), this.getLinkThroughputSpecificationValue(), null, "Values", null, 1, -1, LinkThroughputSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkThroughputSpecificationValueEClass, LinkThroughputSpecificationValue.class, "LinkThroughputSpecificationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkThroughputSpecificationValue_Throughput(), theEcorePackage.getEInt(), "Throughput", null, 1, 1, LinkThroughputSpecificationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkThroughputSpecificationValue_Probability(), theEcorePackage.getEDouble(), "Probability", null, 1, 1, LinkThroughputSpecificationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //P2pnetworkPackageImpl

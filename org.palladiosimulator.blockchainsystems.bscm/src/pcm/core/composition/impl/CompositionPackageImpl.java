/**
 */
package pcm.core.composition.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pcm.PcmPackage;

import pcm.allocation.AllocationPackage;

import pcm.allocation.impl.AllocationPackageImpl;

import pcm.core.CorePackage;

import pcm.core.composition.AssemblyConnector;
import pcm.core.composition.AssemblyContext;
import pcm.core.composition.AssemblyEventConnector;
import pcm.core.composition.AssemblyInfrastructureConnector;
import pcm.core.composition.ComposedStructure;
import pcm.core.composition.CompositionFactory;
import pcm.core.composition.CompositionPackage;
import pcm.core.composition.Connector;
import pcm.core.composition.DelegationConnector;
import pcm.core.composition.EventChannel;
import pcm.core.composition.EventChannelSinkConnector;
import pcm.core.composition.EventChannelSourceConnector;
import pcm.core.composition.ProvidedDelegationConnector;
import pcm.core.composition.ProvidedInfrastructureDelegationConnector;
import pcm.core.composition.RequiredDelegationConnector;
import pcm.core.composition.RequiredInfrastructureDelegationConnector;
import pcm.core.composition.RequiredResourceDelegationConnector;
import pcm.core.composition.ResourceRequiredDelegationConnector;
import pcm.core.composition.SinkDelegationConnector;
import pcm.core.composition.SourceDelegationConnector;

import pcm.core.composition.util.CompositionValidator;

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
public class CompositionPackageImpl extends EPackageImpl implements CompositionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequiredDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChannelSourceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChannelSinkConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyEventConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyInfrastructureConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedInfrastructureDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredInfrastructureDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredResourceDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyContextEClass = null;

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
	 * @see pcm.core.composition.CompositionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompositionPackageImpl() {
		super(eNS_URI, CompositionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CompositionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompositionPackage init() {
		if (isInited) return (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCompositionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CompositionPackageImpl theCompositionPackage = registeredCompositionPackage instanceof CompositionPackageImpl ? (CompositionPackageImpl)registeredCompositionPackage : new CompositionPackageImpl();

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
		theCompositionPackage.createPackageContents();
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
		theCompositionPackage.initializePackageContents();
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCompositionPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return CompositionValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCompositionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompositionPackage.eNS_URI, theCompositionPackage);
		return theCompositionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelegationConnector() {
		return delegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_ParentStructure__Connector() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposedStructure() {
		return composedStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposedStructure_AssemblyContexts__ComposedStructure() {
		return (EReference)composedStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposedStructure_ResourceRequiredDelegationConnectors_ComposedStructure() {
		return (EReference)composedStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposedStructure_EventChannel__ComposedStructure() {
		return (EReference)composedStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposedStructure_Connectors__ComposedStructure() {
		return (EReference)composedStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComposedStructure__ValidateSameSubsystemMustNotBeInstantiatedMoreThanOnce__DiagnosticChain_Map() {
		return composedStructureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceRequiredDelegationConnector() {
		return resourceRequiredDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceRequiredDelegationConnector_InnerResourceRequiredRole_ResourceRequiredDelegationConnector() {
		return (EReference)resourceRequiredDelegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceRequiredDelegationConnector_OuterResourceRequiredRole_ResourceRequiredDelegationConnector() {
		return (EReference)resourceRequiredDelegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceRequiredDelegationConnector_ParentStructure_ResourceRequiredDelegationConnector() {
		return (EReference)resourceRequiredDelegationConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventChannel() {
		return eventChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannel_EventGroup__EventChannel() {
		return (EReference)eventChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannel_EventChannelSourceConnector__EventChannel() {
		return (EReference)eventChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannel_EventChannelSinkConnector__EventChannel() {
		return (EReference)eventChannelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannel_ParentStructure__EventChannel() {
		return (EReference)eventChannelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventChannelSourceConnector() {
		return eventChannelSourceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannelSourceConnector_SourceRole__EventChannelSourceRole() {
		return (EReference)eventChannelSourceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannelSourceConnector_AssemblyContext__EventChannelSourceConnector() {
		return (EReference)eventChannelSourceConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector() {
		return (EReference)eventChannelSourceConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventChannelSinkConnector() {
		return eventChannelSinkConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannelSinkConnector_SinkRole__EventChannelSinkConnector() {
		return (EReference)eventChannelSinkConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannelSinkConnector_FilterCondition__EventChannelSinkConnector() {
		return (EReference)eventChannelSinkConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannelSinkConnector_AssemblyContext__EventChannelSinkConnector() {
		return (EReference)eventChannelSinkConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventChannelSinkConnector_EventChannel__EventChannelSinkConnector() {
		return (EReference)eventChannelSinkConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedDelegationConnector() {
		return providedDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedDelegationConnector_InnerProvidedRole_ProvidedDelegationConnector() {
		return (EReference)providedDelegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedDelegationConnector_OuterProvidedRole_ProvidedDelegationConnector() {
		return (EReference)providedDelegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedDelegationConnector_AssemblyContext_ProvidedDelegationConnector() {
		return (EReference)providedDelegationConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredDelegationConnector() {
		return requiredDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredDelegationConnector_InnerRequiredRole_RequiredDelegationConnector() {
		return (EReference)requiredDelegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredDelegationConnector_OuterRequiredRole_RequiredDelegationConnector() {
		return (EReference)requiredDelegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredDelegationConnector_AssemblyContext_RequiredDelegationConnector() {
		return (EReference)requiredDelegationConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyConnector() {
		return assemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyConnector_RequiringAssemblyContext_AssemblyConnector() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyConnector_ProvidingAssemblyContext_AssemblyConnector() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyConnector_ProvidedRole_AssemblyConnector() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyConnector_RequiredRole_AssemblyConnector() {
		return (EReference)assemblyConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyEventConnector() {
		return assemblyEventConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyEventConnector_SinkRole__AssemblyEventConnector() {
		return (EReference)assemblyEventConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyEventConnector_SourceRole__AssemblyEventConnector() {
		return (EReference)assemblyEventConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyEventConnector_SinkAssemblyContext__AssemblyEventConnector() {
		return (EReference)assemblyEventConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyEventConnector_SourceAssemblyContext__AssemblyEventConnector() {
		return (EReference)assemblyEventConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyEventConnector_FilterCondition__AssemblyEventConnector() {
		return (EReference)assemblyEventConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceDelegationConnector() {
		return sourceDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourceDelegationConnector_InnerSourceRole__SourceRole() {
		return (EReference)sourceDelegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourceDelegationConnector_OuterSourceRole__SourceRole() {
		return (EReference)sourceDelegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourceDelegationConnector_AssemblyContext__SourceDelegationConnector() {
		return (EReference)sourceDelegationConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSinkDelegationConnector() {
		return sinkDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSinkDelegationConnector_AssemblyContext__SinkDelegationConnector() {
		return (EReference)sinkDelegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSinkDelegationConnector_InnerSinkRole__SinkRole() {
		return (EReference)sinkDelegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSinkDelegationConnector_OuterSinkRole__SinkRole() {
		return (EReference)sinkDelegationConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyInfrastructureConnector() {
		return assemblyInfrastructureConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyInfrastructureConnector_ProvidedRole__AssemblyInfrastructureConnector() {
		return (EReference)assemblyInfrastructureConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyInfrastructureConnector_RequiredRole__AssemblyInfrastructureConnector() {
		return (EReference)assemblyInfrastructureConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyInfrastructureConnector_ProvidingAssemblyContext__AssemblyInfrastructureConnector() {
		return (EReference)assemblyInfrastructureConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyInfrastructureConnector_RequiringAssemblyContext__AssemblyInfrastructureConnector() {
		return (EReference)assemblyInfrastructureConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedInfrastructureDelegationConnector() {
		return providedInfrastructureDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedInfrastructureDelegationConnector_InnerProvidedRole__ProvidedInfrastructureDelegationConnector() {
		return (EReference)providedInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedInfrastructureDelegationConnector_OuterProvidedRole__ProvidedInfrastructureDelegationConnector() {
		return (EReference)providedInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedInfrastructureDelegationConnector_AssemblyContext__ProvidedInfrastructureDelegationConnector() {
		return (EReference)providedInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredInfrastructureDelegationConnector() {
		return requiredInfrastructureDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredInfrastructureDelegationConnector_InnerRequiredRole__RequiredInfrastructureDelegationConnector() {
		return (EReference)requiredInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredInfrastructureDelegationConnector_OuterRequiredRole__RequiredInfrastructureDelegationConnector() {
		return (EReference)requiredInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredInfrastructureDelegationConnector_AssemblyContext__RequiredInfrastructureDelegationConnector() {
		return (EReference)requiredInfrastructureDelegationConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredResourceDelegationConnector() {
		return requiredResourceDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredResourceDelegationConnector_AssemblyContext__RequiredResourceDelegationConnector() {
		return (EReference)requiredResourceDelegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredResourceDelegationConnector_InnerRequiredRole__RequiredResourceDelegationConnector() {
		return (EReference)requiredResourceDelegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredResourceDelegationConnector_OuterRequiredRole__RequiredResourceDelegationConnector() {
		return (EReference)requiredResourceDelegationConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyContext() {
		return assemblyContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_ParentStructure__AssemblyContext() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_EncapsulatedComponent__AssemblyContext() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssemblyContext_ConfigParameterUsages__AssemblyContext() {
		return (EReference)assemblyContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionFactory getCompositionFactory() {
		return (CompositionFactory)getEFactoryInstance();
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
		delegationConnectorEClass = createEClass(DELEGATION_CONNECTOR);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__PARENT_STRUCTURE_CONNECTOR);

		composedStructureEClass = createEClass(COMPOSED_STRUCTURE);
		createEReference(composedStructureEClass, COMPOSED_STRUCTURE__ASSEMBLY_CONTEXTS_COMPOSED_STRUCTURE);
		createEReference(composedStructureEClass, COMPOSED_STRUCTURE__RESOURCE_REQUIRED_DELEGATION_CONNECTORS_COMPOSED_STRUCTURE);
		createEReference(composedStructureEClass, COMPOSED_STRUCTURE__EVENT_CHANNEL_COMPOSED_STRUCTURE);
		createEReference(composedStructureEClass, COMPOSED_STRUCTURE__CONNECTORS_COMPOSED_STRUCTURE);
		createEOperation(composedStructureEClass, COMPOSED_STRUCTURE___VALIDATE_SAME_SUBSYSTEM_MUST_NOT_BE_INSTANTIATED_MORE_THAN_ONCE__DIAGNOSTICCHAIN_MAP);

		resourceRequiredDelegationConnectorEClass = createEClass(RESOURCE_REQUIRED_DELEGATION_CONNECTOR);
		createEReference(resourceRequiredDelegationConnectorEClass, RESOURCE_REQUIRED_DELEGATION_CONNECTOR__INNER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR);
		createEReference(resourceRequiredDelegationConnectorEClass, RESOURCE_REQUIRED_DELEGATION_CONNECTOR__OUTER_RESOURCE_REQUIRED_ROLE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR);
		createEReference(resourceRequiredDelegationConnectorEClass, RESOURCE_REQUIRED_DELEGATION_CONNECTOR__PARENT_STRUCTURE_RESOURCE_REQUIRED_DELEGATION_CONNECTOR);

		eventChannelEClass = createEClass(EVENT_CHANNEL);
		createEReference(eventChannelEClass, EVENT_CHANNEL__EVENT_GROUP_EVENT_CHANNEL);
		createEReference(eventChannelEClass, EVENT_CHANNEL__EVENT_CHANNEL_SOURCE_CONNECTOR_EVENT_CHANNEL);
		createEReference(eventChannelEClass, EVENT_CHANNEL__EVENT_CHANNEL_SINK_CONNECTOR_EVENT_CHANNEL);
		createEReference(eventChannelEClass, EVENT_CHANNEL__PARENT_STRUCTURE_EVENT_CHANNEL);

		eventChannelSourceConnectorEClass = createEClass(EVENT_CHANNEL_SOURCE_CONNECTOR);
		createEReference(eventChannelSourceConnectorEClass, EVENT_CHANNEL_SOURCE_CONNECTOR__SOURCE_ROLE_EVENT_CHANNEL_SOURCE_ROLE);
		createEReference(eventChannelSourceConnectorEClass, EVENT_CHANNEL_SOURCE_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SOURCE_CONNECTOR);
		createEReference(eventChannelSourceConnectorEClass, EVENT_CHANNEL_SOURCE_CONNECTOR__EVENT_CHANNEL_EVENT_CHANNEL_SOURCE_CONNECTOR);

		eventChannelSinkConnectorEClass = createEClass(EVENT_CHANNEL_SINK_CONNECTOR);
		createEReference(eventChannelSinkConnectorEClass, EVENT_CHANNEL_SINK_CONNECTOR__SINK_ROLE_EVENT_CHANNEL_SINK_CONNECTOR);
		createEReference(eventChannelSinkConnectorEClass, EVENT_CHANNEL_SINK_CONNECTOR__FILTER_CONDITION_EVENT_CHANNEL_SINK_CONNECTOR);
		createEReference(eventChannelSinkConnectorEClass, EVENT_CHANNEL_SINK_CONNECTOR__ASSEMBLY_CONTEXT_EVENT_CHANNEL_SINK_CONNECTOR);
		createEReference(eventChannelSinkConnectorEClass, EVENT_CHANNEL_SINK_CONNECTOR__EVENT_CHANNEL_EVENT_CHANNEL_SINK_CONNECTOR);

		providedDelegationConnectorEClass = createEClass(PROVIDED_DELEGATION_CONNECTOR);
		createEReference(providedDelegationConnectorEClass, PROVIDED_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR);
		createEReference(providedDelegationConnectorEClass, PROVIDED_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_DELEGATION_CONNECTOR);
		createEReference(providedDelegationConnectorEClass, PROVIDED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_DELEGATION_CONNECTOR);

		requiredDelegationConnectorEClass = createEClass(REQUIRED_DELEGATION_CONNECTOR);
		createEReference(requiredDelegationConnectorEClass, REQUIRED_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR);
		createEReference(requiredDelegationConnectorEClass, REQUIRED_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_DELEGATION_CONNECTOR);
		createEReference(requiredDelegationConnectorEClass, REQUIRED_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_DELEGATION_CONNECTOR);

		assemblyConnectorEClass = createEClass(ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_CONNECTOR);
		createEReference(assemblyConnectorEClass, ASSEMBLY_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_CONNECTOR);

		assemblyEventConnectorEClass = createEClass(ASSEMBLY_EVENT_CONNECTOR);
		createEReference(assemblyEventConnectorEClass, ASSEMBLY_EVENT_CONNECTOR__SINK_ROLE_ASSEMBLY_EVENT_CONNECTOR);
		createEReference(assemblyEventConnectorEClass, ASSEMBLY_EVENT_CONNECTOR__SOURCE_ROLE_ASSEMBLY_EVENT_CONNECTOR);
		createEReference(assemblyEventConnectorEClass, ASSEMBLY_EVENT_CONNECTOR__SINK_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR);
		createEReference(assemblyEventConnectorEClass, ASSEMBLY_EVENT_CONNECTOR__SOURCE_ASSEMBLY_CONTEXT_ASSEMBLY_EVENT_CONNECTOR);
		createEReference(assemblyEventConnectorEClass, ASSEMBLY_EVENT_CONNECTOR__FILTER_CONDITION_ASSEMBLY_EVENT_CONNECTOR);

		sourceDelegationConnectorEClass = createEClass(SOURCE_DELEGATION_CONNECTOR);
		createEReference(sourceDelegationConnectorEClass, SOURCE_DELEGATION_CONNECTOR__INNER_SOURCE_ROLE_SOURCE_ROLE);
		createEReference(sourceDelegationConnectorEClass, SOURCE_DELEGATION_CONNECTOR__OUTER_SOURCE_ROLE_SOURCE_ROLE);
		createEReference(sourceDelegationConnectorEClass, SOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SOURCE_DELEGATION_CONNECTOR);

		sinkDelegationConnectorEClass = createEClass(SINK_DELEGATION_CONNECTOR);
		createEReference(sinkDelegationConnectorEClass, SINK_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_SINK_DELEGATION_CONNECTOR);
		createEReference(sinkDelegationConnectorEClass, SINK_DELEGATION_CONNECTOR__INNER_SINK_ROLE_SINK_ROLE);
		createEReference(sinkDelegationConnectorEClass, SINK_DELEGATION_CONNECTOR__OUTER_SINK_ROLE_SINK_ROLE);

		assemblyInfrastructureConnectorEClass = createEClass(ASSEMBLY_INFRASTRUCTURE_CONNECTOR);
		createEReference(assemblyInfrastructureConnectorEClass, ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR);
		createEReference(assemblyInfrastructureConnectorEClass, ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRED_ROLE_ASSEMBLY_INFRASTRUCTURE_CONNECTOR);
		createEReference(assemblyInfrastructureConnectorEClass, ASSEMBLY_INFRASTRUCTURE_CONNECTOR__PROVIDING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR);
		createEReference(assemblyInfrastructureConnectorEClass, ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REQUIRING_ASSEMBLY_CONTEXT_ASSEMBLY_INFRASTRUCTURE_CONNECTOR);

		providedInfrastructureDelegationConnectorEClass = createEClass(PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
		createEReference(providedInfrastructureDelegationConnectorEClass, PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_PROVIDED_ROLE_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
		createEReference(providedInfrastructureDelegationConnectorEClass, PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_PROVIDED_ROLE_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
		createEReference(providedInfrastructureDelegationConnectorEClass, PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR);

		requiredInfrastructureDelegationConnectorEClass = createEClass(REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
		createEReference(requiredInfrastructureDelegationConnectorEClass, REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
		createEReference(requiredInfrastructureDelegationConnectorEClass, REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR);
		createEReference(requiredInfrastructureDelegationConnectorEClass, REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR);

		requiredResourceDelegationConnectorEClass = createEClass(REQUIRED_RESOURCE_DELEGATION_CONNECTOR);
		createEReference(requiredResourceDelegationConnectorEClass, REQUIRED_RESOURCE_DELEGATION_CONNECTOR__ASSEMBLY_CONTEXT_REQUIRED_RESOURCE_DELEGATION_CONNECTOR);
		createEReference(requiredResourceDelegationConnectorEClass, REQUIRED_RESOURCE_DELEGATION_CONNECTOR__INNER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR);
		createEReference(requiredResourceDelegationConnectorEClass, REQUIRED_RESOURCE_DELEGATION_CONNECTOR__OUTER_REQUIRED_ROLE_REQUIRED_RESOURCE_DELEGATION_CONNECTOR);

		assemblyContextEClass = createEClass(ASSEMBLY_CONTEXT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__PARENT_STRUCTURE_ASSEMBLY_CONTEXT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__ENCAPSULATED_COMPONENT_ASSEMBLY_CONTEXT);
		createEReference(assemblyContextEClass, ASSEMBLY_CONTEXT__CONFIG_PARAMETER_USAGES_ASSEMBLY_CONTEXT);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		PcmPackage thePcmPackage = (PcmPackage)EPackage.Registry.INSTANCE.getEPackage(PcmPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ParameterPackage theParameterPackage = (ParameterPackage)EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		delegationConnectorEClass.getESuperTypes().add(this.getConnector());
		connectorEClass.getESuperTypes().add(theEntityPackage.getEntity());
		composedStructureEClass.getESuperTypes().add(theEntityPackage.getEntity());
		resourceRequiredDelegationConnectorEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		eventChannelEClass.getESuperTypes().add(theEntityPackage.getEntity());
		eventChannelSourceConnectorEClass.getESuperTypes().add(this.getConnector());
		eventChannelSinkConnectorEClass.getESuperTypes().add(this.getConnector());
		providedDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
		requiredDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
		assemblyConnectorEClass.getESuperTypes().add(this.getConnector());
		assemblyEventConnectorEClass.getESuperTypes().add(this.getConnector());
		sourceDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
		sinkDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
		assemblyInfrastructureConnectorEClass.getESuperTypes().add(this.getConnector());
		providedInfrastructureDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
		requiredInfrastructureDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
		requiredResourceDelegationConnectorEClass.getESuperTypes().add(this.getDelegationConnector());
		assemblyContextEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(delegationConnectorEClass, DelegationConnector.class, "DelegationConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorEClass, Connector.class, "Connector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_ParentStructure__Connector(), this.getComposedStructure(), this.getComposedStructure_Connectors__ComposedStructure(), "parentStructure__Connector", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(composedStructureEClass, ComposedStructure.class, "ComposedStructure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedStructure_AssemblyContexts__ComposedStructure(), this.getAssemblyContext(), this.getAssemblyContext_ParentStructure__AssemblyContext(), "assemblyContexts__ComposedStructure", null, 0, -1, ComposedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComposedStructure_ResourceRequiredDelegationConnectors_ComposedStructure(), this.getResourceRequiredDelegationConnector(), this.getResourceRequiredDelegationConnector_ParentStructure_ResourceRequiredDelegationConnector(), "resourceRequiredDelegationConnectors_ComposedStructure", null, 0, -1, ComposedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComposedStructure_EventChannel__ComposedStructure(), this.getEventChannel(), this.getEventChannel_ParentStructure__EventChannel(), "eventChannel__ComposedStructure", null, 0, -1, ComposedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComposedStructure_Connectors__ComposedStructure(), this.getConnector(), this.getConnector_ParentStructure__Connector(), "connectors__ComposedStructure", null, 0, -1, ComposedStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getComposedStructure__ValidateSameSubsystemMustNotBeInstantiatedMoreThanOnce__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validateSameSubsystemMustNotBeInstantiatedMoreThanOnce", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceRequiredDelegationConnectorEClass, ResourceRequiredDelegationConnector.class, "ResourceRequiredDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceRequiredDelegationConnector_InnerResourceRequiredRole_ResourceRequiredDelegationConnector(), theEntityPackage.getResourceRequiredRole(), null, "innerResourceRequiredRole_ResourceRequiredDelegationConnector", null, 1, 1, ResourceRequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceRequiredDelegationConnector_OuterResourceRequiredRole_ResourceRequiredDelegationConnector(), theEntityPackage.getResourceRequiredRole(), null, "outerResourceRequiredRole_ResourceRequiredDelegationConnector", null, 1, 1, ResourceRequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceRequiredDelegationConnector_ParentStructure_ResourceRequiredDelegationConnector(), this.getComposedStructure(), this.getComposedStructure_ResourceRequiredDelegationConnectors_ComposedStructure(), "parentStructure_ResourceRequiredDelegationConnector", null, 1, 1, ResourceRequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventChannelEClass, EventChannel.class, "EventChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChannel_EventGroup__EventChannel(), theRepositoryPackage.getEventGroup(), null, "eventGroup__EventChannel", null, 1, 1, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEventChannel_EventChannelSourceConnector__EventChannel(), this.getEventChannelSourceConnector(), this.getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector(), "eventChannelSourceConnector__EventChannel", null, 0, -1, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEventChannel_EventChannelSinkConnector__EventChannel(), this.getEventChannelSinkConnector(), this.getEventChannelSinkConnector_EventChannel__EventChannelSinkConnector(), "eventChannelSinkConnector__EventChannel", null, 0, -1, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEventChannel_ParentStructure__EventChannel(), this.getComposedStructure(), this.getComposedStructure_EventChannel__ComposedStructure(), "parentStructure__EventChannel", null, 1, 1, EventChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventChannelSourceConnectorEClass, EventChannelSourceConnector.class, "EventChannelSourceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChannelSourceConnector_SourceRole__EventChannelSourceRole(), theRepositoryPackage.getSourceRole(), null, "sourceRole__EventChannelSourceRole", null, 1, 1, EventChannelSourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEventChannelSourceConnector_AssemblyContext__EventChannelSourceConnector(), this.getAssemblyContext(), null, "assemblyContext__EventChannelSourceConnector", null, 1, 1, EventChannelSourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEventChannelSourceConnector_EventChannel__EventChannelSourceConnector(), this.getEventChannel(), this.getEventChannel_EventChannelSourceConnector__EventChannel(), "eventChannel__EventChannelSourceConnector", null, 1, 1, EventChannelSourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventChannelSinkConnectorEClass, EventChannelSinkConnector.class, "EventChannelSinkConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChannelSinkConnector_SinkRole__EventChannelSinkConnector(), theRepositoryPackage.getSinkRole(), null, "sinkRole__EventChannelSinkConnector", null, 1, 1, EventChannelSinkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEventChannelSinkConnector_FilterCondition__EventChannelSinkConnector(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_EventChannelSinkConnector__FilterCondition(), "filterCondition__EventChannelSinkConnector", null, 0, 1, EventChannelSinkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEventChannelSinkConnector_AssemblyContext__EventChannelSinkConnector(), this.getAssemblyContext(), null, "assemblyContext__EventChannelSinkConnector", null, 1, 1, EventChannelSinkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEventChannelSinkConnector_EventChannel__EventChannelSinkConnector(), this.getEventChannel(), this.getEventChannel_EventChannelSinkConnector__EventChannel(), "eventChannel__EventChannelSinkConnector", null, 1, 1, EventChannelSinkConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(providedDelegationConnectorEClass, ProvidedDelegationConnector.class, "ProvidedDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedDelegationConnector_InnerProvidedRole_ProvidedDelegationConnector(), theRepositoryPackage.getOperationProvidedRole(), null, "innerProvidedRole_ProvidedDelegationConnector", null, 1, 1, ProvidedDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProvidedDelegationConnector_OuterProvidedRole_ProvidedDelegationConnector(), theRepositoryPackage.getOperationProvidedRole(), null, "outerProvidedRole_ProvidedDelegationConnector", null, 1, 1, ProvidedDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProvidedDelegationConnector_AssemblyContext_ProvidedDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext_ProvidedDelegationConnector", null, 1, 1, ProvidedDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requiredDelegationConnectorEClass, RequiredDelegationConnector.class, "RequiredDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredDelegationConnector_InnerRequiredRole_RequiredDelegationConnector(), theRepositoryPackage.getOperationRequiredRole(), null, "innerRequiredRole_RequiredDelegationConnector", null, 1, 1, RequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequiredDelegationConnector_OuterRequiredRole_RequiredDelegationConnector(), theRepositoryPackage.getOperationRequiredRole(), null, "outerRequiredRole_RequiredDelegationConnector", null, 1, 1, RequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequiredDelegationConnector_AssemblyContext_RequiredDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext_RequiredDelegationConnector", null, 1, 1, RequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assemblyConnectorEClass, AssemblyConnector.class, "AssemblyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyConnector_RequiringAssemblyContext_AssemblyConnector(), this.getAssemblyContext(), null, "requiringAssemblyContext_AssemblyConnector", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyConnector_ProvidingAssemblyContext_AssemblyConnector(), this.getAssemblyContext(), null, "providingAssemblyContext_AssemblyConnector", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyConnector_ProvidedRole_AssemblyConnector(), theRepositoryPackage.getOperationProvidedRole(), null, "providedRole_AssemblyConnector", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyConnector_RequiredRole_AssemblyConnector(), theRepositoryPackage.getOperationRequiredRole(), null, "requiredRole_AssemblyConnector", null, 1, 1, AssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assemblyEventConnectorEClass, AssemblyEventConnector.class, "AssemblyEventConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyEventConnector_SinkRole__AssemblyEventConnector(), theRepositoryPackage.getSinkRole(), null, "sinkRole__AssemblyEventConnector", null, 1, 1, AssemblyEventConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyEventConnector_SourceRole__AssemblyEventConnector(), theRepositoryPackage.getSourceRole(), null, "sourceRole__AssemblyEventConnector", null, 1, 1, AssemblyEventConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyEventConnector_SinkAssemblyContext__AssemblyEventConnector(), this.getAssemblyContext(), null, "sinkAssemblyContext__AssemblyEventConnector", null, 1, 1, AssemblyEventConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyEventConnector_SourceAssemblyContext__AssemblyEventConnector(), this.getAssemblyContext(), null, "sourceAssemblyContext__AssemblyEventConnector", null, 1, 1, AssemblyEventConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyEventConnector_FilterCondition__AssemblyEventConnector(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_AssemblyEventConnector__FilterCondition(), "filterCondition__AssemblyEventConnector", null, 0, 1, AssemblyEventConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sourceDelegationConnectorEClass, SourceDelegationConnector.class, "SourceDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceDelegationConnector_InnerSourceRole__SourceRole(), theRepositoryPackage.getSourceRole(), null, "innerSourceRole__SourceRole", null, 1, 1, SourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSourceDelegationConnector_OuterSourceRole__SourceRole(), theRepositoryPackage.getSourceRole(), null, "outerSourceRole__SourceRole", null, 1, 1, SourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSourceDelegationConnector_AssemblyContext__SourceDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext__SourceDelegationConnector", null, 1, 1, SourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sinkDelegationConnectorEClass, SinkDelegationConnector.class, "SinkDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSinkDelegationConnector_AssemblyContext__SinkDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext__SinkDelegationConnector", null, 1, 1, SinkDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSinkDelegationConnector_InnerSinkRole__SinkRole(), theRepositoryPackage.getSinkRole(), null, "innerSinkRole__SinkRole", null, 1, 1, SinkDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSinkDelegationConnector_OuterSinkRole__SinkRole(), theRepositoryPackage.getSinkRole(), null, "outerSinkRole__SinkRole", null, 1, 1, SinkDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assemblyInfrastructureConnectorEClass, AssemblyInfrastructureConnector.class, "AssemblyInfrastructureConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyInfrastructureConnector_ProvidedRole__AssemblyInfrastructureConnector(), theRepositoryPackage.getInfrastructureProvidedRole(), null, "providedRole__AssemblyInfrastructureConnector", null, 1, 1, AssemblyInfrastructureConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyInfrastructureConnector_RequiredRole__AssemblyInfrastructureConnector(), theRepositoryPackage.getInfrastructureRequiredRole(), null, "requiredRole__AssemblyInfrastructureConnector", null, 1, 1, AssemblyInfrastructureConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyInfrastructureConnector_ProvidingAssemblyContext__AssemblyInfrastructureConnector(), this.getAssemblyContext(), null, "providingAssemblyContext__AssemblyInfrastructureConnector", null, 1, 1, AssemblyInfrastructureConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyInfrastructureConnector_RequiringAssemblyContext__AssemblyInfrastructureConnector(), this.getAssemblyContext(), null, "requiringAssemblyContext__AssemblyInfrastructureConnector", null, 0, 1, AssemblyInfrastructureConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(providedInfrastructureDelegationConnectorEClass, ProvidedInfrastructureDelegationConnector.class, "ProvidedInfrastructureDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedInfrastructureDelegationConnector_InnerProvidedRole__ProvidedInfrastructureDelegationConnector(), theRepositoryPackage.getInfrastructureProvidedRole(), null, "innerProvidedRole__ProvidedInfrastructureDelegationConnector", null, 1, 1, ProvidedInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProvidedInfrastructureDelegationConnector_OuterProvidedRole__ProvidedInfrastructureDelegationConnector(), theRepositoryPackage.getInfrastructureProvidedRole(), null, "outerProvidedRole__ProvidedInfrastructureDelegationConnector", null, 1, 1, ProvidedInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProvidedInfrastructureDelegationConnector_AssemblyContext__ProvidedInfrastructureDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext__ProvidedInfrastructureDelegationConnector", null, 1, 1, ProvidedInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requiredInfrastructureDelegationConnectorEClass, RequiredInfrastructureDelegationConnector.class, "RequiredInfrastructureDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredInfrastructureDelegationConnector_InnerRequiredRole__RequiredInfrastructureDelegationConnector(), theRepositoryPackage.getInfrastructureRequiredRole(), null, "innerRequiredRole__RequiredInfrastructureDelegationConnector", null, 1, 1, RequiredInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequiredInfrastructureDelegationConnector_OuterRequiredRole__RequiredInfrastructureDelegationConnector(), theRepositoryPackage.getInfrastructureRequiredRole(), null, "outerRequiredRole__RequiredInfrastructureDelegationConnector", null, 1, 1, RequiredInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequiredInfrastructureDelegationConnector_AssemblyContext__RequiredInfrastructureDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext__RequiredInfrastructureDelegationConnector", null, 1, 1, RequiredInfrastructureDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requiredResourceDelegationConnectorEClass, RequiredResourceDelegationConnector.class, "RequiredResourceDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredResourceDelegationConnector_AssemblyContext__RequiredResourceDelegationConnector(), this.getAssemblyContext(), null, "assemblyContext__RequiredResourceDelegationConnector", null, 1, 1, RequiredResourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequiredResourceDelegationConnector_InnerRequiredRole__RequiredResourceDelegationConnector(), theEntityPackage.getResourceRequiredRole(), null, "innerRequiredRole__RequiredResourceDelegationConnector", null, 1, 1, RequiredResourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequiredResourceDelegationConnector_OuterRequiredRole__RequiredResourceDelegationConnector(), theEntityPackage.getResourceRequiredRole(), null, "outerRequiredRole__RequiredResourceDelegationConnector", null, 1, 1, RequiredResourceDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assemblyContextEClass, AssemblyContext.class, "AssemblyContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyContext_ParentStructure__AssemblyContext(), this.getComposedStructure(), this.getComposedStructure_AssemblyContexts__ComposedStructure(), "parentStructure__AssemblyContext", null, 1, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyContext_EncapsulatedComponent__AssemblyContext(), theRepositoryPackage.getRepositoryComponent(), null, "encapsulatedComponent__AssemblyContext", null, 1, 1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssemblyContext_ConfigParameterUsages__AssemblyContext(), theParameterPackage.getVariableUsage(), theParameterPackage.getVariableUsage_AssemblyContext__VariableUsage(), "configParameterUsages__AssemblyContext", null, 0, -1, AssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/LPG
		createLPGAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG"
		   });
		addAnnotation
		  (composedStructureEClass,
		   source,
		   new String[] {
			   "constraints", "multipleConnectorsConstraint multipleConnectorsConstraintForAssemblyConnectors"
		   });
		addAnnotation
		  (getComposedStructure__ValidateSameSubsystemMustNotBeInstantiatedMoreThanOnce__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "invariant", "true"
		   });
		addAnnotation
		  (providedDelegationConnectorEClass,
		   source,
		   new String[] {
			   "constraints", "componentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame providedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure"
		   });
		addAnnotation
		  (requiredDelegationConnectorEClass,
		   source,
		   new String[] {
			   "constraints", "componentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame requiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector requiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure"
		   });
		addAnnotation
		  (assemblyConnectorEClass,
		   source,
		   new String[] {
			   "constraints", "assemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch assemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch assemblyConnectorsReferencedInterfacesMustMatch"
		   });
		addAnnotation
		  (assemblyInfrastructureConnectorEClass,
		   source,
		   new String[] {
			   "constraints", "referencedInfrastructureRequiredRoleNotRequiredByAssemblyContext InfrastructureInterfacesNotCompatible referencedInfrastructureProvidedRoleNotProvidedByAssemblyContext"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/LPG</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLPGAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG";
		addAnnotation
		  (composedStructureEClass,
		   source,
		   new String[] {
			   "multipleConnectorsConstraint", "self.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(pcm::core::composition::ProvidedDelegationConnector)).oclAsType(pcm::core::composition::ProvidedDelegationConnector)->forAll( c1, c2 | c1 <> c2 implies c1.outerProvidedRole_ProvidedDelegationConnector <> c2.outerProvidedRole_ProvidedDelegationConnector)\r\n",
			   "multipleConnectorsConstraintForAssemblyConnectors", "self.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(pcm::core::composition::AssemblyConnector)).oclAsType(AssemblyConnector)->forAll( c1, c2 | ( (c1 <> c2) and ( c1.requiringAssemblyContext_AssemblyConnector = c2.requiringAssemblyContext_AssemblyConnector ) ) implies c1.requiredRole_AssemblyConnector <> c2.requiredRole_AssemblyConnector )\r\n"
		   });
		addAnnotation
		  (providedDelegationConnectorEClass,
		   source,
		   new String[] {
			   "componentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame", "self.innerProvidedRole_ProvidedDelegationConnector.providingEntity_ProvidedRole = self.assemblyContext_ProvidedDelegationConnector.encapsulatedComponent__AssemblyContext",
			   "providedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure", "self.parentStructure__Connector = self.assemblyContext_ProvidedDelegationConnector.parentStructure__AssemblyContext"
		   });
		addAnnotation
		  (requiredDelegationConnectorEClass,
		   source,
		   new String[] {
			   "componentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame", "self.innerRequiredRole_RequiredDelegationConnector.requiringEntity_RequiredRole = self.assemblyContext_RequiredDelegationConnector.encapsulatedComponent__AssemblyContext",
			   "requiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector", "self.outerRequiredRole_RequiredDelegationConnector.requiringEntity_RequiredRole=self.parentStructure__Connector",
			   "requiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure", "self.parentStructure__Connector = self.assemblyContext_RequiredDelegationConnector.parentStructure__AssemblyContext"
		   });
		addAnnotation
		  (assemblyConnectorEClass,
		   source,
		   new String[] {
			   "assemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch", "self.providingAssemblyContext_AssemblyConnector.encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity->includes(self.providedRole_AssemblyConnector)\r\n\r\n",
			   "assemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch", "self.requiringAssemblyContext_AssemblyConnector.encapsulatedComponent__AssemblyContext.requiredRoles_InterfaceRequiringEntity->includes(self.requiredRole_AssemblyConnector)\r\n\r\n",
			   "assemblyConnectorsReferencedInterfacesMustMatch", "self.providedRole_AssemblyConnector.providedInterface__OperationProvidedRole = self.requiredRole_AssemblyConnector.requiredInterface__OperationRequiredRole"
		   });
		addAnnotation
		  (assemblyInfrastructureConnectorEClass,
		   source,
		   new String[] {
			   "referencedInfrastructureProvidedRoleNotProvidedByAssemblyContext", "self.providingAssemblyContext__AssemblyInfrastructureConnector.encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity->includes(self.providedRole__AssemblyInfrastructureConnector)\n",
			   "referencedInfrastructureRequiredRoleNotRequiredByAssemblyContext", "self.requiringAssemblyContext__AssemblyInfrastructureConnector.encapsulatedComponent__AssemblyContext.requiredRoles_InterfaceRequiringEntity->includes(self.requiredRole__AssemblyInfrastructureConnector)",
			   "InfrastructureInterfacesNotCompatible", "\tself.providedRole__AssemblyInfrastructureConnector.providedInterface__InfrastructureProvidedRole = self.requiredRole__AssemblyInfrastructureConnector.requiredInterface__InfrastructureRequiredRole  or self.providedRole__AssemblyInfrastructureConnector.providedInterface__InfrastructureProvidedRole.parentInterfaces__Interface->includes(self.requiredRole__AssemblyInfrastructureConnector.requiredInterface__InfrastructureRequiredRole)"
		   });
	}

} //CompositionPackageImpl

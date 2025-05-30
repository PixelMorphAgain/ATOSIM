/**
 */
package pcm.usagemodel.impl;

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

import pcm.usagemodel.AbstractUserAction;
import pcm.usagemodel.Branch;
import pcm.usagemodel.BranchTransition;
import pcm.usagemodel.ClosedWorkload;
import pcm.usagemodel.Delay;
import pcm.usagemodel.EntryLevelSystemCall;
import pcm.usagemodel.Loop;
import pcm.usagemodel.OpenWorkload;
import pcm.usagemodel.ScenarioBehaviour;
import pcm.usagemodel.Start;
import pcm.usagemodel.Stop;
import pcm.usagemodel.UsageModel;
import pcm.usagemodel.UsageScenario;
import pcm.usagemodel.UsagemodelFactory;
import pcm.usagemodel.UsagemodelPackage;
import pcm.usagemodel.UserData;
import pcm.usagemodel.Workload;

import pcm.usagemodel.util.UsagemodelValidator;

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
public class UsagemodelPackageImpl extends EPackageImpl implements UsagemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryLevelSystemCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractUserActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openWorkloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closedWorkloadEClass = null;

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
	 * @see pcm.usagemodel.UsagemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsagemodelPackageImpl() {
		super(eNS_URI, UsagemodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UsagemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UsagemodelPackage init() {
		if (isInited) return (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUsagemodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UsagemodelPackageImpl theUsagemodelPackage = registeredUsagemodelPackage instanceof UsagemodelPackageImpl ? (UsagemodelPackageImpl)registeredUsagemodelPackage : new UsagemodelPackageImpl();

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
		theUsagemodelPackage.createPackageContents();
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
		theUsagemodelPackage.initializePackageContents();
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
			(theUsagemodelPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return UsagemodelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUsagemodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UsagemodelPackage.eNS_URI, theUsagemodelPackage);
		return theUsagemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkload() {
		return workloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkload_UsageScenario_Workload() {
		return (EReference)workloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsageScenario() {
		return usageScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageScenario_UsageModel_UsageScenario() {
		return (EReference)usageScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageScenario_ScenarioBehaviour_UsageScenario() {
		return (EReference)usageScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageScenario_Workload_UsageScenario() {
		return (EReference)usageScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserData() {
		return userDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserData_AssemblyContext_userData() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserData_UsageModel_UserData() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserData_UserDataParameterUsages_UserData() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsageModel() {
		return usageModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageModel_UsageScenario_UsageModel() {
		return (EReference)usageModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageModel_UserData_UsageModel() {
		return (EReference)usageModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntryLevelSystemCall() {
		return entryLevelSystemCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryLevelSystemCall_ProvidedRole_EntryLevelSystemCall() {
		return (EReference)entryLevelSystemCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryLevelSystemCall_OperationSignature__EntryLevelSystemCall() {
		return (EReference)entryLevelSystemCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryLevelSystemCall_OutputParameterUsages_EntryLevelSystemCall() {
		return (EReference)entryLevelSystemCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntryLevelSystemCall_Priority() {
		return (EAttribute)entryLevelSystemCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntryLevelSystemCall_InputParameterUsages_EntryLevelSystemCall() {
		return (EReference)entryLevelSystemCallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractUserAction() {
		return abstractUserActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractUserAction_Successor() {
		return (EReference)abstractUserActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractUserAction_Predecessor() {
		return (EReference)abstractUserActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractUserAction_ScenarioBehaviour_AbstractUserAction() {
		return (EReference)abstractUserActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScenarioBehaviour() {
		return scenarioBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenarioBehaviour_UsageScenario_SenarioBehaviour() {
		return (EReference)scenarioBehaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenarioBehaviour_BranchTransition_ScenarioBehaviour() {
		return (EReference)scenarioBehaviourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenarioBehaviour_Loop_ScenarioBehaviour() {
		return (EReference)scenarioBehaviourEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenarioBehaviour_Actions_ScenarioBehaviour() {
		return (EReference)scenarioBehaviourEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScenarioBehaviour__RouteFromStartToStopAction__DiagnosticChain_Map() {
		return scenarioBehaviourEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBranchTransition() {
		return branchTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranchTransition_BranchProbability() {
		return (EAttribute)branchTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBranchTransition_Branch_BranchTransition() {
		return (EReference)branchTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBranchTransition_BranchedBehaviour_BranchTransition() {
		return (EReference)branchTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBranch_BranchTransitions_Branch() {
		return (EReference)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoop_LoopIteration_Loop() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoop_BodyBehaviour_Loop() {
		return (EReference)loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStop() {
		return stopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpenWorkload() {
		return openWorkloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOpenWorkload_InterArrivalTime_OpenWorkload() {
		return (EReference)openWorkloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelay_TimeSpecification_Delay() {
		return (EReference)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClosedWorkload() {
		return closedWorkloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClosedWorkload_Population() {
		return (EAttribute)closedWorkloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClosedWorkload_ThinkTime_ClosedWorkload() {
		return (EReference)closedWorkloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsagemodelFactory getUsagemodelFactory() {
		return (UsagemodelFactory)getEFactoryInstance();
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
		workloadEClass = createEClass(WORKLOAD);
		createEReference(workloadEClass, WORKLOAD__USAGE_SCENARIO_WORKLOAD);

		usageScenarioEClass = createEClass(USAGE_SCENARIO);
		createEReference(usageScenarioEClass, USAGE_SCENARIO__USAGE_MODEL_USAGE_SCENARIO);
		createEReference(usageScenarioEClass, USAGE_SCENARIO__SCENARIO_BEHAVIOUR_USAGE_SCENARIO);
		createEReference(usageScenarioEClass, USAGE_SCENARIO__WORKLOAD_USAGE_SCENARIO);

		userDataEClass = createEClass(USER_DATA);
		createEReference(userDataEClass, USER_DATA__ASSEMBLY_CONTEXT_USER_DATA);
		createEReference(userDataEClass, USER_DATA__USAGE_MODEL_USER_DATA);
		createEReference(userDataEClass, USER_DATA__USER_DATA_PARAMETER_USAGES_USER_DATA);

		usageModelEClass = createEClass(USAGE_MODEL);
		createEReference(usageModelEClass, USAGE_MODEL__USAGE_SCENARIO_USAGE_MODEL);
		createEReference(usageModelEClass, USAGE_MODEL__USER_DATA_USAGE_MODEL);

		entryLevelSystemCallEClass = createEClass(ENTRY_LEVEL_SYSTEM_CALL);
		createEReference(entryLevelSystemCallEClass, ENTRY_LEVEL_SYSTEM_CALL__PROVIDED_ROLE_ENTRY_LEVEL_SYSTEM_CALL);
		createEReference(entryLevelSystemCallEClass, ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_ENTRY_LEVEL_SYSTEM_CALL);
		createEReference(entryLevelSystemCallEClass, ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_ENTRY_LEVEL_SYSTEM_CALL);
		createEAttribute(entryLevelSystemCallEClass, ENTRY_LEVEL_SYSTEM_CALL__PRIORITY);
		createEReference(entryLevelSystemCallEClass, ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_ENTRY_LEVEL_SYSTEM_CALL);

		abstractUserActionEClass = createEClass(ABSTRACT_USER_ACTION);
		createEReference(abstractUserActionEClass, ABSTRACT_USER_ACTION__SUCCESSOR);
		createEReference(abstractUserActionEClass, ABSTRACT_USER_ACTION__PREDECESSOR);
		createEReference(abstractUserActionEClass, ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION);

		scenarioBehaviourEClass = createEClass(SCENARIO_BEHAVIOUR);
		createEReference(scenarioBehaviourEClass, SCENARIO_BEHAVIOUR__USAGE_SCENARIO_SENARIO_BEHAVIOUR);
		createEReference(scenarioBehaviourEClass, SCENARIO_BEHAVIOUR__BRANCH_TRANSITION_SCENARIO_BEHAVIOUR);
		createEReference(scenarioBehaviourEClass, SCENARIO_BEHAVIOUR__LOOP_SCENARIO_BEHAVIOUR);
		createEReference(scenarioBehaviourEClass, SCENARIO_BEHAVIOUR__ACTIONS_SCENARIO_BEHAVIOUR);
		createEOperation(scenarioBehaviourEClass, SCENARIO_BEHAVIOUR___ROUTE_FROM_START_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP);

		branchTransitionEClass = createEClass(BRANCH_TRANSITION);
		createEAttribute(branchTransitionEClass, BRANCH_TRANSITION__BRANCH_PROBABILITY);
		createEReference(branchTransitionEClass, BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION);
		createEReference(branchTransitionEClass, BRANCH_TRANSITION__BRANCHED_BEHAVIOUR_BRANCH_TRANSITION);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__BRANCH_TRANSITIONS_BRANCH);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__LOOP_ITERATION_LOOP);
		createEReference(loopEClass, LOOP__BODY_BEHAVIOUR_LOOP);

		stopEClass = createEClass(STOP);

		startEClass = createEClass(START);

		openWorkloadEClass = createEClass(OPEN_WORKLOAD);
		createEReference(openWorkloadEClass, OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD);

		delayEClass = createEClass(DELAY);
		createEReference(delayEClass, DELAY__TIME_SPECIFICATION_DELAY);

		closedWorkloadEClass = createEClass(CLOSED_WORKLOAD);
		createEAttribute(closedWorkloadEClass, CLOSED_WORKLOAD__POPULATION);
		createEReference(closedWorkloadEClass, CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD);
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
		PcmPackage thePcmPackage = (PcmPackage)EPackage.Registry.INSTANCE.getEPackage(PcmPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		ParameterPackage theParameterPackage = (ParameterPackage)EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workloadEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		usageScenarioEClass.getESuperTypes().add(theEntityPackage.getEntity());
		userDataEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		usageModelEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		entryLevelSystemCallEClass.getESuperTypes().add(this.getAbstractUserAction());
		abstractUserActionEClass.getESuperTypes().add(theEntityPackage.getEntity());
		scenarioBehaviourEClass.getESuperTypes().add(theEntityPackage.getEntity());
		branchTransitionEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		branchEClass.getESuperTypes().add(this.getAbstractUserAction());
		loopEClass.getESuperTypes().add(this.getAbstractUserAction());
		stopEClass.getESuperTypes().add(this.getAbstractUserAction());
		startEClass.getESuperTypes().add(this.getAbstractUserAction());
		openWorkloadEClass.getESuperTypes().add(this.getWorkload());
		delayEClass.getESuperTypes().add(this.getAbstractUserAction());
		closedWorkloadEClass.getESuperTypes().add(this.getWorkload());

		// Initialize classes, features, and operations; add parameters
		initEClass(workloadEClass, Workload.class, "Workload", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkload_UsageScenario_Workload(), this.getUsageScenario(), this.getUsageScenario_Workload_UsageScenario(), "usageScenario_Workload", null, 1, 1, Workload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(usageScenarioEClass, UsageScenario.class, "UsageScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageScenario_UsageModel_UsageScenario(), this.getUsageModel(), this.getUsageModel_UsageScenario_UsageModel(), "usageModel_UsageScenario", null, 1, 1, UsageScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUsageScenario_ScenarioBehaviour_UsageScenario(), this.getScenarioBehaviour(), this.getScenarioBehaviour_UsageScenario_SenarioBehaviour(), "scenarioBehaviour_UsageScenario", null, 1, 1, UsageScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUsageScenario_Workload_UsageScenario(), this.getWorkload(), this.getWorkload_UsageScenario_Workload(), "workload_UsageScenario", null, 1, 1, UsageScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(userDataEClass, UserData.class, "UserData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserData_AssemblyContext_userData(), theCompositionPackage.getAssemblyContext(), null, "assemblyContext_userData", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserData_UsageModel_UserData(), this.getUsageModel(), this.getUsageModel_UserData_UsageModel(), "usageModel_UserData", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserData_UserDataParameterUsages_UserData(), theParameterPackage.getVariableUsage(), theParameterPackage.getVariableUsage_UserData_VariableUsage(), "userDataParameterUsages_UserData", null, 0, -1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(usageModelEClass, UsageModel.class, "UsageModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageModel_UsageScenario_UsageModel(), this.getUsageScenario(), this.getUsageScenario_UsageModel_UsageScenario(), "usageScenario_UsageModel", null, 0, -1, UsageModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUsageModel_UserData_UsageModel(), this.getUserData(), this.getUserData_UsageModel_UserData(), "userData_UsageModel", null, 0, -1, UsageModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(entryLevelSystemCallEClass, EntryLevelSystemCall.class, "EntryLevelSystemCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryLevelSystemCall_ProvidedRole_EntryLevelSystemCall(), theRepositoryPackage.getOperationProvidedRole(), null, "providedRole_EntryLevelSystemCall", null, 1, 1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntryLevelSystemCall_OperationSignature__EntryLevelSystemCall(), theRepositoryPackage.getOperationSignature(), null, "operationSignature__EntryLevelSystemCall", null, 1, 1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntryLevelSystemCall_OutputParameterUsages_EntryLevelSystemCall(), theParameterPackage.getVariableUsage(), theParameterPackage.getVariableUsage_EntryLevelSystemCall_OutputParameterUsage(), "outputParameterUsages_EntryLevelSystemCall", null, 0, -1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEntryLevelSystemCall_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEntryLevelSystemCall_InputParameterUsages_EntryLevelSystemCall(), theParameterPackage.getVariableUsage(), theParameterPackage.getVariableUsage_EntryLevelSystemCall_InputParameterUsage(), "inputParameterUsages_EntryLevelSystemCall", null, 0, -1, EntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractUserActionEClass, AbstractUserAction.class, "AbstractUserAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractUserAction_Successor(), this.getAbstractUserAction(), this.getAbstractUserAction_Predecessor(), "successor", null, 0, 1, AbstractUserAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractUserAction_Predecessor(), this.getAbstractUserAction(), this.getAbstractUserAction_Successor(), "predecessor", null, 0, 1, AbstractUserAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractUserAction_ScenarioBehaviour_AbstractUserAction(), this.getScenarioBehaviour(), this.getScenarioBehaviour_Actions_ScenarioBehaviour(), "scenarioBehaviour_AbstractUserAction", null, 1, 1, AbstractUserAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scenarioBehaviourEClass, ScenarioBehaviour.class, "ScenarioBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarioBehaviour_UsageScenario_SenarioBehaviour(), this.getUsageScenario(), this.getUsageScenario_ScenarioBehaviour_UsageScenario(), "usageScenario_SenarioBehaviour", null, 0, 1, ScenarioBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenarioBehaviour_BranchTransition_ScenarioBehaviour(), this.getBranchTransition(), this.getBranchTransition_BranchedBehaviour_BranchTransition(), "branchTransition_ScenarioBehaviour", null, 0, 1, ScenarioBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenarioBehaviour_Loop_ScenarioBehaviour(), this.getLoop(), this.getLoop_BodyBehaviour_Loop(), "loop_ScenarioBehaviour", null, 0, 1, ScenarioBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenarioBehaviour_Actions_ScenarioBehaviour(), this.getAbstractUserAction(), this.getAbstractUserAction_ScenarioBehaviour_AbstractUserAction(), "actions_ScenarioBehaviour", null, 0, -1, ScenarioBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getScenarioBehaviour__RouteFromStartToStopAction__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "routeFromStartToStopAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(branchTransitionEClass, BranchTransition.class, "BranchTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranchTransition_BranchProbability(), ecorePackage.getEDouble(), "branchProbability", null, 1, 1, BranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBranchTransition_Branch_BranchTransition(), this.getBranch(), this.getBranch_BranchTransitions_Branch(), "branch_BranchTransition", null, 1, 1, BranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBranchTransition_BranchedBehaviour_BranchTransition(), this.getScenarioBehaviour(), this.getScenarioBehaviour_BranchTransition_ScenarioBehaviour(), "branchedBehaviour_BranchTransition", null, 1, 1, BranchTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_BranchTransitions_Branch(), this.getBranchTransition(), this.getBranchTransition_Branch_BranchTransition(), "branchTransitions_Branch", null, 0, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_LoopIteration_Loop(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_Loop_LoopIteration(), "loopIteration_Loop", null, 1, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoop_BodyBehaviour_Loop(), this.getScenarioBehaviour(), this.getScenarioBehaviour_Loop_ScenarioBehaviour(), "bodyBehaviour_Loop", null, 1, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openWorkloadEClass, OpenWorkload.class, "OpenWorkload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenWorkload_InterArrivalTime_OpenWorkload(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_OpenWorkload_PCMRandomVariable(), "interArrivalTime_OpenWorkload", null, 1, 1, OpenWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelay_TimeSpecification_Delay(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_Delay_TimeSpecification(), "timeSpecification_Delay", null, 1, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(closedWorkloadEClass, ClosedWorkload.class, "ClosedWorkload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClosedWorkload_Population(), ecorePackage.getEInt(), "population", null, 1, 1, ClosedWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClosedWorkload_ThinkTime_ClosedWorkload(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_ClosedWorkload_PCMRandomVariable(), "thinkTime_ClosedWorkload", null, 1, 1, ClosedWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
		  (entryLevelSystemCallEClass,
		   source,
		   new String[] {
			   "constraints", "entryLevelSystemCallMustReferenceProvidedRoleOfASystem entryLevelSystemCallSignatureMustMatchItsProvidedRole"
		   });
		addAnnotation
		  (scenarioBehaviourEClass,
		   source,
		   new String[] {
			   "constraints", "eachuseractionexceptStartandStopmusthaveapredecessorandsuccessor exactlyonestart exactlyonestop"
		   });
		addAnnotation
		  (getScenarioBehaviour__RouteFromStartToStopAction__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "invariant", "true"
		   });
		addAnnotation
		  (branchEClass,
		   source,
		   new String[] {
			   "constraints", "allBranchProbabilitiesMustSumUpTo1"
		   });
		addAnnotation
		  (stopEClass,
		   source,
		   new String[] {
			   "constraints", "stopHasNoSuccessor"
		   });
		addAnnotation
		  (startEClass,
		   source,
		   new String[] {
			   "constraints", "startHasNoPredecessor"
		   });
		addAnnotation
		  (openWorkloadEClass,
		   source,
		   new String[] {
			   "constraints", "interArrivalTimeInOpenWorkloadNeedsToBeSpecified"
		   });
		addAnnotation
		  (closedWorkloadEClass,
		   source,
		   new String[] {
			   "constraints", "populationInClosedWorkloadNeedsToBeGreaterZero thinkTimeInClosedWorkloadNeedsToBeSpecified"
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
		  (entryLevelSystemCallEClass,
		   source,
		   new String[] {
			   "entryLevelSystemCallMustReferenceProvidedRoleOfASystem", "self.providedRole_EntryLevelSystemCall.providingEntity_ProvidedRole.oclIsTypeOf(pcm::system::System)",
			   "entryLevelSystemCallSignatureMustMatchItsProvidedRole", "self.providedRole_EntryLevelSystemCall.providedInterface__OperationProvidedRole.signatures__OperationInterface->includes(self.operationSignature__EntryLevelSystemCall)"
		   });
		addAnnotation
		  (scenarioBehaviourEClass,
		   source,
		   new String[] {
			   "eachuseractionexceptStartandStopmusthaveapredecessorandsuccessor", "not self.actions_ScenarioBehaviour->select(s|not s.oclIsTypeOf(Start) and not s.oclIsTypeOf(Stop))->exists(a|a.oclAsType(AbstractUserAction).predecessor.oclIsUndefined()) and not self.actions_ScenarioBehaviour->select(s|not s.oclIsTypeOf(Start) and not s.oclIsTypeOf(Stop))->exists(a|a.oclAsType(AbstractUserAction).successor.oclIsUndefined())",
			   "exactlyonestart", "self.actions_ScenarioBehaviour->select(s|s.oclIsTypeOf(Start))->size() = 1",
			   "exactlyonestop", "self.actions_ScenarioBehaviour->select(s|s.oclIsTypeOf(Stop))->size() = 1"
		   });
		addAnnotation
		  (branchEClass,
		   source,
		   new String[] {
			   "allBranchProbabilitiesMustSumUpTo1", "self->collect(branchTransitions_Branch.branchProbability)->sum() > 0.999 and self->collect(branchTransitions_Branch.branchProbability)->sum() <1.001"
		   });
		addAnnotation
		  (stopEClass,
		   source,
		   new String[] {
			   "stopHasNoSuccessor", "self.successor.oclIsUndefined()"
		   });
		addAnnotation
		  (startEClass,
		   source,
		   new String[] {
			   "startHasNoPredecessor", "self.predecessor.oclIsUndefined()"
		   });
		addAnnotation
		  (openWorkloadEClass,
		   source,
		   new String[] {
			   "interArrivalTimeInOpenWorkloadNeedsToBeSpecified", "not self.interArrivalTime_OpenWorkload.oclIsUndefined() and self.interArrivalTime_OpenWorkload.specification <> \'\'"
		   });
		addAnnotation
		  (closedWorkloadEClass,
		   source,
		   new String[] {
			   "populationInClosedWorkloadNeedsToBeGreaterZero", "not self.population.oclIsUndefined() and self.population > 0",
			   "thinkTimeInClosedWorkloadNeedsToBeSpecified", "not self.thinkTime_ClosedWorkload.oclIsUndefined() and self.thinkTime_ClosedWorkload.specification <> \'\'"
		   });
	}

} //UsagemodelPackageImpl

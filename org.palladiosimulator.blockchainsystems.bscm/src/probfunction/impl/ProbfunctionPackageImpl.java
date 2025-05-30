/**
 */
package probfunction.impl;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

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

import probfunction.BoolSample;
import probfunction.BoxedPDF;
import probfunction.Complex;
import probfunction.ContinuousPDF;
import probfunction.ContinuousSample;
import probfunction.DoubleSample;
import probfunction.ExponentialDistribution;
import probfunction.GammaDistribution;
import probfunction.IntSample;
import probfunction.LognormalDistribution;
import probfunction.NormalDistribution;
import probfunction.ProbabilityDensityFunction;
import probfunction.ProbabilityFunction;
import probfunction.ProbabilityMassFunction;
import probfunction.ProbfunctionFactory;
import probfunction.ProbfunctionPackage;
import probfunction.Sample;
import probfunction.SamplePDF;
import probfunction.StringSample;

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
public class ProbfunctionPackageImpl extends EPackageImpl implements ProbfunctionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxedPDFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilityDensityFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilityFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilityMassFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass samplePDFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousPDFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lognormalDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gammaDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringSampleEClass = null;

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
	 * @see probfunction.ProbfunctionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProbfunctionPackageImpl() {
		super(eNS_URI, ProbfunctionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProbfunctionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProbfunctionPackage init() {
		if (isInited) return (ProbfunctionPackage)EPackage.Registry.INSTANCE.getEPackage(ProbfunctionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProbfunctionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProbfunctionPackageImpl theProbfunctionPackage = registeredProbfunctionPackage instanceof ProbfunctionPackageImpl ? (ProbfunctionPackageImpl)registeredProbfunctionPackage : new ProbfunctionPackageImpl();

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

		// Create package meta-data objects
		theProbfunctionPackage.createPackageContents();
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
		theResourceenvironmentPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		theSubsystemPackage.createPackageContents();
		theIdentifierPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theStoexPackage.createPackageContents();
		theUnitsPackage.createPackageContents();

		// Initialize created meta-data
		theProbfunctionPackage.initializePackageContents();
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
		theResourceenvironmentPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		theSubsystemPackage.initializePackageContents();
		theIdentifierPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theStoexPackage.initializePackageContents();
		theUnitsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProbfunctionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProbfunctionPackage.eNS_URI, theProbfunctionPackage);
		return theProbfunctionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoxedPDF() {
		return boxedPDFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoxedPDF_Samples() {
		return (EReference)boxedPDFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProbabilityDensityFunction() {
		return probabilityDensityFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProbabilityFunction() {
		return probabilityFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousSample() {
		return continuousSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousSample_Value() {
		return (EAttribute)continuousSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinuousSample_Probability() {
		return (EAttribute)continuousSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProbabilityMassFunction() {
		return probabilityMassFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProbabilityMassFunction_Samples() {
		return (EReference)probabilityMassFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProbabilityMassFunction_OrderedDomain() {
		return (EAttribute)probabilityMassFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSample() {
		return sampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSample_Probability() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSample_Value() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSamplePDF() {
		return samplePDFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSamplePDF_Distance() {
		return (EAttribute)samplePDFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSamplePDF_Values() {
		return (EReference)samplePDFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplex() {
		return complexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplex_Real() {
		return (EAttribute)complexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplex_Imaginary() {
		return (EAttribute)complexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousPDF() {
		return continuousPDFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExponentialDistribution() {
		return exponentialDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExponentialDistribution_Rate() {
		return (EAttribute)exponentialDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalDistribution() {
		return normalDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalDistribution_Mu() {
		return (EAttribute)normalDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalDistribution_Sigma() {
		return (EAttribute)normalDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLognormalDistribution() {
		return lognormalDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLognormalDistribution_Mu() {
		return (EAttribute)lognormalDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLognormalDistribution_Sigma() {
		return (EAttribute)lognormalDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGammaDistribution() {
		return gammaDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGammaDistribution_Alpha() {
		return (EAttribute)gammaDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGammaDistribution_Theta() {
		return (EAttribute)gammaDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntSample() {
		return intSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoolSample() {
		return boolSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleSample() {
		return doubleSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringSample() {
		return stringSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbfunctionFactory getProbfunctionFactory() {
		return (ProbfunctionFactory)getEFactoryInstance();
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
		boxedPDFEClass = createEClass(BOXED_PDF);
		createEReference(boxedPDFEClass, BOXED_PDF__SAMPLES);

		probabilityDensityFunctionEClass = createEClass(PROBABILITY_DENSITY_FUNCTION);

		probabilityFunctionEClass = createEClass(PROBABILITY_FUNCTION);

		continuousSampleEClass = createEClass(CONTINUOUS_SAMPLE);
		createEAttribute(continuousSampleEClass, CONTINUOUS_SAMPLE__VALUE);
		createEAttribute(continuousSampleEClass, CONTINUOUS_SAMPLE__PROBABILITY);

		probabilityMassFunctionEClass = createEClass(PROBABILITY_MASS_FUNCTION);
		createEReference(probabilityMassFunctionEClass, PROBABILITY_MASS_FUNCTION__SAMPLES);
		createEAttribute(probabilityMassFunctionEClass, PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN);

		sampleEClass = createEClass(SAMPLE);
		createEAttribute(sampleEClass, SAMPLE__PROBABILITY);
		createEAttribute(sampleEClass, SAMPLE__VALUE);

		samplePDFEClass = createEClass(SAMPLE_PDF);
		createEAttribute(samplePDFEClass, SAMPLE_PDF__DISTANCE);
		createEReference(samplePDFEClass, SAMPLE_PDF__VALUES);

		complexEClass = createEClass(COMPLEX);
		createEAttribute(complexEClass, COMPLEX__REAL);
		createEAttribute(complexEClass, COMPLEX__IMAGINARY);

		continuousPDFEClass = createEClass(CONTINUOUS_PDF);

		exponentialDistributionEClass = createEClass(EXPONENTIAL_DISTRIBUTION);
		createEAttribute(exponentialDistributionEClass, EXPONENTIAL_DISTRIBUTION__RATE);

		normalDistributionEClass = createEClass(NORMAL_DISTRIBUTION);
		createEAttribute(normalDistributionEClass, NORMAL_DISTRIBUTION__MU);
		createEAttribute(normalDistributionEClass, NORMAL_DISTRIBUTION__SIGMA);

		lognormalDistributionEClass = createEClass(LOGNORMAL_DISTRIBUTION);
		createEAttribute(lognormalDistributionEClass, LOGNORMAL_DISTRIBUTION__MU);
		createEAttribute(lognormalDistributionEClass, LOGNORMAL_DISTRIBUTION__SIGMA);

		gammaDistributionEClass = createEClass(GAMMA_DISTRIBUTION);
		createEAttribute(gammaDistributionEClass, GAMMA_DISTRIBUTION__ALPHA);
		createEAttribute(gammaDistributionEClass, GAMMA_DISTRIBUTION__THETA);

		intSampleEClass = createEClass(INT_SAMPLE);

		boolSampleEClass = createEClass(BOOL_SAMPLE);

		doubleSampleEClass = createEClass(DOUBLE_SAMPLE);

		stringSampleEClass = createEClass(STRING_SAMPLE);
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
		UnitsPackage theUnitsPackage = (UnitsPackage)EPackage.Registry.INSTANCE.getEPackage(UnitsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter probabilityMassFunctionEClass_T = addETypeParameter(probabilityMassFunctionEClass, "T");
		ETypeParameter sampleEClass_T = addETypeParameter(sampleEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		boxedPDFEClass.getESuperTypes().add(this.getProbabilityDensityFunction());
		probabilityDensityFunctionEClass.getESuperTypes().add(this.getProbabilityFunction());
		probabilityFunctionEClass.getESuperTypes().add(theUnitsPackage.getUnitCarryingElement());
		probabilityMassFunctionEClass.getESuperTypes().add(this.getProbabilityFunction());
		samplePDFEClass.getESuperTypes().add(this.getProbabilityDensityFunction());
		continuousPDFEClass.getESuperTypes().add(this.getProbabilityDensityFunction());
		exponentialDistributionEClass.getESuperTypes().add(this.getContinuousPDF());
		normalDistributionEClass.getESuperTypes().add(this.getContinuousPDF());
		lognormalDistributionEClass.getESuperTypes().add(this.getContinuousPDF());
		gammaDistributionEClass.getESuperTypes().add(this.getContinuousPDF());
		EGenericType g1 = createEGenericType(this.getSample());
		EGenericType g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		intSampleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSample());
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		boolSampleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSample());
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		doubleSampleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSample());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		stringSampleEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(boxedPDFEClass, BoxedPDF.class, "BoxedPDF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoxedPDF_Samples(), this.getContinuousSample(), null, "samples", null, 0, -1, BoxedPDF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(probabilityDensityFunctionEClass, ProbabilityDensityFunction.class, "ProbabilityDensityFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(probabilityFunctionEClass, ProbabilityFunction.class, "ProbabilityFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousSampleEClass, ContinuousSample.class, "ContinuousSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousSample_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, ContinuousSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContinuousSample_Probability(), ecorePackage.getEDouble(), "probability", null, 0, 1, ContinuousSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(probabilityMassFunctionEClass, ProbabilityMassFunction.class, "ProbabilityMassFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getSample());
		g2 = createEGenericType(probabilityMassFunctionEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getProbabilityMassFunction_Samples(), g1, null, "samples", null, 1, -1, ProbabilityMassFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProbabilityMassFunction_OrderedDomain(), ecorePackage.getEBoolean(), "orderedDomain", null, 1, 1, ProbabilityMassFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sampleEClass, Sample.class, "Sample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSample_Probability(), ecorePackage.getEDouble(), "probability", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(sampleEClass_T);
		initEAttribute(getSample_Value(), g1, "value", null, 0, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(samplePDFEClass, SamplePDF.class, "SamplePDF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSamplePDF_Distance(), ecorePackage.getEDouble(), "distance", null, 0, 1, SamplePDF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSamplePDF_Values(), this.getComplex(), null, "values", null, 0, -1, SamplePDF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(complexEClass, Complex.class, "Complex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplex_Real(), ecorePackage.getEDouble(), "real", null, 1, 1, Complex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComplex_Imaginary(), ecorePackage.getEDouble(), "imaginary", null, 1, 1, Complex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(continuousPDFEClass, ContinuousPDF.class, "ContinuousPDF", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exponentialDistributionEClass, ExponentialDistribution.class, "ExponentialDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExponentialDistribution_Rate(), ecorePackage.getEDouble(), "rate", null, 1, 1, ExponentialDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(normalDistributionEClass, NormalDistribution.class, "NormalDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormalDistribution_Mu(), ecorePackage.getEDouble(), "mu", null, 1, 1, NormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNormalDistribution_Sigma(), ecorePackage.getEDouble(), "sigma", null, 1, 1, NormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lognormalDistributionEClass, LognormalDistribution.class, "LognormalDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLognormalDistribution_Mu(), ecorePackage.getEDouble(), "mu", null, 1, 1, LognormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLognormalDistribution_Sigma(), ecorePackage.getEDouble(), "sigma", null, 1, 1, LognormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gammaDistributionEClass, GammaDistribution.class, "GammaDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGammaDistribution_Alpha(), ecorePackage.getEDouble(), "alpha", null, 1, 1, GammaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGammaDistribution_Theta(), ecorePackage.getEDouble(), "theta", null, 1, 1, GammaDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(intSampleEClass, IntSample.class, "IntSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolSampleEClass, BoolSample.class, "BoolSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doubleSampleEClass, DoubleSample.class, "DoubleSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringSampleEClass, StringSample.class, "StringSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProbfunctionPackageImpl

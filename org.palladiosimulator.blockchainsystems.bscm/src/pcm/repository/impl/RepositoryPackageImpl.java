/**
 */
package pcm.repository.impl;

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
import org.eclipse.emf.ecore.EEnum;
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

import pcm.repository.BasicComponent;
import pcm.repository.CollectionDataType;
import pcm.repository.CompleteComponentType;
import pcm.repository.ComponentType;
import pcm.repository.CompositeComponent;
import pcm.repository.CompositeDataType;
import pcm.repository.DataType;
import pcm.repository.EventGroup;
import pcm.repository.EventType;
import pcm.repository.ExceptionType;
import pcm.repository.ImplementationComponentType;
import pcm.repository.InfrastructureInterface;
import pcm.repository.InfrastructureProvidedRole;
import pcm.repository.InfrastructureRequiredRole;
import pcm.repository.InfrastructureSignature;
import pcm.repository.InnerDeclaration;
import pcm.repository.Interface;
import pcm.repository.OperationInterface;
import pcm.repository.OperationProvidedRole;
import pcm.repository.OperationRequiredRole;
import pcm.repository.OperationSignature;
import pcm.repository.Parameter;
import pcm.repository.ParameterModifier;
import pcm.repository.PassiveResource;
import pcm.repository.PrimitiveDataType;
import pcm.repository.PrimitiveTypeEnum;
import pcm.repository.ProvidedRole;
import pcm.repository.ProvidesComponentType;
import pcm.repository.Repository;
import pcm.repository.RepositoryComponent;
import pcm.repository.RepositoryFactory;
import pcm.repository.RepositoryPackage;
import pcm.repository.RequiredCharacterisation;
import pcm.repository.RequiredRole;
import pcm.repository.Role;
import pcm.repository.Signature;
import pcm.repository.SinkRole;
import pcm.repository.SourceRole;

import pcm.repository.util.RepositoryValidator;

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
public class RepositoryPackageImpl extends EPackageImpl implements RepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredCharacterisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureRequiredRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationRequiredRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationProvidedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureProvidedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completeComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providesComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEnumEEnum = null;

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
	 * @see pcm.repository.RepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RepositoryPackageImpl() {
		super(eNS_URI, RepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RepositoryPackage init() {
		if (isInited) return (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRepositoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RepositoryPackageImpl theRepositoryPackage = registeredRepositoryPackage instanceof RepositoryPackageImpl ? (RepositoryPackageImpl)registeredRepositoryPackage : new RepositoryPackageImpl();

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
		theRepositoryPackage.createPackageContents();
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
		theRepositoryPackage.initializePackageContents();
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
			(theRepositoryPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return RepositoryValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRepositoryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RepositoryPackage.eNS_URI, theRepositoryPackage);
		return theRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPassiveResource() {
		return passiveResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPassiveResource_Capacity_PassiveResource() {
		return (EReference)passiveResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPassiveResource_BasicComponent_PassiveResource() {
		return (EReference)passiveResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPassiveResource_ResourceTimeoutFailureType__PassiveResource() {
		return (EReference)passiveResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicComponent() {
		return basicComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicComponent_ServiceEffectSpecifications__BasicComponent() {
		return (EReference)basicComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasicComponent_PassiveResource_BasicComponent() {
		return (EReference)basicComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplementationComponentType() {
		return implementationComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplementationComponentType_ParentCompleteComponentTypes() {
		return (EReference)implementationComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType() {
		return (EReference)implementationComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImplementationComponentType_ComponentType() {
		return (EAttribute)implementationComponentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepositoryComponent() {
		return repositoryComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepositoryComponent_Repository__RepositoryComponent() {
		return (EReference)repositoryComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedRole() {
		return providedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedRole_ProvidingEntity_ProvidedRole() {
		return (EReference)providedRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_DataType__Parameter() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_InfrastructureSignature__Parameter() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_OperationSignature__Parameter() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_EventType__Parameter() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_ParameterName() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Modifier__Parameter() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_ResourceSignature__Parameter() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_Repository__DataType() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepository_RepositoryDescription() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Components__Repository() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Interfaces__Repository() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_FailureTypes__Repository() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_DataTypes__Repository() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_ParentInterfaces__Interface() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_Protocols__Interface() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_RequiredCharacterisations() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterface_Repository__Interface() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterface__IsAssignableFrom__Interface() {
		return interfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredCharacterisation() {
		return requiredCharacterisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequiredCharacterisation_Type() {
		return (EAttribute)requiredCharacterisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredCharacterisation_Parameter() {
		return (EReference)requiredCharacterisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredCharacterisation_Interface_RequiredCharacterisation() {
		return (EReference)requiredCharacterisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventGroup() {
		return eventGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventGroup_EventTypes__EventGroup() {
		return (EReference)eventGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventType() {
		return eventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventType_Parameter__EventType() {
		return (EReference)eventTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventType_EventGroup__EventType() {
		return (EReference)eventTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Exceptions__Signature() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_FailureType() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExceptionType() {
		return exceptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExceptionType_ExceptionName() {
		return (EAttribute)exceptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExceptionType_ExceptionMessage() {
		return (EAttribute)exceptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfrastructureSignature() {
		return infrastructureSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureSignature_Parameters__InfrastructureSignature() {
		return (EReference)infrastructureSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature() {
		return (EReference)infrastructureSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfrastructureInterface() {
		return infrastructureInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface() {
		return (EReference)infrastructureInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfrastructureRequiredRole() {
		return infrastructureRequiredRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole() {
		return (EReference)infrastructureRequiredRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredRole() {
		return requiredRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredRole_RequiringEntity_RequiredRole() {
		return (EReference)requiredRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationSignature() {
		return operationSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationSignature_Interface__OperationSignature() {
		return (EReference)operationSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationSignature_Parameters__OperationSignature() {
		return (EReference)operationSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationSignature_ReturnType__OperationSignature() {
		return (EReference)operationSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationInterface() {
		return operationInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationInterface_Signatures__OperationInterface() {
		return (EReference)operationInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationRequiredRole() {
		return operationRequiredRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationRequiredRole_RequiredInterface__OperationRequiredRole() {
		return (EReference)operationRequiredRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceRole() {
		return sourceRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourceRole_EventGroup__SourceRole() {
		return (EReference)sourceRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSinkRole() {
		return sinkRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSinkRole_EventGroup__SinkRole() {
		return (EReference)sinkRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationProvidedRole() {
		return operationProvidedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationProvidedRole_ProvidedInterface__OperationProvidedRole() {
		return (EReference)operationProvidedRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfrastructureProvidedRole() {
		return infrastructureProvidedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole() {
		return (EReference)infrastructureProvidedRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompleteComponentType() {
		return completeComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompleteComponentType_ParentProvidesComponentTypes() {
		return (EReference)completeComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidesComponentType() {
		return providesComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeComponent() {
		return compositeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveDataType() {
		return primitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveDataType_Type() {
		return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollectionDataType() {
		return collectionDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionDataType_InnerType_CollectionDataType() {
		return (EReference)collectionDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeDataType() {
		return compositeDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeDataType_ParentType_CompositeDataType() {
		return (EReference)compositeDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeDataType_InnerDeclaration_CompositeDataType() {
		return (EReference)compositeDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInnerDeclaration() {
		return innerDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInnerDeclaration_Datatype_InnerDeclaration() {
		return (EReference)innerDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInnerDeclaration_CompositeDataType_InnerDeclaration() {
		return (EReference)innerDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParameterModifier() {
		return parameterModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentType() {
		return componentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrimitiveTypeEnum() {
		return primitiveTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryFactory getRepositoryFactory() {
		return (RepositoryFactory)getEFactoryInstance();
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
		passiveResourceEClass = createEClass(PASSIVE_RESOURCE);
		createEReference(passiveResourceEClass, PASSIVE_RESOURCE__CAPACITY_PASSIVE_RESOURCE);
		createEReference(passiveResourceEClass, PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE);
		createEReference(passiveResourceEClass, PASSIVE_RESOURCE__RESOURCE_TIMEOUT_FAILURE_TYPE_PASSIVE_RESOURCE);

		basicComponentEClass = createEClass(BASIC_COMPONENT);
		createEReference(basicComponentEClass, BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT);
		createEReference(basicComponentEClass, BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT);

		implementationComponentTypeEClass = createEClass(IMPLEMENTATION_COMPONENT_TYPE);
		createEReference(implementationComponentTypeEClass, IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES);
		createEReference(implementationComponentTypeEClass, IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE);
		createEAttribute(implementationComponentTypeEClass, IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE);

		repositoryComponentEClass = createEClass(REPOSITORY_COMPONENT);
		createEReference(repositoryComponentEClass, REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT);

		providedRoleEClass = createEClass(PROVIDED_ROLE);
		createEReference(providedRoleEClass, PROVIDED_ROLE__PROVIDING_ENTITY_PROVIDED_ROLE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__DATA_TYPE_PARAMETER);
		createEReference(parameterEClass, PARAMETER__INFRASTRUCTURE_SIGNATURE_PARAMETER);
		createEReference(parameterEClass, PARAMETER__OPERATION_SIGNATURE_PARAMETER);
		createEReference(parameterEClass, PARAMETER__EVENT_TYPE_PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__PARAMETER_NAME);
		createEAttribute(parameterEClass, PARAMETER__MODIFIER_PARAMETER);
		createEReference(parameterEClass, PARAMETER__RESOURCE_SIGNATURE_PARAMETER);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__REPOSITORY_DATA_TYPE);

		repositoryEClass = createEClass(REPOSITORY);
		createEAttribute(repositoryEClass, REPOSITORY__REPOSITORY_DESCRIPTION);
		createEReference(repositoryEClass, REPOSITORY__COMPONENTS_REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__INTERFACES_REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__FAILURE_TYPES_REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__DATA_TYPES_REPOSITORY);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__PARENT_INTERFACES_INTERFACE);
		createEReference(interfaceEClass, INTERFACE__PROTOCOLS_INTERFACE);
		createEReference(interfaceEClass, INTERFACE__REQUIRED_CHARACTERISATIONS);
		createEReference(interfaceEClass, INTERFACE__REPOSITORY_INTERFACE);
		createEOperation(interfaceEClass, INTERFACE___IS_ASSIGNABLE_FROM__INTERFACE);

		requiredCharacterisationEClass = createEClass(REQUIRED_CHARACTERISATION);
		createEAttribute(requiredCharacterisationEClass, REQUIRED_CHARACTERISATION__TYPE);
		createEReference(requiredCharacterisationEClass, REQUIRED_CHARACTERISATION__PARAMETER);
		createEReference(requiredCharacterisationEClass, REQUIRED_CHARACTERISATION__INTERFACE_REQUIRED_CHARACTERISATION);

		eventGroupEClass = createEClass(EVENT_GROUP);
		createEReference(eventGroupEClass, EVENT_GROUP__EVENT_TYPES_EVENT_GROUP);

		eventTypeEClass = createEClass(EVENT_TYPE);
		createEReference(eventTypeEClass, EVENT_TYPE__PARAMETER_EVENT_TYPE);
		createEReference(eventTypeEClass, EVENT_TYPE__EVENT_GROUP_EVENT_TYPE);

		signatureEClass = createEClass(SIGNATURE);
		createEReference(signatureEClass, SIGNATURE__EXCEPTIONS_SIGNATURE);
		createEReference(signatureEClass, SIGNATURE__FAILURE_TYPE);

		exceptionTypeEClass = createEClass(EXCEPTION_TYPE);
		createEAttribute(exceptionTypeEClass, EXCEPTION_TYPE__EXCEPTION_NAME);
		createEAttribute(exceptionTypeEClass, EXCEPTION_TYPE__EXCEPTION_MESSAGE);

		infrastructureSignatureEClass = createEClass(INFRASTRUCTURE_SIGNATURE);
		createEReference(infrastructureSignatureEClass, INFRASTRUCTURE_SIGNATURE__PARAMETERS_INFRASTRUCTURE_SIGNATURE);
		createEReference(infrastructureSignatureEClass, INFRASTRUCTURE_SIGNATURE__INFRASTRUCTURE_INTERFACE_INFRASTRUCTURE_SIGNATURE);

		infrastructureInterfaceEClass = createEClass(INFRASTRUCTURE_INTERFACE);
		createEReference(infrastructureInterfaceEClass, INFRASTRUCTURE_INTERFACE__INFRASTRUCTURE_SIGNATURES_INFRASTRUCTURE_INTERFACE);

		infrastructureRequiredRoleEClass = createEClass(INFRASTRUCTURE_REQUIRED_ROLE);
		createEReference(infrastructureRequiredRoleEClass, INFRASTRUCTURE_REQUIRED_ROLE__REQUIRED_INTERFACE_INFRASTRUCTURE_REQUIRED_ROLE);

		requiredRoleEClass = createEClass(REQUIRED_ROLE);
		createEReference(requiredRoleEClass, REQUIRED_ROLE__REQUIRING_ENTITY_REQUIRED_ROLE);

		operationSignatureEClass = createEClass(OPERATION_SIGNATURE);
		createEReference(operationSignatureEClass, OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE);
		createEReference(operationSignatureEClass, OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE);
		createEReference(operationSignatureEClass, OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE);

		operationInterfaceEClass = createEClass(OPERATION_INTERFACE);
		createEReference(operationInterfaceEClass, OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE);

		operationRequiredRoleEClass = createEClass(OPERATION_REQUIRED_ROLE);
		createEReference(operationRequiredRoleEClass, OPERATION_REQUIRED_ROLE__REQUIRED_INTERFACE_OPERATION_REQUIRED_ROLE);

		sourceRoleEClass = createEClass(SOURCE_ROLE);
		createEReference(sourceRoleEClass, SOURCE_ROLE__EVENT_GROUP_SOURCE_ROLE);

		sinkRoleEClass = createEClass(SINK_ROLE);
		createEReference(sinkRoleEClass, SINK_ROLE__EVENT_GROUP_SINK_ROLE);

		operationProvidedRoleEClass = createEClass(OPERATION_PROVIDED_ROLE);
		createEReference(operationProvidedRoleEClass, OPERATION_PROVIDED_ROLE__PROVIDED_INTERFACE_OPERATION_PROVIDED_ROLE);

		infrastructureProvidedRoleEClass = createEClass(INFRASTRUCTURE_PROVIDED_ROLE);
		createEReference(infrastructureProvidedRoleEClass, INFRASTRUCTURE_PROVIDED_ROLE__PROVIDED_INTERFACE_INFRASTRUCTURE_PROVIDED_ROLE);

		completeComponentTypeEClass = createEClass(COMPLETE_COMPONENT_TYPE);
		createEReference(completeComponentTypeEClass, COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES);

		providesComponentTypeEClass = createEClass(PROVIDES_COMPONENT_TYPE);

		compositeComponentEClass = createEClass(COMPOSITE_COMPONENT);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);
		createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__TYPE);

		collectionDataTypeEClass = createEClass(COLLECTION_DATA_TYPE);
		createEReference(collectionDataTypeEClass, COLLECTION_DATA_TYPE__INNER_TYPE_COLLECTION_DATA_TYPE);

		compositeDataTypeEClass = createEClass(COMPOSITE_DATA_TYPE);
		createEReference(compositeDataTypeEClass, COMPOSITE_DATA_TYPE__PARENT_TYPE_COMPOSITE_DATA_TYPE);
		createEReference(compositeDataTypeEClass, COMPOSITE_DATA_TYPE__INNER_DECLARATION_COMPOSITE_DATA_TYPE);

		innerDeclarationEClass = createEClass(INNER_DECLARATION);
		createEReference(innerDeclarationEClass, INNER_DECLARATION__DATATYPE_INNER_DECLARATION);
		createEReference(innerDeclarationEClass, INNER_DECLARATION__COMPOSITE_DATA_TYPE_INNER_DECLARATION);

		roleEClass = createEClass(ROLE);

		// Create enums
		parameterModifierEEnum = createEEnum(PARAMETER_MODIFIER);
		componentTypeEEnum = createEEnum(COMPONENT_TYPE);
		primitiveTypeEnumEEnum = createEEnum(PRIMITIVE_TYPE_ENUM);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ReliabilityPackage theReliabilityPackage = (ReliabilityPackage)EPackage.Registry.INSTANCE.getEPackage(ReliabilityPackage.eNS_URI);
		SeffPackage theSeffPackage = (SeffPackage)EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);
		ParameterPackage theParameterPackage = (ParameterPackage)EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI);
		PcmPackage thePcmPackage = (PcmPackage)EPackage.Registry.INSTANCE.getEPackage(PcmPackage.eNS_URI);
		ResourcetypePackage theResourcetypePackage = (ResourcetypePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcetypePackage.eNS_URI);
		ProtocolPackage theProtocolPackage = (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		passiveResourceEClass.getESuperTypes().add(theEntityPackage.getEntity());
		basicComponentEClass.getESuperTypes().add(this.getImplementationComponentType());
		implementationComponentTypeEClass.getESuperTypes().add(this.getRepositoryComponent());
		repositoryComponentEClass.getESuperTypes().add(theEntityPackage.getInterfaceProvidingRequiringEntity());
		providedRoleEClass.getESuperTypes().add(this.getRole());
		parameterEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		dataTypeEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		repositoryEClass.getESuperTypes().add(theEntityPackage.getEntity());
		interfaceEClass.getESuperTypes().add(theEntityPackage.getEntity());
		requiredCharacterisationEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		eventGroupEClass.getESuperTypes().add(this.getInterface());
		eventTypeEClass.getESuperTypes().add(this.getSignature());
		signatureEClass.getESuperTypes().add(theEntityPackage.getEntity());
		exceptionTypeEClass.getESuperTypes().add(thePcmPackage.getPCMBaseClass());
		infrastructureSignatureEClass.getESuperTypes().add(this.getSignature());
		infrastructureInterfaceEClass.getESuperTypes().add(this.getInterface());
		infrastructureRequiredRoleEClass.getESuperTypes().add(this.getRequiredRole());
		requiredRoleEClass.getESuperTypes().add(this.getRole());
		operationSignatureEClass.getESuperTypes().add(this.getSignature());
		operationInterfaceEClass.getESuperTypes().add(this.getInterface());
		operationRequiredRoleEClass.getESuperTypes().add(this.getRequiredRole());
		sourceRoleEClass.getESuperTypes().add(this.getRequiredRole());
		sinkRoleEClass.getESuperTypes().add(this.getProvidedRole());
		operationProvidedRoleEClass.getESuperTypes().add(this.getProvidedRole());
		infrastructureProvidedRoleEClass.getESuperTypes().add(this.getProvidedRole());
		completeComponentTypeEClass.getESuperTypes().add(this.getRepositoryComponent());
		providesComponentTypeEClass.getESuperTypes().add(this.getRepositoryComponent());
		compositeComponentEClass.getESuperTypes().add(theEntityPackage.getComposedProvidingRequiringEntity());
		compositeComponentEClass.getESuperTypes().add(this.getImplementationComponentType());
		primitiveDataTypeEClass.getESuperTypes().add(this.getDataType());
		collectionDataTypeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		collectionDataTypeEClass.getESuperTypes().add(this.getDataType());
		compositeDataTypeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		compositeDataTypeEClass.getESuperTypes().add(this.getDataType());
		innerDeclarationEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
		roleEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(passiveResourceEClass, PassiveResource.class, "PassiveResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPassiveResource_Capacity_PassiveResource(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_PassiveResource_capacity_PCMRandomVariable(), "capacity_PassiveResource", null, 1, 1, PassiveResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPassiveResource_BasicComponent_PassiveResource(), this.getBasicComponent(), this.getBasicComponent_PassiveResource_BasicComponent(), "basicComponent_PassiveResource", null, 1, 1, PassiveResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPassiveResource_ResourceTimeoutFailureType__PassiveResource(), theReliabilityPackage.getResourceTimeoutFailureType(), theReliabilityPackage.getResourceTimeoutFailureType_PassiveResource__ResourceTimeoutFailureType(), "resourceTimeoutFailureType__PassiveResource", null, 0, 1, PassiveResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(basicComponentEClass, BasicComponent.class, "BasicComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicComponent_ServiceEffectSpecifications__BasicComponent(), theSeffPackage.getServiceEffectSpecification(), theSeffPackage.getServiceEffectSpecification_BasicComponent_ServiceEffectSpecification(), "serviceEffectSpecifications__BasicComponent", null, 0, -1, BasicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBasicComponent_PassiveResource_BasicComponent(), this.getPassiveResource(), this.getPassiveResource_BasicComponent_PassiveResource(), "passiveResource_BasicComponent", null, 0, -1, BasicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(implementationComponentTypeEClass, ImplementationComponentType.class, "ImplementationComponentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementationComponentType_ParentCompleteComponentTypes(), this.getCompleteComponentType(), null, "parentCompleteComponentTypes", null, 0, -1, ImplementationComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImplementationComponentType_ComponentParameterUsage_ImplementationComponentType(), theParameterPackage.getVariableUsage(), null, "componentParameterUsage_ImplementationComponentType", null, 0, -1, ImplementationComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImplementationComponentType_ComponentType(), this.getComponentType(), "componentType", "BUSINESS_COMPONENT", 1, 1, ImplementationComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(repositoryComponentEClass, RepositoryComponent.class, "RepositoryComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepositoryComponent_Repository__RepositoryComponent(), this.getRepository(), this.getRepository_Components__Repository(), "repository__RepositoryComponent", null, 1, 1, RepositoryComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(providedRoleEClass, ProvidedRole.class, "ProvidedRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedRole_ProvidingEntity_ProvidedRole(), theEntityPackage.getInterfaceProvidingEntity(), theEntityPackage.getInterfaceProvidingEntity_ProvidedRoles_InterfaceProvidingEntity(), "providingEntity_ProvidedRole", null, 1, 1, ProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_DataType__Parameter(), this.getDataType(), null, "dataType__Parameter", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_InfrastructureSignature__Parameter(), this.getInfrastructureSignature(), this.getInfrastructureSignature_Parameters__InfrastructureSignature(), "infrastructureSignature__Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_OperationSignature__Parameter(), this.getOperationSignature(), this.getOperationSignature_Parameters__OperationSignature(), "operationSignature__Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_EventType__Parameter(), this.getEventType(), this.getEventType_Parameter__EventType(), "eventType__Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_ParameterName(), ecorePackage.getEString(), "parameterName", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Modifier__Parameter(), this.getParameterModifier(), "modifier__Parameter", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_ResourceSignature__Parameter(), theResourcetypePackage.getResourceSignature(), theResourcetypePackage.getResourceSignature_Parameter__ResourceSignature(), "resourceSignature__Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_Repository__DataType(), this.getRepository(), this.getRepository_DataTypes__Repository(), "repository__DataType", null, 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepository_RepositoryDescription(), ecorePackage.getEString(), "repositoryDescription", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRepository_Components__Repository(), this.getRepositoryComponent(), this.getRepositoryComponent_Repository__RepositoryComponent(), "components__Repository", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRepository_Interfaces__Repository(), this.getInterface(), this.getInterface_Repository__Interface(), "interfaces__Repository", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRepository_FailureTypes__Repository(), theReliabilityPackage.getFailureType(), theReliabilityPackage.getFailureType_Repository__FailureType(), "failureTypes__Repository", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRepository_DataTypes__Repository(), this.getDataType(), this.getDataType_Repository__DataType(), "dataTypes__Repository", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_ParentInterfaces__Interface(), this.getInterface(), null, "parentInterfaces__Interface", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_Protocols__Interface(), theProtocolPackage.getProtocol(), null, "protocols__Interface", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_RequiredCharacterisations(), this.getRequiredCharacterisation(), this.getRequiredCharacterisation_Interface_RequiredCharacterisation(), "requiredCharacterisations", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_Repository__Interface(), this.getRepository(), this.getRepository_Interfaces__Repository(), "repository__Interface", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getInterface__IsAssignableFrom__Interface(), theEcorePackage.getEBoolean(), "isAssignableFrom", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInterface(), "otherInterface", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(requiredCharacterisationEClass, RequiredCharacterisation.class, "RequiredCharacterisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredCharacterisation_Type(), theParameterPackage.getVariableCharacterisationType(), "type", null, 1, 1, RequiredCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequiredCharacterisation_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, RequiredCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequiredCharacterisation_Interface_RequiredCharacterisation(), this.getInterface(), this.getInterface_RequiredCharacterisations(), "interface_RequiredCharacterisation", null, 1, 1, RequiredCharacterisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventGroupEClass, EventGroup.class, "EventGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventGroup_EventTypes__EventGroup(), this.getEventType(), this.getEventType_EventGroup__EventType(), "eventTypes__EventGroup", null, 0, -1, EventGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventTypeEClass, EventType.class, "EventType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventType_Parameter__EventType(), this.getParameter(), this.getParameter_EventType__Parameter(), "parameter__EventType", null, 1, 1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEventType_EventGroup__EventType(), this.getEventGroup(), this.getEventGroup_EventTypes__EventGroup(), "eventGroup__EventType", null, 1, 1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignature_Exceptions__Signature(), this.getExceptionType(), null, "exceptions__Signature", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSignature_FailureType(), theReliabilityPackage.getFailureType(), null, "failureType", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exceptionTypeEClass, ExceptionType.class, "ExceptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionType_ExceptionName(), ecorePackage.getEString(), "exceptionName", null, 1, 1, ExceptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExceptionType_ExceptionMessage(), ecorePackage.getEString(), "exceptionMessage", null, 1, 1, ExceptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(infrastructureSignatureEClass, InfrastructureSignature.class, "InfrastructureSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureSignature_Parameters__InfrastructureSignature(), this.getParameter(), this.getParameter_InfrastructureSignature__Parameter(), "parameters__InfrastructureSignature", null, 0, -1, InfrastructureSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature(), this.getInfrastructureInterface(), this.getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface(), "infrastructureInterface__InfrastructureSignature", null, 1, 1, InfrastructureSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(infrastructureInterfaceEClass, InfrastructureInterface.class, "InfrastructureInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface(), this.getInfrastructureSignature(), this.getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature(), "infrastructureSignatures__InfrastructureInterface", null, 0, -1, InfrastructureInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(infrastructureRequiredRoleEClass, InfrastructureRequiredRole.class, "InfrastructureRequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureRequiredRole_RequiredInterface__InfrastructureRequiredRole(), this.getInfrastructureInterface(), null, "requiredInterface__InfrastructureRequiredRole", null, 1, 1, InfrastructureRequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requiredRoleEClass, RequiredRole.class, "RequiredRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredRole_RequiringEntity_RequiredRole(), theEntityPackage.getInterfaceRequiringEntity(), theEntityPackage.getInterfaceRequiringEntity_RequiredRoles_InterfaceRequiringEntity(), "requiringEntity_RequiredRole", null, 1, 1, RequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationSignatureEClass, OperationSignature.class, "OperationSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationSignature_Interface__OperationSignature(), this.getOperationInterface(), this.getOperationInterface_Signatures__OperationInterface(), "interface__OperationSignature", null, 1, 1, OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperationSignature_Parameters__OperationSignature(), this.getParameter(), this.getParameter_OperationSignature__Parameter(), "parameters__OperationSignature", null, 0, -1, OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationSignature_ReturnType__OperationSignature(), this.getDataType(), null, "returnType__OperationSignature", null, 0, 1, OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationInterfaceEClass, OperationInterface.class, "OperationInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationInterface_Signatures__OperationInterface(), this.getOperationSignature(), this.getOperationSignature_Interface__OperationSignature(), "signatures__OperationInterface", null, 0, -1, OperationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationRequiredRoleEClass, OperationRequiredRole.class, "OperationRequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationRequiredRole_RequiredInterface__OperationRequiredRole(), this.getOperationInterface(), null, "requiredInterface__OperationRequiredRole", null, 1, 1, OperationRequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sourceRoleEClass, SourceRole.class, "SourceRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceRole_EventGroup__SourceRole(), this.getEventGroup(), null, "eventGroup__SourceRole", null, 1, 1, SourceRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sinkRoleEClass, SinkRole.class, "SinkRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSinkRole_EventGroup__SinkRole(), this.getEventGroup(), null, "eventGroup__SinkRole", null, 1, 1, SinkRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationProvidedRoleEClass, OperationProvidedRole.class, "OperationProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationProvidedRole_ProvidedInterface__OperationProvidedRole(), this.getOperationInterface(), null, "providedInterface__OperationProvidedRole", null, 1, 1, OperationProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(infrastructureProvidedRoleEClass, InfrastructureProvidedRole.class, "InfrastructureProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureProvidedRole_ProvidedInterface__InfrastructureProvidedRole(), this.getInfrastructureInterface(), null, "providedInterface__InfrastructureProvidedRole", null, 1, 1, InfrastructureProvidedRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(completeComponentTypeEClass, CompleteComponentType.class, "CompleteComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompleteComponentType_ParentProvidesComponentTypes(), this.getProvidesComponentType(), null, "parentProvidesComponentTypes", null, 0, -1, CompleteComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(providesComponentTypeEClass, ProvidesComponentType.class, "ProvidesComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeComponentEClass, CompositeComponent.class, "CompositeComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDataType_Type(), this.getPrimitiveTypeEnum(), "type", null, 1, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectionDataTypeEClass, CollectionDataType.class, "CollectionDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionDataType_InnerType_CollectionDataType(), this.getDataType(), null, "innerType_CollectionDataType", null, 1, 1, CollectionDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(compositeDataTypeEClass, CompositeDataType.class, "CompositeDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeDataType_ParentType_CompositeDataType(), this.getCompositeDataType(), null, "parentType_CompositeDataType", null, 0, -1, CompositeDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompositeDataType_InnerDeclaration_CompositeDataType(), this.getInnerDeclaration(), this.getInnerDeclaration_CompositeDataType_InnerDeclaration(), "innerDeclaration_CompositeDataType", null, 0, -1, CompositeDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(innerDeclarationEClass, InnerDeclaration.class, "InnerDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInnerDeclaration_Datatype_InnerDeclaration(), this.getDataType(), null, "datatype_InnerDeclaration", null, 1, 1, InnerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInnerDeclaration_CompositeDataType_InnerDeclaration(), this.getCompositeDataType(), this.getCompositeDataType_InnerDeclaration_CompositeDataType(), "compositeDataType_InnerDeclaration", null, 1, 1, InnerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(parameterModifierEEnum, ParameterModifier.class, "ParameterModifier");
		addEEnumLiteral(parameterModifierEEnum, ParameterModifier.NONE);
		addEEnumLiteral(parameterModifierEEnum, ParameterModifier.IN);
		addEEnumLiteral(parameterModifierEEnum, ParameterModifier.OUT);
		addEEnumLiteral(parameterModifierEEnum, ParameterModifier.INOUT);

		initEEnum(componentTypeEEnum, ComponentType.class, "ComponentType");
		addEEnumLiteral(componentTypeEEnum, ComponentType.BUSINESS_COMPONENT);
		addEEnumLiteral(componentTypeEEnum, ComponentType.INFRASTRUCTURE_COMPONENT);

		initEEnum(primitiveTypeEnumEEnum, PrimitiveTypeEnum.class, "PrimitiveTypeEnum");
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.STRING);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BOOL);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.DOUBLE);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.CHAR);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTE);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.LONG);

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
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG"
		   });
		addAnnotation
		  (basicComponentEClass,
		   source,
		   new String[] {
			   "constraints", "noSeffTypeUsedTwice everyOperationInterfaceMethodsNeedsSEFF everyInfrastructureInterfaceMethodsNeedsSEFF"
		   });
		addAnnotation
		  (implementationComponentTypeEClass,
		   source,
		   new String[] {
			   "constraints", "requiredInterfacesHaveToConformToCompleteType providedInterfacesHaveToConformToCompleteType providedInterfaceHaveToConformToComponentType provideSameOrMoreInterfacesAsCompleteComponentType requireSameOrFewerInterfacesAsCompleteComponentType"
		   });
		addAnnotation
		  (repositoryEClass,
		   source,
		   new String[] {
			   "constraints", "repositorynotempty"
		   });
		addAnnotation
		  (interfaceEClass,
		   source,
		   new String[] {
			   "constraints", "noProtocolTypeIDUsedTwice"
		   });
		addAnnotation
		  (operationSignatureEClass,
		   source,
		   new String[] {
			   "constraints", "parameterNamesHaveToBeUniqueForASignature"
		   });
		addAnnotation
		  (operationInterfaceEClass,
		   source,
		   new String[] {
			   "constraints", "signaturesHaveToBeUniqueForAnInterface"
		   });
		addAnnotation
		  (completeComponentTypeEClass,
		   source,
		   new String[] {
			   "constraints", "atLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType providedInterfacesHaveToConformToProvidedType2"
		   });
		addAnnotation
		  (providesComponentTypeEClass,
		   source,
		   new String[] {
			   "constraints", "atLeastOneInterfaceHasToBeProvidedByAUsefullProvidesComponentType"
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
		  (basicComponentEClass,
		   source,
		   new String[] {
			   "noSeffTypeUsedTwice", "self.serviceEffectSpecifications__BasicComponent->forAll(p1, p2 |\r\n  p1 <> p2 implies (p1.describedService__SEFF = p2.describedService__SEFF implies p1.seffTypeID <> p2.seffTypeID))",
			   "everyOperationInterfaceMethodsNeedsSEFF", "self.providedRoles_InterfaceProvidingEntity->selectByType(OperationProvidedRole).providedInterface__OperationProvidedRole.signatures__OperationInterface->forAll(s | self.serviceEffectSpecifications__BasicComponent->select(service | service.describedService__SEFF=s)->size()>0)",
			   "everyInfrastructureInterfaceMethodsNeedsSEFF", "self.providedRoles_InterfaceProvidingEntity->selectByType(InfrastructureProvidedRole).providedInterface__InfrastructureProvidedRole.infrastructureSignatures__InfrastructureInterface->forAll(s | self.serviceEffectSpecifications__BasicComponent->select(service | service.describedService__SEFF=s)->size()>0)"
		   });
		addAnnotation
		  (implementationComponentTypeEClass,
		   source,
		   new String[] {
			   "requiredInterfacesHaveToConformToCompleteType", "-- ImplementationTypes required Interfaces have to be a subset\r\n-- of CompleteComponentType required Interfaces #\r\n--\r\n-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n--\r\n-- Recursive Query for parent Interface IDs\r\n-- see \'lpar2005.pdf\' (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n--let parentInterfaces : Bag(Interface) =\r\n--\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc1 : Bag(Interface) = Bag{} |\r\n--\t\tacc1->union(pt.requiredRoles->iterate(r : RequiredRole; acc2 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc2->union(r.requiredInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t\t))\r\n--\t) in\r\n--let anchestorInterfaces : Bag(Interface) =\r\n--\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc3 : Bag(Interface) = Bag{} |\r\n--\t\tacc3->union(pt.requiredRoles->iterate(r : RequiredRole; acc4 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc4->union(r.requiredInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t\t))\r\n--\t)->union( -- union with anchestors found in former recursion #\r\n--\t\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc5 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc5->union(pt.requiredRoles->iterate(r : RequiredRole; acc6 : Bag(Interface) = Bag{} |\r\n--\t\t\t\tacc6->union(r.requiredInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n--\t\t\t))\r\n--\t\t)\r\n--\t) in\r\n-- Directly required interfaces need to be a subset of required anchestorInterfaces of Supertype #\r\n--anchestorInterfaces.identifier.id->includesAll(\r\n--\tself.requiredRoles->iterate(p : RequiredRole; acc7 : Bag(String) = Bag{} |\r\n--\t\tacc7->union(p.requiredInterface.identifier.id->asBag())\r\n--\t)\t\r\n--)\r\ntrue",
			   "providedInterfacesHaveToConformToCompleteType", "-- ### EXACT COPY FROM ABOVE ###\r\n-- ImplementationComponentTypes provided Interfaces have to be a superset\r\n-- of CompleteComponentType provided Interfaces #\r\n--\r\n-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n--\r\n-- Recursive Query for parent Interface IDs\r\n-- see \'lpar2005.pdf\' (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n--let parentInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(Interface) = Bag{} |\r\n--\t\tacc2->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t) in\r\n--let anchestorInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc4 : Bag(Interface) = Bag{} |\r\n--\t\tacc4->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t)->union( -- union with anchestors found in former recursion #\r\n--\t\tself.providedRoles->iterate(r : ProvidedRole; acc6 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc6->union(r.providedInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n--\t\t)\r\n--\t) in\r\n\t-- Directly provided anchestorInterfaces need to be a superset of provided interfaces of Supertype #\r\n--\tanchestorInterfaces.identifier.id->includesAll(\r\n--\t\tself.parentProvidesComponentTypes->iterate(pt : ProvidesComponentType; acc1 : Bag(String) = Bag{} |\r\n--\t\t\tpt.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(String) = Bag{} |\r\n--\t\t\t\tacc2->union(r.providedInterface.identifier.id->asBag()) -- asBag required to allow Set operations #\r\n--\t\t\t)\r\n--\t\t)\r\n--\t)\r\ntrue",
			   "providedInterfaceHaveToConformToComponentType", "-- assures that InfrastructureComponents only have InfrastructureInterfaces and that BusinessComponents only have OperationInterfaces or EventGroups\r\nif self.componentType = ComponentType::INFRASTRUCTURE_COMPONENT then\r\n\tself.providedRoles_InterfaceProvidingEntity->select(role | role.oclIsTypeOf(OperationInterface) or role.oclIsTypeOf(EventGroup))->size() = 0\r\nelse if self.componentType = ComponentType::BUSINESS_COMPONENT then\r\n\tself.providedRoles_InterfaceProvidingEntity->select(role | role.oclIsTypeOf(InfrastructureInterface))->size() = 0\r\nelse\r\n\t1 = 0\r\nendif\r\nendif",
			   "provideSameOrMoreInterfacesAsCompleteComponentType", "-- ImplementationComponent has to provide the same or more interfaces like the CompleteComponentType (if set) #\r\n\tif\r\n\t\t -- apply constraint only for non-empty CompleteComponentTypes #\r\n\t\tself.parentCompleteComponentTypes->notEmpty()\r\n\tthen\r\n\t\tlet\r\n\t\t\t--own interfaces:\r\n\t\t\townInterfaces : Set(OperationInterface)\r\n\t\t\t  = self.providedRoles_InterfaceProvidingEntity->select(pr|pr.oclIsTypeOf(OperationProvidedRole))->collect(pr : ProvidedRole | pr.oclAsType (OperationProvidedRole).providedInterface__OperationProvidedRole)->asSet()\r\n    in    \r\n    \t--complete type interfaces:\r\n    \tself.parentCompleteComponentTypes->forAll\r\n      ( p : CompleteComponentType |\r\n        (\r\n        \tp.providedRoles_InterfaceProvidingEntity->select(pr|pr.oclIsTypeOf(OperationProvidedRole))->collect(pr : ProvidedRole | pr.oclAsType (OperationProvidedRole).providedInterface__OperationProvidedRole)->asSet()\r\n        \t-\r\n        \townInterfaces\r\n      \t)->isEmpty()\r\n    \t)\r\n\telse\r\n\t\ttrue\r\n\tendif",
			   "requireSameOrFewerInterfacesAsCompleteComponentType", "-- ImplementationComponent has to require the same or fewer interfaces like the CompleteComponentType (if set) #\r\n\tif\r\n\t\t-- apply constraint only for non-empty CompleteComponentTypes #\r\n\t\tself.parentCompleteComponentTypes->notEmpty()\r\n\tthen\r\n\t    let\r\n\t      --own interfaces:\r\n\t      ownInterfaces : Set(OperationInterface) \r\n\t        = self.requiredRoles_InterfaceRequiringEntity->select(rr|rr.oclIsTypeOf(OperationRequiredRole))->collect(rr : RequiredRole | rr.oclAsType (OperationRequiredRole).requiredInterface__OperationRequiredRole)->asSet()\r\n\t    in\r\n\t      --complete type interfaces:\r\n\t      self.parentCompleteComponentTypes->forAll\r\n\t      ( p : CompleteComponentType |\r\n\t      \t(\r\n\t\t      \townInterfaces\r\n\t\t        -\r\n\t\t        p.requiredRoles_InterfaceRequiringEntity->select(rr|rr.oclIsTypeOf(OperationRequiredRole))->collect(rr : RequiredRole | rr.oclAsType (OperationRequiredRole).requiredInterface__OperationRequiredRole)->asSet()\r\n\t      \t)->isEmpty()\r\n\t    \t)\r\n\telse\r\n\t\ttrue\r\n\tendif"
		   });
		addAnnotation
		  (repositoryEClass,
		   source,
		   new String[] {
			   "repositorynotempty", "self.components__Repository->size()<>0 or self.dataTypes__Repository->size()<>0 or self.interfaces__Repository->size()<>0 or self.failureTypes__Repository->size()<>0"
		   });
		addAnnotation
		  (interfaceEClass,
		   source,
		   new String[] {
			   "noProtocolTypeIDUsedTwice", "self.protocols__Interface->forAll(p1, p2 |\r\np1.protocolTypeID <> p2.protocolTypeID)\r\n"
		   });
		addAnnotation
		  (getInterface__IsAssignableFrom__Interface(),
		   source,
		   new String[] {
			   "body", "self->closure(i : Interface | i.parentInterfaces__Interface)->including(self)->includes(otherInterface)"
		   });
		addAnnotation
		  (operationSignatureEClass,
		   source,
		   new String[] {
			   "parameterNamesHaveToBeUniqueForASignature", "self.parameters__OperationSignature->isUnique(p : Parameter |\r\n\tp.parameterName\r\n)"
		   });
		addAnnotation
		  (operationInterfaceEClass,
		   source,
		   new String[] {
			   "signaturesHaveToBeUniqueForAnInterface", "-- full signature has to be unique \r\n-- (use of ocl-tupels) #\r\nlet sigs : Bag(\r\n\t-- parameters: Sequence of DataType, NOT name #\r\n\t-- exceptions have not to be considered #\r\n\tTuple(returnType : DataType, serviceName : String, parameters : Sequence(DataType) ) \r\n) = \r\nself.signatures__OperationInterface->collect(sig : OperationSignature |\r\n\tTuple{\r\n\t\treturnType : DataType = sig.returnType__OperationSignature,\r\n\t\tserviceName : String = sig.entityName,\r\n\t\tparameters : Sequence(DataType) = sig.parameters__OperationSignature.dataType__Parameter\r\n\t}\r\n)\r\nin\r\nsigs->isUnique(s|s)"
		   });
		addAnnotation
		  (completeComponentTypeEClass,
		   source,
		   new String[] {
			   "atLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType", "(\r\n\tself.oclIsTypeOf(CompleteComponentType)\r\n\tor\r\n\tself.oclIsTypeOf(ImplementationComponentType)\r\n\tor\r\n\tself.oclIsTypeOf(CompositeComponent)\r\n\tor\r\n\tself.oclIsTypeOf(BasicComponent)\r\n)\r\nimplies\r\n(\r\n\tself.providedRoles_InterfaceProvidingEntity->size() >= 1\r\n\tor\r\n\tself.requiredRoles_InterfaceRequiringEntity->size() >= 1\r\n)",
			   "providedInterfacesHaveToConformToProvidedType2", "-- CompleteTypes provided Interfaces have to be a superset\r\n-- of ProvidesComponentType provided Interfaces #\r\n--\r\n-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n--\r\n-- Recursive Query for parent Interface IDs\r\n-- see \"lpar2005.pdf\" (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n--let parentInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(Interface) = Bag{} |\r\n--\t\tacc2->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t) in\r\n--let anchestorInterfaces : Bag(Interface) =\r\n--\tself.providedRoles->iterate(r : ProvidedRole; acc4 : Bag(Interface) = Bag{} |\r\n--\t\tacc4->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n--\t)->union( -- union with anchestors found in former recursion #\r\n--\t\tself.providedRoles->iterate(r : ProvidedRole; acc6 : Bag(Interface) = Bag{} |\r\n--\t\t\tacc6->union(r.providedInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n--\t\t)\r\n--\t) in\r\n--\t-- Directly provided anchestorInterfaces need to be a superset of provided interfaces of Supertype #\r\n--\tanchestorInterfaces.identifier.id->includesAll(\r\n--\t\tself.parentProvidesComponentTypes->iterate(pt : ProvidesComponentType; acc1 : Bag(String) = Bag{} |\r\n--\t\t\tpt.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(String) = Bag{} |\r\n--\t\t\t\tacc2->union(r.providedInterface.identifier.id->asBag()) -- asBag required to allow Set operations #\r\n--\t\t\t)\r\n--\t\t)\r\n--\t)\r\ntrue"
		   });
		addAnnotation
		  (providesComponentTypeEClass,
		   source,
		   new String[] {
			   "atLeastOneInterfaceHasToBeProvidedByAUsefullProvidesComponentType", "self.oclIsTypeOf(ProvidesComponentType)\r\nimplies\r\nself.providedRoles_InterfaceProvidingEntity->size() >= 1"
		   });
	}

} //RepositoryPackageImpl

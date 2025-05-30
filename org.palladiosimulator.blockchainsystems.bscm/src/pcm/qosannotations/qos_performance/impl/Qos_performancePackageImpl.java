/**
 */
package pcm.qosannotations.qos_performance.impl;

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

import pcm.qosannotations.qos_performance.ComponentSpecifiedExecutionTime;
import pcm.qosannotations.qos_performance.Qos_performanceFactory;
import pcm.qosannotations.qos_performance.Qos_performancePackage;
import pcm.qosannotations.qos_performance.SpecifiedExecutionTime;
import pcm.qosannotations.qos_performance.SystemSpecifiedExecutionTime;

import pcm.qosannotations.qos_performance.util.Qos_performanceValidator;

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
public class Qos_performancePackageImpl extends EPackageImpl implements Qos_performancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSpecifiedExecutionTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specifiedExecutionTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSpecifiedExecutionTimeEClass = null;

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
	 * @see pcm.qosannotations.qos_performance.Qos_performancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Qos_performancePackageImpl() {
		super(eNS_URI, Qos_performanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Qos_performancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Qos_performancePackage init() {
		if (isInited) return (Qos_performancePackage)EPackage.Registry.INSTANCE.getEPackage(Qos_performancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQos_performancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Qos_performancePackageImpl theQos_performancePackage = registeredQos_performancePackage instanceof Qos_performancePackageImpl ? (Qos_performancePackageImpl)registeredQos_performancePackage : new Qos_performancePackageImpl();

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
		theQos_performancePackage.createPackageContents();
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
		theQos_performancePackage.initializePackageContents();
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
			(theQos_performancePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return Qos_performanceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theQos_performancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Qos_performancePackage.eNS_URI, theQos_performancePackage);
		return theQos_performancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemSpecifiedExecutionTime() {
		return systemSpecifiedExecutionTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecifiedExecutionTime() {
		return specifiedExecutionTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecifiedExecutionTime_Specification_SpecifiedExecutionTime() {
		return (EReference)specifiedExecutionTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentSpecifiedExecutionTime() {
		return componentSpecifiedExecutionTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentSpecifiedExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime() {
		return (EReference)componentSpecifiedExecutionTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qos_performanceFactory getQos_performanceFactory() {
		return (Qos_performanceFactory)getEFactoryInstance();
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
		systemSpecifiedExecutionTimeEClass = createEClass(SYSTEM_SPECIFIED_EXECUTION_TIME);

		specifiedExecutionTimeEClass = createEClass(SPECIFIED_EXECUTION_TIME);
		createEReference(specifiedExecutionTimeEClass, SPECIFIED_EXECUTION_TIME__SPECIFICATION_SPECIFIED_EXECUTION_TIME);

		componentSpecifiedExecutionTimeEClass = createEClass(COMPONENT_SPECIFIED_EXECUTION_TIME);
		createEReference(componentSpecifiedExecutionTimeEClass, COMPONENT_SPECIFIED_EXECUTION_TIME__ASSEMBLY_CONTEXT_COMPONENT_SPECIFIED_EXECUTION_TIME);
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
		QosannotationsPackage theQosannotationsPackage = (QosannotationsPackage)EPackage.Registry.INSTANCE.getEPackage(QosannotationsPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemSpecifiedExecutionTimeEClass.getESuperTypes().add(this.getSpecifiedExecutionTime());
		specifiedExecutionTimeEClass.getESuperTypes().add(theQosannotationsPackage.getSpecifiedQoSAnnotation());
		componentSpecifiedExecutionTimeEClass.getESuperTypes().add(this.getSpecifiedExecutionTime());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemSpecifiedExecutionTimeEClass, SystemSpecifiedExecutionTime.class, "SystemSpecifiedExecutionTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specifiedExecutionTimeEClass, SpecifiedExecutionTime.class, "SpecifiedExecutionTime", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecifiedExecutionTime_Specification_SpecifiedExecutionTime(), theCorePackage.getPCMRandomVariable(), theCorePackage.getPCMRandomVariable_SpecifiedExecutionTime_PCMRandomVariable(), "specification_SpecifiedExecutionTime", null, 1, 1, SpecifiedExecutionTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(componentSpecifiedExecutionTimeEClass, ComponentSpecifiedExecutionTime.class, "ComponentSpecifiedExecutionTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentSpecifiedExecutionTime_AssemblyContext_ComponentSpecifiedExecutionTime(), theCompositionPackage.getAssemblyContext(), null, "assemblyContext_ComponentSpecifiedExecutionTime", null, 1, 1, ComponentSpecifiedExecutionTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
		  (systemSpecifiedExecutionTimeEClass,
		   source,
		   new String[] {
			   "constraints", "systemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem"
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
		  (systemSpecifiedExecutionTimeEClass,
		   source,
		   new String[] {
			   "systemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem", "(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(pcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(pcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(pcm::system::System))\r\n"
		   });
	}

} //Qos_performancePackageImpl

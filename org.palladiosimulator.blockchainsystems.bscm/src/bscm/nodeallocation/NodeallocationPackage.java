/**
 */
package bscm.nodeallocation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bscm.nodeallocation.NodeallocationFactory
 * @model kind="package"
 * @generated
 */
public interface NodeallocationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nodeallocation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/BlockchainSystemComponentModel/NodeAllocation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nodeallocation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodeallocationPackage eINSTANCE = bscm.nodeallocation.impl.NodeallocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link bscm.nodeallocation.impl.NodeAllocationImpl <em>Node Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.nodeallocation.impl.NodeAllocationImpl
	 * @see bscm.nodeallocation.impl.NodeallocationPackageImpl#getNodeAllocation()
	 * @generated
	 */
	int NODE_ALLOCATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION__ALLOCATION_CONTEXTS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Allocation Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION__NODE_ALLOCATION_ENVIRONMENT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION__NODE_SYSTEM = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Geographical Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION__NODE_GEOGRAPHICAL_ENVIRONMENT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Node Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.nodeallocation.impl.NodeAllocationRepositoryImpl <em>Node Allocation Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.nodeallocation.impl.NodeAllocationRepositoryImpl
	 * @see bscm.nodeallocation.impl.NodeallocationPackageImpl#getNodeAllocationRepository()
	 * @generated
	 */
	int NODE_ALLOCATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Node Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY__NODE_ALLOCATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Allocation Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Node Allocation Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_REPOSITORY_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.nodeallocation.impl.NodeAllocationContextImpl <em>Node Allocation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.nodeallocation.impl.NodeAllocationContextImpl
	 * @see bscm.nodeallocation.impl.NodeallocationPackageImpl#getNodeAllocationContext()
	 * @generated
	 */
	int NODE_ALLOCATION_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT__RESOURCE_CONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Geographical Region Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node Allocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Node Allocation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ALLOCATION_CONTEXT_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link bscm.nodeallocation.NodeAllocation <em>Node Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Allocation</em>'.
	 * @see bscm.nodeallocation.NodeAllocation
	 * @generated
	 */
	EClass getNodeAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link bscm.nodeallocation.NodeAllocation#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation Contexts</em>'.
	 * @see bscm.nodeallocation.NodeAllocation#getAllocationContexts()
	 * @see #getNodeAllocation()
	 * @generated
	 */
	EReference getNodeAllocation_AllocationContexts();

	/**
	 * Returns the meta object for the reference '{@link bscm.nodeallocation.NodeAllocation#getNodeAllocationEnvironment <em>Node Allocation Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Allocation Environment</em>'.
	 * @see bscm.nodeallocation.NodeAllocation#getNodeAllocationEnvironment()
	 * @see #getNodeAllocation()
	 * @generated
	 */
	EReference getNodeAllocation_NodeAllocationEnvironment();

	/**
	 * Returns the meta object for the reference '{@link bscm.nodeallocation.NodeAllocation#getNodeSystem <em>Node System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node System</em>'.
	 * @see bscm.nodeallocation.NodeAllocation#getNodeSystem()
	 * @see #getNodeAllocation()
	 * @generated
	 */
	EReference getNodeAllocation_NodeSystem();

	/**
	 * Returns the meta object for the reference '{@link bscm.nodeallocation.NodeAllocation#getNodeGeographicalEnvironment <em>Node Geographical Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Geographical Environment</em>'.
	 * @see bscm.nodeallocation.NodeAllocation#getNodeGeographicalEnvironment()
	 * @see #getNodeAllocation()
	 * @generated
	 */
	EReference getNodeAllocation_NodeGeographicalEnvironment();

	/**
	 * Returns the meta object for class '{@link bscm.nodeallocation.NodeAllocationRepository <em>Node Allocation Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Allocation Repository</em>'.
	 * @see bscm.nodeallocation.NodeAllocationRepository
	 * @generated
	 */
	EClass getNodeAllocationRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link bscm.nodeallocation.NodeAllocationRepository#getNodeAllocations <em>Node Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Allocations</em>'.
	 * @see bscm.nodeallocation.NodeAllocationRepository#getNodeAllocations()
	 * @see #getNodeAllocationRepository()
	 * @generated
	 */
	EReference getNodeAllocationRepository_NodeAllocations();

	/**
	 * Returns the meta object for class '{@link bscm.nodeallocation.NodeAllocationContext <em>Node Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Allocation Context</em>'.
	 * @see bscm.nodeallocation.NodeAllocationContext
	 * @generated
	 */
	EClass getNodeAllocationContext();

	/**
	 * Returns the meta object for the reference '{@link bscm.nodeallocation.NodeAllocationContext#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context</em>'.
	 * @see bscm.nodeallocation.NodeAllocationContext#getAssemblyContext()
	 * @see #getNodeAllocationContext()
	 * @generated
	 */
	EReference getNodeAllocationContext_AssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link bscm.nodeallocation.NodeAllocationContext#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Container</em>'.
	 * @see bscm.nodeallocation.NodeAllocationContext#getResourceContainer()
	 * @see #getNodeAllocationContext()
	 * @generated
	 */
	EReference getNodeAllocationContext_ResourceContainer();

	/**
	 * Returns the meta object for the reference '{@link bscm.nodeallocation.NodeAllocationContext#getNodeGeographicalRegionSpecification <em>Node Geographical Region Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Geographical Region Specification</em>'.
	 * @see bscm.nodeallocation.NodeAllocationContext#getNodeGeographicalRegionSpecification()
	 * @see #getNodeAllocationContext()
	 * @generated
	 */
	EReference getNodeAllocationContext_NodeGeographicalRegionSpecification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NodeallocationFactory getNodeallocationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bscm.nodeallocation.impl.NodeAllocationImpl <em>Node Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.nodeallocation.impl.NodeAllocationImpl
		 * @see bscm.nodeallocation.impl.NodeallocationPackageImpl#getNodeAllocation()
		 * @generated
		 */
		EClass NODE_ALLOCATION = eINSTANCE.getNodeAllocation();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ALLOCATION__ALLOCATION_CONTEXTS = eINSTANCE.getNodeAllocation_AllocationContexts();

		/**
		 * The meta object literal for the '<em><b>Node Allocation Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ALLOCATION__NODE_ALLOCATION_ENVIRONMENT = eINSTANCE.getNodeAllocation_NodeAllocationEnvironment();

		/**
		 * The meta object literal for the '<em><b>Node System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ALLOCATION__NODE_SYSTEM = eINSTANCE.getNodeAllocation_NodeSystem();

		/**
		 * The meta object literal for the '<em><b>Node Geographical Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ALLOCATION__NODE_GEOGRAPHICAL_ENVIRONMENT = eINSTANCE.getNodeAllocation_NodeGeographicalEnvironment();

		/**
		 * The meta object literal for the '{@link bscm.nodeallocation.impl.NodeAllocationRepositoryImpl <em>Node Allocation Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.nodeallocation.impl.NodeAllocationRepositoryImpl
		 * @see bscm.nodeallocation.impl.NodeallocationPackageImpl#getNodeAllocationRepository()
		 * @generated
		 */
		EClass NODE_ALLOCATION_REPOSITORY = eINSTANCE.getNodeAllocationRepository();

		/**
		 * The meta object literal for the '<em><b>Node Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ALLOCATION_REPOSITORY__NODE_ALLOCATIONS = eINSTANCE.getNodeAllocationRepository_NodeAllocations();

		/**
		 * The meta object literal for the '{@link bscm.nodeallocation.impl.NodeAllocationContextImpl <em>Node Allocation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.nodeallocation.impl.NodeAllocationContextImpl
		 * @see bscm.nodeallocation.impl.NodeallocationPackageImpl#getNodeAllocationContext()
		 * @generated
		 */
		EClass NODE_ALLOCATION_CONTEXT = eINSTANCE.getNodeAllocationContext();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT = eINSTANCE.getNodeAllocationContext_AssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Resource Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ALLOCATION_CONTEXT__RESOURCE_CONTAINER = eINSTANCE.getNodeAllocationContext_ResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Node Geographical Region Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ALLOCATION_CONTEXT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION = eINSTANCE.getNodeAllocationContext_NodeGeographicalRegionSpecification();

	}

} //NodeallocationPackage

/**
 */
package bscm.p2pnetwork;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see bscm.p2pnetwork.P2pnetworkFactory
 * @model kind="package"
 * @generated
 */
public interface P2pnetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "p2pnetwork";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/BlockchainSystemComponentModel/P2PNetwork/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "P2PNetwork";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	P2pnetworkPackage eINSTANCE = bscm.p2pnetwork.impl.P2pnetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.P2PNetworkImpl <em>P2P Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.P2PNetworkImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getP2PNetwork()
	 * @generated
	 */
	int P2P_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Topology</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK__TOPOLOGY = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>P2P Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>P2P Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P2P_NETWORK_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.NetworkTopologyImpl <em>Network Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.NetworkTopologyImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getNetworkTopology()
	 * @generated
	 */
	int NETWORK_TOPOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Network Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Network Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TOPOLOGY_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.ExplicitNetworkTopologyImpl <em>Explicit Network Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.ExplicitNetworkTopologyImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getExplicitNetworkTopology()
	 * @generated
	 */
	int EXPLICIT_NETWORK_TOPOLOGY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY__ID = NETWORK_TOPOLOGY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY__ENTITY_NAME = NETWORK_TOPOLOGY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY__NODES = NETWORK_TOPOLOGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY__LINKS = NETWORK_TOPOLOGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Explicit Network Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY_FEATURE_COUNT = NETWORK_TOPOLOGY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___ECLASS = NETWORK_TOPOLOGY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___EIS_PROXY = NETWORK_TOPOLOGY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___ERESOURCE = NETWORK_TOPOLOGY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___ECONTAINER = NETWORK_TOPOLOGY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___ECONTAINING_FEATURE = NETWORK_TOPOLOGY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___ECONTAINMENT_FEATURE = NETWORK_TOPOLOGY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___ECONTENTS = NETWORK_TOPOLOGY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___EALL_CONTENTS = NETWORK_TOPOLOGY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___ECROSS_REFERENCES = NETWORK_TOPOLOGY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE = NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE_BOOLEAN = NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___ESET__ESTRUCTURALFEATURE_OBJECT = NETWORK_TOPOLOGY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___EIS_SET__ESTRUCTURALFEATURE = NETWORK_TOPOLOGY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___EUNSET__ESTRUCTURALFEATURE = NETWORK_TOPOLOGY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY___EINVOKE__EOPERATION_ELIST = NETWORK_TOPOLOGY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Explicit Network Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLICIT_NETWORK_TOPOLOGY_OPERATION_COUNT = NETWORK_TOPOLOGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.ConstraintNetworkTopologyImpl <em>Constraint Network Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.ConstraintNetworkTopologyImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getConstraintNetworkTopology()
	 * @generated
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY__ID = NETWORK_TOPOLOGY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY__ENTITY_NAME = NETWORK_TOPOLOGY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Constraint Network Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY_FEATURE_COUNT = NETWORK_TOPOLOGY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___ECLASS = NETWORK_TOPOLOGY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___EIS_PROXY = NETWORK_TOPOLOGY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___ERESOURCE = NETWORK_TOPOLOGY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___ECONTAINER = NETWORK_TOPOLOGY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___ECONTAINING_FEATURE = NETWORK_TOPOLOGY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___ECONTAINMENT_FEATURE = NETWORK_TOPOLOGY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___ECONTENTS = NETWORK_TOPOLOGY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___EALL_CONTENTS = NETWORK_TOPOLOGY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___ECROSS_REFERENCES = NETWORK_TOPOLOGY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE = NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE_BOOLEAN = NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___ESET__ESTRUCTURALFEATURE_OBJECT = NETWORK_TOPOLOGY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___EIS_SET__ESTRUCTURALFEATURE = NETWORK_TOPOLOGY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___EUNSET__ESTRUCTURALFEATURE = NETWORK_TOPOLOGY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY___EINVOKE__EOPERATION_ELIST = NETWORK_TOPOLOGY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Constraint Network Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_NETWORK_TOPOLOGY_OPERATION_COUNT = NETWORK_TOPOLOGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.NodeImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ALLOCATION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.LinkImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__FROM_NODE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TO_NODE = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.LinkSpecificationImpl <em>Link Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.LinkSpecificationImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLinkSpecification()
	 * @generated
	 */
	int LINK_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Latency Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION__LATENCY_SPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Throughput Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION__THROUGHPUT_SPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Link Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_SPECIFICATION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.ConnectedSubgraphsNetworkTopologyImpl <em>Connected Subgraphs Network Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.ConnectedSubgraphsNetworkTopologyImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getConnectedSubgraphsNetworkTopology()
	 * @generated
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY__ID = CONSTRAINT_NETWORK_TOPOLOGY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY__ENTITY_NAME = CONSTRAINT_NETWORK_TOPOLOGY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Subgraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY__SUBGRAPHS = CONSTRAINT_NETWORK_TOPOLOGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subgraph Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY__SUBGRAPH_LINKS = CONSTRAINT_NETWORK_TOPOLOGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connected Subgraphs Network Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY_FEATURE_COUNT = CONSTRAINT_NETWORK_TOPOLOGY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___ECLASS = CONSTRAINT_NETWORK_TOPOLOGY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___EIS_PROXY = CONSTRAINT_NETWORK_TOPOLOGY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___ERESOURCE = CONSTRAINT_NETWORK_TOPOLOGY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___ECONTAINER = CONSTRAINT_NETWORK_TOPOLOGY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___ECONTAINING_FEATURE = CONSTRAINT_NETWORK_TOPOLOGY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___ECONTAINMENT_FEATURE = CONSTRAINT_NETWORK_TOPOLOGY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___ECONTENTS = CONSTRAINT_NETWORK_TOPOLOGY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___EALL_CONTENTS = CONSTRAINT_NETWORK_TOPOLOGY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___ECROSS_REFERENCES = CONSTRAINT_NETWORK_TOPOLOGY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE = CONSTRAINT_NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE_BOOLEAN = CONSTRAINT_NETWORK_TOPOLOGY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___ESET__ESTRUCTURALFEATURE_OBJECT = CONSTRAINT_NETWORK_TOPOLOGY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___EIS_SET__ESTRUCTURALFEATURE = CONSTRAINT_NETWORK_TOPOLOGY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___EUNSET__ESTRUCTURALFEATURE = CONSTRAINT_NETWORK_TOPOLOGY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY___EINVOKE__EOPERATION_ELIST = CONSTRAINT_NETWORK_TOPOLOGY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Connected Subgraphs Network Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY_OPERATION_COUNT = CONSTRAINT_NETWORK_TOPOLOGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.SubgraphSpecificationImpl <em>Subgraph Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.SubgraphSpecificationImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getSubgraphSpecification()
	 * @generated
	 */
	int SUBGRAPH_SPECIFICATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Node Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION__NODE_TEMPLATES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connectivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION__CONNECTIVITY = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subgraph Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Subgraph Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_SPECIFICATION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.SubgraphLinkImpl <em>Subgraph Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.SubgraphLinkImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getSubgraphLink()
	 * @generated
	 */
	int SUBGRAPH_LINK = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK__SPECIFICATION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected Subgraphs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK__CONNECTED_SUBGRAPHS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subgraph Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Subgraph Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_LINK_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.SubgraphNodeTemplateImpl <em>Subgraph Node Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.SubgraphNodeTemplateImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getSubgraphNodeTemplate()
	 * @generated
	 */
	int SUBGRAPH_NODE_TEMPLATE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Number Of Node Occurences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE__NUMBER_OF_NODE_OCCURENCES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE__ALLOCATION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Subgraph Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE__IS_SUBGRAPH_PROXY = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subgraph Node Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Subgraph Node Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGRAPH_NODE_TEMPLATE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.LinkLatencySpecificationImpl <em>Link Latency Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.LinkLatencySpecificationImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLinkLatencySpecification()
	 * @generated
	 */
	int LINK_LATENCY_SPECIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LATENCY_SPECIFICATION__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Link Latency Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LATENCY_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link Latency Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LATENCY_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.LinkLatencySpecificationValueImpl <em>Link Latency Specification Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.LinkLatencySpecificationValueImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLinkLatencySpecificationValue()
	 * @generated
	 */
	int LINK_LATENCY_SPECIFICATION_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LATENCY_SPECIFICATION_VALUE__LATENCY = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LATENCY_SPECIFICATION_VALUE__PROBABILITY = 1;

	/**
	 * The number of structural features of the '<em>Link Latency Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LATENCY_SPECIFICATION_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link Latency Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_LATENCY_SPECIFICATION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.LinkThroughputSpecificationImpl <em>Link Throughput Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.LinkThroughputSpecificationImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLinkThroughputSpecification()
	 * @generated
	 */
	int LINK_THROUGHPUT_SPECIFICATION = 13;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_THROUGHPUT_SPECIFICATION__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Link Throughput Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_THROUGHPUT_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link Throughput Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_THROUGHPUT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bscm.p2pnetwork.impl.LinkThroughputSpecificationValueImpl <em>Link Throughput Specification Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.p2pnetwork.impl.LinkThroughputSpecificationValueImpl
	 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLinkThroughputSpecificationValue()
	 * @generated
	 */
	int LINK_THROUGHPUT_SPECIFICATION_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_THROUGHPUT_SPECIFICATION_VALUE__THROUGHPUT = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_THROUGHPUT_SPECIFICATION_VALUE__PROBABILITY = 1;

	/**
	 * The number of structural features of the '<em>Link Throughput Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_THROUGHPUT_SPECIFICATION_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link Throughput Specification Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_THROUGHPUT_SPECIFICATION_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.P2PNetwork <em>P2P Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>P2P Network</em>'.
	 * @see bscm.p2pnetwork.P2PNetwork
	 * @generated
	 */
	EClass getP2PNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link bscm.p2pnetwork.P2PNetwork#getTopology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topology</em>'.
	 * @see bscm.p2pnetwork.P2PNetwork#getTopology()
	 * @see #getP2PNetwork()
	 * @generated
	 */
	EReference getP2PNetwork_Topology();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.NetworkTopology <em>Network Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Topology</em>'.
	 * @see bscm.p2pnetwork.NetworkTopology
	 * @generated
	 */
	EClass getNetworkTopology();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.ExplicitNetworkTopology <em>Explicit Network Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explicit Network Topology</em>'.
	 * @see bscm.p2pnetwork.ExplicitNetworkTopology
	 * @generated
	 */
	EClass getExplicitNetworkTopology();

	/**
	 * Returns the meta object for the containment reference list '{@link bscm.p2pnetwork.ExplicitNetworkTopology#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see bscm.p2pnetwork.ExplicitNetworkTopology#getNodes()
	 * @see #getExplicitNetworkTopology()
	 * @generated
	 */
	EReference getExplicitNetworkTopology_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link bscm.p2pnetwork.ExplicitNetworkTopology#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see bscm.p2pnetwork.ExplicitNetworkTopology#getLinks()
	 * @see #getExplicitNetworkTopology()
	 * @generated
	 */
	EReference getExplicitNetworkTopology_Links();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.ConstraintNetworkTopology <em>Constraint Network Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Network Topology</em>'.
	 * @see bscm.p2pnetwork.ConstraintNetworkTopology
	 * @generated
	 */
	EClass getConstraintNetworkTopology();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see bscm.p2pnetwork.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link bscm.p2pnetwork.Node#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation</em>'.
	 * @see bscm.p2pnetwork.Node#getAllocation()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Allocation();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see bscm.p2pnetwork.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference '{@link bscm.p2pnetwork.Link#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see bscm.p2pnetwork.Link#getSpecification()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Specification();

	/**
	 * Returns the meta object for the reference '{@link bscm.p2pnetwork.Link#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Node</em>'.
	 * @see bscm.p2pnetwork.Link#getFromNode()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_FromNode();

	/**
	 * Returns the meta object for the reference '{@link bscm.p2pnetwork.Link#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Node</em>'.
	 * @see bscm.p2pnetwork.Link#getToNode()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_ToNode();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.LinkSpecification <em>Link Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Specification</em>'.
	 * @see bscm.p2pnetwork.LinkSpecification
	 * @generated
	 */
	EClass getLinkSpecification();

	/**
	 * Returns the meta object for the reference '{@link bscm.p2pnetwork.LinkSpecification#getLatencySpecification <em>Latency Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Latency Specification</em>'.
	 * @see bscm.p2pnetwork.LinkSpecification#getLatencySpecification()
	 * @see #getLinkSpecification()
	 * @generated
	 */
	EReference getLinkSpecification_LatencySpecification();

	/**
	 * Returns the meta object for the reference '{@link bscm.p2pnetwork.LinkSpecification#getThroughputSpecification <em>Throughput Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Throughput Specification</em>'.
	 * @see bscm.p2pnetwork.LinkSpecification#getThroughputSpecification()
	 * @see #getLinkSpecification()
	 * @generated
	 */
	EReference getLinkSpecification_ThroughputSpecification();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology <em>Connected Subgraphs Network Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connected Subgraphs Network Topology</em>'.
	 * @see bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology
	 * @generated
	 */
	EClass getConnectedSubgraphsNetworkTopology();

	/**
	 * Returns the meta object for the containment reference list '{@link bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology#getSubgraphs <em>Subgraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgraphs</em>'.
	 * @see bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology#getSubgraphs()
	 * @see #getConnectedSubgraphsNetworkTopology()
	 * @generated
	 */
	EReference getConnectedSubgraphsNetworkTopology_Subgraphs();

	/**
	 * Returns the meta object for the containment reference list '{@link bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology#getSubgraphLinks <em>Subgraph Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgraph Links</em>'.
	 * @see bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology#getSubgraphLinks()
	 * @see #getConnectedSubgraphsNetworkTopology()
	 * @generated
	 */
	EReference getConnectedSubgraphsNetworkTopology_SubgraphLinks();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.SubgraphSpecification <em>Subgraph Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subgraph Specification</em>'.
	 * @see bscm.p2pnetwork.SubgraphSpecification
	 * @generated
	 */
	EClass getSubgraphSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link bscm.p2pnetwork.SubgraphSpecification#getNodeTemplates <em>Node Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Templates</em>'.
	 * @see bscm.p2pnetwork.SubgraphSpecification#getNodeTemplates()
	 * @see #getSubgraphSpecification()
	 * @generated
	 */
	EReference getSubgraphSpecification_NodeTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link bscm.p2pnetwork.SubgraphSpecification#getLinkSpecification <em>Link Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Specification</em>'.
	 * @see bscm.p2pnetwork.SubgraphSpecification#getLinkSpecification()
	 * @see #getSubgraphSpecification()
	 * @generated
	 */
	EReference getSubgraphSpecification_LinkSpecification();

	/**
	 * Returns the meta object for the attribute '{@link bscm.p2pnetwork.SubgraphSpecification#getConnectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connectivity</em>'.
	 * @see bscm.p2pnetwork.SubgraphSpecification#getConnectivity()
	 * @see #getSubgraphSpecification()
	 * @generated
	 */
	EAttribute getSubgraphSpecification_Connectivity();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.SubgraphLink <em>Subgraph Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subgraph Link</em>'.
	 * @see bscm.p2pnetwork.SubgraphLink
	 * @generated
	 */
	EClass getSubgraphLink();

	/**
	 * Returns the meta object for the containment reference '{@link bscm.p2pnetwork.SubgraphLink#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see bscm.p2pnetwork.SubgraphLink#getSpecification()
	 * @see #getSubgraphLink()
	 * @generated
	 */
	EReference getSubgraphLink_Specification();

	/**
	 * Returns the meta object for the reference list '{@link bscm.p2pnetwork.SubgraphLink#getConnectedSubgraphs <em>Connected Subgraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Subgraphs</em>'.
	 * @see bscm.p2pnetwork.SubgraphLink#getConnectedSubgraphs()
	 * @see #getSubgraphLink()
	 * @generated
	 */
	EReference getSubgraphLink_ConnectedSubgraphs();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.SubgraphNodeTemplate <em>Subgraph Node Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subgraph Node Template</em>'.
	 * @see bscm.p2pnetwork.SubgraphNodeTemplate
	 * @generated
	 */
	EClass getSubgraphNodeTemplate();

	/**
	 * Returns the meta object for the attribute '{@link bscm.p2pnetwork.SubgraphNodeTemplate#getNumberOfNodeOccurences <em>Number Of Node Occurences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Node Occurences</em>'.
	 * @see bscm.p2pnetwork.SubgraphNodeTemplate#getNumberOfNodeOccurences()
	 * @see #getSubgraphNodeTemplate()
	 * @generated
	 */
	EAttribute getSubgraphNodeTemplate_NumberOfNodeOccurences();

	/**
	 * Returns the meta object for the reference '{@link bscm.p2pnetwork.SubgraphNodeTemplate#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation</em>'.
	 * @see bscm.p2pnetwork.SubgraphNodeTemplate#getAllocation()
	 * @see #getSubgraphNodeTemplate()
	 * @generated
	 */
	EReference getSubgraphNodeTemplate_Allocation();

	/**
	 * Returns the meta object for the attribute '{@link bscm.p2pnetwork.SubgraphNodeTemplate#isIsSubgraphProxy <em>Is Subgraph Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Subgraph Proxy</em>'.
	 * @see bscm.p2pnetwork.SubgraphNodeTemplate#isIsSubgraphProxy()
	 * @see #getSubgraphNodeTemplate()
	 * @generated
	 */
	EAttribute getSubgraphNodeTemplate_IsSubgraphProxy();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.LinkLatencySpecification <em>Link Latency Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Latency Specification</em>'.
	 * @see bscm.p2pnetwork.LinkLatencySpecification
	 * @generated
	 */
	EClass getLinkLatencySpecification();

	/**
	 * Returns the meta object for the reference list '{@link bscm.p2pnetwork.LinkLatencySpecification#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see bscm.p2pnetwork.LinkLatencySpecification#getValues()
	 * @see #getLinkLatencySpecification()
	 * @generated
	 */
	EReference getLinkLatencySpecification_Values();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.LinkLatencySpecificationValue <em>Link Latency Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Latency Specification Value</em>'.
	 * @see bscm.p2pnetwork.LinkLatencySpecificationValue
	 * @generated
	 */
	EClass getLinkLatencySpecificationValue();

	/**
	 * Returns the meta object for the attribute '{@link bscm.p2pnetwork.LinkLatencySpecificationValue#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see bscm.p2pnetwork.LinkLatencySpecificationValue#getLatency()
	 * @see #getLinkLatencySpecificationValue()
	 * @generated
	 */
	EAttribute getLinkLatencySpecificationValue_Latency();

	/**
	 * Returns the meta object for the attribute '{@link bscm.p2pnetwork.LinkLatencySpecificationValue#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see bscm.p2pnetwork.LinkLatencySpecificationValue#getProbability()
	 * @see #getLinkLatencySpecificationValue()
	 * @generated
	 */
	EAttribute getLinkLatencySpecificationValue_Probability();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.LinkThroughputSpecification <em>Link Throughput Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Throughput Specification</em>'.
	 * @see bscm.p2pnetwork.LinkThroughputSpecification
	 * @generated
	 */
	EClass getLinkThroughputSpecification();

	/**
	 * Returns the meta object for the reference list '{@link bscm.p2pnetwork.LinkThroughputSpecification#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see bscm.p2pnetwork.LinkThroughputSpecification#getValues()
	 * @see #getLinkThroughputSpecification()
	 * @generated
	 */
	EReference getLinkThroughputSpecification_Values();

	/**
	 * Returns the meta object for class '{@link bscm.p2pnetwork.LinkThroughputSpecificationValue <em>Link Throughput Specification Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Throughput Specification Value</em>'.
	 * @see bscm.p2pnetwork.LinkThroughputSpecificationValue
	 * @generated
	 */
	EClass getLinkThroughputSpecificationValue();

	/**
	 * Returns the meta object for the attribute '{@link bscm.p2pnetwork.LinkThroughputSpecificationValue#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see bscm.p2pnetwork.LinkThroughputSpecificationValue#getThroughput()
	 * @see #getLinkThroughputSpecificationValue()
	 * @generated
	 */
	EAttribute getLinkThroughputSpecificationValue_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link bscm.p2pnetwork.LinkThroughputSpecificationValue#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see bscm.p2pnetwork.LinkThroughputSpecificationValue#getProbability()
	 * @see #getLinkThroughputSpecificationValue()
	 * @generated
	 */
	EAttribute getLinkThroughputSpecificationValue_Probability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	P2pnetworkFactory getP2pnetworkFactory();

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
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.P2PNetworkImpl <em>P2P Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.P2PNetworkImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getP2PNetwork()
		 * @generated
		 */
		EClass P2P_NETWORK = eINSTANCE.getP2PNetwork();

		/**
		 * The meta object literal for the '<em><b>Topology</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference P2P_NETWORK__TOPOLOGY = eINSTANCE.getP2PNetwork_Topology();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.NetworkTopologyImpl <em>Network Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.NetworkTopologyImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getNetworkTopology()
		 * @generated
		 */
		EClass NETWORK_TOPOLOGY = eINSTANCE.getNetworkTopology();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.ExplicitNetworkTopologyImpl <em>Explicit Network Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.ExplicitNetworkTopologyImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getExplicitNetworkTopology()
		 * @generated
		 */
		EClass EXPLICIT_NETWORK_TOPOLOGY = eINSTANCE.getExplicitNetworkTopology();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLICIT_NETWORK_TOPOLOGY__NODES = eINSTANCE.getExplicitNetworkTopology_Nodes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLICIT_NETWORK_TOPOLOGY__LINKS = eINSTANCE.getExplicitNetworkTopology_Links();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.ConstraintNetworkTopologyImpl <em>Constraint Network Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.ConstraintNetworkTopologyImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getConstraintNetworkTopology()
		 * @generated
		 */
		EClass CONSTRAINT_NETWORK_TOPOLOGY = eINSTANCE.getConstraintNetworkTopology();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.NodeImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ALLOCATION = eINSTANCE.getNode_Allocation();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.LinkImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SPECIFICATION = eINSTANCE.getLink_Specification();

		/**
		 * The meta object literal for the '<em><b>From Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__FROM_NODE = eINSTANCE.getLink_FromNode();

		/**
		 * The meta object literal for the '<em><b>To Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TO_NODE = eINSTANCE.getLink_ToNode();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.LinkSpecificationImpl <em>Link Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.LinkSpecificationImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLinkSpecification()
		 * @generated
		 */
		EClass LINK_SPECIFICATION = eINSTANCE.getLinkSpecification();

		/**
		 * The meta object literal for the '<em><b>Latency Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_SPECIFICATION__LATENCY_SPECIFICATION = eINSTANCE.getLinkSpecification_LatencySpecification();

		/**
		 * The meta object literal for the '<em><b>Throughput Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_SPECIFICATION__THROUGHPUT_SPECIFICATION = eINSTANCE.getLinkSpecification_ThroughputSpecification();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.ConnectedSubgraphsNetworkTopologyImpl <em>Connected Subgraphs Network Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.ConnectedSubgraphsNetworkTopologyImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getConnectedSubgraphsNetworkTopology()
		 * @generated
		 */
		EClass CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY = eINSTANCE.getConnectedSubgraphsNetworkTopology();

		/**
		 * The meta object literal for the '<em><b>Subgraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY__SUBGRAPHS = eINSTANCE.getConnectedSubgraphsNetworkTopology_Subgraphs();

		/**
		 * The meta object literal for the '<em><b>Subgraph Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY__SUBGRAPH_LINKS = eINSTANCE.getConnectedSubgraphsNetworkTopology_SubgraphLinks();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.SubgraphSpecificationImpl <em>Subgraph Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.SubgraphSpecificationImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getSubgraphSpecification()
		 * @generated
		 */
		EClass SUBGRAPH_SPECIFICATION = eINSTANCE.getSubgraphSpecification();

		/**
		 * The meta object literal for the '<em><b>Node Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGRAPH_SPECIFICATION__NODE_TEMPLATES = eINSTANCE.getSubgraphSpecification_NodeTemplates();

		/**
		 * The meta object literal for the '<em><b>Link Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGRAPH_SPECIFICATION__LINK_SPECIFICATION = eINSTANCE.getSubgraphSpecification_LinkSpecification();

		/**
		 * The meta object literal for the '<em><b>Connectivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBGRAPH_SPECIFICATION__CONNECTIVITY = eINSTANCE.getSubgraphSpecification_Connectivity();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.SubgraphLinkImpl <em>Subgraph Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.SubgraphLinkImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getSubgraphLink()
		 * @generated
		 */
		EClass SUBGRAPH_LINK = eINSTANCE.getSubgraphLink();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGRAPH_LINK__SPECIFICATION = eINSTANCE.getSubgraphLink_Specification();

		/**
		 * The meta object literal for the '<em><b>Connected Subgraphs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGRAPH_LINK__CONNECTED_SUBGRAPHS = eINSTANCE.getSubgraphLink_ConnectedSubgraphs();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.SubgraphNodeTemplateImpl <em>Subgraph Node Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.SubgraphNodeTemplateImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getSubgraphNodeTemplate()
		 * @generated
		 */
		EClass SUBGRAPH_NODE_TEMPLATE = eINSTANCE.getSubgraphNodeTemplate();

		/**
		 * The meta object literal for the '<em><b>Number Of Node Occurences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBGRAPH_NODE_TEMPLATE__NUMBER_OF_NODE_OCCURENCES = eINSTANCE.getSubgraphNodeTemplate_NumberOfNodeOccurences();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGRAPH_NODE_TEMPLATE__ALLOCATION = eINSTANCE.getSubgraphNodeTemplate_Allocation();

		/**
		 * The meta object literal for the '<em><b>Is Subgraph Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBGRAPH_NODE_TEMPLATE__IS_SUBGRAPH_PROXY = eINSTANCE.getSubgraphNodeTemplate_IsSubgraphProxy();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.LinkLatencySpecificationImpl <em>Link Latency Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.LinkLatencySpecificationImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLinkLatencySpecification()
		 * @generated
		 */
		EClass LINK_LATENCY_SPECIFICATION = eINSTANCE.getLinkLatencySpecification();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_LATENCY_SPECIFICATION__VALUES = eINSTANCE.getLinkLatencySpecification_Values();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.LinkLatencySpecificationValueImpl <em>Link Latency Specification Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.LinkLatencySpecificationValueImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLinkLatencySpecificationValue()
		 * @generated
		 */
		EClass LINK_LATENCY_SPECIFICATION_VALUE = eINSTANCE.getLinkLatencySpecificationValue();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_LATENCY_SPECIFICATION_VALUE__LATENCY = eINSTANCE.getLinkLatencySpecificationValue_Latency();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_LATENCY_SPECIFICATION_VALUE__PROBABILITY = eINSTANCE.getLinkLatencySpecificationValue_Probability();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.LinkThroughputSpecificationImpl <em>Link Throughput Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.LinkThroughputSpecificationImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLinkThroughputSpecification()
		 * @generated
		 */
		EClass LINK_THROUGHPUT_SPECIFICATION = eINSTANCE.getLinkThroughputSpecification();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_THROUGHPUT_SPECIFICATION__VALUES = eINSTANCE.getLinkThroughputSpecification_Values();

		/**
		 * The meta object literal for the '{@link bscm.p2pnetwork.impl.LinkThroughputSpecificationValueImpl <em>Link Throughput Specification Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.p2pnetwork.impl.LinkThroughputSpecificationValueImpl
		 * @see bscm.p2pnetwork.impl.P2pnetworkPackageImpl#getLinkThroughputSpecificationValue()
		 * @generated
		 */
		EClass LINK_THROUGHPUT_SPECIFICATION_VALUE = eINSTANCE.getLinkThroughputSpecificationValue();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_THROUGHPUT_SPECIFICATION_VALUE__THROUGHPUT = eINSTANCE.getLinkThroughputSpecificationValue_Throughput();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_THROUGHPUT_SPECIFICATION_VALUE__PROBABILITY = eINSTANCE.getLinkThroughputSpecificationValue_Probability();

	}

} //P2pnetworkPackage

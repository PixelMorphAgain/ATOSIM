/**
 */
package bscm.p2pnetwork.impl;

import bscm.p2pnetwork.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class P2pnetworkFactoryImpl extends EFactoryImpl implements P2pnetworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static P2pnetworkFactory init() {
		try {
			P2pnetworkFactory theP2pnetworkFactory = (P2pnetworkFactory)EPackage.Registry.INSTANCE.getEFactory(P2pnetworkPackage.eNS_URI);
			if (theP2pnetworkFactory != null) {
				return theP2pnetworkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new P2pnetworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P2pnetworkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case P2pnetworkPackage.P2P_NETWORK: return createP2PNetwork();
			case P2pnetworkPackage.EXPLICIT_NETWORK_TOPOLOGY: return createExplicitNetworkTopology();
			case P2pnetworkPackage.NODE: return createNode();
			case P2pnetworkPackage.LINK: return createLink();
			case P2pnetworkPackage.LINK_SPECIFICATION: return createLinkSpecification();
			case P2pnetworkPackage.CONNECTED_SUBGRAPHS_NETWORK_TOPOLOGY: return createConnectedSubgraphsNetworkTopology();
			case P2pnetworkPackage.SUBGRAPH_SPECIFICATION: return createSubgraphSpecification();
			case P2pnetworkPackage.SUBGRAPH_LINK: return createSubgraphLink();
			case P2pnetworkPackage.SUBGRAPH_NODE_TEMPLATE: return createSubgraphNodeTemplate();
			case P2pnetworkPackage.LINK_LATENCY_SPECIFICATION: return createLinkLatencySpecification();
			case P2pnetworkPackage.LINK_LATENCY_SPECIFICATION_VALUE: return createLinkLatencySpecificationValue();
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION: return createLinkThroughputSpecification();
			case P2pnetworkPackage.LINK_THROUGHPUT_SPECIFICATION_VALUE: return createLinkThroughputSpecificationValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P2PNetwork createP2PNetwork() {
		P2PNetworkImpl p2PNetwork = new P2PNetworkImpl();
		return p2PNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplicitNetworkTopology createExplicitNetworkTopology() {
		ExplicitNetworkTopologyImpl explicitNetworkTopology = new ExplicitNetworkTopologyImpl();
		return explicitNetworkTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkSpecification createLinkSpecification() {
		LinkSpecificationImpl linkSpecification = new LinkSpecificationImpl();
		return linkSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectedSubgraphsNetworkTopology createConnectedSubgraphsNetworkTopology() {
		ConnectedSubgraphsNetworkTopologyImpl connectedSubgraphsNetworkTopology = new ConnectedSubgraphsNetworkTopologyImpl();
		return connectedSubgraphsNetworkTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubgraphSpecification createSubgraphSpecification() {
		SubgraphSpecificationImpl subgraphSpecification = new SubgraphSpecificationImpl();
		return subgraphSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubgraphLink createSubgraphLink() {
		SubgraphLinkImpl subgraphLink = new SubgraphLinkImpl();
		return subgraphLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubgraphNodeTemplate createSubgraphNodeTemplate() {
		SubgraphNodeTemplateImpl subgraphNodeTemplate = new SubgraphNodeTemplateImpl();
		return subgraphNodeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkLatencySpecification createLinkLatencySpecification() {
		LinkLatencySpecificationImpl linkLatencySpecification = new LinkLatencySpecificationImpl();
		return linkLatencySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkLatencySpecificationValue createLinkLatencySpecificationValue() {
		LinkLatencySpecificationValueImpl linkLatencySpecificationValue = new LinkLatencySpecificationValueImpl();
		return linkLatencySpecificationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkThroughputSpecification createLinkThroughputSpecification() {
		LinkThroughputSpecificationImpl linkThroughputSpecification = new LinkThroughputSpecificationImpl();
		return linkThroughputSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkThroughputSpecificationValue createLinkThroughputSpecificationValue() {
		LinkThroughputSpecificationValueImpl linkThroughputSpecificationValue = new LinkThroughputSpecificationValueImpl();
		return linkThroughputSpecificationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public P2pnetworkPackage getP2pnetworkPackage() {
		return (P2pnetworkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static P2pnetworkPackage getPackage() {
		return P2pnetworkPackage.eINSTANCE;
	}

} //P2pnetworkFactoryImpl

/**
 */
package bscm.p2pnetwork.tests;

import bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology;
import bscm.p2pnetwork.P2pnetworkFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connected Subgraphs Network Topology</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectedSubgraphsNetworkTopologyTest extends ConstraintNetworkTopologyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectedSubgraphsNetworkTopologyTest.class);
	}

	/**
	 * Constructs a new Connected Subgraphs Network Topology test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedSubgraphsNetworkTopologyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Connected Subgraphs Network Topology test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConnectedSubgraphsNetworkTopology getFixture() {
		return (ConnectedSubgraphsNetworkTopology)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(P2pnetworkFactory.eINSTANCE.createConnectedSubgraphsNetworkTopology());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ConnectedSubgraphsNetworkTopologyTest

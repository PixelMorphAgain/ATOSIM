/**
 */
package bscm.p2pnetwork.tests;

import bscm.p2pnetwork.ExplicitNetworkTopology;
import bscm.p2pnetwork.P2pnetworkFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Explicit Network Topology</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExplicitNetworkTopologyTest extends NetworkTopologyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExplicitNetworkTopologyTest.class);
	}

	/**
	 * Constructs a new Explicit Network Topology test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitNetworkTopologyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Explicit Network Topology test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExplicitNetworkTopology getFixture() {
		return (ExplicitNetworkTopology)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(P2pnetworkFactory.eINSTANCE.createExplicitNetworkTopology());
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

} //ExplicitNetworkTopologyTest

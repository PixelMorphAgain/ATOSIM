/**
 */
package bscm.p2pnetwork.tests;

import bscm.p2pnetwork.P2PNetwork;
import bscm.p2pnetwork.P2pnetworkFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>P2P Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class P2PNetworkTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(P2PNetworkTest.class);
	}

	/**
	 * Constructs a new P2P Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P2PNetworkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this P2P Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected P2PNetwork getFixture() {
		return (P2PNetwork)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(P2pnetworkFactory.eINSTANCE.createP2PNetwork());
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

} //P2PNetworkTest

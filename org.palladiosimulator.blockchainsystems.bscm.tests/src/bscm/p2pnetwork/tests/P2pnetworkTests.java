/**
 */
package bscm.p2pnetwork.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>p2pnetwork</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class P2pnetworkTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new P2pnetworkTests("p2pnetwork Tests");
		suite.addTestSuite(P2PNetworkTest.class);
		suite.addTestSuite(ExplicitNetworkTopologyTest.class);
		suite.addTestSuite(NodeTest.class);
		suite.addTestSuite(LinkTest.class);
		suite.addTestSuite(LinkSpecificationTest.class);
		suite.addTestSuite(ConnectedSubgraphsNetworkTopologyTest.class);
		suite.addTestSuite(SubgraphSpecificationTest.class);
		suite.addTestSuite(SubgraphLinkTest.class);
		suite.addTestSuite(SubgraphNodeTemplateTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P2pnetworkTests(String name) {
		super(name);
	}

} //P2pnetworkTests

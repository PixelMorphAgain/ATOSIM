/**
 */
package bscm.nodesystem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>nodesystem</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodesystemTests extends TestSuite {

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
		TestSuite suite = new NodesystemTests("nodesystem Tests");
		suite.addTestSuite(BlockchainSystemNodeSystemTest.class);
		suite.addTestSuite(BlockchainSystemNodeAssemblyContextTest.class);
		suite.addTestSuite(NodeBehaviorSpecificationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesystemTests(String name) {
		super(name);
	}

} //NodesystemTests

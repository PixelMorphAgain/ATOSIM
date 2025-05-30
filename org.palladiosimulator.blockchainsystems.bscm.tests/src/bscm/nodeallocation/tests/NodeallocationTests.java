/**
 */
package bscm.nodeallocation.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>nodeallocation</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeallocationTests extends TestSuite {

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
		TestSuite suite = new NodeallocationTests("nodeallocation Tests");
		suite.addTestSuite(NodeAllocationTest.class);
		suite.addTestSuite(NodeAllocationRepositoryTest.class);
		suite.addTestSuite(NodeAllocationContextTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeallocationTests(String name) {
		super(name);
	}

} //NodeallocationTests

/**
 */
package bscm.nodeenvironment.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>nodeenvironment</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeenvironmentTests extends TestSuite {

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
		TestSuite suite = new NodeenvironmentTests("nodeenvironment Tests");
		suite.addTestSuite(NodeEnvironmentTest.class);
		suite.addTestSuite(NodeResourceContainerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeenvironmentTests(String name) {
		super(name);
	}

} //NodeenvironmentTests

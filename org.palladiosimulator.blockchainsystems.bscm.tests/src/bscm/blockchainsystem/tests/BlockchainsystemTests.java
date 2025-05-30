/**
 */
package bscm.blockchainsystem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>blockchainsystem</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainsystemTests extends TestSuite {

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
		TestSuite suite = new BlockchainsystemTests("blockchainsystem Tests");
		suite.addTestSuite(BlockchainSystemTest.class);
		suite.addTestSuite(BlockchainSystemSpecificationTest.class);
		suite.addTestSuite(TransactionsSpecificationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainsystemTests(String name) {
		super(name);
	}

} //BlockchainsystemTests

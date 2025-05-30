/**
 */
package bscm.blockchainsystemComponentRepository.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>blockchainsystemComponentRepository</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainsystemComponentRepositoryTests extends TestSuite {

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
		TestSuite suite = new BlockchainsystemComponentRepositoryTests("blockchainsystemComponentRepository Tests");
		suite.addTestSuite(BlockchainSystemNodeComponentRepositoryTest.class);
		suite.addTestSuite(BlockValidatorComponentTest.class);
		suite.addTestSuite(MiningProcessComponentTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainsystemComponentRepositoryTests(String name) {
		super(name);
	}

} //BlockchainsystemComponentRepositoryTests

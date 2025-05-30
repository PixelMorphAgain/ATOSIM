/**
 */
package bscm.blockchainsystem.tests;

import bscm.blockchainsystem.BlockchainSystem;
import bscm.blockchainsystem.BlockchainsystemFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Blockchain System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainSystemTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BlockchainSystemTest.class);
	}

	/**
	 * Constructs a new Blockchain System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainSystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Blockchain System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BlockchainSystem getFixture() {
		return (BlockchainSystem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BlockchainsystemFactory.eINSTANCE.createBlockchainSystem());
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

} //BlockchainSystemTest

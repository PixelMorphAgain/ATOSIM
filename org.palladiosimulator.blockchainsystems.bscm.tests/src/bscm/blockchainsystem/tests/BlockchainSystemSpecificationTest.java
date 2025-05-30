/**
 */
package bscm.blockchainsystem.tests;

import bscm.blockchainsystem.BlockchainSystemSpecification;
import bscm.blockchainsystem.BlockchainsystemFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Blockchain System Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainSystemSpecificationTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BlockchainSystemSpecificationTest.class);
	}

	/**
	 * Constructs a new Blockchain System Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainSystemSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Blockchain System Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BlockchainSystemSpecification getFixture() {
		return (BlockchainSystemSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BlockchainsystemFactory.eINSTANCE.createBlockchainSystemSpecification());
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

} //BlockchainSystemSpecificationTest

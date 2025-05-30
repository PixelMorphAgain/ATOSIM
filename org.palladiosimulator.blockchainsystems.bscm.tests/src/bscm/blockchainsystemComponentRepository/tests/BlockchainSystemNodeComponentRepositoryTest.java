/**
 */
package bscm.blockchainsystemComponentRepository.tests;

import bscm.blockchainsystemComponentRepository.BlockchainSystemNodeComponentRepository;
import bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Blockchain System Node Component Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainSystemNodeComponentRepositoryTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BlockchainSystemNodeComponentRepositoryTest.class);
	}

	/**
	 * Constructs a new Blockchain System Node Component Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainSystemNodeComponentRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Blockchain System Node Component Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BlockchainSystemNodeComponentRepository getFixture() {
		return (BlockchainSystemNodeComponentRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BlockchainsystemComponentRepositoryFactory.eINSTANCE.createBlockchainSystemNodeComponentRepository());
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

} //BlockchainSystemNodeComponentRepositoryTest

/**
 */
package bscm.blockchainsystemComponentRepository.tests;

import bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryFactory;
import bscm.blockchainsystemComponentRepository.MiningProcessComponent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mining Process Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningProcessComponentTest extends BlockchainSystemNodeComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MiningProcessComponentTest.class);
	}

	/**
	 * Constructs a new Mining Process Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningProcessComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mining Process Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MiningProcessComponent getFixture() {
		return (MiningProcessComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BlockchainsystemComponentRepositoryFactory.eINSTANCE.createMiningProcessComponent());
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

} //MiningProcessComponentTest

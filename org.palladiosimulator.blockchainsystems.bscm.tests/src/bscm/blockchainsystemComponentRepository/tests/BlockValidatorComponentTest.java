/**
 */
package bscm.blockchainsystemComponentRepository.tests;

import bscm.blockchainsystemComponentRepository.BlockValidatorComponent;
import bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Block Validator Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockValidatorComponentTest extends BlockchainSystemNodeComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BlockValidatorComponentTest.class);
	}

	/**
	 * Constructs a new Block Validator Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockValidatorComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Block Validator Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BlockValidatorComponent getFixture() {
		return (BlockValidatorComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BlockchainsystemComponentRepositoryFactory.eINSTANCE.createBlockValidatorComponent());
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

} //BlockValidatorComponentTest

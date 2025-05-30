/**
 */
package bscm.nodesystem.tests;

import bscm.nodesystem.BlockchainSystemNodeSystem;
import bscm.nodesystem.NodesystemFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Blockchain System Node System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainSystemNodeSystemTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BlockchainSystemNodeSystemTest.class);
	}

	/**
	 * Constructs a new Blockchain System Node System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainSystemNodeSystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Blockchain System Node System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BlockchainSystemNodeSystem getFixture() {
		return (BlockchainSystemNodeSystem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NodesystemFactory.eINSTANCE.createBlockchainSystemNodeSystem());
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

} //BlockchainSystemNodeSystemTest

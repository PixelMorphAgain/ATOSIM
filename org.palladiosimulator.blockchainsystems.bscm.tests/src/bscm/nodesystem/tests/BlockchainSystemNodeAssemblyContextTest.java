/**
 */
package bscm.nodesystem.tests;

import bscm.nodesystem.BlockchainSystemNodeAssemblyContext;
import bscm.nodesystem.NodesystemFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Blockchain System Node Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainSystemNodeAssemblyContextTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BlockchainSystemNodeAssemblyContextTest.class);
	}

	/**
	 * Constructs a new Blockchain System Node Assembly Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainSystemNodeAssemblyContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Blockchain System Node Assembly Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BlockchainSystemNodeAssemblyContext getFixture() {
		return (BlockchainSystemNodeAssemblyContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NodesystemFactory.eINSTANCE.createBlockchainSystemNodeAssemblyContext());
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

} //BlockchainSystemNodeAssemblyContextTest

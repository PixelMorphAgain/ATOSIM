/**
 */
package bscm.nodeallocation.tests;

import bscm.nodeallocation.NodeAllocationContext;
import bscm.nodeallocation.NodeallocationFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Allocation Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeAllocationContextTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeAllocationContextTest.class);
	}

	/**
	 * Constructs a new Node Allocation Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAllocationContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node Allocation Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodeAllocationContext getFixture() {
		return (NodeAllocationContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NodeallocationFactory.eINSTANCE.createNodeAllocationContext());
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

} //NodeAllocationContextTest

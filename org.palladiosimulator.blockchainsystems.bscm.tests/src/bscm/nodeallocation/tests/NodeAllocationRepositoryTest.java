/**
 */
package bscm.nodeallocation.tests;

import bscm.nodeallocation.NodeAllocationRepository;
import bscm.nodeallocation.NodeallocationFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Allocation Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeAllocationRepositoryTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeAllocationRepositoryTest.class);
	}

	/**
	 * Constructs a new Node Allocation Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAllocationRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node Allocation Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodeAllocationRepository getFixture() {
		return (NodeAllocationRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NodeallocationFactory.eINSTANCE.createNodeAllocationRepository());
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

} //NodeAllocationRepositoryTest

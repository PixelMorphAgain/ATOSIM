/**
 */
package bscm.nodesystem.tests;

import bscm.nodesystem.NodeBehaviorSpecification;
import bscm.nodesystem.NodesystemFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Behavior Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeBehaviorSpecificationTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeBehaviorSpecificationTest.class);
	}

	/**
	 * Constructs a new Node Behavior Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeBehaviorSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node Behavior Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodeBehaviorSpecification getFixture() {
		return (NodeBehaviorSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NodesystemFactory.eINSTANCE.createNodeBehaviorSpecification());
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

} //NodeBehaviorSpecificationTest

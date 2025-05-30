/**
 */
package bscm.nodeenvironment.tests;

import bscm.nodeenvironment.NodeResourceContainer;
import bscm.nodeenvironment.NodeenvironmentFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Resource Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeResourceContainerTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeResourceContainerTest.class);
	}

	/**
	 * Constructs a new Node Resource Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeResourceContainerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node Resource Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodeResourceContainer getFixture() {
		return (NodeResourceContainer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NodeenvironmentFactory.eINSTANCE.createNodeResourceContainer());
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

} //NodeResourceContainerTest

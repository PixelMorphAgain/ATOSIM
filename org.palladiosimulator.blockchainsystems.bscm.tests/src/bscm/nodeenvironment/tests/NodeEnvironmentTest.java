/**
 */
package bscm.nodeenvironment.tests;

import bscm.nodeenvironment.NodeEnvironment;
import bscm.nodeenvironment.NodeenvironmentFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeEnvironmentTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeEnvironmentTest.class);
	}

	/**
	 * Constructs a new Node Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeEnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodeEnvironment getFixture() {
		return (NodeEnvironment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NodeenvironmentFactory.eINSTANCE.createNodeEnvironment());
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

} //NodeEnvironmentTest

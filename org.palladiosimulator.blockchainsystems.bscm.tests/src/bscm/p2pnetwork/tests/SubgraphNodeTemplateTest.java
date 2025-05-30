/**
 */
package bscm.p2pnetwork.tests;

import bscm.p2pnetwork.P2pnetworkFactory;
import bscm.p2pnetwork.SubgraphNodeTemplate;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subgraph Node Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubgraphNodeTemplateTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubgraphNodeTemplateTest.class);
	}

	/**
	 * Constructs a new Subgraph Node Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubgraphNodeTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subgraph Node Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubgraphNodeTemplate getFixture() {
		return (SubgraphNodeTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(P2pnetworkFactory.eINSTANCE.createSubgraphNodeTemplate());
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

} //SubgraphNodeTemplateTest

/**
 */
package bscm.p2pnetwork.tests;

import bscm.p2pnetwork.P2pnetworkFactory;
import bscm.p2pnetwork.SubgraphLink;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subgraph Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubgraphLinkTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubgraphLinkTest.class);
	}

	/**
	 * Constructs a new Subgraph Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubgraphLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subgraph Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubgraphLink getFixture() {
		return (SubgraphLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(P2pnetworkFactory.eINSTANCE.createSubgraphLink());
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

} //SubgraphLinkTest

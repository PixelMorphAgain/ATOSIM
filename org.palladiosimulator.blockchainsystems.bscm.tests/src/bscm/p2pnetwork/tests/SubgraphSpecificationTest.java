/**
 */
package bscm.p2pnetwork.tests;

import bscm.p2pnetwork.P2pnetworkFactory;
import bscm.p2pnetwork.SubgraphSpecification;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subgraph Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubgraphSpecificationTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubgraphSpecificationTest.class);
	}

	/**
	 * Constructs a new Subgraph Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubgraphSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subgraph Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubgraphSpecification getFixture() {
		return (SubgraphSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(P2pnetworkFactory.eINSTANCE.createSubgraphSpecification());
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

} //SubgraphSpecificationTest

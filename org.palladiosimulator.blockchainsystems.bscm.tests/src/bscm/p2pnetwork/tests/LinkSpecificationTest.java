/**
 */
package bscm.p2pnetwork.tests;

import bscm.p2pnetwork.LinkSpecification;
import bscm.p2pnetwork.P2pnetworkFactory;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkSpecificationTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkSpecificationTest.class);
	}

	/**
	 * Constructs a new Link Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkSpecification getFixture() {
		return (LinkSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(P2pnetworkFactory.eINSTANCE.createLinkSpecification());
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

} //LinkSpecificationTest

/**
 */
package pcm.resourceenvironment.tests;

import identifier.tests.IdentifierTest;

import junit.textui.TestRunner;

import pcm.resourceenvironment.CommunicationLinkResourceSpecification;
import pcm.resourceenvironment.ResourceenvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Communication Link Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationLinkResourceSpecificationTest extends IdentifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommunicationLinkResourceSpecificationTest.class);
	}

	/**
	 * Constructs a new Communication Link Resource Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourceSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Communication Link Resource Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CommunicationLinkResourceSpecification getFixture() {
		return (CommunicationLinkResourceSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourceenvironmentFactory.eINSTANCE.createCommunicationLinkResourceSpecification());
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

} //CommunicationLinkResourceSpecificationTest

/**
 */
package pcm.resourcetype.tests;

import junit.textui.TestRunner;

import pcm.resourcetype.CommunicationLinkResourceType;
import pcm.resourcetype.ResourcetypeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Communication Link Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationLinkResourceTypeTest extends ResourceTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommunicationLinkResourceTypeTest.class);
	}

	/**
	 * Constructs a new Communication Link Resource Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkResourceTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Communication Link Resource Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CommunicationLinkResourceType getFixture() {
		return (CommunicationLinkResourceType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourcetypeFactory.eINSTANCE.createCommunicationLinkResourceType());
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

} //CommunicationLinkResourceTypeTest

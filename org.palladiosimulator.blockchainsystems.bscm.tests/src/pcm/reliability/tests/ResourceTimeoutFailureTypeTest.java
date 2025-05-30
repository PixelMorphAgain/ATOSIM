/**
 */
package pcm.reliability.tests;

import junit.textui.TestRunner;

import pcm.reliability.ReliabilityFactory;
import pcm.reliability.ResourceTimeoutFailureType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Timeout Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceTimeoutFailureTypeTest extends SoftwareInducedFailureTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceTimeoutFailureTypeTest.class);
	}

	/**
	 * Constructs a new Resource Timeout Failure Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTimeoutFailureTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Timeout Failure Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceTimeoutFailureType getFixture() {
		return (ResourceTimeoutFailureType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReliabilityFactory.eINSTANCE.createResourceTimeoutFailureType());
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

} //ResourceTimeoutFailureTypeTest

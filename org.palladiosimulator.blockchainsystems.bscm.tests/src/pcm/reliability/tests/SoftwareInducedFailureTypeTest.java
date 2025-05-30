/**
 */
package pcm.reliability.tests;

import junit.textui.TestRunner;

import pcm.reliability.ReliabilityFactory;
import pcm.reliability.SoftwareInducedFailureType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareInducedFailureTypeTest extends FailureTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareInducedFailureTypeTest.class);
	}

	/**
	 * Constructs a new Software Induced Failure Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareInducedFailureTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Software Induced Failure Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SoftwareInducedFailureType getFixture() {
		return (SoftwareInducedFailureType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReliabilityFactory.eINSTANCE.createSoftwareInducedFailureType());
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

} //SoftwareInducedFailureTypeTest

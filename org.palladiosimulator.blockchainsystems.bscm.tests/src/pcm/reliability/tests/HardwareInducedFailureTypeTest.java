/**
 */
package pcm.reliability.tests;

import junit.textui.TestRunner;

import pcm.reliability.HardwareInducedFailureType;
import pcm.reliability.ReliabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareInducedFailureTypeTest extends FailureTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HardwareInducedFailureTypeTest.class);
	}

	/**
	 * Constructs a new Hardware Induced Failure Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareInducedFailureTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hardware Induced Failure Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HardwareInducedFailureType getFixture() {
		return (HardwareInducedFailureType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReliabilityFactory.eINSTANCE.createHardwareInducedFailureType());
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

} //HardwareInducedFailureTypeTest

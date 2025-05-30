/**
 */
package pcm.reliability.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>reliability</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReliabilityTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ReliabilityTests("reliability Tests");
		suite.addTestSuite(HardwareInducedFailureTypeTest.class);
		suite.addTestSuite(SoftwareInducedFailureTypeTest.class);
		suite.addTestSuite(InternalFailureOccurrenceDescriptionTest.class);
		suite.addTestSuite(NetworkInducedFailureTypeTest.class);
		suite.addTestSuite(ExternalFailureOccurrenceDescriptionTest.class);
		suite.addTestSuite(ResourceTimeoutFailureTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityTests(String name) {
		super(name);
	}

} //ReliabilityTests

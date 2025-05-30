/**
 */
package pcm.qosannotations.qos_reliability.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>qos_reliability</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Qos_reliabilityTests extends TestSuite {

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
		TestSuite suite = new Qos_reliabilityTests("qos_reliability Tests");
		suite.addTestSuite(SpecifiedReliabilityAnnotationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qos_reliabilityTests(String name) {
		super(name);
	}

} //Qos_reliabilityTests

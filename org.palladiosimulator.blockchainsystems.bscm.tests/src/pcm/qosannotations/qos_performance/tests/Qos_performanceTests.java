/**
 */
package pcm.qosannotations.qos_performance.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>qos_performance</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Qos_performanceTests extends TestSuite {

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
		TestSuite suite = new Qos_performanceTests("qos_performance Tests");
		suite.addTestSuite(SystemSpecifiedExecutionTimeTest.class);
		suite.addTestSuite(ComponentSpecifiedExecutionTimeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qos_performanceTests(String name) {
		super(name);
	}

} //Qos_performanceTests

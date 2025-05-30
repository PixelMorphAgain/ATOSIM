/**
 */
package pcm.seff.seff_reliability.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>seff_reliability</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Seff_reliabilityTests extends TestSuite {

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
		TestSuite suite = new Seff_reliabilityTests("seff_reliability Tests");
		suite.addTestSuite(RecoveryActionBehaviourTest.class);
		suite.addTestSuite(RecoveryActionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seff_reliabilityTests(String name) {
		super(name);
	}

} //Seff_reliabilityTests

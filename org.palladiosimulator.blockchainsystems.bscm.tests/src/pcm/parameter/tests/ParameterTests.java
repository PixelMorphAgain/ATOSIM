/**
 */
package pcm.parameter.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>parameter</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterTests extends TestSuite {

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
		TestSuite suite = new ParameterTests("parameter Tests");
		suite.addTestSuite(VariableUsageTest.class);
		suite.addTestSuite(VariableCharacterisationTest.class);
		suite.addTestSuite(CharacterisedVariableTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTests(String name) {
		super(name);
	}

} //ParameterTests

/**
 */
package pcm.seff.seff_performance.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>seff_performance</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Seff_performanceTests extends TestSuite {

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
		TestSuite suite = new Seff_performanceTests("seff_performance Tests");
		suite.addTestSuite(InfrastructureCallTest.class);
		suite.addTestSuite(ResourceCallTest.class);
		suite.addTestSuite(ParametricResourceDemandTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seff_performanceTests(String name) {
		super(name);
	}

} //Seff_performanceTests

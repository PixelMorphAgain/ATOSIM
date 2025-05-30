/**
 */
package probfunction.tests;

import junit.textui.TestRunner;

import probfunction.ProbfunctionFactory;
import probfunction.StringSample;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Sample</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringSampleTest extends SampleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringSampleTest.class);
	}

	/**
	 * Constructs a new String Sample test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringSampleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String Sample test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StringSample getFixture() {
		return (StringSample)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbfunctionFactory.eINSTANCE.createStringSample());
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

} //StringSampleTest

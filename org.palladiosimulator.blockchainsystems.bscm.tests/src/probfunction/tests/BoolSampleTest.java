/**
 */
package probfunction.tests;

import junit.textui.TestRunner;

import probfunction.BoolSample;
import probfunction.ProbfunctionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bool Sample</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoolSampleTest extends SampleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoolSampleTest.class);
	}

	/**
	 * Constructs a new Bool Sample test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolSampleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bool Sample test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BoolSample getFixture() {
		return (BoolSample)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbfunctionFactory.eINSTANCE.createBoolSample());
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

} //BoolSampleTest

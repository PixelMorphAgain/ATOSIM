/**
 */
package probfunction.tests;

import junit.textui.TestRunner;

import probfunction.DoubleSample;
import probfunction.ProbfunctionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Double Sample</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DoubleSampleTest extends SampleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DoubleSampleTest.class);
	}

	/**
	 * Constructs a new Double Sample test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleSampleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Double Sample test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DoubleSample getFixture() {
		return (DoubleSample)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbfunctionFactory.eINSTANCE.createDoubleSample());
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

} //DoubleSampleTest

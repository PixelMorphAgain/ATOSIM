/**
 */
package probfunction.tests;

import junit.textui.TestRunner;

import probfunction.ProbabilityMassFunction;
import probfunction.ProbfunctionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Probability Mass Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbabilityMassFunctionTest extends ProbabilityFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProbabilityMassFunctionTest.class);
	}

	/**
	 * Constructs a new Probability Mass Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityMassFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Probability Mass Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProbabilityMassFunction<?> getFixture() {
		return (ProbabilityMassFunction<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbfunctionFactory.eINSTANCE.createProbabilityMassFunction());
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

} //ProbabilityMassFunctionTest

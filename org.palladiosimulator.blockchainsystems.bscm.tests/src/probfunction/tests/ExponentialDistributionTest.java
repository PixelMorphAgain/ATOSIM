/**
 */
package probfunction.tests;

import junit.textui.TestRunner;

import probfunction.ExponentialDistribution;
import probfunction.ProbfunctionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exponential Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExponentialDistributionTest extends ContinuousPDFTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExponentialDistributionTest.class);
	}

	/**
	 * Constructs a new Exponential Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialDistributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exponential Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExponentialDistribution getFixture() {
		return (ExponentialDistribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbfunctionFactory.eINSTANCE.createExponentialDistribution());
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

} //ExponentialDistributionTest

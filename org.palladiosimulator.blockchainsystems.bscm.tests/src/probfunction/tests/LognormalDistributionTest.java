/**
 */
package probfunction.tests;

import junit.textui.TestRunner;

import probfunction.LognormalDistribution;
import probfunction.ProbfunctionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lognormal Distribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LognormalDistributionTest extends ContinuousPDFTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LognormalDistributionTest.class);
	}

	/**
	 * Constructs a new Lognormal Distribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LognormalDistributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lognormal Distribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LognormalDistribution getFixture() {
		return (LognormalDistribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbfunctionFactory.eINSTANCE.createLognormalDistribution());
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

} //LognormalDistributionTest

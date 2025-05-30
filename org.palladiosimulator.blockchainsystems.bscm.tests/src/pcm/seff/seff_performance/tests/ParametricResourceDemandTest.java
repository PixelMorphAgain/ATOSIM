/**
 */
package pcm.seff.seff_performance.tests;

import junit.textui.TestRunner;

import pcm.seff.seff_performance.ParametricResourceDemand;
import pcm.seff.seff_performance.Seff_performanceFactory;

import pcm.tests.PCMBaseClassTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parametric Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParametricResourceDemandTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParametricResourceDemandTest.class);
	}

	/**
	 * Constructs a new Parametric Resource Demand test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametricResourceDemandTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parametric Resource Demand test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParametricResourceDemand getFixture() {
		return (ParametricResourceDemand)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Seff_performanceFactory.eINSTANCE.createParametricResourceDemand());
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

} //ParametricResourceDemandTest

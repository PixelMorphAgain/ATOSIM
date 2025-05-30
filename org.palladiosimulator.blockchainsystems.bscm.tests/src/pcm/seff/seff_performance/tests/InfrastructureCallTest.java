/**
 */
package pcm.seff.seff_performance.tests;

import junit.textui.TestRunner;

import pcm.seff.seff_performance.InfrastructureCall;
import pcm.seff.seff_performance.Seff_performanceFactory;

import pcm.seff.tests.CallActionTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureCallTest extends CallActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureCallTest.class);
	}

	/**
	 * Constructs a new Infrastructure Call test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureCallTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Infrastructure Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InfrastructureCall getFixture() {
		return (InfrastructureCall)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Seff_performanceFactory.eINSTANCE.createInfrastructureCall());
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

} //InfrastructureCallTest

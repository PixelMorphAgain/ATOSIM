/**
 */
package pcm.parameter.tests;

import junit.textui.TestRunner;

import pcm.parameter.ParameterFactory;
import pcm.parameter.VariableUsage;

import pcm.tests.PCMBaseClassTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable Usage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableUsageTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableUsageTest.class);
	}

	/**
	 * Constructs a new Variable Usage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableUsageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable Usage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariableUsage getFixture() {
		return (VariableUsage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ParameterFactory.eINSTANCE.createVariableUsage());
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

} //VariableUsageTest

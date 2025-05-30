/**
 */
package pcm.parameter.tests;

import junit.textui.TestRunner;

import pcm.parameter.ParameterFactory;
import pcm.parameter.VariableCharacterisation;

import pcm.tests.PCMBaseClassTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable Characterisation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableCharacterisationTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableCharacterisationTest.class);
	}

	/**
	 * Constructs a new Variable Characterisation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableCharacterisationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable Characterisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariableCharacterisation getFixture() {
		return (VariableCharacterisation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ParameterFactory.eINSTANCE.createVariableCharacterisation());
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

} //VariableCharacterisationTest

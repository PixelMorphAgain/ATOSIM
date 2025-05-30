/**
 */
package pcm.parameter.tests;

import junit.textui.TestRunner;

import pcm.parameter.CharacterisedVariable;
import pcm.parameter.ParameterFactory;

import stoex.tests.VariableTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Characterised Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CharacterisedVariableTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CharacterisedVariableTest.class);
	}

	/**
	 * Constructs a new Characterised Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterisedVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Characterised Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CharacterisedVariable getFixture() {
		return (CharacterisedVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ParameterFactory.eINSTANCE.createCharacterisedVariable());
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

} //CharacterisedVariableTest

/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.repository.RepositoryFactory;
import pcm.repository.RequiredCharacterisation;

import pcm.tests.PCMBaseClassTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Required Characterisation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredCharacterisationTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequiredCharacterisationTest.class);
	}

	/**
	 * Constructs a new Required Characterisation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCharacterisationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Required Characterisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequiredCharacterisation getFixture() {
		return (RequiredCharacterisation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createRequiredCharacterisation());
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

} //RequiredCharacterisationTest

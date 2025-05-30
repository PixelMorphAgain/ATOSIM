/**
 */
package pcm.usagemodel.tests;

import junit.textui.TestRunner;

import pcm.tests.PCMBaseClassTest;

import pcm.usagemodel.UsagemodelFactory;
import pcm.usagemodel.UserData;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserDataTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserDataTest.class);
	}

	/**
	 * Constructs a new User Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserData getFixture() {
		return (UserData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsagemodelFactory.eINSTANCE.createUserData());
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

} //UserDataTest

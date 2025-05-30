/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.repository.ExceptionType;
import pcm.repository.RepositoryFactory;

import pcm.tests.PCMBaseClassTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExceptionTypeTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExceptionTypeTest.class);
	}

	/**
	 * Constructs a new Exception Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exception Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExceptionType getFixture() {
		return (ExceptionType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createExceptionType());
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

} //ExceptionTypeTest

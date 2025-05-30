/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.repository.CompleteComponentType;
import pcm.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Complete Component Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompleteComponentTypeTest extends RepositoryComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompleteComponentTypeTest.class);
	}

	/**
	 * Constructs a new Complete Component Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteComponentTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Complete Component Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompleteComponentType getFixture() {
		return (CompleteComponentType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createCompleteComponentType());
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

} //CompleteComponentTypeTest

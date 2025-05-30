/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.repository.OperationRequiredRole;
import pcm.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operation Required Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationRequiredRoleTest extends RequiredRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperationRequiredRoleTest.class);
	}

	/**
	 * Constructs a new Operation Required Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRequiredRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operation Required Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OperationRequiredRole getFixture() {
		return (OperationRequiredRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createOperationRequiredRole());
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

} //OperationRequiredRoleTest

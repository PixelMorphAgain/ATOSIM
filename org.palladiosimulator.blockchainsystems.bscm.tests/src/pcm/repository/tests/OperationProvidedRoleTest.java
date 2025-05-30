/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.repository.OperationProvidedRole;
import pcm.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operation Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationProvidedRoleTest extends ProvidedRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperationProvidedRoleTest.class);
	}

	/**
	 * Constructs a new Operation Provided Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operation Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OperationProvidedRole getFixture() {
		return (OperationProvidedRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createOperationProvidedRole());
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

} //OperationProvidedRoleTest

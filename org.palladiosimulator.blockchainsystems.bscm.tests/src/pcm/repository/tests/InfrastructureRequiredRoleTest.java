/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.repository.InfrastructureRequiredRole;
import pcm.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure Required Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureRequiredRoleTest extends RequiredRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureRequiredRoleTest.class);
	}

	/**
	 * Constructs a new Infrastructure Required Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRequiredRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Infrastructure Required Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InfrastructureRequiredRole getFixture() {
		return (InfrastructureRequiredRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createInfrastructureRequiredRole());
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

} //InfrastructureRequiredRoleTest

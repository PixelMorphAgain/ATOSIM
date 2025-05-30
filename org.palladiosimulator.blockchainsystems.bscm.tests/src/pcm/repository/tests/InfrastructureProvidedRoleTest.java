/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.repository.InfrastructureProvidedRole;
import pcm.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureProvidedRoleTest extends ProvidedRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureProvidedRoleTest.class);
	}

	/**
	 * Constructs a new Infrastructure Provided Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureProvidedRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Infrastructure Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InfrastructureProvidedRole getFixture() {
		return (InfrastructureProvidedRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createInfrastructureProvidedRole());
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

} //InfrastructureProvidedRoleTest

/**
 */
package pcm.core.entity.tests;

import junit.textui.TestRunner;

import pcm.core.entity.EntityFactory;
import pcm.core.entity.ResourceRequiredRole;

import pcm.repository.tests.RoleTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Required Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceRequiredRoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceRequiredRoleTest.class);
	}

	/**
	 * Constructs a new Resource Required Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequiredRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Required Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceRequiredRole getFixture() {
		return (ResourceRequiredRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntityFactory.eINSTANCE.createResourceRequiredRole());
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

} //ResourceRequiredRoleTest

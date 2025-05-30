/**
 */
package pcm.core.entity.tests;

import junit.textui.TestRunner;

import pcm.core.entity.EntityFactory;
import pcm.core.entity.ResourceProvidedRole;

import pcm.repository.tests.RoleTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceProvidedRoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceProvidedRoleTest.class);
	}

	/**
	 * Constructs a new Resource Provided Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceProvidedRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceProvidedRole getFixture() {
		return (ResourceProvidedRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntityFactory.eINSTANCE.createResourceProvidedRole());
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

} //ResourceProvidedRoleTest

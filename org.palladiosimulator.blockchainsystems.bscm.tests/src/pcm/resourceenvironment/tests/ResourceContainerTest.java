/**
 */
package pcm.resourceenvironment.tests;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

import pcm.resourceenvironment.ResourceContainer;
import pcm.resourceenvironment.ResourceenvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceContainerTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceContainerTest.class);
	}

	/**
	 * Constructs a new Resource Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceContainer getFixture() {
		return (ResourceContainer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourceenvironmentFactory.eINSTANCE.createResourceContainer());
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

} //ResourceContainerTest

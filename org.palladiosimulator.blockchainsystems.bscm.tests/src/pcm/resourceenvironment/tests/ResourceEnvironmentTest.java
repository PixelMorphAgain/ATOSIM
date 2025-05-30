/**
 */
package pcm.resourceenvironment.tests;

import junit.textui.TestRunner;

import pcm.core.entity.tests.NamedElementTest;

import pcm.resourceenvironment.ResourceEnvironment;
import pcm.resourceenvironment.ResourceenvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceEnvironmentTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceEnvironmentTest.class);
	}

	/**
	 * Constructs a new Resource Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceEnvironment getFixture() {
		return (ResourceEnvironment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourceenvironmentFactory.eINSTANCE.createResourceEnvironment());
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

} //ResourceEnvironmentTest

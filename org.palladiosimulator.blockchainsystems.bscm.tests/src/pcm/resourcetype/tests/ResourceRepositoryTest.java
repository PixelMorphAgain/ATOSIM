/**
 */
package pcm.resourcetype.tests;

import junit.textui.TestRunner;

import pcm.resourcetype.ResourceRepository;
import pcm.resourcetype.ResourcetypeFactory;

import pcm.tests.PCMBaseClassTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceRepositoryTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceRepositoryTest.class);
	}

	/**
	 * Constructs a new Resource Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceRepository getFixture() {
		return (ResourceRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourcetypeFactory.eINSTANCE.createResourceRepository());
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

} //ResourceRepositoryTest

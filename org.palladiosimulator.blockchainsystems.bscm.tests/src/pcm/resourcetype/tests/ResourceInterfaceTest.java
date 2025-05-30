/**
 */
package pcm.resourcetype.tests;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

import pcm.resourcetype.ResourceInterface;
import pcm.resourcetype.ResourcetypeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceInterfaceTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceInterfaceTest.class);
	}

	/**
	 * Constructs a new Resource Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceInterface getFixture() {
		return (ResourceInterface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourcetypeFactory.eINSTANCE.createResourceInterface());
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

} //ResourceInterfaceTest

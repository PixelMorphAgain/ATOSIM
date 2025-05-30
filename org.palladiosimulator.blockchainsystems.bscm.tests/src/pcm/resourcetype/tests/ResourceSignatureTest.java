/**
 */
package pcm.resourcetype.tests;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

import pcm.resourcetype.ResourceSignature;
import pcm.resourcetype.ResourcetypeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Signature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceSignatureTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceSignatureTest.class);
	}

	/**
	 * Constructs a new Resource Signature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSignatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Signature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceSignature getFixture() {
		return (ResourceSignature)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourcetypeFactory.eINSTANCE.createResourceSignature());
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

} //ResourceSignatureTest

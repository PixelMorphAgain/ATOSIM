/**
 */
package pcm.seff.seff_performance.tests;

import junit.textui.TestRunner;

import pcm.seff.seff_performance.ResourceCall;
import pcm.seff.seff_performance.Seff_performanceFactory;

import pcm.seff.tests.CallActionTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceCallTest extends CallActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceCallTest.class);
	}

	/**
	 * Constructs a new Resource Call test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceCallTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceCall getFixture() {
		return (ResourceCall)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Seff_performanceFactory.eINSTANCE.createResourceCall());
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

} //ResourceCallTest

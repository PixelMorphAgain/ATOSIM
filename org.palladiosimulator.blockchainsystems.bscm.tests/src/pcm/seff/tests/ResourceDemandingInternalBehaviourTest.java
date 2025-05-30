/**
 */
package pcm.seff.tests;

import junit.textui.TestRunner;

import pcm.seff.ResourceDemandingInternalBehaviour;
import pcm.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Demanding Internal Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceDemandingInternalBehaviourTest extends ResourceDemandingBehaviourTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceDemandingInternalBehaviourTest.class);
	}

	/**
	 * Constructs a new Resource Demanding Internal Behaviour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDemandingInternalBehaviourTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Demanding Internal Behaviour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceDemandingInternalBehaviour getFixture() {
		return (ResourceDemandingInternalBehaviour)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createResourceDemandingInternalBehaviour());
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

} //ResourceDemandingInternalBehaviourTest

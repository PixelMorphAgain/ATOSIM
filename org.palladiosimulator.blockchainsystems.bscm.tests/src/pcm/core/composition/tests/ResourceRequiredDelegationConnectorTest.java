/**
 */
package pcm.core.composition.tests;

import junit.textui.TestRunner;

import pcm.core.composition.CompositionFactory;
import pcm.core.composition.ResourceRequiredDelegationConnector;

import pcm.tests.PCMBaseClassTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceRequiredDelegationConnectorTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceRequiredDelegationConnectorTest.class);
	}

	/**
	 * Constructs a new Resource Required Delegation Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequiredDelegationConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Required Delegation Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceRequiredDelegationConnector getFixture() {
		return (ResourceRequiredDelegationConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CompositionFactory.eINSTANCE.createResourceRequiredDelegationConnector());
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

} //ResourceRequiredDelegationConnectorTest

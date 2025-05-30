/**
 */
package pcm.core.composition.tests;

import junit.textui.TestRunner;

import pcm.core.composition.CompositionFactory;
import pcm.core.composition.RequiredResourceDelegationConnector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Required Resource Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredResourceDelegationConnectorTest extends DelegationConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequiredResourceDelegationConnectorTest.class);
	}

	/**
	 * Constructs a new Required Resource Delegation Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredResourceDelegationConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Required Resource Delegation Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequiredResourceDelegationConnector getFixture() {
		return (RequiredResourceDelegationConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CompositionFactory.eINSTANCE.createRequiredResourceDelegationConnector());
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

} //RequiredResourceDelegationConnectorTest

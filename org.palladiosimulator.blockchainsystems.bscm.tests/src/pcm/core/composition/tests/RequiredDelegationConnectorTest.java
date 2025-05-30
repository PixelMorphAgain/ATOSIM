/**
 */
package pcm.core.composition.tests;

import junit.textui.TestRunner;

import pcm.core.composition.CompositionFactory;
import pcm.core.composition.RequiredDelegationConnector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Required Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredDelegationConnectorTest extends DelegationConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequiredDelegationConnectorTest.class);
	}

	/**
	 * Constructs a new Required Delegation Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredDelegationConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Required Delegation Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequiredDelegationConnector getFixture() {
		return (RequiredDelegationConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CompositionFactory.eINSTANCE.createRequiredDelegationConnector());
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

} //RequiredDelegationConnectorTest

/**
 */
package pcm.core.composition.tests;

import junit.textui.TestRunner;

import pcm.core.composition.CompositionFactory;
import pcm.core.composition.RequiredInfrastructureDelegationConnector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Required Infrastructure Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredInfrastructureDelegationConnectorTest extends DelegationConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequiredInfrastructureDelegationConnectorTest.class);
	}

	/**
	 * Constructs a new Required Infrastructure Delegation Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInfrastructureDelegationConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Required Infrastructure Delegation Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequiredInfrastructureDelegationConnector getFixture() {
		return (RequiredInfrastructureDelegationConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CompositionFactory.eINSTANCE.createRequiredInfrastructureDelegationConnector());
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

} //RequiredInfrastructureDelegationConnectorTest

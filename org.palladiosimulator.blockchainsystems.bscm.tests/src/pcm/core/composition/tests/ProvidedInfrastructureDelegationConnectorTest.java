/**
 */
package pcm.core.composition.tests;

import junit.textui.TestRunner;

import pcm.core.composition.CompositionFactory;
import pcm.core.composition.ProvidedInfrastructureDelegationConnector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Provided Infrastructure Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProvidedInfrastructureDelegationConnectorTest extends DelegationConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProvidedInfrastructureDelegationConnectorTest.class);
	}

	/**
	 * Constructs a new Provided Infrastructure Delegation Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInfrastructureDelegationConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Provided Infrastructure Delegation Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProvidedInfrastructureDelegationConnector getFixture() {
		return (ProvidedInfrastructureDelegationConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CompositionFactory.eINSTANCE.createProvidedInfrastructureDelegationConnector());
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

} //ProvidedInfrastructureDelegationConnectorTest

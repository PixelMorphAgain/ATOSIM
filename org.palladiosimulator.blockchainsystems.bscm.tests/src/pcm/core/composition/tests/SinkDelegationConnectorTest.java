/**
 */
package pcm.core.composition.tests;

import junit.textui.TestRunner;

import pcm.core.composition.CompositionFactory;
import pcm.core.composition.SinkDelegationConnector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sink Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SinkDelegationConnectorTest extends DelegationConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SinkDelegationConnectorTest.class);
	}

	/**
	 * Constructs a new Sink Delegation Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkDelegationConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sink Delegation Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SinkDelegationConnector getFixture() {
		return (SinkDelegationConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CompositionFactory.eINSTANCE.createSinkDelegationConnector());
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

} //SinkDelegationConnectorTest

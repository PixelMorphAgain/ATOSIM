/**
 */
package pcm.core.composition.tests;

import junit.textui.TestRunner;

import pcm.core.composition.CompositionFactory;
import pcm.core.composition.EventChannelSinkConnector;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Channel Sink Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventChannelSinkConnectorTest extends ConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventChannelSinkConnectorTest.class);
	}

	/**
	 * Constructs a new Event Channel Sink Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChannelSinkConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Event Channel Sink Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EventChannelSinkConnector getFixture() {
		return (EventChannelSinkConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CompositionFactory.eINSTANCE.createEventChannelSinkConnector());
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

} //EventChannelSinkConnectorTest

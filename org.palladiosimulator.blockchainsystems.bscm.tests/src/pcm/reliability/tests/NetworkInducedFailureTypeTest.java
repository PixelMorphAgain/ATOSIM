/**
 */
package pcm.reliability.tests;

import junit.textui.TestRunner;

import pcm.reliability.NetworkInducedFailureType;
import pcm.reliability.ReliabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Induced Failure Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkInducedFailureTypeTest extends FailureTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkInducedFailureTypeTest.class);
	}

	/**
	 * Constructs a new Network Induced Failure Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInducedFailureTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Network Induced Failure Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NetworkInducedFailureType getFixture() {
		return (NetworkInducedFailureType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReliabilityFactory.eINSTANCE.createNetworkInducedFailureType());
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

} //NetworkInducedFailureTypeTest

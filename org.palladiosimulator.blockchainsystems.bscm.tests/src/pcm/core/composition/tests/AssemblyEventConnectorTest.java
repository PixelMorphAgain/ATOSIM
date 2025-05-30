/**
 */
package pcm.core.composition.tests;

import junit.textui.TestRunner;

import pcm.core.composition.AssemblyEventConnector;
import pcm.core.composition.CompositionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assembly Event Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyEventConnectorTest extends ConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssemblyEventConnectorTest.class);
	}

	/**
	 * Constructs a new Assembly Event Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyEventConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assembly Event Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssemblyEventConnector getFixture() {
		return (AssemblyEventConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CompositionFactory.eINSTANCE.createAssemblyEventConnector());
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

} //AssemblyEventConnectorTest

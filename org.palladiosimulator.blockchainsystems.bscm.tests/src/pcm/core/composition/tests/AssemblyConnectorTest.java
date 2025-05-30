/**
 */
package pcm.core.composition.tests;

import junit.textui.TestRunner;

import pcm.core.composition.AssemblyConnector;
import pcm.core.composition.CompositionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyConnectorTest extends ConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssemblyConnectorTest.class);
	}

	/**
	 * Constructs a new Assembly Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assembly Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssemblyConnector getFixture() {
		return (AssemblyConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CompositionFactory.eINSTANCE.createAssemblyConnector());
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

} //AssemblyConnectorTest

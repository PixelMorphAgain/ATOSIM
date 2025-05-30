/**
 */
package pcm.core.composition.tests;

import junit.textui.TestRunner;

import pcm.core.composition.AssemblyInfrastructureConnector;
import pcm.core.composition.CompositionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assembly Infrastructure Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyInfrastructureConnectorTest extends ConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssemblyInfrastructureConnectorTest.class);
	}

	/**
	 * Constructs a new Assembly Infrastructure Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyInfrastructureConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assembly Infrastructure Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssemblyInfrastructureConnector getFixture() {
		return (AssemblyInfrastructureConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CompositionFactory.eINSTANCE.createAssemblyInfrastructureConnector());
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

} //AssemblyInfrastructureConnectorTest

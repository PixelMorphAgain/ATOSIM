/**
 */
package pcm.core.composition.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>composition</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CompositionTests("composition Tests");
		suite.addTestSuite(ResourceRequiredDelegationConnectorTest.class);
		suite.addTestSuite(EventChannelTest.class);
		suite.addTestSuite(EventChannelSourceConnectorTest.class);
		suite.addTestSuite(EventChannelSinkConnectorTest.class);
		suite.addTestSuite(ProvidedDelegationConnectorTest.class);
		suite.addTestSuite(RequiredDelegationConnectorTest.class);
		suite.addTestSuite(AssemblyConnectorTest.class);
		suite.addTestSuite(AssemblyEventConnectorTest.class);
		suite.addTestSuite(SourceDelegationConnectorTest.class);
		suite.addTestSuite(SinkDelegationConnectorTest.class);
		suite.addTestSuite(AssemblyInfrastructureConnectorTest.class);
		suite.addTestSuite(ProvidedInfrastructureDelegationConnectorTest.class);
		suite.addTestSuite(RequiredInfrastructureDelegationConnectorTest.class);
		suite.addTestSuite(RequiredResourceDelegationConnectorTest.class);
		suite.addTestSuite(AssemblyContextTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionTests(String name) {
		super(name);
	}

} //CompositionTests

/**
 */
package pcm.repository.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>repository</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryTests extends TestSuite {

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
		TestSuite suite = new RepositoryTests("repository Tests");
		suite.addTestSuite(PassiveResourceTest.class);
		suite.addTestSuite(BasicComponentTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(RepositoryTest.class);
		suite.addTestSuite(RequiredCharacterisationTest.class);
		suite.addTestSuite(EventGroupTest.class);
		suite.addTestSuite(EventTypeTest.class);
		suite.addTestSuite(ExceptionTypeTest.class);
		suite.addTestSuite(InfrastructureSignatureTest.class);
		suite.addTestSuite(InfrastructureInterfaceTest.class);
		suite.addTestSuite(InfrastructureRequiredRoleTest.class);
		suite.addTestSuite(OperationSignatureTest.class);
		suite.addTestSuite(OperationInterfaceTest.class);
		suite.addTestSuite(OperationRequiredRoleTest.class);
		suite.addTestSuite(SourceRoleTest.class);
		suite.addTestSuite(SinkRoleTest.class);
		suite.addTestSuite(OperationProvidedRoleTest.class);
		suite.addTestSuite(InfrastructureProvidedRoleTest.class);
		suite.addTestSuite(CompleteComponentTypeTest.class);
		suite.addTestSuite(ProvidesComponentTypeTest.class);
		suite.addTestSuite(CompositeComponentTest.class);
		suite.addTestSuite(PrimitiveDataTypeTest.class);
		suite.addTestSuite(CollectionDataTypeTest.class);
		suite.addTestSuite(CompositeDataTypeTest.class);
		suite.addTestSuite(InnerDeclarationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryTests(String name) {
		super(name);
	}

} //RepositoryTests

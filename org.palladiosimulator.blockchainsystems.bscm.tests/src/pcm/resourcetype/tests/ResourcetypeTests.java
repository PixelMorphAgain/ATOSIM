/**
 */
package pcm.resourcetype.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>resourcetype</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcetypeTests extends TestSuite {

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
		TestSuite suite = new ResourcetypeTests("resourcetype Tests");
		suite.addTestSuite(ResourceSignatureTest.class);
		suite.addTestSuite(ProcessingResourceTypeTest.class);
		suite.addTestSuite(ResourceRepositoryTest.class);
		suite.addTestSuite(SchedulingPolicyTest.class);
		suite.addTestSuite(CommunicationLinkResourceTypeTest.class);
		suite.addTestSuite(ResourceInterfaceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcetypeTests(String name) {
		super(name);
	}

} //ResourcetypeTests

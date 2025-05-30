/**
 */
package pcm.resourceenvironment.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>resourceenvironment</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceenvironmentTests extends TestSuite {

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
		TestSuite suite = new ResourceenvironmentTests("resourceenvironment Tests");
		suite.addTestSuite(ResourceEnvironmentTest.class);
		suite.addTestSuite(LinkingResourceTest.class);
		suite.addTestSuite(ResourceContainerTest.class);
		suite.addTestSuite(ProcessingResourceSpecificationTest.class);
		suite.addTestSuite(CommunicationLinkResourceSpecificationTest.class);
		suite.addTestSuite(HDDProcessingResourceSpecificationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceenvironmentTests(String name) {
		super(name);
	}

} //ResourceenvironmentTests

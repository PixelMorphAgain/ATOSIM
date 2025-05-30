/**
 */
package pcm.core.entity.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>entity</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityTests extends TestSuite {

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
		TestSuite suite = new EntityTests("entity Tests");
		suite.addTestSuite(ResourceProvidedRoleTest.class);
		suite.addTestSuite(ResourceInterfaceRequiringEntityTest.class);
		suite.addTestSuite(ResourceRequiredRoleTest.class);
		suite.addTestSuite(ResourceInterfaceProvidingEntityTest.class);
		suite.addTestSuite(ResourceInterfaceProvidingRequiringEntityTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTests(String name) {
		super(name);
	}

} //EntityTests

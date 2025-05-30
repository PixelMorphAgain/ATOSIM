/**
 */
package ecore.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ecore</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreTests extends TestSuite {

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
		TestSuite suite = new EcoreTests("ecore Tests");
		suite.addTestSuite(EAttributeTest.class);
		suite.addTestSuite(EAnnotationTest.class);
		suite.addTestSuite(EClassTest.class);
		suite.addTestSuite(EDataTypeTest.class);
		suite.addTestSuite(EEnumTest.class);
		suite.addTestSuite(EEnumLiteralTest.class);
		suite.addTestSuite(EFactoryTest.class);
		suite.addTestSuite(EObjectTest.class);
		suite.addTestSuite(EOperationTest.class);
		suite.addTestSuite(EPackageTest.class);
		suite.addTestSuite(EParameterTest.class);
		suite.addTestSuite(EReferenceTest.class);
		suite.addTestSuite(EGenericTypeTest.class);
		suite.addTestSuite(ETypeParameterTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreTests(String name) {
		super(name);
	}

} //EcoreTests

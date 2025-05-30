/**
 */
package units.tests;

import junit.textui.TestRunner;

import units.UnitMultiplication;
import units.UnitsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unit Multiplication</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitMultiplicationTest extends UnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnitMultiplicationTest.class);
	}

	/**
	 * Constructs a new Unit Multiplication test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitMultiplicationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unit Multiplication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnitMultiplication getFixture() {
		return (UnitMultiplication)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnitsFactory.eINSTANCE.createUnitMultiplication());
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

} //UnitMultiplicationTest

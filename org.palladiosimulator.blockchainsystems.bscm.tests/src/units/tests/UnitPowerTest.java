/**
 */
package units.tests;

import junit.textui.TestRunner;

import units.UnitPower;
import units.UnitsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unit Power</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitPowerTest extends UnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnitPowerTest.class);
	}

	/**
	 * Constructs a new Unit Power test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitPowerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unit Power test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnitPower getFixture() {
		return (UnitPower)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnitsFactory.eINSTANCE.createUnitPower());
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

} //UnitPowerTest

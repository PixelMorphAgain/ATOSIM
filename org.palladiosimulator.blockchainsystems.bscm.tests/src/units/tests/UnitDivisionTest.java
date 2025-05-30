/**
 */
package units.tests;

import junit.textui.TestRunner;

import units.UnitDivision;
import units.UnitsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unit Division</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitDivisionTest extends UnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnitDivisionTest.class);
	}

	/**
	 * Constructs a new Unit Division test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDivisionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unit Division test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnitDivision getFixture() {
		return (UnitDivision)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnitsFactory.eINSTANCE.createUnitDivision());
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

} //UnitDivisionTest

/**
 */
package units.tests;

import junit.textui.TestRunner;

import units.BaseUnit;
import units.UnitsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Base Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseUnitTest extends UnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BaseUnitTest.class);
	}

	/**
	 * Constructs a new Base Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseUnitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Base Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BaseUnit getFixture() {
		return (BaseUnit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnitsFactory.eINSTANCE.createBaseUnit());
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

} //BaseUnitTest

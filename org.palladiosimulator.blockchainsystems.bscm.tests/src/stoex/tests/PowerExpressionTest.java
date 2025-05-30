/**
 */
package stoex.tests;

import junit.textui.TestRunner;

import stoex.PowerExpression;
import stoex.StoexFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Power Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerExpressionTest extends PowerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PowerExpressionTest.class);
	}

	/**
	 * Constructs a new Power Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Power Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PowerExpression getFixture() {
		return (PowerExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StoexFactory.eINSTANCE.createPowerExpression());
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

} //PowerExpressionTest

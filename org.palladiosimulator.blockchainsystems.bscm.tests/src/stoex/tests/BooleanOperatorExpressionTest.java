/**
 */
package stoex.tests;

import junit.textui.TestRunner;

import stoex.BooleanOperatorExpression;
import stoex.StoexFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanOperatorExpressionTest extends BooleanExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanOperatorExpressionTest.class);
	}

	/**
	 * Constructs a new Boolean Operator Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperatorExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Operator Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanOperatorExpression getFixture() {
		return (BooleanOperatorExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StoexFactory.eINSTANCE.createBooleanOperatorExpression());
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

} //BooleanOperatorExpressionTest

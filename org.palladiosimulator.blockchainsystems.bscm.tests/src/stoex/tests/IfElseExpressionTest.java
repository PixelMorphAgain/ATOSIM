/**
 */
package stoex.tests;

import junit.textui.TestRunner;

import stoex.IfElseExpression;
import stoex.StoexFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>If Else Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfElseExpressionTest extends IfElseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IfElseExpressionTest.class);
	}

	/**
	 * Constructs a new If Else Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfElseExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this If Else Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IfElseExpression getFixture() {
		return (IfElseExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StoexFactory.eINSTANCE.createIfElseExpression());
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

} //IfElseExpressionTest

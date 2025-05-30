/**
 */
package stoex.tests;

import junit.textui.TestRunner;

import stoex.StoexFactory;
import stoex.TermExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Term Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermExpressionTest extends TermTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TermExpressionTest.class);
	}

	/**
	 * Constructs a new Term Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Term Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TermExpression getFixture() {
		return (TermExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StoexFactory.eINSTANCE.createTermExpression());
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

} //TermExpressionTest

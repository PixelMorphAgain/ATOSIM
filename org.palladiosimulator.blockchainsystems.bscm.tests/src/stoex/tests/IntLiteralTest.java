/**
 */
package stoex.tests;

import junit.textui.TestRunner;

import stoex.IntLiteral;
import stoex.StoexFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Int Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntLiteralTest extends NumericLiteralTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntLiteralTest.class);
	}

	/**
	 * Constructs a new Int Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntLiteralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Int Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntLiteral getFixture() {
		return (IntLiteral)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StoexFactory.eINSTANCE.createIntLiteral());
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

} //IntLiteralTest

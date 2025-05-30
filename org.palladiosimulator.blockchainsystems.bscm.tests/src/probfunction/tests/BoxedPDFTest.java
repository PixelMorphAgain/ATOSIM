/**
 */
package probfunction.tests;

import junit.textui.TestRunner;

import probfunction.BoxedPDF;
import probfunction.ProbfunctionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boxed PDF</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoxedPDFTest extends ProbabilityDensityFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoxedPDFTest.class);
	}

	/**
	 * Constructs a new Boxed PDF test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxedPDFTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boxed PDF test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BoxedPDF getFixture() {
		return (BoxedPDF)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbfunctionFactory.eINSTANCE.createBoxedPDF());
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

} //BoxedPDFTest

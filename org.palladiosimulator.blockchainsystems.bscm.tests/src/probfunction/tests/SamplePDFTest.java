/**
 */
package probfunction.tests;

import junit.textui.TestRunner;

import probfunction.ProbfunctionFactory;
import probfunction.SamplePDF;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sample PDF</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SamplePDFTest extends ProbabilityDensityFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SamplePDFTest.class);
	}

	/**
	 * Constructs a new Sample PDF test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplePDFTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sample PDF test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SamplePDF getFixture() {
		return (SamplePDF)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProbfunctionFactory.eINSTANCE.createSamplePDF());
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

} //SamplePDFTest

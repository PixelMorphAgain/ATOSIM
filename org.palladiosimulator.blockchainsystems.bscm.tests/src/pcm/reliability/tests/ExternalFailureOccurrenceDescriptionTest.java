/**
 */
package pcm.reliability.tests;

import junit.textui.TestRunner;

import pcm.reliability.ExternalFailureOccurrenceDescription;
import pcm.reliability.ReliabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Failure Occurrence Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalFailureOccurrenceDescriptionTest extends FailureOccurrenceDescriptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalFailureOccurrenceDescriptionTest.class);
	}

	/**
	 * Constructs a new External Failure Occurrence Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFailureOccurrenceDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Failure Occurrence Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExternalFailureOccurrenceDescription getFixture() {
		return (ExternalFailureOccurrenceDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReliabilityFactory.eINSTANCE.createExternalFailureOccurrenceDescription());
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

} //ExternalFailureOccurrenceDescriptionTest

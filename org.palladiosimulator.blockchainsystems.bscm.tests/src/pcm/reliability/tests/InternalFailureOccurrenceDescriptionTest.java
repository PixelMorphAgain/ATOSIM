/**
 */
package pcm.reliability.tests;

import junit.textui.TestRunner;

import pcm.reliability.InternalFailureOccurrenceDescription;
import pcm.reliability.ReliabilityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Internal Failure Occurrence Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalFailureOccurrenceDescriptionTest extends FailureOccurrenceDescriptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InternalFailureOccurrenceDescriptionTest.class);
	}

	/**
	 * Constructs a new Internal Failure Occurrence Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFailureOccurrenceDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Internal Failure Occurrence Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InternalFailureOccurrenceDescription getFixture() {
		return (InternalFailureOccurrenceDescription)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReliabilityFactory.eINSTANCE.createInternalFailureOccurrenceDescription());
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

} //InternalFailureOccurrenceDescriptionTest

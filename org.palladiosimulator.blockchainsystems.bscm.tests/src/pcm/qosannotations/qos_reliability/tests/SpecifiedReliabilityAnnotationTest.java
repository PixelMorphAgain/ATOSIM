/**
 */
package pcm.qosannotations.qos_reliability.tests;

import junit.textui.TestRunner;

import pcm.qosannotations.qos_reliability.Qos_reliabilityFactory;
import pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation;

import pcm.qosannotations.tests.SpecifiedQoSAnnotationTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Specified Reliability Annotation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecifiedReliabilityAnnotationTest extends SpecifiedQoSAnnotationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecifiedReliabilityAnnotationTest.class);
	}

	/**
	 * Constructs a new Specified Reliability Annotation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecifiedReliabilityAnnotationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Specified Reliability Annotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SpecifiedReliabilityAnnotation getFixture() {
		return (SpecifiedReliabilityAnnotation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Qos_reliabilityFactory.eINSTANCE.createSpecifiedReliabilityAnnotation());
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

} //SpecifiedReliabilityAnnotationTest

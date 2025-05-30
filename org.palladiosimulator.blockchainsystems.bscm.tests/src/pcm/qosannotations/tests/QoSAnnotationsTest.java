/**
 */
package pcm.qosannotations.tests;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

import pcm.qosannotations.QoSAnnotations;
import pcm.qosannotations.QosannotationsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Qo SAnnotations</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QoSAnnotationsTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QoSAnnotationsTest.class);
	}

	/**
	 * Constructs a new Qo SAnnotations test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSAnnotationsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Qo SAnnotations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QoSAnnotations getFixture() {
		return (QoSAnnotations)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QosannotationsFactory.eINSTANCE.createQoSAnnotations());
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

} //QoSAnnotationsTest

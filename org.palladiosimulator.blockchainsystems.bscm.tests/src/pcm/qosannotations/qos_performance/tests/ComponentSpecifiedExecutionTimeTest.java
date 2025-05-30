/**
 */
package pcm.qosannotations.qos_performance.tests;

import junit.textui.TestRunner;

import pcm.qosannotations.qos_performance.ComponentSpecifiedExecutionTime;
import pcm.qosannotations.qos_performance.Qos_performanceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Specified Execution Time</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentSpecifiedExecutionTimeTest extends SpecifiedExecutionTimeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentSpecifiedExecutionTimeTest.class);
	}

	/**
	 * Constructs a new Component Specified Execution Time test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSpecifiedExecutionTimeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Specified Execution Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentSpecifiedExecutionTime getFixture() {
		return (ComponentSpecifiedExecutionTime)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Qos_performanceFactory.eINSTANCE.createComponentSpecifiedExecutionTime());
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

} //ComponentSpecifiedExecutionTimeTest

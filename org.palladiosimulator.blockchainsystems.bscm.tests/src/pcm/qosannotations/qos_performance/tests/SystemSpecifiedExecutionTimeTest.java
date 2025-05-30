/**
 */
package pcm.qosannotations.qos_performance.tests;

import junit.textui.TestRunner;

import pcm.qosannotations.qos_performance.Qos_performanceFactory;
import pcm.qosannotations.qos_performance.SystemSpecifiedExecutionTime;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Specified Execution Time</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemSpecifiedExecutionTimeTest extends SpecifiedExecutionTimeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemSpecifiedExecutionTimeTest.class);
	}

	/**
	 * Constructs a new System Specified Execution Time test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSpecifiedExecutionTimeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Specified Execution Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemSpecifiedExecutionTime getFixture() {
		return (SystemSpecifiedExecutionTime)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Qos_performanceFactory.eINSTANCE.createSystemSpecifiedExecutionTime());
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

} //SystemSpecifiedExecutionTimeTest

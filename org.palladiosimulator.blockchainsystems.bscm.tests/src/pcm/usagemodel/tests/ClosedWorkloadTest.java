/**
 */
package pcm.usagemodel.tests;

import junit.textui.TestRunner;

import pcm.usagemodel.ClosedWorkload;
import pcm.usagemodel.UsagemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Closed Workload</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClosedWorkloadTest extends WorkloadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClosedWorkloadTest.class);
	}

	/**
	 * Constructs a new Closed Workload test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedWorkloadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Closed Workload test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClosedWorkload getFixture() {
		return (ClosedWorkload)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsagemodelFactory.eINSTANCE.createClosedWorkload());
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

} //ClosedWorkloadTest

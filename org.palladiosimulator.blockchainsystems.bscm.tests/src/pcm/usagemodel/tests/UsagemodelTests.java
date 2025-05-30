/**
 */
package pcm.usagemodel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>usagemodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsagemodelTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new UsagemodelTests("usagemodel Tests");
		suite.addTestSuite(UsageScenarioTest.class);
		suite.addTestSuite(UserDataTest.class);
		suite.addTestSuite(UsageModelTest.class);
		suite.addTestSuite(EntryLevelSystemCallTest.class);
		suite.addTestSuite(ScenarioBehaviourTest.class);
		suite.addTestSuite(BranchTransitionTest.class);
		suite.addTestSuite(BranchTest.class);
		suite.addTestSuite(LoopTest.class);
		suite.addTestSuite(StopTest.class);
		suite.addTestSuite(StartTest.class);
		suite.addTestSuite(OpenWorkloadTest.class);
		suite.addTestSuite(DelayTest.class);
		suite.addTestSuite(ClosedWorkloadTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsagemodelTests(String name) {
		super(name);
	}

} //UsagemodelTests

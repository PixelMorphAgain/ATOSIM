/**
 */
package pcm.seff.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>seff</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeffTests extends TestSuite {

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
		TestSuite suite = new SeffTests("seff Tests");
		suite.addTestSuite(StopActionTest.class);
		suite.addTestSuite(ResourceDemandingBehaviourTest.class);
		suite.addTestSuite(BranchActionTest.class);
		suite.addTestSuite(StartActionTest.class);
		suite.addTestSuite(ResourceDemandingSEFFTest.class);
		suite.addTestSuite(ResourceDemandingInternalBehaviourTest.class);
		suite.addTestSuite(ReleaseActionTest.class);
		suite.addTestSuite(LoopActionTest.class);
		suite.addTestSuite(ForkActionTest.class);
		suite.addTestSuite(ForkedBehaviourTest.class);
		suite.addTestSuite(SynchronisationPointTest.class);
		suite.addTestSuite(ExternalCallActionTest.class);
		suite.addTestSuite(CallReturnActionTest.class);
		suite.addTestSuite(ProbabilisticBranchTransitionTest.class);
		suite.addTestSuite(AcquireActionTest.class);
		suite.addTestSuite(CollectionIteratorActionTest.class);
		suite.addTestSuite(GuardedBranchTransitionTest.class);
		suite.addTestSuite(SetVariableActionTest.class);
		suite.addTestSuite(InternalCallActionTest.class);
		suite.addTestSuite(EmitEventActionTest.class);
		suite.addTestSuite(InternalActionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeffTests(String name) {
		super(name);
	}

} //SeffTests

/**
 */
package pcm.usagemodel.tests;

import junit.textui.TestRunner;

import pcm.tests.PCMBaseClassTest;

import pcm.usagemodel.BranchTransition;
import pcm.usagemodel.UsagemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BranchTransitionTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BranchTransitionTest.class);
	}

	/**
	 * Constructs a new Branch Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Branch Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BranchTransition getFixture() {
		return (BranchTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsagemodelFactory.eINSTANCE.createBranchTransition());
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

} //BranchTransitionTest

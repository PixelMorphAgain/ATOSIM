/**
 */
package pcm.seff.tests;

import junit.textui.TestRunner;

import pcm.seff.GuardedBranchTransition;
import pcm.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Guarded Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuardedBranchTransitionTest extends AbstractBranchTransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GuardedBranchTransitionTest.class);
	}

	/**
	 * Constructs a new Guarded Branch Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardedBranchTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Guarded Branch Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GuardedBranchTransition getFixture() {
		return (GuardedBranchTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createGuardedBranchTransition());
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

} //GuardedBranchTransitionTest

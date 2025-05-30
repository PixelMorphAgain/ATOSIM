/**
 */
package pcm.seff.tests;

import junit.textui.TestRunner;

import pcm.seff.ProbabilisticBranchTransition;
import pcm.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Probabilistic Branch Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbabilisticBranchTransitionTest extends AbstractBranchTransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProbabilisticBranchTransitionTest.class);
	}

	/**
	 * Constructs a new Probabilistic Branch Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticBranchTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Probabilistic Branch Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProbabilisticBranchTransition getFixture() {
		return (ProbabilisticBranchTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createProbabilisticBranchTransition());
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

} //ProbabilisticBranchTransitionTest

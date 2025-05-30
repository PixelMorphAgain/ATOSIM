/**
 */
package pcm.seff.seff_reliability.tests;

import junit.textui.TestRunner;

import pcm.seff.seff_reliability.RecoveryAction;
import pcm.seff.seff_reliability.Seff_reliabilityFactory;

import pcm.seff.tests.AbstractInternalControlFlowActionTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Recovery Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecoveryActionTest extends AbstractInternalControlFlowActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecoveryActionTest.class);
	}

	/**
	 * Constructs a new Recovery Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoveryActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Recovery Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RecoveryAction getFixture() {
		return (RecoveryAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Seff_reliabilityFactory.eINSTANCE.createRecoveryAction());
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

} //RecoveryActionTest

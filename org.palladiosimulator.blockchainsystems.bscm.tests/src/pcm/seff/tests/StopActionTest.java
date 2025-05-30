/**
 */
package pcm.seff.tests;

import junit.textui.TestRunner;

import pcm.seff.SeffFactory;
import pcm.seff.StopAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stop Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StopActionTest extends AbstractInternalControlFlowActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StopActionTest.class);
	}

	/**
	 * Constructs a new Stop Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stop Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StopAction getFixture() {
		return (StopAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createStopAction());
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

} //StopActionTest

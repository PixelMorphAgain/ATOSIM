/**
 */
package pcm.seff.tests;

import junit.textui.TestRunner;

import pcm.seff.ReleaseAction;
import pcm.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Release Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReleaseActionTest extends AbstractInternalControlFlowActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReleaseActionTest.class);
	}

	/**
	 * Constructs a new Release Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Release Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReleaseAction getFixture() {
		return (ReleaseAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createReleaseAction());
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

} //ReleaseActionTest

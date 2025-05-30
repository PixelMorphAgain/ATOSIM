/**
 */
package pcm.seff.tests;

import junit.textui.TestRunner;

import pcm.seff.BranchAction;
import pcm.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Branch Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BranchActionTest extends AbstractInternalControlFlowActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BranchActionTest.class);
	}

	/**
	 * Constructs a new Branch Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Branch Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BranchAction getFixture() {
		return (BranchAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createBranchAction());
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

} //BranchActionTest

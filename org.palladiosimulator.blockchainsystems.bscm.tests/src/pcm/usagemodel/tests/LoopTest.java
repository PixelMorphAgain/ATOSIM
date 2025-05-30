/**
 */
package pcm.usagemodel.tests;

import junit.textui.TestRunner;

import pcm.usagemodel.Loop;
import pcm.usagemodel.UsagemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopTest extends AbstractUserActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoopTest.class);
	}

	/**
	 * Constructs a new Loop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Loop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Loop getFixture() {
		return (Loop)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsagemodelFactory.eINSTANCE.createLoop());
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

} //LoopTest

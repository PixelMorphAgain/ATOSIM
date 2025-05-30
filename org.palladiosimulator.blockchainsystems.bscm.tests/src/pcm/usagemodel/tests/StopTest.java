/**
 */
package pcm.usagemodel.tests;

import junit.textui.TestRunner;

import pcm.usagemodel.Stop;
import pcm.usagemodel.UsagemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StopTest extends AbstractUserActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StopTest.class);
	}

	/**
	 * Constructs a new Stop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Stop getFixture() {
		return (Stop)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsagemodelFactory.eINSTANCE.createStop());
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

} //StopTest

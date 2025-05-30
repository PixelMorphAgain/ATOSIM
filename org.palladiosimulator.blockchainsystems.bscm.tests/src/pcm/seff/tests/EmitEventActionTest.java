/**
 */
package pcm.seff.tests;

import junit.textui.TestRunner;

import pcm.seff.EmitEventAction;
import pcm.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Emit Event Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmitEventActionTest extends AbstractActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmitEventActionTest.class);
	}

	/**
	 * Constructs a new Emit Event Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmitEventActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Emit Event Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EmitEventAction getFixture() {
		return (EmitEventAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createEmitEventAction());
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

} //EmitEventActionTest

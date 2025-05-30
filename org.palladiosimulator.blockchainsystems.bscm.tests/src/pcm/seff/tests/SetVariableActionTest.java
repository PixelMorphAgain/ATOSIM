/**
 */
package pcm.seff.tests;

import junit.textui.TestRunner;

import pcm.seff.SeffFactory;
import pcm.seff.SetVariableAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Set Variable Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetVariableActionTest extends AbstractInternalControlFlowActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SetVariableActionTest.class);
	}

	/**
	 * Constructs a new Set Variable Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetVariableActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Set Variable Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SetVariableAction getFixture() {
		return (SetVariableAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createSetVariableAction());
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

} //SetVariableActionTest

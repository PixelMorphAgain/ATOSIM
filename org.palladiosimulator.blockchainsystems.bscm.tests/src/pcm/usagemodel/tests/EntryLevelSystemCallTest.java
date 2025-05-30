/**
 */
package pcm.usagemodel.tests;

import junit.textui.TestRunner;

import pcm.usagemodel.EntryLevelSystemCall;
import pcm.usagemodel.UsagemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entry Level System Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryLevelSystemCallTest extends AbstractUserActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntryLevelSystemCallTest.class);
	}

	/**
	 * Constructs a new Entry Level System Call test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryLevelSystemCallTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entry Level System Call test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntryLevelSystemCall getFixture() {
		return (EntryLevelSystemCall)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsagemodelFactory.eINSTANCE.createEntryLevelSystemCall());
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

} //EntryLevelSystemCallTest

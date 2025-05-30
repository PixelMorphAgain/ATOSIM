/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.repository.RepositoryFactory;
import pcm.repository.SinkRole;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sink Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SinkRoleTest extends ProvidedRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SinkRoleTest.class);
	}

	/**
	 * Constructs a new Sink Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinkRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sink Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SinkRole getFixture() {
		return (SinkRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createSinkRole());
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

} //SinkRoleTest

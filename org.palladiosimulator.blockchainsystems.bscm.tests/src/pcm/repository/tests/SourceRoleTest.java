/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.repository.RepositoryFactory;
import pcm.repository.SourceRole;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Source Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceRoleTest extends RequiredRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SourceRoleTest.class);
	}

	/**
	 * Constructs a new Source Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Source Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SourceRole getFixture() {
		return (SourceRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createSourceRole());
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

} //SourceRoleTest

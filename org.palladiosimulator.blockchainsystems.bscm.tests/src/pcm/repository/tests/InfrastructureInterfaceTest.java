/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.repository.InfrastructureInterface;
import pcm.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureInterfaceTest extends InterfaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfrastructureInterfaceTest.class);
	}

	/**
	 * Constructs a new Infrastructure Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Infrastructure Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InfrastructureInterface getFixture() {
		return (InfrastructureInterface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createInfrastructureInterface());
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

} //InfrastructureInterfaceTest

/**
 */
package stoex.tests;

import junit.textui.TestRunner;

import stoex.NamespaceReference;
import stoex.StoexFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Namespace Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespaceReferenceTest extends AbstractNamedReferenceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NamespaceReferenceTest.class);
	}

	/**
	 * Constructs a new Namespace Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Namespace Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NamespaceReference getFixture() {
		return (NamespaceReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StoexFactory.eINSTANCE.createNamespaceReference());
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

} //NamespaceReferenceTest

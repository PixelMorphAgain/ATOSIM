/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.core.entity.tests.NamedElementTest;

import pcm.repository.InnerDeclaration;
import pcm.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inner Declaration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InnerDeclarationTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InnerDeclarationTest.class);
	}

	/**
	 * Constructs a new Inner Declaration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerDeclarationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Inner Declaration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InnerDeclaration getFixture() {
		return (InnerDeclaration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createInnerDeclaration());
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

} //InnerDeclarationTest

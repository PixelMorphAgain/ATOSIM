/**
 */
package pcm.repository.tests;

import junit.textui.TestRunner;

import pcm.core.entity.tests.ComposedProvidingRequiringEntityTest;

import pcm.repository.CompositeComponent;
import pcm.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeComponentTest extends ComposedProvidingRequiringEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeComponentTest.class);
	}

	/**
	 * Constructs a new Composite Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeComponent getFixture() {
		return (CompositeComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RepositoryFactory.eINSTANCE.createCompositeComponent());
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

} //CompositeComponentTest

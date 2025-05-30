/**
 */
package pcm.seff.tests;

import junit.textui.TestRunner;

import pcm.seff.CollectionIteratorAction;
import pcm.seff.SeffFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collection Iterator Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionIteratorActionTest extends AbstractLoopActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollectionIteratorActionTest.class);
	}

	/**
	 * Constructs a new Collection Iterator Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionIteratorActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collection Iterator Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CollectionIteratorAction getFixture() {
		return (CollectionIteratorAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeffFactory.eINSTANCE.createCollectionIteratorAction());
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

} //CollectionIteratorActionTest

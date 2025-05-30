/**
 */
package pcm.tests;

import junit.textui.TestRunner;

import pcm.DummyClass;
import pcm.PcmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dummy Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DummyClassTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DummyClassTest.class);
	}

	/**
	 * Constructs a new Dummy Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DummyClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dummy Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DummyClass getFixture() {
		return (DummyClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcmFactory.eINSTANCE.createDummyClass());
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

} //DummyClassTest

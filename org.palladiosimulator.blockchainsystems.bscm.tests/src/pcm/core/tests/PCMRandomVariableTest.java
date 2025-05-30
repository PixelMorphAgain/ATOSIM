/**
 */
package pcm.core.tests;

import junit.textui.TestRunner;

import pcm.core.CoreFactory;
import pcm.core.PCMRandomVariable;

import stoex.tests.RandomVariableTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCM Random Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCMRandomVariableTest extends RandomVariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCMRandomVariableTest.class);
	}

	/**
	 * Constructs a new PCM Random Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCM Random Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCMRandomVariable getFixture() {
		return (PCMRandomVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createPCMRandomVariable());
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

} //PCMRandomVariableTest

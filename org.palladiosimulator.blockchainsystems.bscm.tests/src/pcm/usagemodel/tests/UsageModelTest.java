/**
 */
package pcm.usagemodel.tests;

import junit.textui.TestRunner;

import pcm.tests.PCMBaseClassTest;

import pcm.usagemodel.UsageModel;
import pcm.usagemodel.UsagemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usage Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageModelTest extends PCMBaseClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsageModelTest.class);
	}

	/**
	 * Constructs a new Usage Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usage Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UsageModel getFixture() {
		return (UsageModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsagemodelFactory.eINSTANCE.createUsageModel());
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

} //UsageModelTest

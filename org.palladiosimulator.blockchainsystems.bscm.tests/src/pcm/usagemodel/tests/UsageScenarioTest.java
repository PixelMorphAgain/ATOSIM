/**
 */
package pcm.usagemodel.tests;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

import pcm.usagemodel.UsageScenario;
import pcm.usagemodel.UsagemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usage Scenario</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageScenarioTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsageScenarioTest.class);
	}

	/**
	 * Constructs a new Usage Scenario test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenarioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usage Scenario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UsageScenario getFixture() {
		return (UsageScenario)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsagemodelFactory.eINSTANCE.createUsageScenario());
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

} //UsageScenarioTest

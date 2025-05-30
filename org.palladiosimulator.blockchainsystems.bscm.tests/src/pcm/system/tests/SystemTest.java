/**
 */
package pcm.system.tests;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

import pcm.system.SystemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link pcm.core.composition.ComposedStructure#validateSameSubsystemMustNotBeInstantiatedMoreThanOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Subsystem Must Not Be Instantiated More Than Once</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SystemTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemTest.class);
	}

	/**
	 * Constructs a new System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected pcm.system.System getFixture() {
		return (pcm.system.System)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SystemFactory.eINSTANCE.createSystem());
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

	/**
	 * Tests the '{@link pcm.core.composition.ComposedStructure#validateSameSubsystemMustNotBeInstantiatedMoreThanOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Subsystem Must Not Be Instantiated More Than Once</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.core.composition.ComposedStructure#validateSameSubsystemMustNotBeInstantiatedMoreThanOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateSameSubsystemMustNotBeInstantiatedMoreThanOnce__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SystemTest

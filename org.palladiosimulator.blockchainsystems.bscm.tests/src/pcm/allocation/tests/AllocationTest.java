/**
 */
package pcm.allocation.tests;

import junit.textui.TestRunner;

import pcm.allocation.Allocation;
import pcm.allocation.AllocationFactory;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link pcm.allocation.Allocation#validateEachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Each Assembly Context Within System Has To Be Allocated Exactly Once</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AllocationTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllocationTest.class);
	}

	/**
	 * Constructs a new Allocation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Allocation getFixture() {
		return (Allocation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocationFactory.eINSTANCE.createAllocation());
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
	 * Tests the '{@link pcm.allocation.Allocation#validateEachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Each Assembly Context Within System Has To Be Allocated Exactly Once</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.allocation.Allocation#validateEachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateEachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AllocationTest

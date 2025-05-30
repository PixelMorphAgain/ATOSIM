/**
 */
package pcm.resourceenvironment.tests;

import identifier.tests.IdentifierTest;

import junit.textui.TestRunner;

import pcm.resourceenvironment.ProcessingResourceSpecification;
import pcm.resourceenvironment.ResourceenvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processing Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingResourceSpecificationTest extends IdentifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessingResourceSpecificationTest.class);
	}

	/**
	 * Constructs a new Processing Resource Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Processing Resource Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessingResourceSpecification getFixture() {
		return (ProcessingResourceSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourceenvironmentFactory.eINSTANCE.createProcessingResourceSpecification());
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

} //ProcessingResourceSpecificationTest

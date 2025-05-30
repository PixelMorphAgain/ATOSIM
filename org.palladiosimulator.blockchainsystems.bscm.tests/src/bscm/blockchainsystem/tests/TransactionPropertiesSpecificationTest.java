/**
 */
package bscm.blockchainsystem.tests;

import bscm.blockchainsystem.BlockchainsystemFactory;
import bscm.blockchainsystem.TransactionPropertiesSpecification;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transaction Properties Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransactionPropertiesSpecificationTest extends TestCase {

	/**
	 * The fixture for this Transaction Properties Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionPropertiesSpecification fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransactionPropertiesSpecificationTest.class);
	}

	/**
	 * Constructs a new Transaction Properties Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionPropertiesSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transaction Properties Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TransactionPropertiesSpecification fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transaction Properties Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionPropertiesSpecification getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BlockchainsystemFactory.eINSTANCE.createTransactionPropertiesSpecification());
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

} //TransactionPropertiesSpecificationTest

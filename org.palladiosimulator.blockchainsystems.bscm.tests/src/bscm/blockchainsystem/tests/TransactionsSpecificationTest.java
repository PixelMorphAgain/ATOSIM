/**
 */
package bscm.blockchainsystem.tests;

import bscm.blockchainsystem.BlockchainsystemFactory;
import bscm.blockchainsystem.TransactionsSpecification;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transactions Specification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransactionsSpecificationTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransactionsSpecificationTest.class);
	}

	/**
	 * Constructs a new Transactions Specification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionsSpecificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transactions Specification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TransactionsSpecification getFixture() {
		return (TransactionsSpecification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BlockchainsystemFactory.eINSTANCE.createTransactionsSpecification());
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

} //TransactionsSpecificationTest

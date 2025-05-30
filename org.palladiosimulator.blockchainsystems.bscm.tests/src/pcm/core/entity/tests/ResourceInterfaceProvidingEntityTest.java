/**
 */
package pcm.core.entity.tests;

import junit.textui.TestRunner;

import pcm.core.entity.EntityFactory;
import pcm.core.entity.ResourceInterfaceProvidingEntity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Interface Providing Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceInterfaceProvidingEntityTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceInterfaceProvidingEntityTest.class);
	}

	/**
	 * Constructs a new Resource Interface Providing Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInterfaceProvidingEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Interface Providing Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceInterfaceProvidingEntity getFixture() {
		return (ResourceInterfaceProvidingEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntityFactory.eINSTANCE.createResourceInterfaceProvidingEntity());
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

} //ResourceInterfaceProvidingEntityTest

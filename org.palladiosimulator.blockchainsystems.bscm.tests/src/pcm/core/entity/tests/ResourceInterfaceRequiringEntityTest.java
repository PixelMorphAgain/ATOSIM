/**
 */
package pcm.core.entity.tests;

import junit.textui.TestRunner;

import pcm.core.entity.EntityFactory;
import pcm.core.entity.ResourceInterfaceRequiringEntity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Interface Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceInterfaceRequiringEntityTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceInterfaceRequiringEntityTest.class);
	}

	/**
	 * Constructs a new Resource Interface Requiring Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInterfaceRequiringEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Interface Requiring Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceInterfaceRequiringEntity getFixture() {
		return (ResourceInterfaceRequiringEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntityFactory.eINSTANCE.createResourceInterfaceRequiringEntity());
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

} //ResourceInterfaceRequiringEntityTest

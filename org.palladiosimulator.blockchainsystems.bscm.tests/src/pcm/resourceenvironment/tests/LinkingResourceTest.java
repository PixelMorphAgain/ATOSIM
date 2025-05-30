/**
 */
package pcm.resourceenvironment.tests;

import junit.textui.TestRunner;

import pcm.core.entity.tests.EntityTest;

import pcm.resourceenvironment.LinkingResource;
import pcm.resourceenvironment.ResourceenvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Linking Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkingResourceTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkingResourceTest.class);
	}

	/**
	 * Constructs a new Linking Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Linking Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkingResource getFixture() {
		return (LinkingResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourceenvironmentFactory.eINSTANCE.createLinkingResource());
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

} //LinkingResourceTest

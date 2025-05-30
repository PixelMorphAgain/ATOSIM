/**
 */
package pcm.resourcetype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pcm.resourcetype.ResourcetypePackage
 * @generated
 */
public interface ResourcetypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcetypeFactory eINSTANCE = pcm.resourcetype.impl.ResourcetypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Signature</em>'.
	 * @generated
	 */
	ResourceSignature createResourceSignature();

	/**
	 * Returns a new object of class '<em>Processing Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Resource Type</em>'.
	 * @generated
	 */
	ProcessingResourceType createProcessingResourceType();

	/**
	 * Returns a new object of class '<em>Resource Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Repository</em>'.
	 * @generated
	 */
	ResourceRepository createResourceRepository();

	/**
	 * Returns a new object of class '<em>Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduling Policy</em>'.
	 * @generated
	 */
	SchedulingPolicy createSchedulingPolicy();

	/**
	 * Returns a new object of class '<em>Communication Link Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Link Resource Type</em>'.
	 * @generated
	 */
	CommunicationLinkResourceType createCommunicationLinkResourceType();

	/**
	 * Returns a new object of class '<em>Resource Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Interface</em>'.
	 * @generated
	 */
	ResourceInterface createResourceInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcetypePackage getResourcetypePackage();

} //ResourcetypeFactory

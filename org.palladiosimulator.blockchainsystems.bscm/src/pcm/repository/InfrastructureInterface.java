/**
 */
package pcm.repository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface <em>Infrastructure Signatures Infrastructure Interface</em>}</li>
 * </ul>
 *
 * @see pcm.repository.RepositoryPackage#getInfrastructureInterface()
 * @model
 * @generated
 */
public interface InfrastructureInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Infrastructure Signatures Infrastructure Interface</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.repository.InfrastructureSignature}.
	 * It is bidirectional and its opposite is '{@link pcm.repository.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Signatures Infrastructure Interface</em>' containment reference list.
	 * @see pcm.repository.RepositoryPackage#getInfrastructureInterface_InfrastructureSignatures__InfrastructureInterface()
	 * @see pcm.repository.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature
	 * @model opposite="infrastructureInterface__InfrastructureSignature" containment="true" ordered="false"
	 * @generated
	 */
	EList<InfrastructureSignature> getInfrastructureSignatures__InfrastructureInterface();

} // InfrastructureInterface

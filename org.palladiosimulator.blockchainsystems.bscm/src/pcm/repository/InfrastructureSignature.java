/**
 */
package pcm.repository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.InfrastructureSignature#getParameters__InfrastructureSignature <em>Parameters Infrastructure Signature</em>}</li>
 *   <li>{@link pcm.repository.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}</li>
 * </ul>
 *
 * @see pcm.repository.RepositoryPackage#getInfrastructureSignature()
 * @model
 * @generated
 */
public interface InfrastructureSignature extends Signature {
	/**
	 * Returns the value of the '<em><b>Parameters Infrastructure Signature</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.repository.Parameter}.
	 * It is bidirectional and its opposite is '{@link pcm.repository.Parameter#getInfrastructureSignature__Parameter <em>Infrastructure Signature Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters Infrastructure Signature</em>' containment reference list.
	 * @see pcm.repository.RepositoryPackage#getInfrastructureSignature_Parameters__InfrastructureSignature()
	 * @see pcm.repository.Parameter#getInfrastructureSignature__Parameter
	 * @model opposite="infrastructureSignature__Parameter" containment="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getParameters__InfrastructureSignature();

	/**
	 * Returns the value of the '<em><b>Infrastructure Interface Infrastructure Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.repository.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface <em>Infrastructure Signatures Infrastructure Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Interface Infrastructure Signature</em>' container reference.
	 * @see #setInfrastructureInterface__InfrastructureSignature(InfrastructureInterface)
	 * @see pcm.repository.RepositoryPackage#getInfrastructureSignature_InfrastructureInterface__InfrastructureSignature()
	 * @see pcm.repository.InfrastructureInterface#getInfrastructureSignatures__InfrastructureInterface
	 * @model opposite="infrastructureSignatures__InfrastructureInterface" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InfrastructureInterface getInfrastructureInterface__InfrastructureSignature();

	/**
	 * Sets the value of the '{@link pcm.repository.InfrastructureSignature#getInfrastructureInterface__InfrastructureSignature <em>Infrastructure Interface Infrastructure Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infrastructure Interface Infrastructure Signature</em>' container reference.
	 * @see #getInfrastructureInterface__InfrastructureSignature()
	 * @generated
	 */
	void setInfrastructureInterface__InfrastructureSignature(InfrastructureInterface value);

} // InfrastructureSignature

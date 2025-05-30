/**
 */
package bscm.blockchainsystemComponentRepository;

import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blockchain System Node Component Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystemComponentRepository.BlockchainSystemNodeComponentRepository#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryPackage#getBlockchainSystemNodeComponentRepository()
 * @model
 * @generated
 */
public interface BlockchainSystemNodeComponentRepository extends Entity {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link bscm.blockchainsystemComponentRepository.BlockchainSystemNodeComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryPackage#getBlockchainSystemNodeComponentRepository_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockchainSystemNodeComponent> getComponents();

} // BlockchainSystemNodeComponentRepository

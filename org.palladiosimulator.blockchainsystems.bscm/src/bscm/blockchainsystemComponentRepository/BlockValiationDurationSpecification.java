/**
 */
package bscm.blockchainsystemComponentRepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Valiation Duration Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystemComponentRepository.BlockValiationDurationSpecification#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryPackage#getBlockValiationDurationSpecification()
 * @model
 * @generated
 */
public interface BlockValiationDurationSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link bscm.blockchainsystemComponentRepository.BlockValidationDurationValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryPackage#getBlockValiationDurationSpecification_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BlockValidationDurationValue> getValues();

} // BlockValiationDurationSpecification

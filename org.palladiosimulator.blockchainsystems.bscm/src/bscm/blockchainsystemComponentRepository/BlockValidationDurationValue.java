/**
 */
package bscm.blockchainsystemComponentRepository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Validation Duration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystemComponentRepository.BlockValidationDurationValue#getDuration <em>Duration</em>}</li>
 *   <li>{@link bscm.blockchainsystemComponentRepository.BlockValidationDurationValue#getProbabilit <em>Probabilit</em>}</li>
 * </ul>
 *
 * @see bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryPackage#getBlockValidationDurationValue()
 * @model
 * @generated
 */
public interface BlockValidationDurationValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryPackage#getBlockValidationDurationValue_Duration()
	 * @model required="true"
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystemComponentRepository.BlockValidationDurationValue#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);

	/**
	 * Returns the value of the '<em><b>Probabilit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilit</em>' attribute.
	 * @see #setProbabilit(double)
	 * @see bscm.blockchainsystemComponentRepository.BlockchainsystemComponentRepositoryPackage#getBlockValidationDurationValue_Probabilit()
	 * @model required="true"
	 * @generated
	 */
	double getProbabilit();

	/**
	 * Sets the value of the '{@link bscm.blockchainsystemComponentRepository.BlockValidationDurationValue#getProbabilit <em>Probabilit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probabilit</em>' attribute.
	 * @see #getProbabilit()
	 * @generated
	 */
	void setProbabilit(double value);

} // BlockValidationDurationValue

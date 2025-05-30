/**
 */
package pcm.resourceenvironment;

import pcm.core.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDD Processing Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.resourceenvironment.HDDProcessingResourceSpecification#getWriteProcessingRate <em>Write Processing Rate</em>}</li>
 *   <li>{@link pcm.resourceenvironment.HDDProcessingResourceSpecification#getReadProcessingRate <em>Read Processing Rate</em>}</li>
 *   <li>{@link pcm.resourceenvironment.HDDProcessingResourceSpecification#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getHDDProcessingResourceSpecification()
 * @model
 * @generated
 */
public interface HDDProcessingResourceSpecification extends ProcessingResourceSpecification {
	/**
	 * Returns the value of the '<em><b>Write Processing Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Processing Rate</em>' containment reference.
	 * @see #setWriteProcessingRate(PCMRandomVariable)
	 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getHDDProcessingResourceSpecification_WriteProcessingRate()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getWriteProcessingRate();

	/**
	 * Sets the value of the '{@link pcm.resourceenvironment.HDDProcessingResourceSpecification#getWriteProcessingRate <em>Write Processing Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Processing Rate</em>' containment reference.
	 * @see #getWriteProcessingRate()
	 * @generated
	 */
	void setWriteProcessingRate(PCMRandomVariable value);

	/**
	 * Returns the value of the '<em><b>Read Processing Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Processing Rate</em>' containment reference.
	 * @see #setReadProcessingRate(PCMRandomVariable)
	 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getHDDProcessingResourceSpecification_ReadProcessingRate()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getReadProcessingRate();

	/**
	 * Sets the value of the '{@link pcm.resourceenvironment.HDDProcessingResourceSpecification#getReadProcessingRate <em>Read Processing Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Processing Rate</em>' containment reference.
	 * @see #getReadProcessingRate()
	 * @generated
	 */
	void setReadProcessingRate(PCMRandomVariable value);

	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcm.resourceenvironment.ResourceContainer#getHddResourceSpecifications <em>Hdd Resource Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference.
	 * @see #setResourceContainer(ResourceContainer)
	 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getHDDProcessingResourceSpecification_ResourceContainer()
	 * @see pcm.resourceenvironment.ResourceContainer#getHddResourceSpecifications
	 * @model opposite="hddResourceSpecifications"
	 * @generated
	 */
	ResourceContainer getResourceContainer();

	/**
	 * Sets the value of the '{@link pcm.resourceenvironment.HDDProcessingResourceSpecification#getResourceContainer <em>Resource Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container</em>' reference.
	 * @see #getResourceContainer()
	 * @generated
	 */
	void setResourceContainer(ResourceContainer value);

} // HDDProcessingResourceSpecification

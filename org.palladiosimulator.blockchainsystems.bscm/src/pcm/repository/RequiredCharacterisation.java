/**
 */
package pcm.repository;

import pcm.PCMBaseClass;

import pcm.parameter.VariableCharacterisationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Characterisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of required variable characeterisations per parameter. Increases power of interfaces and lifts variable characterisations to the interface to enable extended interoperability checks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.RequiredCharacterisation#getType <em>Type</em>}</li>
 *   <li>{@link pcm.repository.RequiredCharacterisation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link pcm.repository.RequiredCharacterisation#getInterface_RequiredCharacterisation <em>Interface Required Characterisation</em>}</li>
 * </ul>
 *
 * @see pcm.repository.RepositoryPackage#getRequiredCharacterisation()
 * @model
 * @generated
 */
public interface RequiredCharacterisation extends PCMBaseClass {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pcm.parameter.VariableCharacterisationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pcm.parameter.VariableCharacterisationType
	 * @see #setType(VariableCharacterisationType)
	 * @see pcm.repository.RepositoryPackage#getRequiredCharacterisation_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VariableCharacterisationType getType();

	/**
	 * Sets the value of the '{@link pcm.repository.RequiredCharacterisation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pcm.parameter.VariableCharacterisationType
	 * @see #getType()
	 * @generated
	 */
	void setType(VariableCharacterisationType value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see pcm.repository.RepositoryPackage#getRequiredCharacterisation_Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link pcm.repository.RequiredCharacterisation#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Interface Required Characterisation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.repository.Interface#getRequiredCharacterisations <em>Required Characterisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Required Characterisation</em>' container reference.
	 * @see #setInterface_RequiredCharacterisation(Interface)
	 * @see pcm.repository.RepositoryPackage#getRequiredCharacterisation_Interface_RequiredCharacterisation()
	 * @see pcm.repository.Interface#getRequiredCharacterisations
	 * @model opposite="requiredCharacterisations" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Interface getInterface_RequiredCharacterisation();

	/**
	 * Sets the value of the '{@link pcm.repository.RequiredCharacterisation#getInterface_RequiredCharacterisation <em>Interface Required Characterisation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Required Characterisation</em>' container reference.
	 * @see #getInterface_RequiredCharacterisation()
	 * @generated
	 */
	void setInterface_RequiredCharacterisation(Interface value);

} // RequiredCharacterisation

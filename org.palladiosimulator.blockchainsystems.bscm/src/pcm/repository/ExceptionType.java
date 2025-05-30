/**
 */
package pcm.repository;

import pcm.PCMBaseClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a type of an exception.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.ExceptionType#getExceptionName <em>Exception Name</em>}</li>
 *   <li>{@link pcm.repository.ExceptionType#getExceptionMessage <em>Exception Message</em>}</li>
 * </ul>
 *
 * @see pcm.repository.RepositoryPackage#getExceptionType()
 * @model
 * @generated
 */
public interface ExceptionType extends PCMBaseClass {
	/**
	 * Returns the value of the '<em><b>Exception Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property denotes the name of the exception. In addition to the exception message, this is another piece of information that can be used for identification of the exception that has appeared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Name</em>' attribute.
	 * @see #setExceptionName(String)
	 * @see pcm.repository.RepositoryPackage#getExceptionType_ExceptionName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionName();

	/**
	 * Sets the value of the '{@link pcm.repository.ExceptionType#getExceptionName <em>Exception Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Name</em>' attribute.
	 * @see #getExceptionName()
	 * @generated
	 */
	void setExceptionName(String value);

	/**
	 * Returns the value of the '<em><b>Exception Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property holds the text message of the exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Message</em>' attribute.
	 * @see #setExceptionMessage(String)
	 * @see pcm.repository.RepositoryPackage#getExceptionType_ExceptionMessage()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getExceptionMessage();

	/**
	 * Sets the value of the '{@link pcm.repository.ExceptionType#getExceptionMessage <em>Exception Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Message</em>' attribute.
	 * @see #getExceptionMessage()
	 * @generated
	 */
	void setExceptionMessage(String value);

} // ExceptionType

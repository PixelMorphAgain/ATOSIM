/**
 */
package pcm.repository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface specific to operations and a operation specific association to parameters and return values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.OperationSignature#getInterface__OperationSignature <em>Interface Operation Signature</em>}</li>
 *   <li>{@link pcm.repository.OperationSignature#getParameters__OperationSignature <em>Parameters Operation Signature</em>}</li>
 *   <li>{@link pcm.repository.OperationSignature#getReturnType__OperationSignature <em>Return Type Operation Signature</em>}</li>
 * </ul>
 *
 * @see pcm.repository.RepositoryPackage#getOperationSignature()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='parameterNamesHaveToBeUniqueForASignature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG parameterNamesHaveToBeUniqueForASignature='self.parameters__OperationSignature-&gt;isUnique(p : Parameter |\r\n\tp.parameterName\r\n)'"
 * @generated
 */
public interface OperationSignature extends Signature {
	/**
	 * Returns the value of the '<em><b>Interface Operation Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.repository.OperationInterface#getSignatures__OperationInterface <em>Signatures Operation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the interface that contains the method with this signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Operation Signature</em>' container reference.
	 * @see #setInterface__OperationSignature(OperationInterface)
	 * @see pcm.repository.RepositoryPackage#getOperationSignature_Interface__OperationSignature()
	 * @see pcm.repository.OperationInterface#getSignatures__OperationInterface
	 * @model opposite="signatures__OperationInterface" required="true" transient="false" ordered="false"
	 * @generated
	 */
	OperationInterface getInterface__OperationSignature();

	/**
	 * Sets the value of the '{@link pcm.repository.OperationSignature#getInterface__OperationSignature <em>Interface Operation Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Operation Signature</em>' container reference.
	 * @see #getInterface__OperationSignature()
	 * @generated
	 */
	void setInterface__OperationSignature(OperationInterface value);

	/**
	 * Returns the value of the '<em><b>Parameters Operation Signature</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.repository.Parameter}.
	 * It is bidirectional and its opposite is '{@link pcm.repository.Parameter#getOperationSignature__Parameter <em>Operation Signature Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the list of parameters of the corresponding method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters Operation Signature</em>' containment reference list.
	 * @see pcm.repository.RepositoryPackage#getOperationSignature_Parameters__OperationSignature()
	 * @see pcm.repository.Parameter#getOperationSignature__Parameter
	 * @model opposite="operationSignature__Parameter" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters__OperationSignature();

	/**
	 * Returns the value of the '<em><b>Return Type Operation Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the return type of the corresponding method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type Operation Signature</em>' reference.
	 * @see #setReturnType__OperationSignature(DataType)
	 * @see pcm.repository.RepositoryPackage#getOperationSignature_ReturnType__OperationSignature()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getReturnType__OperationSignature();

	/**
	 * Sets the value of the '{@link pcm.repository.OperationSignature#getReturnType__OperationSignature <em>Return Type Operation Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type Operation Signature</em>' reference.
	 * @see #getReturnType__OperationSignature()
	 * @generated
	 */
	void setReturnType__OperationSignature(DataType value);

} // OperationSignature

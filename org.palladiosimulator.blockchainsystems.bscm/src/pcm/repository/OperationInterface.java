/**
 */
package pcm.repository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The OperationInterface is a specific type of interface related to operation calls. For this, it also refereferences a set of operation interfaces. Operations can represent methods, functions or any comparable concept.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.OperationInterface#getSignatures__OperationInterface <em>Signatures Operation Interface</em>}</li>
 * </ul>
 *
 * @see pcm.repository.RepositoryPackage#getOperationInterface()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='signaturesHaveToBeUniqueForAnInterface'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG signaturesHaveToBeUniqueForAnInterface='-- full signature has to be unique \r\n-- (use of ocl-tupels) #\r\nlet sigs : Bag(\r\n\t-- parameters: Sequence of DataType, NOT name #\r\n\t-- exceptions have not to be considered #\r\n\tTuple(returnType : DataType, serviceName : String, parameters : Sequence(DataType) ) \r\n) = \r\nself.signatures__OperationInterface-&gt;collect(sig : OperationSignature |\r\n\tTuple{\r\n\t\treturnType : DataType = sig.returnType__OperationSignature,\r\n\t\tserviceName : String = sig.entityName,\r\n\t\tparameters : Sequence(DataType) = sig.parameters__OperationSignature.dataType__Parameter\r\n\t}\r\n)\r\nin\r\nsigs-&gt;isUnique(s|s)'"
 * @generated
 */
public interface OperationInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Signatures Operation Interface</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.repository.OperationSignature}.
	 * It is bidirectional and its opposite is '{@link pcm.repository.OperationSignature#getInterface__OperationSignature <em>Interface Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the set of signatures of which the interface consists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signatures Operation Interface</em>' containment reference list.
	 * @see pcm.repository.RepositoryPackage#getOperationInterface_Signatures__OperationInterface()
	 * @see pcm.repository.OperationSignature#getInterface__OperationSignature
	 * @model opposite="interface__OperationSignature" containment="true" ordered="false"
	 * @generated
	 */
	EList<OperationSignature> getSignatures__OperationInterface();

} // OperationInterface

/**
 */
package bscm.blockchainsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Properties Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.blockchainsystem.TransactionPropertiesSpecification#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see bscm.blockchainsystem.BlockchainsystemPackage#getTransactionPropertiesSpecification()
 * @model
 * @generated
 */
public interface TransactionPropertiesSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link bscm.blockchainsystem.TransactionPropertiesSpecificationValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see bscm.blockchainsystem.BlockchainsystemPackage#getTransactionPropertiesSpecification_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<TransactionPropertiesSpecificationValue> getValues();

} // TransactionPropertiesSpecification

/**
 */
package bscm.blockchainsystem.util;

import bscm.blockchainsystem.*;

import identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pcm.PCMBaseClass;
import pcm.PCMClass;

import pcm.core.entity.Entity;
import pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bscm.blockchainsystem.BlockchainsystemPackage
 * @generated
 */
public class BlockchainsystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockchainsystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainsystemSwitch() {
		if (modelPackage == null) {
			modelPackage = BlockchainsystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM: {
				BlockchainSystem blockchainSystem = (BlockchainSystem)theEObject;
				T result = caseBlockchainSystem(blockchainSystem);
				if (result == null) result = caseEntity(blockchainSystem);
				if (result == null) result = caseIdentifier(blockchainSystem);
				if (result == null) result = caseNamedElement(blockchainSystem);
				if (result == null) result = casePCMBaseClass(blockchainSystem);
				if (result == null) result = casePCMClass(blockchainSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainsystemPackage.BLOCKCHAIN_SYSTEM_SPECIFICATION: {
				BlockchainSystemSpecification blockchainSystemSpecification = (BlockchainSystemSpecification)theEObject;
				T result = caseBlockchainSystemSpecification(blockchainSystemSpecification);
				if (result == null) result = caseEntity(blockchainSystemSpecification);
				if (result == null) result = caseIdentifier(blockchainSystemSpecification);
				if (result == null) result = caseNamedElement(blockchainSystemSpecification);
				if (result == null) result = casePCMBaseClass(blockchainSystemSpecification);
				if (result == null) result = casePCMClass(blockchainSystemSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainsystemPackage.TRANSACTIONS_SPECIFICATION: {
				TransactionsSpecification transactionsSpecification = (TransactionsSpecification)theEObject;
				T result = caseTransactionsSpecification(transactionsSpecification);
				if (result == null) result = caseEntity(transactionsSpecification);
				if (result == null) result = caseIdentifier(transactionsSpecification);
				if (result == null) result = caseNamedElement(transactionsSpecification);
				if (result == null) result = casePCMBaseClass(transactionsSpecification);
				if (result == null) result = casePCMClass(transactionsSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION: {
				TransactionPropertiesSpecification transactionPropertiesSpecification = (TransactionPropertiesSpecification)theEObject;
				T result = caseTransactionPropertiesSpecification(transactionPropertiesSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainsystemPackage.TRANSACTION_PROPERTIES_SPECIFICATION_VALUE: {
				TransactionPropertiesSpecificationValue transactionPropertiesSpecificationValue = (TransactionPropertiesSpecificationValue)theEObject;
				T result = caseTransactionPropertiesSpecificationValue(transactionPropertiesSpecificationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blockchain System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blockchain System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockchainSystem(BlockchainSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blockchain System Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blockchain System Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockchainSystemSpecification(BlockchainSystemSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transactions Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transactions Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionsSpecification(TransactionsSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Properties Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Properties Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionPropertiesSpecification(TransactionPropertiesSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Properties Specification Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Properties Specification Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionPropertiesSpecificationValue(TransactionPropertiesSpecificationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMClass(PCMClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMBaseClass(PCMBaseClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BlockchainsystemSwitch

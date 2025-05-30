/**
 */
package pcm.reliability.util;

import identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pcm.PCMBaseClass;
import pcm.PCMClass;

import pcm.core.entity.Entity;
import pcm.core.entity.NamedElement;

import pcm.reliability.*;

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
 * @see pcm.reliability.ReliabilityPackage
 * @generated
 */
public class ReliabilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReliabilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilitySwitch() {
		if (modelPackage == null) {
			modelPackage = ReliabilityPackage.eINSTANCE;
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
			case ReliabilityPackage.FAILURE_OCCURRENCE_DESCRIPTION: {
				FailureOccurrenceDescription failureOccurrenceDescription = (FailureOccurrenceDescription)theEObject;
				T result = caseFailureOccurrenceDescription(failureOccurrenceDescription);
				if (result == null) result = casePCMBaseClass(failureOccurrenceDescription);
				if (result == null) result = casePCMClass(failureOccurrenceDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliabilityPackage.HARDWARE_INDUCED_FAILURE_TYPE: {
				HardwareInducedFailureType hardwareInducedFailureType = (HardwareInducedFailureType)theEObject;
				T result = caseHardwareInducedFailureType(hardwareInducedFailureType);
				if (result == null) result = caseFailureType(hardwareInducedFailureType);
				if (result == null) result = caseEntity(hardwareInducedFailureType);
				if (result == null) result = caseIdentifier(hardwareInducedFailureType);
				if (result == null) result = caseNamedElement(hardwareInducedFailureType);
				if (result == null) result = casePCMBaseClass(hardwareInducedFailureType);
				if (result == null) result = casePCMClass(hardwareInducedFailureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliabilityPackage.SOFTWARE_INDUCED_FAILURE_TYPE: {
				SoftwareInducedFailureType softwareInducedFailureType = (SoftwareInducedFailureType)theEObject;
				T result = caseSoftwareInducedFailureType(softwareInducedFailureType);
				if (result == null) result = caseFailureType(softwareInducedFailureType);
				if (result == null) result = caseEntity(softwareInducedFailureType);
				if (result == null) result = caseIdentifier(softwareInducedFailureType);
				if (result == null) result = caseNamedElement(softwareInducedFailureType);
				if (result == null) result = casePCMBaseClass(softwareInducedFailureType);
				if (result == null) result = casePCMClass(softwareInducedFailureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliabilityPackage.INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: {
				InternalFailureOccurrenceDescription internalFailureOccurrenceDescription = (InternalFailureOccurrenceDescription)theEObject;
				T result = caseInternalFailureOccurrenceDescription(internalFailureOccurrenceDescription);
				if (result == null) result = caseFailureOccurrenceDescription(internalFailureOccurrenceDescription);
				if (result == null) result = casePCMBaseClass(internalFailureOccurrenceDescription);
				if (result == null) result = casePCMClass(internalFailureOccurrenceDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliabilityPackage.NETWORK_INDUCED_FAILURE_TYPE: {
				NetworkInducedFailureType networkInducedFailureType = (NetworkInducedFailureType)theEObject;
				T result = caseNetworkInducedFailureType(networkInducedFailureType);
				if (result == null) result = caseFailureType(networkInducedFailureType);
				if (result == null) result = caseEntity(networkInducedFailureType);
				if (result == null) result = caseIdentifier(networkInducedFailureType);
				if (result == null) result = caseNamedElement(networkInducedFailureType);
				if (result == null) result = casePCMBaseClass(networkInducedFailureType);
				if (result == null) result = casePCMClass(networkInducedFailureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliabilityPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION: {
				ExternalFailureOccurrenceDescription externalFailureOccurrenceDescription = (ExternalFailureOccurrenceDescription)theEObject;
				T result = caseExternalFailureOccurrenceDescription(externalFailureOccurrenceDescription);
				if (result == null) result = caseFailureOccurrenceDescription(externalFailureOccurrenceDescription);
				if (result == null) result = casePCMBaseClass(externalFailureOccurrenceDescription);
				if (result == null) result = casePCMClass(externalFailureOccurrenceDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliabilityPackage.RESOURCE_TIMEOUT_FAILURE_TYPE: {
				ResourceTimeoutFailureType resourceTimeoutFailureType = (ResourceTimeoutFailureType)theEObject;
				T result = caseResourceTimeoutFailureType(resourceTimeoutFailureType);
				if (result == null) result = caseSoftwareInducedFailureType(resourceTimeoutFailureType);
				if (result == null) result = caseFailureType(resourceTimeoutFailureType);
				if (result == null) result = caseEntity(resourceTimeoutFailureType);
				if (result == null) result = caseIdentifier(resourceTimeoutFailureType);
				if (result == null) result = caseNamedElement(resourceTimeoutFailureType);
				if (result == null) result = casePCMBaseClass(resourceTimeoutFailureType);
				if (result == null) result = casePCMClass(resourceTimeoutFailureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliabilityPackage.FAILURE_TYPE: {
				FailureType failureType = (FailureType)theEObject;
				T result = caseFailureType(failureType);
				if (result == null) result = caseEntity(failureType);
				if (result == null) result = caseIdentifier(failureType);
				if (result == null) result = caseNamedElement(failureType);
				if (result == null) result = casePCMBaseClass(failureType);
				if (result == null) result = casePCMClass(failureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Occurrence Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureOccurrenceDescription(FailureOccurrenceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Induced Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareInducedFailureType(HardwareInducedFailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Induced Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareInducedFailureType(SoftwareInducedFailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Failure Occurrence Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalFailureOccurrenceDescription(InternalFailureOccurrenceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Induced Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Induced Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInducedFailureType(NetworkInducedFailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Failure Occurrence Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Failure Occurrence Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalFailureOccurrenceDescription(ExternalFailureOccurrenceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Timeout Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Timeout Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceTimeoutFailureType(ResourceTimeoutFailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureType(FailureType object) {
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

} //ReliabilitySwitch

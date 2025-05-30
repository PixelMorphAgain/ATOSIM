/**
 */
package pcm.qosannotations.qos_performance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Specified Execution Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SystemSpecifiedExecutionTime allows software architect and performance analysts to specify the response time (distribution) of services called at the system boundaries. This allows abstracting from the system externals and restricts the focus to the software architecture under consideration.
 * 
 * Note:
 * - That's the starting point for Performance-Kennlinien I guess...
 * <!-- end-model-doc -->
 *
 *
 * @see pcm.qosannotations.qos_performance.Qos_performancePackage#getSystemSpecifiedExecutionTime()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='systemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG systemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem='(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(pcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(pcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(pcm::system::System))\r\n'"
 * @generated
 */
public interface SystemSpecifiedExecutionTime extends SpecifiedExecutionTime {
} // SystemSpecifiedExecutionTime

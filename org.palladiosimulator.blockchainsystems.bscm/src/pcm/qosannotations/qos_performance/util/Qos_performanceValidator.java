/**
 */
package pcm.qosannotations.qos_performance.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.qosannotations.qos_performance.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.qosannotations.qos_performance.Qos_performancePackage
 * @generated
 */
public class Qos_performanceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Qos_performanceValidator INSTANCE = new Qos_performanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.qosannotations.qos_performance";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qos_performanceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Qos_performancePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Qos_performancePackage.SYSTEM_SPECIFIED_EXECUTION_TIME:
				return validateSystemSpecifiedExecutionTime((SystemSpecifiedExecutionTime)value, diagnostics, context);
			case Qos_performancePackage.SPECIFIED_EXECUTION_TIME:
				return validateSpecifiedExecutionTime((SpecifiedExecutionTime)value, diagnostics, context);
			case Qos_performancePackage.COMPONENT_SPECIFIED_EXECUTION_TIME:
				return validateComponentSpecifiedExecutionTime((ComponentSpecifiedExecutionTime)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemSpecifiedExecutionTime(SystemSpecifiedExecutionTime systemSpecifiedExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemSpecifiedExecutionTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemSpecifiedExecutionTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemSpecifiedExecutionTime_systemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(systemSpecifiedExecutionTime, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the systemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem constraint of '<em>System Specified Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM_SPECIFIED_EXECUTION_TIME__SYSTEM_SPECIFIED_EXECUTION_TIME_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM__EEXPRESSION = "(self.role_SpecifiedQoSAnnotation.oclIsTypeOf(pcm::repository::OperationRequiredRole)) and (self.role_SpecifiedQoSAnnotation.oclAsType(pcm::repository::OperationRequiredRole).requiringEntity_RequiredRole.oclIsTypeOf(pcm::system::System))\r\n" +
		"";

	/**
	 * Validates the systemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem constraint of '<em>System Specified Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemSpecifiedExecutionTime_systemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem(SystemSpecifiedExecutionTime systemSpecifiedExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Qos_performancePackage.Literals.SYSTEM_SPECIFIED_EXECUTION_TIME,
				 systemSpecifiedExecutionTime,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "systemSpecifiedExecutionTimeMustReferenceRequiredRoleOfASystem",
				 SYSTEM_SPECIFIED_EXECUTION_TIME__SYSTEM_SPECIFIED_EXECUTION_TIME_MUST_REFERENCE_REQUIRED_ROLE_OF_ASYSTEM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecifiedExecutionTime(SpecifiedExecutionTime specifiedExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specifiedExecutionTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSpecifiedExecutionTime(ComponentSpecifiedExecutionTime componentSpecifiedExecutionTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSpecifiedExecutionTime, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Qos_performanceValidator

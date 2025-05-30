/**
 */
package pcm.core.composition.util;

import identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.core.composition.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.core.composition.CompositionPackage
 * @generated
 */
public class CompositionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CompositionValidator INSTANCE = new CompositionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.core.composition";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Same Subsystem Must Not Be Instantiated More Than Once' of 'Composed Structure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPOSED_STRUCTURE__VALIDATE_SAME_SUBSYSTEM_MUST_NOT_BE_INSTANTIATED_MORE_THAN_ONCE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionValidator() {
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CompositionPackage.eINSTANCE;
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
			case CompositionPackage.DELEGATION_CONNECTOR:
				return validateDelegationConnector((DelegationConnector)value, diagnostics, context);
			case CompositionPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case CompositionPackage.COMPOSED_STRUCTURE:
				return validateComposedStructure((ComposedStructure)value, diagnostics, context);
			case CompositionPackage.RESOURCE_REQUIRED_DELEGATION_CONNECTOR:
				return validateResourceRequiredDelegationConnector((ResourceRequiredDelegationConnector)value, diagnostics, context);
			case CompositionPackage.EVENT_CHANNEL:
				return validateEventChannel((EventChannel)value, diagnostics, context);
			case CompositionPackage.EVENT_CHANNEL_SOURCE_CONNECTOR:
				return validateEventChannelSourceConnector((EventChannelSourceConnector)value, diagnostics, context);
			case CompositionPackage.EVENT_CHANNEL_SINK_CONNECTOR:
				return validateEventChannelSinkConnector((EventChannelSinkConnector)value, diagnostics, context);
			case CompositionPackage.PROVIDED_DELEGATION_CONNECTOR:
				return validateProvidedDelegationConnector((ProvidedDelegationConnector)value, diagnostics, context);
			case CompositionPackage.REQUIRED_DELEGATION_CONNECTOR:
				return validateRequiredDelegationConnector((RequiredDelegationConnector)value, diagnostics, context);
			case CompositionPackage.ASSEMBLY_CONNECTOR:
				return validateAssemblyConnector((AssemblyConnector)value, diagnostics, context);
			case CompositionPackage.ASSEMBLY_EVENT_CONNECTOR:
				return validateAssemblyEventConnector((AssemblyEventConnector)value, diagnostics, context);
			case CompositionPackage.SOURCE_DELEGATION_CONNECTOR:
				return validateSourceDelegationConnector((SourceDelegationConnector)value, diagnostics, context);
			case CompositionPackage.SINK_DELEGATION_CONNECTOR:
				return validateSinkDelegationConnector((SinkDelegationConnector)value, diagnostics, context);
			case CompositionPackage.ASSEMBLY_INFRASTRUCTURE_CONNECTOR:
				return validateAssemblyInfrastructureConnector((AssemblyInfrastructureConnector)value, diagnostics, context);
			case CompositionPackage.PROVIDED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
				return validateProvidedInfrastructureDelegationConnector((ProvidedInfrastructureDelegationConnector)value, diagnostics, context);
			case CompositionPackage.REQUIRED_INFRASTRUCTURE_DELEGATION_CONNECTOR:
				return validateRequiredInfrastructureDelegationConnector((RequiredInfrastructureDelegationConnector)value, diagnostics, context);
			case CompositionPackage.REQUIRED_RESOURCE_DELEGATION_CONNECTOR:
				return validateRequiredResourceDelegationConnector((RequiredResourceDelegationConnector)value, diagnostics, context);
			case CompositionPackage.ASSEMBLY_CONTEXT:
				return validateAssemblyContext((AssemblyContext)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegationConnector(DelegationConnector delegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(delegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(connector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedStructure(ComposedStructure composedStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(composedStructure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_multipleConnectorsConstraint(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_multipleConnectorsConstraintForAssemblyConnectors(composedStructure, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposedStructure_validateSameSubsystemMustNotBeInstantiatedMoreThanOnce(composedStructure, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multipleConnectorsConstraint constraint of '<em>Composed Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT__EEXPRESSION = "self.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(pcm::core::composition::ProvidedDelegationConnector)).oclAsType(pcm::core::composition::ProvidedDelegationConnector)->forAll( c1, c2 | c1 <> c2 implies c1.outerProvidedRole_ProvidedDelegationConnector <> c2.outerProvidedRole_ProvidedDelegationConnector)\r\n" +
		"";

	/**
	 * Validates the multipleConnectorsConstraint constraint of '<em>Composed Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedStructure_multipleConnectorsConstraint(ComposedStructure composedStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.COMPOSED_STRUCTURE,
				 composedStructure,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "multipleConnectorsConstraint",
				 COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multipleConnectorsConstraintForAssemblyConnectors constraint of '<em>Composed Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__EEXPRESSION = "self.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(pcm::core::composition::AssemblyConnector)).oclAsType(AssemblyConnector)->forAll( c1, c2 | ( (c1 <> c2) and ( c1.requiringAssemblyContext_AssemblyConnector = c2.requiringAssemblyContext_AssemblyConnector ) ) implies c1.requiredRole_AssemblyConnector <> c2.requiredRole_AssemblyConnector )\r\n" +
		"";

	/**
	 * Validates the multipleConnectorsConstraintForAssemblyConnectors constraint of '<em>Composed Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedStructure_multipleConnectorsConstraintForAssemblyConnectors(ComposedStructure composedStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.COMPOSED_STRUCTURE,
				 composedStructure,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "multipleConnectorsConstraintForAssemblyConnectors",
				 COMPOSED_STRUCTURE__MULTIPLE_CONNECTORS_CONSTRAINT_FOR_ASSEMBLY_CONNECTORS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the validateSameSubsystemMustNotBeInstantiatedMoreThanOnce constraint of '<em>Composed Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedStructure_validateSameSubsystemMustNotBeInstantiatedMoreThanOnce(ComposedStructure composedStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return composedStructure.validateSameSubsystemMustNotBeInstantiatedMoreThanOnce(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRequiredDelegationConnector(ResourceRequiredDelegationConnector resourceRequiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceRequiredDelegationConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChannel(EventChannel eventChannel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventChannel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventChannel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventChannel, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(eventChannel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChannelSourceConnector(EventChannelSourceConnector eventChannelSourceConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventChannelSourceConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventChannelSourceConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventChannelSourceConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventChannelSourceConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventChannelSourceConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventChannelSourceConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventChannelSourceConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventChannelSourceConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventChannelSourceConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(eventChannelSourceConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventChannelSinkConnector(EventChannelSinkConnector eventChannelSinkConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventChannelSinkConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventChannelSinkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventChannelSinkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventChannelSinkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventChannelSinkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventChannelSinkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventChannelSinkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventChannelSinkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventChannelSinkConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(eventChannelSinkConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvidedDelegationConnector_componentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(providedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvidedDelegationConnector_providedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(providedDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the componentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDED_DELEGATION_CONNECTOR__COMPONENT_OF_ASSEMBLY_CONTEXT_AND_INNER_ROLE_PROVIDING_COMPONENT_NEED_TO_BE_THE_SAME__EEXPRESSION = "self.innerProvidedRole_ProvidedDelegationConnector.providingEntity_ProvidedRole = self.assemblyContext_ProvidedDelegationConnector.encapsulatedComponent__AssemblyContext";

	/**
	 * Validates the componentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector_componentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.PROVIDED_DELEGATION_CONNECTOR,
				 providedDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "componentOfAssemblyContextAndInnerRoleProvidingComponentNeedToBeTheSame",
				 PROVIDED_DELEGATION_CONNECTOR__COMPONENT_OF_ASSEMBLY_CONTEXT_AND_INNER_ROLE_PROVIDING_COMPONENT_NEED_TO_BE_THE_SAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the providedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDED_DELEGATION_CONNECTOR__PROVIDED_DELEGATION_CONNECTORANDTHECONNECTED_COMPONENTMUSTBEPARTOFTHESAMECOMPOSITESTRUCTURE__EEXPRESSION = "self.parentStructure__Connector = self.assemblyContext_ProvidedDelegationConnector.parentStructure__AssemblyContext";

	/**
	 * Validates the providedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure constraint of '<em>Provided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedDelegationConnector_providedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(ProvidedDelegationConnector providedDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.PROVIDED_DELEGATION_CONNECTOR,
				 providedDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "providedDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure",
				 PROVIDED_DELEGATION_CONNECTOR__PROVIDED_DELEGATION_CONNECTORANDTHECONNECTED_COMPONENTMUSTBEPARTOFTHESAMECOMPOSITESTRUCTURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredDelegationConnector_componentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredDelegationConnector_requiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector(requiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequiredDelegationConnector_requiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(requiredDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the componentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIRED_DELEGATION_CONNECTOR__COMPONENT_OF_ASSEMBLY_CONTEXT_AND_INNER_ROLE_REQUIRING_COMPONENT_NEED_TO_BE_THE_SAME__EEXPRESSION = "self.innerRequiredRole_RequiredDelegationConnector.requiringEntity_RequiredRole = self.assemblyContext_RequiredDelegationConnector.encapsulatedComponent__AssemblyContext";

	/**
	 * Validates the componentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector_componentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.REQUIRED_DELEGATION_CONNECTOR,
				 requiredDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "componentOfAssemblyContextAndInnerRoleRequiringComponentNeedToBeTheSame",
				 REQUIRED_DELEGATION_CONNECTOR__COMPONENT_OF_ASSEMBLY_CONTEXT_AND_INNER_ROLE_REQUIRING_COMPONENT_NEED_TO_BE_THE_SAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the requiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIRED_DELEGATION_CONNECTOR__REQUIRING_ENTITY_OF_OUTER_REQUIRED_ROLE_MUST_BE_THE_SAME_AS_THE_PARENT_OF_THE_REQUIRED_DELEGATION_CONNECTOR__EEXPRESSION = "self.outerRequiredRole_RequiredDelegationConnector.requiringEntity_RequiredRole=self.parentStructure__Connector";

	/**
	 * Validates the requiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector_requiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.REQUIRED_DELEGATION_CONNECTOR,
				 requiredDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "requiringEntityOfOuterRequiredRoleMustBeTheSameAsTheParentOfTheRequiredDelegationConnector",
				 REQUIRED_DELEGATION_CONNECTOR__REQUIRING_ENTITY_OF_OUTER_REQUIRED_ROLE_MUST_BE_THE_SAME_AS_THE_PARENT_OF_THE_REQUIRED_DELEGATION_CONNECTOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the requiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIRED_DELEGATION_CONNECTOR__REQUIRED_DELEGATION_CONNECTORANDTHECONNECTED_COMPONENTMUSTBEPARTOFTHESAMECOMPOSITESTRUCTURE__EEXPRESSION = "self.parentStructure__Connector = self.assemblyContext_RequiredDelegationConnector.parentStructure__AssemblyContext";

	/**
	 * Validates the requiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure constraint of '<em>Required Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredDelegationConnector_requiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure(RequiredDelegationConnector requiredDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.REQUIRED_DELEGATION_CONNECTOR,
				 requiredDelegationConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "requiredDelegationConnectorandtheconnectedComponentmustbepartofthesamecompositestructure",
				 REQUIRED_DELEGATION_CONNECTOR__REQUIRED_DELEGATION_CONNECTORANDTHECONNECTED_COMPONENTMUSTBEPARTOFTHESAMECOMPOSITESTRUCTURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_assemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_assemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch(assemblyConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyConnector_assemblyConnectorsReferencedInterfacesMustMatch(assemblyConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the assemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_PROVIDED_ROLES_AND_CHILD_CONTEXT_MUST_MATCH__EEXPRESSION = "self.providingAssemblyContext_AssemblyConnector.encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity->includes(self.providedRole_AssemblyConnector)\r\n" +
		"\r\n" +
		"";

	/**
	 * Validates the assemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_assemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "assemblyConnectorsReferencedProvidedRolesAndChildContextMustMatch",
				 ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_PROVIDED_ROLES_AND_CHILD_CONTEXT_MUST_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the assemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_REQUIRED_ROLE_AND_CHILD_CONTEXT_MUST_MATCH__EEXPRESSION = "self.requiringAssemblyContext_AssemblyConnector.encapsulatedComponent__AssemblyContext.requiredRoles_InterfaceRequiringEntity->includes(self.requiredRole_AssemblyConnector)\r\n" +
		"\r\n" +
		"";

	/**
	 * Validates the assemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_assemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "assemblyConnectorsReferencedRequiredRoleAndChildContextMustMatch",
				 ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_REQUIRED_ROLE_AND_CHILD_CONTEXT_MUST_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the assemblyConnectorsReferencedInterfacesMustMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_INTERFACES_MUST_MATCH__EEXPRESSION = "self.providedRole_AssemblyConnector.providedInterface__OperationProvidedRole = self.requiredRole_AssemblyConnector.requiredInterface__OperationRequiredRole";

	/**
	 * Validates the assemblyConnectorsReferencedInterfacesMustMatch constraint of '<em>Assembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyConnector_assemblyConnectorsReferencedInterfacesMustMatch(AssemblyConnector assemblyConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.ASSEMBLY_CONNECTOR,
				 assemblyConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "assemblyConnectorsReferencedInterfacesMustMatch",
				 ASSEMBLY_CONNECTOR__ASSEMBLY_CONNECTORS_REFERENCED_INTERFACES_MUST_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyEventConnector(AssemblyEventConnector assemblyEventConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyEventConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyEventConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyEventConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyEventConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyEventConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyEventConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyEventConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyEventConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyEventConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(assemblyEventConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceDelegationConnector(SourceDelegationConnector sourceDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(sourceDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSinkDelegationConnector(SinkDelegationConnector sinkDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sinkDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sinkDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sinkDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sinkDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sinkDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sinkDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sinkDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sinkDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sinkDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(sinkDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyInfrastructureConnector(AssemblyInfrastructureConnector assemblyInfrastructureConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyInfrastructureConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyInfrastructureConnector_referencedInfrastructureRequiredRoleNotRequiredByAssemblyContext(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyInfrastructureConnector_InfrastructureInterfacesNotCompatible(assemblyInfrastructureConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssemblyInfrastructureConnector_referencedInfrastructureProvidedRoleNotProvidedByAssemblyContext(assemblyInfrastructureConnector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the referencedInfrastructureRequiredRoleNotRequiredByAssemblyContext constraint of '<em>Assembly Infrastructure Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REFERENCED_INFRASTRUCTURE_REQUIRED_ROLE_NOT_REQUIRED_BY_ASSEMBLY_CONTEXT__EEXPRESSION = "self.requiringAssemblyContext__AssemblyInfrastructureConnector.encapsulatedComponent__AssemblyContext.requiredRoles_InterfaceRequiringEntity->includes(self.requiredRole__AssemblyInfrastructureConnector)";

	/**
	 * Validates the referencedInfrastructureRequiredRoleNotRequiredByAssemblyContext constraint of '<em>Assembly Infrastructure Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyInfrastructureConnector_referencedInfrastructureRequiredRoleNotRequiredByAssemblyContext(AssemblyInfrastructureConnector assemblyInfrastructureConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.ASSEMBLY_INFRASTRUCTURE_CONNECTOR,
				 assemblyInfrastructureConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "referencedInfrastructureRequiredRoleNotRequiredByAssemblyContext",
				 ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REFERENCED_INFRASTRUCTURE_REQUIRED_ROLE_NOT_REQUIRED_BY_ASSEMBLY_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InfrastructureInterfacesNotCompatible constraint of '<em>Assembly Infrastructure Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_INFRASTRUCTURE_CONNECTOR__INFRASTRUCTURE_INTERFACES_NOT_COMPATIBLE__EEXPRESSION = "\tself.providedRole__AssemblyInfrastructureConnector.providedInterface__InfrastructureProvidedRole = self.requiredRole__AssemblyInfrastructureConnector.requiredInterface__InfrastructureRequiredRole  or self.providedRole__AssemblyInfrastructureConnector.providedInterface__InfrastructureProvidedRole.parentInterfaces__Interface->includes(self.requiredRole__AssemblyInfrastructureConnector.requiredInterface__InfrastructureRequiredRole)";

	/**
	 * Validates the InfrastructureInterfacesNotCompatible constraint of '<em>Assembly Infrastructure Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyInfrastructureConnector_InfrastructureInterfacesNotCompatible(AssemblyInfrastructureConnector assemblyInfrastructureConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.ASSEMBLY_INFRASTRUCTURE_CONNECTOR,
				 assemblyInfrastructureConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "InfrastructureInterfacesNotCompatible",
				 ASSEMBLY_INFRASTRUCTURE_CONNECTOR__INFRASTRUCTURE_INTERFACES_NOT_COMPATIBLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the referencedInfrastructureProvidedRoleNotProvidedByAssemblyContext constraint of '<em>Assembly Infrastructure Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REFERENCED_INFRASTRUCTURE_PROVIDED_ROLE_NOT_PROVIDED_BY_ASSEMBLY_CONTEXT__EEXPRESSION = "self.providingAssemblyContext__AssemblyInfrastructureConnector.encapsulatedComponent__AssemblyContext.providedRoles_InterfaceProvidingEntity->includes(self.providedRole__AssemblyInfrastructureConnector)\n" +
		"";

	/**
	 * Validates the referencedInfrastructureProvidedRoleNotProvidedByAssemblyContext constraint of '<em>Assembly Infrastructure Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyInfrastructureConnector_referencedInfrastructureProvidedRoleNotProvidedByAssemblyContext(AssemblyInfrastructureConnector assemblyInfrastructureConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CompositionPackage.Literals.ASSEMBLY_INFRASTRUCTURE_CONNECTOR,
				 assemblyInfrastructureConnector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "referencedInfrastructureProvidedRoleNotProvidedByAssemblyContext",
				 ASSEMBLY_INFRASTRUCTURE_CONNECTOR__REFERENCED_INFRASTRUCTURE_PROVIDED_ROLE_NOT_PROVIDED_BY_ASSEMBLY_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedInfrastructureDelegationConnector(ProvidedInfrastructureDelegationConnector providedInfrastructureDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedInfrastructureDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(providedInfrastructureDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredInfrastructureDelegationConnector(RequiredInfrastructureDelegationConnector requiredInfrastructureDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredInfrastructureDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredInfrastructureDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(requiredInfrastructureDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredResourceDelegationConnector(RequiredResourceDelegationConnector requiredResourceDelegationConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredResourceDelegationConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredResourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredResourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredResourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredResourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredResourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredResourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredResourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredResourceDelegationConnector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(requiredResourceDelegationConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssemblyContext(AssemblyContext assemblyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assemblyContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assemblyContext, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(assemblyContext, diagnostics, context);
		return result;
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

} //CompositionValidator

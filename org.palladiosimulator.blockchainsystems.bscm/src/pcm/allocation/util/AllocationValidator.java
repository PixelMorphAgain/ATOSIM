/**
 */
package pcm.allocation.util;

import identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.allocation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.allocation.AllocationPackage
 * @generated
 */
public class AllocationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AllocationValidator INSTANCE = new AllocationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.allocation";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Each Assembly Context Within System Has To Be Allocated Exactly Once' of 'Allocation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLOCATION__VALIDATE_EACH_ASSEMBLY_CONTEXT_WITHIN_SYSTEM_HAS_TO_BE_ALLOCATED_EXACTLY_ONCE = 1;

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
	public AllocationValidator() {
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
	  return AllocationPackage.eINSTANCE;
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
			case AllocationPackage.ALLOCATION_CONTEXT:
				return validateAllocationContext((AllocationContext)value, diagnostics, context);
			case AllocationPackage.ALLOCATION:
				return validateAllocation((Allocation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationContext(AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allocationContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(allocationContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocationContext_oneAssemblyContextOrOneEventChannelShouldBeReferred(allocationContext, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneAssemblyContextOrOneEventChannelShouldBeReferred constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION_CONTEXT__ONE_ASSEMBLY_CONTEXT_OR_ONE_EVENT_CHANNEL_SHOULD_BE_REFERRED__EEXPRESSION = "not(self.assemblyContext_AllocationContext.oclIsUndefined()) xor not(self.eventChannel__AllocationContext.oclIsUndefined())";

	/**
	 * Validates the oneAssemblyContextOrOneEventChannelShouldBeReferred constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationContext_oneAssemblyContextOrOneEventChannelShouldBeReferred(AllocationContext allocationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AllocationPackage.Literals.ALLOCATION_CONTEXT,
				 allocationContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "oneAssemblyContextOrOneEventChannelShouldBeReferred",
				 ALLOCATION_CONTEXT__ONE_ASSEMBLY_CONTEXT_OR_ONE_EVENT_CHANNEL_SHOULD_BE_REFERRED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocation_communicatingServersHaveToBeConnectedByLinkingResource(allocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllocation_validateEachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(allocation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the communicatingServersHaveToBeConnectedByLinkingResource constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ALLOCATION__COMMUNICATING_SERVERS_HAVE_TO_BE_CONNECTED_BY_LINKING_RESOURCE__EEXPRESSION = "self.allocationContexts_Allocation->forAll(a | self.allocationContexts_Allocation->forAll(b | \r\n" +
		"    --- if a and b are not on the same server\r\n" +
		"    (a.resourceContainer_AllocationContext <> b.resourceContainer_AllocationContext \r\n" +
		"    and\r\n" +
		"    --  and if the assembly contexts of a and b are connected\r\n" +
		"      self.system_Allocation.connectors__ComposedStructure->select(conn | conn.oclIsTypeOf(pcm::core::composition::AssemblyConnector)).oclAsType(pcm::core::composition::AssemblyConnector)->exists(conn | \r\n" +
		"         (conn.providingAssemblyContext_AssemblyConnector = a.assemblyContext_AllocationContext  \r\n" +
		"         and \r\n" +
		"         conn.requiringAssemblyContext_AssemblyConnector = b.assemblyContext_AllocationContext )\r\n" +
		"         or \r\n" +
		"          (conn.providingAssemblyContext_AssemblyConnector = b.assemblyContext_AllocationContext  \r\n" +
		"         and \r\n" +
		"         conn.requiringAssemblyContext_AssemblyConnector = a.assemblyContext_AllocationContext )\r\n" +
		"       )\r\n" +
		"     )\r\n" +
		"     -- then the servers have to be connected by a linking resource\r\n" +
		"     implies \r\n" +
		"     self.targetResourceEnvironment_Allocation.linkingResources__ResourceEnvironment->exists(l | \r\n" +
		"        -- l connects the two\r\n" +
		"        l.connectedResourceContainers_LinkingResource->includes(a.resourceContainer_AllocationContext)\r\n" +
		"        and \r\n" +
		"        l.connectedResourceContainers_LinkingResource->includes(b.resourceContainer_AllocationContext)\r\n" +
		"     )\r\n" +
		"  ))";

	/**
	 * Validates the communicatingServersHaveToBeConnectedByLinkingResource constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation_communicatingServersHaveToBeConnectedByLinkingResource(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AllocationPackage.Literals.ALLOCATION,
				 allocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "communicatingServersHaveToBeConnectedByLinkingResource",
				 ALLOCATION__COMMUNICATING_SERVERS_HAVE_TO_BE_CONNECTED_BY_LINKING_RESOURCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the validateEachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce constraint of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation_validateEachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allocation.validateEachAssemblyContextWithinSystemHasToBeAllocatedExactlyOnce(diagnostics, context);
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

} //AllocationValidator

/**
 */
package pcm.repository.util;

import identifier.util.IdentifierValidator;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcm.core.composition.util.CompositionValidator;

import pcm.core.entity.util.EntityValidator;

import pcm.repository.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcm.repository.RepositoryPackage
 * @generated
 */
public class RepositoryValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RepositoryValidator INSTANCE = new RepositoryValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcm.repository";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityValidator entityValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionValidator compositionValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryValidator() {
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
		entityValidator = EntityValidator.INSTANCE;
		compositionValidator = CompositionValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RepositoryPackage.eINSTANCE;
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
			case RepositoryPackage.PASSIVE_RESOURCE:
				return validatePassiveResource((PassiveResource)value, diagnostics, context);
			case RepositoryPackage.BASIC_COMPONENT:
				return validateBasicComponent((BasicComponent)value, diagnostics, context);
			case RepositoryPackage.IMPLEMENTATION_COMPONENT_TYPE:
				return validateImplementationComponentType((ImplementationComponentType)value, diagnostics, context);
			case RepositoryPackage.REPOSITORY_COMPONENT:
				return validateRepositoryComponent((RepositoryComponent)value, diagnostics, context);
			case RepositoryPackage.PROVIDED_ROLE:
				return validateProvidedRole((ProvidedRole)value, diagnostics, context);
			case RepositoryPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case RepositoryPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case RepositoryPackage.REPOSITORY:
				return validateRepository((Repository)value, diagnostics, context);
			case RepositoryPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case RepositoryPackage.REQUIRED_CHARACTERISATION:
				return validateRequiredCharacterisation((RequiredCharacterisation)value, diagnostics, context);
			case RepositoryPackage.EVENT_GROUP:
				return validateEventGroup((EventGroup)value, diagnostics, context);
			case RepositoryPackage.EVENT_TYPE:
				return validateEventType((EventType)value, diagnostics, context);
			case RepositoryPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case RepositoryPackage.EXCEPTION_TYPE:
				return validateExceptionType((ExceptionType)value, diagnostics, context);
			case RepositoryPackage.INFRASTRUCTURE_SIGNATURE:
				return validateInfrastructureSignature((InfrastructureSignature)value, diagnostics, context);
			case RepositoryPackage.INFRASTRUCTURE_INTERFACE:
				return validateInfrastructureInterface((InfrastructureInterface)value, diagnostics, context);
			case RepositoryPackage.INFRASTRUCTURE_REQUIRED_ROLE:
				return validateInfrastructureRequiredRole((InfrastructureRequiredRole)value, diagnostics, context);
			case RepositoryPackage.REQUIRED_ROLE:
				return validateRequiredRole((RequiredRole)value, diagnostics, context);
			case RepositoryPackage.OPERATION_SIGNATURE:
				return validateOperationSignature((OperationSignature)value, diagnostics, context);
			case RepositoryPackage.OPERATION_INTERFACE:
				return validateOperationInterface((OperationInterface)value, diagnostics, context);
			case RepositoryPackage.OPERATION_REQUIRED_ROLE:
				return validateOperationRequiredRole((OperationRequiredRole)value, diagnostics, context);
			case RepositoryPackage.SOURCE_ROLE:
				return validateSourceRole((SourceRole)value, diagnostics, context);
			case RepositoryPackage.SINK_ROLE:
				return validateSinkRole((SinkRole)value, diagnostics, context);
			case RepositoryPackage.OPERATION_PROVIDED_ROLE:
				return validateOperationProvidedRole((OperationProvidedRole)value, diagnostics, context);
			case RepositoryPackage.INFRASTRUCTURE_PROVIDED_ROLE:
				return validateInfrastructureProvidedRole((InfrastructureProvidedRole)value, diagnostics, context);
			case RepositoryPackage.COMPLETE_COMPONENT_TYPE:
				return validateCompleteComponentType((CompleteComponentType)value, diagnostics, context);
			case RepositoryPackage.PROVIDES_COMPONENT_TYPE:
				return validateProvidesComponentType((ProvidesComponentType)value, diagnostics, context);
			case RepositoryPackage.COMPOSITE_COMPONENT:
				return validateCompositeComponent((CompositeComponent)value, diagnostics, context);
			case RepositoryPackage.PRIMITIVE_DATA_TYPE:
				return validatePrimitiveDataType((PrimitiveDataType)value, diagnostics, context);
			case RepositoryPackage.COLLECTION_DATA_TYPE:
				return validateCollectionDataType((CollectionDataType)value, diagnostics, context);
			case RepositoryPackage.COMPOSITE_DATA_TYPE:
				return validateCompositeDataType((CompositeDataType)value, diagnostics, context);
			case RepositoryPackage.INNER_DECLARATION:
				return validateInnerDeclaration((InnerDeclaration)value, diagnostics, context);
			case RepositoryPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case RepositoryPackage.PARAMETER_MODIFIER:
				return validateParameterModifier((ParameterModifier)value, diagnostics, context);
			case RepositoryPackage.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case RepositoryPackage.PRIMITIVE_TYPE_ENUM:
				return validatePrimitiveTypeEnum((PrimitiveTypeEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassiveResource(PassiveResource passiveResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(passiveResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(passiveResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(passiveResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(passiveResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(passiveResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(passiveResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(passiveResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(passiveResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(passiveResource, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(passiveResource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicComponent(BasicComponent basicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basicComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= entityValidator.validateInterfaceProvidingEntity_needID(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_requiredInterfacesHaveToConformToCompleteType(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_providedInterfacesHaveToConformToCompleteType(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_providedInterfaceHaveToConformToComponentType(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_provideSameOrMoreInterfacesAsCompleteComponentType(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_requireSameOrFewerInterfacesAsCompleteComponentType(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicComponent_noSeffTypeUsedTwice(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicComponent_everyOperationInterfaceMethodsNeedsSEFF(basicComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicComponent_everyInfrastructureInterfaceMethodsNeedsSEFF(basicComponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noSeffTypeUsedTwice constraint of '<em>Basic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASIC_COMPONENT__NO_SEFF_TYPE_USED_TWICE__EEXPRESSION = "self.serviceEffectSpecifications__BasicComponent->forAll(p1, p2 |\r\n" +
		"  p1 <> p2 implies (p1.describedService__SEFF = p2.describedService__SEFF implies p1.seffTypeID <> p2.seffTypeID))";

	/**
	 * Validates the noSeffTypeUsedTwice constraint of '<em>Basic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicComponent_noSeffTypeUsedTwice(BasicComponent basicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.BASIC_COMPONENT,
				 basicComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "noSeffTypeUsedTwice",
				 BASIC_COMPONENT__NO_SEFF_TYPE_USED_TWICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the everyOperationInterfaceMethodsNeedsSEFF constraint of '<em>Basic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASIC_COMPONENT__EVERY_OPERATION_INTERFACE_METHODS_NEEDS_SEFF__EEXPRESSION = "self.providedRoles_InterfaceProvidingEntity->selectByType(OperationProvidedRole).providedInterface__OperationProvidedRole.signatures__OperationInterface->forAll(s | self.serviceEffectSpecifications__BasicComponent->select(service | service.describedService__SEFF=s)->size()>0)";

	/**
	 * Validates the everyOperationInterfaceMethodsNeedsSEFF constraint of '<em>Basic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicComponent_everyOperationInterfaceMethodsNeedsSEFF(BasicComponent basicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.BASIC_COMPONENT,
				 basicComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "everyOperationInterfaceMethodsNeedsSEFF",
				 BASIC_COMPONENT__EVERY_OPERATION_INTERFACE_METHODS_NEEDS_SEFF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the everyInfrastructureInterfaceMethodsNeedsSEFF constraint of '<em>Basic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASIC_COMPONENT__EVERY_INFRASTRUCTURE_INTERFACE_METHODS_NEEDS_SEFF__EEXPRESSION = "self.providedRoles_InterfaceProvidingEntity->selectByType(InfrastructureProvidedRole).providedInterface__InfrastructureProvidedRole.infrastructureSignatures__InfrastructureInterface->forAll(s | self.serviceEffectSpecifications__BasicComponent->select(service | service.describedService__SEFF=s)->size()>0)";

	/**
	 * Validates the everyInfrastructureInterfaceMethodsNeedsSEFF constraint of '<em>Basic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicComponent_everyInfrastructureInterfaceMethodsNeedsSEFF(BasicComponent basicComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.BASIC_COMPONENT,
				 basicComponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "everyInfrastructureInterfaceMethodsNeedsSEFF",
				 BASIC_COMPONENT__EVERY_INFRASTRUCTURE_INTERFACE_METHODS_NEEDS_SEFF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationComponentType(ImplementationComponentType implementationComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(implementationComponentType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= entityValidator.validateInterfaceProvidingEntity_needID(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_requiredInterfacesHaveToConformToCompleteType(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_providedInterfacesHaveToConformToCompleteType(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_providedInterfaceHaveToConformToComponentType(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_provideSameOrMoreInterfacesAsCompleteComponentType(implementationComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_requireSameOrFewerInterfacesAsCompleteComponentType(implementationComponentType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the requiredInterfacesHaveToConformToCompleteType constraint of '<em>Implementation Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IMPLEMENTATION_COMPONENT_TYPE__REQUIRED_INTERFACES_HAVE_TO_CONFORM_TO_COMPLETE_TYPE__EEXPRESSION = "-- ImplementationTypes required Interfaces have to be a subset\r\n" +
		"-- of CompleteComponentType required Interfaces #\r\n" +
		"--\r\n" +
		"-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n" +
		"--\r\n" +
		"-- Recursive Query for parent Interface IDs\r\n" +
		"-- see 'lpar2005.pdf' (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n" +
		"--let parentInterfaces : Bag(Interface) =\r\n" +
		"--\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc1 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\tacc1->union(pt.requiredRoles->iterate(r : RequiredRole; acc2 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\t\tacc2->union(r.requiredInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n" +
		"--\t\t))\r\n" +
		"--\t) in\r\n" +
		"--let anchestorInterfaces : Bag(Interface) =\r\n" +
		"--\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc3 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\tacc3->union(pt.requiredRoles->iterate(r : RequiredRole; acc4 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\t\tacc4->union(r.requiredInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n" +
		"--\t\t))\r\n" +
		"--\t)->union( -- union with anchestors found in former recursion #\r\n" +
		"--\t\tself.parentCompleteComponentTypes->iterate(pt : CompleteComponentType; acc5 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\t\tacc5->union(pt.requiredRoles->iterate(r : RequiredRole; acc6 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\t\t\tacc6->union(r.requiredInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n" +
		"--\t\t\t))\r\n" +
		"--\t\t)\r\n" +
		"--\t) in\r\n" +
		"-- Directly required interfaces need to be a subset of required anchestorInterfaces of Supertype #\r\n" +
		"--anchestorInterfaces.identifier.id->includesAll(\r\n" +
		"--\tself.requiredRoles->iterate(p : RequiredRole; acc7 : Bag(String) = Bag{} |\r\n" +
		"--\t\tacc7->union(p.requiredInterface.identifier.id->asBag())\r\n" +
		"--\t)\t\r\n" +
		"--)\r\n" +
		"true";

	/**
	 * Validates the requiredInterfacesHaveToConformToCompleteType constraint of '<em>Implementation Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationComponentType_requiredInterfacesHaveToConformToCompleteType(ImplementationComponentType implementationComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.IMPLEMENTATION_COMPONENT_TYPE,
				 implementationComponentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "requiredInterfacesHaveToConformToCompleteType",
				 IMPLEMENTATION_COMPONENT_TYPE__REQUIRED_INTERFACES_HAVE_TO_CONFORM_TO_COMPLETE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the providedInterfacesHaveToConformToCompleteType constraint of '<em>Implementation Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_INTERFACES_HAVE_TO_CONFORM_TO_COMPLETE_TYPE__EEXPRESSION = "-- ### EXACT COPY FROM ABOVE ###\r\n" +
		"-- ImplementationComponentTypes provided Interfaces have to be a superset\r\n" +
		"-- of CompleteComponentType provided Interfaces #\r\n" +
		"--\r\n" +
		"-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n" +
		"--\r\n" +
		"-- Recursive Query for parent Interface IDs\r\n" +
		"-- see 'lpar2005.pdf' (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n" +
		"--let parentInterfaces : Bag(Interface) =\r\n" +
		"--\tself.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\tacc2->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n" +
		"--\t) in\r\n" +
		"--let anchestorInterfaces : Bag(Interface) =\r\n" +
		"--\tself.providedRoles->iterate(r : ProvidedRole; acc4 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\tacc4->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n" +
		"--\t)->union( -- union with anchestors found in former recursion #\r\n" +
		"--\t\tself.providedRoles->iterate(r : ProvidedRole; acc6 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\t\tacc6->union(r.providedInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n" +
		"--\t\t)\r\n" +
		"--\t) in\r\n" +
		"\t-- Directly provided anchestorInterfaces need to be a superset of provided interfaces of Supertype #\r\n" +
		"--\tanchestorInterfaces.identifier.id->includesAll(\r\n" +
		"--\t\tself.parentProvidesComponentTypes->iterate(pt : ProvidesComponentType; acc1 : Bag(String) = Bag{} |\r\n" +
		"--\t\t\tpt.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(String) = Bag{} |\r\n" +
		"--\t\t\t\tacc2->union(r.providedInterface.identifier.id->asBag()) -- asBag required to allow Set operations #\r\n" +
		"--\t\t\t)\r\n" +
		"--\t\t)\r\n" +
		"--\t)\r\n" +
		"true";

	/**
	 * Validates the providedInterfacesHaveToConformToCompleteType constraint of '<em>Implementation Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationComponentType_providedInterfacesHaveToConformToCompleteType(ImplementationComponentType implementationComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.IMPLEMENTATION_COMPONENT_TYPE,
				 implementationComponentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "providedInterfacesHaveToConformToCompleteType",
				 IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_INTERFACES_HAVE_TO_CONFORM_TO_COMPLETE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the providedInterfaceHaveToConformToComponentType constraint of '<em>Implementation Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_INTERFACE_HAVE_TO_CONFORM_TO_COMPONENT_TYPE__EEXPRESSION = "-- assures that InfrastructureComponents only have InfrastructureInterfaces and that BusinessComponents only have OperationInterfaces or EventGroups\r\n" +
		"if self.componentType = ComponentType::INFRASTRUCTURE_COMPONENT then\r\n" +
		"\tself.providedRoles_InterfaceProvidingEntity->select(role | role.oclIsTypeOf(OperationInterface) or role.oclIsTypeOf(EventGroup))->size() = 0\r\n" +
		"else if self.componentType = ComponentType::BUSINESS_COMPONENT then\r\n" +
		"\tself.providedRoles_InterfaceProvidingEntity->select(role | role.oclIsTypeOf(InfrastructureInterface))->size() = 0\r\n" +
		"else\r\n" +
		"\t1 = 0\r\n" +
		"endif\r\n" +
		"endif";

	/**
	 * Validates the providedInterfaceHaveToConformToComponentType constraint of '<em>Implementation Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationComponentType_providedInterfaceHaveToConformToComponentType(ImplementationComponentType implementationComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.IMPLEMENTATION_COMPONENT_TYPE,
				 implementationComponentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "providedInterfaceHaveToConformToComponentType",
				 IMPLEMENTATION_COMPONENT_TYPE__PROVIDED_INTERFACE_HAVE_TO_CONFORM_TO_COMPONENT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the provideSameOrMoreInterfacesAsCompleteComponentType constraint of '<em>Implementation Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IMPLEMENTATION_COMPONENT_TYPE__PROVIDE_SAME_OR_MORE_INTERFACES_AS_COMPLETE_COMPONENT_TYPE__EEXPRESSION = "-- ImplementationComponent has to provide the same or more interfaces like the CompleteComponentType (if set) #\r\n" +
		"\tif\r\n" +
		"\t\t -- apply constraint only for non-empty CompleteComponentTypes #\r\n" +
		"\t\tself.parentCompleteComponentTypes->notEmpty()\r\n" +
		"\tthen\r\n" +
		"\t\tlet\r\n" +
		"\t\t\t--own interfaces:\r\n" +
		"\t\t\townInterfaces : Set(OperationInterface)\r\n" +
		"\t\t\t  = self.providedRoles_InterfaceProvidingEntity->select(pr|pr.oclIsTypeOf(OperationProvidedRole))->collect(pr : ProvidedRole | pr.oclAsType (OperationProvidedRole).providedInterface__OperationProvidedRole)->asSet()\r\n" +
		"    in    \r\n" +
		"    \t--complete type interfaces:\r\n" +
		"    \tself.parentCompleteComponentTypes->forAll\r\n" +
		"      ( p : CompleteComponentType |\r\n" +
		"        (\r\n" +
		"        \tp.providedRoles_InterfaceProvidingEntity->select(pr|pr.oclIsTypeOf(OperationProvidedRole))->collect(pr : ProvidedRole | pr.oclAsType (OperationProvidedRole).providedInterface__OperationProvidedRole)->asSet()\r\n" +
		"        \t-\r\n" +
		"        \townInterfaces\r\n" +
		"      \t)->isEmpty()\r\n" +
		"    \t)\r\n" +
		"\telse\r\n" +
		"\t\ttrue\r\n" +
		"\tendif";

	/**
	 * Validates the provideSameOrMoreInterfacesAsCompleteComponentType constraint of '<em>Implementation Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationComponentType_provideSameOrMoreInterfacesAsCompleteComponentType(ImplementationComponentType implementationComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.IMPLEMENTATION_COMPONENT_TYPE,
				 implementationComponentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "provideSameOrMoreInterfacesAsCompleteComponentType",
				 IMPLEMENTATION_COMPONENT_TYPE__PROVIDE_SAME_OR_MORE_INTERFACES_AS_COMPLETE_COMPONENT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the requireSameOrFewerInterfacesAsCompleteComponentType constraint of '<em>Implementation Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IMPLEMENTATION_COMPONENT_TYPE__REQUIRE_SAME_OR_FEWER_INTERFACES_AS_COMPLETE_COMPONENT_TYPE__EEXPRESSION = "-- ImplementationComponent has to require the same or fewer interfaces like the CompleteComponentType (if set) #\r\n" +
		"\tif\r\n" +
		"\t\t-- apply constraint only for non-empty CompleteComponentTypes #\r\n" +
		"\t\tself.parentCompleteComponentTypes->notEmpty()\r\n" +
		"\tthen\r\n" +
		"\t    let\r\n" +
		"\t      --own interfaces:\r\n" +
		"\t      ownInterfaces : Set(OperationInterface) \r\n" +
		"\t        = self.requiredRoles_InterfaceRequiringEntity->select(rr|rr.oclIsTypeOf(OperationRequiredRole))->collect(rr : RequiredRole | rr.oclAsType (OperationRequiredRole).requiredInterface__OperationRequiredRole)->asSet()\r\n" +
		"\t    in\r\n" +
		"\t      --complete type interfaces:\r\n" +
		"\t      self.parentCompleteComponentTypes->forAll\r\n" +
		"\t      ( p : CompleteComponentType |\r\n" +
		"\t      \t(\r\n" +
		"\t\t      \townInterfaces\r\n" +
		"\t\t        -\r\n" +
		"\t\t        p.requiredRoles_InterfaceRequiringEntity->select(rr|rr.oclIsTypeOf(OperationRequiredRole))->collect(rr : RequiredRole | rr.oclAsType (OperationRequiredRole).requiredInterface__OperationRequiredRole)->asSet()\r\n" +
		"\t      \t)->isEmpty()\r\n" +
		"\t    \t)\r\n" +
		"\telse\r\n" +
		"\t\ttrue\r\n" +
		"\tendif";

	/**
	 * Validates the requireSameOrFewerInterfacesAsCompleteComponentType constraint of '<em>Implementation Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationComponentType_requireSameOrFewerInterfacesAsCompleteComponentType(ImplementationComponentType implementationComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.IMPLEMENTATION_COMPONENT_TYPE,
				 implementationComponentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "requireSameOrFewerInterfacesAsCompleteComponentType",
				 IMPLEMENTATION_COMPONENT_TYPE__REQUIRE_SAME_OR_FEWER_INTERFACES_AS_COMPLETE_COMPONENT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryComponent(RepositoryComponent repositoryComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repositoryComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(repositoryComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(repositoryComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(repositoryComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(repositoryComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(repositoryComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(repositoryComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(repositoryComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(repositoryComponent, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(repositoryComponent, diagnostics, context);
		if (result || diagnostics != null) result &= entityValidator.validateInterfaceProvidingEntity_needID(repositoryComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedRole(ProvidedRole providedRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedRole, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(providedRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repository, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(repository, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validateRepository_repositorynotempty(repository, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the repositorynotempty constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPOSITORY__REPOSITORYNOTEMPTY__EEXPRESSION = "self.components__Repository->size()<>0 or self.dataTypes__Repository->size()<>0 or self.interfaces__Repository->size()<>0 or self.failureTypes__Repository->size()<>0";

	/**
	 * Validates the repositorynotempty constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository_repositorynotempty(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.REPOSITORY,
				 repository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "repositorynotempty",
				 REPOSITORY__REPOSITORYNOTEMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interface_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterface_noProtocolTypeIDUsedTwice(interface_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noProtocolTypeIDUsedTwice constraint of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERFACE__NO_PROTOCOL_TYPE_ID_USED_TWICE__EEXPRESSION = "self.protocols__Interface->forAll(p1, p2 |\r\n" +
		"p1.protocolTypeID <> p2.protocolTypeID)\r\n" +
		"";

	/**
	 * Validates the noProtocolTypeIDUsedTwice constraint of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface_noProtocolTypeIDUsedTwice(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.INTERFACE,
				 interface_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "noProtocolTypeIDUsedTwice",
				 INTERFACE__NO_PROTOCOL_TYPE_ID_USED_TWICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredCharacterisation(RequiredCharacterisation requiredCharacterisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredCharacterisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventGroup(EventGroup eventGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventGroup, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(eventGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterface_noProtocolTypeIDUsedTwice(eventGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType(EventType eventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eventType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eventType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eventType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eventType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eventType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eventType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eventType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eventType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eventType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(eventType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signature, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(signature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionType(ExceptionType exceptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exceptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureSignature(InfrastructureSignature infrastructureSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infrastructureSignature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(infrastructureSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(infrastructureSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(infrastructureSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(infrastructureSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(infrastructureSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(infrastructureSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(infrastructureSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(infrastructureSignature, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(infrastructureSignature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureInterface(InfrastructureInterface infrastructureInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infrastructureInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(infrastructureInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(infrastructureInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(infrastructureInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(infrastructureInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(infrastructureInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(infrastructureInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(infrastructureInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(infrastructureInterface, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(infrastructureInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterface_noProtocolTypeIDUsedTwice(infrastructureInterface, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureRequiredRole(InfrastructureRequiredRole infrastructureRequiredRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infrastructureRequiredRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(infrastructureRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(infrastructureRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(infrastructureRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(infrastructureRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(infrastructureRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(infrastructureRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(infrastructureRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(infrastructureRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(infrastructureRequiredRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredRole(RequiredRole requiredRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(requiredRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationSignature(OperationSignature operationSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationSignature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationSignature, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(operationSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationSignature_parameterNamesHaveToBeUniqueForASignature(operationSignature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the parameterNamesHaveToBeUniqueForASignature constraint of '<em>Operation Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION_SIGNATURE__PARAMETER_NAMES_HAVE_TO_BE_UNIQUE_FOR_ASIGNATURE__EEXPRESSION = "self.parameters__OperationSignature->isUnique(p : Parameter |\r\n" +
		"\tp.parameterName\r\n" +
		")";

	/**
	 * Validates the parameterNamesHaveToBeUniqueForASignature constraint of '<em>Operation Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationSignature_parameterNamesHaveToBeUniqueForASignature(OperationSignature operationSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.OPERATION_SIGNATURE,
				 operationSignature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "parameterNamesHaveToBeUniqueForASignature",
				 OPERATION_SIGNATURE__PARAMETER_NAMES_HAVE_TO_BE_UNIQUE_FOR_ASIGNATURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationInterface(OperationInterface operationInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationInterface, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(operationInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterface_noProtocolTypeIDUsedTwice(operationInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationInterface_signaturesHaveToBeUniqueForAnInterface(operationInterface, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the signaturesHaveToBeUniqueForAnInterface constraint of '<em>Operation Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION_INTERFACE__SIGNATURES_HAVE_TO_BE_UNIQUE_FOR_AN_INTERFACE__EEXPRESSION = "-- full signature has to be unique \r\n" +
		"-- (use of ocl-tupels) #\r\n" +
		"let sigs : Bag(\r\n" +
		"\t-- parameters: Sequence of DataType, NOT name #\r\n" +
		"\t-- exceptions have not to be considered #\r\n" +
		"\tTuple(returnType : DataType, serviceName : String, parameters : Sequence(DataType) ) \r\n" +
		") = \r\n" +
		"self.signatures__OperationInterface->collect(sig : OperationSignature |\r\n" +
		"\tTuple{\r\n" +
		"\t\treturnType : DataType = sig.returnType__OperationSignature,\r\n" +
		"\t\tserviceName : String = sig.entityName,\r\n" +
		"\t\tparameters : Sequence(DataType) = sig.parameters__OperationSignature.dataType__Parameter\r\n" +
		"\t}\r\n" +
		")\r\n" +
		"in\r\n" +
		"sigs->isUnique(s|s)";

	/**
	 * Validates the signaturesHaveToBeUniqueForAnInterface constraint of '<em>Operation Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationInterface_signaturesHaveToBeUniqueForAnInterface(OperationInterface operationInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.OPERATION_INTERFACE,
				 operationInterface,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "signaturesHaveToBeUniqueForAnInterface",
				 OPERATION_INTERFACE__SIGNATURES_HAVE_TO_BE_UNIQUE_FOR_AN_INTERFACE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationRequiredRole(OperationRequiredRole operationRequiredRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationRequiredRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationRequiredRole, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(operationRequiredRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceRole(SourceRole sourceRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sourceRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(sourceRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSinkRole(SinkRole sinkRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sinkRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sinkRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sinkRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sinkRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sinkRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sinkRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sinkRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sinkRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sinkRole, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(sinkRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationProvidedRole(OperationProvidedRole operationProvidedRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationProvidedRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(operationProvidedRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureProvidedRole(InfrastructureProvidedRole infrastructureProvidedRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infrastructureProvidedRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(infrastructureProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(infrastructureProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(infrastructureProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(infrastructureProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(infrastructureProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(infrastructureProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(infrastructureProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(infrastructureProvidedRole, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(infrastructureProvidedRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompleteComponentType(CompleteComponentType completeComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(completeComponentType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= entityValidator.validateInterfaceProvidingEntity_needID(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompleteComponentType_atLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType(completeComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompleteComponentType_providedInterfacesHaveToConformToProvidedType2(completeComponentType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the atLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType constraint of '<em>Complete Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLETE_COMPONENT_TYPE__AT_LEAST_ONE_INTERFACE_HAS_TO_BE_PROVIDED_OR_REQUIRED_BY_AUSEFULL_COMPLETE_COMPONENT_TYPE__EEXPRESSION = "(\r\n" +
		"\tself.oclIsTypeOf(CompleteComponentType)\r\n" +
		"\tor\r\n" +
		"\tself.oclIsTypeOf(ImplementationComponentType)\r\n" +
		"\tor\r\n" +
		"\tself.oclIsTypeOf(CompositeComponent)\r\n" +
		"\tor\r\n" +
		"\tself.oclIsTypeOf(BasicComponent)\r\n" +
		")\r\n" +
		"implies\r\n" +
		"(\r\n" +
		"\tself.providedRoles_InterfaceProvidingEntity->size() >= 1\r\n" +
		"\tor\r\n" +
		"\tself.requiredRoles_InterfaceRequiringEntity->size() >= 1\r\n" +
		")";

	/**
	 * Validates the atLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType constraint of '<em>Complete Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompleteComponentType_atLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType(CompleteComponentType completeComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.COMPLETE_COMPONENT_TYPE,
				 completeComponentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "atLeastOneInterfaceHasToBeProvidedOrRequiredByAUsefullCompleteComponentType",
				 COMPLETE_COMPONENT_TYPE__AT_LEAST_ONE_INTERFACE_HAS_TO_BE_PROVIDED_OR_REQUIRED_BY_AUSEFULL_COMPLETE_COMPONENT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the providedInterfacesHaveToConformToProvidedType2 constraint of '<em>Complete Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLETE_COMPONENT_TYPE__PROVIDED_INTERFACES_HAVE_TO_CONFORM_TO_PROVIDED_TYPE2__EEXPRESSION = "-- CompleteTypes provided Interfaces have to be a superset\r\n" +
		"-- of ProvidesComponentType provided Interfaces #\r\n" +
		"--\r\n" +
		"-- ACCx are used to accumulate Sets/Bags; usually only the very inner ACCx is used at all.\r\n" +
		"--\r\n" +
		"-- Recursive Query for parent Interface IDs\r\n" +
		"-- see \"lpar2005.pdf\" (Second-order principles in specification languages for Object-Oriented Programs; Beckert, Tretelman) pp. 11 #\r\n" +
		"--let parentInterfaces : Bag(Interface) =\r\n" +
		"--\tself.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\tacc2->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n" +
		"--\t) in\r\n" +
		"--let anchestorInterfaces : Bag(Interface) =\r\n" +
		"--\tself.providedRoles->iterate(r : ProvidedRole; acc4 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\tacc4->union(r.providedInterface.parentInterface->asBag()) -- asBag required to allow Set operations #\r\n" +
		"--\t)->union( -- union with anchestors found in former recursion #\r\n" +
		"--\t\tself.providedRoles->iterate(r : ProvidedRole; acc6 : Bag(Interface) = Bag{} |\r\n" +
		"--\t\t\tacc6->union(r.providedInterface.parentInterface.anchestorInterfaces) --already Set/Bag\r\n" +
		"--\t\t)\r\n" +
		"--\t) in\r\n" +
		"--\t-- Directly provided anchestorInterfaces need to be a superset of provided interfaces of Supertype #\r\n" +
		"--\tanchestorInterfaces.identifier.id->includesAll(\r\n" +
		"--\t\tself.parentProvidesComponentTypes->iterate(pt : ProvidesComponentType; acc1 : Bag(String) = Bag{} |\r\n" +
		"--\t\t\tpt.providedRoles->iterate(r : ProvidedRole; acc2 : Bag(String) = Bag{} |\r\n" +
		"--\t\t\t\tacc2->union(r.providedInterface.identifier.id->asBag()) -- asBag required to allow Set operations #\r\n" +
		"--\t\t\t)\r\n" +
		"--\t\t)\r\n" +
		"--\t)\r\n" +
		"true";

	/**
	 * Validates the providedInterfacesHaveToConformToProvidedType2 constraint of '<em>Complete Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompleteComponentType_providedInterfacesHaveToConformToProvidedType2(CompleteComponentType completeComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.COMPLETE_COMPONENT_TYPE,
				 completeComponentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "providedInterfacesHaveToConformToProvidedType2",
				 COMPLETE_COMPONENT_TYPE__PROVIDED_INTERFACES_HAVE_TO_CONFORM_TO_PROVIDED_TYPE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidesComponentType(ProvidesComponentType providesComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providesComponentType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providesComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providesComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providesComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providesComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providesComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providesComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providesComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providesComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(providesComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= entityValidator.validateInterfaceProvidingEntity_needID(providesComponentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateProvidesComponentType_atLeastOneInterfaceHasToBeProvidedByAUsefullProvidesComponentType(providesComponentType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the atLeastOneInterfaceHasToBeProvidedByAUsefullProvidesComponentType constraint of '<em>Provides Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROVIDES_COMPONENT_TYPE__AT_LEAST_ONE_INTERFACE_HAS_TO_BE_PROVIDED_BY_AUSEFULL_PROVIDES_COMPONENT_TYPE__EEXPRESSION = "self.oclIsTypeOf(ProvidesComponentType)\r\n" +
		"implies\r\n" +
		"self.providedRoles_InterfaceProvidingEntity->size() >= 1";

	/**
	 * Validates the atLeastOneInterfaceHasToBeProvidedByAUsefullProvidesComponentType constraint of '<em>Provides Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidesComponentType_atLeastOneInterfaceHasToBeProvidedByAUsefullProvidesComponentType(ProvidesComponentType providesComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RepositoryPackage.Literals.PROVIDES_COMPONENT_TYPE,
				 providesComponentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "atLeastOneInterfaceHasToBeProvidedByAUsefullProvidesComponentType",
				 PROVIDES_COMPONENT_TYPE__AT_LEAST_ONE_INTERFACE_HAS_TO_BE_PROVIDED_BY_AUSEFULL_PROVIDES_COMPONENT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeComponent(CompositeComponent compositeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= compositionValidator.validateComposedStructure_multipleConnectorsConstraint(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= compositionValidator.validateComposedStructure_multipleConnectorsConstraintForAssemblyConnectors(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= compositionValidator.validateComposedStructure_validateSameSubsystemMustNotBeInstantiatedMoreThanOnce(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= entityValidator.validateInterfaceProvidingEntity_needID(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= entityValidator.validateComposedProvidingRequiringEntity_operationProvidedRolesMustBeBound(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_requiredInterfacesHaveToConformToCompleteType(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_providedInterfacesHaveToConformToCompleteType(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_providedInterfaceHaveToConformToComponentType(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_provideSameOrMoreInterfacesAsCompleteComponentType(compositeComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationComponentType_requireSameOrFewerInterfacesAsCompleteComponentType(compositeComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveDataType(PrimitiveDataType primitiveDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionDataType(CollectionDataType collectionDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collectionDataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collectionDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collectionDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collectionDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collectionDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collectionDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collectionDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collectionDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collectionDataType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(collectionDataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeDataType(CompositeDataType compositeDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeDataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeDataType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(compositeDataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInnerDeclaration(InnerDeclaration innerDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(innerDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(role, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(role, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(role, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterModifier(ParameterModifier parameterModifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveTypeEnum(PrimitiveTypeEnum primitiveTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //RepositoryValidator

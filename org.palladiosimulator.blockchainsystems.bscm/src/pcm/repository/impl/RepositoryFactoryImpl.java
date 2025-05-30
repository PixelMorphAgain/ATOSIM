/**
 */
package pcm.repository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcm.repository.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryFactoryImpl extends EFactoryImpl implements RepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepositoryFactory init() {
		try {
			RepositoryFactory theRepositoryFactory = (RepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(RepositoryPackage.eNS_URI);
			if (theRepositoryFactory != null) {
				return theRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RepositoryPackage.PASSIVE_RESOURCE: return createPassiveResource();
			case RepositoryPackage.BASIC_COMPONENT: return createBasicComponent();
			case RepositoryPackage.PARAMETER: return createParameter();
			case RepositoryPackage.REPOSITORY: return createRepository();
			case RepositoryPackage.REQUIRED_CHARACTERISATION: return createRequiredCharacterisation();
			case RepositoryPackage.EVENT_GROUP: return createEventGroup();
			case RepositoryPackage.EVENT_TYPE: return createEventType();
			case RepositoryPackage.EXCEPTION_TYPE: return createExceptionType();
			case RepositoryPackage.INFRASTRUCTURE_SIGNATURE: return createInfrastructureSignature();
			case RepositoryPackage.INFRASTRUCTURE_INTERFACE: return createInfrastructureInterface();
			case RepositoryPackage.INFRASTRUCTURE_REQUIRED_ROLE: return createInfrastructureRequiredRole();
			case RepositoryPackage.OPERATION_SIGNATURE: return createOperationSignature();
			case RepositoryPackage.OPERATION_INTERFACE: return createOperationInterface();
			case RepositoryPackage.OPERATION_REQUIRED_ROLE: return createOperationRequiredRole();
			case RepositoryPackage.SOURCE_ROLE: return createSourceRole();
			case RepositoryPackage.SINK_ROLE: return createSinkRole();
			case RepositoryPackage.OPERATION_PROVIDED_ROLE: return createOperationProvidedRole();
			case RepositoryPackage.INFRASTRUCTURE_PROVIDED_ROLE: return createInfrastructureProvidedRole();
			case RepositoryPackage.COMPLETE_COMPONENT_TYPE: return createCompleteComponentType();
			case RepositoryPackage.PROVIDES_COMPONENT_TYPE: return createProvidesComponentType();
			case RepositoryPackage.COMPOSITE_COMPONENT: return createCompositeComponent();
			case RepositoryPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
			case RepositoryPackage.COLLECTION_DATA_TYPE: return createCollectionDataType();
			case RepositoryPackage.COMPOSITE_DATA_TYPE: return createCompositeDataType();
			case RepositoryPackage.INNER_DECLARATION: return createInnerDeclaration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RepositoryPackage.PARAMETER_MODIFIER:
				return createParameterModifierFromString(eDataType, initialValue);
			case RepositoryPackage.COMPONENT_TYPE:
				return createComponentTypeFromString(eDataType, initialValue);
			case RepositoryPackage.PRIMITIVE_TYPE_ENUM:
				return createPrimitiveTypeEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RepositoryPackage.PARAMETER_MODIFIER:
				return convertParameterModifierToString(eDataType, instanceValue);
			case RepositoryPackage.COMPONENT_TYPE:
				return convertComponentTypeToString(eDataType, instanceValue);
			case RepositoryPackage.PRIMITIVE_TYPE_ENUM:
				return convertPrimitiveTypeEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassiveResource createPassiveResource() {
		PassiveResourceImpl passiveResource = new PassiveResourceImpl();
		return passiveResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicComponent createBasicComponent() {
		BasicComponentImpl basicComponent = new BasicComponentImpl();
		return basicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredCharacterisation createRequiredCharacterisation() {
		RequiredCharacterisationImpl requiredCharacterisation = new RequiredCharacterisationImpl();
		return requiredCharacterisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventGroup createEventGroup() {
		EventGroupImpl eventGroup = new EventGroupImpl();
		return eventGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionType createExceptionType() {
		ExceptionTypeImpl exceptionType = new ExceptionTypeImpl();
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureSignature createInfrastructureSignature() {
		InfrastructureSignatureImpl infrastructureSignature = new InfrastructureSignatureImpl();
		return infrastructureSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureInterface createInfrastructureInterface() {
		InfrastructureInterfaceImpl infrastructureInterface = new InfrastructureInterfaceImpl();
		return infrastructureInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureRequiredRole createInfrastructureRequiredRole() {
		InfrastructureRequiredRoleImpl infrastructureRequiredRole = new InfrastructureRequiredRoleImpl();
		return infrastructureRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationSignature createOperationSignature() {
		OperationSignatureImpl operationSignature = new OperationSignatureImpl();
		return operationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationInterface createOperationInterface() {
		OperationInterfaceImpl operationInterface = new OperationInterfaceImpl();
		return operationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationRequiredRole createOperationRequiredRole() {
		OperationRequiredRoleImpl operationRequiredRole = new OperationRequiredRoleImpl();
		return operationRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceRole createSourceRole() {
		SourceRoleImpl sourceRole = new SourceRoleImpl();
		return sourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SinkRole createSinkRole() {
		SinkRoleImpl sinkRole = new SinkRoleImpl();
		return sinkRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationProvidedRole createOperationProvidedRole() {
		OperationProvidedRoleImpl operationProvidedRole = new OperationProvidedRoleImpl();
		return operationProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureProvidedRole createInfrastructureProvidedRole() {
		InfrastructureProvidedRoleImpl infrastructureProvidedRole = new InfrastructureProvidedRoleImpl();
		return infrastructureProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompleteComponentType createCompleteComponentType() {
		CompleteComponentTypeImpl completeComponentType = new CompleteComponentTypeImpl();
		return completeComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidesComponentType createProvidesComponentType() {
		ProvidesComponentTypeImpl providesComponentType = new ProvidesComponentTypeImpl();
		return providesComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeComponent createCompositeComponent() {
		CompositeComponentImpl compositeComponent = new CompositeComponentImpl();
		return compositeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveDataType createPrimitiveDataType() {
		PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionDataType createCollectionDataType() {
		CollectionDataTypeImpl collectionDataType = new CollectionDataTypeImpl();
		return collectionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeDataType createCompositeDataType() {
		CompositeDataTypeImpl compositeDataType = new CompositeDataTypeImpl();
		return compositeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerDeclaration createInnerDeclaration() {
		InnerDeclarationImpl innerDeclaration = new InnerDeclarationImpl();
		return innerDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterModifier createParameterModifierFromString(EDataType eDataType, String initialValue) {
		ParameterModifier result = ParameterModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentTypeFromString(EDataType eDataType, String initialValue) {
		ComponentType result = ComponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeEnum createPrimitiveTypeEnumFromString(EDataType eDataType, String initialValue) {
		PrimitiveTypeEnum result = PrimitiveTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryPackage getRepositoryPackage() {
		return (RepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RepositoryPackage getPackage() {
		return RepositoryPackage.eINSTANCE;
	}

} //RepositoryFactoryImpl

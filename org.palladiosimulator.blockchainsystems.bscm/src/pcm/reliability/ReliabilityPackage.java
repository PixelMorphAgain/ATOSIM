/**
 */
package pcm.reliability;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pcm.PcmPackage;

import pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package contains reliability-relevant classes such as the definition of failure types.
 * <!-- end-model-doc -->
 * @see pcm.reliability.ReliabilityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG'"
 * @generated
 */
public interface ReliabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reliability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/Reliability/5.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reliability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReliabilityPackage eINSTANCE = pcm.reliability.impl.ReliabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcm.reliability.impl.FailureOccurrenceDescriptionImpl <em>Failure Occurrence Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.reliability.impl.FailureOccurrenceDescriptionImpl
	 * @see pcm.reliability.impl.ReliabilityPackageImpl#getFailureOccurrenceDescription()
	 * @generated
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___ECLASS = PcmPackage.PCM_BASE_CLASS___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___EIS_PROXY = PcmPackage.PCM_BASE_CLASS___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___ERESOURCE = PcmPackage.PCM_BASE_CLASS___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINER = PcmPackage.PCM_BASE_CLASS___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINING_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINMENT_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___ECONTENTS = PcmPackage.PCM_BASE_CLASS___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___EALL_CONTENTS = PcmPackage.PCM_BASE_CLASS___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___ECROSS_REFERENCES = PcmPackage.PCM_BASE_CLASS___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___EGET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___ESET__ESTRUCTURALFEATURE_OBJECT = PcmPackage.PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___EIS_SET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___EUNSET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION___EINVOKE__EOPERATION_ELIST = PcmPackage.PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OCCURRENCE_DESCRIPTION_OPERATION_COUNT = PcmPackage.PCM_BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.reliability.impl.FailureTypeImpl <em>Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.reliability.impl.FailureTypeImpl
	 * @see pcm.reliability.impl.ReliabilityPackageImpl#getFailureType()
	 * @generated
	 */
	int FAILURE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Failure Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.reliability.impl.HardwareInducedFailureTypeImpl <em>Hardware Induced Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.reliability.impl.HardwareInducedFailureTypeImpl
	 * @see pcm.reliability.impl.ReliabilityPackageImpl#getHardwareInducedFailureType()
	 * @generated
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__ID = FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__ENTITY_NAME = FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Failure Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = FAILURE_TYPE__REPOSITORY_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Processing Resource Type Hardware Induced Failure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE = FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE_FEATURE_COUNT = FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___ECLASS = FAILURE_TYPE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___EIS_PROXY = FAILURE_TYPE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___ERESOURCE = FAILURE_TYPE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___ECONTAINER = FAILURE_TYPE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___ECONTAINING_FEATURE = FAILURE_TYPE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___ECONTAINMENT_FEATURE = FAILURE_TYPE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___ECONTENTS = FAILURE_TYPE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___EALL_CONTENTS = FAILURE_TYPE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___ECROSS_REFERENCES = FAILURE_TYPE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___EGET__ESTRUCTURALFEATURE = FAILURE_TYPE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = FAILURE_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = FAILURE_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___EIS_SET__ESTRUCTURALFEATURE = FAILURE_TYPE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___EUNSET__ESTRUCTURALFEATURE = FAILURE_TYPE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE___EINVOKE__EOPERATION_ELIST = FAILURE_TYPE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Hardware Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INDUCED_FAILURE_TYPE_OPERATION_COUNT = FAILURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.reliability.impl.SoftwareInducedFailureTypeImpl <em>Software Induced Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.reliability.impl.SoftwareInducedFailureTypeImpl
	 * @see pcm.reliability.impl.ReliabilityPackageImpl#getSoftwareInducedFailureType()
	 * @generated
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__ID = FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__ENTITY_NAME = FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Failure Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = FAILURE_TYPE__REPOSITORY_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Internal Failure Occurrence Descriptions Software Induced Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE = FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE_FEATURE_COUNT = FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___ECLASS = FAILURE_TYPE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___EIS_PROXY = FAILURE_TYPE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___ERESOURCE = FAILURE_TYPE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___ECONTAINER = FAILURE_TYPE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___ECONTAINING_FEATURE = FAILURE_TYPE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___ECONTAINMENT_FEATURE = FAILURE_TYPE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___ECONTENTS = FAILURE_TYPE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___EALL_CONTENTS = FAILURE_TYPE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___ECROSS_REFERENCES = FAILURE_TYPE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___EGET__ESTRUCTURALFEATURE = FAILURE_TYPE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = FAILURE_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = FAILURE_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___EIS_SET__ESTRUCTURALFEATURE = FAILURE_TYPE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___EUNSET__ESTRUCTURALFEATURE = FAILURE_TYPE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE___EINVOKE__EOPERATION_ELIST = FAILURE_TYPE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Software Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_INDUCED_FAILURE_TYPE_OPERATION_COUNT = FAILURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.reliability.impl.InternalFailureOccurrenceDescriptionImpl <em>Internal Failure Occurrence Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.reliability.impl.InternalFailureOccurrenceDescriptionImpl
	 * @see pcm.reliability.impl.ReliabilityPackageImpl#getInternalFailureOccurrenceDescription()
	 * @generated
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Internal Action Internal Failure Occurrence Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Software Induced Failure Type Internal Failure Occurrence Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECLASS = FAILURE_OCCURRENCE_DESCRIPTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EIS_PROXY = FAILURE_OCCURRENCE_DESCRIPTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ERESOURCE = FAILURE_OCCURRENCE_DESCRIPTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINER = FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINING_FEATURE = FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINMENT_FEATURE = FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECONTENTS = FAILURE_OCCURRENCE_DESCRIPTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EALL_CONTENTS = FAILURE_OCCURRENCE_DESCRIPTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECROSS_REFERENCES = FAILURE_OCCURRENCE_DESCRIPTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EGET__ESTRUCTURALFEATURE = FAILURE_OCCURRENCE_DESCRIPTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = FAILURE_OCCURRENCE_DESCRIPTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ESET__ESTRUCTURALFEATURE_OBJECT = FAILURE_OCCURRENCE_DESCRIPTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EIS_SET__ESTRUCTURALFEATURE = FAILURE_OCCURRENCE_DESCRIPTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EUNSET__ESTRUCTURALFEATURE = FAILURE_OCCURRENCE_DESCRIPTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EINVOKE__EOPERATION_ELIST = FAILURE_OCCURRENCE_DESCRIPTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Internal Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION_OPERATION_COUNT = FAILURE_OCCURRENCE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.reliability.impl.NetworkInducedFailureTypeImpl <em>Network Induced Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.reliability.impl.NetworkInducedFailureTypeImpl
	 * @see pcm.reliability.impl.ReliabilityPackageImpl#getNetworkInducedFailureType()
	 * @generated
	 */
	int NETWORK_INDUCED_FAILURE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__ID = FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__ENTITY_NAME = FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Failure Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = FAILURE_TYPE__REPOSITORY_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Communication Link Resource Type Network Induced Failure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE = FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE_FEATURE_COUNT = FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___ECLASS = FAILURE_TYPE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___EIS_PROXY = FAILURE_TYPE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___ERESOURCE = FAILURE_TYPE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___ECONTAINER = FAILURE_TYPE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___ECONTAINING_FEATURE = FAILURE_TYPE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___ECONTAINMENT_FEATURE = FAILURE_TYPE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___ECONTENTS = FAILURE_TYPE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___EALL_CONTENTS = FAILURE_TYPE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___ECROSS_REFERENCES = FAILURE_TYPE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___EGET__ESTRUCTURALFEATURE = FAILURE_TYPE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = FAILURE_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = FAILURE_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___EIS_SET__ESTRUCTURALFEATURE = FAILURE_TYPE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___EUNSET__ESTRUCTURALFEATURE = FAILURE_TYPE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE___EINVOKE__EOPERATION_ELIST = FAILURE_TYPE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Network Induced Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INDUCED_FAILURE_TYPE_OPERATION_COUNT = FAILURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.reliability.impl.ExternalFailureOccurrenceDescriptionImpl <em>External Failure Occurrence Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.reliability.impl.ExternalFailureOccurrenceDescriptionImpl
	 * @see pcm.reliability.impl.ReliabilityPackageImpl#getExternalFailureOccurrenceDescription()
	 * @generated
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Failure Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY;

	/**
	 * The feature id for the '<em><b>Specified Reliability Annotation External Failure Occurrence Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Type External Failure Occurrence Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT = FAILURE_OCCURRENCE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECLASS = FAILURE_OCCURRENCE_DESCRIPTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EIS_PROXY = FAILURE_OCCURRENCE_DESCRIPTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ERESOURCE = FAILURE_OCCURRENCE_DESCRIPTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINER = FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINING_FEATURE = FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINMENT_FEATURE = FAILURE_OCCURRENCE_DESCRIPTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECONTENTS = FAILURE_OCCURRENCE_DESCRIPTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EALL_CONTENTS = FAILURE_OCCURRENCE_DESCRIPTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ECROSS_REFERENCES = FAILURE_OCCURRENCE_DESCRIPTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EGET__ESTRUCTURALFEATURE = FAILURE_OCCURRENCE_DESCRIPTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = FAILURE_OCCURRENCE_DESCRIPTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___ESET__ESTRUCTURALFEATURE_OBJECT = FAILURE_OCCURRENCE_DESCRIPTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EIS_SET__ESTRUCTURALFEATURE = FAILURE_OCCURRENCE_DESCRIPTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EUNSET__ESTRUCTURALFEATURE = FAILURE_OCCURRENCE_DESCRIPTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION___EINVOKE__EOPERATION_ELIST = FAILURE_OCCURRENCE_DESCRIPTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>External Failure Occurrence Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION_OPERATION_COUNT = FAILURE_OCCURRENCE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.reliability.impl.ResourceTimeoutFailureTypeImpl <em>Resource Timeout Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.reliability.impl.ResourceTimeoutFailureTypeImpl
	 * @see pcm.reliability.impl.ReliabilityPackageImpl#getResourceTimeoutFailureType()
	 * @generated
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE__ID = SOFTWARE_INDUCED_FAILURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE__ENTITY_NAME = SOFTWARE_INDUCED_FAILURE_TYPE__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Repository Failure Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = SOFTWARE_INDUCED_FAILURE_TYPE__REPOSITORY_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Internal Failure Occurrence Descriptions Software Induced Failure Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE = SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE;

	/**
	 * The feature id for the '<em><b>Passive Resource Resource Timeout Failure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE = SOFTWARE_INDUCED_FAILURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Timeout Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE_FEATURE_COUNT = SOFTWARE_INDUCED_FAILURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___ECLASS = SOFTWARE_INDUCED_FAILURE_TYPE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___EIS_PROXY = SOFTWARE_INDUCED_FAILURE_TYPE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___ERESOURCE = SOFTWARE_INDUCED_FAILURE_TYPE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___ECONTAINER = SOFTWARE_INDUCED_FAILURE_TYPE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___ECONTAINING_FEATURE = SOFTWARE_INDUCED_FAILURE_TYPE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___ECONTAINMENT_FEATURE = SOFTWARE_INDUCED_FAILURE_TYPE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___ECONTENTS = SOFTWARE_INDUCED_FAILURE_TYPE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___EALL_CONTENTS = SOFTWARE_INDUCED_FAILURE_TYPE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___ECROSS_REFERENCES = SOFTWARE_INDUCED_FAILURE_TYPE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___EGET__ESTRUCTURALFEATURE = SOFTWARE_INDUCED_FAILURE_TYPE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN = SOFTWARE_INDUCED_FAILURE_TYPE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT = SOFTWARE_INDUCED_FAILURE_TYPE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___EIS_SET__ESTRUCTURALFEATURE = SOFTWARE_INDUCED_FAILURE_TYPE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___EUNSET__ESTRUCTURALFEATURE = SOFTWARE_INDUCED_FAILURE_TYPE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE___EINVOKE__EOPERATION_ELIST = SOFTWARE_INDUCED_FAILURE_TYPE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Resource Timeout Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TIMEOUT_FAILURE_TYPE_OPERATION_COUNT = SOFTWARE_INDUCED_FAILURE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcm.reliability.FailureOccurrenceDescription <em>Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Occurrence Description</em>'.
	 * @see pcm.reliability.FailureOccurrenceDescription
	 * @generated
	 */
	EClass getFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the attribute '{@link pcm.reliability.FailureOccurrenceDescription#getFailureProbability <em>Failure Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Probability</em>'.
	 * @see pcm.reliability.FailureOccurrenceDescription#getFailureProbability()
	 * @see #getFailureOccurrenceDescription()
	 * @generated
	 */
	EAttribute getFailureOccurrenceDescription_FailureProbability();

	/**
	 * Returns the meta object for class '{@link pcm.reliability.HardwareInducedFailureType <em>Hardware Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Induced Failure Type</em>'.
	 * @see pcm.reliability.HardwareInducedFailureType
	 * @generated
	 */
	EClass getHardwareInducedFailureType();

	/**
	 * Returns the meta object for the reference '{@link pcm.reliability.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType <em>Processing Resource Type Hardware Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processing Resource Type Hardware Induced Failure Type</em>'.
	 * @see pcm.reliability.HardwareInducedFailureType#getProcessingResourceType__HardwareInducedFailureType()
	 * @see #getHardwareInducedFailureType()
	 * @generated
	 */
	EReference getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType();

	/**
	 * Returns the meta object for class '{@link pcm.reliability.SoftwareInducedFailureType <em>Software Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Induced Failure Type</em>'.
	 * @see pcm.reliability.SoftwareInducedFailureType
	 * @generated
	 */
	EClass getSoftwareInducedFailureType();

	/**
	 * Returns the meta object for the reference list '{@link pcm.reliability.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType <em>Internal Failure Occurrence Descriptions Software Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Internal Failure Occurrence Descriptions Software Induced Failure Type</em>'.
	 * @see pcm.reliability.SoftwareInducedFailureType#getInternalFailureOccurrenceDescriptions__SoftwareInducedFailureType()
	 * @see #getSoftwareInducedFailureType()
	 * @generated
	 */
	EReference getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType();

	/**
	 * Returns the meta object for class '{@link pcm.reliability.InternalFailureOccurrenceDescription <em>Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Failure Occurrence Description</em>'.
	 * @see pcm.reliability.InternalFailureOccurrenceDescription
	 * @generated
	 */
	EClass getInternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the container reference '{@link pcm.reliability.InternalFailureOccurrenceDescription#getInternalAction__InternalFailureOccurrenceDescription <em>Internal Action Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Internal Action Internal Failure Occurrence Description</em>'.
	 * @see pcm.reliability.InternalFailureOccurrenceDescription#getInternalAction__InternalFailureOccurrenceDescription()
	 * @see #getInternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the reference '{@link pcm.reliability.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription <em>Software Induced Failure Type Internal Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software Induced Failure Type Internal Failure Occurrence Description</em>'.
	 * @see pcm.reliability.InternalFailureOccurrenceDescription#getSoftwareInducedFailureType__InternalFailureOccurrenceDescription()
	 * @see #getInternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for class '{@link pcm.reliability.NetworkInducedFailureType <em>Network Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Induced Failure Type</em>'.
	 * @see pcm.reliability.NetworkInducedFailureType
	 * @generated
	 */
	EClass getNetworkInducedFailureType();

	/**
	 * Returns the meta object for the reference '{@link pcm.reliability.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType <em>Communication Link Resource Type Network Induced Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Link Resource Type Network Induced Failure Type</em>'.
	 * @see pcm.reliability.NetworkInducedFailureType#getCommunicationLinkResourceType__NetworkInducedFailureType()
	 * @see #getNetworkInducedFailureType()
	 * @generated
	 */
	EReference getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType();

	/**
	 * Returns the meta object for class '{@link pcm.reliability.ExternalFailureOccurrenceDescription <em>External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Failure Occurrence Description</em>'.
	 * @see pcm.reliability.ExternalFailureOccurrenceDescription
	 * @generated
	 */
	EClass getExternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the container reference '{@link pcm.reliability.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription <em>Specified Reliability Annotation External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specified Reliability Annotation External Failure Occurrence Description</em>'.
	 * @see pcm.reliability.ExternalFailureOccurrenceDescription#getSpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription()
	 * @see #getExternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for the reference '{@link pcm.reliability.ExternalFailureOccurrenceDescription#getFailureType__ExternalFailureOccurrenceDescription <em>Failure Type External Failure Occurrence Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure Type External Failure Occurrence Description</em>'.
	 * @see pcm.reliability.ExternalFailureOccurrenceDescription#getFailureType__ExternalFailureOccurrenceDescription()
	 * @see #getExternalFailureOccurrenceDescription()
	 * @generated
	 */
	EReference getExternalFailureOccurrenceDescription_FailureType__ExternalFailureOccurrenceDescription();

	/**
	 * Returns the meta object for class '{@link pcm.reliability.ResourceTimeoutFailureType <em>Resource Timeout Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Timeout Failure Type</em>'.
	 * @see pcm.reliability.ResourceTimeoutFailureType
	 * @generated
	 */
	EClass getResourceTimeoutFailureType();

	/**
	 * Returns the meta object for the reference '{@link pcm.reliability.ResourceTimeoutFailureType#getPassiveResource__ResourceTimeoutFailureType <em>Passive Resource Resource Timeout Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passive Resource Resource Timeout Failure Type</em>'.
	 * @see pcm.reliability.ResourceTimeoutFailureType#getPassiveResource__ResourceTimeoutFailureType()
	 * @see #getResourceTimeoutFailureType()
	 * @generated
	 */
	EReference getResourceTimeoutFailureType_PassiveResource__ResourceTimeoutFailureType();

	/**
	 * Returns the meta object for class '{@link pcm.reliability.FailureType <em>Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Type</em>'.
	 * @see pcm.reliability.FailureType
	 * @generated
	 */
	EClass getFailureType();

	/**
	 * Returns the meta object for the container reference '{@link pcm.reliability.FailureType#getRepository__FailureType <em>Repository Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository Failure Type</em>'.
	 * @see pcm.reliability.FailureType#getRepository__FailureType()
	 * @see #getFailureType()
	 * @generated
	 */
	EReference getFailureType_Repository__FailureType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReliabilityFactory getReliabilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pcm.reliability.impl.FailureOccurrenceDescriptionImpl <em>Failure Occurrence Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.reliability.impl.FailureOccurrenceDescriptionImpl
		 * @see pcm.reliability.impl.ReliabilityPackageImpl#getFailureOccurrenceDescription()
		 * @generated
		 */
		EClass FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Failure Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_PROBABILITY = eINSTANCE.getFailureOccurrenceDescription_FailureProbability();

		/**
		 * The meta object literal for the '{@link pcm.reliability.impl.HardwareInducedFailureTypeImpl <em>Hardware Induced Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.reliability.impl.HardwareInducedFailureTypeImpl
		 * @see pcm.reliability.impl.ReliabilityPackageImpl#getHardwareInducedFailureType()
		 * @generated
		 */
		EClass HARDWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getHardwareInducedFailureType();

		/**
		 * The meta object literal for the '<em><b>Processing Resource Type Hardware Induced Failure Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_INDUCED_FAILURE_TYPE__PROCESSING_RESOURCE_TYPE_HARDWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getHardwareInducedFailureType_ProcessingResourceType__HardwareInducedFailureType();

		/**
		 * The meta object literal for the '{@link pcm.reliability.impl.SoftwareInducedFailureTypeImpl <em>Software Induced Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.reliability.impl.SoftwareInducedFailureTypeImpl
		 * @see pcm.reliability.impl.ReliabilityPackageImpl#getSoftwareInducedFailureType()
		 * @generated
		 */
		EClass SOFTWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getSoftwareInducedFailureType();

		/**
		 * The meta object literal for the '<em><b>Internal Failure Occurrence Descriptions Software Induced Failure Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_INDUCED_FAILURE_TYPE__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SOFTWARE_INDUCED_FAILURE_TYPE = eINSTANCE.getSoftwareInducedFailureType_InternalFailureOccurrenceDescriptions__SoftwareInducedFailureType();

		/**
		 * The meta object literal for the '{@link pcm.reliability.impl.InternalFailureOccurrenceDescriptionImpl <em>Internal Failure Occurrence Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.reliability.impl.InternalFailureOccurrenceDescriptionImpl
		 * @see pcm.reliability.impl.ReliabilityPackageImpl#getInternalFailureOccurrenceDescription()
		 * @generated
		 */
		EClass INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getInternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Internal Action Internal Failure Occurrence Description</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__INTERNAL_ACTION_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getInternalFailureOccurrenceDescription_InternalAction__InternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Software Induced Failure Type Internal Failure Occurrence Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SOFTWARE_INDUCED_FAILURE_TYPE_INTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getInternalFailureOccurrenceDescription_SoftwareInducedFailureType__InternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '{@link pcm.reliability.impl.NetworkInducedFailureTypeImpl <em>Network Induced Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.reliability.impl.NetworkInducedFailureTypeImpl
		 * @see pcm.reliability.impl.ReliabilityPackageImpl#getNetworkInducedFailureType()
		 * @generated
		 */
		EClass NETWORK_INDUCED_FAILURE_TYPE = eINSTANCE.getNetworkInducedFailureType();

		/**
		 * The meta object literal for the '<em><b>Communication Link Resource Type Network Induced Failure Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_INDUCED_FAILURE_TYPE__COMMUNICATION_LINK_RESOURCE_TYPE_NETWORK_INDUCED_FAILURE_TYPE = eINSTANCE.getNetworkInducedFailureType_CommunicationLinkResourceType__NetworkInducedFailureType();

		/**
		 * The meta object literal for the '{@link pcm.reliability.impl.ExternalFailureOccurrenceDescriptionImpl <em>External Failure Occurrence Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.reliability.impl.ExternalFailureOccurrenceDescriptionImpl
		 * @see pcm.reliability.impl.ReliabilityPackageImpl#getExternalFailureOccurrenceDescription()
		 * @generated
		 */
		EClass EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getExternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Specified Reliability Annotation External Failure Occurrence Description</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getExternalFailureOccurrenceDescription_SpecifiedReliabilityAnnotation__ExternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '<em><b>Failure Type External Failure Occurrence Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__FAILURE_TYPE_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION = eINSTANCE.getExternalFailureOccurrenceDescription_FailureType__ExternalFailureOccurrenceDescription();

		/**
		 * The meta object literal for the '{@link pcm.reliability.impl.ResourceTimeoutFailureTypeImpl <em>Resource Timeout Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.reliability.impl.ResourceTimeoutFailureTypeImpl
		 * @see pcm.reliability.impl.ReliabilityPackageImpl#getResourceTimeoutFailureType()
		 * @generated
		 */
		EClass RESOURCE_TIMEOUT_FAILURE_TYPE = eINSTANCE.getResourceTimeoutFailureType();

		/**
		 * The meta object literal for the '<em><b>Passive Resource Resource Timeout Failure Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TIMEOUT_FAILURE_TYPE__PASSIVE_RESOURCE_RESOURCE_TIMEOUT_FAILURE_TYPE = eINSTANCE.getResourceTimeoutFailureType_PassiveResource__ResourceTimeoutFailureType();

		/**
		 * The meta object literal for the '{@link pcm.reliability.impl.FailureTypeImpl <em>Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.reliability.impl.FailureTypeImpl
		 * @see pcm.reliability.impl.ReliabilityPackageImpl#getFailureType()
		 * @generated
		 */
		EClass FAILURE_TYPE = eINSTANCE.getFailureType();

		/**
		 * The meta object literal for the '<em><b>Repository Failure Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_TYPE__REPOSITORY_FAILURE_TYPE = eINSTANCE.getFailureType_Repository__FailureType();

	}

} //ReliabilityPackage

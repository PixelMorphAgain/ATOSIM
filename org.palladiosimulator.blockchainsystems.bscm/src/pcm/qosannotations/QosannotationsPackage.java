/**
 */
package pcm.qosannotations;

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
 * This package contains elements to specify fixed QoS attributes of system-external services.
 * <!-- end-model-doc -->
 * @see pcm.qosannotations.QosannotationsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG'"
 * @generated
 */
public interface QosannotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qosannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/QoSAnnotations/5.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qosannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QosannotationsPackage eINSTANCE = pcm.qosannotations.impl.QosannotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcm.qosannotations.impl.SpecifiedQoSAnnotationImpl <em>Specified Qo SAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.qosannotations.impl.SpecifiedQoSAnnotationImpl
	 * @see pcm.qosannotations.impl.QosannotationsPackageImpl#getSpecifiedQoSAnnotation()
	 * @generated
	 */
	int SPECIFIED_QO_SANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Specified Qo SAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION_FEATURE_COUNT = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___ECLASS = PcmPackage.PCM_BASE_CLASS___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___EIS_PROXY = PcmPackage.PCM_BASE_CLASS___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___ERESOURCE = PcmPackage.PCM_BASE_CLASS___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___ECONTAINER = PcmPackage.PCM_BASE_CLASS___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___ECONTAINING_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___ECONTAINMENT_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___ECONTENTS = PcmPackage.PCM_BASE_CLASS___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___EALL_CONTENTS = PcmPackage.PCM_BASE_CLASS___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___ECROSS_REFERENCES = PcmPackage.PCM_BASE_CLASS___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___EGET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT = PcmPackage.PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___EIS_SET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___EUNSET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION___EINVOKE__EOPERATION_ELIST = PcmPackage.PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Specified Qo SAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_QO_SANNOTATION_OPERATION_COUNT = PcmPackage.PCM_BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.qosannotations.impl.QoSAnnotationsImpl <em>Qo SAnnotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.qosannotations.impl.QoSAnnotationsImpl
	 * @see pcm.qosannotations.impl.QosannotationsPackageImpl#getQoSAnnotations()
	 * @generated
	 */
	int QO_SANNOTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Specified Output Parameter Abstractions Qo SAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Qo SAnnotations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specified Qo SAnnotations Qo SAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Qo SAnnotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Qo SAnnotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SANNOTATIONS_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.qosannotations.impl.SpecifiedOutputParameterAbstractionImpl <em>Specified Output Parameter Abstraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.qosannotations.impl.SpecifiedOutputParameterAbstractionImpl
	 * @see pcm.qosannotations.impl.QosannotationsPackageImpl#getSpecifiedOutputParameterAbstraction()
	 * @generated
	 */
	int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 2;

	/**
	 * The feature id for the '<em><b>Signature Specified Output Parameter Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 0;

	/**
	 * The feature id for the '<em><b>Role Specified Output Parameter Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 1;

	/**
	 * The feature id for the '<em><b>Expected External Outputs Specified Output Parameter Abstraction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 2;

	/**
	 * The feature id for the '<em><b>Qos Annotations Specified Output Parameter Abstraction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = 3;

	/**
	 * The number of structural features of the '<em>Specified Output Parameter Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Specified Output Parameter Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pcm.qosannotations.SpecifiedQoSAnnotation <em>Specified Qo SAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specified Qo SAnnotation</em>'.
	 * @see pcm.qosannotations.SpecifiedQoSAnnotation
	 * @generated
	 */
	EClass getSpecifiedQoSAnnotation();

	/**
	 * Returns the meta object for the reference '{@link pcm.qosannotations.SpecifiedQoSAnnotation#getSignature_SpecifiedQoSAnnation <em>Signature Specified Qo SAnnation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature Specified Qo SAnnation</em>'.
	 * @see pcm.qosannotations.SpecifiedQoSAnnotation#getSignature_SpecifiedQoSAnnation()
	 * @see #getSpecifiedQoSAnnotation()
	 * @generated
	 */
	EReference getSpecifiedQoSAnnotation_Signature_SpecifiedQoSAnnation();

	/**
	 * Returns the meta object for the reference '{@link pcm.qosannotations.SpecifiedQoSAnnotation#getRole_SpecifiedQoSAnnotation <em>Role Specified Qo SAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Specified Qo SAnnotation</em>'.
	 * @see pcm.qosannotations.SpecifiedQoSAnnotation#getRole_SpecifiedQoSAnnotation()
	 * @see #getSpecifiedQoSAnnotation()
	 * @generated
	 */
	EReference getSpecifiedQoSAnnotation_Role_SpecifiedQoSAnnotation();

	/**
	 * Returns the meta object for the container reference '{@link pcm.qosannotations.SpecifiedQoSAnnotation#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Qos Annotations Specified Qo SAnnotation</em>'.
	 * @see pcm.qosannotations.SpecifiedQoSAnnotation#getQosAnnotations_SpecifiedQoSAnnotation()
	 * @see #getSpecifiedQoSAnnotation()
	 * @generated
	 */
	EReference getSpecifiedQoSAnnotation_QosAnnotations_SpecifiedQoSAnnotation();

	/**
	 * Returns the meta object for class '{@link pcm.qosannotations.QoSAnnotations <em>Qo SAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SAnnotations</em>'.
	 * @see pcm.qosannotations.QoSAnnotations
	 * @generated
	 */
	EClass getQoSAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.qosannotations.QoSAnnotations#getSpecifiedOutputParameterAbstractions_QoSAnnotations <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specified Output Parameter Abstractions Qo SAnnotations</em>'.
	 * @see pcm.qosannotations.QoSAnnotations#getSpecifiedOutputParameterAbstractions_QoSAnnotations()
	 * @see #getQoSAnnotations()
	 * @generated
	 */
	EReference getQoSAnnotations_SpecifiedOutputParameterAbstractions_QoSAnnotations();

	/**
	 * Returns the meta object for the container reference '{@link pcm.qosannotations.QoSAnnotations#getSystem_QoSAnnotations <em>System Qo SAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System Qo SAnnotations</em>'.
	 * @see pcm.qosannotations.QoSAnnotations#getSystem_QoSAnnotations()
	 * @see #getQoSAnnotations()
	 * @generated
	 */
	EReference getQoSAnnotations_System_QoSAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.qosannotations.QoSAnnotations#getSpecifiedQoSAnnotations_QoSAnnotations <em>Specified Qo SAnnotations Qo SAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specified Qo SAnnotations Qo SAnnotations</em>'.
	 * @see pcm.qosannotations.QoSAnnotations#getSpecifiedQoSAnnotations_QoSAnnotations()
	 * @see #getQoSAnnotations()
	 * @generated
	 */
	EReference getQoSAnnotations_SpecifiedQoSAnnotations_QoSAnnotations();

	/**
	 * Returns the meta object for class '{@link pcm.qosannotations.SpecifiedOutputParameterAbstraction <em>Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specified Output Parameter Abstraction</em>'.
	 * @see pcm.qosannotations.SpecifiedOutputParameterAbstraction
	 * @generated
	 */
	EClass getSpecifiedOutputParameterAbstraction();

	/**
	 * Returns the meta object for the reference '{@link pcm.qosannotations.SpecifiedOutputParameterAbstraction#getSignature_SpecifiedOutputParameterAbstraction <em>Signature Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature Specified Output Parameter Abstraction</em>'.
	 * @see pcm.qosannotations.SpecifiedOutputParameterAbstraction#getSignature_SpecifiedOutputParameterAbstraction()
	 * @see #getSpecifiedOutputParameterAbstraction()
	 * @generated
	 */
	EReference getSpecifiedOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction();

	/**
	 * Returns the meta object for the reference '{@link pcm.qosannotations.SpecifiedOutputParameterAbstraction#getRole_SpecifiedOutputParameterAbstraction <em>Role Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Specified Output Parameter Abstraction</em>'.
	 * @see pcm.qosannotations.SpecifiedOutputParameterAbstraction#getRole_SpecifiedOutputParameterAbstraction()
	 * @see #getSpecifiedOutputParameterAbstraction()
	 * @generated
	 */
	EReference getSpecifiedOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.qosannotations.SpecifiedOutputParameterAbstraction#getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction <em>Expected External Outputs Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expected External Outputs Specified Output Parameter Abstraction</em>'.
	 * @see pcm.qosannotations.SpecifiedOutputParameterAbstraction#getExpectedExternalOutputs_SpecifiedOutputParameterAbstraction()
	 * @see #getSpecifiedOutputParameterAbstraction()
	 * @generated
	 */
	EReference getSpecifiedOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction();

	/**
	 * Returns the meta object for the container reference '{@link pcm.qosannotations.SpecifiedOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction <em>Qos Annotations Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Qos Annotations Specified Output Parameter Abstraction</em>'.
	 * @see pcm.qosannotations.SpecifiedOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction()
	 * @see #getSpecifiedOutputParameterAbstraction()
	 * @generated
	 */
	EReference getSpecifiedOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QosannotationsFactory getQosannotationsFactory();

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
		 * The meta object literal for the '{@link pcm.qosannotations.impl.SpecifiedQoSAnnotationImpl <em>Specified Qo SAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.qosannotations.impl.SpecifiedQoSAnnotationImpl
		 * @see pcm.qosannotations.impl.QosannotationsPackageImpl#getSpecifiedQoSAnnotation()
		 * @generated
		 */
		EClass SPECIFIED_QO_SANNOTATION = eINSTANCE.getSpecifiedQoSAnnotation();

		/**
		 * The meta object literal for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION = eINSTANCE.getSpecifiedQoSAnnotation_Signature_SpecifiedQoSAnnation();

		/**
		 * The meta object literal for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION = eINSTANCE.getSpecifiedQoSAnnotation_Role_SpecifiedQoSAnnotation();

		/**
		 * The meta object literal for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = eINSTANCE.getSpecifiedQoSAnnotation_QosAnnotations_SpecifiedQoSAnnotation();

		/**
		 * The meta object literal for the '{@link pcm.qosannotations.impl.QoSAnnotationsImpl <em>Qo SAnnotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.qosannotations.impl.QoSAnnotationsImpl
		 * @see pcm.qosannotations.impl.QosannotationsPackageImpl#getQoSAnnotations()
		 * @generated
		 */
		EClass QO_SANNOTATIONS = eINSTANCE.getQoSAnnotations();

		/**
		 * The meta object literal for the '<em><b>Specified Output Parameter Abstractions Qo SAnnotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SANNOTATIONS__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTIONS_QO_SANNOTATIONS = eINSTANCE.getQoSAnnotations_SpecifiedOutputParameterAbstractions_QoSAnnotations();

		/**
		 * The meta object literal for the '<em><b>System Qo SAnnotations</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SANNOTATIONS__SYSTEM_QO_SANNOTATIONS = eINSTANCE.getQoSAnnotations_System_QoSAnnotations();

		/**
		 * The meta object literal for the '<em><b>Specified Qo SAnnotations Qo SAnnotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SANNOTATIONS__SPECIFIED_QO_SANNOTATIONS_QO_SANNOTATIONS = eINSTANCE.getQoSAnnotations_SpecifiedQoSAnnotations_QoSAnnotations();

		/**
		 * The meta object literal for the '{@link pcm.qosannotations.impl.SpecifiedOutputParameterAbstractionImpl <em>Specified Output Parameter Abstraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.qosannotations.impl.SpecifiedOutputParameterAbstractionImpl
		 * @see pcm.qosannotations.impl.QosannotationsPackageImpl#getSpecifiedOutputParameterAbstraction()
		 * @generated
		 */
		EClass SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getSpecifiedOutputParameterAbstraction();

		/**
		 * The meta object literal for the '<em><b>Signature Specified Output Parameter Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__SIGNATURE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getSpecifiedOutputParameterAbstraction_Signature_SpecifiedOutputParameterAbstraction();

		/**
		 * The meta object literal for the '<em><b>Role Specified Output Parameter Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__ROLE_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getSpecifiedOutputParameterAbstraction_Role_SpecifiedOutputParameterAbstraction();

		/**
		 * The meta object literal for the '<em><b>Expected External Outputs Specified Output Parameter Abstraction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__EXPECTED_EXTERNAL_OUTPUTS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getSpecifiedOutputParameterAbstraction_ExpectedExternalOutputs_SpecifiedOutputParameterAbstraction();

		/**
		 * The meta object literal for the '<em><b>Qos Annotations Specified Output Parameter Abstraction</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION__QOS_ANNOTATIONS_SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION = eINSTANCE.getSpecifiedOutputParameterAbstraction_QosAnnotations_SpecifiedOutputParameterAbstraction();

	}

} //QosannotationsPackage

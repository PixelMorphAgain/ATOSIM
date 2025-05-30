/**
 */
package pcm.qosannotations.qos_reliability;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pcm.qosannotations.QosannotationsPackage;

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
 * Reliability&nbsp;aspects&nbsp;of&nbsp;QoS&nbsp;annotations.
 * <!-- end-model-doc -->
 * @see pcm.qosannotations.qos_reliability.Qos_reliabilityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG'"
 * @generated
 */
public interface Qos_reliabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qos_reliability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/QoSAnnotations/QoS_Reliability/5.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qos_reliability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Qos_reliabilityPackage eINSTANCE = pcm.qosannotations.qos_reliability.impl.Qos_reliabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcm.qosannotations.qos_reliability.impl.SpecifiedReliabilityAnnotationImpl <em>Specified Reliability Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.qosannotations.qos_reliability.impl.SpecifiedReliabilityAnnotationImpl
	 * @see pcm.qosannotations.qos_reliability.impl.Qos_reliabilityPackageImpl#getSpecifiedReliabilityAnnotation()
	 * @generated
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION = QosannotationsPackage.SPECIFIED_QO_SANNOTATION__SIGNATURE_SPECIFIED_QO_SANNATION;

	/**
	 * The feature id for the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION = QosannotationsPackage.SPECIFIED_QO_SANNOTATION__ROLE_SPECIFIED_QO_SANNOTATION;

	/**
	 * The feature id for the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION = QosannotationsPackage.SPECIFIED_QO_SANNOTATION__QOS_ANNOTATIONS_SPECIFIED_QO_SANNOTATION;

	/**
	 * The feature id for the '<em><b>External Failure Occurrence Descriptions Specified Reliability Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION = QosannotationsPackage.SPECIFIED_QO_SANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specified Reliability Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION_FEATURE_COUNT = QosannotationsPackage.SPECIFIED_QO_SANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___ECLASS = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___EIS_PROXY = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___ERESOURCE = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___ECONTAINER = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___ECONTAINING_FEATURE = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___ECONTAINMENT_FEATURE = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___ECONTENTS = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___EALL_CONTENTS = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___ECROSS_REFERENCES = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___EGET__ESTRUCTURALFEATURE = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___EIS_SET__ESTRUCTURALFEATURE = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___EUNSET__ESTRUCTURALFEATURE = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION___EINVOKE__EOPERATION_ELIST = QosannotationsPackage.SPECIFIED_QO_SANNOTATION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Specified Reliability Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIED_RELIABILITY_ANNOTATION_OPERATION_COUNT = QosannotationsPackage.SPECIFIED_QO_SANNOTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation <em>Specified Reliability Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specified Reliability Annotation</em>'.
	 * @see pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation
	 * @generated
	 */
	EClass getSpecifiedReliabilityAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>'.
	 * @see pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()
	 * @see #getSpecifiedReliabilityAnnotation()
	 * @generated
	 */
	EReference getSpecifiedReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Qos_reliabilityFactory getQos_reliabilityFactory();

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
		 * The meta object literal for the '{@link pcm.qosannotations.qos_reliability.impl.SpecifiedReliabilityAnnotationImpl <em>Specified Reliability Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.qosannotations.qos_reliability.impl.SpecifiedReliabilityAnnotationImpl
		 * @see pcm.qosannotations.qos_reliability.impl.Qos_reliabilityPackageImpl#getSpecifiedReliabilityAnnotation()
		 * @generated
		 */
		EClass SPECIFIED_RELIABILITY_ANNOTATION = eINSTANCE.getSpecifiedReliabilityAnnotation();

		/**
		 * The meta object literal for the '<em><b>External Failure Occurrence Descriptions Specified Reliability Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION = eINSTANCE.getSpecifiedReliabilityAnnotation_ExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();

	}

} //Qos_reliabilityPackage

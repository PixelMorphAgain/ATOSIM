/**
 */
package pcm.qosannotations;

import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SAnnotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * QoSAnnotations allow software architects and performance analysts to annotate Quality of Service (QoS) attributes to services (i.e., signatures of an interface). It is important to note that these annotations are specified and not derived. Usually the PCM uses the internal specification of a components behaviour (i.e., its RD-SEFFs) to determine its QoS. However, in a mixed top down and bottom up approach as favoured by the PCM, software architects have to combine components whose internals are not yet known with fully specified components. QoSAnnotations provide a first perforamnce (or reliability) abstraction of the services offered by a component using the SpecifiedQoSAnnotation. They furthermore define the output parameters of the services without describing its internal behviour.
 * 
 * Notes:
 * - Should the association of QoSAnnotations to services not be in the class QoSAnnotation instead of SpecifiedQoSAnnotation and SpecifiedOutputParameterAbstraction separately?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.qosannotations.QoSAnnotations#getSpecifiedOutputParameterAbstractions_QoSAnnotations <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}</li>
 *   <li>{@link pcm.qosannotations.QoSAnnotations#getSystem_QoSAnnotations <em>System Qo SAnnotations</em>}</li>
 *   <li>{@link pcm.qosannotations.QoSAnnotations#getSpecifiedQoSAnnotations_QoSAnnotations <em>Specified Qo SAnnotations Qo SAnnotations</em>}</li>
 * </ul>
 *
 * @see pcm.qosannotations.QosannotationsPackage#getQoSAnnotations()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multipleReliabilityAnnotationsPerExternalCallNotAllowed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG multipleReliabilityAnnotationsPerExternalCallNotAllowed='self.specifiedQoSAnnotations_QoSAnnotations-&gt;select(oclIsTypeOf(pcm::qosannotations::qos_reliability::SpecifiedReliabilityAnnotation))-&gt;forAll( x, y | ( x&lt;&gt;y ) implies ( ( x.role_SpecifiedQoSAnnotation &lt;&gt; y.role_SpecifiedQoSAnnotation )  or ( x.signature_SpecifiedQoSAnnation &lt;&gt; y.signature_SpecifiedQoSAnnation ) ) )'"
 * @generated
 */
public interface QoSAnnotations extends Entity {
	/**
	 * Returns the value of the '<em><b>Specified Output Parameter Abstractions Qo SAnnotations</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.qosannotations.SpecifiedOutputParameterAbstraction}.
	 * It is bidirectional and its opposite is '{@link pcm.qosannotations.SpecifiedOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction <em>Qos Annotations Specified Output Parameter Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Output Parameter Abstractions Qo SAnnotations</em>' containment reference list.
	 * @see pcm.qosannotations.QosannotationsPackage#getQoSAnnotations_SpecifiedOutputParameterAbstractions_QoSAnnotations()
	 * @see pcm.qosannotations.SpecifiedOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction
	 * @model opposite="qosAnnotations_SpecifiedOutputParameterAbstraction" containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecifiedOutputParameterAbstraction> getSpecifiedOutputParameterAbstractions_QoSAnnotations();

	/**
	 * Returns the value of the '<em><b>System Qo SAnnotations</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.system.System#getQosAnnotations_System <em>Qos Annotations System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Qo SAnnotations</em>' container reference.
	 * @see #setSystem_QoSAnnotations(pcm.system.System)
	 * @see pcm.qosannotations.QosannotationsPackage#getQoSAnnotations_System_QoSAnnotations()
	 * @see pcm.system.System#getQosAnnotations_System
	 * @model opposite="qosAnnotations_System" required="true" transient="false" ordered="false"
	 * @generated
	 */
	pcm.system.System getSystem_QoSAnnotations();

	/**
	 * Sets the value of the '{@link pcm.qosannotations.QoSAnnotations#getSystem_QoSAnnotations <em>System Qo SAnnotations</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Qo SAnnotations</em>' container reference.
	 * @see #getSystem_QoSAnnotations()
	 * @generated
	 */
	void setSystem_QoSAnnotations(pcm.system.System value);

	/**
	 * Returns the value of the '<em><b>Specified Qo SAnnotations Qo SAnnotations</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.qosannotations.SpecifiedQoSAnnotation}.
	 * It is bidirectional and its opposite is '{@link pcm.qosannotations.SpecifiedQoSAnnotation#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Qo SAnnotations Qo SAnnotations</em>' containment reference list.
	 * @see pcm.qosannotations.QosannotationsPackage#getQoSAnnotations_SpecifiedQoSAnnotations_QoSAnnotations()
	 * @see pcm.qosannotations.SpecifiedQoSAnnotation#getQosAnnotations_SpecifiedQoSAnnotation
	 * @model opposite="qosAnnotations_SpecifiedQoSAnnotation" containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecifiedQoSAnnotation> getSpecifiedQoSAnnotations_QoSAnnotations();

} // QoSAnnotations

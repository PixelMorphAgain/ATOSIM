/**
 */
package pcm.qosannotations.qos_reliability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.qosannotations.impl.SpecifiedQoSAnnotationImpl;

import pcm.qosannotations.qos_reliability.Qos_reliabilityPackage;
import pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation;

import pcm.reliability.ExternalFailureOccurrenceDescription;
import pcm.reliability.ReliabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specified Reliability Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.qosannotations.qos_reliability.impl.SpecifiedReliabilityAnnotationImpl#getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecifiedReliabilityAnnotationImpl extends SpecifiedQoSAnnotationImpl implements SpecifiedReliabilityAnnotation {
	/**
	 * The cached value of the '{@link #getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation() <em>External Failure Occurrence Descriptions Specified Reliability Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalFailureOccurrenceDescription> externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecifiedReliabilityAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Qos_reliabilityPackage.Literals.SPECIFIED_RELIABILITY_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalFailureOccurrenceDescription> getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation() {
		if (externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation == null) {
			externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation = new EObjectContainmentWithInverseEList<ExternalFailureOccurrenceDescription>(ExternalFailureOccurrenceDescription.class, this, Qos_reliabilityPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION, ReliabilityPackage.EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION__SPECIFIED_RELIABILITY_ANNOTATION_EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTION);
		}
		return externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qos_reliabilityPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Qos_reliabilityPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
				return ((InternalEList<?>)getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Qos_reliabilityPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
				return getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Qos_reliabilityPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
				getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation().clear();
				getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation().addAll((Collection<? extends ExternalFailureOccurrenceDescription>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Qos_reliabilityPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
				getExternalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Qos_reliabilityPackage.SPECIFIED_RELIABILITY_ANNOTATION__EXTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_SPECIFIED_RELIABILITY_ANNOTATION:
				return externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation != null && !externalFailureOccurrenceDescriptions__SpecifiedReliabilityAnnotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecifiedReliabilityAnnotationImpl

/**
 */
package pcm.qosannotations.qos_reliability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcm.qosannotations.qos_reliability.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Qos_reliabilityFactoryImpl extends EFactoryImpl implements Qos_reliabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Qos_reliabilityFactory init() {
		try {
			Qos_reliabilityFactory theQos_reliabilityFactory = (Qos_reliabilityFactory)EPackage.Registry.INSTANCE.getEFactory(Qos_reliabilityPackage.eNS_URI);
			if (theQos_reliabilityFactory != null) {
				return theQos_reliabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Qos_reliabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qos_reliabilityFactoryImpl() {
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
			case Qos_reliabilityPackage.SPECIFIED_RELIABILITY_ANNOTATION: return createSpecifiedReliabilityAnnotation();
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
	public SpecifiedReliabilityAnnotation createSpecifiedReliabilityAnnotation() {
		SpecifiedReliabilityAnnotationImpl specifiedReliabilityAnnotation = new SpecifiedReliabilityAnnotationImpl();
		return specifiedReliabilityAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qos_reliabilityPackage getQos_reliabilityPackage() {
		return (Qos_reliabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Qos_reliabilityPackage getPackage() {
		return Qos_reliabilityPackage.eINSTANCE;
	}

} //Qos_reliabilityFactoryImpl

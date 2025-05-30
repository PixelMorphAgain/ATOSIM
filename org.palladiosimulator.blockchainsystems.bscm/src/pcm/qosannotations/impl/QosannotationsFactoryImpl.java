/**
 */
package pcm.qosannotations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcm.qosannotations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QosannotationsFactoryImpl extends EFactoryImpl implements QosannotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QosannotationsFactory init() {
		try {
			QosannotationsFactory theQosannotationsFactory = (QosannotationsFactory)EPackage.Registry.INSTANCE.getEFactory(QosannotationsPackage.eNS_URI);
			if (theQosannotationsFactory != null) {
				return theQosannotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QosannotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QosannotationsFactoryImpl() {
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
			case QosannotationsPackage.QO_SANNOTATIONS: return createQoSAnnotations();
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
	public QoSAnnotations createQoSAnnotations() {
		QoSAnnotationsImpl qoSAnnotations = new QoSAnnotationsImpl();
		return qoSAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QosannotationsPackage getQosannotationsPackage() {
		return (QosannotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QosannotationsPackage getPackage() {
		return QosannotationsPackage.eINSTANCE;
	}

} //QosannotationsFactoryImpl

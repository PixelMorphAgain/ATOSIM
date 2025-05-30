/**
 */
package pcm.qosannotations.qos_performance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcm.qosannotations.qos_performance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Qos_performanceFactoryImpl extends EFactoryImpl implements Qos_performanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Qos_performanceFactory init() {
		try {
			Qos_performanceFactory theQos_performanceFactory = (Qos_performanceFactory)EPackage.Registry.INSTANCE.getEFactory(Qos_performancePackage.eNS_URI);
			if (theQos_performanceFactory != null) {
				return theQos_performanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Qos_performanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qos_performanceFactoryImpl() {
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
			case Qos_performancePackage.SYSTEM_SPECIFIED_EXECUTION_TIME: return createSystemSpecifiedExecutionTime();
			case Qos_performancePackage.COMPONENT_SPECIFIED_EXECUTION_TIME: return createComponentSpecifiedExecutionTime();
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
	public SystemSpecifiedExecutionTime createSystemSpecifiedExecutionTime() {
		SystemSpecifiedExecutionTimeImpl systemSpecifiedExecutionTime = new SystemSpecifiedExecutionTimeImpl();
		return systemSpecifiedExecutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSpecifiedExecutionTime createComponentSpecifiedExecutionTime() {
		ComponentSpecifiedExecutionTimeImpl componentSpecifiedExecutionTime = new ComponentSpecifiedExecutionTimeImpl();
		return componentSpecifiedExecutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qos_performancePackage getQos_performancePackage() {
		return (Qos_performancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Qos_performancePackage getPackage() {
		return Qos_performancePackage.eINSTANCE;
	}

} //Qos_performanceFactoryImpl

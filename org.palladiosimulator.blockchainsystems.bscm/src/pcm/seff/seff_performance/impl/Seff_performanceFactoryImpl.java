/**
 */
package pcm.seff.seff_performance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcm.seff.seff_performance.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Seff_performanceFactoryImpl extends EFactoryImpl implements Seff_performanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Seff_performanceFactory init() {
		try {
			Seff_performanceFactory theSeff_performanceFactory = (Seff_performanceFactory)EPackage.Registry.INSTANCE.getEFactory(Seff_performancePackage.eNS_URI);
			if (theSeff_performanceFactory != null) {
				return theSeff_performanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Seff_performanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seff_performanceFactoryImpl() {
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
			case Seff_performancePackage.INFRASTRUCTURE_CALL: return createInfrastructureCall();
			case Seff_performancePackage.RESOURCE_CALL: return createResourceCall();
			case Seff_performancePackage.PARAMETRIC_RESOURCE_DEMAND: return createParametricResourceDemand();
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
	public InfrastructureCall createInfrastructureCall() {
		InfrastructureCallImpl infrastructureCall = new InfrastructureCallImpl();
		return infrastructureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCall createResourceCall() {
		ResourceCallImpl resourceCall = new ResourceCallImpl();
		return resourceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametricResourceDemand createParametricResourceDemand() {
		ParametricResourceDemandImpl parametricResourceDemand = new ParametricResourceDemandImpl();
		return parametricResourceDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Seff_performancePackage getSeff_performancePackage() {
		return (Seff_performancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Seff_performancePackage getPackage() {
		return Seff_performancePackage.eINSTANCE;
	}

} //Seff_performanceFactoryImpl

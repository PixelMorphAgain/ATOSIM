/**
 */
package pcm.seff.seff_reliability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcm.seff.seff_reliability.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Seff_reliabilityFactoryImpl extends EFactoryImpl implements Seff_reliabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Seff_reliabilityFactory init() {
		try {
			Seff_reliabilityFactory theSeff_reliabilityFactory = (Seff_reliabilityFactory)EPackage.Registry.INSTANCE.getEFactory(Seff_reliabilityPackage.eNS_URI);
			if (theSeff_reliabilityFactory != null) {
				return theSeff_reliabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Seff_reliabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seff_reliabilityFactoryImpl() {
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
			case Seff_reliabilityPackage.RECOVERY_ACTION_BEHAVIOUR: return createRecoveryActionBehaviour();
			case Seff_reliabilityPackage.RECOVERY_ACTION: return createRecoveryAction();
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
	public RecoveryActionBehaviour createRecoveryActionBehaviour() {
		RecoveryActionBehaviourImpl recoveryActionBehaviour = new RecoveryActionBehaviourImpl();
		return recoveryActionBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecoveryAction createRecoveryAction() {
		RecoveryActionImpl recoveryAction = new RecoveryActionImpl();
		return recoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Seff_reliabilityPackage getSeff_reliabilityPackage() {
		return (Seff_reliabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Seff_reliabilityPackage getPackage() {
		return Seff_reliabilityPackage.eINSTANCE;
	}

} //Seff_reliabilityFactoryImpl

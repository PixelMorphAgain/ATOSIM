/**
 */
package pcm.usagemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcm.core.CorePackage;
import pcm.core.PCMRandomVariable;

import pcm.usagemodel.ClosedWorkload;
import pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Closed Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.usagemodel.impl.ClosedWorkloadImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link pcm.usagemodel.impl.ClosedWorkloadImpl#getThinkTime_ClosedWorkload <em>Think Time Closed Workload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClosedWorkloadImpl extends WorkloadImpl implements ClosedWorkload {
	/**
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final int POPULATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected int population = POPULATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThinkTime_ClosedWorkload() <em>Think Time Closed Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime_ClosedWorkload()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable thinkTime_ClosedWorkload;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosedWorkloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsagemodelPackage.Literals.CLOSED_WORKLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPopulation(int newPopulation) {
		int oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagemodelPackage.CLOSED_WORKLOAD__POPULATION, oldPopulation, population));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMRandomVariable getThinkTime_ClosedWorkload() {
		return thinkTime_ClosedWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThinkTime_ClosedWorkload(PCMRandomVariable newThinkTime_ClosedWorkload, NotificationChain msgs) {
		PCMRandomVariable oldThinkTime_ClosedWorkload = thinkTime_ClosedWorkload;
		thinkTime_ClosedWorkload = newThinkTime_ClosedWorkload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsagemodelPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD, oldThinkTime_ClosedWorkload, newThinkTime_ClosedWorkload);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinkTime_ClosedWorkload(PCMRandomVariable newThinkTime_ClosedWorkload) {
		if (newThinkTime_ClosedWorkload != thinkTime_ClosedWorkload) {
			NotificationChain msgs = null;
			if (thinkTime_ClosedWorkload != null)
				msgs = ((InternalEObject)thinkTime_ClosedWorkload).eInverseRemove(this, CorePackage.PCM_RANDOM_VARIABLE__CLOSED_WORKLOAD_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
			if (newThinkTime_ClosedWorkload != null)
				msgs = ((InternalEObject)newThinkTime_ClosedWorkload).eInverseAdd(this, CorePackage.PCM_RANDOM_VARIABLE__CLOSED_WORKLOAD_PCM_RANDOM_VARIABLE, PCMRandomVariable.class, msgs);
			msgs = basicSetThinkTime_ClosedWorkload(newThinkTime_ClosedWorkload, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagemodelPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD, newThinkTime_ClosedWorkload, newThinkTime_ClosedWorkload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsagemodelPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
				if (thinkTime_ClosedWorkload != null)
					msgs = ((InternalEObject)thinkTime_ClosedWorkload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsagemodelPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD, null, msgs);
				return basicSetThinkTime_ClosedWorkload((PCMRandomVariable)otherEnd, msgs);
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
			case UsagemodelPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
				return basicSetThinkTime_ClosedWorkload(null, msgs);
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
			case UsagemodelPackage.CLOSED_WORKLOAD__POPULATION:
				return getPopulation();
			case UsagemodelPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
				return getThinkTime_ClosedWorkload();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsagemodelPackage.CLOSED_WORKLOAD__POPULATION:
				setPopulation((Integer)newValue);
				return;
			case UsagemodelPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
				setThinkTime_ClosedWorkload((PCMRandomVariable)newValue);
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
			case UsagemodelPackage.CLOSED_WORKLOAD__POPULATION:
				setPopulation(POPULATION_EDEFAULT);
				return;
			case UsagemodelPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
				setThinkTime_ClosedWorkload((PCMRandomVariable)null);
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
			case UsagemodelPackage.CLOSED_WORKLOAD__POPULATION:
				return population != POPULATION_EDEFAULT;
			case UsagemodelPackage.CLOSED_WORKLOAD__THINK_TIME_CLOSED_WORKLOAD:
				return thinkTime_ClosedWorkload != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (population: ");
		result.append(population);
		result.append(')');
		return result.toString();
	}

} //ClosedWorkloadImpl

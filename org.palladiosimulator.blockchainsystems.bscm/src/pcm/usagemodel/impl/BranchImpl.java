/**
 */
package pcm.usagemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.usagemodel.Branch;
import pcm.usagemodel.BranchTransition;
import pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.usagemodel.impl.BranchImpl#getBranchTransitions_Branch <em>Branch Transitions Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchImpl extends AbstractUserActionImpl implements Branch {
	/**
	 * The cached value of the '{@link #getBranchTransitions_Branch() <em>Branch Transitions Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchTransitions_Branch()
	 * @generated
	 * @ordered
	 */
	protected EList<BranchTransition> branchTransitions_Branch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsagemodelPackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BranchTransition> getBranchTransitions_Branch() {
		if (branchTransitions_Branch == null) {
			branchTransitions_Branch = new EObjectContainmentWithInverseEList<BranchTransition>(BranchTransition.class, this, UsagemodelPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH, UsagemodelPackage.BRANCH_TRANSITION__BRANCH_BRANCH_TRANSITION);
		}
		return branchTransitions_Branch;
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
			case UsagemodelPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBranchTransitions_Branch()).basicAdd(otherEnd, msgs);
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
			case UsagemodelPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
				return ((InternalEList<?>)getBranchTransitions_Branch()).basicRemove(otherEnd, msgs);
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
			case UsagemodelPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
				return getBranchTransitions_Branch();
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
			case UsagemodelPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
				getBranchTransitions_Branch().clear();
				getBranchTransitions_Branch().addAll((Collection<? extends BranchTransition>)newValue);
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
			case UsagemodelPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
				getBranchTransitions_Branch().clear();
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
			case UsagemodelPackage.BRANCH__BRANCH_TRANSITIONS_BRANCH:
				return branchTransitions_Branch != null && !branchTransitions_Branch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BranchImpl

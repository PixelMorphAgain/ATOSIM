/**
 */
package pcm.seff.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.parameter.ParameterPackage;
import pcm.parameter.VariableUsage;

import pcm.seff.SeffPackage;
import pcm.seff.SetVariableAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Variable Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.impl.SetVariableActionImpl#getLocalVariableUsages_SetVariableAction <em>Local Variable Usages Set Variable Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetVariableActionImpl extends AbstractInternalControlFlowActionImpl implements SetVariableAction {
	/**
	 * The cached value of the '{@link #getLocalVariableUsages_SetVariableAction() <em>Local Variable Usages Set Variable Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariableUsages_SetVariableAction()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableUsage> localVariableUsages_SetVariableAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetVariableActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.SET_VARIABLE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableUsage> getLocalVariableUsages_SetVariableAction() {
		if (localVariableUsages_SetVariableAction == null) {
			localVariableUsages_SetVariableAction = new EObjectContainmentWithInverseEList<VariableUsage>(VariableUsage.class, this, SeffPackage.SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION, ParameterPackage.VARIABLE_USAGE__SET_VARIABLE_ACTION_VARIABLE_USAGE);
		}
		return localVariableUsages_SetVariableAction;
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
			case SeffPackage.SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocalVariableUsages_SetVariableAction()).basicAdd(otherEnd, msgs);
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
			case SeffPackage.SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION:
				return ((InternalEList<?>)getLocalVariableUsages_SetVariableAction()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION:
				return getLocalVariableUsages_SetVariableAction();
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
			case SeffPackage.SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION:
				getLocalVariableUsages_SetVariableAction().clear();
				getLocalVariableUsages_SetVariableAction().addAll((Collection<? extends VariableUsage>)newValue);
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
			case SeffPackage.SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION:
				getLocalVariableUsages_SetVariableAction().clear();
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
			case SeffPackage.SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION:
				return localVariableUsages_SetVariableAction != null && !localVariableUsages_SetVariableAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SetVariableActionImpl

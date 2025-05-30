/**
 */
package pcm.repository.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pcm.repository.CompleteComponentType;
import pcm.repository.ProvidesComponentType;
import pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.impl.CompleteComponentTypeImpl#getParentProvidesComponentTypes <em>Parent Provides Component Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompleteComponentTypeImpl extends RepositoryComponentImpl implements CompleteComponentType {
	/**
	 * The cached value of the '{@link #getParentProvidesComponentTypes() <em>Parent Provides Component Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProvidesComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidesComponentType> parentProvidesComponentTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.COMPLETE_COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProvidesComponentType> getParentProvidesComponentTypes() {
		if (parentProvidesComponentTypes == null) {
			parentProvidesComponentTypes = new EObjectResolvingEList<ProvidesComponentType>(ProvidesComponentType.class, this, RepositoryPackage.COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES);
		}
		return parentProvidesComponentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES:
				return getParentProvidesComponentTypes();
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
			case RepositoryPackage.COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES:
				getParentProvidesComponentTypes().clear();
				getParentProvidesComponentTypes().addAll((Collection<? extends ProvidesComponentType>)newValue);
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
			case RepositoryPackage.COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES:
				getParentProvidesComponentTypes().clear();
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
			case RepositoryPackage.COMPLETE_COMPONENT_TYPE__PARENT_PROVIDES_COMPONENT_TYPES:
				return parentProvidesComponentTypes != null && !parentProvidesComponentTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompleteComponentTypeImpl

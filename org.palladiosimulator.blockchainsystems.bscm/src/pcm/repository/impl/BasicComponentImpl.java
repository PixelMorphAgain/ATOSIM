/**
 */
package pcm.repository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.repository.BasicComponent;
import pcm.repository.PassiveResource;
import pcm.repository.RepositoryPackage;

import pcm.seff.SeffPackage;
import pcm.seff.ServiceEffectSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.impl.BasicComponentImpl#getServiceEffectSpecifications__BasicComponent <em>Service Effect Specifications Basic Component</em>}</li>
 *   <li>{@link pcm.repository.impl.BasicComponentImpl#getPassiveResource_BasicComponent <em>Passive Resource Basic Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicComponentImpl extends ImplementationComponentTypeImpl implements BasicComponent {
	/**
	 * The cached value of the '{@link #getServiceEffectSpecifications__BasicComponent() <em>Service Effect Specifications Basic Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceEffectSpecifications__BasicComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceEffectSpecification> serviceEffectSpecifications__BasicComponent;

	/**
	 * The cached value of the '{@link #getPassiveResource_BasicComponent() <em>Passive Resource Basic Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveResource_BasicComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<PassiveResource> passiveResource_BasicComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.BASIC_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceEffectSpecification> getServiceEffectSpecifications__BasicComponent() {
		if (serviceEffectSpecifications__BasicComponent == null) {
			serviceEffectSpecifications__BasicComponent = new EObjectContainmentWithInverseEList<ServiceEffectSpecification>(ServiceEffectSpecification.class, this, RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT, SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION);
		}
		return serviceEffectSpecifications__BasicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PassiveResource> getPassiveResource_BasicComponent() {
		if (passiveResource_BasicComponent == null) {
			passiveResource_BasicComponent = new EObjectContainmentWithInverseEList<PassiveResource>(PassiveResource.class, this, RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT, RepositoryPackage.PASSIVE_RESOURCE__BASIC_COMPONENT_PASSIVE_RESOURCE);
		}
		return passiveResource_BasicComponent;
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
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceEffectSpecifications__BasicComponent()).basicAdd(otherEnd, msgs);
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassiveResource_BasicComponent()).basicAdd(otherEnd, msgs);
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
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				return ((InternalEList<?>)getServiceEffectSpecifications__BasicComponent()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				return ((InternalEList<?>)getPassiveResource_BasicComponent()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				return getServiceEffectSpecifications__BasicComponent();
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				return getPassiveResource_BasicComponent();
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
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				getServiceEffectSpecifications__BasicComponent().clear();
				getServiceEffectSpecifications__BasicComponent().addAll((Collection<? extends ServiceEffectSpecification>)newValue);
				return;
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				getPassiveResource_BasicComponent().clear();
				getPassiveResource_BasicComponent().addAll((Collection<? extends PassiveResource>)newValue);
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
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				getServiceEffectSpecifications__BasicComponent().clear();
				return;
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				getPassiveResource_BasicComponent().clear();
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
			case RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT:
				return serviceEffectSpecifications__BasicComponent != null && !serviceEffectSpecifications__BasicComponent.isEmpty();
			case RepositoryPackage.BASIC_COMPONENT__PASSIVE_RESOURCE_BASIC_COMPONENT:
				return passiveResource_BasicComponent != null && !passiveResource_BasicComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicComponentImpl

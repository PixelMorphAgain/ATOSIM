/**
 */
package pcm.repository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.core.entity.impl.ComposedProvidingRequiringEntityImpl;

import pcm.parameter.VariableUsage;

import pcm.repository.CompleteComponentType;
import pcm.repository.ComponentType;
import pcm.repository.CompositeComponent;
import pcm.repository.ImplementationComponentType;
import pcm.repository.Repository;
import pcm.repository.RepositoryComponent;
import pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.impl.CompositeComponentImpl#getRepository__RepositoryComponent <em>Repository Repository Component</em>}</li>
 *   <li>{@link pcm.repository.impl.CompositeComponentImpl#getParentCompleteComponentTypes <em>Parent Complete Component Types</em>}</li>
 *   <li>{@link pcm.repository.impl.CompositeComponentImpl#getComponentParameterUsage_ImplementationComponentType <em>Component Parameter Usage Implementation Component Type</em>}</li>
 *   <li>{@link pcm.repository.impl.CompositeComponentImpl#getComponentType <em>Component Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeComponentImpl extends ComposedProvidingRequiringEntityImpl implements CompositeComponent {
	/**
	 * The cached value of the '{@link #getParentCompleteComponentTypes() <em>Parent Complete Component Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCompleteComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CompleteComponentType> parentCompleteComponentTypes;

	/**
	 * The cached value of the '{@link #getComponentParameterUsage_ImplementationComponentType() <em>Component Parameter Usage Implementation Component Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentParameterUsage_ImplementationComponentType()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableUsage> componentParameterUsage_ImplementationComponentType;

	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentType COMPONENT_TYPE_EDEFAULT = ComponentType.BUSINESS_COMPONENT;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType componentType = COMPONENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.COMPOSITE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository getRepository__RepositoryComponent() {
		if (eContainerFeatureID() != RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT) return null;
		return (Repository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository__RepositoryComponent(Repository newRepository__RepositoryComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository__RepositoryComponent, RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepository__RepositoryComponent(Repository newRepository__RepositoryComponent) {
		if (newRepository__RepositoryComponent != eInternalContainer() || (eContainerFeatureID() != RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT && newRepository__RepositoryComponent != null)) {
			if (EcoreUtil.isAncestor(this, newRepository__RepositoryComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository__RepositoryComponent != null)
				msgs = ((InternalEObject)newRepository__RepositoryComponent).eInverseAdd(this, RepositoryPackage.REPOSITORY__COMPONENTS_REPOSITORY, Repository.class, msgs);
			msgs = basicSetRepository__RepositoryComponent(newRepository__RepositoryComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT, newRepository__RepositoryComponent, newRepository__RepositoryComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompleteComponentType> getParentCompleteComponentTypes() {
		if (parentCompleteComponentTypes == null) {
			parentCompleteComponentTypes = new EObjectResolvingEList<CompleteComponentType>(CompleteComponentType.class, this, RepositoryPackage.COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES);
		}
		return parentCompleteComponentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableUsage> getComponentParameterUsage_ImplementationComponentType() {
		if (componentParameterUsage_ImplementationComponentType == null) {
			componentParameterUsage_ImplementationComponentType = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE);
		}
		return componentParameterUsage_ImplementationComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentType getComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentType(ComponentType newComponentType) {
		ComponentType oldComponentType = componentType;
		componentType = newComponentType == null ? COMPONENT_TYPE_EDEFAULT : newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository__RepositoryComponent((Repository)otherEnd, msgs);
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
			case RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT:
				return basicSetRepository__RepositoryComponent(null, msgs);
			case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
				return ((InternalEList<?>)getComponentParameterUsage_ImplementationComponentType()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT:
				return eInternalContainer().eInverseRemove(this, RepositoryPackage.REPOSITORY__COMPONENTS_REPOSITORY, Repository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT:
				return getRepository__RepositoryComponent();
			case RepositoryPackage.COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES:
				return getParentCompleteComponentTypes();
			case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
				return getComponentParameterUsage_ImplementationComponentType();
			case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_TYPE:
				return getComponentType();
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
			case RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT:
				setRepository__RepositoryComponent((Repository)newValue);
				return;
			case RepositoryPackage.COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES:
				getParentCompleteComponentTypes().clear();
				getParentCompleteComponentTypes().addAll((Collection<? extends CompleteComponentType>)newValue);
				return;
			case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
				getComponentParameterUsage_ImplementationComponentType().clear();
				getComponentParameterUsage_ImplementationComponentType().addAll((Collection<? extends VariableUsage>)newValue);
				return;
			case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_TYPE:
				setComponentType((ComponentType)newValue);
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
			case RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT:
				setRepository__RepositoryComponent((Repository)null);
				return;
			case RepositoryPackage.COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES:
				getParentCompleteComponentTypes().clear();
				return;
			case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
				getComponentParameterUsage_ImplementationComponentType().clear();
				return;
			case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_TYPE:
				setComponentType(COMPONENT_TYPE_EDEFAULT);
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
			case RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT:
				return getRepository__RepositoryComponent() != null;
			case RepositoryPackage.COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES:
				return parentCompleteComponentTypes != null && !parentCompleteComponentTypes.isEmpty();
			case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE:
				return componentParameterUsage_ImplementationComponentType != null && !componentParameterUsage_ImplementationComponentType.isEmpty();
			case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_TYPE:
				return componentType != COMPONENT_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RepositoryComponent.class) {
			switch (derivedFeatureID) {
				case RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT: return RepositoryPackage.REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;
				default: return -1;
			}
		}
		if (baseClass == ImplementationComponentType.class) {
			switch (derivedFeatureID) {
				case RepositoryPackage.COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES: return RepositoryPackage.IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES;
				case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE: return RepositoryPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE;
				case RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_TYPE: return RepositoryPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RepositoryComponent.class) {
			switch (baseFeatureID) {
				case RepositoryPackage.REPOSITORY_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT: return RepositoryPackage.COMPOSITE_COMPONENT__REPOSITORY_REPOSITORY_COMPONENT;
				default: return -1;
			}
		}
		if (baseClass == ImplementationComponentType.class) {
			switch (baseFeatureID) {
				case RepositoryPackage.IMPLEMENTATION_COMPONENT_TYPE__PARENT_COMPLETE_COMPONENT_TYPES: return RepositoryPackage.COMPOSITE_COMPONENT__PARENT_COMPLETE_COMPONENT_TYPES;
				case RepositoryPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE: return RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_PARAMETER_USAGE_IMPLEMENTATION_COMPONENT_TYPE;
				case RepositoryPackage.IMPLEMENTATION_COMPONENT_TYPE__COMPONENT_TYPE: return RepositoryPackage.COMPOSITE_COMPONENT__COMPONENT_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (componentType: ");
		result.append(componentType);
		result.append(')');
		return result.toString();
	}

} //CompositeComponentImpl

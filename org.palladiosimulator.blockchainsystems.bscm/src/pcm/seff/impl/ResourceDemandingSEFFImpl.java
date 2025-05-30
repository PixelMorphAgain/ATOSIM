/**
 */
package pcm.seff.impl;

import ecore.EObject;
import ecore.EcorePackage;

import identifier.impl.IdentifierImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.PCMBaseClass;
import pcm.PCMClass;

import pcm.repository.BasicComponent;
import pcm.repository.RepositoryPackage;
import pcm.repository.Signature;

import pcm.seff.AbstractAction;
import pcm.seff.AbstractBranchTransition;
import pcm.seff.AbstractLoopAction;
import pcm.seff.ResourceDemandingBehaviour;
import pcm.seff.ResourceDemandingInternalBehaviour;
import pcm.seff.ResourceDemandingSEFF;
import pcm.seff.SeffPackage;
import pcm.seff.ServiceEffectSpecification;

import pcm.seff.util.SeffValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Demanding SEFF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.seff.impl.ResourceDemandingSEFFImpl#getSeffTypeID <em>Seff Type ID</em>}</li>
 *   <li>{@link pcm.seff.impl.ResourceDemandingSEFFImpl#getDescribedService__SEFF <em>Described Service SEFF</em>}</li>
 *   <li>{@link pcm.seff.impl.ResourceDemandingSEFFImpl#getBasicComponent_ServiceEffectSpecification <em>Basic Component Service Effect Specification</em>}</li>
 *   <li>{@link pcm.seff.impl.ResourceDemandingSEFFImpl#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}</li>
 *   <li>{@link pcm.seff.impl.ResourceDemandingSEFFImpl#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}</li>
 *   <li>{@link pcm.seff.impl.ResourceDemandingSEFFImpl#getSteps_Behaviour <em>Steps Behaviour</em>}</li>
 *   <li>{@link pcm.seff.impl.ResourceDemandingSEFFImpl#getResourceDemandingInternalBehaviours <em>Resource Demanding Internal Behaviours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceDemandingSEFFImpl extends IdentifierImpl implements ResourceDemandingSEFF {
	/**
	 * The default value of the '{@link #getSeffTypeID() <em>Seff Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeffTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final String SEFF_TYPE_ID_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getSeffTypeID() <em>Seff Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeffTypeID()
	 * @generated
	 * @ordered
	 */
	protected String seffTypeID = SEFF_TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescribedService__SEFF() <em>Described Service SEFF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedService__SEFF()
	 * @generated
	 * @ordered
	 */
	protected Signature describedService__SEFF;

	/**
	 * The cached value of the '{@link #getSteps_Behaviour() <em>Steps Behaviour</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps_Behaviour()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAction> steps_Behaviour;

	/**
	 * The cached value of the '{@link #getResourceDemandingInternalBehaviours() <em>Resource Demanding Internal Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDemandingInternalBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceDemandingInternalBehaviour> resourceDemandingInternalBehaviours;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDemandingSEFFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeffPackage.Literals.RESOURCE_DEMANDING_SEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeffTypeID() {
		return seffTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeffTypeID(String newSeffTypeID) {
		String oldSeffTypeID = seffTypeID;
		seffTypeID = newSeffTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID, oldSeffTypeID, seffTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getDescribedService__SEFF() {
		if (describedService__SEFF != null && describedService__SEFF.eIsProxy()) {
			InternalEObject oldDescribedService__SEFF = (InternalEObject)describedService__SEFF;
			describedService__SEFF = (Signature)eResolveProxy(oldDescribedService__SEFF);
			if (describedService__SEFF != oldDescribedService__SEFF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF, oldDescribedService__SEFF, describedService__SEFF));
			}
		}
		return describedService__SEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetDescribedService__SEFF() {
		return describedService__SEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescribedService__SEFF(Signature newDescribedService__SEFF) {
		Signature oldDescribedService__SEFF = describedService__SEFF;
		describedService__SEFF = newDescribedService__SEFF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF, oldDescribedService__SEFF, describedService__SEFF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicComponent getBasicComponent_ServiceEffectSpecification() {
		if (eContainerFeatureID() != SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION) return null;
		return (BasicComponent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicComponent_ServiceEffectSpecification(BasicComponent newBasicComponent_ServiceEffectSpecification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBasicComponent_ServiceEffectSpecification, SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasicComponent_ServiceEffectSpecification(BasicComponent newBasicComponent_ServiceEffectSpecification) {
		if (newBasicComponent_ServiceEffectSpecification != eInternalContainer() || (eContainerFeatureID() != SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION && newBasicComponent_ServiceEffectSpecification != null)) {
			if (EcoreUtil.isAncestor(this, newBasicComponent_ServiceEffectSpecification))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBasicComponent_ServiceEffectSpecification != null)
				msgs = ((InternalEObject)newBasicComponent_ServiceEffectSpecification).eInverseAdd(this, RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT, BasicComponent.class, msgs);
			msgs = basicSetBasicComponent_ServiceEffectSpecification(newBasicComponent_ServiceEffectSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION, newBasicComponent_ServiceEffectSpecification, newBasicComponent_ServiceEffectSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractLoopAction getAbstractLoopAction_ResourceDemandingBehaviour() {
		if (eContainerFeatureID() != SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR) return null;
		return (AbstractLoopAction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction newAbstractLoopAction_ResourceDemandingBehaviour, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAbstractLoopAction_ResourceDemandingBehaviour, SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractLoopAction_ResourceDemandingBehaviour(AbstractLoopAction newAbstractLoopAction_ResourceDemandingBehaviour) {
		if (newAbstractLoopAction_ResourceDemandingBehaviour != eInternalContainer() || (eContainerFeatureID() != SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR && newAbstractLoopAction_ResourceDemandingBehaviour != null)) {
			if (EcoreUtil.isAncestor(this, newAbstractLoopAction_ResourceDemandingBehaviour))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstractLoopAction_ResourceDemandingBehaviour != null)
				msgs = ((InternalEObject)newAbstractLoopAction_ResourceDemandingBehaviour).eInverseAdd(this, SeffPackage.ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP, AbstractLoopAction.class, msgs);
			msgs = basicSetAbstractLoopAction_ResourceDemandingBehaviour(newAbstractLoopAction_ResourceDemandingBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR, newAbstractLoopAction_ResourceDemandingBehaviour, newAbstractLoopAction_ResourceDemandingBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractBranchTransition getAbstractBranchTransition_ResourceDemandingBehaviour() {
		if (eContainerFeatureID() != SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR) return null;
		return (AbstractBranchTransition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition newAbstractBranchTransition_ResourceDemandingBehaviour, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAbstractBranchTransition_ResourceDemandingBehaviour, SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractBranchTransition_ResourceDemandingBehaviour(AbstractBranchTransition newAbstractBranchTransition_ResourceDemandingBehaviour) {
		if (newAbstractBranchTransition_ResourceDemandingBehaviour != eInternalContainer() || (eContainerFeatureID() != SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR && newAbstractBranchTransition_ResourceDemandingBehaviour != null)) {
			if (EcoreUtil.isAncestor(this, newAbstractBranchTransition_ResourceDemandingBehaviour))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstractBranchTransition_ResourceDemandingBehaviour != null)
				msgs = ((InternalEObject)newAbstractBranchTransition_ResourceDemandingBehaviour).eInverseAdd(this, SeffPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION, AbstractBranchTransition.class, msgs);
			msgs = basicSetAbstractBranchTransition_ResourceDemandingBehaviour(newAbstractBranchTransition_ResourceDemandingBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR, newAbstractBranchTransition_ResourceDemandingBehaviour, newAbstractBranchTransition_ResourceDemandingBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractAction> getSteps_Behaviour() {
		if (steps_Behaviour == null) {
			steps_Behaviour = new EObjectContainmentWithInverseEList<AbstractAction>(AbstractAction.class, this, SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR, SeffPackage.ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION);
		}
		return steps_Behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceDemandingInternalBehaviour> getResourceDemandingInternalBehaviours() {
		if (resourceDemandingInternalBehaviours == null) {
			resourceDemandingInternalBehaviours = new EObjectContainmentWithInverseEList<ResourceDemandingInternalBehaviour>(ResourceDemandingInternalBehaviour.class, this, SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS, SeffPackage.RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR__RESOURCE_DEMANDING_SEFF_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR);
		}
		return resourceDemandingInternalBehaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean startActionNeedsRouteToStopAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SeffValidator.DIAGNOSTIC_SOURCE,
						 SeffValidator.RESOURCE_DEMANDING_BEHAVIOUR__START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "startActionNeedsRouteToStopAction", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBasicComponent_ServiceEffectSpecification((BasicComponent)otherEnd, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)otherEnd, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)otherEnd, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps_Behaviour()).basicAdd(otherEnd, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceDemandingInternalBehaviours()).basicAdd(otherEnd, msgs);
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
				return basicSetBasicComponent_ServiceEffectSpecification(null, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				return basicSetAbstractLoopAction_ResourceDemandingBehaviour(null, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				return basicSetAbstractBranchTransition_ResourceDemandingBehaviour(null, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				return ((InternalEList<?>)getSteps_Behaviour()).basicRemove(otherEnd, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				return ((InternalEList<?>)getResourceDemandingInternalBehaviours()).basicRemove(otherEnd, msgs);
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
				return eInternalContainer().eInverseRemove(this, RepositoryPackage.BASIC_COMPONENT__SERVICE_EFFECT_SPECIFICATIONS_BASIC_COMPONENT, BasicComponent.class, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				return eInternalContainer().eInverseRemove(this, SeffPackage.ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP, AbstractLoopAction.class, msgs);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				return eInternalContainer().eInverseRemove(this, SeffPackage.ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION, AbstractBranchTransition.class, msgs);
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
				return getSeffTypeID();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
				if (resolve) return getDescribedService__SEFF();
				return basicGetDescribedService__SEFF();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
				return getBasicComponent_ServiceEffectSpecification();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				return getAbstractLoopAction_ResourceDemandingBehaviour();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				return getAbstractBranchTransition_ResourceDemandingBehaviour();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				return getSteps_Behaviour();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				return getResourceDemandingInternalBehaviours();
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
				setSeffTypeID((String)newValue);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
				setDescribedService__SEFF((Signature)newValue);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
				setBasicComponent_ServiceEffectSpecification((BasicComponent)newValue);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				setAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)newValue);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				setAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)newValue);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				getSteps_Behaviour().clear();
				getSteps_Behaviour().addAll((Collection<? extends AbstractAction>)newValue);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				getResourceDemandingInternalBehaviours().clear();
				getResourceDemandingInternalBehaviours().addAll((Collection<? extends ResourceDemandingInternalBehaviour>)newValue);
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
				setSeffTypeID(SEFF_TYPE_ID_EDEFAULT);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
				setDescribedService__SEFF((Signature)null);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
				setBasicComponent_ServiceEffectSpecification((BasicComponent)null);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				setAbstractLoopAction_ResourceDemandingBehaviour((AbstractLoopAction)null);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				setAbstractBranchTransition_ResourceDemandingBehaviour((AbstractBranchTransition)null);
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				getSteps_Behaviour().clear();
				return;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				getResourceDemandingInternalBehaviours().clear();
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
			case SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID:
				return SEFF_TYPE_ID_EDEFAULT == null ? seffTypeID != null : !SEFF_TYPE_ID_EDEFAULT.equals(seffTypeID);
			case SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF:
				return describedService__SEFF != null;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION:
				return getBasicComponent_ServiceEffectSpecification() != null;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR:
				return getAbstractLoopAction_ResourceDemandingBehaviour() != null;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR:
				return getAbstractBranchTransition_ResourceDemandingBehaviour() != null;
			case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR:
				return steps_Behaviour != null && !steps_Behaviour.isEmpty();
			case SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS:
				return resourceDemandingInternalBehaviours != null && !resourceDemandingInternalBehaviours.isEmpty();
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
		if (baseClass == ServiceEffectSpecification.class) {
			switch (derivedFeatureID) {
				case SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID: return SeffPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID;
				case SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF: return SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF;
				case SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION: return SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION;
				default: return -1;
			}
		}
		if (baseClass == PCMClass.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PCMBaseClass.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ResourceDemandingBehaviour.class) {
			switch (derivedFeatureID) {
				case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;
				case SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;
				case SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR;
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
		if (baseClass == ServiceEffectSpecification.class) {
			switch (baseFeatureID) {
				case SeffPackage.SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID: return SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID;
				case SeffPackage.SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF: return SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF;
				case SeffPackage.SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION: return SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION;
				default: return -1;
			}
		}
		if (baseClass == PCMClass.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PCMBaseClass.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ResourceDemandingBehaviour.class) {
			switch (baseFeatureID) {
				case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;
				case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;
				case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR: return SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ServiceEffectSpecification.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PCMClass.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == EObject.class) {
			switch (baseOperationID) {
				case EcorePackage.EOBJECT___ECLASS: return SeffPackage.RESOURCE_DEMANDING_SEFF___ECLASS;
				case EcorePackage.EOBJECT___EIS_PROXY: return SeffPackage.RESOURCE_DEMANDING_SEFF___EIS_PROXY;
				case EcorePackage.EOBJECT___ERESOURCE: return SeffPackage.RESOURCE_DEMANDING_SEFF___ERESOURCE;
				case EcorePackage.EOBJECT___ECONTAINER: return SeffPackage.RESOURCE_DEMANDING_SEFF___ECONTAINER;
				case EcorePackage.EOBJECT___ECONTAINING_FEATURE: return SeffPackage.RESOURCE_DEMANDING_SEFF___ECONTAINING_FEATURE;
				case EcorePackage.EOBJECT___ECONTAINMENT_FEATURE: return SeffPackage.RESOURCE_DEMANDING_SEFF___ECONTAINMENT_FEATURE;
				case EcorePackage.EOBJECT___ECONTENTS: return SeffPackage.RESOURCE_DEMANDING_SEFF___ECONTENTS;
				case EcorePackage.EOBJECT___EALL_CONTENTS: return SeffPackage.RESOURCE_DEMANDING_SEFF___EALL_CONTENTS;
				case EcorePackage.EOBJECT___ECROSS_REFERENCES: return SeffPackage.RESOURCE_DEMANDING_SEFF___ECROSS_REFERENCES;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE: return SeffPackage.RESOURCE_DEMANDING_SEFF___EGET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN: return SeffPackage.RESOURCE_DEMANDING_SEFF___EGET__ESTRUCTURALFEATURE_BOOLEAN;
				case EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT: return SeffPackage.RESOURCE_DEMANDING_SEFF___ESET__ESTRUCTURALFEATURE_OBJECT;
				case EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE: return SeffPackage.RESOURCE_DEMANDING_SEFF___EIS_SET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE: return SeffPackage.RESOURCE_DEMANDING_SEFF___EUNSET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST: return SeffPackage.RESOURCE_DEMANDING_SEFF___EINVOKE__EOPERATION_ELIST;
				default: return -1;
			}
		}
		if (baseClass == PCMBaseClass.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ResourceDemandingBehaviour.class) {
			switch (baseOperationID) {
				case SeffPackage.RESOURCE_DEMANDING_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP: return SeffPackage.RESOURCE_DEMANDING_SEFF___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SeffPackage.RESOURCE_DEMANDING_SEFF___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP:
				return startActionNeedsRouteToStopAction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (seffTypeID: ");
		result.append(seffTypeID);
		result.append(')');
		return result.toString();
	}

} //ResourceDemandingSEFFImpl

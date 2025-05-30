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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import pcm.repository.DataType;
import pcm.repository.OperationInterface;
import pcm.repository.OperationSignature;
import pcm.repository.Parameter;
import pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.impl.OperationSignatureImpl#getInterface__OperationSignature <em>Interface Operation Signature</em>}</li>
 *   <li>{@link pcm.repository.impl.OperationSignatureImpl#getParameters__OperationSignature <em>Parameters Operation Signature</em>}</li>
 *   <li>{@link pcm.repository.impl.OperationSignatureImpl#getReturnType__OperationSignature <em>Return Type Operation Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationSignatureImpl extends SignatureImpl implements OperationSignature {
	/**
	 * The cached value of the '{@link #getParameters__OperationSignature() <em>Parameters Operation Signature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters__OperationSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters__OperationSignature;

	/**
	 * The cached value of the '{@link #getReturnType__OperationSignature() <em>Return Type Operation Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType__OperationSignature()
	 * @generated
	 * @ordered
	 */
	protected DataType returnType__OperationSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.OPERATION_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationInterface getInterface__OperationSignature() {
		if (eContainerFeatureID() != RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE) return null;
		return (OperationInterface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface__OperationSignature(OperationInterface newInterface__OperationSignature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterface__OperationSignature, RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterface__OperationSignature(OperationInterface newInterface__OperationSignature) {
		if (newInterface__OperationSignature != eInternalContainer() || (eContainerFeatureID() != RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE && newInterface__OperationSignature != null)) {
			if (EcoreUtil.isAncestor(this, newInterface__OperationSignature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface__OperationSignature != null)
				msgs = ((InternalEObject)newInterface__OperationSignature).eInverseAdd(this, RepositoryPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE, OperationInterface.class, msgs);
			msgs = basicSetInterface__OperationSignature(newInterface__OperationSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE, newInterface__OperationSignature, newInterface__OperationSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters__OperationSignature() {
		if (parameters__OperationSignature == null) {
			parameters__OperationSignature = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, RepositoryPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE, RepositoryPackage.PARAMETER__OPERATION_SIGNATURE_PARAMETER);
		}
		return parameters__OperationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getReturnType__OperationSignature() {
		if (returnType__OperationSignature != null && returnType__OperationSignature.eIsProxy()) {
			InternalEObject oldReturnType__OperationSignature = (InternalEObject)returnType__OperationSignature;
			returnType__OperationSignature = (DataType)eResolveProxy(oldReturnType__OperationSignature);
			if (returnType__OperationSignature != oldReturnType__OperationSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepositoryPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE, oldReturnType__OperationSignature, returnType__OperationSignature));
			}
		}
		return returnType__OperationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetReturnType__OperationSignature() {
		return returnType__OperationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType__OperationSignature(DataType newReturnType__OperationSignature) {
		DataType oldReturnType__OperationSignature = returnType__OperationSignature;
		returnType__OperationSignature = newReturnType__OperationSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepositoryPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE, oldReturnType__OperationSignature, returnType__OperationSignature));
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
			case RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterface__OperationSignature((OperationInterface)otherEnd, msgs);
			case RepositoryPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters__OperationSignature()).basicAdd(otherEnd, msgs);
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
			case RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
				return basicSetInterface__OperationSignature(null, msgs);
			case RepositoryPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
				return ((InternalEList<?>)getParameters__OperationSignature()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
				return eInternalContainer().eInverseRemove(this, RepositoryPackage.OPERATION_INTERFACE__SIGNATURES_OPERATION_INTERFACE, OperationInterface.class, msgs);
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
			case RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
				return getInterface__OperationSignature();
			case RepositoryPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
				return getParameters__OperationSignature();
			case RepositoryPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE:
				if (resolve) return getReturnType__OperationSignature();
				return basicGetReturnType__OperationSignature();
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
			case RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
				setInterface__OperationSignature((OperationInterface)newValue);
				return;
			case RepositoryPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
				getParameters__OperationSignature().clear();
				getParameters__OperationSignature().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RepositoryPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE:
				setReturnType__OperationSignature((DataType)newValue);
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
			case RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
				setInterface__OperationSignature((OperationInterface)null);
				return;
			case RepositoryPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
				getParameters__OperationSignature().clear();
				return;
			case RepositoryPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE:
				setReturnType__OperationSignature((DataType)null);
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
			case RepositoryPackage.OPERATION_SIGNATURE__INTERFACE_OPERATION_SIGNATURE:
				return getInterface__OperationSignature() != null;
			case RepositoryPackage.OPERATION_SIGNATURE__PARAMETERS_OPERATION_SIGNATURE:
				return parameters__OperationSignature != null && !parameters__OperationSignature.isEmpty();
			case RepositoryPackage.OPERATION_SIGNATURE__RETURN_TYPE_OPERATION_SIGNATURE:
				return returnType__OperationSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationSignatureImpl

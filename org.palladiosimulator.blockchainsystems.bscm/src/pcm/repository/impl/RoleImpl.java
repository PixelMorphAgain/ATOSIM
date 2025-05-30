/**
 */
package pcm.repository.impl;

import org.eclipse.emf.ecore.EClass;

import pcm.core.entity.impl.EntityImpl;

import pcm.repository.RepositoryPackage;
import pcm.repository.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class RoleImpl extends EntityImpl implements Role {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.ROLE;
	}

} //RoleImpl

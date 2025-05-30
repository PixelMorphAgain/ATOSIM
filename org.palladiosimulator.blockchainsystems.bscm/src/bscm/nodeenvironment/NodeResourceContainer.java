/**
 */
package bscm.nodeenvironment;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Resource Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.nodeenvironment.NodeResourceContainer#getResourcePower <em>Resource Power</em>}</li>
 * </ul>
 *
 * @see bscm.nodeenvironment.NodeenvironmentPackage#getNodeResourceContainer()
 * @model
 * @generated
 */
public interface NodeResourceContainer extends Entity {
	/**
	 * Returns the value of the '<em><b>Resource Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Power</em>' attribute.
	 * @see #setResourcePower(double)
	 * @see bscm.nodeenvironment.NodeenvironmentPackage#getNodeResourceContainer_ResourcePower()
	 * @model required="true"
	 * @generated
	 */
	double getResourcePower();

	/**
	 * Sets the value of the '{@link bscm.nodeenvironment.NodeResourceContainer#getResourcePower <em>Resource Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Power</em>' attribute.
	 * @see #getResourcePower()
	 * @generated
	 */
	void setResourcePower(double value);

} // NodeResourceContainer

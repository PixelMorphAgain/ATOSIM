/**
 */
package bscm.p2pnetwork;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.Link#getSpecification <em>Specification</em>}</li>
 *   <li>{@link bscm.p2pnetwork.Link#getFromNode <em>From Node</em>}</li>
 *   <li>{@link bscm.p2pnetwork.Link#getToNode <em>To Node</em>}</li>
 * </ul>
 *
 * @see bscm.p2pnetwork.P2pnetworkPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Entity {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(LinkSpecification)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLink_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LinkSpecification getSpecification();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.Link#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(LinkSpecification value);

	/**
	 * Returns the value of the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Node</em>' reference.
	 * @see #setFromNode(Node)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLink_FromNode()
	 * @model required="true"
	 * @generated
	 */
	Node getFromNode();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.Link#getFromNode <em>From Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Node</em>' reference.
	 * @see #getFromNode()
	 * @generated
	 */
	void setFromNode(Node value);

	/**
	 * Returns the value of the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Node</em>' reference.
	 * @see #setToNode(Node)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLink_ToNode()
	 * @model required="true"
	 * @generated
	 */
	Node getToNode();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.Link#getToNode <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Node</em>' reference.
	 * @see #getToNode()
	 * @generated
	 */
	void setToNode(Node value);

} // Link

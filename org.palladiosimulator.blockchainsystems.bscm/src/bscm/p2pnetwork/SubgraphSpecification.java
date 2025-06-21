/**
 */
package bscm.p2pnetwork;

import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subgraph Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.SubgraphSpecification#getNodeTemplates <em>Node Templates</em>}</li>
 *   <li>{@link bscm.p2pnetwork.SubgraphSpecification#getLinkSpecification <em>Link Specification</em>}</li>
 *   <li>{@link bscm.p2pnetwork.SubgraphSpecification#getConnectivity <em>Connectivity</em>}</li>
 * </ul>
 *
 * @see bscm.p2pnetwork.P2pnetworkPackage#getSubgraphSpecification()
 * @model
 * @generated
 */
public interface SubgraphSpecification extends Entity {
	/**
	 * Returns the value of the '<em><b>Node Templates</b></em>' containment reference list.
	 * The list contents are of type {@link bscm.p2pnetwork.SubgraphNodeTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Templates</em>' containment reference list.
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getSubgraphSpecification_NodeTemplates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SubgraphNodeTemplate> getNodeTemplates();

	/**
	 * Returns the value of the '<em><b>Link Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Specification</em>' containment reference.
	 * @see #setLinkSpecification(LinkSpecification)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getSubgraphSpecification_LinkSpecification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LinkSpecification getLinkSpecification();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.SubgraphSpecification#getLinkSpecification <em>Link Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Specification</em>' containment reference.
	 * @see #getLinkSpecification()
	 * @generated
	 */
	void setLinkSpecification(LinkSpecification value);

	/**
	 * Returns the value of the '<em><b>Connectivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity</em>' attribute.
	 * @see #setConnectivity(int)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getSubgraphSpecification_Connectivity()
	 * @model required="true"
	 * @generated
	 */
	int getConnectivity();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.SubgraphSpecification#getConnectivity <em>Connectivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity</em>' attribute.
	 * @see #getConnectivity()
	 * @generated
	 */
	void setConnectivity(int value);

} // SubgraphSpecification

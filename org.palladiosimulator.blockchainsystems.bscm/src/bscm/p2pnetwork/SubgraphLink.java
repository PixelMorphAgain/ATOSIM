/**
 */
package bscm.p2pnetwork;

import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subgraph Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.SubgraphLink#getSpecification <em>Specification</em>}</li>
 *   <li>{@link bscm.p2pnetwork.SubgraphLink#getConnectedSubgraphs <em>Connected Subgraphs</em>}</li>
 * </ul>
 *
 * @see bscm.p2pnetwork.P2pnetworkPackage#getSubgraphLink()
 * @model
 * @generated
 */
public interface SubgraphLink extends Entity {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(LinkSpecification)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getSubgraphLink_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LinkSpecification getSpecification();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.SubgraphLink#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(LinkSpecification value);

	/**
	 * Returns the value of the '<em><b>Connected Subgraphs</b></em>' reference list.
	 * The list contents are of type {@link bscm.p2pnetwork.SubgraphSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Subgraphs</em>' reference list.
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getSubgraphLink_ConnectedSubgraphs()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<SubgraphSpecification> getConnectedSubgraphs();

} // SubgraphLink

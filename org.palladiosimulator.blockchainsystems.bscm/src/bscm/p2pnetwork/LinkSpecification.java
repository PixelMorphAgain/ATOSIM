/**
 */
package bscm.p2pnetwork;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.LinkSpecification#getLatencySpecification <em>Latency Specification</em>}</li>
 *   <li>{@link bscm.p2pnetwork.LinkSpecification#getThroughputSpecification <em>Throughput Specification</em>}</li>
 * </ul>
 *
 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkSpecification()
 * @model
 * @generated
 */
public interface LinkSpecification extends Entity {
	/**
	 * Returns the value of the '<em><b>Latency Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency Specification</em>' reference.
	 * @see #setLatencySpecification(LinkLatencySpecification)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkSpecification_LatencySpecification()
	 * @model required="true"
	 * @generated
	 */
	LinkLatencySpecification getLatencySpecification();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.LinkSpecification#getLatencySpecification <em>Latency Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Specification</em>' reference.
	 * @see #getLatencySpecification()
	 * @generated
	 */
	void setLatencySpecification(LinkLatencySpecification value);

	/**
	 * Returns the value of the '<em><b>Throughput Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput Specification</em>' reference.
	 * @see #setThroughputSpecification(LinkThroughputSpecification)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkSpecification_ThroughputSpecification()
	 * @model required="true"
	 * @generated
	 */
	LinkThroughputSpecification getThroughputSpecification();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.LinkSpecification#getThroughputSpecification <em>Throughput Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput Specification</em>' reference.
	 * @see #getThroughputSpecification()
	 * @generated
	 */
	void setThroughputSpecification(LinkThroughputSpecification value);

} // LinkSpecification

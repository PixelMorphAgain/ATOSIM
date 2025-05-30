/**
 */
package bscm.p2pnetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Latency Specification Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.LinkLatencySpecificationValue#getLatency <em>Latency</em>}</li>
 *   <li>{@link bscm.p2pnetwork.LinkLatencySpecificationValue#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkLatencySpecificationValue()
 * @model
 * @generated
 */
public interface LinkLatencySpecificationValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(double)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkLatencySpecificationValue_Latency()
	 * @model required="true"
	 * @generated
	 */
	double getLatency();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.LinkLatencySpecificationValue#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(double value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkLatencySpecificationValue_Probability()
	 * @model required="true"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.LinkLatencySpecificationValue#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

} // LinkLatencySpecificationValue

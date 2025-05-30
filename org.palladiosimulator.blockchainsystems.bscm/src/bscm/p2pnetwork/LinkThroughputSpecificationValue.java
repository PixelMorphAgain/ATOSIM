/**
 */
package bscm.p2pnetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Throughput Specification Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.LinkThroughputSpecificationValue#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link bscm.p2pnetwork.LinkThroughputSpecificationValue#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkThroughputSpecificationValue()
 * @model
 * @generated
 */
public interface LinkThroughputSpecificationValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see #setThroughput(int)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkThroughputSpecificationValue_Throughput()
	 * @model required="true"
	 * @generated
	 */
	int getThroughput();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.LinkThroughputSpecificationValue#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(int value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkThroughputSpecificationValue_Probability()
	 * @model required="true"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link bscm.p2pnetwork.LinkThroughputSpecificationValue#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

} // LinkThroughputSpecificationValue

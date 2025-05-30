/**
 */
package bscm.p2pnetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Latency Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.LinkLatencySpecification#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkLatencySpecification()
 * @model
 * @generated
 */
public interface LinkLatencySpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link bscm.p2pnetwork.LinkLatencySpecificationValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkLatencySpecification_Values()
	 * @model
	 * @generated
	 */
	EList<LinkLatencySpecificationValue> getValues();

} // LinkLatencySpecification

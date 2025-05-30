/**
 */
package bscm.p2pnetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Throughput Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.p2pnetwork.LinkThroughputSpecification#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkThroughputSpecification()
 * @model
 * @generated
 */
public interface LinkThroughputSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link bscm.p2pnetwork.LinkThroughputSpecificationValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see bscm.p2pnetwork.P2pnetworkPackage#getLinkThroughputSpecification_Values()
	 * @model required="true"
	 * @generated
	 */
	EList<LinkThroughputSpecificationValue> getValues();

} // LinkThroughputSpecification

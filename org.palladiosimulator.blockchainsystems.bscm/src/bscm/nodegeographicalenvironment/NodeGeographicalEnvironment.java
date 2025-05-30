/**
 */
package bscm.nodegeographicalenvironment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Geographical Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.nodegeographicalenvironment.NodeGeographicalEnvironment#getNodeGeographicalRegionSpecification <em>Node Geographical Region Specification</em>}</li>
 * </ul>
 *
 * @see bscm.nodegeographicalenvironment.NodegeographicalenvironmentPackage#getNodeGeographicalEnvironment()
 * @model
 * @generated
 */
public interface NodeGeographicalEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Geographical Region Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Geographical Region Specification</em>' reference.
	 * @see #setNodeGeographicalRegionSpecification(NodeGeographicalRegionSpecification)
	 * @see bscm.nodegeographicalenvironment.NodegeographicalenvironmentPackage#getNodeGeographicalEnvironment_NodeGeographicalRegionSpecification()
	 * @model required="true"
	 * @generated
	 */
	NodeGeographicalRegionSpecification getNodeGeographicalRegionSpecification();

	/**
	 * Sets the value of the '{@link bscm.nodegeographicalenvironment.NodeGeographicalEnvironment#getNodeGeographicalRegionSpecification <em>Node Geographical Region Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Geographical Region Specification</em>' reference.
	 * @see #getNodeGeographicalRegionSpecification()
	 * @generated
	 */
	void setNodeGeographicalRegionSpecification(NodeGeographicalRegionSpecification value);

} // NodeGeographicalEnvironment

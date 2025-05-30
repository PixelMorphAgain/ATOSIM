/**
 */
package bscm.nodegeographicalenvironment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Geographical Region Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bscm.nodegeographicalenvironment.NodeGeographicalRegionSpecification#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see bscm.nodegeographicalenvironment.NodegeographicalenvironmentPackage#getNodeGeographicalRegionSpecification()
 * @model
 * @generated
 */
public interface NodeGeographicalRegionSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see bscm.nodegeographicalenvironment.NodegeographicalenvironmentPackage#getNodeGeographicalRegionSpecification_Region()
	 * @model required="true"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link bscm.nodegeographicalenvironment.NodeGeographicalRegionSpecification#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

} // NodeGeographicalRegionSpecification

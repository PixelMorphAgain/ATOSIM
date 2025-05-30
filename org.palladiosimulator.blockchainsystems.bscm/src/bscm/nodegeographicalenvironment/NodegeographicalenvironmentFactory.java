/**
 */
package bscm.nodegeographicalenvironment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bscm.nodegeographicalenvironment.NodegeographicalenvironmentPackage
 * @generated
 */
public interface NodegeographicalenvironmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodegeographicalenvironmentFactory eINSTANCE = bscm.nodegeographicalenvironment.impl.NodegeographicalenvironmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Node Geographical Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Geographical Environment</em>'.
	 * @generated
	 */
	NodeGeographicalEnvironment createNodeGeographicalEnvironment();

	/**
	 * Returns a new object of class '<em>Node Geographical Region Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Geographical Region Specification</em>'.
	 * @generated
	 */
	NodeGeographicalRegionSpecification createNodeGeographicalRegionSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NodegeographicalenvironmentPackage getNodegeographicalenvironmentPackage();

} //NodegeographicalenvironmentFactory

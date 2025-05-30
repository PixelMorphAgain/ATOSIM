/**
 */
package bscm.nodegeographicalenvironment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bscm.nodegeographicalenvironment.NodegeographicalenvironmentFactory
 * @model kind="package"
 * @generated
 */
public interface NodegeographicalenvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nodegeographicalenvironment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/BlockchainSystemComponentModel/NodeGeographicalEnvironment/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nodegeographicalenvironment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodegeographicalenvironmentPackage eINSTANCE = bscm.nodegeographicalenvironment.impl.NodegeographicalenvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link bscm.nodegeographicalenvironment.impl.NodeGeographicalEnvironmentImpl <em>Node Geographical Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.nodegeographicalenvironment.impl.NodeGeographicalEnvironmentImpl
	 * @see bscm.nodegeographicalenvironment.impl.NodegeographicalenvironmentPackageImpl#getNodeGeographicalEnvironment()
	 * @generated
	 */
	int NODE_GEOGRAPHICAL_ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Node Geographical Region Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GEOGRAPHICAL_ENVIRONMENT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Node Geographical Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GEOGRAPHICAL_ENVIRONMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Geographical Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GEOGRAPHICAL_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bscm.nodegeographicalenvironment.impl.NodeGeographicalRegionSpecificationImpl <em>Node Geographical Region Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bscm.nodegeographicalenvironment.impl.NodeGeographicalRegionSpecificationImpl
	 * @see bscm.nodegeographicalenvironment.impl.NodegeographicalenvironmentPackageImpl#getNodeGeographicalRegionSpecification()
	 * @generated
	 */
	int NODE_GEOGRAPHICAL_REGION_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GEOGRAPHICAL_REGION_SPECIFICATION__REGION = 0;

	/**
	 * The number of structural features of the '<em>Node Geographical Region Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GEOGRAPHICAL_REGION_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Geographical Region Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GEOGRAPHICAL_REGION_SPECIFICATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bscm.nodegeographicalenvironment.NodeGeographicalEnvironment <em>Node Geographical Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Geographical Environment</em>'.
	 * @see bscm.nodegeographicalenvironment.NodeGeographicalEnvironment
	 * @generated
	 */
	EClass getNodeGeographicalEnvironment();

	/**
	 * Returns the meta object for the reference '{@link bscm.nodegeographicalenvironment.NodeGeographicalEnvironment#getNodeGeographicalRegionSpecification <em>Node Geographical Region Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Geographical Region Specification</em>'.
	 * @see bscm.nodegeographicalenvironment.NodeGeographicalEnvironment#getNodeGeographicalRegionSpecification()
	 * @see #getNodeGeographicalEnvironment()
	 * @generated
	 */
	EReference getNodeGeographicalEnvironment_NodeGeographicalRegionSpecification();

	/**
	 * Returns the meta object for class '{@link bscm.nodegeographicalenvironment.NodeGeographicalRegionSpecification <em>Node Geographical Region Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Geographical Region Specification</em>'.
	 * @see bscm.nodegeographicalenvironment.NodeGeographicalRegionSpecification
	 * @generated
	 */
	EClass getNodeGeographicalRegionSpecification();

	/**
	 * Returns the meta object for the attribute '{@link bscm.nodegeographicalenvironment.NodeGeographicalRegionSpecification#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see bscm.nodegeographicalenvironment.NodeGeographicalRegionSpecification#getRegion()
	 * @see #getNodeGeographicalRegionSpecification()
	 * @generated
	 */
	EAttribute getNodeGeographicalRegionSpecification_Region();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NodegeographicalenvironmentFactory getNodegeographicalenvironmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bscm.nodegeographicalenvironment.impl.NodeGeographicalEnvironmentImpl <em>Node Geographical Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.nodegeographicalenvironment.impl.NodeGeographicalEnvironmentImpl
		 * @see bscm.nodegeographicalenvironment.impl.NodegeographicalenvironmentPackageImpl#getNodeGeographicalEnvironment()
		 * @generated
		 */
		EClass NODE_GEOGRAPHICAL_ENVIRONMENT = eINSTANCE.getNodeGeographicalEnvironment();

		/**
		 * The meta object literal for the '<em><b>Node Geographical Region Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_GEOGRAPHICAL_ENVIRONMENT__NODE_GEOGRAPHICAL_REGION_SPECIFICATION = eINSTANCE.getNodeGeographicalEnvironment_NodeGeographicalRegionSpecification();

		/**
		 * The meta object literal for the '{@link bscm.nodegeographicalenvironment.impl.NodeGeographicalRegionSpecificationImpl <em>Node Geographical Region Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bscm.nodegeographicalenvironment.impl.NodeGeographicalRegionSpecificationImpl
		 * @see bscm.nodegeographicalenvironment.impl.NodegeographicalenvironmentPackageImpl#getNodeGeographicalRegionSpecification()
		 * @generated
		 */
		EClass NODE_GEOGRAPHICAL_REGION_SPECIFICATION = eINSTANCE.getNodeGeographicalRegionSpecification();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_GEOGRAPHICAL_REGION_SPECIFICATION__REGION = eINSTANCE.getNodeGeographicalRegionSpecification_Region();

	}

} //NodegeographicalenvironmentPackage

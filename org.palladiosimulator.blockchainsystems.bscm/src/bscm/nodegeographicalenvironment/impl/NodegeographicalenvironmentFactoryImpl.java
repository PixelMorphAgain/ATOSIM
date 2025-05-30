/**
 */
package bscm.nodegeographicalenvironment.impl;

import bscm.nodegeographicalenvironment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodegeographicalenvironmentFactoryImpl extends EFactoryImpl implements NodegeographicalenvironmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodegeographicalenvironmentFactory init() {
		try {
			NodegeographicalenvironmentFactory theNodegeographicalenvironmentFactory = (NodegeographicalenvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(NodegeographicalenvironmentPackage.eNS_URI);
			if (theNodegeographicalenvironmentFactory != null) {
				return theNodegeographicalenvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NodegeographicalenvironmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodegeographicalenvironmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NodegeographicalenvironmentPackage.NODE_GEOGRAPHICAL_ENVIRONMENT: return createNodeGeographicalEnvironment();
			case NodegeographicalenvironmentPackage.NODE_GEOGRAPHICAL_REGION_SPECIFICATION: return createNodeGeographicalRegionSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeGeographicalEnvironment createNodeGeographicalEnvironment() {
		NodeGeographicalEnvironmentImpl nodeGeographicalEnvironment = new NodeGeographicalEnvironmentImpl();
		return nodeGeographicalEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeGeographicalRegionSpecification createNodeGeographicalRegionSpecification() {
		NodeGeographicalRegionSpecificationImpl nodeGeographicalRegionSpecification = new NodeGeographicalRegionSpecificationImpl();
		return nodeGeographicalRegionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodegeographicalenvironmentPackage getNodegeographicalenvironmentPackage() {
		return (NodegeographicalenvironmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NodegeographicalenvironmentPackage getPackage() {
		return NodegeographicalenvironmentPackage.eINSTANCE;
	}

} //NodegeographicalenvironmentFactoryImpl

/**
 */
package pcm.seff;

import identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pcm.core.entity.EntityPackage;

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
 * <!-- begin-model-doc -->
 * Package containing the abstract behaviour model of components
 * <!-- end-model-doc -->
 * @see pcm.seff.SeffFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG'"
 * @generated
 */
public interface SeffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "seff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/SEFF/5.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "seff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeffPackage eINSTANCE = pcm.seff.impl.SeffPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcm.seff.impl.AbstractActionImpl <em>Abstract Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.AbstractActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getAbstractAction()
	 * @generated
	 */
	int ABSTRACT_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Abstract Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.AbstractInternalControlFlowActionImpl <em>Abstract Internal Control Flow Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.AbstractInternalControlFlowActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getAbstractInternalControlFlowAction()
	 * @generated
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID = ABSTRACT_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME = ABSTRACT_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Internal Control Flow Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS = ABSTRACT_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY = ABSTRACT_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE = ABSTRACT_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER = ABSTRACT_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE = ABSTRACT_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS = ABSTRACT_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS = ABSTRACT_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES = ABSTRACT_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Abstract Internal Control Flow Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT = ABSTRACT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.StopActionImpl <em>Stop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.StopActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getStopAction()
	 * @generated
	 */
	int STOP_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The number of structural features of the '<em>Stop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___ECLASS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___EIS_PROXY = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___ERESOURCE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___ECONTAINER = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___ECONTAINING_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___ECONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___EALL_CONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___ECROSS_REFERENCES = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Stop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_ACTION_OPERATION_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.ResourceDemandingBehaviourImpl <em>Resource Demanding Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.ResourceDemandingBehaviourImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getResourceDemandingBehaviour()
	 * @generated
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Steps Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Demanding Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___ECLASS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___EIS_PROXY = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___ERESOURCE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___ECONTAINER = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___ECONTAINING_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___ECONTAINMENT_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___ECONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___EALL_CONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___ECROSS_REFERENCES = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___EGET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___EGET__ESTRUCTURALFEATURE_BOOLEAN = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___ESET__ESTRUCTURALFEATURE_OBJECT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___EIS_SET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___EUNSET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___EINVOKE__EOPERATION_ELIST = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Start Action Needs Route To Stop Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Resource Demanding Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_BEHAVIOUR_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.AbstractLoopActionImpl <em>Abstract Loop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.AbstractLoopActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getAbstractLoopAction()
	 * @generated
	 */
	int ABSTRACT_LOOP_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Body Behaviour Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Loop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___ECLASS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___EIS_PROXY = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___ERESOURCE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___ECONTAINER = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___ECONTAINING_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___ECONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___EALL_CONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___ECROSS_REFERENCES = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Abstract Loop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LOOP_ACTION_OPERATION_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.AbstractBranchTransitionImpl <em>Abstract Branch Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.AbstractBranchTransitionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getAbstractBranchTransition()
	 * @generated
	 */
	int ABSTRACT_BRANCH_TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Branch Action Abstract Branch Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branch Behaviour Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Branch Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Abstract Branch Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BRANCH_TRANSITION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.BranchActionImpl <em>Branch Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.BranchActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getBranchAction()
	 * @generated
	 */
	int BRANCH_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Branches Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION__BRANCHES_BRANCH = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branch Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___ECLASS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___EIS_PROXY = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___ERESOURCE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___ECONTAINER = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___ECONTAINING_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___ECONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___EALL_CONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___ECROSS_REFERENCES = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Branch Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_ACTION_OPERATION_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.CallActionImpl <em>Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.CallActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getCallAction()
	 * @generated
	 */
	int CALL_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.StartActionImpl <em>Start Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.StartActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getStartAction()
	 * @generated
	 */
	int START_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The number of structural features of the '<em>Start Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___ECLASS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___EIS_PROXY = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___ERESOURCE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___ECONTAINER = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___ECONTAINING_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___ECONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___EALL_CONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___ECROSS_REFERENCES = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Start Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_ACTION_OPERATION_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.ServiceEffectSpecificationImpl <em>Service Effect Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.ServiceEffectSpecificationImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getServiceEffectSpecification()
	 * @generated
	 */
	int SERVICE_EFFECT_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Seff Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID = 0;

	/**
	 * The feature id for the '<em><b>Described Service SEFF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF = 1;

	/**
	 * The feature id for the '<em><b>Basic Component Service Effect Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Service Effect Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Effect Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_EFFECT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.ResourceDemandingSEFFImpl <em>Resource Demanding SEFF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.ResourceDemandingSEFFImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getResourceDemandingSEFF()
	 * @generated
	 */
	int RESOURCE_DEMANDING_SEFF = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Seff Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Described Service SEFF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Basic Component Service Effect Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Steps Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resource Demanding Internal Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Resource Demanding SEFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___ECLASS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___EIS_PROXY = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___ERESOURCE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___ECONTAINER = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___ECONTAINING_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___ECONTAINMENT_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___ECONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___EALL_CONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___ECROSS_REFERENCES = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___EGET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___EGET__ESTRUCTURALFEATURE_BOOLEAN = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___ESET__ESTRUCTURALFEATURE_OBJECT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___EIS_SET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___EUNSET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___EINVOKE__EOPERATION_ELIST = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Start Action Needs Route To Stop Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Resource Demanding SEFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_SEFF_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.ResourceDemandingInternalBehaviourImpl <em>Resource Demanding Internal Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.ResourceDemandingInternalBehaviourImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getResourceDemandingInternalBehaviour()
	 * @generated
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR__ID = RESOURCE_DEMANDING_BEHAVIOUR__ID;

	/**
	 * The feature id for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Steps Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR__STEPS_BEHAVIOUR = RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Resource Demanding SEFF Resource Demanding Internal Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR__RESOURCE_DEMANDING_SEFF_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR = RESOURCE_DEMANDING_BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Demanding Internal Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR_FEATURE_COUNT = RESOURCE_DEMANDING_BEHAVIOUR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___ECLASS = RESOURCE_DEMANDING_BEHAVIOUR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___EIS_PROXY = RESOURCE_DEMANDING_BEHAVIOUR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___ERESOURCE = RESOURCE_DEMANDING_BEHAVIOUR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___ECONTAINER = RESOURCE_DEMANDING_BEHAVIOUR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___ECONTAINING_FEATURE = RESOURCE_DEMANDING_BEHAVIOUR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___ECONTAINMENT_FEATURE = RESOURCE_DEMANDING_BEHAVIOUR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___ECONTENTS = RESOURCE_DEMANDING_BEHAVIOUR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___EALL_CONTENTS = RESOURCE_DEMANDING_BEHAVIOUR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___ECROSS_REFERENCES = RESOURCE_DEMANDING_BEHAVIOUR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___EGET__ESTRUCTURALFEATURE = RESOURCE_DEMANDING_BEHAVIOUR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___EGET__ESTRUCTURALFEATURE_BOOLEAN = RESOURCE_DEMANDING_BEHAVIOUR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___ESET__ESTRUCTURALFEATURE_OBJECT = RESOURCE_DEMANDING_BEHAVIOUR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___EIS_SET__ESTRUCTURALFEATURE = RESOURCE_DEMANDING_BEHAVIOUR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___EUNSET__ESTRUCTURALFEATURE = RESOURCE_DEMANDING_BEHAVIOUR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___EINVOKE__EOPERATION_ELIST = RESOURCE_DEMANDING_BEHAVIOUR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Start Action Needs Route To Stop Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP = RESOURCE_DEMANDING_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Resource Demanding Internal Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR_OPERATION_COUNT = RESOURCE_DEMANDING_BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.ReleaseActionImpl <em>Release Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.ReleaseActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getReleaseAction()
	 * @generated
	 */
	int RELEASE_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Passive Resource Release Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION__PASSIVE_RESOURCE_RELEASE_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Release Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___ECLASS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___EIS_PROXY = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___ERESOURCE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___ECONTAINER = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___ECONTAINING_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___ECONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___EALL_CONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___ECROSS_REFERENCES = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Release Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_ACTION_OPERATION_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.LoopActionImpl <em>Loop Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.LoopActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getLoopAction()
	 * @generated
	 */
	int LOOP_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__ID = ABSTRACT_LOOP_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__ENTITY_NAME = ABSTRACT_LOOP_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_LOOP_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_LOOP_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_LOOP_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_LOOP_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_LOOP_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_LOOP_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Body Behaviour Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__BODY_BEHAVIOUR_LOOP = ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP;

	/**
	 * The feature id for the '<em><b>Iteration Count Loop Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION = ABSTRACT_LOOP_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION_FEATURE_COUNT = ABSTRACT_LOOP_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___ECLASS = ABSTRACT_LOOP_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___EIS_PROXY = ABSTRACT_LOOP_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___ERESOURCE = ABSTRACT_LOOP_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___ECONTAINER = ABSTRACT_LOOP_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___ECONTAINING_FEATURE = ABSTRACT_LOOP_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_LOOP_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___ECONTENTS = ABSTRACT_LOOP_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___EALL_CONTENTS = ABSTRACT_LOOP_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___ECROSS_REFERENCES = ABSTRACT_LOOP_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_LOOP_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_LOOP_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_LOOP_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_LOOP_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_LOOP_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_LOOP_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Loop Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ACTION_OPERATION_COUNT = ABSTRACT_LOOP_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.ForkActionImpl <em>Fork Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.ForkActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getForkAction()
	 * @generated
	 */
	int FORK_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Asynchronous Forked Behaviours Fork Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synchronising Behaviours Fork Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fork Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___ECLASS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___EIS_PROXY = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___ERESOURCE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___ECONTAINER = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___ECONTAINING_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___ECONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___EALL_CONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___ECROSS_REFERENCES = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Fork Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_ACTION_OPERATION_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.ForkedBehaviourImpl <em>Forked Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.ForkedBehaviourImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getForkedBehaviour()
	 * @generated
	 */
	int FORKED_BEHAVIOUR = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__ID = RESOURCE_DEMANDING_BEHAVIOUR__ID;

	/**
	 * The feature id for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Steps Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__STEPS_BEHAVIOUR = RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Synchronisation Point Forked Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__SYNCHRONISATION_POINT_FORKED_BEHAVIOUR = RESOURCE_DEMANDING_BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fork Action Forked Behaivour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR__FORK_ACTION_FORKED_BEHAIVOUR = RESOURCE_DEMANDING_BEHAVIOUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Forked Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR_FEATURE_COUNT = RESOURCE_DEMANDING_BEHAVIOUR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___ECLASS = RESOURCE_DEMANDING_BEHAVIOUR___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___EIS_PROXY = RESOURCE_DEMANDING_BEHAVIOUR___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___ERESOURCE = RESOURCE_DEMANDING_BEHAVIOUR___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___ECONTAINER = RESOURCE_DEMANDING_BEHAVIOUR___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___ECONTAINING_FEATURE = RESOURCE_DEMANDING_BEHAVIOUR___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___ECONTAINMENT_FEATURE = RESOURCE_DEMANDING_BEHAVIOUR___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___ECONTENTS = RESOURCE_DEMANDING_BEHAVIOUR___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___EALL_CONTENTS = RESOURCE_DEMANDING_BEHAVIOUR___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___ECROSS_REFERENCES = RESOURCE_DEMANDING_BEHAVIOUR___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___EGET__ESTRUCTURALFEATURE = RESOURCE_DEMANDING_BEHAVIOUR___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___EGET__ESTRUCTURALFEATURE_BOOLEAN = RESOURCE_DEMANDING_BEHAVIOUR___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___ESET__ESTRUCTURALFEATURE_OBJECT = RESOURCE_DEMANDING_BEHAVIOUR___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___EIS_SET__ESTRUCTURALFEATURE = RESOURCE_DEMANDING_BEHAVIOUR___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___EUNSET__ESTRUCTURALFEATURE = RESOURCE_DEMANDING_BEHAVIOUR___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___EINVOKE__EOPERATION_ELIST = RESOURCE_DEMANDING_BEHAVIOUR___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Start Action Needs Route To Stop Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP = RESOURCE_DEMANDING_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Forked Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_BEHAVIOUR_OPERATION_COUNT = RESOURCE_DEMANDING_BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.SynchronisationPointImpl <em>Synchronisation Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.SynchronisationPointImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getSynchronisationPoint()
	 * @generated
	 */
	int SYNCHRONISATION_POINT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Output Parameter Usage Synchronisation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT__OUTPUT_PARAMETER_USAGE_SYNCHRONISATION_POINT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fork Action Synchronisation Point</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT__FORK_ACTION_SYNCHRONISATION_POINT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synchronous Forked Behaviours Synchronisation Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT__SYNCHRONOUS_FORKED_BEHAVIOURS_SYNCHRONISATION_POINT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Synchronisation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___ECLASS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___EIS_PROXY = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___ERESOURCE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___ECONTAINER = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___ECONTAINING_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___ECONTAINMENT_FEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___ECONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___EALL_CONTENTS = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___ECROSS_REFERENCES = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___EGET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___EGET__ESTRUCTURALFEATURE_BOOLEAN = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___ESET__ESTRUCTURALFEATURE_OBJECT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___EIS_SET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___EUNSET__ESTRUCTURALFEATURE = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT___EINVOKE__EOPERATION_ELIST = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Synchronisation Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_POINT_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.ExternalCallActionImpl <em>External Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.ExternalCallActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getExternalCallAction()
	 * @generated
	 */
	int EXTERNAL_CALL_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__ID = ABSTRACT_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__ENTITY_NAME = ABSTRACT_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Variable Usage Call Return Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION = ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = ABSTRACT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Called Service External Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE = ABSTRACT_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role External Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE = ABSTRACT_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION__RETRY_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>External Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION_FEATURE_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___ECLASS = ABSTRACT_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___EIS_PROXY = ABSTRACT_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___ERESOURCE = ABSTRACT_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___ECONTAINER = ABSTRACT_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___ECONTAINING_FEATURE = ABSTRACT_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___ECONTENTS = ABSTRACT_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___EALL_CONTENTS = ABSTRACT_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___ECROSS_REFERENCES = ABSTRACT_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>External Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_ACTION_OPERATION_COUNT = ABSTRACT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.CallReturnActionImpl <em>Call Return Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.CallReturnActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getCallReturnAction()
	 * @generated
	 */
	int CALL_RETURN_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION__ID = CALL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION__ENTITY_NAME = CALL_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Return Variable Usage Call Return Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Return Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___ECLASS = CALL_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___EIS_PROXY = CALL_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___ERESOURCE = CALL_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___ECONTAINER = CALL_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___ECONTAINING_FEATURE = CALL_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___ECONTAINMENT_FEATURE = CALL_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___ECONTENTS = CALL_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___EALL_CONTENTS = CALL_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___ECROSS_REFERENCES = CALL_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___EGET__ESTRUCTURALFEATURE = CALL_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CALL_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = CALL_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___EIS_SET__ESTRUCTURALFEATURE = CALL_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___EUNSET__ESTRUCTURALFEATURE = CALL_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION___EINVOKE__EOPERATION_ELIST = CALL_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Call Return Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_RETURN_ACTION_OPERATION_COUNT = CALL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.ProbabilisticBranchTransitionImpl <em>Probabilistic Branch Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.ProbabilisticBranchTransitionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getProbabilisticBranchTransition()
	 * @generated
	 */
	int PROBABILISTIC_BRANCH_TRANSITION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION__ID = ABSTRACT_BRANCH_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION__ENTITY_NAME = ABSTRACT_BRANCH_TRANSITION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Branch Action Abstract Branch Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION = ABSTRACT_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION;

	/**
	 * The feature id for the '<em><b>Branch Behaviour Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION = ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION;

	/**
	 * The feature id for the '<em><b>Branch Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY = ABSTRACT_BRANCH_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Probabilistic Branch Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION_FEATURE_COUNT = ABSTRACT_BRANCH_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___ECLASS = ABSTRACT_BRANCH_TRANSITION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___EIS_PROXY = ABSTRACT_BRANCH_TRANSITION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___ERESOURCE = ABSTRACT_BRANCH_TRANSITION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___ECONTAINER = ABSTRACT_BRANCH_TRANSITION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___ECONTAINING_FEATURE = ABSTRACT_BRANCH_TRANSITION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___ECONTAINMENT_FEATURE = ABSTRACT_BRANCH_TRANSITION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___ECONTENTS = ABSTRACT_BRANCH_TRANSITION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___EALL_CONTENTS = ABSTRACT_BRANCH_TRANSITION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___ECROSS_REFERENCES = ABSTRACT_BRANCH_TRANSITION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___EGET__ESTRUCTURALFEATURE = ABSTRACT_BRANCH_TRANSITION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_BRANCH_TRANSITION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_BRANCH_TRANSITION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_BRANCH_TRANSITION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_BRANCH_TRANSITION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION___EINVOKE__EOPERATION_ELIST = ABSTRACT_BRANCH_TRANSITION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Probabilistic Branch Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_BRANCH_TRANSITION_OPERATION_COUNT = ABSTRACT_BRANCH_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.AcquireActionImpl <em>Acquire Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.AcquireActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getAcquireAction()
	 * @generated
	 */
	int ACQUIRE_ACTION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Passiveresource Acquire Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__TIMEOUT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timeout Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION__TIMEOUT_VALUE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Acquire Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___ECLASS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___EIS_PROXY = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___ERESOURCE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___ECONTAINER = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___ECONTAINING_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___ECONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___EALL_CONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___ECROSS_REFERENCES = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Acquire Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_ACTION_OPERATION_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.CollectionIteratorActionImpl <em>Collection Iterator Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.CollectionIteratorActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getCollectionIteratorAction()
	 * @generated
	 */
	int COLLECTION_ITERATOR_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__ID = ABSTRACT_LOOP_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__ENTITY_NAME = ABSTRACT_LOOP_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_LOOP_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_LOOP_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_LOOP_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_LOOP_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_LOOP_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_LOOP_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Body Behaviour Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__BODY_BEHAVIOUR_LOOP = ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP;

	/**
	 * The feature id for the '<em><b>Parameter Collection Iterator Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION = ABSTRACT_LOOP_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Iterator Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION_FEATURE_COUNT = ABSTRACT_LOOP_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___ECLASS = ABSTRACT_LOOP_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___EIS_PROXY = ABSTRACT_LOOP_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___ERESOURCE = ABSTRACT_LOOP_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___ECONTAINER = ABSTRACT_LOOP_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___ECONTAINING_FEATURE = ABSTRACT_LOOP_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_LOOP_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___ECONTENTS = ABSTRACT_LOOP_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___EALL_CONTENTS = ABSTRACT_LOOP_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___ECROSS_REFERENCES = ABSTRACT_LOOP_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_LOOP_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_LOOP_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_LOOP_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_LOOP_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_LOOP_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_LOOP_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Collection Iterator Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITERATOR_ACTION_OPERATION_COUNT = ABSTRACT_LOOP_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.GuardedBranchTransitionImpl <em>Guarded Branch Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.GuardedBranchTransitionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getGuardedBranchTransition()
	 * @generated
	 */
	int GUARDED_BRANCH_TRANSITION = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION__ID = ABSTRACT_BRANCH_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION__ENTITY_NAME = ABSTRACT_BRANCH_TRANSITION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Branch Action Abstract Branch Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION = ABSTRACT_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION;

	/**
	 * The feature id for the '<em><b>Branch Behaviour Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION = ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION;

	/**
	 * The feature id for the '<em><b>Branch Condition Guarded Branch Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION = ABSTRACT_BRANCH_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guarded Branch Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION_FEATURE_COUNT = ABSTRACT_BRANCH_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___ECLASS = ABSTRACT_BRANCH_TRANSITION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___EIS_PROXY = ABSTRACT_BRANCH_TRANSITION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___ERESOURCE = ABSTRACT_BRANCH_TRANSITION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___ECONTAINER = ABSTRACT_BRANCH_TRANSITION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___ECONTAINING_FEATURE = ABSTRACT_BRANCH_TRANSITION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___ECONTAINMENT_FEATURE = ABSTRACT_BRANCH_TRANSITION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___ECONTENTS = ABSTRACT_BRANCH_TRANSITION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___EALL_CONTENTS = ABSTRACT_BRANCH_TRANSITION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___ECROSS_REFERENCES = ABSTRACT_BRANCH_TRANSITION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___EGET__ESTRUCTURALFEATURE = ABSTRACT_BRANCH_TRANSITION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_BRANCH_TRANSITION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_BRANCH_TRANSITION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_BRANCH_TRANSITION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_BRANCH_TRANSITION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION___EINVOKE__EOPERATION_ELIST = ABSTRACT_BRANCH_TRANSITION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Guarded Branch Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_BRANCH_TRANSITION_OPERATION_COUNT = ABSTRACT_BRANCH_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.SetVariableActionImpl <em>Set Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.SetVariableActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getSetVariableAction()
	 * @generated
	 */
	int SET_VARIABLE_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Local Variable Usages Set Variable Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___ECLASS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___EIS_PROXY = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___ERESOURCE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___ECONTAINER = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___ECONTAINING_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___ECONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___EALL_CONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___ECROSS_REFERENCES = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Set Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VARIABLE_ACTION_OPERATION_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.InternalCallActionImpl <em>Internal Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.InternalCallActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getInternalCallAction()
	 * @generated
	 */
	int INTERNAL_CALL_ACTION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__ID = CALL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__ENTITY_NAME = CALL_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__PREDECESSOR_ABSTRACT_ACTION = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__SUCCESSOR_ABSTRACT_ACTION = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = CALL_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__RESOURCE_DEMAND_ACTION = CALL_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__INFRASTRUCTURE_CALL_ACTION = CALL_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__RESOURCE_CALL_ACTION = CALL_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Called Resource Demanding Internal Behaviour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR = CALL_ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Internal Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___ECLASS = CALL_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___EIS_PROXY = CALL_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___ERESOURCE = CALL_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___ECONTAINER = CALL_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___ECONTAINING_FEATURE = CALL_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___ECONTAINMENT_FEATURE = CALL_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___ECONTENTS = CALL_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___EALL_CONTENTS = CALL_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___ECROSS_REFERENCES = CALL_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___EGET__ESTRUCTURALFEATURE = CALL_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = CALL_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = CALL_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___EIS_SET__ESTRUCTURALFEATURE = CALL_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___EUNSET__ESTRUCTURALFEATURE = CALL_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION___EINVOKE__EOPERATION_ELIST = CALL_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Internal Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_CALL_ACTION_OPERATION_COUNT = CALL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.EmitEventActionImpl <em>Emit Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.EmitEventActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getEmitEventAction()
	 * @generated
	 */
	int EMIT_EVENT_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__ID = ABSTRACT_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__ENTITY_NAME = ABSTRACT_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Type Emit Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION = ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Role Emit Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION = ABSTRACT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Emit Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION_FEATURE_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___ECLASS = ABSTRACT_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___EIS_PROXY = ABSTRACT_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___ERESOURCE = ABSTRACT_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___ECONTAINER = ABSTRACT_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___ECONTAINING_FEATURE = ABSTRACT_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___ECONTENTS = ABSTRACT_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___EALL_CONTENTS = ABSTRACT_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___ECROSS_REFERENCES = ABSTRACT_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Emit Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_EVENT_ACTION_OPERATION_COUNT = ABSTRACT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.impl.InternalActionImpl <em>Internal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.impl.InternalActionImpl
	 * @see pcm.seff.impl.SeffPackageImpl#getInternalAction()
	 * @generated
	 */
	int INTERNAL_ACTION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__ID = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__ENTITY_NAME = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__PREDECESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__SUCCESSOR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__RESOURCE_DEMAND_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__INFRASTRUCTURE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__RESOURCE_CALL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Internal Failure Occurrence Descriptions Internal Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_FEATURE_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___ECLASS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___EIS_PROXY = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___ERESOURCE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___ECONTAINER = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___ECONTAINING_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___ECONTAINMENT_FEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___ECONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___EALL_CONTENTS = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___ECROSS_REFERENCES = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___EGET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___EIS_SET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___EUNSET__ESTRUCTURALFEATURE = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION___EINVOKE__EOPERATION_ELIST = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Internal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_OPERATION_COUNT = ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcm.seff.StopAction <em>Stop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Action</em>'.
	 * @see pcm.seff.StopAction
	 * @generated
	 */
	EClass getStopAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.AbstractInternalControlFlowAction <em>Abstract Internal Control Flow Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Internal Control Flow Action</em>'.
	 * @see pcm.seff.AbstractInternalControlFlowAction
	 * @generated
	 */
	EClass getAbstractInternalControlFlowAction();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.AbstractInternalControlFlowAction#getResourceDemand_Action <em>Resource Demand Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Demand Action</em>'.
	 * @see pcm.seff.AbstractInternalControlFlowAction#getResourceDemand_Action()
	 * @see #getAbstractInternalControlFlowAction()
	 * @generated
	 */
	EReference getAbstractInternalControlFlowAction_ResourceDemand_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.AbstractInternalControlFlowAction#getInfrastructureCall__Action <em>Infrastructure Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Call Action</em>'.
	 * @see pcm.seff.AbstractInternalControlFlowAction#getInfrastructureCall__Action()
	 * @see #getAbstractInternalControlFlowAction()
	 * @generated
	 */
	EReference getAbstractInternalControlFlowAction_InfrastructureCall__Action();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.AbstractInternalControlFlowAction#getResourceCall__Action <em>Resource Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Call Action</em>'.
	 * @see pcm.seff.AbstractInternalControlFlowAction#getResourceCall__Action()
	 * @see #getAbstractInternalControlFlowAction()
	 * @generated
	 */
	EReference getAbstractInternalControlFlowAction_ResourceCall__Action();

	/**
	 * Returns the meta object for class '{@link pcm.seff.AbstractAction <em>Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Action</em>'.
	 * @see pcm.seff.AbstractAction
	 * @generated
	 */
	EClass getAbstractAction();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.AbstractAction#getPredecessor_AbstractAction <em>Predecessor Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor Abstract Action</em>'.
	 * @see pcm.seff.AbstractAction#getPredecessor_AbstractAction()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_Predecessor_AbstractAction();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.AbstractAction#getSuccessor_AbstractAction <em>Successor Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor Abstract Action</em>'.
	 * @see pcm.seff.AbstractAction#getSuccessor_AbstractAction()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_Successor_AbstractAction();

	/**
	 * Returns the meta object for the container reference '{@link pcm.seff.AbstractAction#getResourceDemandingBehaviour_AbstractAction <em>Resource Demanding Behaviour Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Demanding Behaviour Abstract Action</em>'.
	 * @see pcm.seff.AbstractAction#getResourceDemandingBehaviour_AbstractAction()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_ResourceDemandingBehaviour_AbstractAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.ResourceDemandingBehaviour <em>Resource Demanding Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Demanding Behaviour</em>'.
	 * @see pcm.seff.ResourceDemandingBehaviour
	 * @generated
	 */
	EClass getResourceDemandingBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link pcm.seff.ResourceDemandingBehaviour#getAbstractLoopAction_ResourceDemandingBehaviour <em>Abstract Loop Action Resource Demanding Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Abstract Loop Action Resource Demanding Behaviour</em>'.
	 * @see pcm.seff.ResourceDemandingBehaviour#getAbstractLoopAction_ResourceDemandingBehaviour()
	 * @see #getResourceDemandingBehaviour()
	 * @generated
	 */
	EReference getResourceDemandingBehaviour_AbstractLoopAction_ResourceDemandingBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link pcm.seff.ResourceDemandingBehaviour#getAbstractBranchTransition_ResourceDemandingBehaviour <em>Abstract Branch Transition Resource Demanding Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Abstract Branch Transition Resource Demanding Behaviour</em>'.
	 * @see pcm.seff.ResourceDemandingBehaviour#getAbstractBranchTransition_ResourceDemandingBehaviour()
	 * @see #getResourceDemandingBehaviour()
	 * @generated
	 */
	EReference getResourceDemandingBehaviour_AbstractBranchTransition_ResourceDemandingBehaviour();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.ResourceDemandingBehaviour#getSteps_Behaviour <em>Steps Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps Behaviour</em>'.
	 * @see pcm.seff.ResourceDemandingBehaviour#getSteps_Behaviour()
	 * @see #getResourceDemandingBehaviour()
	 * @generated
	 */
	EReference getResourceDemandingBehaviour_Steps_Behaviour();

	/**
	 * Returns the meta object for the '{@link pcm.seff.ResourceDemandingBehaviour#startActionNeedsRouteToStopAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Action Needs Route To Stop Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Action Needs Route To Stop Action</em>' operation.
	 * @see pcm.seff.ResourceDemandingBehaviour#startActionNeedsRouteToStopAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResourceDemandingBehaviour__StartActionNeedsRouteToStopAction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link pcm.seff.AbstractLoopAction <em>Abstract Loop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Loop Action</em>'.
	 * @see pcm.seff.AbstractLoopAction
	 * @generated
	 */
	EClass getAbstractLoopAction();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.seff.AbstractLoopAction#getBodyBehaviour_Loop <em>Body Behaviour Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Behaviour Loop</em>'.
	 * @see pcm.seff.AbstractLoopAction#getBodyBehaviour_Loop()
	 * @see #getAbstractLoopAction()
	 * @generated
	 */
	EReference getAbstractLoopAction_BodyBehaviour_Loop();

	/**
	 * Returns the meta object for class '{@link pcm.seff.AbstractBranchTransition <em>Abstract Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Branch Transition</em>'.
	 * @see pcm.seff.AbstractBranchTransition
	 * @generated
	 */
	EClass getAbstractBranchTransition();

	/**
	 * Returns the meta object for the container reference '{@link pcm.seff.AbstractBranchTransition#getBranchAction_AbstractBranchTransition <em>Branch Action Abstract Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Branch Action Abstract Branch Transition</em>'.
	 * @see pcm.seff.AbstractBranchTransition#getBranchAction_AbstractBranchTransition()
	 * @see #getAbstractBranchTransition()
	 * @generated
	 */
	EReference getAbstractBranchTransition_BranchAction_AbstractBranchTransition();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.seff.AbstractBranchTransition#getBranchBehaviour_BranchTransition <em>Branch Behaviour Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branch Behaviour Branch Transition</em>'.
	 * @see pcm.seff.AbstractBranchTransition#getBranchBehaviour_BranchTransition()
	 * @see #getAbstractBranchTransition()
	 * @generated
	 */
	EReference getAbstractBranchTransition_BranchBehaviour_BranchTransition();

	/**
	 * Returns the meta object for class '{@link pcm.seff.BranchAction <em>Branch Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Action</em>'.
	 * @see pcm.seff.BranchAction
	 * @generated
	 */
	EClass getBranchAction();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.BranchAction#getBranches_Branch <em>Branches Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches Branch</em>'.
	 * @see pcm.seff.BranchAction#getBranches_Branch()
	 * @see #getBranchAction()
	 * @generated
	 */
	EReference getBranchAction_Branches_Branch();

	/**
	 * Returns the meta object for class '{@link pcm.seff.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Action</em>'.
	 * @see pcm.seff.CallAction
	 * @generated
	 */
	EClass getCallAction();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.CallAction#getInputVariableUsages__CallAction <em>Input Variable Usages Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Variable Usages Call Action</em>'.
	 * @see pcm.seff.CallAction#getInputVariableUsages__CallAction()
	 * @see #getCallAction()
	 * @generated
	 */
	EReference getCallAction_InputVariableUsages__CallAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.StartAction <em>Start Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Action</em>'.
	 * @see pcm.seff.StartAction
	 * @generated
	 */
	EClass getStartAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.ServiceEffectSpecification <em>Service Effect Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Effect Specification</em>'.
	 * @see pcm.seff.ServiceEffectSpecification
	 * @generated
	 */
	EClass getServiceEffectSpecification();

	/**
	 * Returns the meta object for the attribute '{@link pcm.seff.ServiceEffectSpecification#getSeffTypeID <em>Seff Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seff Type ID</em>'.
	 * @see pcm.seff.ServiceEffectSpecification#getSeffTypeID()
	 * @see #getServiceEffectSpecification()
	 * @generated
	 */
	EAttribute getServiceEffectSpecification_SeffTypeID();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.ServiceEffectSpecification#getDescribedService__SEFF <em>Described Service SEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Described Service SEFF</em>'.
	 * @see pcm.seff.ServiceEffectSpecification#getDescribedService__SEFF()
	 * @see #getServiceEffectSpecification()
	 * @generated
	 */
	EReference getServiceEffectSpecification_DescribedService__SEFF();

	/**
	 * Returns the meta object for the container reference '{@link pcm.seff.ServiceEffectSpecification#getBasicComponent_ServiceEffectSpecification <em>Basic Component Service Effect Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Basic Component Service Effect Specification</em>'.
	 * @see pcm.seff.ServiceEffectSpecification#getBasicComponent_ServiceEffectSpecification()
	 * @see #getServiceEffectSpecification()
	 * @generated
	 */
	EReference getServiceEffectSpecification_BasicComponent_ServiceEffectSpecification();

	/**
	 * Returns the meta object for class '{@link pcm.seff.ResourceDemandingSEFF <em>Resource Demanding SEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Demanding SEFF</em>'.
	 * @see pcm.seff.ResourceDemandingSEFF
	 * @generated
	 */
	EClass getResourceDemandingSEFF();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.ResourceDemandingSEFF#getResourceDemandingInternalBehaviours <em>Resource Demanding Internal Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Demanding Internal Behaviours</em>'.
	 * @see pcm.seff.ResourceDemandingSEFF#getResourceDemandingInternalBehaviours()
	 * @see #getResourceDemandingSEFF()
	 * @generated
	 */
	EReference getResourceDemandingSEFF_ResourceDemandingInternalBehaviours();

	/**
	 * Returns the meta object for class '{@link pcm.seff.ResourceDemandingInternalBehaviour <em>Resource Demanding Internal Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Demanding Internal Behaviour</em>'.
	 * @see pcm.seff.ResourceDemandingInternalBehaviour
	 * @generated
	 */
	EClass getResourceDemandingInternalBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link pcm.seff.ResourceDemandingInternalBehaviour#getResourceDemandingSEFF_ResourceDemandingInternalBehaviour <em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource Demanding SEFF Resource Demanding Internal Behaviour</em>'.
	 * @see pcm.seff.ResourceDemandingInternalBehaviour#getResourceDemandingSEFF_ResourceDemandingInternalBehaviour()
	 * @see #getResourceDemandingInternalBehaviour()
	 * @generated
	 */
	EReference getResourceDemandingInternalBehaviour_ResourceDemandingSEFF_ResourceDemandingInternalBehaviour();

	/**
	 * Returns the meta object for class '{@link pcm.seff.ReleaseAction <em>Release Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Action</em>'.
	 * @see pcm.seff.ReleaseAction
	 * @generated
	 */
	EClass getReleaseAction();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.ReleaseAction#getPassiveResource_ReleaseAction <em>Passive Resource Release Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passive Resource Release Action</em>'.
	 * @see pcm.seff.ReleaseAction#getPassiveResource_ReleaseAction()
	 * @see #getReleaseAction()
	 * @generated
	 */
	EReference getReleaseAction_PassiveResource_ReleaseAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.LoopAction <em>Loop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Action</em>'.
	 * @see pcm.seff.LoopAction
	 * @generated
	 */
	EClass getLoopAction();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.seff.LoopAction#getIterationCount_LoopAction <em>Iteration Count Loop Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iteration Count Loop Action</em>'.
	 * @see pcm.seff.LoopAction#getIterationCount_LoopAction()
	 * @see #getLoopAction()
	 * @generated
	 */
	EReference getLoopAction_IterationCount_LoopAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.ForkAction <em>Fork Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Action</em>'.
	 * @see pcm.seff.ForkAction
	 * @generated
	 */
	EClass getForkAction();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.ForkAction#getAsynchronousForkedBehaviours_ForkAction <em>Asynchronous Forked Behaviours Fork Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynchronous Forked Behaviours Fork Action</em>'.
	 * @see pcm.seff.ForkAction#getAsynchronousForkedBehaviours_ForkAction()
	 * @see #getForkAction()
	 * @generated
	 */
	EReference getForkAction_AsynchronousForkedBehaviours_ForkAction();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.seff.ForkAction#getSynchronisingBehaviours_ForkAction <em>Synchronising Behaviours Fork Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synchronising Behaviours Fork Action</em>'.
	 * @see pcm.seff.ForkAction#getSynchronisingBehaviours_ForkAction()
	 * @see #getForkAction()
	 * @generated
	 */
	EReference getForkAction_SynchronisingBehaviours_ForkAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.ForkedBehaviour <em>Forked Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Behaviour</em>'.
	 * @see pcm.seff.ForkedBehaviour
	 * @generated
	 */
	EClass getForkedBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link pcm.seff.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour <em>Synchronisation Point Forked Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Synchronisation Point Forked Behaviour</em>'.
	 * @see pcm.seff.ForkedBehaviour#getSynchronisationPoint_ForkedBehaviour()
	 * @see #getForkedBehaviour()
	 * @generated
	 */
	EReference getForkedBehaviour_SynchronisationPoint_ForkedBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link pcm.seff.ForkedBehaviour#getForkAction_ForkedBehaivour <em>Fork Action Forked Behaivour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fork Action Forked Behaivour</em>'.
	 * @see pcm.seff.ForkedBehaviour#getForkAction_ForkedBehaivour()
	 * @see #getForkedBehaviour()
	 * @generated
	 */
	EReference getForkedBehaviour_ForkAction_ForkedBehaivour();

	/**
	 * Returns the meta object for class '{@link pcm.seff.SynchronisationPoint <em>Synchronisation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronisation Point</em>'.
	 * @see pcm.seff.SynchronisationPoint
	 * @generated
	 */
	EClass getSynchronisationPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.SynchronisationPoint#getOutputParameterUsage_SynchronisationPoint <em>Output Parameter Usage Synchronisation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter Usage Synchronisation Point</em>'.
	 * @see pcm.seff.SynchronisationPoint#getOutputParameterUsage_SynchronisationPoint()
	 * @see #getSynchronisationPoint()
	 * @generated
	 */
	EReference getSynchronisationPoint_OutputParameterUsage_SynchronisationPoint();

	/**
	 * Returns the meta object for the container reference '{@link pcm.seff.SynchronisationPoint#getForkAction_SynchronisationPoint <em>Fork Action Synchronisation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fork Action Synchronisation Point</em>'.
	 * @see pcm.seff.SynchronisationPoint#getForkAction_SynchronisationPoint()
	 * @see #getSynchronisationPoint()
	 * @generated
	 */
	EReference getSynchronisationPoint_ForkAction_SynchronisationPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.SynchronisationPoint#getSynchronousForkedBehaviours_SynchronisationPoint <em>Synchronous Forked Behaviours Synchronisation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronous Forked Behaviours Synchronisation Point</em>'.
	 * @see pcm.seff.SynchronisationPoint#getSynchronousForkedBehaviours_SynchronisationPoint()
	 * @see #getSynchronisationPoint()
	 * @generated
	 */
	EReference getSynchronisationPoint_SynchronousForkedBehaviours_SynchronisationPoint();

	/**
	 * Returns the meta object for class '{@link pcm.seff.ExternalCallAction <em>External Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Call Action</em>'.
	 * @see pcm.seff.ExternalCallAction
	 * @generated
	 */
	EClass getExternalCallAction();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.ExternalCallAction#getCalledService_ExternalService <em>Called Service External Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Service External Service</em>'.
	 * @see pcm.seff.ExternalCallAction#getCalledService_ExternalService()
	 * @see #getExternalCallAction()
	 * @generated
	 */
	EReference getExternalCallAction_CalledService_ExternalService();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.ExternalCallAction#getRole_ExternalService <em>Role External Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role External Service</em>'.
	 * @see pcm.seff.ExternalCallAction#getRole_ExternalService()
	 * @see #getExternalCallAction()
	 * @generated
	 */
	EReference getExternalCallAction_Role_ExternalService();

	/**
	 * Returns the meta object for the attribute '{@link pcm.seff.ExternalCallAction#getRetryCount <em>Retry Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Count</em>'.
	 * @see pcm.seff.ExternalCallAction#getRetryCount()
	 * @see #getExternalCallAction()
	 * @generated
	 */
	EAttribute getExternalCallAction_RetryCount();

	/**
	 * Returns the meta object for class '{@link pcm.seff.CallReturnAction <em>Call Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Return Action</em>'.
	 * @see pcm.seff.CallReturnAction
	 * @generated
	 */
	EClass getCallReturnAction();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.CallReturnAction#getReturnVariableUsage__CallReturnAction <em>Return Variable Usage Call Return Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Variable Usage Call Return Action</em>'.
	 * @see pcm.seff.CallReturnAction#getReturnVariableUsage__CallReturnAction()
	 * @see #getCallReturnAction()
	 * @generated
	 */
	EReference getCallReturnAction_ReturnVariableUsage__CallReturnAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.ProbabilisticBranchTransition <em>Probabilistic Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probabilistic Branch Transition</em>'.
	 * @see pcm.seff.ProbabilisticBranchTransition
	 * @generated
	 */
	EClass getProbabilisticBranchTransition();

	/**
	 * Returns the meta object for the attribute '{@link pcm.seff.ProbabilisticBranchTransition#getBranchProbability <em>Branch Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Probability</em>'.
	 * @see pcm.seff.ProbabilisticBranchTransition#getBranchProbability()
	 * @see #getProbabilisticBranchTransition()
	 * @generated
	 */
	EAttribute getProbabilisticBranchTransition_BranchProbability();

	/**
	 * Returns the meta object for class '{@link pcm.seff.AcquireAction <em>Acquire Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acquire Action</em>'.
	 * @see pcm.seff.AcquireAction
	 * @generated
	 */
	EClass getAcquireAction();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.AcquireAction#getPassiveresource_AcquireAction <em>Passiveresource Acquire Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passiveresource Acquire Action</em>'.
	 * @see pcm.seff.AcquireAction#getPassiveresource_AcquireAction()
	 * @see #getAcquireAction()
	 * @generated
	 */
	EReference getAcquireAction_Passiveresource_AcquireAction();

	/**
	 * Returns the meta object for the attribute '{@link pcm.seff.AcquireAction#isTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see pcm.seff.AcquireAction#isTimeout()
	 * @see #getAcquireAction()
	 * @generated
	 */
	EAttribute getAcquireAction_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link pcm.seff.AcquireAction#getTimeoutValue <em>Timeout Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Value</em>'.
	 * @see pcm.seff.AcquireAction#getTimeoutValue()
	 * @see #getAcquireAction()
	 * @generated
	 */
	EAttribute getAcquireAction_TimeoutValue();

	/**
	 * Returns the meta object for class '{@link pcm.seff.CollectionIteratorAction <em>Collection Iterator Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Iterator Action</em>'.
	 * @see pcm.seff.CollectionIteratorAction
	 * @generated
	 */
	EClass getCollectionIteratorAction();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.CollectionIteratorAction#getParameter_CollectionIteratorAction <em>Parameter Collection Iterator Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Collection Iterator Action</em>'.
	 * @see pcm.seff.CollectionIteratorAction#getParameter_CollectionIteratorAction()
	 * @see #getCollectionIteratorAction()
	 * @generated
	 */
	EReference getCollectionIteratorAction_Parameter_CollectionIteratorAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.GuardedBranchTransition <em>Guarded Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarded Branch Transition</em>'.
	 * @see pcm.seff.GuardedBranchTransition
	 * @generated
	 */
	EClass getGuardedBranchTransition();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.seff.GuardedBranchTransition#getBranchCondition_GuardedBranchTransition <em>Branch Condition Guarded Branch Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branch Condition Guarded Branch Transition</em>'.
	 * @see pcm.seff.GuardedBranchTransition#getBranchCondition_GuardedBranchTransition()
	 * @see #getGuardedBranchTransition()
	 * @generated
	 */
	EReference getGuardedBranchTransition_BranchCondition_GuardedBranchTransition();

	/**
	 * Returns the meta object for class '{@link pcm.seff.SetVariableAction <em>Set Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Variable Action</em>'.
	 * @see pcm.seff.SetVariableAction
	 * @generated
	 */
	EClass getSetVariableAction();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.SetVariableAction#getLocalVariableUsages_SetVariableAction <em>Local Variable Usages Set Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variable Usages Set Variable Action</em>'.
	 * @see pcm.seff.SetVariableAction#getLocalVariableUsages_SetVariableAction()
	 * @see #getSetVariableAction()
	 * @generated
	 */
	EReference getSetVariableAction_LocalVariableUsages_SetVariableAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.InternalCallAction <em>Internal Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Call Action</em>'.
	 * @see pcm.seff.InternalCallAction
	 * @generated
	 */
	EClass getInternalCallAction();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.InternalCallAction#getCalledResourceDemandingInternalBehaviour <em>Called Resource Demanding Internal Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Resource Demanding Internal Behaviour</em>'.
	 * @see pcm.seff.InternalCallAction#getCalledResourceDemandingInternalBehaviour()
	 * @see #getInternalCallAction()
	 * @generated
	 */
	EReference getInternalCallAction_CalledResourceDemandingInternalBehaviour();

	/**
	 * Returns the meta object for class '{@link pcm.seff.EmitEventAction <em>Emit Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emit Event Action</em>'.
	 * @see pcm.seff.EmitEventAction
	 * @generated
	 */
	EClass getEmitEventAction();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.EmitEventAction#getEventType__EmitEventAction <em>Event Type Emit Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type Emit Event Action</em>'.
	 * @see pcm.seff.EmitEventAction#getEventType__EmitEventAction()
	 * @see #getEmitEventAction()
	 * @generated
	 */
	EReference getEmitEventAction_EventType__EmitEventAction();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.EmitEventAction#getSourceRole__EmitEventAction <em>Source Role Emit Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Role Emit Event Action</em>'.
	 * @see pcm.seff.EmitEventAction#getSourceRole__EmitEventAction()
	 * @see #getEmitEventAction()
	 * @generated
	 */
	EReference getEmitEventAction_SourceRole__EmitEventAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.InternalAction <em>Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action</em>'.
	 * @see pcm.seff.InternalAction
	 * @generated
	 */
	EClass getInternalAction();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.InternalAction#getInternalFailureOccurrenceDescriptions__InternalAction <em>Internal Failure Occurrence Descriptions Internal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Failure Occurrence Descriptions Internal Action</em>'.
	 * @see pcm.seff.InternalAction#getInternalFailureOccurrenceDescriptions__InternalAction()
	 * @see #getInternalAction()
	 * @generated
	 */
	EReference getInternalAction_InternalFailureOccurrenceDescriptions__InternalAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SeffFactory getSeffFactory();

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
		 * The meta object literal for the '{@link pcm.seff.impl.StopActionImpl <em>Stop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.StopActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getStopAction()
		 * @generated
		 */
		EClass STOP_ACTION = eINSTANCE.getStopAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.AbstractInternalControlFlowActionImpl <em>Abstract Internal Control Flow Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.AbstractInternalControlFlowActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getAbstractInternalControlFlowAction()
		 * @generated
		 */
		EClass ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION = eINSTANCE.getAbstractInternalControlFlowAction();

		/**
		 * The meta object literal for the '<em><b>Resource Demand Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION = eINSTANCE.getAbstractInternalControlFlowAction_ResourceDemand_Action();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Call Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION = eINSTANCE.getAbstractInternalControlFlowAction_InfrastructureCall__Action();

		/**
		 * The meta object literal for the '<em><b>Resource Call Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION = eINSTANCE.getAbstractInternalControlFlowAction_ResourceCall__Action();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.AbstractActionImpl <em>Abstract Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.AbstractActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getAbstractAction()
		 * @generated
		 */
		EClass ABSTRACT_ACTION = eINSTANCE.getAbstractAction();

		/**
		 * The meta object literal for the '<em><b>Predecessor Abstract Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__PREDECESSOR_ABSTRACT_ACTION = eINSTANCE.getAbstractAction_Predecessor_AbstractAction();

		/**
		 * The meta object literal for the '<em><b>Successor Abstract Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__SUCCESSOR_ABSTRACT_ACTION = eINSTANCE.getAbstractAction_Successor_AbstractAction();

		/**
		 * The meta object literal for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = eINSTANCE.getAbstractAction_ResourceDemandingBehaviour_AbstractAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.ResourceDemandingBehaviourImpl <em>Resource Demanding Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.ResourceDemandingBehaviourImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getResourceDemandingBehaviour()
		 * @generated
		 */
		EClass RESOURCE_DEMANDING_BEHAVIOUR = eINSTANCE.getResourceDemandingBehaviour();

		/**
		 * The meta object literal for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = eINSTANCE.getResourceDemandingBehaviour_AbstractLoopAction_ResourceDemandingBehaviour();

		/**
		 * The meta object literal for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DEMANDING_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = eINSTANCE.getResourceDemandingBehaviour_AbstractBranchTransition_ResourceDemandingBehaviour();

		/**
		 * The meta object literal for the '<em><b>Steps Behaviour</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DEMANDING_BEHAVIOUR__STEPS_BEHAVIOUR = eINSTANCE.getResourceDemandingBehaviour_Steps_Behaviour();

		/**
		 * The meta object literal for the '<em><b>Start Action Needs Route To Stop Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_DEMANDING_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResourceDemandingBehaviour__StartActionNeedsRouteToStopAction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.AbstractLoopActionImpl <em>Abstract Loop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.AbstractLoopActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getAbstractLoopAction()
		 * @generated
		 */
		EClass ABSTRACT_LOOP_ACTION = eINSTANCE.getAbstractLoopAction();

		/**
		 * The meta object literal for the '<em><b>Body Behaviour Loop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LOOP_ACTION__BODY_BEHAVIOUR_LOOP = eINSTANCE.getAbstractLoopAction_BodyBehaviour_Loop();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.AbstractBranchTransitionImpl <em>Abstract Branch Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.AbstractBranchTransitionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getAbstractBranchTransition()
		 * @generated
		 */
		EClass ABSTRACT_BRANCH_TRANSITION = eINSTANCE.getAbstractBranchTransition();

		/**
		 * The meta object literal for the '<em><b>Branch Action Abstract Branch Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BRANCH_TRANSITION__BRANCH_ACTION_ABSTRACT_BRANCH_TRANSITION = eINSTANCE.getAbstractBranchTransition_BranchAction_AbstractBranchTransition();

		/**
		 * The meta object literal for the '<em><b>Branch Behaviour Branch Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BRANCH_TRANSITION__BRANCH_BEHAVIOUR_BRANCH_TRANSITION = eINSTANCE.getAbstractBranchTransition_BranchBehaviour_BranchTransition();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.BranchActionImpl <em>Branch Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.BranchActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getBranchAction()
		 * @generated
		 */
		EClass BRANCH_ACTION = eINSTANCE.getBranchAction();

		/**
		 * The meta object literal for the '<em><b>Branches Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_ACTION__BRANCHES_BRANCH = eINSTANCE.getBranchAction_Branches_Branch();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.CallActionImpl <em>Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.CallActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getCallAction()
		 * @generated
		 */
		EClass CALL_ACTION = eINSTANCE.getCallAction();

		/**
		 * The meta object literal for the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTION__INPUT_VARIABLE_USAGES_CALL_ACTION = eINSTANCE.getCallAction_InputVariableUsages__CallAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.StartActionImpl <em>Start Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.StartActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getStartAction()
		 * @generated
		 */
		EClass START_ACTION = eINSTANCE.getStartAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.ServiceEffectSpecificationImpl <em>Service Effect Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.ServiceEffectSpecificationImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getServiceEffectSpecification()
		 * @generated
		 */
		EClass SERVICE_EFFECT_SPECIFICATION = eINSTANCE.getServiceEffectSpecification();

		/**
		 * The meta object literal for the '<em><b>Seff Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_EFFECT_SPECIFICATION__SEFF_TYPE_ID = eINSTANCE.getServiceEffectSpecification_SeffTypeID();

		/**
		 * The meta object literal for the '<em><b>Described Service SEFF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_EFFECT_SPECIFICATION__DESCRIBED_SERVICE_SEFF = eINSTANCE.getServiceEffectSpecification_DescribedService__SEFF();

		/**
		 * The meta object literal for the '<em><b>Basic Component Service Effect Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_EFFECT_SPECIFICATION__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION = eINSTANCE.getServiceEffectSpecification_BasicComponent_ServiceEffectSpecification();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.ResourceDemandingSEFFImpl <em>Resource Demanding SEFF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.ResourceDemandingSEFFImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getResourceDemandingSEFF()
		 * @generated
		 */
		EClass RESOURCE_DEMANDING_SEFF = eINSTANCE.getResourceDemandingSEFF();

		/**
		 * The meta object literal for the '<em><b>Resource Demanding Internal Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS = eINSTANCE.getResourceDemandingSEFF_ResourceDemandingInternalBehaviours();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.ResourceDemandingInternalBehaviourImpl <em>Resource Demanding Internal Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.ResourceDemandingInternalBehaviourImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getResourceDemandingInternalBehaviour()
		 * @generated
		 */
		EClass RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR = eINSTANCE.getResourceDemandingInternalBehaviour();

		/**
		 * The meta object literal for the '<em><b>Resource Demanding SEFF Resource Demanding Internal Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR__RESOURCE_DEMANDING_SEFF_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR = eINSTANCE.getResourceDemandingInternalBehaviour_ResourceDemandingSEFF_ResourceDemandingInternalBehaviour();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.ReleaseActionImpl <em>Release Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.ReleaseActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getReleaseAction()
		 * @generated
		 */
		EClass RELEASE_ACTION = eINSTANCE.getReleaseAction();

		/**
		 * The meta object literal for the '<em><b>Passive Resource Release Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_ACTION__PASSIVE_RESOURCE_RELEASE_ACTION = eINSTANCE.getReleaseAction_PassiveResource_ReleaseAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.LoopActionImpl <em>Loop Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.LoopActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getLoopAction()
		 * @generated
		 */
		EClass LOOP_ACTION = eINSTANCE.getLoopAction();

		/**
		 * The meta object literal for the '<em><b>Iteration Count Loop Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_ACTION__ITERATION_COUNT_LOOP_ACTION = eINSTANCE.getLoopAction_IterationCount_LoopAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.ForkActionImpl <em>Fork Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.ForkActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getForkAction()
		 * @generated
		 */
		EClass FORK_ACTION = eINSTANCE.getForkAction();

		/**
		 * The meta object literal for the '<em><b>Asynchronous Forked Behaviours Fork Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_ACTION__ASYNCHRONOUS_FORKED_BEHAVIOURS_FORK_ACTION = eINSTANCE.getForkAction_AsynchronousForkedBehaviours_ForkAction();

		/**
		 * The meta object literal for the '<em><b>Synchronising Behaviours Fork Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_ACTION__SYNCHRONISING_BEHAVIOURS_FORK_ACTION = eINSTANCE.getForkAction_SynchronisingBehaviours_ForkAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.ForkedBehaviourImpl <em>Forked Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.ForkedBehaviourImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getForkedBehaviour()
		 * @generated
		 */
		EClass FORKED_BEHAVIOUR = eINSTANCE.getForkedBehaviour();

		/**
		 * The meta object literal for the '<em><b>Synchronisation Point Forked Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_BEHAVIOUR__SYNCHRONISATION_POINT_FORKED_BEHAVIOUR = eINSTANCE.getForkedBehaviour_SynchronisationPoint_ForkedBehaviour();

		/**
		 * The meta object literal for the '<em><b>Fork Action Forked Behaivour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORKED_BEHAVIOUR__FORK_ACTION_FORKED_BEHAIVOUR = eINSTANCE.getForkedBehaviour_ForkAction_ForkedBehaivour();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.SynchronisationPointImpl <em>Synchronisation Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.SynchronisationPointImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getSynchronisationPoint()
		 * @generated
		 */
		EClass SYNCHRONISATION_POINT = eINSTANCE.getSynchronisationPoint();

		/**
		 * The meta object literal for the '<em><b>Output Parameter Usage Synchronisation Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISATION_POINT__OUTPUT_PARAMETER_USAGE_SYNCHRONISATION_POINT = eINSTANCE.getSynchronisationPoint_OutputParameterUsage_SynchronisationPoint();

		/**
		 * The meta object literal for the '<em><b>Fork Action Synchronisation Point</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISATION_POINT__FORK_ACTION_SYNCHRONISATION_POINT = eINSTANCE.getSynchronisationPoint_ForkAction_SynchronisationPoint();

		/**
		 * The meta object literal for the '<em><b>Synchronous Forked Behaviours Synchronisation Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISATION_POINT__SYNCHRONOUS_FORKED_BEHAVIOURS_SYNCHRONISATION_POINT = eINSTANCE.getSynchronisationPoint_SynchronousForkedBehaviours_SynchronisationPoint();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.ExternalCallActionImpl <em>External Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.ExternalCallActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getExternalCallAction()
		 * @generated
		 */
		EClass EXTERNAL_CALL_ACTION = eINSTANCE.getExternalCallAction();

		/**
		 * The meta object literal for the '<em><b>Called Service External Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CALL_ACTION__CALLED_SERVICE_EXTERNAL_SERVICE = eINSTANCE.getExternalCallAction_CalledService_ExternalService();

		/**
		 * The meta object literal for the '<em><b>Role External Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CALL_ACTION__ROLE_EXTERNAL_SERVICE = eINSTANCE.getExternalCallAction_Role_ExternalService();

		/**
		 * The meta object literal for the '<em><b>Retry Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_CALL_ACTION__RETRY_COUNT = eINSTANCE.getExternalCallAction_RetryCount();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.CallReturnActionImpl <em>Call Return Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.CallReturnActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getCallReturnAction()
		 * @generated
		 */
		EClass CALL_RETURN_ACTION = eINSTANCE.getCallReturnAction();

		/**
		 * The meta object literal for the '<em><b>Return Variable Usage Call Return Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_RETURN_ACTION__RETURN_VARIABLE_USAGE_CALL_RETURN_ACTION = eINSTANCE.getCallReturnAction_ReturnVariableUsage__CallReturnAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.ProbabilisticBranchTransitionImpl <em>Probabilistic Branch Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.ProbabilisticBranchTransitionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getProbabilisticBranchTransition()
		 * @generated
		 */
		EClass PROBABILISTIC_BRANCH_TRANSITION = eINSTANCE.getProbabilisticBranchTransition();

		/**
		 * The meta object literal for the '<em><b>Branch Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBABILISTIC_BRANCH_TRANSITION__BRANCH_PROBABILITY = eINSTANCE.getProbabilisticBranchTransition_BranchProbability();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.AcquireActionImpl <em>Acquire Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.AcquireActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getAcquireAction()
		 * @generated
		 */
		EClass ACQUIRE_ACTION = eINSTANCE.getAcquireAction();

		/**
		 * The meta object literal for the '<em><b>Passiveresource Acquire Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACQUIRE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION = eINSTANCE.getAcquireAction_Passiveresource_AcquireAction();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUIRE_ACTION__TIMEOUT = eINSTANCE.getAcquireAction_Timeout();

		/**
		 * The meta object literal for the '<em><b>Timeout Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUIRE_ACTION__TIMEOUT_VALUE = eINSTANCE.getAcquireAction_TimeoutValue();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.CollectionIteratorActionImpl <em>Collection Iterator Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.CollectionIteratorActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getCollectionIteratorAction()
		 * @generated
		 */
		EClass COLLECTION_ITERATOR_ACTION = eINSTANCE.getCollectionIteratorAction();

		/**
		 * The meta object literal for the '<em><b>Parameter Collection Iterator Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_ITERATOR_ACTION__PARAMETER_COLLECTION_ITERATOR_ACTION = eINSTANCE.getCollectionIteratorAction_Parameter_CollectionIteratorAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.GuardedBranchTransitionImpl <em>Guarded Branch Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.GuardedBranchTransitionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getGuardedBranchTransition()
		 * @generated
		 */
		EClass GUARDED_BRANCH_TRANSITION = eINSTANCE.getGuardedBranchTransition();

		/**
		 * The meta object literal for the '<em><b>Branch Condition Guarded Branch Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARDED_BRANCH_TRANSITION__BRANCH_CONDITION_GUARDED_BRANCH_TRANSITION = eINSTANCE.getGuardedBranchTransition_BranchCondition_GuardedBranchTransition();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.SetVariableActionImpl <em>Set Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.SetVariableActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getSetVariableAction()
		 * @generated
		 */
		EClass SET_VARIABLE_ACTION = eINSTANCE.getSetVariableAction();

		/**
		 * The meta object literal for the '<em><b>Local Variable Usages Set Variable Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VARIABLE_ACTION__LOCAL_VARIABLE_USAGES_SET_VARIABLE_ACTION = eINSTANCE.getSetVariableAction_LocalVariableUsages_SetVariableAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.InternalCallActionImpl <em>Internal Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.InternalCallActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getInternalCallAction()
		 * @generated
		 */
		EClass INTERNAL_CALL_ACTION = eINSTANCE.getInternalCallAction();

		/**
		 * The meta object literal for the '<em><b>Called Resource Demanding Internal Behaviour</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_CALL_ACTION__CALLED_RESOURCE_DEMANDING_INTERNAL_BEHAVIOUR = eINSTANCE.getInternalCallAction_CalledResourceDemandingInternalBehaviour();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.EmitEventActionImpl <em>Emit Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.EmitEventActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getEmitEventAction()
		 * @generated
		 */
		EClass EMIT_EVENT_ACTION = eINSTANCE.getEmitEventAction();

		/**
		 * The meta object literal for the '<em><b>Event Type Emit Event Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMIT_EVENT_ACTION__EVENT_TYPE_EMIT_EVENT_ACTION = eINSTANCE.getEmitEventAction_EventType__EmitEventAction();

		/**
		 * The meta object literal for the '<em><b>Source Role Emit Event Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMIT_EVENT_ACTION__SOURCE_ROLE_EMIT_EVENT_ACTION = eINSTANCE.getEmitEventAction_SourceRole__EmitEventAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.impl.InternalActionImpl <em>Internal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.impl.InternalActionImpl
		 * @see pcm.seff.impl.SeffPackageImpl#getInternalAction()
		 * @generated
		 */
		EClass INTERNAL_ACTION = eINSTANCE.getInternalAction();

		/**
		 * The meta object literal for the '<em><b>Internal Failure Occurrence Descriptions Internal Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ACTION__INTERNAL_FAILURE_OCCURRENCE_DESCRIPTIONS_INTERNAL_ACTION = eINSTANCE.getInternalAction_InternalFailureOccurrenceDescriptions__InternalAction();

	}

} //SeffPackage

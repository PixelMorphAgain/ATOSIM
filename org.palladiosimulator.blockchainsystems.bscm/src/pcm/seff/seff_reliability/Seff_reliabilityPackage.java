/**
 */
package pcm.seff.seff_reliability;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pcm.core.entity.EntityPackage;

import pcm.seff.SeffPackage;

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
 * @see pcm.seff.seff_reliability.Seff_reliabilityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG'"
 * @generated
 */
public interface Seff_reliabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "seff_reliability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/SEFF/SEFF_Reliability/5.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "seff_reliability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Seff_reliabilityPackage eINSTANCE = pcm.seff.seff_reliability.impl.Seff_reliabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcm.seff.seff_reliability.impl.FailureHandlingEntityImpl <em>Failure Handling Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.seff_reliability.impl.FailureHandlingEntityImpl
	 * @see pcm.seff.seff_reliability.impl.Seff_reliabilityPackageImpl#getFailureHandlingEntity()
	 * @generated
	 */
	int FAILURE_HANDLING_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Failure Handling Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___ECLASS = EntityPackage.ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___EIS_PROXY = EntityPackage.ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___ERESOURCE = EntityPackage.ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___ECONTAINER = EntityPackage.ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___ECONTAINING_FEATURE = EntityPackage.ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___ECONTAINMENT_FEATURE = EntityPackage.ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___ECONTENTS = EntityPackage.ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___EALL_CONTENTS = EntityPackage.ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___ECROSS_REFERENCES = EntityPackage.ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___EGET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN = EntityPackage.ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT = EntityPackage.ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___EIS_SET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___EUNSET__ESTRUCTURALFEATURE = EntityPackage.ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY___EINVOKE__EOPERATION_ELIST = EntityPackage.ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Failure Handling Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_HANDLING_ENTITY_OPERATION_COUNT = EntityPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.seff.seff_reliability.impl.RecoveryActionBehaviourImpl <em>Recovery Action Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.seff_reliability.impl.RecoveryActionBehaviourImpl
	 * @see pcm.seff.seff_reliability.impl.Seff_reliabilityPackageImpl#getRecoveryActionBehaviour()
	 * @generated
	 */
	int RECOVERY_ACTION_BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__ID = FAILURE_HANDLING_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__ENTITY_NAME = FAILURE_HANDLING_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY;

	/**
	 * The feature id for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Steps Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__STEPS_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Failure Handling Alternatives Recovery Action Behaviour</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recovery Action Recovery Action Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Recovery Action Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR_FEATURE_COUNT = FAILURE_HANDLING_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___ECLASS = FAILURE_HANDLING_ENTITY___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___EIS_PROXY = FAILURE_HANDLING_ENTITY___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___ERESOURCE = FAILURE_HANDLING_ENTITY___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___ECONTAINER = FAILURE_HANDLING_ENTITY___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___ECONTAINING_FEATURE = FAILURE_HANDLING_ENTITY___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___ECONTAINMENT_FEATURE = FAILURE_HANDLING_ENTITY___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___ECONTENTS = FAILURE_HANDLING_ENTITY___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___EALL_CONTENTS = FAILURE_HANDLING_ENTITY___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___ECROSS_REFERENCES = FAILURE_HANDLING_ENTITY___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___EGET__ESTRUCTURALFEATURE = FAILURE_HANDLING_ENTITY___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___EGET__ESTRUCTURALFEATURE_BOOLEAN = FAILURE_HANDLING_ENTITY___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___ESET__ESTRUCTURALFEATURE_OBJECT = FAILURE_HANDLING_ENTITY___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___EIS_SET__ESTRUCTURALFEATURE = FAILURE_HANDLING_ENTITY___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___EUNSET__ESTRUCTURALFEATURE = FAILURE_HANDLING_ENTITY___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___EINVOKE__EOPERATION_ELIST = FAILURE_HANDLING_ENTITY___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Start Action Needs Route To Stop Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR___START_ACTION_NEEDS_ROUTE_TO_STOP_ACTION__DIAGNOSTICCHAIN_MAP = FAILURE_HANDLING_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recovery Action Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_BEHAVIOUR_OPERATION_COUNT = FAILURE_HANDLING_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link pcm.seff.seff_reliability.impl.RecoveryActionImpl <em>Recovery Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.seff.seff_reliability.impl.RecoveryActionImpl
	 * @see pcm.seff.seff_reliability.impl.Seff_reliabilityPackageImpl#getRecoveryAction()
	 * @generated
	 */
	int RECOVERY_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__ID = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__ENTITY_NAME = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Predecessor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__PREDECESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__PREDECESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Successor Abstract Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__SUCCESSOR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__SUCCESSOR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demanding Behaviour Abstract Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMANDING_BEHAVIOUR_ABSTRACT_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Demand Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__RESOURCE_DEMAND_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_DEMAND_ACTION;

	/**
	 * The feature id for the '<em><b>Infrastructure Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__INFRASTRUCTURE_CALL_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__INFRASTRUCTURE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Resource Call Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__RESOURCE_CALL_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION__RESOURCE_CALL_ACTION;

	/**
	 * The feature id for the '<em><b>Primary Behaviour Recovery Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recovery Action Behaviours Recovery Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recovery Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_FEATURE_COUNT = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___ECLASS = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___EIS_PROXY = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___ERESOURCE = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___ECONTAINER = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___ECONTAINING_FEATURE = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___ECONTAINMENT_FEATURE = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___ECONTENTS = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___EALL_CONTENTS = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___ECROSS_REFERENCES = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___EGET__ESTRUCTURALFEATURE = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___EIS_SET__ESTRUCTURALFEATURE = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___EUNSET__ESTRUCTURALFEATURE = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION___EINVOKE__EOPERATION_ELIST = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Recovery Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_ACTION_OPERATION_COUNT = SeffPackage.ABSTRACT_INTERNAL_CONTROL_FLOW_ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcm.seff.seff_reliability.RecoveryActionBehaviour <em>Recovery Action Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recovery Action Behaviour</em>'.
	 * @see pcm.seff.seff_reliability.RecoveryActionBehaviour
	 * @generated
	 */
	EClass getRecoveryActionBehaviour();

	/**
	 * Returns the meta object for the reference list '{@link pcm.seff.seff_reliability.RecoveryActionBehaviour#getFailureHandlingAlternatives__RecoveryActionBehaviour <em>Failure Handling Alternatives Recovery Action Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failure Handling Alternatives Recovery Action Behaviour</em>'.
	 * @see pcm.seff.seff_reliability.RecoveryActionBehaviour#getFailureHandlingAlternatives__RecoveryActionBehaviour()
	 * @see #getRecoveryActionBehaviour()
	 * @generated
	 */
	EReference getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour();

	/**
	 * Returns the meta object for the container reference '{@link pcm.seff.seff_reliability.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour <em>Recovery Action Recovery Action Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recovery Action Recovery Action Behaviour</em>'.
	 * @see pcm.seff.seff_reliability.RecoveryActionBehaviour#getRecoveryAction__RecoveryActionBehaviour()
	 * @see #getRecoveryActionBehaviour()
	 * @generated
	 */
	EReference getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour();

	/**
	 * Returns the meta object for class '{@link pcm.seff.seff_reliability.RecoveryAction <em>Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recovery Action</em>'.
	 * @see pcm.seff.seff_reliability.RecoveryAction
	 * @generated
	 */
	EClass getRecoveryAction();

	/**
	 * Returns the meta object for the reference '{@link pcm.seff.seff_reliability.RecoveryAction#getPrimaryBehaviour__RecoveryAction <em>Primary Behaviour Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Behaviour Recovery Action</em>'.
	 * @see pcm.seff.seff_reliability.RecoveryAction#getPrimaryBehaviour__RecoveryAction()
	 * @see #getRecoveryAction()
	 * @generated
	 */
	EReference getRecoveryAction_PrimaryBehaviour__RecoveryAction();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.seff.seff_reliability.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction <em>Recovery Action Behaviours Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recovery Action Behaviours Recovery Action</em>'.
	 * @see pcm.seff.seff_reliability.RecoveryAction#getRecoveryActionBehaviours__RecoveryAction()
	 * @see #getRecoveryAction()
	 * @generated
	 */
	EReference getRecoveryAction_RecoveryActionBehaviours__RecoveryAction();

	/**
	 * Returns the meta object for class '{@link pcm.seff.seff_reliability.FailureHandlingEntity <em>Failure Handling Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Handling Entity</em>'.
	 * @see pcm.seff.seff_reliability.FailureHandlingEntity
	 * @generated
	 */
	EClass getFailureHandlingEntity();

	/**
	 * Returns the meta object for the reference list '{@link pcm.seff.seff_reliability.FailureHandlingEntity#getFailureTypes_FailureHandlingEntity <em>Failure Types Failure Handling Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failure Types Failure Handling Entity</em>'.
	 * @see pcm.seff.seff_reliability.FailureHandlingEntity#getFailureTypes_FailureHandlingEntity()
	 * @see #getFailureHandlingEntity()
	 * @generated
	 */
	EReference getFailureHandlingEntity_FailureTypes_FailureHandlingEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Seff_reliabilityFactory getSeff_reliabilityFactory();

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
		 * The meta object literal for the '{@link pcm.seff.seff_reliability.impl.RecoveryActionBehaviourImpl <em>Recovery Action Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.seff_reliability.impl.RecoveryActionBehaviourImpl
		 * @see pcm.seff.seff_reliability.impl.Seff_reliabilityPackageImpl#getRecoveryActionBehaviour()
		 * @generated
		 */
		EClass RECOVERY_ACTION_BEHAVIOUR = eINSTANCE.getRecoveryActionBehaviour();

		/**
		 * The meta object literal for the '<em><b>Failure Handling Alternatives Recovery Action Behaviour</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY_ACTION_BEHAVIOUR__FAILURE_HANDLING_ALTERNATIVES_RECOVERY_ACTION_BEHAVIOUR = eINSTANCE.getRecoveryActionBehaviour_FailureHandlingAlternatives__RecoveryActionBehaviour();

		/**
		 * The meta object literal for the '<em><b>Recovery Action Recovery Action Behaviour</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY_ACTION_BEHAVIOUR__RECOVERY_ACTION_RECOVERY_ACTION_BEHAVIOUR = eINSTANCE.getRecoveryActionBehaviour_RecoveryAction__RecoveryActionBehaviour();

		/**
		 * The meta object literal for the '{@link pcm.seff.seff_reliability.impl.RecoveryActionImpl <em>Recovery Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.seff_reliability.impl.RecoveryActionImpl
		 * @see pcm.seff.seff_reliability.impl.Seff_reliabilityPackageImpl#getRecoveryAction()
		 * @generated
		 */
		EClass RECOVERY_ACTION = eINSTANCE.getRecoveryAction();

		/**
		 * The meta object literal for the '<em><b>Primary Behaviour Recovery Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY_ACTION__PRIMARY_BEHAVIOUR_RECOVERY_ACTION = eINSTANCE.getRecoveryAction_PrimaryBehaviour__RecoveryAction();

		/**
		 * The meta object literal for the '<em><b>Recovery Action Behaviours Recovery Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY_ACTION__RECOVERY_ACTION_BEHAVIOURS_RECOVERY_ACTION = eINSTANCE.getRecoveryAction_RecoveryActionBehaviours__RecoveryAction();

		/**
		 * The meta object literal for the '{@link pcm.seff.seff_reliability.impl.FailureHandlingEntityImpl <em>Failure Handling Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.seff.seff_reliability.impl.FailureHandlingEntityImpl
		 * @see pcm.seff.seff_reliability.impl.Seff_reliabilityPackageImpl#getFailureHandlingEntity()
		 * @generated
		 */
		EClass FAILURE_HANDLING_ENTITY = eINSTANCE.getFailureHandlingEntity();

		/**
		 * The meta object literal for the '<em><b>Failure Types Failure Handling Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_HANDLING_ENTITY__FAILURE_TYPES_FAILURE_HANDLING_ENTITY = eINSTANCE.getFailureHandlingEntity_FailureTypes_FailureHandlingEntity();

	}

} //Seff_reliabilityPackage

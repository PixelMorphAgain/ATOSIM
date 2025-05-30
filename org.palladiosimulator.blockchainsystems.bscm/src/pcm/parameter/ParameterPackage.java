/**
 */
package pcm.parameter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pcm.PcmPackage;

import stoex.StoexPackage;

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
 * The parameter package allows to model data dependent performance characteristics of software systems. It is mainly used to specify performance dependencies on input and output parameters of single service calls. It can also be used to describe dependencies on the state of components by the use of component parameters. The latter describe stochastically a component state which does not change over time. 
 * 
 * Parameters are described by the use of variable usages which on the one side contain a performance abstraction of the variable's value and on the other side the name of the variable for refering to the variable. Characterisations available include Structure (information on the data's internal structure like "sorted" or "unsorted" for an array), Number of Elements (size of a collection), Value (the actuall variable value), Bytesize (the variable's memory footprint), or type (the type of the variable in polymorphic cases).
 * 
 * Example for variable usages may be a.NUMBER_OF_ELEMENTS = 10 (array "a" contains 10 elements), tree.STRUCTURE = "balanced" (tree "tree" is a balanced tree), and so on.
 * <!-- end-model-doc -->
 * @see pcm.parameter.ParameterFactory
 * @model kind="package"
 * @generated
 */
public interface ParameterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parameter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/Parameter/5.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parameter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterPackage eINSTANCE = pcm.parameter.impl.ParameterPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcm.parameter.impl.VariableUsageImpl <em>Variable Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.parameter.impl.VariableUsageImpl
	 * @see pcm.parameter.impl.ParameterPackageImpl#getVariableUsage()
	 * @generated
	 */
	int VARIABLE_USAGE = 0;

	/**
	 * The feature id for the '<em><b>Variable Characterisation Variable Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Data Variable Usage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__USER_DATA_VARIABLE_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Call Action Variable Usage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__CALL_ACTION_VARIABLE_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Synchronisation Point Variable Usage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__SYNCHRONISATION_POINT_VARIABLE_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Call Return Action Variable Usage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__CALL_RETURN_ACTION_VARIABLE_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Set Variable Action Variable Usage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__SET_VARIABLE_ACTION_VARIABLE_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Specified Output Parameter Abstraction expected External Outputs Variable Usage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION_EXPECTED_EXTERNAL_OUTPUTS_VARIABLE_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assembly Context Variable Usage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__ASSEMBLY_CONTEXT_VARIABLE_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Entry Level System Call Input Parameter Usage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__ENTRY_LEVEL_SYSTEM_CALL_INPUT_PARAMETER_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Entry Level System Call Output Parameter Usage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__ENTRY_LEVEL_SYSTEM_CALL_OUTPUT_PARAMETER_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Named Reference Variable Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Variable Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_FEATURE_COUNT = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___ECLASS = PcmPackage.PCM_BASE_CLASS___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___EIS_PROXY = PcmPackage.PCM_BASE_CLASS___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___ERESOURCE = PcmPackage.PCM_BASE_CLASS___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___ECONTAINER = PcmPackage.PCM_BASE_CLASS___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___ECONTAINING_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___ECONTAINMENT_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___ECONTENTS = PcmPackage.PCM_BASE_CLASS___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___EALL_CONTENTS = PcmPackage.PCM_BASE_CLASS___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___ECROSS_REFERENCES = PcmPackage.PCM_BASE_CLASS___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___EGET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___EGET__ESTRUCTURALFEATURE_BOOLEAN = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___ESET__ESTRUCTURALFEATURE_OBJECT = PcmPackage.PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___EIS_SET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___EUNSET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE___EINVOKE__EOPERATION_ELIST = PcmPackage.PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Variable Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_OPERATION_COUNT = PcmPackage.PCM_BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.parameter.impl.VariableCharacterisationImpl <em>Variable Characterisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.parameter.impl.VariableCharacterisationImpl
	 * @see pcm.parameter.impl.ParameterPackageImpl#getVariableCharacterisation()
	 * @generated
	 */
	int VARIABLE_CHARACTERISATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION__TYPE = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification Variable Characterisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Usage Variable Characterisation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Characterisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION_FEATURE_COUNT = PcmPackage.PCM_BASE_CLASS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___ECLASS = PcmPackage.PCM_BASE_CLASS___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___EIS_PROXY = PcmPackage.PCM_BASE_CLASS___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___ERESOURCE = PcmPackage.PCM_BASE_CLASS___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___ECONTAINER = PcmPackage.PCM_BASE_CLASS___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___ECONTAINING_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___ECONTAINMENT_FEATURE = PcmPackage.PCM_BASE_CLASS___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___ECONTENTS = PcmPackage.PCM_BASE_CLASS___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___EALL_CONTENTS = PcmPackage.PCM_BASE_CLASS___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___ECROSS_REFERENCES = PcmPackage.PCM_BASE_CLASS___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___EGET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___EGET__ESTRUCTURALFEATURE_BOOLEAN = PcmPackage.PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___ESET__ESTRUCTURALFEATURE_OBJECT = PcmPackage.PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___EIS_SET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___EUNSET__ESTRUCTURALFEATURE = PcmPackage.PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION___EINVOKE__EOPERATION_ELIST = PcmPackage.PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Variable Characterisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CHARACTERISATION_OPERATION_COUNT = PcmPackage.PCM_BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcm.parameter.impl.CharacterisedVariableImpl <em>Characterised Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.parameter.impl.CharacterisedVariableImpl
	 * @see pcm.parameter.impl.ParameterPackageImpl#getCharacterisedVariable()
	 * @generated
	 */
	int CHARACTERISED_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Id Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE__ID_VARIABLE = StoexPackage.VARIABLE__ID_VARIABLE;

	/**
	 * The feature id for the '<em><b>Characterisation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE__CHARACTERISATION_TYPE = StoexPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characterised Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE_FEATURE_COUNT = StoexPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___ECLASS = StoexPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___EIS_PROXY = StoexPackage.VARIABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___ERESOURCE = StoexPackage.VARIABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___ECONTAINER = StoexPackage.VARIABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___ECONTAINING_FEATURE = StoexPackage.VARIABLE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___ECONTAINMENT_FEATURE = StoexPackage.VARIABLE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___ECONTENTS = StoexPackage.VARIABLE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___EALL_CONTENTS = StoexPackage.VARIABLE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___ECROSS_REFERENCES = StoexPackage.VARIABLE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___EGET__ESTRUCTURALFEATURE = StoexPackage.VARIABLE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___EGET__ESTRUCTURALFEATURE_BOOLEAN = StoexPackage.VARIABLE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___ESET__ESTRUCTURALFEATURE_OBJECT = StoexPackage.VARIABLE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___EIS_SET__ESTRUCTURALFEATURE = StoexPackage.VARIABLE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___EUNSET__ESTRUCTURALFEATURE = StoexPackage.VARIABLE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE___EINVOKE__EOPERATION_ELIST = StoexPackage.VARIABLE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Characterised Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISED_VARIABLE_OPERATION_COUNT = StoexPackage.VARIABLE_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link pcm.parameter.VariableCharacterisationType <em>Variable Characterisation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.parameter.VariableCharacterisationType
	 * @see pcm.parameter.impl.ParameterPackageImpl#getVariableCharacterisationType()
	 * @generated
	 */
	int VARIABLE_CHARACTERISATION_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link pcm.parameter.VariableUsage <em>Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Usage</em>'.
	 * @see pcm.parameter.VariableUsage
	 * @generated
	 */
	EClass getVariableUsage();

	/**
	 * Returns the meta object for the containment reference list '{@link pcm.parameter.VariableUsage#getVariableCharacterisation_VariableUsage <em>Variable Characterisation Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Characterisation Variable Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getVariableCharacterisation_VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_VariableCharacterisation_VariableUsage();

	/**
	 * Returns the meta object for the container reference '{@link pcm.parameter.VariableUsage#getUserData_VariableUsage <em>User Data Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>User Data Variable Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getUserData_VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_UserData_VariableUsage();

	/**
	 * Returns the meta object for the container reference '{@link pcm.parameter.VariableUsage#getCallAction__VariableUsage <em>Call Action Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Call Action Variable Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getCallAction__VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_CallAction__VariableUsage();

	/**
	 * Returns the meta object for the container reference '{@link pcm.parameter.VariableUsage#getSynchronisationPoint_VariableUsage <em>Synchronisation Point Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Synchronisation Point Variable Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getSynchronisationPoint_VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_SynchronisationPoint_VariableUsage();

	/**
	 * Returns the meta object for the container reference '{@link pcm.parameter.VariableUsage#getCallReturnAction__VariableUsage <em>Call Return Action Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Call Return Action Variable Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getCallReturnAction__VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_CallReturnAction__VariableUsage();

	/**
	 * Returns the meta object for the container reference '{@link pcm.parameter.VariableUsage#getSetVariableAction_VariableUsage <em>Set Variable Action Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Set Variable Action Variable Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getSetVariableAction_VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_SetVariableAction_VariableUsage();

	/**
	 * Returns the meta object for the container reference '{@link pcm.parameter.VariableUsage#getSpecifiedOutputParameterAbstraction_expectedExternalOutputs_VariableUsage <em>Specified Output Parameter Abstraction expected External Outputs Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specified Output Parameter Abstraction expected External Outputs Variable Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getSpecifiedOutputParameterAbstraction_expectedExternalOutputs_VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_SpecifiedOutputParameterAbstraction_expectedExternalOutputs_VariableUsage();

	/**
	 * Returns the meta object for the container reference '{@link pcm.parameter.VariableUsage#getAssemblyContext__VariableUsage <em>Assembly Context Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assembly Context Variable Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getAssemblyContext__VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_AssemblyContext__VariableUsage();

	/**
	 * Returns the meta object for the container reference '{@link pcm.parameter.VariableUsage#getEntryLevelSystemCall_InputParameterUsage <em>Entry Level System Call Input Parameter Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entry Level System Call Input Parameter Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getEntryLevelSystemCall_InputParameterUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_EntryLevelSystemCall_InputParameterUsage();

	/**
	 * Returns the meta object for the container reference '{@link pcm.parameter.VariableUsage#getEntryLevelSystemCall_OutputParameterUsage <em>Entry Level System Call Output Parameter Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entry Level System Call Output Parameter Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getEntryLevelSystemCall_OutputParameterUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_EntryLevelSystemCall_OutputParameterUsage();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.parameter.VariableUsage#getNamedReference__VariableUsage <em>Named Reference Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Reference Variable Usage</em>'.
	 * @see pcm.parameter.VariableUsage#getNamedReference__VariableUsage()
	 * @see #getVariableUsage()
	 * @generated
	 */
	EReference getVariableUsage_NamedReference__VariableUsage();

	/**
	 * Returns the meta object for class '{@link pcm.parameter.VariableCharacterisation <em>Variable Characterisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Characterisation</em>'.
	 * @see pcm.parameter.VariableCharacterisation
	 * @generated
	 */
	EClass getVariableCharacterisation();

	/**
	 * Returns the meta object for the attribute '{@link pcm.parameter.VariableCharacterisation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pcm.parameter.VariableCharacterisation#getType()
	 * @see #getVariableCharacterisation()
	 * @generated
	 */
	EAttribute getVariableCharacterisation_Type();

	/**
	 * Returns the meta object for the containment reference '{@link pcm.parameter.VariableCharacterisation#getSpecification_VariableCharacterisation <em>Specification Variable Characterisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification Variable Characterisation</em>'.
	 * @see pcm.parameter.VariableCharacterisation#getSpecification_VariableCharacterisation()
	 * @see #getVariableCharacterisation()
	 * @generated
	 */
	EReference getVariableCharacterisation_Specification_VariableCharacterisation();

	/**
	 * Returns the meta object for the container reference '{@link pcm.parameter.VariableCharacterisation#getVariableUsage_VariableCharacterisation <em>Variable Usage Variable Characterisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Usage Variable Characterisation</em>'.
	 * @see pcm.parameter.VariableCharacterisation#getVariableUsage_VariableCharacterisation()
	 * @see #getVariableCharacterisation()
	 * @generated
	 */
	EReference getVariableCharacterisation_VariableUsage_VariableCharacterisation();

	/**
	 * Returns the meta object for class '{@link pcm.parameter.CharacterisedVariable <em>Characterised Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characterised Variable</em>'.
	 * @see pcm.parameter.CharacterisedVariable
	 * @generated
	 */
	EClass getCharacterisedVariable();

	/**
	 * Returns the meta object for the attribute '{@link pcm.parameter.CharacterisedVariable#getCharacterisationType <em>Characterisation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characterisation Type</em>'.
	 * @see pcm.parameter.CharacterisedVariable#getCharacterisationType()
	 * @see #getCharacterisedVariable()
	 * @generated
	 */
	EAttribute getCharacterisedVariable_CharacterisationType();

	/**
	 * Returns the meta object for enum '{@link pcm.parameter.VariableCharacterisationType <em>Variable Characterisation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Characterisation Type</em>'.
	 * @see pcm.parameter.VariableCharacterisationType
	 * @generated
	 */
	EEnum getVariableCharacterisationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParameterFactory getParameterFactory();

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
		 * The meta object literal for the '{@link pcm.parameter.impl.VariableUsageImpl <em>Variable Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.parameter.impl.VariableUsageImpl
		 * @see pcm.parameter.impl.ParameterPackageImpl#getVariableUsage()
		 * @generated
		 */
		EClass VARIABLE_USAGE = eINSTANCE.getVariableUsage();

		/**
		 * The meta object literal for the '<em><b>Variable Characterisation Variable Usage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__VARIABLE_CHARACTERISATION_VARIABLE_USAGE = eINSTANCE.getVariableUsage_VariableCharacterisation_VariableUsage();

		/**
		 * The meta object literal for the '<em><b>User Data Variable Usage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__USER_DATA_VARIABLE_USAGE = eINSTANCE.getVariableUsage_UserData_VariableUsage();

		/**
		 * The meta object literal for the '<em><b>Call Action Variable Usage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__CALL_ACTION_VARIABLE_USAGE = eINSTANCE.getVariableUsage_CallAction__VariableUsage();

		/**
		 * The meta object literal for the '<em><b>Synchronisation Point Variable Usage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__SYNCHRONISATION_POINT_VARIABLE_USAGE = eINSTANCE.getVariableUsage_SynchronisationPoint_VariableUsage();

		/**
		 * The meta object literal for the '<em><b>Call Return Action Variable Usage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__CALL_RETURN_ACTION_VARIABLE_USAGE = eINSTANCE.getVariableUsage_CallReturnAction__VariableUsage();

		/**
		 * The meta object literal for the '<em><b>Set Variable Action Variable Usage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__SET_VARIABLE_ACTION_VARIABLE_USAGE = eINSTANCE.getVariableUsage_SetVariableAction_VariableUsage();

		/**
		 * The meta object literal for the '<em><b>Specified Output Parameter Abstraction expected External Outputs Variable Usage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__SPECIFIED_OUTPUT_PARAMETER_ABSTRACTION_EXPECTED_EXTERNAL_OUTPUTS_VARIABLE_USAGE = eINSTANCE.getVariableUsage_SpecifiedOutputParameterAbstraction_expectedExternalOutputs_VariableUsage();

		/**
		 * The meta object literal for the '<em><b>Assembly Context Variable Usage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__ASSEMBLY_CONTEXT_VARIABLE_USAGE = eINSTANCE.getVariableUsage_AssemblyContext__VariableUsage();

		/**
		 * The meta object literal for the '<em><b>Entry Level System Call Input Parameter Usage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__ENTRY_LEVEL_SYSTEM_CALL_INPUT_PARAMETER_USAGE = eINSTANCE.getVariableUsage_EntryLevelSystemCall_InputParameterUsage();

		/**
		 * The meta object literal for the '<em><b>Entry Level System Call Output Parameter Usage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__ENTRY_LEVEL_SYSTEM_CALL_OUTPUT_PARAMETER_USAGE = eINSTANCE.getVariableUsage_EntryLevelSystemCall_OutputParameterUsage();

		/**
		 * The meta object literal for the '<em><b>Named Reference Variable Usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE__NAMED_REFERENCE_VARIABLE_USAGE = eINSTANCE.getVariableUsage_NamedReference__VariableUsage();

		/**
		 * The meta object literal for the '{@link pcm.parameter.impl.VariableCharacterisationImpl <em>Variable Characterisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.parameter.impl.VariableCharacterisationImpl
		 * @see pcm.parameter.impl.ParameterPackageImpl#getVariableCharacterisation()
		 * @generated
		 */
		EClass VARIABLE_CHARACTERISATION = eINSTANCE.getVariableCharacterisation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_CHARACTERISATION__TYPE = eINSTANCE.getVariableCharacterisation_Type();

		/**
		 * The meta object literal for the '<em><b>Specification Variable Characterisation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CHARACTERISATION__SPECIFICATION_VARIABLE_CHARACTERISATION = eINSTANCE.getVariableCharacterisation_Specification_VariableCharacterisation();

		/**
		 * The meta object literal for the '<em><b>Variable Usage Variable Characterisation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_CHARACTERISATION__VARIABLE_USAGE_VARIABLE_CHARACTERISATION = eINSTANCE.getVariableCharacterisation_VariableUsage_VariableCharacterisation();

		/**
		 * The meta object literal for the '{@link pcm.parameter.impl.CharacterisedVariableImpl <em>Characterised Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.parameter.impl.CharacterisedVariableImpl
		 * @see pcm.parameter.impl.ParameterPackageImpl#getCharacterisedVariable()
		 * @generated
		 */
		EClass CHARACTERISED_VARIABLE = eINSTANCE.getCharacterisedVariable();

		/**
		 * The meta object literal for the '<em><b>Characterisation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISED_VARIABLE__CHARACTERISATION_TYPE = eINSTANCE.getCharacterisedVariable_CharacterisationType();

		/**
		 * The meta object literal for the '{@link pcm.parameter.VariableCharacterisationType <em>Variable Characterisation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.parameter.VariableCharacterisationType
		 * @see pcm.parameter.impl.ParameterPackageImpl#getVariableCharacterisationType()
		 * @generated
		 */
		EEnum VARIABLE_CHARACTERISATION_TYPE = eINSTANCE.getVariableCharacterisationType();

	}

} //ParameterPackage

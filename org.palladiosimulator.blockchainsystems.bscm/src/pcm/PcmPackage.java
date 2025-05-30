/**
 */
package pcm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * This package is the root package of all packages of the Palladio Component Model (PCM).
 * <!-- end-model-doc -->
 * @see pcm.PcmFactory
 * @model kind="package"
 * @generated
 */
public interface PcmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/5.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmPackage eINSTANCE = pcm.impl.PcmPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcm.impl.PCMClassImpl <em>PCM Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.impl.PCMClassImpl
	 * @see pcm.impl.PcmPackageImpl#getPCMClass()
	 * @generated
	 */
	int PCM_CLASS = 1;

	/**
	 * The number of structural features of the '<em>PCM Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PCM Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcm.impl.PCMBaseClassImpl <em>PCM Base Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.impl.PCMBaseClassImpl
	 * @see pcm.impl.PcmPackageImpl#getPCMBaseClass()
	 * @generated
	 */
	int PCM_BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>PCM Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS_FEATURE_COUNT = PCM_CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___ECLASS = PCM_CLASS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___EIS_PROXY = PCM_CLASS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___ERESOURCE = PCM_CLASS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___ECONTAINER = PCM_CLASS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___ECONTAINING_FEATURE = PCM_CLASS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___ECONTAINMENT_FEATURE = PCM_CLASS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___ECONTENTS = PCM_CLASS_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___EALL_CONTENTS = PCM_CLASS_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___ECROSS_REFERENCES = PCM_CLASS_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE = PCM_CLASS_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN = PCM_CLASS_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT = PCM_CLASS_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE = PCM_CLASS_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE = PCM_CLASS_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST = PCM_CLASS_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>PCM Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_BASE_CLASS_OPERATION_COUNT = PCM_CLASS_OPERATION_COUNT + 15;

	/**
	 * The meta object id for the '{@link pcm.impl.DummyClassImpl <em>Dummy Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcm.impl.DummyClassImpl
	 * @see pcm.impl.PcmPackageImpl#getDummyClass()
	 * @generated
	 */
	int DUMMY_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Dummy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS_FEATURE_COUNT = PCM_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___ECLASS = PCM_BASE_CLASS___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___EIS_PROXY = PCM_BASE_CLASS___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___ERESOURCE = PCM_BASE_CLASS___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___ECONTAINER = PCM_BASE_CLASS___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___ECONTAINING_FEATURE = PCM_BASE_CLASS___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___ECONTAINMENT_FEATURE = PCM_BASE_CLASS___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___ECONTENTS = PCM_BASE_CLASS___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___EALL_CONTENTS = PCM_BASE_CLASS___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___ECROSS_REFERENCES = PCM_BASE_CLASS___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___EGET__ESTRUCTURALFEATURE = PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN = PCM_BASE_CLASS___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT = PCM_BASE_CLASS___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___EIS_SET__ESTRUCTURALFEATURE = PCM_BASE_CLASS___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___EUNSET__ESTRUCTURALFEATURE = PCM_BASE_CLASS___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS___EINVOKE__EOPERATION_ELIST = PCM_BASE_CLASS___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Dummy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_CLASS_OPERATION_COUNT = PCM_BASE_CLASS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcm.PCMBaseClass <em>PCM Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Base Class</em>'.
	 * @see pcm.PCMBaseClass
	 * @generated
	 */
	EClass getPCMBaseClass();

	/**
	 * Returns the meta object for class '{@link pcm.PCMClass <em>PCM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Class</em>'.
	 * @see pcm.PCMClass
	 * @generated
	 */
	EClass getPCMClass();

	/**
	 * Returns the meta object for class '{@link pcm.DummyClass <em>Dummy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy Class</em>'.
	 * @see pcm.DummyClass
	 * @generated
	 */
	EClass getDummyClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcmFactory getPcmFactory();

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
		 * The meta object literal for the '{@link pcm.impl.PCMBaseClassImpl <em>PCM Base Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.impl.PCMBaseClassImpl
		 * @see pcm.impl.PcmPackageImpl#getPCMBaseClass()
		 * @generated
		 */
		EClass PCM_BASE_CLASS = eINSTANCE.getPCMBaseClass();

		/**
		 * The meta object literal for the '{@link pcm.impl.PCMClassImpl <em>PCM Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.impl.PCMClassImpl
		 * @see pcm.impl.PcmPackageImpl#getPCMClass()
		 * @generated
		 */
		EClass PCM_CLASS = eINSTANCE.getPCMClass();

		/**
		 * The meta object literal for the '{@link pcm.impl.DummyClassImpl <em>Dummy Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcm.impl.DummyClassImpl
		 * @see pcm.impl.PcmPackageImpl#getDummyClass()
		 * @generated
		 */
		EClass DUMMY_CLASS = eINSTANCE.getDummyClass();

	}

} //PcmPackage

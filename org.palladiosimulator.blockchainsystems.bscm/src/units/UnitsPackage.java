/**
 */
package units;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see units.UnitsFactory
 * @model kind="package"
 * @generated
 */
public interface UnitsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "units";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/Units/2.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "units";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitsPackage eINSTANCE = units.impl.UnitsPackageImpl.init();

	/**
	 * The meta object id for the '{@link units.impl.UnitCarryingElementImpl <em>Unit Carrying Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see units.impl.UnitCarryingElementImpl
	 * @see units.impl.UnitsPackageImpl#getUnitCarryingElement()
	 * @generated
	 */
	int UNIT_CARRYING_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CARRYING_ELEMENT__UNIT = 0;

	/**
	 * The number of structural features of the '<em>Unit Carrying Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CARRYING_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unit Carrying Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CARRYING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link units.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see units.impl.UnitImpl
	 * @see units.impl.UnitsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link units.impl.BaseUnitImpl <em>Base Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see units.impl.BaseUnitImpl
	 * @see units.impl.UnitsPackageImpl#getBaseUnit()
	 * @generated
	 */
	int BASE_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT__NAME = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link units.impl.UnitRepositoryImpl <em>Unit Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see units.impl.UnitRepositoryImpl
	 * @see units.impl.UnitsPackageImpl#getUnitRepository()
	 * @generated
	 */
	int UNIT_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REPOSITORY__UNITS = 0;

	/**
	 * The number of structural features of the '<em>Unit Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unit Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link units.impl.UnitMultiplicationImpl <em>Unit Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see units.impl.UnitMultiplicationImpl
	 * @see units.impl.UnitsPackageImpl#getUnitMultiplication()
	 * @generated
	 */
	int UNIT_MULTIPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MULTIPLICATION__UNITS = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MULTIPLICATION_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unit Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_MULTIPLICATION_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link units.impl.UnitPowerImpl <em>Unit Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see units.impl.UnitPowerImpl
	 * @see units.impl.UnitsPackageImpl#getUnitPower()
	 * @generated
	 */
	int UNIT_POWER = 5;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POWER__UNIT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POWER__EXPONENT = UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POWER_FEATURE_COUNT = UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_POWER_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link units.impl.UnitDivisionImpl <em>Unit Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see units.impl.UnitDivisionImpl
	 * @see units.impl.UnitsPackageImpl#getUnitDivision()
	 * @generated
	 */
	int UNIT_DIVISION = 6;

	/**
	 * The feature id for the '<em><b>Dividend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DIVISION__DIVIDEND = UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Divisor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DIVISION__DIVISOR = UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DIVISION_FEATURE_COUNT = UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DIVISION_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link units.UnitNames <em>Unit Names</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see units.UnitNames
	 * @see units.impl.UnitsPackageImpl#getUnitNames()
	 * @generated
	 */
	int UNIT_NAMES = 7;


	/**
	 * Returns the meta object for class '{@link units.UnitCarryingElement <em>Unit Carrying Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Carrying Element</em>'.
	 * @see units.UnitCarryingElement
	 * @generated
	 */
	EClass getUnitCarryingElement();

	/**
	 * Returns the meta object for the containment reference '{@link units.UnitCarryingElement#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see units.UnitCarryingElement#getUnit()
	 * @see #getUnitCarryingElement()
	 * @generated
	 */
	EReference getUnitCarryingElement_Unit();

	/**
	 * Returns the meta object for class '{@link units.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see units.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link units.BaseUnit <em>Base Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Unit</em>'.
	 * @see units.BaseUnit
	 * @generated
	 */
	EClass getBaseUnit();

	/**
	 * Returns the meta object for the attribute '{@link units.BaseUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see units.BaseUnit#getName()
	 * @see #getBaseUnit()
	 * @generated
	 */
	EAttribute getBaseUnit_Name();

	/**
	 * Returns the meta object for class '{@link units.UnitRepository <em>Unit Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Repository</em>'.
	 * @see units.UnitRepository
	 * @generated
	 */
	EClass getUnitRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link units.UnitRepository#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see units.UnitRepository#getUnits()
	 * @see #getUnitRepository()
	 * @generated
	 */
	EReference getUnitRepository_Units();

	/**
	 * Returns the meta object for class '{@link units.UnitMultiplication <em>Unit Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Multiplication</em>'.
	 * @see units.UnitMultiplication
	 * @generated
	 */
	EClass getUnitMultiplication();

	/**
	 * Returns the meta object for the containment reference list '{@link units.UnitMultiplication#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see units.UnitMultiplication#getUnits()
	 * @see #getUnitMultiplication()
	 * @generated
	 */
	EReference getUnitMultiplication_Units();

	/**
	 * Returns the meta object for class '{@link units.UnitPower <em>Unit Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Power</em>'.
	 * @see units.UnitPower
	 * @generated
	 */
	EClass getUnitPower();

	/**
	 * Returns the meta object for the containment reference '{@link units.UnitPower#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see units.UnitPower#getUnit()
	 * @see #getUnitPower()
	 * @generated
	 */
	EReference getUnitPower_Unit();

	/**
	 * Returns the meta object for the attribute '{@link units.UnitPower#getExponent <em>Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent</em>'.
	 * @see units.UnitPower#getExponent()
	 * @see #getUnitPower()
	 * @generated
	 */
	EAttribute getUnitPower_Exponent();

	/**
	 * Returns the meta object for class '{@link units.UnitDivision <em>Unit Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Division</em>'.
	 * @see units.UnitDivision
	 * @generated
	 */
	EClass getUnitDivision();

	/**
	 * Returns the meta object for the containment reference '{@link units.UnitDivision#getDividend <em>Dividend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dividend</em>'.
	 * @see units.UnitDivision#getDividend()
	 * @see #getUnitDivision()
	 * @generated
	 */
	EReference getUnitDivision_Dividend();

	/**
	 * Returns the meta object for the containment reference '{@link units.UnitDivision#getDivisor <em>Divisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Divisor</em>'.
	 * @see units.UnitDivision#getDivisor()
	 * @see #getUnitDivision()
	 * @generated
	 */
	EReference getUnitDivision_Divisor();

	/**
	 * Returns the meta object for enum '{@link units.UnitNames <em>Unit Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Names</em>'.
	 * @see units.UnitNames
	 * @generated
	 */
	EEnum getUnitNames();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnitsFactory getUnitsFactory();

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
		 * The meta object literal for the '{@link units.impl.UnitCarryingElementImpl <em>Unit Carrying Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see units.impl.UnitCarryingElementImpl
		 * @see units.impl.UnitsPackageImpl#getUnitCarryingElement()
		 * @generated
		 */
		EClass UNIT_CARRYING_ELEMENT = eINSTANCE.getUnitCarryingElement();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CARRYING_ELEMENT__UNIT = eINSTANCE.getUnitCarryingElement_Unit();

		/**
		 * The meta object literal for the '{@link units.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see units.impl.UnitImpl
		 * @see units.impl.UnitsPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link units.impl.BaseUnitImpl <em>Base Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see units.impl.BaseUnitImpl
		 * @see units.impl.UnitsPackageImpl#getBaseUnit()
		 * @generated
		 */
		EClass BASE_UNIT = eINSTANCE.getBaseUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_UNIT__NAME = eINSTANCE.getBaseUnit_Name();

		/**
		 * The meta object literal for the '{@link units.impl.UnitRepositoryImpl <em>Unit Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see units.impl.UnitRepositoryImpl
		 * @see units.impl.UnitsPackageImpl#getUnitRepository()
		 * @generated
		 */
		EClass UNIT_REPOSITORY = eINSTANCE.getUnitRepository();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_REPOSITORY__UNITS = eINSTANCE.getUnitRepository_Units();

		/**
		 * The meta object literal for the '{@link units.impl.UnitMultiplicationImpl <em>Unit Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see units.impl.UnitMultiplicationImpl
		 * @see units.impl.UnitsPackageImpl#getUnitMultiplication()
		 * @generated
		 */
		EClass UNIT_MULTIPLICATION = eINSTANCE.getUnitMultiplication();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_MULTIPLICATION__UNITS = eINSTANCE.getUnitMultiplication_Units();

		/**
		 * The meta object literal for the '{@link units.impl.UnitPowerImpl <em>Unit Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see units.impl.UnitPowerImpl
		 * @see units.impl.UnitsPackageImpl#getUnitPower()
		 * @generated
		 */
		EClass UNIT_POWER = eINSTANCE.getUnitPower();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_POWER__UNIT = eINSTANCE.getUnitPower_Unit();

		/**
		 * The meta object literal for the '<em><b>Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_POWER__EXPONENT = eINSTANCE.getUnitPower_Exponent();

		/**
		 * The meta object literal for the '{@link units.impl.UnitDivisionImpl <em>Unit Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see units.impl.UnitDivisionImpl
		 * @see units.impl.UnitsPackageImpl#getUnitDivision()
		 * @generated
		 */
		EClass UNIT_DIVISION = eINSTANCE.getUnitDivision();

		/**
		 * The meta object literal for the '<em><b>Dividend</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_DIVISION__DIVIDEND = eINSTANCE.getUnitDivision_Dividend();

		/**
		 * The meta object literal for the '<em><b>Divisor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_DIVISION__DIVISOR = eINSTANCE.getUnitDivision_Divisor();

		/**
		 * The meta object literal for the '{@link units.UnitNames <em>Unit Names</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see units.UnitNames
		 * @see units.impl.UnitsPackageImpl#getUnitNames()
		 * @generated
		 */
		EEnum UNIT_NAMES = eINSTANCE.getUnitNames();

	}

} //UnitsPackage

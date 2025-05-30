/**
 */
package units;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see units.UnitsPackage
 * @generated
 */
public interface UnitsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitsFactory eINSTANCE = units.impl.UnitsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Base Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Unit</em>'.
	 * @generated
	 */
	BaseUnit createBaseUnit();

	/**
	 * Returns a new object of class '<em>Unit Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Repository</em>'.
	 * @generated
	 */
	UnitRepository createUnitRepository();

	/**
	 * Returns a new object of class '<em>Unit Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Multiplication</em>'.
	 * @generated
	 */
	UnitMultiplication createUnitMultiplication();

	/**
	 * Returns a new object of class '<em>Unit Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Power</em>'.
	 * @generated
	 */
	UnitPower createUnitPower();

	/**
	 * Returns a new object of class '<em>Unit Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Division</em>'.
	 * @generated
	 */
	UnitDivision createUnitDivision();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UnitsPackage getUnitsPackage();

} //UnitsFactory

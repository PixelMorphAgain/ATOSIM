/**
 */
package units;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link units.BaseUnit#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see units.UnitsPackage#getBaseUnit()
 * @model
 * @generated
 */
public interface BaseUnit extends Unit {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link units.UnitNames}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see units.UnitNames
	 * @see #setName(UnitNames)
	 * @see units.UnitsPackage#getBaseUnit_Name()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	UnitNames getName();

	/**
	 * Sets the value of the '{@link units.BaseUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see units.UnitNames
	 * @see #getName()
	 * @generated
	 */
	void setName(UnitNames value);

} // BaseUnit

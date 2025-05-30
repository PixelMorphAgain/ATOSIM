/**
 */
package units;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link units.UnitPower#getUnit <em>Unit</em>}</li>
 *   <li>{@link units.UnitPower#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @see units.UnitsPackage#getUnitPower()
 * @model
 * @generated
 */
public interface UnitPower extends Unit {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(Unit)
	 * @see units.UnitsPackage#getUnitPower_Unit()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link units.UnitPower#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(int)
	 * @see units.UnitsPackage#getUnitPower_Exponent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getExponent();

	/**
	 * Sets the value of the '{@link units.UnitPower#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(int value);

} // UnitPower

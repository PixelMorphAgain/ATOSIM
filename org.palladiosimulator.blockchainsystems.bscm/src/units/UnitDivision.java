/**
 */
package units;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link units.UnitDivision#getDividend <em>Dividend</em>}</li>
 *   <li>{@link units.UnitDivision#getDivisor <em>Divisor</em>}</li>
 * </ul>
 *
 * @see units.UnitsPackage#getUnitDivision()
 * @model
 * @generated
 */
public interface UnitDivision extends Unit {
	/**
	 * Returns the value of the '<em><b>Dividend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dividend</em>' containment reference.
	 * @see #setDividend(Unit)
	 * @see units.UnitsPackage#getUnitDivision_Dividend()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Unit getDividend();

	/**
	 * Sets the value of the '{@link units.UnitDivision#getDividend <em>Dividend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dividend</em>' containment reference.
	 * @see #getDividend()
	 * @generated
	 */
	void setDividend(Unit value);

	/**
	 * Returns the value of the '<em><b>Divisor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divisor</em>' containment reference.
	 * @see #setDivisor(Unit)
	 * @see units.UnitsPackage#getUnitDivision_Divisor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Unit getDivisor();

	/**
	 * Sets the value of the '{@link units.UnitDivision#getDivisor <em>Divisor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divisor</em>' containment reference.
	 * @see #getDivisor()
	 * @generated
	 */
	void setDivisor(Unit value);

} // UnitDivision

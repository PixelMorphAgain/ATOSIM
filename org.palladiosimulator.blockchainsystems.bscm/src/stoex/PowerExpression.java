/**
 */
package stoex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.PowerExpression#getBase <em>Base</em>}</li>
 *   <li>{@link stoex.PowerExpression#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getPowerExpression()
 * @model
 * @generated
 */
public interface PowerExpression extends Power {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(Power)
	 * @see stoex.StoexPackage#getPowerExpression_Base()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Power getBase();

	/**
	 * Sets the value of the '{@link stoex.PowerExpression#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Power value);

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' containment reference.
	 * @see #setExponent(Unary)
	 * @see stoex.StoexPackage#getPowerExpression_Exponent()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Unary getExponent();

	/**
	 * Sets the value of the '{@link stoex.PowerExpression#getExponent <em>Exponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' containment reference.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(Unary value);

} // PowerExpression

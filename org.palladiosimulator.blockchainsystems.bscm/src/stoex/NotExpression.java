/**
 */
package stoex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.NotExpression#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getNotExpression()
 * @model
 * @generated
 */
public interface NotExpression extends Unary {
	/**
	 * Returns the value of the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner</em>' containment reference.
	 * @see #setInner(Unary)
	 * @see stoex.StoexPackage#getNotExpression_Inner()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Unary getInner();

	/**
	 * Sets the value of the '{@link stoex.NotExpression#getInner <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner</em>' containment reference.
	 * @see #getInner()
	 * @generated
	 */
	void setInner(Unary value);

} // NotExpression

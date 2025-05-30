/**
 */
package stoex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.Parenthesis#getInnerExpression <em>Inner Expression</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getParenthesis()
 * @model
 * @generated
 */
public interface Parenthesis extends Atom {
	/**
	 * Returns the value of the '<em><b>Inner Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Expression</em>' containment reference.
	 * @see #setInnerExpression(Expression)
	 * @see stoex.StoexPackage#getParenthesis_InnerExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getInnerExpression();

	/**
	 * Sets the value of the '{@link stoex.Parenthesis#getInnerExpression <em>Inner Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Expression</em>' containment reference.
	 * @see #getInnerExpression()
	 * @generated
	 */
	void setInnerExpression(Expression value);

} // Parenthesis

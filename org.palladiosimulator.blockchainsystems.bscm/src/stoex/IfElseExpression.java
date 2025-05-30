/**
 */
package stoex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Else Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.IfElseExpression#getIfExpression <em>If Expression</em>}</li>
 *   <li>{@link stoex.IfElseExpression#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link stoex.IfElseExpression#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getIfElseExpression()
 * @model
 * @generated
 */
public interface IfElseExpression extends IfElse {
	/**
	 * Returns the value of the '<em><b>If Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Expression</em>' containment reference.
	 * @see #setIfExpression(BooleanExpression)
	 * @see stoex.StoexPackage#getIfElseExpression_IfExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanExpression getIfExpression();

	/**
	 * Sets the value of the '{@link stoex.IfElseExpression#getIfExpression <em>If Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Expression</em>' containment reference.
	 * @see #getIfExpression()
	 * @generated
	 */
	void setIfExpression(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(BooleanExpression)
	 * @see stoex.StoexPackage#getIfElseExpression_ElseExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanExpression getElseExpression();

	/**
	 * Sets the value of the '{@link stoex.IfElseExpression#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' containment reference.
	 * @see #setConditionExpression(BooleanExpression)
	 * @see stoex.StoexPackage#getIfElseExpression_ConditionExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanExpression getConditionExpression();

	/**
	 * Sets the value of the '{@link stoex.IfElseExpression#getConditionExpression <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' containment reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(BooleanExpression value);

} // IfElseExpression

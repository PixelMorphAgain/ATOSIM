/**
 */
package stoex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.BooleanOperatorExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link stoex.BooleanOperatorExpression#getRight <em>Right</em>}</li>
 *   <li>{@link stoex.BooleanOperatorExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getBooleanOperatorExpression()
 * @model
 * @generated
 */
public interface BooleanOperatorExpression extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(BooleanExpression)
	 * @see stoex.StoexPackage#getBooleanOperatorExpression_Left()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanExpression getLeft();

	/**
	 * Sets the value of the '{@link stoex.BooleanOperatorExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(BooleanExpression)
	 * @see stoex.StoexPackage#getBooleanOperatorExpression_Right()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanExpression getRight();

	/**
	 * Sets the value of the '{@link stoex.BooleanOperatorExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link stoex.BooleanOperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see stoex.BooleanOperations
	 * @see #setOperation(BooleanOperations)
	 * @see stoex.StoexPackage#getBooleanOperatorExpression_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BooleanOperations getOperation();

	/**
	 * Sets the value of the '{@link stoex.BooleanOperatorExpression#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see stoex.BooleanOperations
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(BooleanOperations value);

} // BooleanOperatorExpression

/**
 */
package stoex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.TermExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link stoex.TermExpression#getRight <em>Right</em>}</li>
 *   <li>{@link stoex.TermExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getTermExpression()
 * @model
 * @generated
 */
public interface TermExpression extends Term {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Term)
	 * @see stoex.StoexPackage#getTermExpression_Left()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Term getLeft();

	/**
	 * Sets the value of the '{@link stoex.TermExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Term value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Product)
	 * @see stoex.StoexPackage#getTermExpression_Right()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Product getRight();

	/**
	 * Sets the value of the '{@link stoex.TermExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Product value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link stoex.TermOperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see stoex.TermOperations
	 * @see #setOperation(TermOperations)
	 * @see stoex.StoexPackage#getTermExpression_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TermOperations getOperation();

	/**
	 * Sets the value of the '{@link stoex.TermExpression#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see stoex.TermOperations
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TermOperations value);

} // TermExpression

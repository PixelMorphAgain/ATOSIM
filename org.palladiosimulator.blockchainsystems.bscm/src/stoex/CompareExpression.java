/**
 */
package stoex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.CompareExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link stoex.CompareExpression#getRight <em>Right</em>}</li>
 *   <li>{@link stoex.CompareExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getCompareExpression()
 * @model
 * @generated
 */
public interface CompareExpression extends Comparison {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Term)
	 * @see stoex.StoexPackage#getCompareExpression_Left()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Term getLeft();

	/**
	 * Sets the value of the '{@link stoex.CompareExpression#getLeft <em>Left</em>}' containment reference.
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
	 * @see #setRight(Term)
	 * @see stoex.StoexPackage#getCompareExpression_Right()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Term getRight();

	/**
	 * Sets the value of the '{@link stoex.CompareExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Term value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link stoex.CompareOperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see stoex.CompareOperations
	 * @see #setOperation(CompareOperations)
	 * @see stoex.StoexPackage#getCompareExpression_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CompareOperations getOperation();

	/**
	 * Sets the value of the '{@link stoex.CompareExpression#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see stoex.CompareOperations
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(CompareOperations value);

} // CompareExpression

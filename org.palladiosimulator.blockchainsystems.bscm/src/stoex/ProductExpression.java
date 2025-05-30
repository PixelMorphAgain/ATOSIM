/**
 */
package stoex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.ProductExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link stoex.ProductExpression#getRight <em>Right</em>}</li>
 *   <li>{@link stoex.ProductExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getProductExpression()
 * @model
 * @generated
 */
public interface ProductExpression extends Product {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Product)
	 * @see stoex.StoexPackage#getProductExpression_Left()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Product getLeft();

	/**
	 * Sets the value of the '{@link stoex.ProductExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Product value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Power)
	 * @see stoex.StoexPackage#getProductExpression_Right()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Power getRight();

	/**
	 * Sets the value of the '{@link stoex.ProductExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Power value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link stoex.ProductOperations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see stoex.ProductOperations
	 * @see #setOperation(ProductOperations)
	 * @see stoex.StoexPackage#getProductExpression_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProductOperations getOperation();

	/**
	 * Sets the value of the '{@link stoex.ProductExpression#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see stoex.ProductOperations
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ProductOperations value);

} // ProductExpression

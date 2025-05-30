/**
 */
package stoex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.Variable#getId_Variable <em>Id Variable</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Atom {
	/**
	 * Returns the value of the '<em><b>Id Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Variable</em>' containment reference.
	 * @see #setId_Variable(AbstractNamedReference)
	 * @see stoex.StoexPackage#getVariable_Id_Variable()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AbstractNamedReference getId_Variable();

	/**
	 * Sets the value of the '{@link stoex.Variable#getId_Variable <em>Id Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Variable</em>' containment reference.
	 * @see #getId_Variable()
	 * @generated
	 */
	void setId_Variable(AbstractNamedReference value);

} // Variable

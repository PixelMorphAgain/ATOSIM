/**
 */
package stoex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.FunctionLiteral#getId <em>Id</em>}</li>
 *   <li>{@link stoex.FunctionLiteral#getParameters_FunctionLiteral <em>Parameters Function Literal</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getFunctionLiteral()
 * @model
 * @generated
 */
public interface FunctionLiteral extends Atom {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see stoex.StoexPackage#getFunctionLiteral_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link stoex.FunctionLiteral#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Parameters Function Literal</b></em>' containment reference list.
	 * The list contents are of type {@link stoex.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters Function Literal</em>' containment reference list.
	 * @see stoex.StoexPackage#getFunctionLiteral_Parameters_FunctionLiteral()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getParameters_FunctionLiteral();

} // FunctionLiteral

/**
 */
package stoex;

import probfunction.ProbabilityFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probability Function Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.ProbabilityFunctionLiteral#getFunction_ProbabilityFunctionLiteral <em>Function Probability Function Literal</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getProbabilityFunctionLiteral()
 * @model
 * @generated
 */
public interface ProbabilityFunctionLiteral extends Atom {
	/**
	 * Returns the value of the '<em><b>Function Probability Function Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Probability Function Literal</em>' containment reference.
	 * @see #setFunction_ProbabilityFunctionLiteral(ProbabilityFunction)
	 * @see stoex.StoexPackage#getProbabilityFunctionLiteral_Function_ProbabilityFunctionLiteral()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ProbabilityFunction getFunction_ProbabilityFunctionLiteral();

	/**
	 * Sets the value of the '{@link stoex.ProbabilityFunctionLiteral#getFunction_ProbabilityFunctionLiteral <em>Function Probability Function Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Probability Function Literal</em>' containment reference.
	 * @see #getFunction_ProbabilityFunctionLiteral()
	 * @generated
	 */
	void setFunction_ProbabilityFunctionLiteral(ProbabilityFunction value);

} // ProbabilityFunctionLiteral

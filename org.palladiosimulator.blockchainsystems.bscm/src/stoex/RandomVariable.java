/**
 */
package stoex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.RandomVariable#getSpecification <em>Specification</em>}</li>
 *   <li>{@link stoex.RandomVariable#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getRandomVariable()
 * @model
 * @generated
 */
public interface RandomVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see stoex.StoexPackage#getRandomVariable_Specification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link stoex.RandomVariable#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see stoex.StoexPackage#getRandomVariable_Expression()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedIsSetVisibility="true"
	 * @generated
	 */
	Expression getExpression();

} // RandomVariable

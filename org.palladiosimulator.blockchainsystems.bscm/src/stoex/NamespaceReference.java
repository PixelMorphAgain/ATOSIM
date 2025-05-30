/**
 */
package stoex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.NamespaceReference#getInnerReference_NamespaceReference <em>Inner Reference Namespace Reference</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getNamespaceReference()
 * @model
 * @generated
 */
public interface NamespaceReference extends AbstractNamedReference {
	/**
	 * Returns the value of the '<em><b>Inner Reference Namespace Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Reference Namespace Reference</em>' containment reference.
	 * @see #setInnerReference_NamespaceReference(AbstractNamedReference)
	 * @see stoex.StoexPackage#getNamespaceReference_InnerReference_NamespaceReference()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AbstractNamedReference getInnerReference_NamespaceReference();

	/**
	 * Sets the value of the '{@link stoex.NamespaceReference#getInnerReference_NamespaceReference <em>Inner Reference Namespace Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Reference Namespace Reference</em>' containment reference.
	 * @see #getInnerReference_NamespaceReference()
	 * @generated
	 */
	void setInnerReference_NamespaceReference(AbstractNamedReference value);

} // NamespaceReference

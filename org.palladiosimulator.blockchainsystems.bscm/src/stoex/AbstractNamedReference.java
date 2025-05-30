/**
 */
package stoex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Named Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stoex.AbstractNamedReference#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 *
 * @see stoex.StoexPackage#getAbstractNamedReference()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='referenceSegmentMustNeverContainADot'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL referenceSegmentMustNeverContainADot='self.referenceName.size() = 0 or not Sequence{1..self.referenceName.size()}-&gt;exists(i | self.referenceName.substring(i, i) = \'.\')'"
 * @generated
 */
public interface AbstractNamedReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see stoex.StoexPackage#getAbstractNamedReference_ReferenceName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link stoex.AbstractNamedReference#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

} // AbstractNamedReference

/**
 */
package units;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Multiplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link units.UnitMultiplication#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see units.UnitsPackage#getUnitMultiplication()
 * @model
 * @generated
 */
public interface UnitMultiplication extends Unit {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link units.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see units.UnitsPackage#getUnitMultiplication_Units()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Unit> getUnits();

} // UnitMultiplication

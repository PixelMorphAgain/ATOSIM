/**
 */
package units;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link units.UnitRepository#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see units.UnitsPackage#getUnitRepository()
 * @model
 * @generated
 */
public interface UnitRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link units.BaseUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see units.UnitsPackage#getUnitRepository_Units()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BaseUnit> getUnits();

} // UnitRepository

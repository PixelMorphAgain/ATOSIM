/**
 */
package units;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Carrying Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link units.UnitCarryingElement#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see units.UnitsPackage#getUnitCarryingElement()
 * @model abstract="true"
 * @generated
 */
public interface UnitCarryingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see units.UnitsPackage#getUnitCarryingElement_Unit()
	 * @model containment="true" unsettable="true" ordered="false" suppressedSetVisibility="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Unsets the value of the '{@link units.UnitCarryingElement#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link units.UnitCarryingElement#getUnit <em>Unit</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' containment reference is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	boolean isSetUnit();

} // UnitCarryingElement

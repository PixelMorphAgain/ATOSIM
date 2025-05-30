/**
 */
package stoex.impl;

import org.eclipse.emf.ecore.EClass;

import stoex.NumericLiteral;
import stoex.StoexPackage;

import units.impl.UnitCarryingElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NumericLiteralImpl extends UnitCarryingElementImpl implements NumericLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoexPackage.Literals.NUMERIC_LITERAL;
	}

} //NumericLiteralImpl

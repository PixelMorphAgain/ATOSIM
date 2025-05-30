/**
 */
package probfunction.impl;

import org.eclipse.emf.ecore.EClass;

import probfunction.BoolSample;
import probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bool Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BoolSampleImpl extends SampleImpl<Boolean> implements BoolSample {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProbfunctionPackage.Literals.BOOL_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(Boolean newValue) {
		super.setValue(newValue);
	}

} //BoolSampleImpl

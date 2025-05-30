/**
 */
package probfunction.impl;

import org.eclipse.emf.ecore.EClass;

import probfunction.IntSample;
import probfunction.ProbfunctionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntSampleImpl extends SampleImpl<Integer> implements IntSample {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProbfunctionPackage.Literals.INT_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(Integer newValue) {
		super.setValue(newValue);
	}

} //IntSampleImpl

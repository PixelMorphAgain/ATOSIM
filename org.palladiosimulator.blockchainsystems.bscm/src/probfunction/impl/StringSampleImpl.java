/**
 */
package probfunction.impl;

import org.eclipse.emf.ecore.EClass;

import probfunction.ProbfunctionPackage;
import probfunction.StringSample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StringSampleImpl extends SampleImpl<String> implements StringSample {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringSampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProbfunctionPackage.Literals.STRING_SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		super.setValue(newValue);
	}

} //StringSampleImpl

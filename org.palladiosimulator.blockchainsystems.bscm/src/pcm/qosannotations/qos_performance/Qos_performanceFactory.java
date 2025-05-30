/**
 */
package pcm.qosannotations.qos_performance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pcm.qosannotations.qos_performance.Qos_performancePackage
 * @generated
 */
public interface Qos_performanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Qos_performanceFactory eINSTANCE = pcm.qosannotations.qos_performance.impl.Qos_performanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Specified Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Specified Execution Time</em>'.
	 * @generated
	 */
	SystemSpecifiedExecutionTime createSystemSpecifiedExecutionTime();

	/**
	 * Returns a new object of class '<em>Component Specified Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Specified Execution Time</em>'.
	 * @generated
	 */
	ComponentSpecifiedExecutionTime createComponentSpecifiedExecutionTime();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Qos_performancePackage getQos_performancePackage();

} //Qos_performanceFactory

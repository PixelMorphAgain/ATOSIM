/**
 */
package pcm.usagemodel;

import pcm.core.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Closed Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ClosedWorkload specifies directly the (constant) user population and a think time. It models
 * that a fixed number of users execute their scenario, then wait (or think) for the specified amount
 * of think time as a RandomVariable, and then reenter the system executing their scenario again.
 * Performance analysts use closed workloads to model scenarios, where the number of users is known
 * (e.g., a fixed number of users in a company).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.usagemodel.ClosedWorkload#getPopulation <em>Population</em>}</li>
 *   <li>{@link pcm.usagemodel.ClosedWorkload#getThinkTime_ClosedWorkload <em>Think Time Closed Workload</em>}</li>
 * </ul>
 *
 * @see pcm.usagemodel.UsagemodelPackage#getClosedWorkload()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='populationInClosedWorkloadNeedsToBeGreaterZero thinkTimeInClosedWorkloadNeedsToBeSpecified'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG populationInClosedWorkloadNeedsToBeGreaterZero='not self.population.oclIsUndefined() and self.population &gt; 0' thinkTimeInClosedWorkloadNeedsToBeSpecified='not self.thinkTime_ClosedWorkload.oclIsUndefined() and self.thinkTime_ClosedWorkload.specification &lt;&gt; \'\''"
 * @generated
 */
public interface ClosedWorkload extends Workload {
	/**
	 * Returns the value of the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' attribute.
	 * @see #setPopulation(int)
	 * @see pcm.usagemodel.UsagemodelPackage#getClosedWorkload_Population()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPopulation();

	/**
	 * Sets the value of the '{@link pcm.usagemodel.ClosedWorkload#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(int value);

	/**
	 * Returns the value of the '<em><b>Think Time Closed Workload</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pcm.core.PCMRandomVariable#getClosedWorkload_PCMRandomVariable <em>Closed Workload PCM Random Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Think Time Closed Workload</em>' containment reference.
	 * @see #setThinkTime_ClosedWorkload(PCMRandomVariable)
	 * @see pcm.usagemodel.UsagemodelPackage#getClosedWorkload_ThinkTime_ClosedWorkload()
	 * @see pcm.core.PCMRandomVariable#getClosedWorkload_PCMRandomVariable
	 * @model opposite="closedWorkload_PCMRandomVariable" containment="true" required="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getThinkTime_ClosedWorkload();

	/**
	 * Sets the value of the '{@link pcm.usagemodel.ClosedWorkload#getThinkTime_ClosedWorkload <em>Think Time Closed Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Think Time Closed Workload</em>' containment reference.
	 * @see #getThinkTime_ClosedWorkload()
	 * @generated
	 */
	void setThinkTime_ClosedWorkload(PCMRandomVariable value);

} // ClosedWorkload

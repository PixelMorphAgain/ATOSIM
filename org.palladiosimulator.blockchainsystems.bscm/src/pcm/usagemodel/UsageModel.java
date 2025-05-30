/**
 */
package pcm.usagemodel;

import org.eclipse.emf.common.util.EList;

import pcm.PCMBaseClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The UsageModel specifies the whole user interaction with a system from a performance viewpoint. It consists of a number of concurrently executed UsageScenarios and a set of global UserData specifications. Each UsageScenario includes a workload and a scenario behaviour. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.usagemodel.UsageModel#getUsageScenario_UsageModel <em>Usage Scenario Usage Model</em>}</li>
 *   <li>{@link pcm.usagemodel.UsageModel#getUserData_UsageModel <em>User Data Usage Model</em>}</li>
 * </ul>
 *
 * @see pcm.usagemodel.UsagemodelPackage#getUsageModel()
 * @model
 * @generated
 */
public interface UsageModel extends PCMBaseClass {
	/**
	 * Returns the value of the '<em><b>Usage Scenario Usage Model</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.usagemodel.UsageScenario}.
	 * It is bidirectional and its opposite is '{@link pcm.usagemodel.UsageScenario#getUsageModel_UsageScenario <em>Usage Model Usage Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Scenario Usage Model</em>' containment reference list.
	 * @see pcm.usagemodel.UsagemodelPackage#getUsageModel_UsageScenario_UsageModel()
	 * @see pcm.usagemodel.UsageScenario#getUsageModel_UsageScenario
	 * @model opposite="usageModel_UsageScenario" containment="true" ordered="false"
	 * @generated
	 */
	EList<UsageScenario> getUsageScenario_UsageModel();

	/**
	 * Returns the value of the '<em><b>User Data Usage Model</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.usagemodel.UserData}.
	 * It is bidirectional and its opposite is '{@link pcm.usagemodel.UserData#getUsageModel_UserData <em>Usage Model User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data Usage Model</em>' containment reference list.
	 * @see pcm.usagemodel.UsagemodelPackage#getUsageModel_UserData_UsageModel()
	 * @see pcm.usagemodel.UserData#getUsageModel_UserData
	 * @model opposite="usageModel_UserData" containment="true" ordered="false"
	 * @generated
	 */
	EList<UserData> getUserData_UsageModel();

} // UsageModel

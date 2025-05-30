/**
 */
package pcm.core.composition;

import pcm.core.PCMRandomVariable;

import pcm.repository.SinkRole;
import pcm.repository.SourceRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Event Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AssemblyConnector is a bidirectional link of two assembly contexts. Intuitively, an AssemblyEventConnector connects a sink and a source. AssemblyContext must refer to the tuple (Role,AssemblyContext) in order to uniquely identify which component sink and source roles communicate with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.core.composition.AssemblyEventConnector#getSinkRole__AssemblyEventConnector <em>Sink Role Assembly Event Connector</em>}</li>
 *   <li>{@link pcm.core.composition.AssemblyEventConnector#getSourceRole__AssemblyEventConnector <em>Source Role Assembly Event Connector</em>}</li>
 *   <li>{@link pcm.core.composition.AssemblyEventConnector#getSinkAssemblyContext__AssemblyEventConnector <em>Sink Assembly Context Assembly Event Connector</em>}</li>
 *   <li>{@link pcm.core.composition.AssemblyEventConnector#getSourceAssemblyContext__AssemblyEventConnector <em>Source Assembly Context Assembly Event Connector</em>}</li>
 *   <li>{@link pcm.core.composition.AssemblyEventConnector#getFilterCondition__AssemblyEventConnector <em>Filter Condition Assembly Event Connector</em>}</li>
 * </ul>
 *
 * @see pcm.core.composition.CompositionPackage#getAssemblyEventConnector()
 * @model
 * @generated
 */
public interface AssemblyEventConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Sink Role Assembly Event Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink Role Assembly Event Connector</em>' reference.
	 * @see #setSinkRole__AssemblyEventConnector(SinkRole)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyEventConnector_SinkRole__AssemblyEventConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SinkRole getSinkRole__AssemblyEventConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyEventConnector#getSinkRole__AssemblyEventConnector <em>Sink Role Assembly Event Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink Role Assembly Event Connector</em>' reference.
	 * @see #getSinkRole__AssemblyEventConnector()
	 * @generated
	 */
	void setSinkRole__AssemblyEventConnector(SinkRole value);

	/**
	 * Returns the value of the '<em><b>Source Role Assembly Event Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role Assembly Event Connector</em>' reference.
	 * @see #setSourceRole__AssemblyEventConnector(SourceRole)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyEventConnector_SourceRole__AssemblyEventConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SourceRole getSourceRole__AssemblyEventConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyEventConnector#getSourceRole__AssemblyEventConnector <em>Source Role Assembly Event Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role Assembly Event Connector</em>' reference.
	 * @see #getSourceRole__AssemblyEventConnector()
	 * @generated
	 */
	void setSourceRole__AssemblyEventConnector(SourceRole value);

	/**
	 * Returns the value of the '<em><b>Sink Assembly Context Assembly Event Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink Assembly Context Assembly Event Connector</em>' reference.
	 * @see #setSinkAssemblyContext__AssemblyEventConnector(AssemblyContext)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyEventConnector_SinkAssemblyContext__AssemblyEventConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getSinkAssemblyContext__AssemblyEventConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyEventConnector#getSinkAssemblyContext__AssemblyEventConnector <em>Sink Assembly Context Assembly Event Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink Assembly Context Assembly Event Connector</em>' reference.
	 * @see #getSinkAssemblyContext__AssemblyEventConnector()
	 * @generated
	 */
	void setSinkAssemblyContext__AssemblyEventConnector(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Source Assembly Context Assembly Event Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Assembly Context Assembly Event Connector</em>' reference.
	 * @see #setSourceAssemblyContext__AssemblyEventConnector(AssemblyContext)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyEventConnector_SourceAssemblyContext__AssemblyEventConnector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssemblyContext getSourceAssemblyContext__AssemblyEventConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyEventConnector#getSourceAssemblyContext__AssemblyEventConnector <em>Source Assembly Context Assembly Event Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Assembly Context Assembly Event Connector</em>' reference.
	 * @see #getSourceAssemblyContext__AssemblyEventConnector()
	 * @generated
	 */
	void setSourceAssemblyContext__AssemblyEventConnector(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Filter Condition Assembly Event Connector</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pcm.core.PCMRandomVariable#getAssemblyEventConnector__FilterCondition <em>Assembly Event Connector Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Condition Assembly Event Connector</em>' containment reference.
	 * @see #setFilterCondition__AssemblyEventConnector(PCMRandomVariable)
	 * @see pcm.core.composition.CompositionPackage#getAssemblyEventConnector_FilterCondition__AssemblyEventConnector()
	 * @see pcm.core.PCMRandomVariable#getAssemblyEventConnector__FilterCondition
	 * @model opposite="assemblyEventConnector__FilterCondition" containment="true" ordered="false"
	 * @generated
	 */
	PCMRandomVariable getFilterCondition__AssemblyEventConnector();

	/**
	 * Sets the value of the '{@link pcm.core.composition.AssemblyEventConnector#getFilterCondition__AssemblyEventConnector <em>Filter Condition Assembly Event Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Condition Assembly Event Connector</em>' containment reference.
	 * @see #getFilterCondition__AssemblyEventConnector()
	 * @generated
	 */
	void setFilterCondition__AssemblyEventConnector(PCMRandomVariable value);

} // AssemblyEventConnector

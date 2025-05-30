/**
 */
package pcm.resourceenvironment;

import org.eclipse.emf.common.util.EList;

import pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     Repository element of&nbsp;the resource environment
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.resourceenvironment.ResourceEnvironment#getLinkingResources__ResourceEnvironment <em>Linking Resources Resource Environment</em>}</li>
 *   <li>{@link pcm.resourceenvironment.ResourceEnvironment#getResourceContainer_ResourceEnvironment <em>Resource Container Resource Environment</em>}</li>
 * </ul>
 *
 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getResourceEnvironment()
 * @model
 * @generated
 */
public interface ResourceEnvironment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Linking Resources Resource Environment</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.resourceenvironment.LinkingResource}.
	 * It is bidirectional and its opposite is '{@link pcm.resourceenvironment.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linking Resources Resource Environment</em>' containment reference list.
	 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getResourceEnvironment_LinkingResources__ResourceEnvironment()
	 * @see pcm.resourceenvironment.LinkingResource#getResourceEnvironment_LinkingResource
	 * @model opposite="resourceEnvironment_LinkingResource" containment="true" ordered="false"
	 * @generated
	 */
	EList<LinkingResource> getLinkingResources__ResourceEnvironment();

	/**
	 * Returns the value of the '<em><b>Resource Container Resource Environment</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.resourceenvironment.ResourceContainer}.
	 * It is bidirectional and its opposite is '{@link pcm.resourceenvironment.ResourceContainer#getResourceEnvironment_ResourceContainer <em>Resource Environment Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container Resource Environment</em>' containment reference list.
	 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getResourceEnvironment_ResourceContainer_ResourceEnvironment()
	 * @see pcm.resourceenvironment.ResourceContainer#getResourceEnvironment_ResourceContainer
	 * @model opposite="resourceEnvironment_ResourceContainer" containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceContainer> getResourceContainer_ResourceEnvironment();

} // ResourceEnvironment

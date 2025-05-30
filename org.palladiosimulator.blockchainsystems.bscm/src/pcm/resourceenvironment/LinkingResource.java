/**
 */
package pcm.resourceenvironment;

import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linking Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model&nbsp;element&nbsp;representing&nbsp;communication&nbsp;links&nbsp;like&nbsp;LAN,&nbsp;WAN,&nbsp;WiFi&nbsp;etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.resourceenvironment.LinkingResource#getConnectedResourceContainers_LinkingResource <em>Connected Resource Containers Linking Resource</em>}</li>
 *   <li>{@link pcm.resourceenvironment.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}</li>
 *   <li>{@link pcm.resourceenvironment.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}</li>
 * </ul>
 *
 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource()
 * @model
 * @generated
 */
public interface LinkingResource extends Entity {
	/**
	 * Returns the value of the '<em><b>Connected Resource Containers Linking Resource</b></em>' reference list.
	 * The list contents are of type {@link pcm.resourceenvironment.ResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Resource Containers Linking Resource</em>' reference list.
	 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource_ConnectedResourceContainers_LinkingResource()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ResourceContainer> getConnectedResourceContainers_LinkingResource();

	/**
	 * Returns the value of the '<em><b>Communication Link Resource Specifications Linking Resource</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pcm.resourceenvironment.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification <em>Linking Resource Communication Link Resource Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Link Resource Specifications Linking Resource</em>' containment reference.
	 * @see #setCommunicationLinkResourceSpecifications_LinkingResource(CommunicationLinkResourceSpecification)
	 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource_CommunicationLinkResourceSpecifications_LinkingResource()
	 * @see pcm.resourceenvironment.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification
	 * @model opposite="linkingResource_CommunicationLinkResourceSpecification" containment="true" required="true" ordered="false"
	 * @generated
	 */
	CommunicationLinkResourceSpecification getCommunicationLinkResourceSpecifications_LinkingResource();

	/**
	 * Sets the value of the '{@link pcm.resourceenvironment.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Link Resource Specifications Linking Resource</em>' containment reference.
	 * @see #getCommunicationLinkResourceSpecifications_LinkingResource()
	 * @generated
	 */
	void setCommunicationLinkResourceSpecifications_LinkingResource(CommunicationLinkResourceSpecification value);

	/**
	 * Returns the value of the '<em><b>Resource Environment Linking Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcm.resourceenvironment.ResourceEnvironment#getLinkingResources__ResourceEnvironment <em>Linking Resources Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Environment Linking Resource</em>' container reference.
	 * @see #setResourceEnvironment_LinkingResource(ResourceEnvironment)
	 * @see pcm.resourceenvironment.ResourceenvironmentPackage#getLinkingResource_ResourceEnvironment_LinkingResource()
	 * @see pcm.resourceenvironment.ResourceEnvironment#getLinkingResources__ResourceEnvironment
	 * @model opposite="linkingResources__ResourceEnvironment" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ResourceEnvironment getResourceEnvironment_LinkingResource();

	/**
	 * Sets the value of the '{@link pcm.resourceenvironment.LinkingResource#getResourceEnvironment_LinkingResource <em>Resource Environment Linking Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Environment Linking Resource</em>' container reference.
	 * @see #getResourceEnvironment_LinkingResource()
	 * @generated
	 */
	void setResourceEnvironment_LinkingResource(ResourceEnvironment value);

} // LinkingResource

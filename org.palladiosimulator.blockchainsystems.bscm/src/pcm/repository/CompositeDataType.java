/**
 */
package pcm.repository;

import org.eclipse.emf.common.util.EList;

import pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents a complex data type containing other data types. This construct is common in higher programming languages as record, struct, or class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcm.repository.CompositeDataType#getParentType_CompositeDataType <em>Parent Type Composite Data Type</em>}</li>
 *   <li>{@link pcm.repository.CompositeDataType#getInnerDeclaration_CompositeDataType <em>Inner Declaration Composite Data Type</em>}</li>
 * </ul>
 *
 * @see pcm.repository.RepositoryPackage#getCompositeDataType()
 * @model
 * @generated
 */
public interface CompositeDataType extends Entity, DataType {
	/**
	 * Returns the value of the '<em><b>Parent Type Composite Data Type</b></em>' reference list.
	 * The list contents are of type {@link pcm.repository.CompositeDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the parent type in the inheritance hierarchy. Null if there is no parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Type Composite Data Type</em>' reference list.
	 * @see pcm.repository.RepositoryPackage#getCompositeDataType_ParentType_CompositeDataType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CompositeDataType> getParentType_CompositeDataType();

	/**
	 * Returns the value of the '<em><b>Inner Declaration Composite Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.repository.InnerDeclaration}.
	 * It is bidirectional and its opposite is '{@link pcm.repository.InnerDeclaration#getCompositeDataType_InnerDeclaration <em>Composite Data Type Inner Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the internals, i.e., named items, each of a data type, forming this composite data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Declaration Composite Data Type</em>' containment reference list.
	 * @see pcm.repository.RepositoryPackage#getCompositeDataType_InnerDeclaration_CompositeDataType()
	 * @see pcm.repository.InnerDeclaration#getCompositeDataType_InnerDeclaration
	 * @model opposite="compositeDataType_InnerDeclaration" containment="true" ordered="false"
	 * @generated
	 */
	EList<InnerDeclaration> getInnerDeclaration_CompositeDataType();

} // CompositeDataType

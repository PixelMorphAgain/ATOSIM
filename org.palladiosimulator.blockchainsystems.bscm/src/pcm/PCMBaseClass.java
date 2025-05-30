/**
 */
package pcm;

import ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Base Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common base for all EClass instances of PCM.
 * 
 * The sole purpose of the class is to represent the inheritance relationship
 * to EObject. Making inheritance from EObject explicit is necessary to safely
 * cast instances of PCM meta classes to EObject in reflective scenarios such
 * as OCL evaluations.
 * 
 * It is important to not define EObject as first super type. If doing so, EObject
 * will always be used as super class during the code generation. This ignores
 * the configured superclass in the genmodel. By referring to an empty EClass
 * in the first place, the super class defined in the genmodel is used.
 * <!-- end-model-doc -->
 *
 *
 * @see pcm.PcmPackage#getPCMBaseClass()
 * @model abstract="true"
 * @generated
 */
public interface PCMBaseClass extends PCMClass, EObject {
} // PCMBaseClass

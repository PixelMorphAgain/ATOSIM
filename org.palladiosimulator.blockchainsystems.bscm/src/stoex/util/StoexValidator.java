/**
 */
package stoex.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import stoex.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see stoex.StoexPackage
 * @generated
 */
public class StoexValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StoexValidator INSTANCE = new StoexValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "stoex";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoexValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StoexPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StoexPackage.VARIABLE_REFERENCE:
				return validateVariableReference((VariableReference)value, diagnostics, context);
			case StoexPackage.ABSTRACT_NAMED_REFERENCE:
				return validateAbstractNamedReference((AbstractNamedReference)value, diagnostics, context);
			case StoexPackage.NAMESPACE_REFERENCE:
				return validateNamespaceReference((NamespaceReference)value, diagnostics, context);
			case StoexPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case StoexPackage.ATOM:
				return validateAtom((Atom)value, diagnostics, context);
			case StoexPackage.UNARY:
				return validateUnary((Unary)value, diagnostics, context);
			case StoexPackage.POWER:
				return validatePower((Power)value, diagnostics, context);
			case StoexPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case StoexPackage.TERM:
				return validateTerm((Term)value, diagnostics, context);
			case StoexPackage.COMPARISON:
				return validateComparison((Comparison)value, diagnostics, context);
			case StoexPackage.BOOLEAN_EXPRESSION:
				return validateBooleanExpression((BooleanExpression)value, diagnostics, context);
			case StoexPackage.IF_ELSE:
				return validateIfElse((IfElse)value, diagnostics, context);
			case StoexPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case StoexPackage.TERM_EXPRESSION:
				return validateTermExpression((TermExpression)value, diagnostics, context);
			case StoexPackage.PRODUCT_EXPRESSION:
				return validateProductExpression((ProductExpression)value, diagnostics, context);
			case StoexPackage.PROBABILITY_FUNCTION_LITERAL:
				return validateProbabilityFunctionLiteral((ProbabilityFunctionLiteral)value, diagnostics, context);
			case StoexPackage.PARENTHESIS:
				return validateParenthesis((Parenthesis)value, diagnostics, context);
			case StoexPackage.NUMERIC_LITERAL:
				return validateNumericLiteral((NumericLiteral)value, diagnostics, context);
			case StoexPackage.INT_LITERAL:
				return validateIntLiteral((IntLiteral)value, diagnostics, context);
			case StoexPackage.DOUBLE_LITERAL:
				return validateDoubleLiteral((DoubleLiteral)value, diagnostics, context);
			case StoexPackage.COMPARE_EXPRESSION:
				return validateCompareExpression((CompareExpression)value, diagnostics, context);
			case StoexPackage.BOOL_LITERAL:
				return validateBoolLiteral((BoolLiteral)value, diagnostics, context);
			case StoexPackage.STRING_LITERAL:
				return validateStringLiteral((StringLiteral)value, diagnostics, context);
			case StoexPackage.POWER_EXPRESSION:
				return validatePowerExpression((PowerExpression)value, diagnostics, context);
			case StoexPackage.BOOLEAN_OPERATOR_EXPRESSION:
				return validateBooleanOperatorExpression((BooleanOperatorExpression)value, diagnostics, context);
			case StoexPackage.NOT_EXPRESSION:
				return validateNotExpression((NotExpression)value, diagnostics, context);
			case StoexPackage.NEGATIVE_EXPRESSION:
				return validateNegativeExpression((NegativeExpression)value, diagnostics, context);
			case StoexPackage.FUNCTION_LITERAL:
				return validateFunctionLiteral((FunctionLiteral)value, diagnostics, context);
			case StoexPackage.IF_ELSE_EXPRESSION:
				return validateIfElseExpression((IfElseExpression)value, diagnostics, context);
			case StoexPackage.RANDOM_VARIABLE:
				return validateRandomVariable((RandomVariable)value, diagnostics, context);
			case StoexPackage.TERM_OPERATIONS:
				return validateTermOperations((TermOperations)value, diagnostics, context);
			case StoexPackage.PRODUCT_OPERATIONS:
				return validateProductOperations((ProductOperations)value, diagnostics, context);
			case StoexPackage.COMPARE_OPERATIONS:
				return validateCompareOperations((CompareOperations)value, diagnostics, context);
			case StoexPackage.BOOLEAN_OPERATIONS:
				return validateBooleanOperations((BooleanOperations)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableReference(VariableReference variableReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractNamedReference_referenceSegmentMustNeverContainADot(variableReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractNamedReference(AbstractNamedReference abstractNamedReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractNamedReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractNamedReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractNamedReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractNamedReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractNamedReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractNamedReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractNamedReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractNamedReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractNamedReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractNamedReference_referenceSegmentMustNeverContainADot(abstractNamedReference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the referenceSegmentMustNeverContainADot constraint of '<em>Abstract Named Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_NAMED_REFERENCE__REFERENCE_SEGMENT_MUST_NEVER_CONTAIN_ADOT__EEXPRESSION = "self.referenceName.size() = 0 or not Sequence{1..self.referenceName.size()}->exists(i | self.referenceName.substring(i, i) = '.')";

	/**
	 * Validates the referenceSegmentMustNeverContainADot constraint of '<em>Abstract Named Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractNamedReference_referenceSegmentMustNeverContainADot(AbstractNamedReference abstractNamedReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StoexPackage.Literals.ABSTRACT_NAMED_REFERENCE,
				 abstractNamedReference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "referenceSegmentMustNeverContainADot",
				 ABSTRACT_NAMED_REFERENCE__REFERENCE_SEGMENT_MUST_NEVER_CONTAIN_ADOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespaceReference(NamespaceReference namespaceReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namespaceReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namespaceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namespaceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namespaceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namespaceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namespaceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namespaceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namespaceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namespaceReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractNamedReference_referenceSegmentMustNeverContainADot(namespaceReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtom(Atom atom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(atom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnary(Unary unary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePower(Power power, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(power, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(product, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerm(Term term, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(term, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparison(Comparison comparison, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparison, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpression(BooleanExpression booleanExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfElse(IfElse ifElse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifElse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermExpression(TermExpression termExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(termExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductExpression(ProductExpression productExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbabilityFunctionLiteral(ProbabilityFunctionLiteral probabilityFunctionLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(probabilityFunctionLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParenthesis(Parenthesis parenthesis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parenthesis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericLiteral(NumericLiteral numericLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntLiteral(IntLiteral intLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleLiteral(DoubleLiteral doubleLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompareExpression(CompareExpression compareExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compareExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolLiteral(BoolLiteral boolLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringLiteral(StringLiteral stringLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerExpression(PowerExpression powerExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOperatorExpression(BooleanOperatorExpression booleanOperatorExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanOperatorExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotExpression(NotExpression notExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeExpression(NegativeExpression negativeExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(negativeExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionLiteral(FunctionLiteral functionLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfElseExpression(IfElseExpression ifElseExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifElseExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRandomVariable(RandomVariable randomVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(randomVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermOperations(TermOperations termOperations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductOperations(ProductOperations productOperations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompareOperations(CompareOperations compareOperations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOperations(BooleanOperations booleanOperations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StoexValidator

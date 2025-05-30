/**
 */
package probfunction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import probfunction.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbfunctionFactoryImpl extends EFactoryImpl implements ProbfunctionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProbfunctionFactory init() {
		try {
			ProbfunctionFactory theProbfunctionFactory = (ProbfunctionFactory)EPackage.Registry.INSTANCE.getEFactory(ProbfunctionPackage.eNS_URI);
			if (theProbfunctionFactory != null) {
				return theProbfunctionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProbfunctionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbfunctionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProbfunctionPackage.BOXED_PDF: return createBoxedPDF();
			case ProbfunctionPackage.CONTINUOUS_SAMPLE: return createContinuousSample();
			case ProbfunctionPackage.PROBABILITY_MASS_FUNCTION: return createProbabilityMassFunction();
			case ProbfunctionPackage.SAMPLE: return createSample();
			case ProbfunctionPackage.SAMPLE_PDF: return createSamplePDF();
			case ProbfunctionPackage.COMPLEX: return createComplex();
			case ProbfunctionPackage.EXPONENTIAL_DISTRIBUTION: return createExponentialDistribution();
			case ProbfunctionPackage.NORMAL_DISTRIBUTION: return createNormalDistribution();
			case ProbfunctionPackage.LOGNORMAL_DISTRIBUTION: return createLognormalDistribution();
			case ProbfunctionPackage.GAMMA_DISTRIBUTION: return createGammaDistribution();
			case ProbfunctionPackage.INT_SAMPLE: return createIntSample();
			case ProbfunctionPackage.BOOL_SAMPLE: return createBoolSample();
			case ProbfunctionPackage.DOUBLE_SAMPLE: return createDoubleSample();
			case ProbfunctionPackage.STRING_SAMPLE: return createStringSample();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoxedPDF createBoxedPDF() {
		BoxedPDFImpl boxedPDF = new BoxedPDFImpl();
		return boxedPDF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousSample createContinuousSample() {
		ContinuousSampleImpl continuousSample = new ContinuousSampleImpl();
		return continuousSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T> ProbabilityMassFunction<T> createProbabilityMassFunction() {
		ProbabilityMassFunctionImpl<T> probabilityMassFunction = new ProbabilityMassFunctionImpl<T>();
		return probabilityMassFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T> Sample<T> createSample() {
		SampleImpl<T> sample = new SampleImpl<T>();
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SamplePDF createSamplePDF() {
		SamplePDFImpl samplePDF = new SamplePDFImpl();
		return samplePDF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Complex createComplex() {
		ComplexImpl complex = new ComplexImpl();
		return complex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExponentialDistribution createExponentialDistribution() {
		ExponentialDistributionImpl exponentialDistribution = new ExponentialDistributionImpl();
		return exponentialDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalDistribution createNormalDistribution() {
		NormalDistributionImpl normalDistribution = new NormalDistributionImpl();
		return normalDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LognormalDistribution createLognormalDistribution() {
		LognormalDistributionImpl lognormalDistribution = new LognormalDistributionImpl();
		return lognormalDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GammaDistribution createGammaDistribution() {
		GammaDistributionImpl gammaDistribution = new GammaDistributionImpl();
		return gammaDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntSample createIntSample() {
		IntSampleImpl intSample = new IntSampleImpl();
		return intSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolSample createBoolSample() {
		BoolSampleImpl boolSample = new BoolSampleImpl();
		return boolSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleSample createDoubleSample() {
		DoubleSampleImpl doubleSample = new DoubleSampleImpl();
		return doubleSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringSample createStringSample() {
		StringSampleImpl stringSample = new StringSampleImpl();
		return stringSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbfunctionPackage getProbfunctionPackage() {
		return (ProbfunctionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProbfunctionPackage getPackage() {
		return ProbfunctionPackage.eINSTANCE;
	}

} //ProbfunctionFactoryImpl

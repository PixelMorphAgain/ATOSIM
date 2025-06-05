package org.palladiosimulator.blockchainsystems.threesim.creation;

import java.util.HashMap;
import java.util.random.RandomGenerator;

import org.palladiosimulator.blockchainsystems.bscm.blockchainsystemComponentRepository.BlockValiationDurationSpecification;
import org.palladiosimulator.blockchainsystems.bscm.blockchainsystemComponentRepository.BlockValidationDurationValue;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider;
import org.palladiosimulator.blockchainsystems.core.utils.RandomValueProvider;


public class BlockValidationDurationProviderAdapter implements ValueProvider<Long> {

    private final RandomValueProvider<Long> _randomValueProvider;

    private BlockValidationDurationProviderAdapter(RandomValueProvider<Long> randomValueProvider) {
        _randomValueProvider = randomValueProvider;
    }

    @Override
    public Long getValue() {
        return _randomValueProvider.getValue();
    }

    public static BlockValidationDurationProviderAdapter create(
            BlockValiationDurationSpecification validationDurationSpecification,
            RandomGenerator randomGenerator) {

        HashMap<Long, Double> valuesToProbabilitiesMapping = new HashMap<Long, Double>();

        for (BlockValidationDurationValue validationDurationValue : validationDurationSpecification.getValues()) {
            valuesToProbabilitiesMapping.put(
                    validationDurationValue.getDuration(),
                    validationDurationValue.getProbability()
            );
        }

        RandomValueProvider<Long> valueProvider =
                RandomValueProvider.Companion.create(valuesToProbabilitiesMapping, randomGenerator);
        return new BlockValidationDurationProviderAdapter(valueProvider);
    }
}
package org.palladiosimulator.blockchainsystems.doublespending;

import java.util.HashMap;
import java.util.random.RandomGenerator;

import org.junit.jupiter.api.Test;
import org.palladiosimulator.blockchainsystems.doublespending.util.RandomValueProvider;

public class RandomValueProviderTests {

    @Test
    public void TestTwoItems() {
        HashMap<Integer, Double> values = new HashMap<Integer, Double>();
        values.put(0, 0.5);
        values.put(1, 0.5);

        RandomValueProvider<Integer> randomValueProvider = RandomValueProvider.create(values, RandomGenerator.of("Random"));

        Integer v1 = randomValueProvider.getValue();
        Integer v2 = randomValueProvider.getValue();
    }
}

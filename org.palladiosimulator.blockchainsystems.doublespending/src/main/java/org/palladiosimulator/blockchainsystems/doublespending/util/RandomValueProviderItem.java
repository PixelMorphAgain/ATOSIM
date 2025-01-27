package org.palladiosimulator.blockchainsystems.doublespending.util;

public record RandomValueProviderItem<T>(
        double selectionValueBorder,
        T value) {
}

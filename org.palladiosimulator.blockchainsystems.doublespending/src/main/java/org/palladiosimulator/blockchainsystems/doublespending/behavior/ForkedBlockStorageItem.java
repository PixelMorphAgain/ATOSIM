package org.palladiosimulator.blockchainsystems.doublespending.behavior;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;

public record ForkedBlockStorageItem(
        int position,
        Block block) {
}

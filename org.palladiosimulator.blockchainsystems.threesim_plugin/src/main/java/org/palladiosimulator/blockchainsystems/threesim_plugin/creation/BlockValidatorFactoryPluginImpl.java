package org.palladiosimulator.blockchainsystems.threesim_plugin.creation;

import java.util.Set;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

import org.palladiosimulator.blockchainsystems.bscm.blockchainsystemComponentRepository.BlockValidatorComponent;
import org.palladiosimulator.blockchainsystems.core.blockvalidation.BlockValidatorImpl;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockValidator;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockValidatorFactory;
import org.palladiosimulator.blockchainsystems.threesim_plugin.creation.abstractions.NodeAllocationResolver;

/**
 * Factory implementation for creating a {@link BlockValidator} based on the
 * {@link BlockValidatorComponent} in the node allocation.
 *
 * @author Yannik Sproll
 */
public class BlockValidatorFactoryPluginImpl implements BlockValidatorFactory {

    private final NodeAllocationResolver _nodeAllocationResolver;

    public BlockValidatorFactoryPluginImpl(NodeAllocationResolver nodeAllocationResolver) {
        _nodeAllocationResolver = nodeAllocationResolver;
    }

    @Override
    public BlockValidator createBlockValidator(String nodeId) {
        Set<BlockValidatorComponent> blockValidatorComponents = _nodeAllocationResolver
                .getNodeAllocation(nodeId)
                .getAllocationContexts()
                .stream()
                .filter(x -> x.getAssemblyContext().getEncapsulatedComponent() instanceof BlockValidatorComponent)
                .map(x -> (BlockValidatorComponent) x.getAssemblyContext().getEncapsulatedComponent())
                .collect(Collectors.toSet());

        // TODO: Implement proper error handling if no BlockValidatorComponent is found
        BlockValidatorComponent component = blockValidatorComponents.stream().findFirst().get();


        BlockValidationDurationProviderAdapter adapter = BlockValidationDurationProviderAdapter.create(
                component.getValidationDuration(),
                RandomGenerator.of("Random")
        );

        return new BlockValidatorImpl(adapter);
    }

}
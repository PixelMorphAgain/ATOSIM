package org.palladiosimulator.blockchainsystems.threesim_plugin.creation.explicitnetwork;

import org.palladiosimulator.blockchainsystems.bscm.blockchainsystemComponentRepository.MiningProcessComponent;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.Node;
import org.palladiosimulator.blockchainsystems.threesim_plugin.creation.abstractions.GlobalResourcePowerCalculator;

/**
 * Calculates the global resource power of a blockchain system with an explicit network topology.
 * Allows to retrieve resource power of specific nodes in the network.
 *
 * @author Yannik Sproll
 */
public class ExplicitNetworkResourcePowerCalculator implements GlobalResourcePowerCalculator {

    private final double _globalResourcePower;

    public ExplicitNetworkResourcePowerCalculator(ExplicitNetworkTopology networkTopology) {
        _globalResourcePower = networkTopology
                .getNodes()
                .stream()
                .mapToDouble(ExplicitNetworkResourcePowerCalculator::getResourcePowerOfNode)
                .sum();
    }

    @Override
    public double calculateGlobalResourcePower() {
        return _globalResourcePower;
    }

    private static double getResourcePowerOfNode(Node node) {
        return node.getAllocation()
                .getAllocationContexts()
                .stream()
                .filter(y -> y.getAssemblyContext().getEncapsulatedComponent() instanceof MiningProcessComponent)
                .mapToDouble(y -> y.getResourceContainer().getResourcePower())
                .sum();
    }
}

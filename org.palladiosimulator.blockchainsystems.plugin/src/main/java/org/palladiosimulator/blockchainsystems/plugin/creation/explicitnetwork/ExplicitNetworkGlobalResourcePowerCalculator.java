package org.palladiosimulator.blockchainsystems.plugin.creation.explicitnetwork;

import org.palladiosimulator.blockchainsystems.bscm.blockchainsystemComponentRepository.MiningProcessComponent;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.Node;
import org.palladiosimulator.blockchainsystems.plugin.creation.GlobalResourcePowerCalculator;

public class ExplicitNetworkGlobalResourcePowerCalculator implements GlobalResourcePowerCalculator {

    private final double _globalResourcePower;

    public ExplicitNetworkGlobalResourcePowerCalculator(ExplicitNetworkTopology networkTopology) {
        _globalResourcePower = networkTopology
                .getNodes()
                .stream()
                .mapToDouble(ExplicitNetworkGlobalResourcePowerCalculator::getResourcePowerOfNode)
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

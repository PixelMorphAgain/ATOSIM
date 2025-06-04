package org.palladiosimulator.blockchainsysttems.threesim.creation.connectedsubgraphnetwork;

import org.palladiosimulator.blockchainsystems.bscm.blockchainsystemComponentRepository.MiningProcessComponent;
import org.palladiosimulator.blockchainsystems.bscm.nodeallocation.NodeAllocation;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.SubgraphSpecification;
import org.palladiosimulator.blockchainsystems.threesim.creation.abstractions.GlobalResourcePowerCalculator;

/**
 * This class calculates the global resource power of a connected subgraph network topology.
 *
 * @author Yannik Sproll
 */
public class ConnectedSubgraphNetworkGlobalResourcePowerCalculator implements GlobalResourcePowerCalculator {

    private final double _globalResourcePower;

    public ConnectedSubgraphNetworkGlobalResourcePowerCalculator(ConnectedSubgraphsNetworkTopology connectedSubgraphsTopology) {

        _globalResourcePower = connectedSubgraphsTopology
                .getSubgraphs()
                .stream()
                .mapToDouble(x -> calculateResourcePowerOfSubgraph(x))
                .sum();
    }

    private double calculateResourcePowerOfSubgraph(SubgraphSpecification subgraph) {
        return subgraph
                .getNodeTemplates()
                .stream()
                .mapToDouble(x -> getResourcePowerOfAllocation(x.getAllocation()) * x.getNumberOfNodeOccurences())
                .sum();
    }

    private static double getResourcePowerOfAllocation(NodeAllocation nodeAllocation) {
        return nodeAllocation
                .getAllocationContexts()
                .stream()
                .filter(y -> y.getAssemblyContext().getEncapsulatedComponent() instanceof MiningProcessComponent)
                .mapToDouble(y -> y.getResourceContainer().getResourcePower())
                .sum();
    }

    @Override
    public double calculateGlobalResourcePower() {
        return _globalResourcePower;
    }

}

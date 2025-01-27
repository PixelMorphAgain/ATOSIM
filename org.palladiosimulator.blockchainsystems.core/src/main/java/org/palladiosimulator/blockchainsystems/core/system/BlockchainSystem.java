package org.palladiosimulator.blockchainsystems.core.system;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.palladiosimulator.blockchainsystems.core.common.BlockchainSimulationObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetwork;

/**
 * The {@code BlockchainSystem} class represents a blockchain system, consisting of a set of blockchain system nodes and
 * a P2P network.
 *
 * @author Yannik Sproll
 */
public class BlockchainSystem extends BlockchainSimulationObject {

    private final P2PNetwork _network;
    private final HashSet<BlockchainSystemNode> _systemNodes;

    public BlockchainSystem(String id, String name, P2PNetwork network, HashSet<BlockchainSystemNode> systemNodes) {
        super(id, name);

        _network = network;
        _systemNodes = systemNodes;
    }

    public Set<BlockchainSystemNode> getNodes() {
        return Collections.unmodifiableSet(_systemNodes);
    }

    @Override
    public void onInitialize() {
        _network.initialize(getSimulationContext());
        for (BlockchainSystemNode node : _systemNodes) {
            node.initialize(getSimulationContext());
        }
    }

    @Override
    public void onCleanup() {
        _network.cleanup();
        for (BlockchainSystemNode node : _systemNodes) {
            node.cleanup();
        }
    }

    @Override
    public void dispatchEvent(Event event) {
    }
}

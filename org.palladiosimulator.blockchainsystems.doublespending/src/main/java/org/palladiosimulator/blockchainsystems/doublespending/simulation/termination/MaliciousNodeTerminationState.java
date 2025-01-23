package org.palladiosimulator.blockchainsystems.doublespending.simulation.termination;

import org.palladiosimulator.blockchainsystems.core.blockchain.BlockAppendedTraceEvent;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.TraceEvent;
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemNode;
import org.palladiosimulator.blockchainsystems.doublespending.behavior.DSAttackPhaseChangedTraceEvent;

import java.util.Objects;

public class MaliciousNodeTerminationState implements NodeTerminationState {

    private final BlockchainSystemNode _node;

    private boolean _hasReachedFinalPhase;

    private final LongestChainExceededMaxLengthCondition _chainLengthExceededCondition;

    public MaliciousNodeTerminationState(BlockchainSystemNode node) {
        _node = node;
        _hasReachedFinalPhase = false;
        _chainLengthExceededCondition = new LongestChainExceededMaxLengthCondition(25);
    }

    public BlockchainSystemNode getNode() {
        return _node;
    }

    public boolean hasReachedFinalPhase() {
        return _hasReachedFinalPhase;
    }

    @Override
    public void onTraceEventOccurred(TraceEvent traceEvent) {

        if (Objects.equals(traceEvent.getEventType(), BlockAppendedTraceEvent.EVENT_TYPE)) {
            BlockAppendedTraceEvent blockAppendedTraceEvent = (BlockAppendedTraceEvent) traceEvent;

            _chainLengthExceededCondition.onBlockAppended(blockAppendedTraceEvent.getBlockPosition());
        }
        if (Objects.equals(traceEvent.getEventType(), DSAttackPhaseChangedTraceEvent.EVENT_TYPE)) {
            assert traceEvent instanceof DSAttackPhaseChangedTraceEvent;
            DSAttackPhaseChangedTraceEvent dSAttackPhaseChangedTraceEvent = (DSAttackPhaseChangedTraceEvent) traceEvent;

            if (Objects.equals(dSAttackPhaseChangedTraceEvent.getNewPhase(), "WaitForBlockDistributionPhase")) {
                _hasReachedFinalPhase = true;
            }
        }

    }

    @Override
    public SimulationWinnerVote getWinnerVote() {
        return SimulationWinnerVote.NotDetermined;
    }

}

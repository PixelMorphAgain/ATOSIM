package org.palladiosimulator.blockchainsystems.doublespending.simulation.termination;

import java.util.HashMap;

import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockType;

public class BTOState {

    private final BlockState _btoState;
    private final HashMap<String, BlockState> _btouSuccessorsByHashes;

    private final int _numberOfBlocksRequiredForBTOAcceptance;

    private boolean _isBTOAccepted;
    private boolean _wasBTOAccepted;

    public BTOState(BlockState btoState, int numberOfBlocksRequiredForBTOAcceptance) {
        _btoState = btoState;
        _numberOfBlocksRequiredForBTOAcceptance = numberOfBlocksRequiredForBTOAcceptance;

        _btouSuccessorsByHashes = new HashMap<String, BlockState>();

        _isBTOAccepted = false;
        _wasBTOAccepted = false;
    }

    public boolean isBTOAccepted() {
        return _isBTOAccepted;
    }

    public boolean wasBTOAccepted() {
        return _wasBTOAccepted;
    }

    public boolean isBlockSuccessorOfBTO(Block block) {
        return _btoState.getBlock().getHash() == block.getPreviousHash()
                || _btouSuccessorsByHashes.containsKey(block.getPreviousHash());
    }

    public void addBTOSuccessorBlock(BlockState blockState) {
        if (!isBlockSuccessorOfBTO(blockState.getBlock())) {
            return;
        }

        _btouSuccessorsByHashes.put(blockState.getBlock().getHash(), blockState);

        updateIsBTOAccepted();
    }

    public void onBTOBlockTypeChanged(BlockType newBlockType) {
        _btoState.setBlockType(newBlockType);

        updateIsBTOAccepted();
    }

    private void updateIsBTOAccepted() {
        if (isBTOIncluded() && hasRequiredLongestChainSuccessorForAcceptance()) {
            _isBTOAccepted = true;
            if (!_wasBTOAccepted) {
                _wasBTOAccepted = true;
            }
        } else {
            _isBTOAccepted = false;
        }
    }

    private boolean hasRequiredLongestChainSuccessorForAcceptance() {
        return getNumberOfLongestChainSuccessors() >= _numberOfBlocksRequiredForBTOAcceptance;
    }

    public boolean isBTOIncluded() {
        return _btoState.getBlockType() == BlockType.IncludedBlock;
    }

    public long getNumberOfLongestChainSuccessors() {
        if (_btouSuccessorsByHashes.isEmpty()) {
            return 0;
        }

        long latestSuccessorPosition = _btouSuccessorsByHashes
                .values()
                .stream()
                .mapToLong(BlockState::getBlockPosition)
                .max()
                .getAsLong();

        return latestSuccessorPosition - _btoState.getBlockPosition();
    }

    public BlockState getBTO() {
        return _btoState;
    }
}

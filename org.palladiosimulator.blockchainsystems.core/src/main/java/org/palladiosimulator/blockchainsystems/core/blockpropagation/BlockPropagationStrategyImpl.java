package org.palladiosimulator.blockchainsystems.core.blockpropagation;

import java.util.Set;
import java.util.function.Consumer;

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.PropagationStrategy;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Blockchain;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Message;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.NodeP2PNetworkInterface;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint;

public class BlockPropagationStrategyImpl extends BlockchainNodeObject implements PropagationStrategy<Block> {

    private static final int MESSAGE_HEADER_BYTE_SIZE = 24;

    private static final String INV_MESSAGE_KEY = "BlockInvMessage";
    private static final int INV_MESSAGE_BYTE_SIZE = 20;

    private static final String GETDATA_MESSAGE_KEY = "GetDataMessage";
    private static final int GETDATA_MESSAGE_BYTE_SIZE = 20;

    private static final String BLOCK_MESSAGE_KEY = "BlockMessage";


    private NodeP2PNetworkInterface _networkInterface;
    private Blockchain _blockchain;
    private Consumer<Block> _onBlockReceivedCallback;

    @Override
    public void distribute(Block block) {
        if (_networkInterface == null) {
            return;
        }
        _networkInterface.multicast(createInvMessage(block.getHash()));
    }

    @Override
    public void distribute(Block block, Set<P2PNetworkEndpoint> neighborEndpoints) {
        for (P2PNetworkEndpoint neighborEndpoint : neighborEndpoints) {
            _networkInterface.send(createInvMessage(block.getHash()), neighborEndpoint);
        }
    }

    private MessageImpl createInvMessage(String hash) {
        return new MessageImpl(hash, INV_MESSAGE_KEY, MESSAGE_HEADER_BYTE_SIZE + INV_MESSAGE_BYTE_SIZE);
    }

    private MessageImpl createGetDataMessage(String hash) {
        return new MessageImpl(hash, GETDATA_MESSAGE_KEY, MESSAGE_HEADER_BYTE_SIZE + GETDATA_MESSAGE_BYTE_SIZE);
    }

    private MessageImpl createBlockMessage(Block block) {
        return new MessageImpl(block, BLOCK_MESSAGE_KEY, MESSAGE_HEADER_BYTE_SIZE + block.getSize());
    }


    @Override
    public void setNetworkInterface(NodeP2PNetworkInterface networkInterface) {
        if (_networkInterface != null) {
            removeCurrentNetworkInterface();
        }

        setNewNetworkInterface(networkInterface);
    }

    private void removeCurrentNetworkInterface() {
        _networkInterface.setOnReceivedCallback(null);
        _networkInterface = null;
    }

    private void setNewNetworkInterface(NodeP2PNetworkInterface networkInterface) {
        _networkInterface = networkInterface;
        _networkInterface.setOnReceivedCallback(this::onMessageReceivedFromNetworkInterface);
    }

    public void setBlockchain(Blockchain blockchain) {
        if (_blockchain != null) {
            removeCurrentBlockchain();
        }

        setNewBlockchain(blockchain);
    }

    private void removeCurrentBlockchain() {
        _blockchain = null;
    }

    private void setNewBlockchain(Blockchain blockchain) {
        _blockchain = blockchain;
    }

    private void onMessageReceivedFromNetworkInterface(Message message, P2PNetworkEndpoint senderNetworkEndpoint) {
        switch (message.getContentType()) {
            case INV_MESSAGE_KEY:
                handleBlockInvMessageReceived(message, senderNetworkEndpoint);
                break;
            case GETDATA_MESSAGE_KEY:
                handleBlockGetDataMessageReceived(message, senderNetworkEndpoint);
                break;
            case BLOCK_MESSAGE_KEY:
                handleBlockMessageReceived(message, senderNetworkEndpoint);
                break;
            default:
                break;
        }
    }

    private void handleBlockInvMessageReceived(Message message, P2PNetworkEndpoint senderNetworkEndpoint) {
        if (!_blockchain.hasBlockWithHash((String) message.getContent())) {
            _networkInterface.send(createGetDataMessage((String) message.getContent()), senderNetworkEndpoint);
        }
    }

    private void handleBlockGetDataMessageReceived(Message message, P2PNetworkEndpoint senderNetworkEndpoint) {
        Block block = _blockchain.getBlock((String) message.getContent());
        if (block != null) {
            _networkInterface.send(createBlockMessage(block), senderNetworkEndpoint);

            logBlockSent(block, senderNetworkEndpoint);
        }
    }

    private void logBlockSent(Block block, P2PNetworkEndpoint receiverNetworkEndpoint) {
        if (!getTraceEventLogger().isEventTypeEnabled(BlockSentTraceEvent.EVENT_TYPE)) {
            return;
        }

        BlockSentTraceEvent event = new BlockSentTraceEvent(
                getSimulationContext().getSystemClock().getCurrentTime(),
                block,
                receiverNetworkEndpoint);
        getTraceEventLogger().logEvent(event);
    }


    private void handleBlockMessageReceived(Message message, P2PNetworkEndpoint senderNetworkEndpoint) {
        Block block = (Block) message.getContent();

        logBlockReceived(block, senderNetworkEndpoint);

        notifyBlockReceived(block);
    }

    private void logBlockReceived(Block block, P2PNetworkEndpoint senderNetworkEndpoint) {
        if (!getTraceEventLogger().isEventTypeEnabled(BlockReceivedTraceEvent.EVENT_TYPE)) {
            return;
        }

        BlockReceivedTraceEvent event = new BlockReceivedTraceEvent(
                getSimulationContext().getSystemClock().getCurrentTime(),
                block,
                senderNetworkEndpoint);
        getTraceEventLogger().logEvent(event);
    }

    private void notifyBlockReceived(Block block) {
        if (_onBlockReceivedCallback != null) {
            _onBlockReceivedCallback.accept(block);
        }
    }

    @Override
    public void setOnPropagatedObjectReceivedCallback(Consumer<Block> onBlockReceivedCallback) {
        _onBlockReceivedCallback = onBlockReceivedCallback;
    }

    @Override
    public void dispatchEvent(Event event) {
    }
}

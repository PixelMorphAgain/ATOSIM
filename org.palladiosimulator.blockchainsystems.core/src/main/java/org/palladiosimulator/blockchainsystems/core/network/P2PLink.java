package org.palladiosimulator.blockchainsystems.core.network;

import org.palladiosimulator.blockchainsystems.core.common.P2PNetworkObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Message;

public class P2PLink extends P2PNetworkObject {

    private final ValueProvider<Long> _latencyValueProvider;
    private final ValueProvider<Long> _throughputValueProvider;
    private final P2PNode _firstNode;
    private final P2PNode _secondNode;

    public P2PLink(ValueProvider<Long> latencyValueProvider, ValueProvider<Long> throughputValueProvider, P2PNode firstNode,
                   P2PNode secondNode) {
        _latencyValueProvider = latencyValueProvider;
        _throughputValueProvider = throughputValueProvider;
        _firstNode = firstNode;
        _secondNode = secondNode;
    }

    public void send(P2PNode recipientNode, Message messageContent) {
        if (_firstNode != recipientNode && _secondNode != recipientNode) {
            return;
        }

        P2PNode senderNode = _firstNode == recipientNode ? _secondNode : _firstNode;

        MessageSentEvent msEvent = new MessageSentEvent(
                getSimulationContext().getSystemClock().getCurrentTime(),
                new P2PLinkMessageFrame(
                        messageContent,
                        getSimulationContext().getSystemClock().getCurrentTime()),
                this,
                recipientNode,
                senderNode);

        getSimulationContext()
                .getEventCoordinator()
                .raiseEvent(msEvent);
    }


    public static P2PLink create(ValueProvider<Long> latencyValueProvider, ValueProvider<Long> throughputValueProvider,
                                 P2PNode firstNode, P2PNode secondNode) {
        return new P2PLink(
                latencyValueProvider,
                throughputValueProvider,
                firstNode,
                secondNode);
    }

    @Override
    public void dispatchEvent(Event event) {
        switch (event.getEventType()) {
            case "MessageReceivedEvent":
                handleMessageReceivedEvent((MessageReceivedEvent) event);
                break;
            case "MessageSentEvent":
                handleMessageSentEvent((MessageSentEvent) event);
                break;
        }
    }

    private void handleMessageReceivedEvent(MessageReceivedEvent event) {
        event
                .getRecipientNode()
                .onReceive(
                        event.getMessage().getContent(),
                        event.getSenderNode()
                );
    }

    private void handleMessageSentEvent(MessageSentEvent event) {
        long transmissionDuration = _latencyValueProvider.getValue() +
                (long) event.getMessage().getContent().getSize() / _throughputValueProvider.getValue();

        MessageReceivedEvent newMessageReceivedEvent = new MessageReceivedEvent(
                event.getMessage(),
                getSimulationContext()
                        .getSystemClock()
                        .getCurrentTime() + transmissionDuration,
                this,
                event.getRecipientNode(),
                event.getSenderNode());

        getSimulationContext()
                .getEventCoordinator()
                .raiseEvent(newMessageReceivedEvent);
    }
}

package org.palladiosimulator.blockchainsystems.core.network;

import java.util.Set;
import java.util.function.BiConsumer;

import org.palladiosimulator.blockchainsystems.core.common.P2PNetworkObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Message;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.NodeP2PNetworkInterface;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetwork;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.P2PNetworkEndpoint;

public class P2PNode extends P2PNetworkObject implements NodeP2PNetworkInterface, P2PNetworkEndpoint {

	private final String _id;
	private P2PNetwork _network;
	private BiConsumer<Message, P2PNetworkEndpoint> _onMessageReceivedCallback;
	
	public P2PNode(String id) {
		_id = id;
		_onMessageReceivedCallback = null;
	}

	

	void onReceive(Message messageContent, P2PNetworkEndpoint sender) {
		if (_onMessageReceivedCallback == null) {
			return;
		}
		_onMessageReceivedCallback.accept(messageContent, sender);
	}	


	public void initNetwork(P2PNetwork network) {
		_network = network;
	}

	@Override
	public void dispatchEvent(Event event) {
	}

	@Override
	public void multicast(Message content) {
		if (_network == null) {
			throw new IllegalStateException("P2PNode is missing an instance of a p2p network.");
			
		}
		
		_network.multicast(this, content);
	}

	@Override
	public void setOnReceivedCallback(BiConsumer<Message, P2PNetworkEndpoint> onMessageReceivedCallback) {
		_onMessageReceivedCallback = onMessageReceivedCallback;
	}



	@Override
	public String getEndpointId() {
		return _id;
	}



	@Override
	public void send(Message message, P2PNetworkEndpoint recipient) {
		_network.send(this, (P2PNode) recipient, message);
	}

	@Override
	public Set<P2PNetworkEndpoint> getNeighbors() {
		return _network.getNeighbors(this);
	}
}

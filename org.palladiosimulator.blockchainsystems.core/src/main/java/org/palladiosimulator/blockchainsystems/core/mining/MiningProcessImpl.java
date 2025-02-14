package org.palladiosimulator.blockchainsystems.core.mining;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject;
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block;
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess;

public class MiningProcessImpl extends BlockchainNodeObject implements MiningProcess {

	private final PoissonProcess _poissonProcess;
	private BiFunction<Long, String, Block> _onCreatingBlockCallback;
	private Supplier<String> _previousBlockSelectionCallback;
	private Consumer<Block> _onBlockMinedCallback;
	
	private boolean _isMining;
	
	public MiningProcessImpl(double meanBlockTime, RandomGenerator randomGenerator) {
		_poissonProcess = new PoissonProcess(1.0 / meanBlockTime, randomGenerator);
		
		_onCreatingBlockCallback = null;
		_previousBlockSelectionCallback = null;
		_onBlockMinedCallback = null;
		
		_isMining = false;
	}

	
	@Override
	public void dispatchEvent(Event event) {
		if (event.getEventType() == BlockMinedEvent.EVENT_TYPE) {
			if (!_isMining) {
				return;
			}
			
			BlockMinedEvent blockMinedEvent = (BlockMinedEvent) event; 

			Block block = _onCreatingBlockCallback.apply(blockMinedEvent.getOccurenceTime(), blockMinedEvent.getPreviousBlockHash());
			
			if (block != null) {
				logBlockMined(block);
				
				notifyBlockMined(block);
			}
			
			scheduleNewBlockMinedEvent();
		}
	}
	
	
	
	private String scheduleNewBlockMinedEvent() {
		String previousBlockHash = _previousBlockSelectionCallback.get();

		getSimulationContext()
			.getEventCoordinator()
			.raiseEvent(new BlockMinedEvent(
					getNextBlockMinedEventOccurenceTimestamp(),
					previousBlockHash,
					this));
		
		return previousBlockHash;
	}
	
	private long getNextBlockMinedEventOccurenceTimestamp() {
		long eventCurrentTimeOffset = _poissonProcess.nextPointDistance();
		return getSimulationContext().getSystemClock().getCurrentTime() + eventCurrentTimeOffset; 
	}

	private void notifyBlockMined(Block block) {
		if (_onBlockMinedCallback != null) {
			_onBlockMinedCallback.accept(block);
		}
	}

	private void cancelPendingEvent() {
		getSimulationContext()
			.getEventCoordinator()
			.cancelEventsFor(this);
	}
	
	@Override
	public void startMining() {
		if (_isMining) {
			return;
		}
		
		scheduleNewBlockMinedEvent();
		_isMining = true;
		
		logMiningStarted();
	}

	@Override
	public void restartMinig() {
		if (!_isMining) {
			startMining();
			return;
		}
		
		cancelPendingEvent();
		String previousHash = scheduleNewBlockMinedEvent();
		
		if (previousHash != null) {
			logMiningRestarted(previousHash);
		}
	}
	
	@Override
	public void stopMining() {
		if (!_isMining) {
			return;
		}
		
		cancelPendingEvent();
		
		logMiningStopped();
	}
	
	@Override
	public void setOnCreatingBlockCallback(BiFunction<Long, String, Block> onCreatingBlockCallback) {
		_onCreatingBlockCallback = onCreatingBlockCallback;
	}

	@Override
	public void setPreviousBlockSelectionCallback(Supplier<String> previousBlockSelectionCallback) {
		_previousBlockSelectionCallback = previousBlockSelectionCallback;		
	}
	
	@Override
	public void setOnBlockMinedCallback(Consumer<Block> onBlockMinedCallback) {
		_onBlockMinedCallback = onBlockMinedCallback;
	}

	
	private void logMiningStarted() {
		if (!getTraceEventLogger().isEventTypeEnabled(BlockMiningStartedTraceEvent.EVENT_TYPE)) {
			return;
		}
		
		BlockMiningStartedTraceEvent event = new BlockMiningStartedTraceEvent(
				getSimulationContext().getSystemClock().getCurrentTime());
		
		getTraceEventLogger()
			.logEvent(event);
	}
	
	private void logBlockMined(Block block) {
		if (!getTraceEventLogger().isEventTypeEnabled(BlockMinedTraceEvent.EVENT_TYPE)) {
			return;
		}
		
		BlockMinedTraceEvent event = new BlockMinedTraceEvent(
				getSimulationContext().getSystemClock().getCurrentTime(),
				block);
		
		getTraceEventLogger()
			.logEvent(event);
	}

	private void logMiningRestarted(String previousHash) {
		if (!getTraceEventLogger().isEventTypeEnabled(BlockMiningRestartedTraceEvent.EVENT_TYPE)) {
			return;
		}
		
		BlockMiningRestartedTraceEvent event = new BlockMiningRestartedTraceEvent(
				getSimulationContext().getSystemClock().getCurrentTime(),
				previousHash);
		
		getTraceEventLogger()
			.logEvent(event);
	}
	
	private void logMiningStopped() {
		if (!getTraceEventLogger().isEventTypeEnabled(BlockMiningStoppedTraceEvent.EVENT_TYPE)) {
			return;
		}
		
		BlockMiningStoppedTraceEvent event = new BlockMiningStoppedTraceEvent(
				getSimulationContext().getSystemClock().getCurrentTime());
		
		getTraceEventLogger()
			.logEvent(event);
	}


	
}

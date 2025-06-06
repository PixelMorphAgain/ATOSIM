package org.palladiosimulator.blockchainsystems.core.mining

import org.palladiosimulator.blockchainsystems.core.common.BlockchainNodeObject
import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.stochastics.PoissonProcess
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess
import java.util.function.BiFunction
import java.util.function.Consumer
import java.util.function.Supplier
import java.util.random.RandomGenerator

// TODO: Mining process must include transactions to create a block
// TODO: This can be used as a starting point for implementing the transactions submission process
class MiningProcessImpl(meanBlockTime: Double, randomGenerator: RandomGenerator) : BlockchainNodeObject(),
  MiningProcess {
  private val _poissonProcess: PoissonProcess
  private var _onCreatingBlockCallback: BiFunction<Long?, String?, Block?>?
  private var _previousBlockSelectionCallback: Supplier<String?>?
  private var _onBlockMinedCallback: Consumer<Block?>?

  private var _isMining: Boolean

  init {
    _poissonProcess = PoissonProcess(1.0 / meanBlockTime, randomGenerator)

    _onCreatingBlockCallback = null
    _previousBlockSelectionCallback = null
    _onBlockMinedCallback = null

    _isMining = false
  }


  override fun dispatchEvent(event: Event) {
    if (event.getEventType() === BlockMinedEvent.EVENT_TYPE) {
      if (!_isMining) {
        return
      }

      val blockMinedEvent = event as BlockMinedEvent

      val block =
        _onCreatingBlockCallback!!.apply(blockMinedEvent.getOccurrenceTime(), blockMinedEvent.getPreviousBlockHash())

      if (block != null) {
        logBlockMined(block)

        notifyBlockMined(block)
      }

      scheduleNewBlockMinedEvent()
    }
  }


  private fun scheduleNewBlockMinedEvent(): String? {
    val previousBlockHash = _previousBlockSelectionCallback!!.get()

    getSimulationContext()
      .getEventCoordinator()
      .raiseEvent(
        BlockMinedEvent(
          this.nextBlockMinedEventOccurrenceTimestamp,
          previousBlockHash,
          this
        )
      )

    return previousBlockHash
  }

  private val nextBlockMinedEventOccurrenceTimestamp: Long
    get() {
      val eventCurrentTimeOffset = _poissonProcess.nextPointDistance()
      return getSimulationContext().getSystemClock().getCurrentTime() + eventCurrentTimeOffset
    }

  private fun notifyBlockMined(block: Block?) {
    if (_onBlockMinedCallback != null) {
      _onBlockMinedCallback!!.accept(block)
    }
  }

  private fun cancelPendingEvent() {
    getSimulationContext()
      .getEventCoordinator()
      .cancelEventsFor(this)
  }

  override fun startMining() {
    if (_isMining) {
      return
    }

    scheduleNewBlockMinedEvent()
    _isMining = true

    logMiningStarted()
  }

  override fun restartMining() {
    if (!_isMining) {
      startMining()
      return
    }

    cancelPendingEvent()
    val previousHash = scheduleNewBlockMinedEvent()

    if (previousHash != null) {
      logMiningRestarted(previousHash)
    }
  }

  override fun stopMining() {
    if (!_isMining) {
      return
    }
    cancelPendingEvent()
    logMiningStopped()
  }

  override fun setOnCreatingBlockCallback(onCreatingBlockCallback: BiFunction<Long?, String?, Block?>?) {
    _onCreatingBlockCallback = onCreatingBlockCallback
  }

  override fun setPreviousBlockSelectionCallback(previousBlockSelectionCallback: Supplier<String?>?) {
    _previousBlockSelectionCallback = previousBlockSelectionCallback
  }

  override fun setOnBlockMinedCallback(onBlockMinedCallback: Consumer<Block?>?) {
    _onBlockMinedCallback = onBlockMinedCallback
  }


  private fun logMiningStarted() {
    if (!getTraceEventLogger().isEventTypeEnabled(BlockMiningStartedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockMiningStartedTraceEvent(
      getSimulationContext().getSystemClock().getCurrentTime()
    )

    getTraceEventLogger()
      .logEvent(event)
  }

  private fun logBlockMined(block: Block?) {
    if (!getTraceEventLogger().isEventTypeEnabled(BlockMinedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockMinedTraceEvent(
      getSimulationContext().getSystemClock().getCurrentTime(),
      block
    )

    getTraceEventLogger()
      .logEvent(event)
  }

  private fun logMiningRestarted(previousHash: String?) {
    if (!getTraceEventLogger().isEventTypeEnabled(BlockMiningRestartedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockMiningRestartedTraceEvent(
      getSimulationContext().getSystemClock().getCurrentTime(),
      previousHash
    )

    getTraceEventLogger()
      .logEvent(event)
  }

  private fun logMiningStopped() {
    if (!getTraceEventLogger().isEventTypeEnabled(BlockMiningStoppedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockMiningStoppedTraceEvent(
      getSimulationContext().getSystemClock().getCurrentTime()
    )

    getTraceEventLogger()
      .logEvent(event)
  }
}
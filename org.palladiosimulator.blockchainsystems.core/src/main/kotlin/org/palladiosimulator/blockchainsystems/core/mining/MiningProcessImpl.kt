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

/**
 * This class implements the mining process for a blockchain node.
 *
 * @param meanBlockTime the average time between blocks
 * @param randomGenerator the random generator used to generate blocks
 *
 * @author Yannik Sproll, Davis Riedel
 */
class MiningProcessImpl(
  meanBlockTime: Double,
  randomGenerator: RandomGenerator
) : BlockchainNodeObject(),
  MiningProcess {
  private val poissonProcess = PoissonProcess(1.0 / meanBlockTime, randomGenerator)
  private var onCreatingBlockCallback: BiFunction<Long, String, Block>? = null
  private var previousBlockSelectionCallback: Supplier<String>? = null
  private var onBlockMinedCallback: Consumer<Block>? = null

  private var isMining = false

  override fun dispatchEvent(event: Event) {
    if (event.getEventType() === BlockMinedEvent.EVENT_TYPE) {
      if (!isMining) return

      val blockMinedEvent = event as BlockMinedEvent

      val block = onCreatingBlockCallback!!.apply(
        blockMinedEvent.occurrenceTime,
        blockMinedEvent.previousBlockHash
      )

      logBlockMined(block)

      notifyBlockMined(block)

      scheduleNewBlockMinedEvent()
    }
  }


  private fun scheduleNewBlockMinedEvent(): String {
    val previousBlockHash = previousBlockSelectionCallback!!.get()

    simulationContext
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
      val eventCurrentTimeOffset = poissonProcess.nextPointDistance()
      return simulationContext.getSystemClock().getCurrentTime() + eventCurrentTimeOffset
    }

  private fun notifyBlockMined(block: Block) {
    onBlockMinedCallback?.accept(block)
  }

  private fun cancelPendingEvent() {
    simulationContext
      .getEventCoordinator()
      .cancelEventsFor(this)
  }

  override fun startMining() {
    if (isMining) return

    scheduleNewBlockMinedEvent()
    isMining = true

    logMiningStarted()
  }

  override fun restartMining() {
    if (!isMining) {
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
    if (!isMining) return

    cancelPendingEvent()
    logMiningStopped()
  }

  override fun setOnCreatingBlockCallback(onCreatingBlockCallback: BiFunction<Long, String, Block>) {
    this@MiningProcessImpl.onCreatingBlockCallback = onCreatingBlockCallback
  }

  override fun setPreviousBlockSelectionCallback(previousBlockSelectionCallback: Supplier<String>) {
    this@MiningProcessImpl.previousBlockSelectionCallback = previousBlockSelectionCallback
  }

  override fun setOnBlockMinedCallback(onBlockMinedCallback: Consumer<Block>) {
    this@MiningProcessImpl.onBlockMinedCallback = onBlockMinedCallback
  }


  private fun logMiningStarted() {
    if (!traceEventLogger.isEventTypeEnabled(BlockMiningStartedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockMiningStartedTraceEvent(
      simulationContext.getSystemClock().getCurrentTime()
    )

    traceEventLogger
      .logEvent(event)
  }

  private fun logBlockMined(block: Block) {
    if (!traceEventLogger.isEventTypeEnabled(BlockMinedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockMinedTraceEvent(
      simulationContext.getSystemClock().getCurrentTime(),
      block
    )

    traceEventLogger
      .logEvent(event)
  }

  private fun logMiningRestarted(previousHash: String) {
    if (!traceEventLogger.isEventTypeEnabled(BlockMiningRestartedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockMiningRestartedTraceEvent(
      simulationContext.getSystemClock().getCurrentTime(),
      previousHash
    )

    traceEventLogger
      .logEvent(event)
  }

  private fun logMiningStopped() {
    if (!traceEventLogger.isEventTypeEnabled(BlockMiningStoppedTraceEvent.EVENT_TYPE)) {
      return
    }

    val event = BlockMiningStoppedTraceEvent(
      simulationContext.getSystemClock().getCurrentTime()
    )

    traceEventLogger
      .logEvent(event)
  }
}
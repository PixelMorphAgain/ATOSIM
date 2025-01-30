package org.palladiosimulator.blockchainsystems.core.mining.smartcontract

import org.palladiosimulator.blockchainsystems.core.common.abstractions.Event
import org.palladiosimulator.blockchainsystems.core.mining.BlockMinedEvent
import org.palladiosimulator.blockchainsystems.core.mining.SimpleMiningProcess
import org.palladiosimulator.blockchainsystems.core.stochasticprocess.PoissonProcess
import org.palladiosimulator.blockchainsystems.core.system.abstractions.Block
import org.palladiosimulator.blockchainsystems.core.system.abstractions.SCExecutionProcess
import java.util.function.BiFunction
import java.util.function.Consumer
import java.util.function.Supplier
import java.util.random.RandomGenerator


/**
 * Creates a {@code MiningProcess} that executes smart contracts.
 *
 * @author Davis Riedel
 */
class SCMiningProcess(
  val scExecutionProcess: SCExecutionProcess,
  meanBlockTime: Double,
  randomGenerator: RandomGenerator
): SimpleMiningProcess(meanBlockTime, randomGenerator) {
  // TODO: Handle mining with SC execution

  /**
   * Specifies if this node is currently acting as a miner
   */
  private val isMining: Boolean = false;

    public override fun dispatchEvent(event: Event) {
        if (event.getEventType() === BlockMinedEvent.EVENT_TYPE) {
            if (!isMining) return

            val blockMinedEvent = event as BlockMinedEvent

            val block: Block? = _onCreatingBlockCallback?.apply(
                blockMinedEvent.occurrenceTime,
                blockMinedEvent.previousBlockHash
            )

            if (block != null) {
                logBlockMined(block)
                notifyBlockMined(block)
            }

            // TODO: Schedule smart contract execution

            scheduleNewBlockMinedEvent()
        }
    }

}
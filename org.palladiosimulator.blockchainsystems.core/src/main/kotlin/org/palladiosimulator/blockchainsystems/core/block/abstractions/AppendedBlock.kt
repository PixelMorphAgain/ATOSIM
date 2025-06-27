package org.palladiosimulator.blockchainsystems.core.block.abstractions

interface AppendedBlock : Block {
  val appendedTimestamp: Long
}
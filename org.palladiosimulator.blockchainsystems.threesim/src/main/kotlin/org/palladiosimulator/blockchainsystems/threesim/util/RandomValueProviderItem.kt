package org.palladiosimulator.blockchainsystems.threesim.util

@JvmRecord
data class RandomValueProviderItem<T>(
  val selectionValueBorder: Double,
  val value: T
)
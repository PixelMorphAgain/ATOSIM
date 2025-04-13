package org.palladiosimulator.blockchainsystems.trilemma.util

@JvmRecord
data class RandomValueProviderItem<T>(
  val selectionValueBorder: Double,
  val value: T
)
package org.palladiosimulator.blockchainsystems.core.network

/**
 * Represents the latency of a link in a blockchain network.
 *
 * @property latency The latency of the link in milliseconds.
 * @property duration The duration for which this latency is applicable, in milliseconds.
 *
 * @author Davis Riedel
 */
data class LinkLatency(
    val latency: Long,
    val duration: Long
)
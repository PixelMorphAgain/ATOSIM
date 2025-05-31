package org.palladiosimulator.blockchainsystems.core.network

/**
 * Represents the throughput of a link in a blockchain network.
 *
 * @property throughput The throughput of the link in bytes per second.
 * @property duration The duration for which this throughput is applicable, in milliseconds.
 *
 * @author Davis Riedel
 */
data class LinkThroughput(
    val throughput: Int,
    val duration: Long
)
package org.palladiosimulator.blockchainsystems.threesim.config

object ThreesimAttributes {
  const val THROUGHPUT_MONITORING_INTERVAL: String = "ThroughputMonitoringInterval"
  const val THROUGHPUT_MONITORING_INTERVAL_DEFAULT: String = "1000"

  // in milliseconds, equals 1 sec TODO: find suitable default value
  const val FAILURE_THROUGHPUT_THRESHOLD: String = "FailureThroughputThreshold"
  const val FAILURE_THROUGHPUT_THRESHOLD_DEFAULT: String = "1"

  // in trx per sec TODO: find suitable default value
  const val SHANNON_ENTROPY_K: String = "ShannonEntropyK"
  const val SHANNON_ENTROPY_K_DEFAULT: String = "1.0"

  const val NAKAMOTO_COEFFICIENT_THRESHOLD: String = "NakamotoCoefficientThreshold"
  const val NAKAMOTO_COEFFICIENT_THRESHOLD_DEFAULT: String = "50.0" // in percent

  const val RELIABILITY_OBSERVATION_TIMESPAN: String = "ReliabilityObservationTimespan"
  const val RELIABILITY_OBSERVATION_TIMESPAN_DEFAULT: String =
    "60000" // in milliseconds, equals 60 sec TODO: find suitable default value
}
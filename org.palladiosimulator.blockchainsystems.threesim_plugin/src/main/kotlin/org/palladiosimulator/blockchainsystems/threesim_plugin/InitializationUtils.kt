package org.palladiosimulator.blockchainsystems.threesim_plugin

import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.NetworkTopology
import org.palladiosimulator.blockchainsystems.plugin.config.Attributes
import org.palladiosimulator.blockchainsystems.plugin.config.SimulationType
import org.palladiosimulator.blockchainsystems.plugin.logging.LogOutputProviderImpl
import org.palladiosimulator.blockchainsystems.threesim.creation.network.connectedsubgraphs.ConnectedSubgraphNetworkBlockchainSystemFactory
import org.palladiosimulator.blockchainsystems.threesim.creation.network.explicit.ExplicitNetworkBlockchainSystemFactory
import org.palladiosimulator.blockchainsystems.threesim.serialization.ThreesimSerializers
import org.palladiosimulator.blockchainsystems.threesim.config.ThreesimAttributes
import org.palladiosimulator.blockchainsystems.threesim.creation.ThreesimBlockchainSystemFactory

/**
 * Utility class for initialization tasks.
 * Provides methods to retrieve configuration attributes and create necessary objects.
 *
 * @author Yannik Sproll, Davis Riedel
 */
object InitializationUtils {
  @Throws(CoreException::class)
  fun getSelectedSimulationTypeFromConfig(
    configuration: ILaunchConfiguration
  ): SimulationType {
    return enumValueOf<SimulationType>(
      configuration.getAttribute(
        Attributes.SimulationType.SIMULATION_TYPE_ATTRIBUTE,
        Attributes.SimulationType.SIMULATION_TYPE_ATTRIBUTE_DEFAULT
      )
    )
  }

  @Throws(NumberFormatException::class, CoreException::class)
  fun getMaximumAllowedBlockchainLengthFromConfig(configuration: ILaunchConfiguration): Long {
    return configuration.getAttribute(
      Attributes.SimulationTermination.MAX_BLOCKCHAIN_LENGTH_ATTRIBUTE,
      Attributes.SimulationTermination.MAX_BLOCKCHAIN_LENGTH_ATTRIBUTE_DEFAULT
    ).toLong()
  }

  @Throws(NumberFormatException::class, CoreException::class)
  fun getNumberOfMonteCarloSimulationRoundsFromConfig(configuration: ILaunchConfiguration): Int {
    return configuration.getAttribute(
      Attributes.SimulationType.NUMBER_OF_MONTE_CARLO_SIMULATION_ROUNDS,
      Attributes.SimulationType.NUMBER_OF_MONTE_CARLO_SIMULATION_ROUNDS_DEFAULT
    ).toInt()
  }


  // BlockchainSystemFactory Utils
  private fun createBlockchainSystemFactoryForExplicitNetworkTopology(
    designBlockchainSystem: BlockchainSystem,
    explicitTopology: ExplicitNetworkTopology
  ): ThreesimBlockchainSystemFactory {
    return ExplicitNetworkBlockchainSystemFactory(
      designBlockchainSystem,
      explicitTopology
    )
  }

  private fun createBlockchainSystemFactoryForConnectedSubgraphsTopology(
    designBlockchainSystem: BlockchainSystem,
    connectedSubgraphsTopology: ConnectedSubgraphsNetworkTopology
  ): ThreesimBlockchainSystemFactory {
    return ConnectedSubgraphNetworkBlockchainSystemFactory(
      designBlockchainSystem,
      connectedSubgraphsTopology
    )
  }

  @Throws(NumberFormatException::class, CoreException::class)
  fun createBlockchainSystemFactory(configuration: ILaunchConfiguration): ThreesimBlockchainSystemFactory {
    val designModelLoader = BlockchainSystemModelLoader()

    val designBlockchainSystem = designModelLoader.load(
      configuration.getAttribute(
        Attributes.ArchitecturalModels.BLOCKCHAIN_SYSTEM_MODEL_FILE_PATH_ATTRIBUTE,
        Attributes.ArchitecturalModels.BLOCKCHAIN_SYSTEM_MODEL_FILE_PATH_ATTRIBUTE_DEFAULT
      )
    )

    val networkTopology = getNetworkTopologyFromBlockchainSystem(designBlockchainSystem)

    if (networkTopology is ExplicitNetworkTopology) {
      return createBlockchainSystemFactoryForExplicitNetworkTopology(
        designBlockchainSystem,
        networkTopology
      )
    } else if (networkTopology is ConnectedSubgraphsNetworkTopology) {
      return createBlockchainSystemFactoryForConnectedSubgraphsTopology(
        designBlockchainSystem,
        networkTopology
      )
    }

    throw IllegalArgumentException("The network topology type of the specified blockchain system is unknown")
  }

  private fun getNetworkTopologyFromBlockchainSystem(designBlockchainSystem: BlockchainSystem): NetworkTopology {
    return designBlockchainSystem
      .network
      .topology
  }


  // LogOutputProvider Utils
  @Throws(NumberFormatException::class, CoreException::class)
  fun createLogOutputProviderFromConfig(configuration: ILaunchConfiguration): LogOutputProviderImpl {
    return LogOutputProviderImpl(
      ThreesimSerializers.json,

      configuration.getAttribute(
        Attributes.Logging.IS_CONSOLE_LOGGING_ENABLED_ATTRIBUTE,
        Attributes.Logging.IS_CONSOLE_LOGGING_ENABLED_ATTRIBUTE_DEFAULT
      ),
      configuration.getAttribute(
        Attributes.Logging.IS_FILE_LOGGING_ENABLED_ATTRIBUTE,
        Attributes.Logging.IS_FILE_LOGGING_ENABLED_ATTRIBUTE_DEFAULT
      ),
      configuration.getAttribute(
        Attributes.Logging.LOG_FILE_PATH_ATTRIBUTE,
        Attributes.Logging.LOG_FILE_PATH_ATTRIBUTE_DEFAULT
      ),
      configuration.getAttribute(
        Attributes.Logging.IS_DATABASE_LOGGING_ENABLED_ATTRIBUTE,
        Attributes.Logging.IS_DATABASE_LOGGING_ENABLED_ATTRIBUTE_DEFAULT
      ),
      configuration.getAttribute(
        Attributes.Logging.DATABASE_SERVER_ATTRIBUTE,
        Attributes.Logging.DATABASE_SERVER_ATTRIBUTE_DEFAULT
      ),
      configuration.getAttribute(
        Attributes.Logging.DATABASE_PORT_ATTRIBUTE,
        Attributes.Logging.DATABASE_PORT_ATTRIBUTE_DEFAULT
      ),
      configuration.getAttribute(
        Attributes.Logging.DATABASE_NAME_ATTRIBUTE,
        Attributes.Logging.DATABASE_NAME_ATTRIBUTE_DEFAULT
      ),
      configuration.getAttribute(
        Attributes.Logging.DATABASE_USERNAME_ATTRIBUTE,
        Attributes.Logging.DATABASE_USERNAME_ATTRIBUTE_DEFAULT
      ),
      configuration.getAttribute(
        Attributes.Logging.DATABASE_PASSWORD_ATTRIBUTE,
        Attributes.Logging.DATABASE_PASSWORD_ATTRIBUTE_DEFAULT
      )
    )
  }


  // Threesim Simulation Parameters

  fun getThroughputMonitoringIntervalFromConfig(configuration: ILaunchConfiguration): Long {
    return configuration.getAttribute(
      ThreesimAttributes.THROUGHPUT_MONITORING_INTERVAL,
      ThreesimAttributes.THROUGHPUT_MONITORING_INTERVAL_DEFAULT
    ).toLong() // ms
  }

  fun getFailureThroughputThresholdFromConfig(configuration: ILaunchConfiguration): Double {
    return configuration.getAttribute(
      ThreesimAttributes.FAILURE_THROUGHPUT_THRESHOLD,
      ThreesimAttributes.FAILURE_THROUGHPUT_THRESHOLD_DEFAULT
    ).toDouble() // trx / s
  }

  fun getShannonEntropyKFromConfig(configuration: ILaunchConfiguration): Double {
    return configuration.getAttribute(
      ThreesimAttributes.SHANNON_ENTROPY_K,
      ThreesimAttributes.SHANNON_ENTROPY_K_DEFAULT
    ).toDouble() // 0.0..1.0
  }

  fun getNakamotoCoefficientThresholdFromConfig(configuration: ILaunchConfiguration): Double {
    return configuration.getAttribute(
      ThreesimAttributes.NAKAMOTO_COEFFICIENT_THRESHOLD,
      ThreesimAttributes.NAKAMOTO_COEFFICIENT_THRESHOLD_DEFAULT
    ).toDouble() // 0.0 .. 100.0 %
  }

  fun getReliabilityObservationTimespanFromConfig(configuration: ILaunchConfiguration): Long {
    return configuration.getAttribute(
      ThreesimAttributes.RELIABILITY_OBSERVATION_TIMESPAN,
      ThreesimAttributes.RELIABILITY_OBSERVATION_TIMESPAN_DEFAULT
    ).toLong() // ms
  }
}
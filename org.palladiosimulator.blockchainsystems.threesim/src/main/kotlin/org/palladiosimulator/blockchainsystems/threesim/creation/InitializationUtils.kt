package org.palladiosimulator.blockchainsystems.threesim.creation

import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.ILaunchConfiguration
import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.NetworkTopology
import org.palladiosimulator.blockchainsystems.core.system.abstractions.BlockchainSystemFactory
import org.palladiosimulator.blockchainsystems.plugin.common.Attributes
import org.palladiosimulator.blockchainsystems.plugin.common.SimulationType
import org.palladiosimulator.blockchainsystems.plugin.logging.LogOutputProviderImpl
import org.palladiosimulator.blockchainsystems.threesim.creation.connectedsubgraphnetwork.ConnectedSubgraphNetworkBlockchainSystemFactory
import org.palladiosimulator.blockchainsystems.threesim.creation.explicitnetwork.ExplicitNetworkBlockchainSystemFactory

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
  ): BlockchainSystemFactory {
    return ExplicitNetworkBlockchainSystemFactory(
      designBlockchainSystem,
      explicitTopology
    )
  }

  private fun createBlockchainSystemFactoryForConnectedSubgraphsTopology(
    designBlockchainSystem: BlockchainSystem,
    connectedSubgraphsTopology: ConnectedSubgraphsNetworkTopology
  ): BlockchainSystemFactory {
    return ConnectedSubgraphNetworkBlockchainSystemFactory(
      designBlockchainSystem,
      connectedSubgraphsTopology
    )
  }

  @Throws(NumberFormatException::class, CoreException::class)
  fun createBlockchainSystemFactory(configuration: ILaunchConfiguration): BlockchainSystemFactory {
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
      .first() // Gets the desired topology, because constraint limits number of topologies to 1.
  }


  // LogOutputProvider Utils
  @Throws(NumberFormatException::class, CoreException::class)
  fun createLogOutputProviderFromConfig(configuration: ILaunchConfiguration): LogOutputProviderImpl {
    return LogOutputProviderImpl(
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
      ).toInt(),
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

  fun getNumberOfRequiredSecurityConfirmationsFromConfig(configuration: ILaunchConfiguration): Int {
    return configuration.getAttribute(
      Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS,
      Attributes.Threesim.NUMBER_OF_REQUIRED_SECURITY_CONFIRMATIONS_DEFAULT
    ).toInt()
  }

  fun getShannonEntropyKFromConfig(configuration: ILaunchConfiguration): Double {
    return configuration.getAttribute(
      Attributes.Threesim.SHANNON_ENTROPY_K,
      Attributes.Threesim.SHANNON_ENTROPY_K_DEFAULT
    ).toDouble()
  }

  fun getNakamotoCoefficientThresholdFromConfig(configuration: ILaunchConfiguration): Double {
    return configuration.getAttribute(
      Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD,
      Attributes.Threesim.NAKAMOTO_COEFFICIENT_THRESHOLD_DEFAULT
    ).toDouble()
  }

  fun getReliabilityObservationTimespanFromConfig(configuration: ILaunchConfiguration): Long {
    return configuration.getAttribute(
      Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN,
      Attributes.Threesim.RELIABILITY_OBSERVATION_TIMESPAN_DEFAULT
    ).toLong()
  }
}
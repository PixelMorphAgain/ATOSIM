package org.palladiosimulator.blockchainsystems.plugin.jobs.common;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystem;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ConnectedSubgraphsNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.ExplicitNetworkTopology;
import org.palladiosimulator.blockchainsystems.bscm.p2pnetwork.NetworkTopology;
import org.palladiosimulator.blockchainsystems.core.system.BlockchainSystemFactory;
import org.palladiosimulator.blockchainsystems.plugin.common.Attributes;
import org.palladiosimulator.blockchainsystems.plugin.creation.connectedsubgraphnetwork.ConnectedSubgraphNetworkBlockchainSystemFactory;
import org.palladiosimulator.blockchainsystems.plugin.creation.explicitnetwork.ExplicitNetworkBlockchainSystemFactory;
import org.palladiosimulator.blockchainsystems.plugin.logging.LogOutputProviderImpl;

public final class InitializationUtils {

	private InitializationUtils() {
	}
	
	public static long getMaximumAllowdBlockchainLengthFromConfig(ILaunchConfiguration configuration) throws NumberFormatException, CoreException {
		return Long.parseLong(
				configuration.getAttribute(
						Attributes.SimulationTermination.MAX_BLOCKCHAIN_LENGTH_ATTRIBUTE,
						Attributes.SimulationTermination.MAX_BLOCKCHAIN_LENGTH_ATTRIBUTE_DEFAULT));
	}
	
	public static int getNumberOfMonteCarloSimulationRoundsFromConfig(ILaunchConfiguration configuration) throws NumberFormatException, CoreException {
		return Integer.parseInt(
				configuration.getAttribute(
						Attributes.SimulationType.NUMBER_OF_MONTE_CARLO_SIMULATION_ROUNDS,
						Attributes.SimulationType.NUMBER_OF_MONTE_CARLO_SIMULATION_ROUNDS_DEFAULT));
	}
	
	
	// BlockchainSystemFactory Utils
	private static BlockchainSystemFactory createBlockchainSystemFactoryForExplicitNetworkTopology(
			BlockchainSystem designBlockchainSystem,
			ExplicitNetworkTopology explicitTopology) {
		return new ExplicitNetworkBlockchainSystemFactory(
				designBlockchainSystem, 
				explicitTopology);
	}
	
	private static BlockchainSystemFactory createBlockchainSystemFactoryForConnectedSubgraphsTopology(
			BlockchainSystem designBlockchainSystem,
			ConnectedSubgraphsNetworkTopology connectedSubgraphsTopology) {
		
		return new ConnectedSubgraphNetworkBlockchainSystemFactory(
				designBlockchainSystem, 
				connectedSubgraphsTopology);
		
	}

	public static BlockchainSystemFactory createBlockchainSystemFactory(ILaunchConfiguration configuration) throws NumberFormatException, CoreException {
		BlockchainSystemModelLoader designModelLoader = new BlockchainSystemModelLoader();
		
		BlockchainSystem designBlockchainSystem = designModelLoader.load(
				configuration.getAttribute(
						Attributes.ArchitecturalModels.BLOCKCHAIN_SYSTEM_MODEL_FILE_PATH_ATTRIBUTE,
						Attributes.ArchitecturalModels.BLOCKCHAIN_SYSTEM_MODEL_FILE_PATH_ATTRIBUTE_DEFAULT));
		
		NetworkTopology networkTopology = getNetworkTopologyFromBlockchainSystem(designBlockchainSystem);
		
		if (networkTopology instanceof ExplicitNetworkTopology explicitTopology) {
			return createBlockchainSystemFactoryForExplicitNetworkTopology(
					designBlockchainSystem,
					explicitTopology);
			
		} else if (networkTopology instanceof ConnectedSubgraphsNetworkTopology connectedSubgraphsTopology) {
			return createBlockchainSystemFactoryForConnectedSubgraphsTopology(
					designBlockchainSystem,
					connectedSubgraphsTopology);
		}
		
		throw new IllegalArgumentException("The network topology type of the specified blockchain system is unknown");
	}
	
	private static NetworkTopology getNetworkTopologyFromBlockchainSystem(BlockchainSystem designBlockchainSystem) {
		return designBlockchainSystem
				.getNetwork()
				.getTopology()
				.stream()
				.findFirst()
				.get(); // Gets the desired topology, because constraint limits number of topologies to 1.
	}
	
	
	// LogOutputProvider Utils
	public static LogOutputProviderImpl createLogOuputProviderFromConfig(ILaunchConfiguration configuration) throws NumberFormatException, CoreException {
		return new LogOutputProviderImpl(
				configuration.getAttribute(
						Attributes.Logging.IS_CONSOLE_LOGGING_ENABLED_ATTRIBUTE,
						Attributes.Logging.IS_CONSOLE_LOGGING_ENABLED_ATTRIBUTE_DEFAULT),
				configuration.getAttribute(
						Attributes.Logging.IS_FILE_LOGGING_ENABLED_ATTRIBUTE,
						Attributes.Logging.IS_FILE_LOGGING_ENABLED_ATTRIBUTE_DEFAULT),
				configuration.getAttribute(
						Attributes.Logging.LOG_FILE_PATH_ATTRIBUTE,
						Attributes.Logging.LOG_FILE_PATH_ATTRIBUTE_DEFAULT),
				configuration.getAttribute(
						Attributes.Logging.IS_DATABASE_LOGGING_ENABLED_ATTRIBUTE,
						Attributes.Logging.IS_DATABASE_LOGGING_ENABLED_ATTRIBUTE_DEFAULT),
				configuration.getAttribute(
						Attributes.Logging.DATABASE_SERVER_ATTRIBUTE,
						Attributes.Logging.DATABASE_SERVER_ATTRIBUTE_DEFAULT),
				Integer.parseInt(
						configuration.getAttribute(
								Attributes.Logging.DATABASE_PORT_ATTRIBUTE,
								Attributes.Logging.DATABASE_PORT_ATTRIBUTE_DEFAULT)),
				configuration.getAttribute(
						Attributes.Logging.DATABASE_NAME_ATTRIBUTE,
						Attributes.Logging.DATABASE_NAME_ATTRIBUTE_DEFAULT),
				configuration.getAttribute(
						Attributes.Logging.DATABASE_USERNAME_ATTRIBUTE,
						Attributes.Logging.DATABASE_USERNAME_ATTRIBUTE_DEFAULT),
				configuration.getAttribute(
						Attributes.Logging.DATABASE_PASSWORD_ATTRIBUTE,
						Attributes.Logging.DATABASE_PASSWORD_ATTRIBUTE_DEFAULT));
	}
}

module org.palladiosimulator.blockchainsystems.doublespending {
	exports org.palladiosimulator.blockchainsystems.doublespending.simulation;
	exports org.palladiosimulator.blockchainsystems.doublespending.behavior;
	exports org.palladiosimulator.blockchainsystems.doublespending.simulation.logoutputs;
	exports org.palladiosimulator.blockchainsystems.doublespending.simulation.termination;
	exports org.palladiosimulator.blockchainsystems.doublespending.monitoring;
	exports org.palladiosimulator.blockchainsystems.doublespending.util;

	requires transitive org.palladiosimulator.blockchainsystems.core;
	requires transitive org.palladiosimulator.blockchainsystems.loggers;
}
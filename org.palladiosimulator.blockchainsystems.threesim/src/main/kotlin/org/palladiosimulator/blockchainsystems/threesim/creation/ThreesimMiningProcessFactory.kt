package org.palladiosimulator.blockchainsystems.threesim.creation

import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess
import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcessFactory

// TODO: Implement mining process creation logic for 3SIM

class ThreesimMiningProcessFactory : MiningProcessFactory {
  override fun createMiningProcess(nodeId: String): MiningProcess {
    TODO("Not yet implemented")
  }
}

// TODO: SM-SIM below
//package org.palladiosimulator.blockchainsystems.threesim_plugin.creation;
//
//import java.util.random.RandomGenerator;
//
//import org.palladiosimulator.blockchainsystems.bscm.blockchainsystemComponentRepository.MiningProcessComponent;
//import org.palladiosimulator.blockchainsystems.bscm.blockchainsystem.BlockchainSystemSpecification;
//import org.palladiosimulator.blockchainsystems.core.mining.MiningProcessImpl;
//import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcess;
//import org.palladiosimulator.blockchainsystems.core.system.abstractions.MiningProcessFactory;
//
///**
// * Factory implementation for creating a mining process.
// *
// * @author Yannik Sproll
// */
//public class MiningProcessFactoryPluginImpl implements MiningProcessFactory {
//
//  private final BlockchainSystemSpecification _systemSpecification;
//  private final GlobalResourcePowerCalculator _globalResourcePowerCalculator;
//  private final NodeAllocationResolver _nodeAllocationResolver;
//
//  public MiningProcessFactoryPluginImpl(
//    NodeAllocationResolver nodeAllocationResolver,
//  GlobalResourcePowerCalculator globalResourcePowerCalculator,
//  BlockchainSystemSpecification systemSpecification
//  ) {
//    _nodeAllocationResolver = nodeAllocationResolver;
//    _globalResourcePowerCalculator = globalResourcePowerCalculator;
//    _systemSpecification = systemSpecification;
//  }
//
//
//  @Override
//  public MiningProcess createMiningProcess(String nodeId) {
//    double nodeResourcePower = _nodeAllocationResolver
//      .getNodeAllocation(nodeId)
//      .getAllocationContexts()
//      .stream()
//      .filter(x -> x.getAssemblyContext().getEncapsulatedComponent() instanceof MiningProcessComponent)
//    .mapToDouble(x -> x.getResourceContainer().getResourcePower())
//    .sum();
//
//    double nodeResourcePowerShare = nodeResourcePower / _globalResourcePowerCalculator.calculateGlobalResourcePower();
//
//    double _globalAverageBlockArrivalTime = _systemSpecification.getMeanBlockTime();
//    double _nodeAverageBlockArrivalTime = _globalAverageBlockArrivalTime / nodeResourcePowerShare;
//
//    return new MiningProcessImpl(_nodeAverageBlockArrivalTime, RandomGenerator.of("Random"));
//  }
//
//}

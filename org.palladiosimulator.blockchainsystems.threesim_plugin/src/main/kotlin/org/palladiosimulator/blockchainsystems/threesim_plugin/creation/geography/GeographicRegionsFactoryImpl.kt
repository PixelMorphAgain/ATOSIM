package org.palladiosimulator.blockchainsystems.threesim_plugin.creation.geography;

import org.palladiosimulator.blockchainsystems.bscm.geography.GeographicalRegionsSpecification
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegion
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegions
import org.palladiosimulator.blockchainsystems.core.system.abstractions.GeographicalRegionsFactory

/**
 * Implementation of [GeographicalRegionsFactory] that creates geographical regions based on the metamodel.
 *
 * @param geographicalRegionsSpecification specification of all regions from the metamodel
 *
 * @author Davis Riedel
 */
class GeographicRegionsFactoryImpl(
  private val geographicalRegionsSpecification: GeographicalRegionsSpecification
) : GeographicalRegionsFactory {
  override fun createGeographicalRegions(): GeographicalRegions {
    val regions = geographicalRegionsSpecification.getRegions()
      .map { region -> GeographicalRegion(region.regionName) }
      .toSet();
    return GeographicalRegions(regions);
  }
}
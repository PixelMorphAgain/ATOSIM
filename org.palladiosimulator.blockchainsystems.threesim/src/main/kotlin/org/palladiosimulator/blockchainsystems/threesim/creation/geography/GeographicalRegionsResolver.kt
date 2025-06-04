package org.palladiosimulator.blockchainsystems.threesim.creation.geography

import org.palladiosimulator.blockchainsystems.bscm.geography.GeographicalRegionsSpecification
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegion
import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegions
import org.palladiosimulator.blockchainsystems.threesim.creation.abstractions.NodeAllocationResolver

/**
 * Resolves geographical regions based on the provided geographical regions specification and node allocation resolver.
 *
 * @property geoRegionsSpec The geographical regions specification containing the region definitions.
 * @property nodeAllocationResolver The resolver to determine node allocations and their corresponding geographical regions.
 *
 * @author Davis Riedel
 */
class GeographicalRegionsResolver(
  private val geoRegionsSpec: GeographicalRegionsSpecification,
  private val nodeAllocationResolver: NodeAllocationResolver
) {
  private val geoRegions = GeographicalRegions(
    geoRegionsSpec.getRegions()
      .map { region -> GeographicalRegion(region.regionName) }
      .toSet()
  )

  fun resolveGeographicalRegions(): GeographicalRegions {
    // NOTE: This is cached in the constructor to avoid repeated computation.
    return geoRegions
  }

  fun getGeographicalRegionForNode(nodeId: String): GeographicalRegion {
    val regionName = nodeAllocationResolver
      .getNodeAllocation(nodeId)
      .nodeGeographicalEnvironment
      .nodeGeographicalRegionSpecification
      .region
      .regionName

    requireNotNull(geoRegions.getRegionByName(regionName)) {
      "Geographical region with name '$regionName' not found in the geographical regions specification."
    }

    return GeographicalRegion(regionName)
  }
}

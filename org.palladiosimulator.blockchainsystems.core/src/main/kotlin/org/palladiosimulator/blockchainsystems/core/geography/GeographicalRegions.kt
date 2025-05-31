package org.palladiosimulator.blockchainsystems.core.geography

/**
 * Stores all geographical regions of a blockchain system.
 *
 * @property regions the set of geographical regions available
 *
 * @author Davis Riedel
 */
data class GeographicalRegions(
  // NOTE: Since [GeographicalRegion] is a data class, the `Set` can only contain unique regions (with unique names).
  val regions: Set<GeographicalRegion>
)
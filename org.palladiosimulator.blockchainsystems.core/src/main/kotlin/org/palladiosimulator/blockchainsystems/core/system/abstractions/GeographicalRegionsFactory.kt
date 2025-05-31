package org.palladiosimulator.blockchainsystems.core.system.abstractions

import org.palladiosimulator.blockchainsystems.core.geography.GeographicalRegions

/**
 * Interface for a factory that produces instances of `GeographicalRegions`.
 *
 * @author Davis Riedel
 */
interface GeographicalRegionsFactory {
  /**
   * Creates an instance of @code{GeographicalRegions}
   *
   * @return the created `GeographicalRegions` instance, or `null` if the creation failed
   */
  fun createGeographicalRegions(): GeographicalRegions
}
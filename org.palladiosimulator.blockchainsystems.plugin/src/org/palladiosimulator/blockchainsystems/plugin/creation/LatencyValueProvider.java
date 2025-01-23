package org.palladiosimulator.blockchainsystems.plugin.creation;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider;

public class LatencyValueProvider implements ValueProvider<Long> {

	private final long _latencyValue;
	
	public LatencyValueProvider(long latencyValue) {
		_latencyValue = latencyValue;
	}
	
	@Override
	public Long getValue() {
		return (long) _latencyValue;
	}
	
}
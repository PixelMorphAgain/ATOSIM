package org.palladiosimulator.blockchainsystems.plugin.creation;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider;

public class ThroughputValueProvider implements ValueProvider<Long> {
	private final long _throughPut;
	
	public ThroughputValueProvider(long throughPut) {
		_throughPut = throughPut;
	}
	
	@Override
	public Long getValue() {
		return (long) _throughPut;
	}
}

package org.palladiosimulator.blockchainsystems.core.blocks;

import org.palladiosimulator.blockchainsystems.core.common.abstractions.ValueProvider;

public class BlockSizeValueProvider implements ValueProvider<Integer> {

	private int _value;
	
	public BlockSizeValueProvider(int value) {
		_value = value;
	}
	
	@Override
	public Integer getValue() {
		return _value;
	}

}

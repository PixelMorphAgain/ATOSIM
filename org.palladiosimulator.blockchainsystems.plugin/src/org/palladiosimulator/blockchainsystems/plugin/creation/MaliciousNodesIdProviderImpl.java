package org.palladiosimulator.blockchainsystems.plugin.creation;

import java.util.Set;

import org.palladiosimulator.blockchainsystems.doublespending.behavior.MaliciousNodesIdProvider;


public class MaliciousNodesIdProviderImpl implements MaliciousNodesIdProvider {

	private Set<String> _maliciousNodeIds;
	
	public MaliciousNodesIdProviderImpl(Set<String> maliciousNodeIds) {
		_maliciousNodeIds = maliciousNodeIds;
	}
	
	public Set<String> getMaliciousNodeIds() {
		return _maliciousNodeIds;
	}
}

package org.palladiosimulator.blockchainsystems.plugin.validation;

public final class ValidationUtils {
	
	public static final long MINIMUM_PORT = 1;
	public static final long MAXIMUM_PORT = 65_536;

	public static boolean isInRange(long value, long lowerBoundInclusive, long upperBoundInclusive) {
		return lowerBoundInclusive <= value && value <= upperBoundInclusive;
	}
	
	public static boolean isNumber(String text) {
		return text.matches("\\d*");
	}
	
	public static boolean isStringNullOrEmpty(String text) {
		return text == null || text == "";
	}
	
	public static boolean isPort(String text) {
		return !isStringNullOrEmpty(text)
				&& isNumber(text)
				&& isInRange(Long.parseLong(text), MINIMUM_PORT, MAXIMUM_PORT);
	}
}

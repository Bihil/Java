
public interface Add {
	public static boolean containsOnlyDigits(final String value) {
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	default void validate(String variable) {
		if(variable== null) {
			throw new NullPointerException();
		}
		if(variable.length() == 0) {
			throw new IllegalArgumentException("[ " + variable + " ] is not a positive integer.");
		}
		if(!containsOnlyDigits(variable)) {
			throw new IllegalArgumentException("[ " + variable + " ] is not a positive integer.");
		}
	}
	public int sum();
	
}

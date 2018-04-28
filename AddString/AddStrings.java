import java.util.regex.Pattern;
public class AddStrings {
	private static Pattern onlyDigits = Pattern.compile("\\A[0-9]*\\z");

	
	private void validate(String variable) {
		if(variable== null) {
			throw new NullPointerException();
		}
		if(variable.length() == 0) {
			throw new IllegalArgumentException("[ " + variable + " ] is not a positive integer.");
		}
		if(!onlyDigits.matcher(variable).matches()) {
			throw new IllegalArgumentException("[ " + variable + " ] is not a positive integer.");
		}
	}


	public int sum(String argument1, String argument2) {		
		validate(argument1);
		validate(argument2);		
		return Integer.parseInt(argument1) + Integer.parseInt(argument2);
	}

}

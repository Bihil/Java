
public class AddStrings implements AddString {

	public boolean containsOnlyDigits(final String value) {
	    for (int i = 0; i < value.length(); i++) {
	        if(!Character.isDigit(value.charAt(i))) {
	            return false;
	        }
	    }
	    return true;
	}  
	public void validate(String variable) {
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



	public int sum(String argument1, String argument2) {		
		validate(argument1);
		validate(argument2);		
		return Integer.parseInt(argument1) + Integer.parseInt(argument2);
	}

}

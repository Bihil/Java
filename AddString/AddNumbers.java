
public class AddNumbers implements Add {
	private int var1, var2;
	public AddNumbers(int variable1, int variable2) {
		this.var1 = variable1;
		this.var2 = variable2;
	}	

	@Override
	public int sum(){		
		return this.var1 +this.var2;
	}

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


}
